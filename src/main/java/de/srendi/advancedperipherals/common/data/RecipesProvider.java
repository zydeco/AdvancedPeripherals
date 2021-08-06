package de.srendi.advancedperipherals.common.data;

import dan200.computercraft.shared.Registry;
import de.srendi.advancedperipherals.common.setup.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class RecipesProvider extends RecipeProvider implements IConditionBuilder {

    private static final Block CASING = Blocks.PERIPHERAL_CASING.get();

    public RecipesProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(Blocks.AR_CONTROLLER.get())
                .define('E', Items.ENDER_PEARL)
                .define('C', CASING)
                .define('G', Items.SMOOTH_STONE)
                .pattern("GEG")
                .pattern("ECE")
                .pattern("GEG")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

        ShapedRecipeBuilder.shaped(de.srendi.advancedperipherals.common.setup.Items.AR_GOGGLES.get())
                .define('E', Items.ENDER_PEARL)
                .define('S', Items.STICK)
                .define('G', Items.BLACK_STAINED_GLASS)
                .pattern("GSG")
                .pattern(" E ")
                .unlockedBy("has_item", has(Items.STICK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.CHAT_BOX.get())
                .define('P', ItemTags.LOGS)
                .define('A', CASING)
                .define('g', Items.GOLD_INGOT)
                .pattern("PPP")
                .pattern("PAP")
                .pattern("PgP")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

        ShapedRecipeBuilder.shaped(de.srendi.advancedperipherals.common.setup.Items.CHUNK_CONTROLLER.get())
                .define('I', Items.IRON_INGOT)
                .define('R', Items.REDSTONE)
                .define('A', Items.RESPAWN_ANCHOR)
                .pattern("IRI")
                .pattern("RAR")
                .pattern("IRI")
                .unlockedBy("has_item", has(Items.RESPAWN_ANCHOR))
                .save(consumer);

        ShapedRecipeBuilder.shaped(de.srendi.advancedperipherals.common.setup.Items.COMPUTER_TOOL.get())
                .define('I', Items.IRON_INGOT)
                .define('B', Items.BLUE_TERRACOTTA)
                .pattern("I I")
                .pattern("IBI")
                .pattern(" B ")
                .unlockedBy("has_item", has(Items.BLUE_TERRACOTTA))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.ENERGY_DETECTOR.get())
                .define('B', Items.REDSTONE_BLOCK)
                .define('R', Items.REDSTONE_TORCH)
                .define('C', Items.COMPARATOR)
                .define('A', CASING)
                .define('G', Items.GOLD_INGOT)
                .pattern("BRB")
                .pattern("CAC")
                .pattern("BGB")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.ENVIRONMENT_DETECTOR.get())
                .define('W', ItemTags.WOOL)
                .define('S', ItemTags.SAPLINGS)
                .define('C', Tags.Items.CROPS)
                .define('A', CASING)
                .define('L', ItemTags.LEAVES)
                .pattern("WSW")
                .pattern("LAL")
                .pattern("WCW")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.INVENTORY_MANAGER.get())
                .define('I', Items.IRON_INGOT)
                .define('C', Tags.Items.CHESTS)
                .define('A', CASING)
                .pattern("ICI")
                .pattern("CAC")
                .pattern("ICI")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

//        ShapedRecipeBuilder.shaped(Blocks.ME_BRIDGE.get())
//                .define('F', Api.INSTANCE.definitions().blocks().fluixBlock().block())
//                .define('I', Api.INSTANCE.definitions().parts().iface().item())
//                .define('A', CASING)
//                .pattern("FIF")
//                .pattern("IAI")
//                .pattern("FIF")
//                .unlockedBy("has_item", has(CASING))
//                .save(consumer);

        ShapedRecipeBuilder.shaped(de.srendi.advancedperipherals.common.setup.Items.MEMORY_CARD.get())
                .define('I', Items.IRON_INGOT)
                .define('W', Items.WHITE_STAINED_GLASS)
                .define('O', Items.OBSERVER)
                .define('G', Items.GOLD_INGOT)
                .pattern("IWI")
                .pattern("IOI")
                .pattern(" G ")
                .unlockedBy("has_item", has(Items.OBSERVER))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.PERIPHERAL_CASING.get())
                .define('I', Items.IRON_INGOT)
                .define('i', Items.IRON_BARS)
                .define('R', Items.REDSTONE_BLOCK)
                .pattern("IiI")
                .pattern("iRi")
                .pattern("IiI")
                .unlockedBy("has_item", has(Items.REDSTONE_BLOCK))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.PLAYER_DETECTOR.get())
                .define('S', Items.SMOOTH_STONE)
                .define('A', CASING)
                .define('R', Items.REDSTONE_BLOCK)
                .pattern("SSS")
                .pattern("SAS")
                .pattern("SRS")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.REDSTONE_INTEGRATOR.get())
                .define('R', Items.REDSTONE_BLOCK)
                .define('A', CASING)
                .define('C', Items.COMPARATOR)
                .pattern("RCR")
                .pattern("CAC")
                .pattern("RCR")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

