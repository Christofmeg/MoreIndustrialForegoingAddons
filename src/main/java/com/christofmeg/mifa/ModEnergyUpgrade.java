package com.christofmeg.mifa;

import net.minecraft.item.ItemStack;
import net.ndrei.teslacorelib.tileentities.ElectricMachine;
import net.ndrei.teslacorelib.tileentities.SidedTileEntity;
import org.jetbrains.annotations.NotNull;

public class ModEnergyUpgrade extends ModBaseTieredAddon {
    private final int tier;

    @NotNull
    protected String getAddonFunction() {
        return "energy";
    }

    public float getWorkEnergyMultiplier() {
        return 0.75F;
    }

    public boolean canBeAddedTo(@NotNull SidedTileEntity machine) {
        return canBeAddedToMachine$tesla_core_lib(machine) && super.canBeAddedTo(machine);
    }

    public void onAdded(@NotNull ItemStack addon, @NotNull SidedTileEntity machine) {
        super.onAdded(addon, machine);
        SidedTileEntity sidedTileEntity = machine;
        if (!(machine instanceof ElectricMachine)) {
            sidedTileEntity = null;
        }

        ElectricMachine electricMachine = (ElectricMachine)sidedTileEntity;
        if (electricMachine != null) {
            electricMachine.updateWorkEnergyCapacity();
        }
    }

    public void onRemoved(@NotNull ItemStack addon, @NotNull SidedTileEntity machine) {
        super.onRemoved(addon, machine);
        SidedTileEntity sidedTileEntity = machine;
        if (!(machine instanceof ElectricMachine)) {
            sidedTileEntity = null;
        }

        ElectricMachine electricMachine = (ElectricMachine)sidedTileEntity;
        if (electricMachine != null) {
            electricMachine.updateWorkEnergyCapacity();
        }
    }

    public int getTier() {
        return this.tier;
    }

    public ModEnergyUpgrade(int tier) {
        super(CommonConstants.MOD_ID, MoreIndustrialForegoingAddons.creativeTab, "energy_tier" + tier);
        this.tier = tier;
    }

    public final boolean canBeAddedToMachine$tesla_core_lib(@NotNull SidedTileEntity machine) {
        return machine instanceof ElectricMachine && ((ElectricMachine)machine).supportsEnergyUpgrades();
    }

}