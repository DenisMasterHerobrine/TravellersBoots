package com.denismasterherobrine.travellersboots.misc;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeRegistry {
    public static void recipesRegister() {
        GameRegistry.addShapedRecipe(new ResourceLocation("boots_mk1"), new ResourceLocation("boots_mk1"), new ItemStack(ItemRegistry.travellersbootsmki), new Object[]{
                "LBL",
                "LIL",
                "   ",
                'L', Items.LEATHER,
                'B', Items.IRON_BOOTS,
                'I', Items.IRON_INGOT
        });
        GameRegistry.addShapedRecipe(new ResourceLocation("boots_mk2"), new ResourceLocation("boots_mk2"), new ItemStack(ItemRegistry.travellersbootsmkii), new Object[]{
                "LBL",
                "LIL",
                "   ",
                'L', Items.GOLD_INGOT,
                'B', ItemRegistry.travellersbootsmki,
                'I', Blocks.GOLD_BLOCK
        });
        GameRegistry.addShapedRecipe(new ResourceLocation("boots_mk3"), new ResourceLocation("boots_mk3"), new ItemStack(ItemRegistry.travellersbootsmkiii), new Object[]{
                "LBL",
                "LIL",
                "   ",
                'L', Items.DIAMOND,
                'B', ItemRegistry.travellersbootsmkii,
                'I', Blocks.DIAMOND_BLOCK
        });
        GameRegistry.addShapedRecipe(new ResourceLocation("boots_mk4"), new ResourceLocation("boots_mk4"), new ItemStack(ItemRegistry.travellersbootsmkiv), new Object[]{
                "DBD",
                "LIL",
                "   ",
                'L', Items.EMERALD,
                'B', ItemRegistry.travellersbootsmkiii,
                'I', Blocks.EMERALD_BLOCK,
                'D', Items.DIAMOND
        });
    }
}
