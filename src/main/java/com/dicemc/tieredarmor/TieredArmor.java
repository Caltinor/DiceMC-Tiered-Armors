package com.dicemc.tieredarmor;

import com.dicemc.tieredarmor.armor.GildedArmor;
import com.dicemc.tieredarmor.armor.GildedDiamondArmorMaterial;
import com.dicemc.tieredarmor.armor.GildedNetheriteArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(TieredArmor.MOD_ID)
public class TieredArmor {
	public static final String MOD_ID = "dicemcta";
	
	public TieredArmor() {
		MinecraftForge.EVENT_BUS.register(this);
		Regisration.init();
	}
	
	public static class Regisration {
		public static final GildedDiamondArmorMaterial GILDED_DIAMOND_ARMOR_MATERIAL = new GildedDiamondArmorMaterial();
		public static final GildedNetheriteArmorMaterial GILDED_NETHERITE_ARMOR_MATERIAL= new GildedNetheriteArmorMaterial();
		
		public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TieredArmor.MOD_ID);
		
		public static void init() {
			ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		}
		
		public static final RegistryObject<Item> GILDED_DIAMOND_HELMET = ITEMS.register("gilded_diamond_helmet", () -> new GildedArmor(GILDED_DIAMOND_ARMOR_MATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
	    public static final RegistryObject<Item> GILDED_DIAMOND_CHESTPLATE = ITEMS.register("gilded_diamond_chestplate", () -> new GildedArmor(GILDED_DIAMOND_ARMOR_MATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	    public static final RegistryObject<Item> GILDED_DIAMOND_LEGGINGS = ITEMS.register("gilded_diamond_leggings", () -> new GildedArmor(GILDED_DIAMOND_ARMOR_MATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	    public static final RegistryObject<Item> GILDED_DIAMOND_BOOTS = ITEMS.register("gilded_diamond_boots", () -> new GildedArmor(GILDED_DIAMOND_ARMOR_MATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
	    
	    public static final RegistryObject<Item> GILDED_NETHERITE_HELMET = ITEMS.register("gilded_netherite_helmet", () -> new GildedArmor(GILDED_NETHERITE_ARMOR_MATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
	    public static final RegistryObject<Item> GILDED_NETHERITE_CHESTPLATE = ITEMS.register("gilded_netherite_chestplate", () -> new GildedArmor(GILDED_NETHERITE_ARMOR_MATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	    public static final RegistryObject<Item> GILDED_NETHERITE_LEGGINGS = ITEMS.register("gilded_netherite_leggings", () -> new GildedArmor(GILDED_NETHERITE_ARMOR_MATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	    public static final RegistryObject<Item> GILDED_NETHERITE_BOOTS = ITEMS.register("gilded_netherite_boots", () -> new GildedArmor(GILDED_NETHERITE_ARMOR_MATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
	}
}
