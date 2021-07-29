package com.denismasterherobrine.travellersboots.armor;

import com.denismasterherobrine.travellersboots.config.Config;
import com.denismasterherobrine.travellersboots.register.ItemRegistry;
import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BootsMaterial extends ArmorItem {
    public BootsMaterial(final ArmorMaterial material, final EquipmentSlot equipmentSlot, final Item.Properties properties) {
        super(material, equipmentSlot, properties);
    }

    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (player.getInventory().armor.get(0).getItem().equals(ItemRegistry.travellersbootsmki)) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 0));
        }
        if (player.getInventory().armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkii)) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 0));
            if (Config.isStepHeightEnabled.get()){
                player.maxUpStep = 1.0f;
            }
        }
        if (player.getInventory().armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkiii)) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 1));
            if (Config.isStepHeightEnabled.get()){
                player.maxUpStep = 1.0f;
            }
        }
        if (player.getInventory().armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkiv)) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 3));
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 1, 1));
            if (Config.isStepHeightEnabled.get()){
                player.maxUpStep = 1.0f;
            }
        }

        if (player.getInventory().armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkv)) {
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 3));
            player.addEffect(new MobEffectInstance(MobEffects.JUMP, 1, 1));
            if (Config.isStepHeightEnabled.get()){
                player.maxUpStep = 1.0f;
            }
        }
    }

    public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected) {
        if (entity instanceof Player) {
            Player livingEntity = (Player) entity;
            if (!(livingEntity.getInventory().armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkii))) {
                if (Config.isStepHeightEnabled.get()){
                    livingEntity.maxUpStep = 0.75f;
                }
            }
            if (!(livingEntity.getInventory().armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkiii))) {
                if (Config.isStepHeightEnabled.get()){
                    livingEntity.maxUpStep = 0.75f;
                }
            }
            if (!(livingEntity.getInventory().armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkiv))) {
                if (Config.isStepHeightEnabled.get()){
                    livingEntity.maxUpStep = 0.75f;
                }
            }
            if (!(livingEntity.getInventory().armor.get(0).getItem().equals(ItemRegistry.travellersbootsmkv))) {
                if (Config.isStepHeightEnabled.get()){
                    livingEntity.maxUpStep = 0.75f;
                }
            }
        }
    }
}