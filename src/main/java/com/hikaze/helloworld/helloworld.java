package com.hikaze.helloworld;
import com.hikaze.helloworld.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = helloworld.MODID, name = helloworld.NAME, version = helloworld.VERSION, acceptedMinecraftVersions = "1.12.2")
public class helloworld {
    public static final String MODID = "helloworld";
    public static final String NAME = "Helloworld Mod";
    public static final String VERSION = "0.0";
    @SidedProxy(clientSide = "com.hikaze.helloworld.client.ClientProxy", 
            serverSide = "com.hikaze.helloworld.common.CommonProxy")
    public static CommonProxy proxy;
    @Instance(helloworld.MODID)
    public static helloworld instance;

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
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}
