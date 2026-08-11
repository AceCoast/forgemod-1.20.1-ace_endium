package net.acecoast.ace_endium.item;

import net.acecoast.ace_endium.AceEndium;
import net.acecoast.ace_endium.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AceEndium.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ENDIUM_TAB = CREATIVE_MODE_TABS.register("endium_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ENDIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.endium_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.ENDIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.COSMIC_DEBRIS.get());

                        pOutput.accept(ModItems.ENDIUM_INGOT.get());
                        pOutput.accept(ModItems.ENDIUM_SCRAP.get());
                        pOutput.accept(ModItems.ENDIUM_UPGRADE_SMITHING_TEMPLATE.get());

                        pOutput.accept(Items.DIAMOND);
                        pOutput.accept(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE);

                        pOutput.accept(ModItems.ENDIUM_SWORD.get());
                        pOutput.accept(ModItems.ENDIUM_PICKAXE.get());
                        pOutput.accept(ModItems.ENDIUM_AXE.get());
                        pOutput.accept(ModItems.ENDIUM_SHOVEL.get());
                        pOutput.accept(ModItems.ENDIUM_HOE.get());

                        pOutput.accept(ModItems.ENDIUM_HELMET.get());
                        pOutput.accept(ModItems.ENDIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.ENDIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.ENDIUM_BOOTS.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
