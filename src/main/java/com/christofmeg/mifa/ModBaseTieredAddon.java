package com.christofmeg.mifa;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.ndrei.teslacorelib.items.BaseAddon;
import net.ndrei.teslacorelib.tileentities.SidedTileEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

public class ModBaseTieredAddon extends BaseAddon {

    protected boolean hasSameFunction(@Nullable ModBaseTieredAddon other) {
        if (other == null) {
            return false;
        }

        // Same class hierarchy OR same function string
        return this.getClass().isAssignableFrom(other.getClass())
                || this.getAddonFunction().equals(other.getAddonFunction());
    }

    @NotNull
    protected String getAddonFunction() {
        ResourceLocation registryName = this.getRegistryName();
        if (registryName == null) {
            throw new IllegalStateException("Addon registry name is null");
        }
        return registryName.toString();
    }

    /**
     * Override in subclasses
     */
    public int getTier() {
        return 1;
    }

    public final boolean isTierValid(
            @NotNull SidedTileEntity machine,
            int tier,
            boolean ignoreSameTier
    ) {
        if (tier == 1) {
            return true;
        }

        Set<Integer> existingTiers = new HashSet<>();
        boolean hasSameTier = false;

        for (BaseAddon addon : machine.getAddons()) {
            if (addon instanceof ModBaseTieredAddon) {
                ModBaseTieredAddon tieredAddon = (ModBaseTieredAddon) addon;

                if (!this.hasSameFunction(tieredAddon)) {
                    continue;
                }

                int addonTier = tieredAddon.getTier();

                if (addonTier == tier) {
                    hasSameTier = true;
                } else {
                    existingTiers.add(addonTier);
                }
            }
        }

        // Require all lower tiers
        for (int requiredTier = 1; requiredTier < tier; requiredTier++) {
            if (!existingTiers.contains(requiredTier)) {
                return false;
            }
        }

        // Only after prerequisites are satisfied, block duplicates
        return ignoreSameTier || !hasSameTier;
    }

    @Override
    public boolean canBeAddedTo(@NotNull SidedTileEntity machine) {
        return this.isTierValid(machine, this.getTier(), false);
    }

    @Override
    public boolean isValid(@NotNull SidedTileEntity machine) {
        return super.isValid(machine)
                && this.isTierValid(machine, this.getTier(), true);
    }

    public ModBaseTieredAddon(
            @NotNull String modId,
            @NotNull CreativeTabs tab,
            @NotNull String registryName
    ) {
        super(modId, tab, registryName);
    }
}
