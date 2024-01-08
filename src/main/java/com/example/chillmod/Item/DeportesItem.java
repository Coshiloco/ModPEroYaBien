package com.example.chillmod.Item;

import com.example.chillmod.ChillMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DeportesItem {

    //CAJA
    public static final DeferredRegister<Item> DEPORTES_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChillMod.MODID);

    //ITEM
    public static final RegistryObject<Item> BALON_BALONCESTO_ITEM =
            DEPORTES_ITEMS.register("balonbaloncesto_item",
                    ()->new Item(new Item.Properties()));

    // ITEM
    public static final RegistryObject<Item> BALON_FUTBOL_ITEM =
            DEPORTES_ITEMS.register("balonfutbol_item",
                    ()->new Item(new Item.Properties()));

    // ITEM
    public static final RegistryObject<Item> BALON_RUGBY_ITEM =
            DEPORTES_ITEMS.register("balonrugby_item",
                    ()->new Item(new Item.Properties()));

}
