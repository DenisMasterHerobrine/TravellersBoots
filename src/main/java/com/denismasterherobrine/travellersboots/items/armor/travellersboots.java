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
    public static ItemArmor.ArmorMaterial MKIMaterial = EnumHelper.addArmorMaterial("travellersboots:boots_mk1", "travellersboots:bootsmki", 4, new int[]{1, 0, 0, 0}, 4, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F).setRepairItem(new ItemStack(Items.LEATHER));
    public static ItemArmor.ArmorMaterial MKIIMaterial = EnumHelper.addArmorMaterial("travellersboots:boots_mk2", "travellersboots:bootsmkii", 8, new int[]{2, 0, 0, 0}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F).setRepairItem(new ItemStack(Items.GOLD_INGOT));
    public static ItemArmor.ArmorMaterial MKIIIMaterial = EnumHelper.addArmorMaterial("travellersboots:boots_mk3", "travellersboots:bootsmkiii", 12, new int[]{4, 0, 0, 0}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F).setRepairItem(new ItemStack(Items.DIAMOND));
    public static ItemArmor.ArmorMaterial MKIVMaterial = EnumHelper.addArmorMaterial("travellersboots:boots_mk4", "travellersboots:bootsmkiv", 16, new int[]{6, 0, 0, 0}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F).setRepairItem(new ItemStack(Items.EMERALD));

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
            if (player.inventory.armorInventory.get(0).getItem().equals(ItemRegistry.travellersbootsmki)) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1, 0));
            }
            if (player.inventory.armorInventory.get(0).getItem().equals(ItemRegistry.travellersbootsmkii)) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1, 0));
                player.stepHeight = 1.25f;
            }
            if (player.inventory.armorInventory.get(0).getItem().equals(ItemRegistry.travellersbootsmkiii)) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1, 1));
                player.stepHeight = 1.25f;
            }
            if (player.inventory.armorInventory.get(0).getItem().equals(ItemRegistry.travellersbootsmkiv)) {
                player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 1, 3));
                player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 1, 1));
                player.stepHeight = 1.25f;
            }
        }
    }