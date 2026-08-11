package net.acecoast.ace_endium.item;

import net.acecoast.ace_endium.AceEndium;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AceEndium.MOD_ID);
// Items
    public static final RegistryObject<Item> ENDIUM_INGOT = ITEMS.register("endium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDIUM_SCRAP = ITEMS.register("endium_scrap",
            () -> new Item(new Item.Properties()));
// Smithing Templates (cba to do the actual code)
    public static final RegistryObject<Item> ENDIUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("endium_upgrade_smithing_template",
            () -> new Item(new Item.Properties()));
// Tools
    public static final RegistryObject<Item> ENDIUM_SWORD = ITEMS.register("endium_sword",
            () -> new SwordItem(ModToolTiers.ENDIUM,3,-2.4f,
                    (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> ENDIUM_PICKAXE = ITEMS.register("endium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDIUM,1,-2.8f,
                    (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> ENDIUM_AXE = ITEMS.register("endium_axe",
            () -> new AxeItem(ModToolTiers.ENDIUM,5,-3,
                    (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> ENDIUM_SHOVEL = ITEMS.register("endium_shovel",
            () -> new ShovelItem(ModToolTiers.ENDIUM,1.5f,-3,
                    (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> ENDIUM_HOE = ITEMS.register("endium_hoe",
            () -> new HoeItem(ModToolTiers.ENDIUM,-5,0,
                    (new Item.Properties()).fireResistant()));
// Armor
    public static final RegistryObject<Item> ENDIUM_HELMET = ITEMS.register("endium_helmet",
            () -> new ArmorItem(ModArmorMaterials.ENDIUM,ArmorItem.Type.HELMET,
                    (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> ENDIUM_CHESTPLATE = ITEMS.register("endium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ENDIUM,ArmorItem.Type.CHESTPLATE,
                    (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> ENDIUM_LEGGINGS = ITEMS.register("endium_leggings",
            () -> new ArmorItem(ModArmorMaterials.ENDIUM,ArmorItem.Type.LEGGINGS,
                    (new Item.Properties()).fireResistant()));
    public static final RegistryObject<Item> ENDIUM_BOOTS = ITEMS.register("endium_boots",
            () -> new ArmorItem(ModArmorMaterials.ENDIUM,ArmorItem.Type.BOOTS,
                    (new Item.Properties()).fireResistant()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
