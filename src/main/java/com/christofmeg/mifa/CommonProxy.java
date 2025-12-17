package com.christofmeg.mifa;

import com.buuz135.industrial.proxy.ItemRegistry;
import com.christofmeg.mifa.common.item.Registry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public CommonProxy() {
    }

    public void preInit(FMLPreInitializationEvent event) {
        Registry.poke();
        MinecraftForge.EVENT_BUS.register(new ItemRegistry());
    }
}
