package com.example.chillmod.Item;

import com.example.chillmod.ChillMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PlantaMedicinalItem {

    //CAJA
    public static final DeferredRegister<Item> PLANTAS_ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChillMod.MODID);

    //ITEM
    public static final RegistryObject<Item> MARIHUANA_ITEM =
            PLANTAS_ITEM.register("marihuana_item",
                    ()->new Item(new Item.Properties()));
}
