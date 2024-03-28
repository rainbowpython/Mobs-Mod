package com.example.name.modid.entity;

import com.example.name.modid.MobMod;
import com.example.name.modid.entity.custom.BloodSquidEntity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BloodSquidEntity> BLOOD_SQUID = Registry.register(Registries.ENTITY_TYPE,
     new Identifier(MobMod.MOD_ID, "bloodsquid"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, BloodSquidEntity::new).build());
}
