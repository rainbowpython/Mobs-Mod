package com.example.name.modid.entity.client;

import com.example.name.modid.MobMod;

import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer BLOOD_SQUID = new EntityModelLayer(new Identifier(MobMod.MOD_ID, "bloodsquid"), "main");
}