//        ShapedRecipeBuilder.shaped(Blocks.RS_BRIDGE.get())
//                .define('Q', RSItems.QUARTZ_ENRICHED_IRON.get())
//                .define('I', RSBlocks.INTERFACE.get())
//                .define('A', CASING)
//                .pattern("QIQ")
//                .pattern("IAI")
//                .pattern("QIQ")
//                .unlockedBy("has_item", has(CASING))
//                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.BLOCK_READER.get())
                .define('O', Items.OBSERVER)
                .define('I', Items.IRON_INGOT)
                .define('M', Registry.ModBlocks.WIRED_MODEM_FULL.get())
                .define('R', Items.REDSTONE_BLOCK)
                .define('A', CASING)
                .pattern("IRI")
                .pattern("MAO")
                .pattern("IRI")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.GEO_SCANNER.get())
                .define('O', Items.OBSERVER)
                .define('D', Items.DIAMOND)
                .define('C', CASING)
                .define('R', Items.REDSTONE_BLOCK)
                .define('M', Registry.ModBlocks.WIRED_MODEM_FULL.get())
                .pattern("DMD")
                .pattern("DCD")
                .pattern("ROR")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Blocks.NBT_STORAGE.get())
                .define('C', Items.CHEST)
                .define('A', CASING)
                .define('R', Items.REDSTONE_BLOCK)
                .define('I', Items.IRON_INGOT)
                .pattern("ICI")
                .pattern("CAC")
                .pattern("RCR")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

        ShapedRecipeBuilder.shaped(de.srendi.advancedperipherals.common.setup.Items.WEAK_AUTOMATA_CORE.get())
                .define('A', CASING)
                .define('R', Items.REDSTONE_BLOCK)
                .define('S', Items.SOUL_LANTERN)
                .define('D', Items.DIAMOND)
                .define('L', new NBTIngredient(PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.LONG_REGENERATION)))
                .pattern("RAR")
                .pattern("DSD")
                .pattern("RLR")
                .unlockedBy("has_item", has(CASING))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(de.srendi.advancedperipherals.common.setup.Items.OVERPOWERED_WEAK_AUTOMATA_CORE.get())
                .requires(de.srendi.advancedperipherals.common.setup.Items.WEAK_AUTOMATA_CORE.get())
                .requires(Items.NETHER_STAR)
                .unlockedBy("has_item", has(de.srendi.advancedperipherals.common.setup.Items.WEAK_AUTOMATA_CORE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(de.srendi.advancedperipherals.common.setup.Items.OVERPOWERED_END_AUTOMATA_CORE.get())
                .requires(de.srendi.advancedperipherals.common.setup.Items.END_AUTOMATA_CORE.get())
                .requires(Items.NETHER_STAR)
                .unlockedBy("has_item", has(de.srendi.advancedperipherals.common.setup.Items.END_AUTOMATA_CORE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(de.srendi.advancedperipherals.common.setup.Items.OVERPOWERED_HUSBANDRY_AUTOMATA_CORE.get())
                .requires(de.srendi.advancedperipherals.common.setup.Items.HUSBANDRY_AUTOMATA_CORE.get())
                .requires(Items.NETHER_STAR)
                .unlockedBy("has_item", has(de.srendi.advancedperipherals.common.setup.Items.HUSBANDRY_AUTOMATA_CORE.get()))
                .save(consumer);
    }

    public static class NBTIngredient extends net.minecraftforge.common.crafting.NBTIngredient {
        public NBTIngredient(ItemStack stack) {
            super(stack);
        }
    }
}
