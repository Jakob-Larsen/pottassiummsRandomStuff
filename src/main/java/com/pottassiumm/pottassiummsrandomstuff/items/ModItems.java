package com.pottassiumm.pottassiummsrandomstuff.items;

import com.pottassiumm.pottassiummsrandomstuff.PottassiummsRandomStuff;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    //public static final DeferredItem<Item> ITEM NAME = ITEMS.register("ITEM NAME", () -> new Item(new Item.Properties()));
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PottassiummsRandomStuff.MODID);

    public static final DeferredItem<Item> GOLDEN_POTATO = ITEMS.register("golden_potato",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_POTATO)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> COOKED_GOLDEN_POTATO = ITEMS.register("cooked_golden_potato",
            () -> new Item(new Item.Properties().food(ModItemProperties.COOKED_GOLDEN_POTATO)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> GOLDEN_BEETROOT = ITEMS.register("golden_beetroot",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_BEETROOT)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> GOLDEN_BREAD = ITEMS.register("golden_bread",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_BREAD)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> GOLDEN_GLOW_BERRIES = ITEMS.register("golden_glow_berries",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_GLOW_BERRIES)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> GOLDEN_SWEET_BERRIES = ITEMS.register("golden_sweet_berries",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_SWEET_BERRIES)
                    .rarity(Rarity.RARE)));

    public static final DeferredItem<Item> GOLDEN_HONEY = ITEMS.register("golden_honey",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_HONEY).rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> ENCHANTED_GOLDEN_POTATO = ITEMS.register("enchanted_golden_potato",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_POTATO).rarity(Rarity.EPIC)
                    .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> ENCHANTED_COOKED_GOLDEN_POTATO = ITEMS.register("enchanted_cooked_golden_potato",
            () -> new Item(new Item.Properties().food(ModItemProperties.COOKED_GOLDEN_POTATO).rarity(Rarity.EPIC)
                    .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> ENCHANTED_GOLDEN_BEETROOT = ITEMS.register("enchanted_golden_beetroot",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_BEETROOT).rarity(Rarity.EPIC)
                    .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> ENCHANTED_GOLDEN_BREAD = ITEMS.register("enchanted_golden_bread",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_BREAD).rarity(Rarity.EPIC)
                    .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> ENCHANTED_GOLDEN_GLOW_BERRIES = ITEMS.register("enchanted_golden_glow_berries",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_GLOW_BERRIES).rarity(Rarity.EPIC)
                    .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> ENCHANTED_GOLDEN_SWEET_BERRIES = ITEMS.register("enchanted_golden_sweet_berries",
            () -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_SWEET_BERRIES).rarity(Rarity.EPIC)
                    .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));


    public static void registerItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
