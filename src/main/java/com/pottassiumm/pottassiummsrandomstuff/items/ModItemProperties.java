package com.pottassiumm.pottassiummsrandomstuff.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModItemProperties{
    public static final FoodProperties GOLDEN_POTATO = new FoodProperties.Builder().alwaysEdible()
            .effect(()-> new MobEffectInstance(MobEffects.DIG_SPEED, 600,0), 1.0f)
            .effect(()-> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600,0), 1.0f).build();
    public static final FoodProperties COOKED_GOLDEN_POTATO = new FoodProperties.Builder().alwaysEdible()
            .effect(()-> new MobEffectInstance(MobEffects.DIG_SPEED, 600,1), 1.0f)
            .effect(()-> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600,1), 1.0f).build();
}
