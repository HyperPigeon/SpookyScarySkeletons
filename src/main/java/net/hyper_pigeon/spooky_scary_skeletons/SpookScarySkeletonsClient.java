package net.hyper_pigeon.spooky_scary_skeletons;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.hyper_pigeon.spooky_scary_skeletons.entities.SkeletonArcherEntityRenderer;
import net.hyper_pigeon.spooky_scary_skeletons.entities.SkeletonWarriorEntityRenderer;
import net.hyper_pigeon.spooky_scary_skeletons.registry.SpookyScarySkeletonEntities;

public class SpookScarySkeletonsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.INSTANCE.register(SpookyScarySkeletonEntities.SKELETON_ARCHER_ENTITY,
                (dispatcher, context) -> {
                    return new SkeletonArcherEntityRenderer(dispatcher);
                });

        EntityRendererRegistry.INSTANCE.register(SpookyScarySkeletonEntities.SKELETON_WARRIOR_ENTITY,
                (dispatcher, context) -> {
                    return new SkeletonWarriorEntityRenderer(dispatcher);
                });

    }
}
