package com.pottassiumm.pottassiummsrandomstuff;

import com.pottassiumm.pottassiummsrandomstuff.blocks.ModBlocks;
import com.pottassiumm.pottassiummsrandomstuff.items.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(PottassiummsRandomStuff.MODID)
public class PottassiummsRandomStuff {
    public static final String MODID = "pottassiummsrandomstuff";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PottassiummsRandomStuff(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        ModItems.registerItems(modEventBus);
        ModBlocks.registerBlocks(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(ModItems.GOLDEN_POTATO);
            event.accept(ModItems.ENCHANTED_GOLDEN_POTATO);
            event.accept(ModItems.COOKED_GOLDEN_POTATO);
            event.accept(ModItems.ENCHANTED_COOKED_GOLDEN_POTATO);
            event.accept(ModItems.GOLDEN_SWEET_BERRIES);
            event.accept(ModItems.ENCHANTED_GOLDEN_SWEET_BERRIES);
            event.accept(ModItems.GOLDEN_BEETROOT);
            event.accept(ModItems.ENCHANTED_GOLDEN_BEETROOT);
            event.accept(ModItems.GOLDEN_BREAD);
            event.accept(ModItems.ENCHANTED_GOLDEN_BREAD);
            event.accept(ModItems.GOLDEN_GLOW_BERRIES);
            event.accept(ModItems.ENCHANTED_GOLDEN_GLOW_BERRIES);


            event.accept(ModItems.GOLDEN_HONEY);
        }
        if(event.getTabKey() == CreativeModeTabs.SEARCH){
            event.accept(ModBlocks.GOLDEN_HONEY_BLOCK);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
