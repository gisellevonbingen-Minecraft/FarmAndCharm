package satisfy.farm_and_charm.fabric.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import satisfy.farm_and_charm.compat.rei.Farm_And_CharmREIClientPlugin;


public class Farm_And_CharmReiClientPluginFabric implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        Farm_And_CharmREIClientPlugin.registerCategories(registry);
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        Farm_And_CharmREIClientPlugin.registerDisplays(registry);
    }
}
