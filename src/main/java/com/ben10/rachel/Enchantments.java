
// Enchantment definitions

package com.ben10.rachel;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.world.World;

public class Enchantments extends Enchantment {

    protected Enchantments(Rarity weight, EnchantmentTarget target, EquipmentSlot[] slotTypes) {
        super(weight, target, slotTypes);
    }

    // explosive arrows
    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
            World world = user.world;
            TntEntity tntEntity = EntityType.TNT.create(world);
            tntEntity.setFuse(0);
            tntEntity.setPosition(target.getX(), target.getY(), target.getZ());
            world.spawnEntity(tntEntity);
    }
}