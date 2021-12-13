package com.matyrobbrt.extranetherite.init.material;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public class ENToolTiers implements IItemTier {

	private final int level;
	private final int uses;
	private final float speed;
	private final float damage;
	private final int enchantmentValue;
	private final LazyValue<Ingredient> repairIngredient;

	public ENToolTiers(int level, int durability, float speed, float damage, int enchantmentValue,
			Supplier<Ingredient> repairIngredient) {
		this.level = level;
		this.uses = durability;
		this.speed = speed;
		this.damage = damage;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = new LazyValue<>(repairIngredient);
	}

	@Override
	public int getUses() { return uses; }

	@Override
	public float getSpeed() { return speed; }

	@Override
	public float getAttackDamageBonus() { return damage; }

	@Override
	public int getLevel() { return level; }

	@Override
	public int getEnchantmentValue() { return enchantmentValue; }

	@Override
	public Ingredient getRepairIngredient() { return this.repairIngredient.get(); }

}
