package net.hyper_pigeon.spooky_scary_skeletons.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.ai.TargetFinder;
import net.minecraft.entity.mob.PathAwareEntity;

import java.util.Random;

public class FrightfulEnchantment extends Enchantment {

    Random rand = new Random();
    int randomInt = rand.nextInt(10 - 1 + 1) + 1;

    public FrightfulEnchantment(Rarity weight, EnchantmentTarget target, EquipmentSlot[] slots){
        super(weight,target, slots);
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxPower(int level) {
        return 1;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
//        if(target instanceof LivingEntity) {
//           if(!(target instanceof GolemEntity)){
//                if(((LivingEntity) target).getHealth() < ((LivingEntity) target).getMaxHealth()) {
//                    if (randomInt <= 1){
//                        double vel_x = -2*target.getVelocity().x;
//                        double vel_z = -2*target.getVelocity().z;
//
//                        target.setYaw(target.yaw -= 180);
//                        target.addVelocity(vel_x,0,vel_z);
//                    }
//                }
//                else if(((LivingEntity) target).getHealth() < ((LivingEntity) target).getMaxHealth()/2){
//                    if (randomInt <= 2){
//                        double vel_x = -2*target.getVelocity().x;
//                        double vel_z = -2*target.getVelocity().z;
//
//                        target.setYaw(target.yaw -= 180);
//                        target.addVelocity(vel_x,0,vel_z);
//                    }
//                }
//                else if(((LivingEntity) target).getHealth() < ((LivingEntity) target).getMaxHealth()/3){
//                    if (randomInt <= 3){
//                        double vel_x = -2*target.getVelocity().x;
//                        double vel_z = -2*target.getVelocity().z;
//
//                        target.setYaw(target.yaw -= 180);
//                        target.addVelocity(vel_x,0,vel_z);
//                    }
//                }
//           }
//        }

        target.setYaw(target.yaw -= 180);
        double vel_x = target.getVelocity().x;
        double vel_z = target.getVelocity().z;

        target.move(MovementType.PLAYER, TargetFinder.findTargetAwayFrom((PathAwareEntity) target, 16, 7, user.getPos()));
        //target.addVelocity(100,0,100);
        super.onTargetDamaged(user, target, level);
    }

}
