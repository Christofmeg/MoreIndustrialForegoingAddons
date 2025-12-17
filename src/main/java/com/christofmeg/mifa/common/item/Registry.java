package com.christofmeg.mifa.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class Registry {

    public static SpeedUpgradeTier3 speedAddon3 = new SpeedUpgradeTier3();

    public Registry() {
    }

    public static void registerItems(IForgeRegistry<Item> itemRegistry) {

        speedAddon3.register(itemRegistry);

    }


    public static void poke() {
    }
}
