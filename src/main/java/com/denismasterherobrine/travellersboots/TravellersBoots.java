package com.denismasterherobrine.travellersboots;

import com.denismasterherobrine.travellersboots.armor.BootMaterialInit;
import com.denismasterherobrine.travellersboots.armor.BootsMaterial;
import com.denismasterherobrine.travellersboots.config.Config;
import com.denismasterherobrine.travellersboots.proxy.ClientProxy;
import com.denismasterherobrine.travellersboots.proxy.IProxy;
import com.denismasterherobrine.travellersboots.proxy.ServerProxy;
import com.denismasterherobrine.travellersboots.register.ItemRegistry;
import com.denismasterherobrine.travellersboots.tokens.FireResistanceToken;
import com.denismasterherobrine.travellersboots.tokens.NetheriteJumpBoostControllerToken;
import com.denismasterherobrine.travellersboots.tokens.NetheriteSpeedControllerToken;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("travellersboots")
public class TravellersBoots
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "travellersboots";
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    public TravellersBoots() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        Config.loadConfig(Config.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("travellersboots-common.toml"));
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void RegisterItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                    ItemRegistry.travellersbootsmki = new BootsMaterial(BootMaterialInit.travellersbootsmki, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)).setRegistryName(location("travellersbootmki")),
                    ItemRegistry.travellersbootsmkii = new BootsMaterial(BootMaterialInit.travellersbootsmkii, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)).setRegistryName(location("travellersbootmkii")),
                    ItemRegistry.travellersbootsmkiii = new BootsMaterial(BootMaterialInit.travellersbootsmkiii, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)).setRegistryName(location("travellersbootmkiii")),
                    ItemRegistry.travellersbootsmkiv = new BootsMaterial(BootMaterialInit.travellersbootsmkiv, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)).setRegistryName(location("travellersbootmkiv")),
                    ItemRegistry.travellersbootsmkv = new BootsMaterial(BootMaterialInit.travellersbootsmkv, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT)).setRegistryName(location("travellersbootmkv")),

                    ItemRegistry.fireresistancetoken = new FireResistanceToken().setRegistryName(location("fireresistancetoken")),
                    ItemRegistry.jumpboosteffectcontrollertoken = new NetheriteJumpBoostControllerToken().setRegistryName(location("jumpboosteffectcontrollertoken")),
                    ItemRegistry.speedeffectcontrollertoken = new NetheriteSpeedControllerToken().setRegistryName(location("speedeffectcontrollertoken")));

            LOGGER.info("Successfully completed boots registry with tokens!");
        }
    private static ResourceLocation location(String name)
    {
        return new ResourceLocation(MODID, name);
    }
    }
}
