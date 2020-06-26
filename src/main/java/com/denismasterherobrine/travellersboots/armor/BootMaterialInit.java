package com.denismasterherobrine.travellersboots.armor;

import com.denismasterherobrine.travellersboots.TravellersBoots;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import javax.annotation.ParametersAreNonnullByDefault;

public enum BootMaterialInit implements IArmorMaterial {
    travellersbootsmki("travellersbootsmki", 50, new int[] {1, 0, 0, 0}, 25, "item.armor.equip_leather", 0.0f, Items.LEATHER),
    travellersbootsmkii("travellersbootsmkii", 100, new int[] {2, 0, 0, 0}, 25, "item.armor.equip_leather", 0.0f, Items.GOLD_INGOT),
    travellersbootsmkiii("travellersbootsmkiii", 150, new int[] {4, 0, 0, 0}, 25, "item.armor.equip_leather", 0.0f, Items.DIAMOND),
    travellersbootsmkiv("travellersbootsmkiv", 300, new int[] {6, 0, 0, 0}, 25, "item.armor.equip_leather", 0.0f, Items.EMERALD);
    private String name, equipSound;
    private int durability, enchantability;
    private final int[] damageReductionAmountArray;
    private float toughness;
    private Item repairMaterial;
    BootMaterialInit(String name, int durability, int[] p_i48533_5_, int enchantability, String equipSound, float toughness, Item repairMaterial) {
        this.name = name;
        this.equipSound = equipSound;
        this.durability = durability;
        this.enchantability = enchantability;
        this.damageReductionAmountArray = p_i48533_5_;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }
    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }
    @ParametersAreNonnullByDefault
    @Override
    public int getDurability(EquipmentSlotType arg0) {
        return this.durability;
    }
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }
    @Override
    public String getName() {
        return TravellersBoots.MODID+":"+this.name;
    }
    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(repairMaterial);
    }
    @Override
    public SoundEvent getSoundEvent() {
        return new SoundEvent(new ResourceLocation(equipSound));
    }
    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return 0; // Wait, what's this?
    }
}
