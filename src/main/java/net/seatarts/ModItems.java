package net.seatarts;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static Item register(Item item, String id) {
        Identifier itemID = Identifier.of(WizardioHatus.MOD_ID, id);

        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static final Item MAGIC_PILLOW = register(
            new Item(new Item.Settings()),
            "magic_pillow"
    );

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.MAGIC_PILLOW));
    }
}