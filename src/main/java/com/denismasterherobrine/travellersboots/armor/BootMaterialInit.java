package com.denismasterherobrine.travellersboots.armor;

import com.denismasterherobrine.travellersboots.TravellersBoots;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum BootMaterialInit implements ArmorMaterial {
    travellersbootsmki("travellersbootsmki", 50, new int[] {1, 0, 0, 0}, 4, 0, "item.armor.equip_leather", 0.0f, Items.LEATHER),
    travellersbootsmkii("travellersbootsmkii", 100, new int[] {2, 0, 0, 0}, 8, 0, "item.armor.equip_leather", 0.0f, Items.GOLD_INGOT),
    travellersbootsmkiii("travellersbootsmkiii", 150, new int[] {4, 0, 0, 0}, 12, 0.005f, "item.armor.equip_leather", 0.0f, Items.DIAMOND),
    travellersbootsmkiv("travellersbootsmkiv", 300, new int[] {6, 0, 0, 0}, 16, 0.05f, "item.armor.equip_leather", 0.1f, Items.EMERALD),
    travellersbootsmkv("travellersbootsmkv", 450, new int[] {8, 0, 0, 0}, 20, 0.1f, "item.armor.equip_leather", 0.25f, Items.NETHERITE_INGOT);

    private String name, equipSound;
    private int durability, enchantability;
    private final int[] damageReductionAmountArray;
    private float toughness;
    private Item repairMaterial;
    private final float knockbackResistance;

    BootMaterialInit(String name, int durability, int[] p_i48533_5_, int enchantability, float knockbackResistance, String equipSound, float toughness, Item repairMaterial) {
        this.name = name;
        this.equipSound = equipSound;
        this.durability = durability;
        this.enchantability = enchantability;
        this.damageReductionAmountArray = p_i48533_5_;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot p_200896_1_) {
        return this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot p_200902_1_) {
        return this.damageReductionAmountArray[p_200902_1_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return new SoundEvent(new ResourceLocation(equipSound));
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(repairMaterial);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return TravellersBoots.MODID+":"+this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
