import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import swordsman300.smithingplus.Smithing;
import swordsman300.smithingplus.SmithingDataGenerator;

public class ModItems {
    public static Item register(Item item, String id) {
        // Create the item identifier
        Identifier itemID = Identifier.of(Smithing.MOD_ID, id);

        // Register and return the item
        return Registry.register(Registries.ITEM, itemID, item);
    }
}