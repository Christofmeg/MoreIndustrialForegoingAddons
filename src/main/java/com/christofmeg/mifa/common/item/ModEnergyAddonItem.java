package com.christofmeg.mifa.common.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.ndrei.teslacorelib.items.EnergyUpgrade;

import javax.annotation.Nullable;
import java.util.List;

public class ModEnergyAddonItem extends EnergyUpgrade {

    public int tier;

    public ModEnergyAddonItem(int tier) {
        super(tier);
        this.tier = tier;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        double cost = 1.0 - Math.pow(0.75, tier);
        tooltip.add(String.format(
                "Total energy cost is reduced by: %.2f%%",
                cost * 100
        ));
    }

}
