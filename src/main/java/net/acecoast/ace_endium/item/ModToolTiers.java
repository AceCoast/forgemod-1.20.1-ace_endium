package net.acecoast.ace_endium.item;

import net.acecoast.ace_endium.AceEndium;
import net.acecoast.ace_endium.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ENDIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3200, 10, 5, 18,
                    ModTags.Blocks.NEEDS_ENDIUM_TOOL, () -> Ingredient.of(ModItems.ENDIUM_INGOT.get())),
            new ResourceLocation(AceEndium.MOD_ID, "endium"), List.of(Tiers.NETHERITE), List.of());
}
