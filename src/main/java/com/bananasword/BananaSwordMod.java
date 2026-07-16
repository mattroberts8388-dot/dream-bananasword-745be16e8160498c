package com.bananasword;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BananaSwordMod implements ModInitializer {
    public static final String MOD_ID = "bananasword";

    public static final BananaSwordItem BANANA_SWORD = new BananaSwordItem(
            ToolMaterials.IRON, 3, -2.4f, new Item.Settings().maxCount(1));

    public static final RegistryKey<ItemGroup> ITEM_GROUP_KEY =
            RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "general"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "banana_sword"), BANANA_SWORD);

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP_KEY,
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(BANANA_SWORD))
                        .displayName(Text.translatable("itemGroup.bananasword.general"))
                        .build());

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP_KEY).register(entries -> {
            entries.add(BANANA_SWORD);
        });
    }
}