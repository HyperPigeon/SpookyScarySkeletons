package net.hyper_pigeon.spooky_scary_skeletons.mixins;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;



@Mixin(MobEntity.class)
public abstract class MobEntityMixin extends LivingEntity {


    protected MobEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

//    @Inject(at = @At("HEAD"), method = "tryAttack", cancellable = true)
//    public void applyFrightful(Entity target, CallbackInfoReturnable<Boolean> callbackInfoReturnable){
//        int frightfulLevel = EnchantmentHelper.getEquipmentLevel(SpookyScarySkeletonsEnchantments.FRIGHTFUL, this);
//
//        Random rand = new Random();
//        int randomInt = rand.nextInt(10 - 1 + 1) + 1;
//
//        if(frightfulLevel > 0){
//            if(target instanceof LivingEntity) {
//                if(!(target instanceof GolemEntity)){
//                    if(((LivingEntity) target).getHealth() < ((LivingEntity) target).getMaxHealth()) {
//                        if (randomInt <= 1){
//                            double vel_x = -2*target.getVelocity().x;
//                            double vel_z = -2*target.getVelocity().z;
//
//                            target.setYaw(target.yaw -= 180);
//                            target.addVelocity(vel_x,0,vel_z);
//
//                            callbackInfoReturnable.setReturnValue(true);
//                        }
//                    }
//                    else if(((LivingEntity) target).getHealth() < ((LivingEntity) target).getMaxHealth()/2){
//                        if (randomInt <= 2){
//                            double vel_x = -2*target.getVelocity().x;
//                            double vel_z = -2*target.getVelocity().z;
//
//                            target.setYaw(target.yaw -= 180);
//                            target.addVelocity(vel_x,0,vel_z);
//
//                            callbackInfoReturnable.setReturnValue(true);
//                        }
//                    }
//                    else if(((LivingEntity) target).getHealth() < ((LivingEntity) target).getMaxHealth()/3){
//                        if (randomInt <= 3){
//                            double vel_x = -2*target.getVelocity().x;
//                            double vel_z = -2*target.getVelocity().z;
//
//                            target.setYaw(target.yaw -= 180);
//                            target.addVelocity(vel_x,0,vel_z);
//
//                            callbackInfoReturnable.setReturnValue(true);
//                        }
//                    }
//                }
//                else {
//                    callbackInfoReturnable.setReturnValue(false);
//                }
//            }
//            else {
//                callbackInfoReturnable.setReturnValue(false);
//            }
//        } else {
//            callbackInfoReturnable.setReturnValue(false);
//        }
//
//    }
}
