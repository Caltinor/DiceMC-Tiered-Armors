package com.dicemc.tieredarmor;

import com.dicemc.tieredarmor.armor.GildedArmor;
import com.dicemc.tieredarmor.armor.GildedDiamondArmorMaterial;
import com.dicemc.tieredarmor.armor.GildedNetheriteArmorMaterial;
import com.dicemc.tieredarmor.armor.WoodArmorMaterial;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(TieredArmor.MOD_ID)
public class TieredArmor {
	public static final String MOD_ID = "dicemcta";
	
	public TieredArmor() {
		MinecraftForge.EVENT_BUS.register(this);
		Registration.init();
	}
	
	public static class Registration {
		public static final GildedDiamondArmorMaterial GILDED_DIAMOND_ARMOR_MATERIAL = new GildedDiamondArmorMaterial();
		public static final GildedNetheriteArmorMaterial GILDED_NETHERITE_ARMOR_MATERIAL= new GildedNetheriteArmorMaterial();
		public static final WoodArmorMaterial WOOD_ARMOR_MATERIAL = new WoodArmorMaterial();
		
		public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TieredArmor.MOD_ID);
		
		public static void init() {
			ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		
		public static final RegistryObject<Item> GILDED_DIAMOND_HELMET = ITEMS.register("gilded_diamond_helmet", () -> new GildedArmor(GILDED_DIAMOND_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    public static final RegistryObject<Item> GILDED_DIAMOND_CHESTPLATE = ITEMS.register("gilded_diamond_chestplate", () -> new GildedArmor(GILDED_DIAMOND_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    public static final RegistryObject<Item> GILDED_DIAMOND_LEGGINGS = ITEMS.register("gilded_diamond_leggings", () -> new GildedArmor(GILDED_DIAMOND_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    public static final RegistryObject<Item> GILDED_DIAMOND_BOOTS = ITEMS.register("gilded_diamond_boots", () -> new GildedArmor(GILDED_DIAMOND_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    
	    public static final RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet", () -> new GildedArmor(GILDED_NETHERITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    public static final RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate", () -> new GildedArmor(GILDED_NETHERITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    public static final RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings", () -> new GildedArmor(GILDED_NETHERITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    public static final RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots", () -> new GildedArmor(GILDED_NETHERITE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    
	    public static final RegistryObject<Item> WOOD_HELMET = ITEMS.register("wood_helmet", () -> new ArmorItem(WOOD_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    public static final RegistryObject<Item> WOOD_CHESTPLATE = ITEMS.register("wood_chestplate", () -> new ArmorItem(WOOD_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    public static final RegistryObject<Item> WOOD_LEGGINGS = ITEMS.register("wood_leggings", () -> new ArmorItem(WOOD_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	    public static final RegistryObject<Item> WOOD_BOOTS = ITEMS.register("wood_boots", () -> new ArmorItem(WOOD_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
	}
}
