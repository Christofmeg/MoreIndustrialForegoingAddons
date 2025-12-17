package com.christofmeg.mifa.common.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.ndrei.teslacorelib.ProxyLoadLevel;
import net.ndrei.teslacorelib.TeslaCoreLib;
import net.ndrei.teslacorelib.annotations.AutoRegisterItem;
import net.ndrei.teslacorelib.config.TeslaCoreLibConfig;
import net.ndrei.teslacorelib.items.SpeedUpgrade;

@AutoRegisterItem(
        configFlags = {
                TeslaCoreLibConfig.REGISTER_ADDONS,
                TeslaCoreLibConfig.REGISTER_SPEED_ADDONS
        }
)
public class SpeedUpgradeTier3 extends SpeedUpgrade {

    public static final SpeedUpgradeTier3 INSTANCE = new SpeedUpgradeTier3();

    SpeedUpgradeTier3() {
        super(3);
    }

    static {
        TeslaCoreLib.proxy.testLoadLevel(
                ProxyLoadLevel.ITEMS,
                SpeedUpgradeTier3.class.getSimpleName()
        );
    }

    public void register(IForgeRegistry<Item> items) {
        items.register(this);
    }
}
