package com.example.chillmod.tab;

import com.example.chillmod.ChillMod;
import com.example.chillmod.Item.DeportesItem;
import com.example.chillmod.Item.PlantaMedicinalItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;



public class CustomTab {

    //CAJA LA REGISTRAMOS
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChillMod.MODID);

    //TAB
    public static final RegistryObject<CreativeModeTab> MY_CUSTOM_TAB = TABS.register("custom", () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("MY_CUSTOM_ITEMS"))
            // Set icon of creative tab
            .icon(() -> new ItemStack(PlantaMedicinalItem.MARIHUANA_ITEM.get()))
            // Add default items to tab
            .displayItems((params, output) -> {
                output.accept(DeportesItem.BALON_BALONCESTO_ITEM.get()); // Tu balón de baloncesto
                output.accept(PlantaMedicinalItem.MARIHUANA_ITEM.get()); // Tu planta medicinal
                output.accept(DeportesItem.BALON_FUTBOL_ITEM.get()); // Balon de futbol
                output.accept(DeportesItem.BALON_RUGBY_ITEM.get()); // Balon de Rygby
            })
            .build()
    );
}
