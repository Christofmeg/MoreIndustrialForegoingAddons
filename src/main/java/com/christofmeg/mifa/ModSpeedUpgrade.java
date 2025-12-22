package com.christofmeg.mifa;

import net.minecraft.item.ItemStack;
import net.ndrei.teslacorelib.tileentities.ElectricMachine;
import net.ndrei.teslacorelib.tileentities.SidedTileEntity;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ModSpeedUpgrade extends ModBaseTieredAddon {
    private final int tier;

    @NotNull
    protected String getAddonFunction() {
        return "speed";
    }

    public float getWorkEnergyMultiplier() {
        return 1.25F;
    }


 /*   @Override
    public float getWorkEnergyMultiplier() {
        return (float)Math.pow(0.95, tier);
    }
  */

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
            electricMachine.updateWorkEnergyRate();
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
            electricMachine.updateWorkEnergyRate();
        }
    }

    public int getTier() {
        return this.tier;
    }

    public ModSpeedUpgrade(int tier) {
        super(CommonConstants.MOD_ID, MoreIndustrialForegoingAddons.creativeTab, "speed_tier" + tier);
        this.tier = tier;
    }

    public boolean canBeAddedToMachine$tesla_core_lib(@NotNull SidedTileEntity machine) {
        return machine instanceof ElectricMachine && ((ElectricMachine)machine).supportsSpeedUpgrades();
    }
}
