package net.hyper_pigeon.spooky_scary_skeletons.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SpellcastingIllagerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class VampireIllagerEntity extends SpellcastingIllagerEntity {
    protected VampireIllagerEntity(EntityType<? extends SpellcastingIllagerEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected SoundEvent getCastSpellSound() {
        return null;
    }

    @Override
    public void addBonusForWave(int wave, boolean unused) {

    }

    @Override
    public SoundEvent getCelebratingSound() {
        return null;
    }
}
