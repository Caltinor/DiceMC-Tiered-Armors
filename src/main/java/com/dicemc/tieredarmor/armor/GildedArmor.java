package com.dicemc.tieredarmor.armor;

import javax.annotation.Nonnull;

import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class GildedArmor extends ArmorItem{

	public GildedArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties p_i48534_3_) {
		super(materialIn, slot, p_i48534_3_);
		
	}
	
	@Override
	public boolean makesPiglinsNeutral(@Nonnull ItemStack stack, @Nonnull LivingEntity wearer) {
		return true;
	}
}
