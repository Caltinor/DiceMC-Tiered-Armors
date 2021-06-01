package com.dicemc.tieredarmor.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class WoodArmorMaterial  implements IArmorMaterial{
	private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
	private static final int[] DAMAGE_REDUCTION = new int[]{1, 2, 3, 1};

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * 3;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return DAMAGE_REDUCTION[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() { return 5; }

	@Override
	public SoundEvent getSoundEvent() { return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC; }

	@Override
	public Ingredient getRepairMaterial() { return Ingredient.fromTag(ItemTags.PLANKS); }

	@Override
	public String getName() { return "dicemcta:wood"; }

	@Override
	public float getToughness() { return 1f; }

	@Override
	public float getKnockbackResistance() { return 0f; }
}
