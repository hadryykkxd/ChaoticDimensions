package com.hadrykkxd.chmd.item;

import com.hadrykkxd.chmd.ChaoticDimensions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChaoticDimensions.MOD_ID);

    public static final RegistryObject<Item> CHAOS_CRYSTAL = ITEMS.register("chaos_crystal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLASS_STICK = ITEMS.register("glass_stick", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LITTLE_HEART = ITEMS.register("little_heart", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
