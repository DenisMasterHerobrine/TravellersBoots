package com.denismasterherobrine.travellersboots.tokens;

import com.denismasterherobrine.travellersboots.TravellersBoots;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nullable;
import java.util.List;

@ObjectHolder(TravellersBoots.MODID)
public class FireResistanceToken extends Item {
    public FireResistanceToken() {
        super(new Item.Properties().stacksTo(1).tab(ItemGroup.TAB_MISC));
    }

    @Override
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag tooltipFlag) {
        tooltip.add(new StringTextComponent("Combine this token with Traveller's Boots MK5 in Crafting Table (or anything like it) to get permament Fire Resistance while wearing Traveller's Boots MK5."));
        tooltip.add(new StringTextComponent("This is NOT permament effect till the end of the game!"));
    }
}