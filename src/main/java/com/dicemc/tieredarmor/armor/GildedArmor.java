package com.dicemc.tieredarmor.armor;

import javax.annotation.Nonnull;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class GildedArmor extends ArmorItem{

	public GildedArmor(ArmorMaterial materialIn, EquipmentSlot slot, Properties p_i48534_3_) {
		super(materialIn, slot, p_i48534_3_);		
	}
	
	@Override
	public boolean makesPiglinsNeutral(@Nonnull ItemStack stack, @Nonnull LivingEntity wearer) {
		return true;
	}
}
