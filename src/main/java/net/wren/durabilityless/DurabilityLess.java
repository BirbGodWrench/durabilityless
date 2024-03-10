package net.wren.durabilityless;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroups;
import net.wren.durabilityless.enchantment.ModEnchantments;
import net.wren.durabilityless.item.ModItems;
import net.wren.durabilityless.potioneffects.ModPotionEffects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DurabilityLess implements ModInitializer {

	public static final String MOD_ID = "durabilityless";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Hello");
		ModPotionEffects.RegisterStatusEffects();
		ModEnchantments.RegisterEnchants();
		ModItems.RegisterModItems();
		ModItems.addItemsToVanillaTab(ItemGroups.COMBAT, ModItems.Kunai);
		ModItems.addItemsToVanillaTab(ItemGroups.COMBAT, ModItems.SoulReaperScythe);
	}
}