/*
    Main

    "heart" = pink heart
    "sword" = strong sword with GOT Longclaw template
    "our_block" = pink, luminescent, metal building block that drops my hearts
    "cookie_dough" = food item that gets you high and gives you powers
    "pink_bow" = pink helmet that looks like a bow
    "music_box" = luminescent jukebox that plays Everybody Loves Somebody
    "group" = creative tab for above items
    "soup" = chicken noodle soup that must be crafted
    "soup_group" = creative tab with soup materials
    "explosive_arrows" = enchantment that can only be applied to bows

    credit to YouTube channels: TechnoVision, Suited Llama, TotallyGamerJet,
    Draylar, Mathew Lefebvre
 */

package com.ben10.rachel;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mods implements ModInitializer {

    public static final String MOD_ID = "rachel";

    // create ITEM_GROUP with .build() because don't need vanilla items or order
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "group"),
            () -> new ItemStack(Groups.HEART));

    // create SOUP_GROUP with .create() to use vanilla items and order it in shape of recipe
    public static final ItemGroup SOUP_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "soup_group"))
            .icon(() -> new ItemStack(Items.BOWL))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.CRAFTING_TABLE));
                for (int i = 0; i < 12; i++) {
                    stacks.add(ItemStack.EMPTY);
                }
                stacks.add(new ItemStack(Items.COOKED_CHICKEN));
                for (int i = 0; i < 7; i++) {
                    stacks.add(ItemStack.EMPTY);
                }
                stacks.add(new ItemStack(Items.CARROT));
                stacks.add(new ItemStack(Groups.HEART));
                stacks.add(new ItemStack(Items.POTATO));      
                for (int i = 0; i < 7; i++) {
                    stacks.add(ItemStack.EMPTY);
                }
                stacks.add(new ItemStack(Items.BOWL));
            })
            .build();

    // retrieve object properties
    @Override
    public void onInitialize() {
        // miscellaneous
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "heart"), Groups.HEART);

        // weapons and armor
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sword"),
                new SwordBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pink_bow"), Groups.PINK_BOW);

        // blocks
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "our_block"), Groups.BEN_RACHEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "our_block"), Groups.OUR_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "music_block"), Groups.MUSIC_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "music_block"),
                new BlockItem(Groups.MUSIC_BLOCK, new Item.Settings().group(ITEM_GROUP)));

        // food
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cookie_dough"), Groups.COOKIE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soup"), Groups.SOUP);

        // enchantments
        Registry.register(Registry.ENCHANTMENT, new Identifier(MOD_ID, "explosive_arrows"), Groups.EXPLOSIVE_ARROWS);

        // sounds
        Registry.register(Registry.SOUND_EVENT, Groups.MY_SOUND_ID, Groups.MY_SOUND_EVENT);

    }
}