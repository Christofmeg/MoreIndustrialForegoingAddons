package com.christofmeg.mifa;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.jetbrains.annotations.NotNull;

@Mod(
        modid = CommonConstants.MOD_ID,
        name = CommonConstants.MOD_NAME,
        version = MoreIndustrialForegoingAddons.VERSION,
        acceptedMinecraftVersions = "[1.12, 1.13)",
        dependencies = "required-after:forge@[14.23.5.2806,);required-after:teslacorelib@[1.0.15,);required-after:industrialforegoing@[1.12,);"
)
public class MoreIndustrialForegoingAddons {

    public static final String VERSION = "1.1.1";
    public static CreativeTabs creativeTab = new CreativeTabs(CommonConstants.MOD_ID + "_addons") {
        @Override
        public @NotNull ItemStack createIcon() {
            return new ItemStack(speed_tier3);
        }
    };

    @GameRegistry.ObjectHolder("mifa:energy_tier3")
    public static ModEnergyUpgrade energy_tier3;

    @GameRegistry.ObjectHolder("mifa:energy_tier4")
    public static ModEnergyUpgrade energy_tier4;

    @GameRegistry.ObjectHolder("mifa:speed_tier3")
    public static ModSpeedUpgrade speed_tier3;

    @GameRegistry.ObjectHolder("mifa:speed_tier4")
    public static ModSpeedUpgrade speed_tier4;

            /*
        TODO prevent TIER 4 from being inserted until tier 3 is present
        TODO item tooltips
         */
}