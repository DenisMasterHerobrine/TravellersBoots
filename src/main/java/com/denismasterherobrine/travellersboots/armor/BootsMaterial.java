package com.denismasterherobrine.travellersboots.armor;

import com.denismasterherobrine.travellersboots.config.Config;
import com.denismasterherobrine.travellersboots.register.ItemRegistry;
import net.minecraft.entity.Entity;
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

    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        if (player.inventory.armor.get(0).getItem().equals(ItemRegistry.travellersbootsmki)) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 1, 0));
        }
        if (player.inventory.armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkii)) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 1, 0));
            if (Config.isStepHeightEnabled.get()){
                player.maxUpStep = 1.0f;
            }
        }
        if (player.inventory.armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkiii)) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 1, 1));
            if (Config.isStepHeightEnabled.get()){
                player.maxUpStep = 1.0f;
            }
        }
        if (player.inventory.armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkiv)) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 1, 3));
            player.addEffect(new EffectInstance(Effects.JUMP, 1, 1));
            if (Config.isStepHeightEnabled.get()){
                player.maxUpStep = 1.0f;
            }
        }

        if (player.inventory.armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkv)) {
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 1, 3));
            player.addEffect(new EffectInstance(Effects.JUMP, 1, 1));
            if (Config.isStepHeightEnabled.get()){
                player.maxUpStep = 1.0f;
            }
        }
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity livingEntity = (PlayerEntity) entity;
            if (!(livingEntity.inventory.armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkii))) {
                if (Config.isStepHeightEnabled.get()){
                    livingEntity.maxUpStep = 0.75f;
                }
            }
            if (!(livingEntity.inventory.armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkiii))) {
                if (Config.isStepHeightEnabled.get()){
                    livingEntity.maxUpStep = 0.75f;
                }
            }
            if (!(livingEntity.inventory.armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkiv))) {
                if (Config.isStepHeightEnabled.get()){
                    livingEntity.maxUpStep = 0.75f;
                }
            }
            if (!(livingEntity.inventory.armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkv))) {
                if (Config.isStepHeightEnabled.get()){
                    livingEntity.maxUpStep = 0.75f;
                }
            }
        }
    }
}