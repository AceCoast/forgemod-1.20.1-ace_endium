package net.acecoast.ace_endium.block;

import net.acecoast.ace_endium.AceEndium;
import net.acecoast.ace_endium.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AceEndium.MOD_ID);


    public static final RegistryObject<Block> ENDIUM_BLOCK = registerBlock("endium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(60, 1200).sound(SoundType.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> COSMIC_DEBRIS = registerBlock("cosmic_debris",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(35, 1200).sound(SoundType.ANCIENT_DEBRIS)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
