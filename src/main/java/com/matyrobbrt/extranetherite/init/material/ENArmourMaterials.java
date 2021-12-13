package com.matyrobbrt.extranetherite.init.material;

import java.util.function.Supplier;

import com.matyrobbrt.extranetherite.ExtraNetherite;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class ENArmourMaterials implements IArmorMaterial {

	public static final ENArmourMaterials ENDERTITE = new ENArmourMaterials("endertite", new int[] {
			120, 120, 120, 120
	}, new int[] {
			1, 1, 1, 1
	}, 12, SoundEvents.ARMOR_EQUIP_IRON, 12, 12, () -> Ingredient.of(Items.IRON_INGOT));

	private final String name;
	private final int[] durability;
	private int[] armorVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyValue<Ingredient> repairIngredient;

	private ENArmourMaterials(String name, int[] durability, int[] armorVal, int enchantability, SoundEvent equipSound,
			float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = ExtraNetherite.resourceLocation(name).toString();
		this.durability = durability;
		this.armorVal = armorVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = new LazyValue<>(repairIngredient);
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType slot) {
		return this.durability[slot.getIndex()];
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slot) {
		return this.armorVal[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() { return this.enchantability; }

	@Override
	public SoundEvent getEquipSound() { return this.equipSound; }

	@Override
	public Ingredient getRepairIngredient() { return this.repairIngredient.get(); }

	@Override
	public String getName() { return this.name; }

	@Override
	public float getToughness() { return this.toughness; }

	@Override
	public float getKnockbackResistance() { return this.knockbackResistance; }

}
