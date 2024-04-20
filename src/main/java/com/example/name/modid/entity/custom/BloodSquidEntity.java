package com.example.name.modid.entity.custom;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class BloodSquidEntity extends SquidEntity{
    public final AnimationState swimming = new AnimationState();

    private int idleAnimationTimeout = 0;

    public BloodSquidEntity(EntityType<? extends SquidEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createBloodSquidAttributes(){
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 15);
    }
    
    protected ParticleEffect getInkParticle() {
        return ParticleTypes.ANGRY_VILLAGER;
    }
}
