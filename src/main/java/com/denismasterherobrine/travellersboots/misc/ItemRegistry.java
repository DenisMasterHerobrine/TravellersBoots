package com.denismasterherobrine.travellersboots.misc;

import com.denismasterherobrine.travellersboots.items.armor.travellersboots;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.denismasterherobrine.travellersboots.items.armor.travellersboots.*;

public class ItemRegistry {
    public static Item travellersbootsmki = new travellersboots("bootsMKI", MKIMaterial, 1,EntityEquipmentSlot.FEET);
    public static Item travellersbootsmkii = new travellersboots("bootsMKII", MKIIMaterial, 1,EntityEquipmentSlot.FEET);
    public static Item travellersbootsmkiii = new travellersboots("bootsMKIII", MKIIIMaterial, 1,EntityEquipmentSlot.FEET);
    public static Item travellersbootsmkiv = new travellersboots("bootsMKIV", MKIVMaterial, 1,EntityEquipmentSlot.FEET);

    public static void register()
    {
        registerItems(travellersbootsmki);
        registerItems(travellersbootsmkii);
        registerItems(travellersbootsmkiii);
        registerItems(travellersbootsmkiv);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender()
    {
        registerItemsRender(travellersbootsmki);
        registerItemsRender(travellersbootsmkii);
        registerItemsRender(travellersbootsmkiii);
        registerItemsRender(travellersbootsmkiv);
    }

    private static void registerItems(Item item)
    {
        ForgeRegistries.ITEMS.register(item);
    }

    @SideOnly(Side.CLIENT)
    private static void registerItemsRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
