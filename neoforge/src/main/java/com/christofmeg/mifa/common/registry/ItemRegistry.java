package com.christofmeg.mifa.common.registry;

import com.buuz135.industrial.item.RecipelessCustomItem;
import com.buuz135.industrial.module.IModule;
import com.buuz135.industrial.module.ModuleCore;
import com.buuz135.industrial.recipe.DissolutionChamberRecipe;
import com.christofmeg.mifa.CommonConstants;
import com.christofmeg.mifa.common.item.ModEfficiencyAddonItem;
import com.christofmeg.mifa.common.item.ModProcessingAddonItem;
import com.christofmeg.mifa.common.item.ModSpeedAddonItem;
import com.hrznstudio.titanium.module.DeferredRegistryHelper;
import com.hrznstudio.titanium.tab.TitaniumTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.List;
import java.util.Optional;

public class ItemRegistry implements IModule {

    public static TitaniumTab TAB_ADDONS = new TitaniumTab(ResourceLocation.fromNamespaceAndPath(CommonConstants.MOD_ID, "addons"));

    public static DeferredHolder<Item, Item> EFFICIENCY_ADDON_3;
    public static DeferredHolder<Item, Item> EFFICIENCY_ADDON_4;
    public static DeferredHolder<Item, Item> EFFICIENCY_ADDON_5;
    public static DeferredHolder<Item, Item> EFFICIENCY_ADDON_6;
    public static DeferredHolder<Item, Item> EFFICIENCY_ADDON_7;
    public static DeferredHolder<Item, Item> EFFICIENCY_ADDON_8;

    public static DeferredHolder<Item, Item> PROCESSING_ADDON_3;
    public static DeferredHolder<Item, Item> PROCESSING_ADDON_4;
    public static DeferredHolder<Item, Item> PROCESSING_ADDON_5;
    public static DeferredHolder<Item, Item> PROCESSING_ADDON_6;
    public static DeferredHolder<Item, Item> PROCESSING_ADDON_7;
    public static DeferredHolder<Item, Item> PROCESSING_ADDON_8;

    public static DeferredHolder<Item, Item> SPEED_ADDON_3;
    public static DeferredHolder<Item, Item> SPEED_ADDON_4;
    public static DeferredHolder<Item, Item> SPEED_ADDON_5;
    public static DeferredHolder<Item, Item> SPEED_ADDON_6;
    public static DeferredHolder<Item, Item> SPEED_ADDON_7;
    public static DeferredHolder<Item, Item> SPEED_ADDON_8;

    public static DeferredHolder<Item, Item> NETHERITE_GEAR;

