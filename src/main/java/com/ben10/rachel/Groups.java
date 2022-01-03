
// Item declarations

package com.ben10.rachel;

import com.ben10.rachel.armor.ArmorModMaterials;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static com.ben10.rachel.Mods.ITEM_GROUP;

public class Groups {

    // miscellaneous
    public static final Item HEART = new Item(new Item.Settings().group(ITEM_GROUP));

    // weapons and armor
    public static final Item SWORD = new Item(new Item.Settings().group(ITEM_GROUP));
    public static final Item PINK_BOW = new ArmorItem(ArmorModMaterials.PINK_BOW, EquipmentSlot.HEAD,
            new Item.Settings().group(ITEM_GROUP));

    // blocks
    public static final Block BEN_RACHEL = new Block(FabricBlockSettings.of(Material.METAL)
            .strength(6f, 50f).sounds(BlockSoundGroup.METAL).luminance(30));
    public static final BlockItem OUR_BLOCK = new BlockItem(BEN_RACHEL, new Item.Settings()
            .group(ITEM_GROUP));
    public static final Music MUSIC_BLOCK = new Music(FabricBlockSettings.of(Material.WOOD).luminance(30));

    // food
    public static final Item COOKIE_DOUGH = new Item(new Item.Settings().group(ITEM_GROUP)
            .food(Foods.COOKIE_DOUGH));
    public static final Item SOUP = new Item(new Item.Settings().food(Foods.SOUP));

    // enchantments
    public static final Enchantment EXPLOSIVE_ARROWS = new Enchantments(
            Enchantment.Rarity.VERY_RARE,
            EnchantmentTarget.BOW,
            new EquipmentSlot[] {
                    EquipmentSlot.MAINHAND
            }
    );

    // sounds
    public static final Identifier MY_SOUND_ID = new Identifier(Mods.MOD_ID, "my_sound");
    public static SoundEvent MY_SOUND_EVENT = new SoundEvent(MY_SOUND_ID);
}
