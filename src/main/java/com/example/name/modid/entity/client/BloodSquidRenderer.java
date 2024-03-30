package com.example.name.modid.entity.client;

import com.example.name.modid.MobMod;
import com.example.name.modid.entity.custom.BloodSquidEntity;

import net.minecraft.client.render.entity.EntityRendererFactory.Context;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.SquidEntityRenderer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

public class BloodSquidRenderer extends MobEntityRenderer<BloodSquidEntity, BloodSquidModel<BloodSquidEntity>>{
    private static final Identifier TEXTURE = new Identifier(MobMod.MOD_ID,  "textures/entity/bloodsquid.png");
    
    public BloodSquidRenderer(EntityRendererFactory.Context context){
        super(context, new BloodSquidModel<>(context.getPart(ModModelLayers.BLOOD_SQUID)), 0.7f);
        
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

    @Override
    protected void setupTransforms(BloodSquidEntity squidEntity, MatrixStack matrixStack, float f, float g, float h) {
        float i = MathHelper.lerp(h, ((SquidEntity)squidEntity).prevTiltAngle, ((SquidEntity)squidEntity).tiltAngle);
        float j = MathHelper.lerp(h, ((SquidEntity)squidEntity).prevRollAngle, ((SquidEntity)squidEntity).rollAngle);
        matrixStack.translate(0.0f, 0.5f, 0.0f);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0f - g));
        matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(i));
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(j));
        matrixStack.translate(0.0f, -1.2f, 0.0f);
    }

    @Override
    protected float getAnimationProgress(BloodSquidEntity squidEntity, float f) {
        return MathHelper.lerp(f, ((SquidEntity)squidEntity).prevTentacleAngle, ((SquidEntity)squidEntity).tentacleAngle);
    }

    
}