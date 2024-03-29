package satisfy.farmcharm.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import satisfy.farmcharm.FarmCharm;

public class TabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(FarmCharm.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> FARMCHARM_TAB = CREATIVE_MODE_TABS.register("farmcharm", () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
            .icon(() -> new ItemStack(ObjectRegistry.STRAWBERRY.get()))
            .title(Component.translatable("creativetab.farmcharm.tab"))
            .displayItems((parameters, output) -> {
                output.accept(ObjectRegistry.CORN_SEEDS.get());
                output.accept(ObjectRegistry.CORN.get());
                output.accept(ObjectRegistry.OAT_SEEDS.get());
                output.accept(ObjectRegistry.OAT.get());
                output.accept(ObjectRegistry.BARLEY_SEEDS.get());
                output.accept(ObjectRegistry.BARLEY.get());
                output.accept(ObjectRegistry.STRAWBERRY_SEEDS.get());
                output.accept(ObjectRegistry.STRAWBERRY.get());
                output.accept(ObjectRegistry.LETTUCE_CROP.get());
                output.accept(ObjectRegistry.LETTUCE.get());
                output.accept(ObjectRegistry.TOMATO_SEEDS.get());
                output.accept(ObjectRegistry.TOMATO.get());

                output.accept(ObjectRegistry.LETTUCE_BAG.get());
                output.accept(ObjectRegistry.TOMATO_BAG.get());
                output.accept(ObjectRegistry.CARROT_BAG.get());
                output.accept(ObjectRegistry.POTATO_BAG.get());
                output.accept(ObjectRegistry.BEETROOT_BAG.get());
                output.accept(ObjectRegistry.STRAWBERRY_BAG.get());
                output.accept(ObjectRegistry.OAT_BAG.get());
                output.accept(ObjectRegistry.OAT_BLOCK.get());
                output.accept(ObjectRegistry.BARLEY_BLOCK.get());
                output.accept(ObjectRegistry.FEEDING_TROUGH.get());

                output.accept(ObjectRegistry.SILO_WOOD.get());
                output.accept(ObjectRegistry.SILO_COPPER.get());
                output.accept(ObjectRegistry.WATER_SPRINKLER.get());
                output.accept(ObjectRegistry.TOOL_RACK.get());
                output.accept(ObjectRegistry.COOKING_POT.get());
                output.accept(ObjectRegistry.COOKING_PAN.get());
                output.accept(ObjectRegistry.COOKING_SAUCEPAN.get());


                output.accept(ObjectRegistry.BUTTER.get());
                output.accept(ObjectRegistry.MOZZARELLA.get());
                output.accept(ObjectRegistry.DOUGH.get());

            })
            .build());

    public static void init() {
        CREATIVE_MODE_TABS.register();
    }
}
