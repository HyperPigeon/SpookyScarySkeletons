package net.hyper_pigeon.spooky_scary_skeletons.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.EvokerEntity;
import net.minecraft.entity.mob.SpellcastingIllagerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class CandleheadIllager extends SpellcastingIllagerEntity {
    protected CandleheadIllager(EntityType<? extends SpellcastingIllagerEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected SoundEvent getCastSpellSound() {
        return null;
    }

    @Override
    public void addBonusForWave(int wave, boolean unused) {

    }


    class ThrowWaxGoal extends CastSpellGoal {



        private ThrowWaxGoal(){

        }

        @Override
        protected void castSpell() {
            LivingEntity livingEntity = CandleheadIllager.this.getTarget();

            Vec3d vec3d = CandleheadIllager.this.getRotationVec(1.0F);
            double f = livingEntity.getX() - (CandleheadIllager.this.getX() + vec3d.x * 4.0D);
            double g = livingEntity.getBodyY(0.5D) - (0.5D + CandleheadIllager.this.getBodyY(0.5D));
            double h = livingEntity.getZ() - (CandleheadIllager.this.getZ() + vec3d.z * 4.0D);
        }

        @Override
        protected int getSpellTicks() {
            return 15;
        }

        @Override
        protected int startTimeDelay() {
            return 30;
        }

        public void throwWax(double x, double y, double z, double velocityX, double velocityY, double velocityZ){

        }

        @Override
        protected SoundEvent getSoundPrepare() {
            return SoundEvents.BLOCK_FIRE_EXTINGUISH;
        }

        @Override
        protected Spell getSpell() {
            return null;
        }
    }

    @Override
    public SoundEvent getCelebratingSound() {
        return null;
    }
}