    @Override
    public void generateFeatures(DeferredRegistryHelper helper) {

        EFFICIENCY_ADDON_3 = helper.registerGeneric(Registries.ITEM, "efficiency_addon_3", () -> new ModEfficiencyAddonItem(3, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "efficiency_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.ORES_NETHERITE_SCRAP),
                                Ingredient.of(Items.NETHERITE_SCRAP),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(ModuleCore.EFFICIENCY_ADDON_2.get()),
                                Ingredient.of(Tags.Items.RODS_BLAZE),
                                Ingredient.of(Tags.Items.RODS_BLAZE)
                        ),
                                new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 3000), 600,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        EFFICIENCY_ADDON_4 = helper.registerGeneric(Registries.ITEM, "efficiency_addon_4", () -> new ModEfficiencyAddonItem(4, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "efficiency_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.SCULK),
                                Ingredient.of(Items.ECHO_SHARD),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(EFFICIENCY_ADDON_3.get()),
                                Ingredient.of(Tags.Items.RODS_BLAZE),
                                Ingredient.of(Tags.Items.RODS_BLAZE)
                        ),
                                new FluidStack(ModuleCore.ESSENCE.getSourceFluid().get(), 4000), 800,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        EFFICIENCY_ADDON_5 = helper.registerGeneric(Registries.ITEM, "efficiency_addon_5", () -> new ModEfficiencyAddonItem(5, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "efficiency_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.OBSIDIANS_CRYING),
                                Ingredient.of(Items.TOTEM_OF_UNDYING),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(EFFICIENCY_ADDON_4.get()),
                                Ingredient.of(Tags.Items.RODS_BLAZE),
                                Ingredient.of(Tags.Items.RODS_BLAZE)
                        ),
                                new FluidStack(ModuleCore.SLUDGE.getSourceFluid().get(), 5000), 1000,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        EFFICIENCY_ADDON_6 = helper.registerGeneric(Registries.ITEM, "efficiency_addon_6", () -> new ModEfficiencyAddonItem(6, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "efficiency_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.AMETHYST_BLOCK),
                                Ingredient.of(Items.SHULKER_SHELL),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(EFFICIENCY_ADDON_5.get()),
                                Ingredient.of(Tags.Items.RODS_BLAZE),
                                Ingredient.of(Tags.Items.RODS_BLAZE)
                        ),
                                new FluidStack(ModuleCore.BIOFUEL.getSourceFluid().get(), 6000), 1200,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        EFFICIENCY_ADDON_7 = helper.registerGeneric(Registries.ITEM, "efficiency_addon_7", () -> new ModEfficiencyAddonItem(7, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "efficiency_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.BEACON),
                                Ingredient.of(Tags.Items.NETHER_STARS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(EFFICIENCY_ADDON_6.get()),
                                Ingredient.of(Tags.Items.RODS_BLAZE),
                                Ingredient.of(Tags.Items.RODS_BLAZE)
                        ),
                                new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 7000), 1400,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        EFFICIENCY_ADDON_8 = helper.registerGeneric(Registries.ITEM, "efficiency_addon_8", () -> new ModEfficiencyAddonItem(8, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "efficiency_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.DRAGON_HEAD),
                                Ingredient.of(Items.DRAGON_BREATH),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(EFFICIENCY_ADDON_7.get()),
                                Ingredient.of(Tags.Items.RODS_BLAZE),
                                Ingredient.of(Tags.Items.RODS_BLAZE)
                        ),
                                new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 8000), 1600,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });

        PROCESSING_ADDON_3 = helper.registerGeneric(Registries.ITEM, "processing_addon_3", () -> new ModProcessingAddonItem(3, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "processing_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.ORES_NETHERITE_SCRAP),
                                Ingredient.of(Items.NETHERITE_SCRAP),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(ModuleCore.PROCESSING_ADDON_2.get()),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_FURNACES),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_CRAFTING_TABLES)
                        ),
                                new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 3000), 600,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        PROCESSING_ADDON_4 = helper.registerGeneric(Registries.ITEM, "processing_addon_4", () -> new ModProcessingAddonItem(4, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "processing_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.SCULK),
                                Ingredient.of(Items.ECHO_SHARD),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(PROCESSING_ADDON_3.get()),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_FURNACES),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_CRAFTING_TABLES)
                        ),
                                new FluidStack(ModuleCore.ESSENCE.getSourceFluid().get(), 4000), 800,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        PROCESSING_ADDON_5 = helper.registerGeneric(Registries.ITEM, "processing_addon_5", () -> new ModProcessingAddonItem(5, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "processing_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.OBSIDIANS_CRYING),
                                Ingredient.of(Items.TOTEM_OF_UNDYING),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(PROCESSING_ADDON_4.get()),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_FURNACES),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_CRAFTING_TABLES)
                        ),
                                new FluidStack(ModuleCore.SLUDGE.getSourceFluid().get(), 5000), 1000,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        PROCESSING_ADDON_6 = helper.registerGeneric(Registries.ITEM, "processing_addon_6", () -> new ModProcessingAddonItem(6, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "processing_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.AMETHYST_BLOCK),
                                Ingredient.of(Items.SHULKER_SHELL),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(PROCESSING_ADDON_5.get()),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_FURNACES),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_CRAFTING_TABLES)
                        ),
                                new FluidStack(ModuleCore.BIOFUEL.getSourceFluid().get(), 6000), 1200,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        PROCESSING_ADDON_7 = helper.registerGeneric(Registries.ITEM, "processing_addon_7", () -> new ModProcessingAddonItem(7, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "processing_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.BEACON),
                                Ingredient.of(Tags.Items.NETHER_STARS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(PROCESSING_ADDON_6.get()),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_FURNACES),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_CRAFTING_TABLES)
                        ),
                                new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 7000), 1400,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        PROCESSING_ADDON_8 = helper.registerGeneric(Registries.ITEM, "processing_addon_8", () -> new ModProcessingAddonItem(8, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "processing_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.DRAGON_HEAD),
                                Ingredient.of(Items.DRAGON_BREATH),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(PROCESSING_ADDON_7.get()),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_FURNACES),
                                Ingredient.of(Tags.Items.PLAYER_WORKSTATIONS_CRAFTING_TABLES)
                        ),
                                new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 8000), 1600,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });

        SPEED_ADDON_3 = helper.registerGeneric(Registries.ITEM, "speed_addon_3", () -> new ModSpeedAddonItem(3, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "speed_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.ORES_NETHERITE_SCRAP),
                                Ingredient.of(Items.NETHERITE_SCRAP),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(ModuleCore.SPEED_ADDON_2.get()),
                                Ingredient.of(Items.SUGAR),
                                Ingredient.of(Items.SUGAR)
                        ),
                                new FluidStack(ModuleCore.PINK_SLIME.getSourceFluid().get(), 3000), 600,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        SPEED_ADDON_4 = helper.registerGeneric(Registries.ITEM, "speed_addon_4", () -> new ModSpeedAddonItem(4, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "speed_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.SCULK),
                                Ingredient.of(Items.ECHO_SHARD),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(SPEED_ADDON_3.get()),
                                Ingredient.of(Items.SUGAR),
                                Ingredient.of(Items.SUGAR)
                        ),
                                new FluidStack(ModuleCore.ESSENCE.getSourceFluid().get(), 4000), 800,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        SPEED_ADDON_5 = helper.registerGeneric(Registries.ITEM, "speed_addon_5", () -> new ModSpeedAddonItem(5, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "speed_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Tags.Items.OBSIDIANS_CRYING),
                                Ingredient.of(Items.TOTEM_OF_UNDYING),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(SPEED_ADDON_4.get()),
                                Ingredient.of(Items.SUGAR),
                                Ingredient.of(Items.SUGAR)
                        ),
                                new FluidStack(ModuleCore.SLUDGE.getSourceFluid().get(), 5000), 1000,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        SPEED_ADDON_6 = helper.registerGeneric(Registries.ITEM, "speed_addon_6", () -> new ModSpeedAddonItem(6, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "speed_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.AMETHYST_BLOCK),
                                Ingredient.of(Items.SHULKER_SHELL),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(SPEED_ADDON_5.get()),
                                Ingredient.of(Items.SUGAR),
                                Ingredient.of(Items.SUGAR)
                        ),
                                new FluidStack(ModuleCore.BIOFUEL.getSourceFluid().get(), 6000), 1200,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        SPEED_ADDON_7 = helper.registerGeneric(Registries.ITEM, "speed_addon_7", () -> new ModSpeedAddonItem(7, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "speed_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.BEACON),
                                Ingredient.of(Tags.Items.NETHER_STARS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(SPEED_ADDON_6.get()),
                                Ingredient.of(Items.SUGAR),
                                Ingredient.of(Items.SUGAR)
                        ),
                                new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 7000), 1400,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        SPEED_ADDON_8 = helper.registerGeneric(Registries.ITEM, "speed_addon_8", () -> new ModSpeedAddonItem(8, TAB_ADDONS) {
            @Override
            public void registerRecipe(RecipeOutput consumer) {
                DissolutionChamberRecipe.createRecipe(consumer, "speed_addon_" + this.tier,
                        new DissolutionChamberRecipe(List.of(
                                Ingredient.of(Items.DRAGON_HEAD),
                                Ingredient.of(Items.DRAGON_BREATH),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(Tags.Items.GLASS_PANES_COLORLESS),
                                Ingredient.of(TagRegistry.Items.GEARS_NETHERITE),
                                Ingredient.of(SPEED_ADDON_7.get()),
                                Ingredient.of(Items.SUGAR),
                                Ingredient.of(Items.SUGAR)
                        ),
                                new FluidStack(ModuleCore.ETHER.getSourceFluid().get(), 8000), 1600,
                                Optional.of(new ItemStack(this)), Optional.empty()));
            }
        });
        
        NETHERITE_GEAR = helper.registerGeneric(Registries.ITEM, "netherite_gear", () -> new RecipelessCustomItem("netherite_gear", TAB_ADDONS));
    }
}