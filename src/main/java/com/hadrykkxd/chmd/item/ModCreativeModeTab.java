package com.hadrykkxd.chmd.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModeTab {  
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = 
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "chmd");

    public static final RegistryObject<CreativeModeTab> CHMD_TAB = CREATIVE_MOD_TABS.register("chmd_items_tab", 
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLASS_STICK.get()))
    .title(Component.translatable("creativetab.chmd.chmd_items"))
    .displayItems((itemDisplayParameters, output) -> {
        
        output.accept(ModItems.LITTLE_HEART.get());
        output.accept(ModItems.CHAOS_CRYSTAL.get());
        output.accept(ModItems.GLASS_STICK.get());
        
    }).build());

    public static void register(IEventBus eventBus) { CREATIVE_MOD_TABS.register(eventBus); }
}
