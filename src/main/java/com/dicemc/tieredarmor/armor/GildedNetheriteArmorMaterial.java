package com.dicemc.tieredarmor.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class GildedNetheriteArmorMaterial implements IArmorMaterial {
	private static final int[] MAX_DAMAGE_ARRAY = new int[]{3, 6, 8, 3};

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * 37;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() { return 25; }

	@Override
	public SoundEvent getSoundEvent() { return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE; }

	@Override
	public Ingredient getRepairMaterial() { return Ingredient.fromItems(Items.NETHERITE_INGOT); }

	@Override
	public String getName() { return "dicemcta:gilded_netherite"; }

	@Override
	public float getToughness() { return 3f; }

	@Override
	public float getKnockbackResistance()  { return 0.1f; }
}
