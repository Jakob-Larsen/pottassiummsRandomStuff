package com.pottassiumm.pottassiummsrandomstuff.items;

import com.pottassiumm.pottassiummsrandomstuff.PottassiummsRandomStuff;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    //public static final DeferredItem<Item> ITEM NAME = ITEMS.register("ITEM NAME", () -> new Item(new Item.Properties.food(ModItemProperties.ITEM PROPERTIES NAME)))
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PottassiummsRandomStuff.MODID);

    public static final DeferredItem<Item> GOLDEN_POTATO = ITEMS.register("golden_potato",() -> new Item(new Item.Properties().food(ModItemProperties.GOLDEN_POTATO)));

    public static final DeferredItem<Item> COOKED_GOLDEN_POTATO = ITEMS.register("cooked_golden_potato",() -> new Item(new Item.Properties().food(ModItemProperties.COOKED_GOLDEN_POTATO)));


    public static void registerItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
