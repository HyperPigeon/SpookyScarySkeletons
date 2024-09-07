package net.hyper_pigeon.spooky_scary_skeletons.registry;

import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.hyper_pigeon.spooky_scary_skeletons.entities.SkeletonArcherEntity;
import net.hyper_pigeon.spooky_scary_skeletons.entities.SkeletonWarriorEntity;
import net.hyper_pigeon.spooky_scary_skeletons.entities.WaxEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpookyScarySkeletonEntities {

    public static final EntityType<SkeletonArcherEntity> SKELETON_ARCHER_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("spooky_scary_skeletons", "skeleton_archer"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SkeletonArcherEntity::new).
                    size(EntityDimensions.fixed(0.6F, 1.99F)).build()
    );

    public static final EntityType<SkeletonWarriorEntity> SKELETON_WARRIOR_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("spooky_scary_skeletons", "skeleton_warrior"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SkeletonWarriorEntity::new).
                    size(EntityDimensions.fixed(0.6F, 1.99F)).build()
    );

    public static final EntityType<WaxEntity> WAX_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("spooky_scary_skeletons", "wax"),
            FabricEntityTypeBuilder.<WaxEntity>create(SpawnGroup.MISC, WaxEntity::new).
                    size(EntityDimensions.fixed(1.0F, 1.0F)).build()
    );


    public static void init() {
        FabricDefaultAttributeRegistry.register(SKELETON_ARCHER_ENTITY, SkeletonArcherEntity.createSkeletonArcherAttributes());
        FabricDefaultAttributeRegistry.register(SKELETON_WARRIOR_ENTITY, SkeletonWarriorEntity.createSkeletonWarriorAttributes());

    }
}
