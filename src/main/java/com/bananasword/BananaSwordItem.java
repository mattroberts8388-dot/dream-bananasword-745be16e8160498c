package com.bananasword;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.MathHelper;

public class BananaSwordItem extends SwordItem {
    // Extra damage applied on top of normal attack so villagers take a total of 10.
    private static final float VILLAGER_TOTAL_DAMAGE = 10.0f;

    public BananaSwordItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(net.minecraft.item.ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.postHit(stack, target, attacker);

        if (target instanceof MerchantEntity && !target.getWorld().isClient()) {
            float currentHealth = target.getHealth();
            // Deal enough bonus damage so the total hit equals 10 against villagers/merchants.
            float alreadyDealt = MathHelper.clamp(target.getMaxHealth() - currentHealth, 0.0f, VILLAGER_TOTAL_DAMAGE);
            float bonus = VILLAGER_TOTAL_DAMAGE - alreadyDealt;
            if (bonus > 0.0f) {
                target.damage(target.getDamageSources().mobAttack(attacker), bonus);
            }
        }

        return result;
    }
}