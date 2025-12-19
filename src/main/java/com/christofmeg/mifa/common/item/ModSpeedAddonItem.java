package com.christofmeg.mifa.common.item;

import com.buuz135.industrial.proxy.ItemRegistry;
import com.buuz135.industrial.utils.RecipeUtils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.ndrei.teslacorelib.items.SpeedUpgrade;

import javax.annotation.Nullable;
import java.util.List;

public class ModSpeedAddonItem extends SpeedUpgrade {

    public int tier;

    public ModSpeedAddonItem(int tier) {
        super(tier);
        this.tier = tier;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        double cost = 1.0 - Math.pow(0.75, tier);
   //     tooltip.add("50% more power, but will require 25% more energy, working a total of 20% faster.");

        double speedMultiplier  = Math.pow(1.2, tier);
        double energyMultiplier = Math.pow(1.25, tier);
        double powerMultiplier  = Math.pow(1.5, tier);

        double speedPercent  = (speedMultiplier  - 1.0) * 100;
        double energyPercent = (energyMultiplier - 1.0) * 100;
        double powerPercent  = (powerMultiplier  - 1.0) * 100;

        tooltip.add("speed: + " + speedPercent);
        tooltip.add("energy: + " + energyPercent);
        tooltip.add("power: + " + powerPercent);

    }

    public void createRecipe() {
        Object[] items = new Object[]{new ItemStack(Blocks.MOSSY_COBBLESTONE), new ItemStack(Items.FISH, 1, 4), "ingotIron", "TIER3", "TIER4", "TIER5", "TIER6", "ingotGold", new ItemStack(Items.DIAMOND), new ItemStack(Items.APPLE), "TIER10", new ItemStack(Items.CARROT)};

        for(int i = 0; i < 12; ++i) {
            RecipeUtils.addShapedRecipe(new ItemStack(this, 1, i), new Object[]{"ipi", "igi", "ipi", 'i', items[i], 'p', ItemRegistry.plastic, 'g', "paneGlass"});
        }

    }

}
