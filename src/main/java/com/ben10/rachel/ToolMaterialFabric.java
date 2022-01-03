
// Material for my tools

package com.ben10.rachel;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialFabric implements ToolMaterial {

    // vanilla durability
    public int getDurability() {
        return 500;
    }

    // mining speed and level are same as diamond
    public float getMiningSpeedMultiplier() {
        return 8;
    }
    public int getMiningLevel() {
        return 3;
    }

    // damage is 1 point higher than netherite sword
    public float getAttackDamage() {
        return 9f;
    }

    // more enchantable than gold
    public int getEnchantability() {
        return 30;
    }

    // can only be repaired with my heart
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Groups.HEART);
    }
}