package net.hyper_pigeon.spooky_scary_skeletons.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.world.World;

public class ReaperEntity extends SkeletonEntity {
    public ReaperEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }
}
