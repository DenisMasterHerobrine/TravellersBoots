package com.denismasterherobrine.travellersboots;

import com.denismasterherobrine.travellersboots.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TravellersBoots.MODID, name = TravellersBoots.NAME, version = TravellersBoots.VERSION)
public class TravellersBoots
{
    public static final String MODID = "travellersboots";
    public static final String NAME = "Traveller's Boots";
    public static final String VERSION = "1.0.1";

    @SidedProxy(clientSide = "com.denismasterherobrine.travellersboots.proxy.ClientProxy", serverSide = "com.denismasterherobrine.travellersboots.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
