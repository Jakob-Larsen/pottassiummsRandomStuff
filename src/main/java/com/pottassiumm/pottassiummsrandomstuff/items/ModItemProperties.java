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

    public static final FoodProperties GOLDEN_BEETROOT = new FoodProperties.Builder()
            .effect(()-> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 1200,0),1f).build();

    public static final FoodProperties GOLDEN_BREAD = new FoodProperties.Builder().
            effect(()-> new MobEffectInstance(MobEffects.SATURATION, 2400, 2),1f).build();

    public static final FoodProperties GOLDEN_GLOW_BERRIES = new FoodProperties.Builder()
            .effect(()-> new MobEffectInstance(MobEffects.GLOWING, 2400, 254),1f).build();

    public static final FoodProperties GOLDEN_SWEET_BERRIES = new FoodProperties.Builder()
            .effect(()-> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 1),1f).build();
}
