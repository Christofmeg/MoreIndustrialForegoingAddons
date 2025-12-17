package com.christofmeg.mifa;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = CommonConstants.MOD_ID,
        name = CommonConstants.MOD_NAME,
        version = MoreIndustrialForegoingAddons.VERSION,
        acceptedMinecraftVersions = "[1.12, 1.13)",
        dependencies = "required-after:forge@[14.23.5.2806,);required-after:teslacorelib@[1.0.15,);required-after:industrialforegoing@[1.12,);"
)
public class MoreIndustrialForegoingAddons {

    public MoreIndustrialForegoingAddons instance;
    public static final String VERSION = "1.1.1";

    @SidedProxy(
            clientSide = "com.christofmeg.mifa.ClientProxy",
            serverSide = "com.christofmeg.mifa.CommonProxy"
    )
    private static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        instance = this;
        proxy.preInit(event);
    }

}