
// Food definitions

package com.ben10.rachel;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class Foods {

    // cookie dough that gives you powers but makes you nauseous
    public static final FoodComponent COOKIE_DOUGH = (new FoodComponent.Builder()).hunger(20).saturationModifier(2)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 600, 0), 1F)
            .snack().build();

    // chicken noodle soup is the same but without nausea
    public static final FoodComponent SOUP = (new FoodComponent.Builder()).hunger(20).saturationModifier(3)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 0), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 600, 0), 1F)
            .snack().build();
}