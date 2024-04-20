package com.example.name.modid;

import com.example.name.modid.entity.ModEntities;
import com.example.name.modid.entity.client.BloodSquidModel;
import com.example.name.modid.entity.client.BloodSquidRenderer;
import com.example.name.modid.entity.client.ModModelLayers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class MobModClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.BLOOD_SQUID, BloodSquidModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.BLOOD_SQUID, BloodSquidRenderer::new);
    }
}
