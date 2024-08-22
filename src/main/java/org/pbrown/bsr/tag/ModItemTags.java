package org.pbrown.bsr.tag;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTags extends FabricTagProvider.ItemTagProvider {
    public ModItemTags(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    private static TagKey<Item> addItemTag(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of("better-stone-recipe", id));
    }

    public static final TagKey<Item> BASE_STONE = addItemTag("base_stone");

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModItemTags.BASE_STONE)
                .add(Items.ANDESITE)
                .add(Items.BASALT)
                .add(Items.BLACKSTONE)
                .add(Items.CALCITE)
                .add(Items.COBBLED_DEEPSLATE)
                .add(Items.DIORITE)
                .add(Items.GRANITE)
                .add(Items.STONE)
                .add(Items.TUFF);
    }
}
