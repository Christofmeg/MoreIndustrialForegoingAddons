package com.christofmeg.mifa;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = CommonConstants.MOD_ID)
public final class CommonEvents {

    @SubscribeEvent
    public static void onRegisterItemsEvent(@Nonnull final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ModEnergyUpgrade(3));
        event.getRegistry().register(new ModEnergyUpgrade(4));
        event.getRegistry().register(new ModSpeedUpgrade(3));
        event.getRegistry().register(new ModSpeedUpgrade(4));
    }

}