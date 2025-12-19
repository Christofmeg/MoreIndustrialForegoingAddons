package com.christofmeg.mifa;

import com.christofmeg.mifa.common.item.ModEnergyAddonItem;
import com.christofmeg.mifa.common.item.ModSpeedAddonItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = CommonConstants.MOD_ID)
public final class ModEvent {

    @SubscribeEvent
    public static void onRegisterItemsEvent(@Nonnull final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        /*
        TODO item textures
        TODO item recipes
        TODO item tooltips
        TODO upgrade path
        TODO tooltips on tesla lib upgrades
         */

        registry.registerAll(
                new ModEnergyAddonItem(3),
                new ModEnergyAddonItem(4),
                new ModSpeedAddonItem(3),
                new ModSpeedAddonItem(4)
        );
    }

}