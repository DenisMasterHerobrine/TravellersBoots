package com.denismasterherobrine.travellersboots.armor;

import com.denismasterherobrine.travellersboots.register.ItemRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class BootsMaterial extends ArmorItem {
    public BootsMaterial(final IArmorMaterial material, final EquipmentSlotType equipmentSlot, final Item.Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
            if (player.inventory.armorInventory.get(0).getItem().equals(ItemRegistry.travellersbootsmki))  {
                player.addPotionEffect(new EffectInstance(Effects.SPEED, 1, 0));
            }
            if (player.inventory.armorInventory.get(0).getItem().equals(ItemRegistry.travellersbootsmkii)) {
                player.addPotionEffect(new EffectInstance(Effects.SPEED, 1, 0));
                player.stepHeight = 1.25f;
            }
            if (player.inventory.armorInventory.get(0).getItem().equals(ItemRegistry.travellersbootsmkiii)) {
                player.addPotionEffect(new EffectInstance(Effects.SPEED, 1, 1));
                player.stepHeight = 1.25f;
            }
            if (player.inventory.armorInventory.get(0).getItem().equals(ItemRegistry.travellersbootsmkiv)) {
                player.addPotionEffect(new EffectInstance(Effects.SPEED, 1, 3));
                player.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 1, 1));
                player.stepHeight = 1.25f;
            }
        }
    }