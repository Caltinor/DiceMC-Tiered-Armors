package com.dicemc.tieredarmor.armor;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;

public class GildedDiamondArmorMaterial implements ArmorMaterial {
	private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
	private static final int[] DAMAGE_REDUCTION = new int[]{3, 6, 8, 3};

	@Override
	public int getDurabilityForSlot(EquipmentSlot slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * 33;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slotIn) {
		return DAMAGE_REDUCTION[slotIn.getIndex()];
	}

	@Override
	public int getEnchantmentValue() { return 25; }

	@Override
	public SoundEvent getEquipSound() { return SoundEvents.ARMOR_EQUIP_DIAMOND; }

	@Override
	public Ingredient getRepairIngredient() { return Ingredient.of(Items.DIAMOND); }

	@Override
	public String getName() { return "dicemcta:gilded_diamond"; }

	@Override
	public float getToughness() { return 2f; }

	@Override
	public float getKnockbackResistance() { return 0f; }

}
