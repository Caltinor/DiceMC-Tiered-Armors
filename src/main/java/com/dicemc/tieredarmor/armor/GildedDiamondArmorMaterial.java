package com.dicemc.tieredarmor.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class GildedDiamondArmorMaterial implements IArmorMaterial {
	private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
	private static final int[] DAMAGE_REDUCTION = new int[]{3, 6, 8, 3};

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * 33;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return DAMAGE_REDUCTION[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() { return 25; }

	@Override
	public SoundEvent getSoundEvent() { return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND; }

	@Override
	public Ingredient getRepairMaterial() { return Ingredient.fromItems(Items.DIAMOND); }

	@Override
	public String getName() { return "dicemcta:gilded_diamond"; }

	@Override
	public float getToughness() { return 2f; }

	@Override
	public float getKnockbackResistance() { return 0f; }

}
