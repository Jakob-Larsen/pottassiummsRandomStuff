package com.pottassiumm.pottassiummsrandomstuff.blocks;

import com.pottassiumm.pottassiummsrandomstuff.PottassiummsRandomStuff;
import com.pottassiumm.pottassiummsrandomstuff.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HoneyBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PottassiummsRandomStuff.MODID);

    public static final DeferredBlock<Block> GOLDEN_HONEY_BLOCK = registerBlock("golden_honey_block", ()-> new HoneyBlock(BlockBehaviour.Properties.of()
            .strength(4f).requiresCorrectToolForDrops().sound(SoundType.HONEY_BLOCK).noOcclusion().jumpFactor(2f).speedFactor(0.2f)));




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, ()-> new BlockItem(block.get() ,new Item.Properties()));
    }

    public static void registerBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
