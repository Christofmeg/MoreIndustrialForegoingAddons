package com.christofmeg.mifa.common.item;

import net.ndrei.teslacorelib.items.EnergyUpgrade;

public class ModEnergyAddonItem extends EnergyUpgrade {

    public int tier;

    public ModEnergyAddonItem(int tier) {
        super(tier);
        this.tier = tier;
    }

}
