package com.hikaze.helloworld.items;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
public class ItemLoader {
	public static Item helloworldItem = new itemHelloworldItem();
	public ItemLoader(FMLPreInitializationEvent event) {
		registerItems(null);
	}
	@SubscribeEvent
    private static void registerItems(RegistryEvent.Register<Item> event)
    {
    	event.getRegistry().register(helloworldItem);
    }
}
