package net.wren.durabilityless.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKey;
import net.wren.durabilityless.DurabilityLess;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wren.durabilityless.item.custom.KunaiItem;
import net.wren.durabilityless.item.custom.SoulScytheItem;

public class ModItems {
    public static final Item SoulReaperScythe = RegisterItem(
            "soulreapersythe", new SoulScytheItem(
                    ToolMaterials.NETHERITE,3,-2.25f,
                    new FabricItemSettings()));
    public static final Item Kunai = RegisterItem(
            "kunai", new KunaiItem(
                    ToolMaterials.IRON,1,-2f,
                    new FabricItemSettings()));


    public static void addItemsToVanillaTab(RegistryKey<ItemGroup> group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> content.add(item));
    }


    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DurabilityLess.MOD_ID, name), item);
    }
    public static void RegisterModItems() {
        DurabilityLess.LOGGER.info("Registering Mod Items For DurabilityLess");
    }
}