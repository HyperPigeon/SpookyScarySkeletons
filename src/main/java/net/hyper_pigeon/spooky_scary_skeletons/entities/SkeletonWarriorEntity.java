package net.hyper_pigeon.spooky_scary_skeletons.entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;

import java.util.Random;

public class SkeletonWarriorEntity extends SkeletonEntity {

    public SkeletonWarriorEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }


    public static DefaultAttributeContainer.Builder createSkeletonWarriorAttributes() {
        return HostileEntity.createHostileAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3D)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 12.5D).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 30);
    }


    protected void initGoals() {
        this.goalSelector.add(2, new AvoidSunlightGoal(this));
        this.goalSelector.add(3, new EscapeSunlightGoal(this, 1.0D));
        this.goalSelector.add(3, new FleeEntityGoal(this, WolfEntity.class, 6.0F, 1.0D, 1.2D));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(6, new LookAroundGoal(this));

        this.targetSelector.add(1, (new RevengeGoal(this, SpookyArmy.class)).setGroupRevenge());

        this.targetSelector.add(2, new FollowTargetGoal(this, PlayerEntity.class, true));
        this.targetSelector.add(3, new FollowTargetGoal(this, IronGolemEntity.class, true));
        this.targetSelector.add(3, new FollowTargetGoal(this, TurtleEntity.class, 10, true, false, TurtleEntity.BABY_TURTLE_ON_LAND_FILTER));

        this.goalSelector.add(6, new MeleeAttackGoal(this, 1.3D, false));
    }



    protected void initEquipment(LocalDifficulty difficulty) {
        super.initEquipment(difficulty);

        this.equipStack(EquipmentSlot.HEAD, (new ItemStack(Items.IRON_HELMET)));
        this.equipStack(EquipmentSlot.FEET, (new ItemStack(Items.IRON_BOOTS)));
        this.equipStack(EquipmentSlot.MAINHAND, (new ItemStack(Items.IRON_SWORD)));

    }

    public boolean tryAttack(Entity target) {
        Random rand = new Random();
        int randomInt = rand.nextInt(10)+1;

        if(target instanceof LivingEntity){
            if(((LivingEntity) target).getHealth() <= ((LivingEntity) target).getMaxHealth()/3) {
                if(randomInt <= 3){
                    ((LivingEntity) target).applyStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 80, 5));
                }
            }
            if(((LivingEntity) target).getHealth() <= ((LivingEntity) target).getMaxHealth()/2) {
                if(randomInt <= 2){
                    ((LivingEntity) target).applyStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 80, 5));
                }
            }
            if(((LivingEntity) target).getHealth() < ((LivingEntity) target).getMaxHealth()) {
                if(randomInt <= 1){
                    ((LivingEntity) target).applyStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 80, 5));
                }
            }
        }


       return super.tryAttack(target);
    }
}
