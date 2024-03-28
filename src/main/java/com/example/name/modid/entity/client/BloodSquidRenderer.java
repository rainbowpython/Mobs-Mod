package com.example.name.modid.entity.client;

import com.example.name.modid.MobMod;
import com.example.name.modid.entity.custom.BloodSquidEntity;

import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.SquidEntityRenderer;
import net.minecraft.util.Identifier;

//public class BloodSquidRenderer extends MobEntityRenderer<BloodSquidEntity, BloodSquidModel<BloodSquidEntity>>{
    public class BloodSquidRenderer extends SquidEntityRenderer<BloodSquidEntity>{
    
        
    
    private static final Identifier TEXTURE = new Identifier(MobMod.MOD_ID,  "textures/entity/bloodsquid.png");
    private static final BloodSquidModel<BloodSquidEntity> b = new BloodSquidModel<>(ModModelLayers.BLOOD_SQUID.);
    public BloodSquidRenderer(EntityRendererFactory.Context context){
        //super(context, BloodSquidModel<>(context.getPart(ModModelLayers.BLOOD_SQUID)));
        //super
        super(context, b);
    }

    @Override
    public Identifier getTexture(BloodSquidEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(BloodSquidEntity mobEntity, float f, float g, MatrixStack matrixStack,
            VertexConsumerProvider vertexConsumerProvider, int i) {

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    
}