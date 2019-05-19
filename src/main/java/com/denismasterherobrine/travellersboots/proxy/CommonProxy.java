package com.denismasterherobrine.travellersboots.proxy;

import com.denismasterherobrine.travellersboots.misc.ItemRegistry;
import com.denismasterherobrine.travellersboots.misc.RecipeRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        ItemRegistry.register();
    }

    public void init(FMLInitializationEvent event)
    {
        RecipeRegistry.recipesRegister();
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}