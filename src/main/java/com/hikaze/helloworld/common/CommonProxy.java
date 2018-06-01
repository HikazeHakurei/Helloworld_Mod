package com.hikaze.helloworld.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.hikaze.helloworld.items.*;
public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	new ItemLoader(event);
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}