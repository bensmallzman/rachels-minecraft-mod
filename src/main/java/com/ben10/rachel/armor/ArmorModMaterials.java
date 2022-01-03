
// interface for pink_bow

package com.ben10.rachel.armor;

import com.ben10.rachel.Groups;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ArmorModMaterials implements ArmorMaterial {

    PINK_BOW( "pink_bow", 15, new int[] {1, 4, 5, 2}, 10, SoundEvents.BLOCK_SAND_STEP,
            1.0F, () -> {return Ingredient.ofItems(Groups.HEART);});

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Lazy<Ingredient> repairIngredientSupplier;

    ArmorModMaterials(String string1, int int1, int[] ints1, int int2,
                             SoundEvent soundEvent1, float float1, Supplier<Ingredient> supplier1) {
        this.name = string1;
        this.durabilityMultiplier = int1;
        this.protectionAmounts = ints1;
        this.enchantability = int2;
        this.equipSound = soundEvent1;
        this.toughness = float1;
        this.repairIngredientSupplier = new Lazy(supplier1);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
