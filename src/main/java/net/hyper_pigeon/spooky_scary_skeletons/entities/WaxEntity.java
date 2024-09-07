package net.hyper_pigeon.spooky_scary_skeletons.entities;

import net.hyper_pigeon.spooky_scary_skeletons.registry.SpookyScarySkeletonEntities;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractFireballEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class WaxEntity extends AbstractFireballEntity {

    public WaxEntity(EntityType<WaxEntity> waxEntityEntityType, World world) {
        super(waxEntityEntityType,world);
    }

    public WaxEntity(World world, LivingEntity owner, double velocityX, double velocityY, double velocityZ){
        super(SpookyScarySkeletonEntities.WAX_ENTITY, owner, velocityX, velocityY, velocityZ, world);
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        if (!this.world.isClient) {
            Entity entity = entityHitResult.getEntity();
            entity.addVelocity(this.getVelocity().x, this.getVelocity().y, this.getVelocity().z);
        }
    }

}
