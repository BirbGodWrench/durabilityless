package net.wren.durabilityless.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.wren.durabilityless.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SoulReaperScythe)
                .pattern("III")
                .pattern("N S")
                .pattern("  S")
                .input('N', Items.NETHER_STAR)
                .input('I', Items.NETHERITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.NETHER_STAR),
                        conditionsFromItem(Items.NETHER_STAR))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SoulReaperScythe)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.Kunai)
                .pattern("LQL")
                .pattern("LIL")
                .pattern("LSL")
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .input('L', Items.LAPIS_LAZULI)
                .input('Q', Items.QUARTZ)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.Kunai)));
    }
}
