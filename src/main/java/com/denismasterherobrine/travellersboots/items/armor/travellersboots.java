package com.denismasterherobrine.travellersboots.items.armor;

import com.denismasterherobrine.travellersboots.misc.ItemRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class travellersboots extends ItemArmor
{

    public travellersboots(String name, ItemArmor.ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        }
    public static ItemArmor.ArmorMaterial MKIMaterial = EnumHelper.addArmorMaterial("travellersboots:boots_mk1", "travellersboots:bootsmki", 4, new int[]{0, 0, 0, 0}, 4, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F).setRepairItem(new ItemStack(Items.LEATHER));
    public static ItemArmor.ArmorMaterial MKIIMaterial = EnumHelper.addArmorMaterial("travellersboots:boots_mk2", "travellersboots:bootsmkii", 8, new int[]{0, 0, 0, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F).setRepairItem(new ItemStack(Items.GOLD_INGOT));
    public static ItemArmor.ArmorMaterial MKIIIMaterial = EnumHelper.addArmorMaterial("travellersboots:boots_mk3", "travellersboots:bootsmkiii", 12, new int[]{0, 0, 0, 2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F).setRepairItem(new ItemStack(Items.DIAMOND));

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (player.inventory.armorItemInSlot(0) != null) {
            if (player.inventory.armorItemInSlot(0).getItem() == ItemRegistry.travellersbootsmki) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1, 0));
            }
            if (player.inventory.armorItemInSlot(0).getItem() == ItemRegistry.travellersbootsmkii) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1, 0));
                    player.stepHeight = 1.25f;
            }
            if (player.inventory.armorItemInSlot(0).getItem() == ItemRegistry.travellersbootsmkiii) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1, 1));
                    player.stepHeight = 1.25f;
            }
        }
    }
}