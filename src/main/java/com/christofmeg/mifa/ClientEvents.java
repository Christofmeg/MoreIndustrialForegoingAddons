package com.christofmeg.mifa;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.ndrei.teslacorelib.items.EnergyUpgrade;
import net.ndrei.teslacorelib.items.EnergyUpgradeTier2;
import net.ndrei.teslacorelib.items.SpeedUpgrade;
import net.ndrei.teslacorelib.items.SpeedUpgradeTier2;

@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(modid = CommonConstants.MOD_ID)
public class  ClientEvents {

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        MoreIndustrialForegoingAddons.energy_tier3.registerRenderer();
        MoreIndustrialForegoingAddons.energy_tier4.registerRenderer();
        MoreIndustrialForegoingAddons.speed_tier3.registerRenderer();
        MoreIndustrialForegoingAddons.speed_tier4.registerRenderer();
    }

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        Item item = event.getItemStack().getItem();
        if (item instanceof EnergyUpgrade) {
            int tier = 1;
            if (item instanceof EnergyUpgradeTier2) {
                tier = 2;
            }
            event.getToolTip().add(String.format(
                    "Work required per operation: -%.2f%%",
                    (1.0 - Math.pow(0.75, tier)) * 100
            ));
        }
        if (item instanceof ModEnergyUpgrade) {
            int tier = ((ModEnergyUpgrade) item).getTier();
            event.getToolTip().add(String.format(
                    "Work required per operation: -%.2f%%",
                    (1.0 - Math.pow(0.75, tier)) * 100
            ));
        }
        if (item instanceof SpeedUpgrade) {
            int tier = 1;
            if (item instanceof SpeedUpgradeTier2) {
                tier = 2;
            }
            double cost = 1.0 - Math.pow(0.75, tier);
            event.getToolTip().add(String.format(
                    "Total energy cost is reduced by: %.2f%%",
                    cost * 100
            ));
        }
        if (item instanceof ModSpeedUpgrade) {
            int tier = ((ModSpeedUpgrade) item).getTier();
            double cost = 1.0 - Math.pow(0.75, tier);
            event.getToolTip().add(String.format(
                    "Total energy cost is reduced by: %.2f%%",
                    cost * 100
            ));
        }
    }

    /*
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
     */

}
