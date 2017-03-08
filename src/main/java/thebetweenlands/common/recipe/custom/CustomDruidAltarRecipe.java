package thebetweenlands.common.recipe.custom;

import com.google.common.collect.ImmutableMap;

import net.minecraft.item.ItemStack;
import thebetweenlands.common.recipe.misc.DruidAltarRecipe;

public class CustomDruidAltarRecipe extends CustomRecipe {
	public CustomDruidAltarRecipe() {
		super("druid_altar", ImmutableMap.of("input/item_1", RecipeArg.ITEM_INPUT, "input/item_2", RecipeArg.ITEM_INPUT, "input/item_3", RecipeArg.ITEM_INPUT, "input/item_4", RecipeArg.ITEM_INPUT, "output", RecipeArg.ITEM_OUTPUT), ImmutableMap.of());
	}

	@Override
	public void register() {
		ItemStack input1 = this.get("input/item_1", RecipeArg.ITEM_INPUT).get().create();
		ItemStack input2 = this.get("input/item_2", RecipeArg.ITEM_INPUT).get().create();
		ItemStack input3 = this.get("input/item_3", RecipeArg.ITEM_INPUT).get().create();
		ItemStack input4 = this.get("input/item_4", RecipeArg.ITEM_INPUT).get().create();
		ItemStack output = this.get("output", RecipeArg.ITEM_OUTPUT).get().create();

		DruidAltarRecipe.addRecipe(input1, input2, input3, input4, output);
	}
}
