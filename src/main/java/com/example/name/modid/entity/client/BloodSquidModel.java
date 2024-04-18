package com.example.name.modid.entity.client;


import net.minecraft.client.model.*;
import net.minecraft.client.render.*;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;

import net.minecraft.client.util.math.MatrixStack;

import com.example.name.modid.entity.animation.ModAnimations;
import com.example.name.modid.entity.custom.BloodSquidEntity;


public class BloodSquidModel<T extends BloodSquidEntity> extends SinglePartEntityModel<T> {
	private final ModelPart body;
	private final ModelPart tentacle1;
	private final ModelPart tentacle2;
	private final ModelPart tentacle3;
	private final ModelPart tentacle4;
	private final ModelPart tentacle5;
	private final ModelPart tentacle6;
	private final ModelPart tentacle7;
	private final ModelPart tentacle8;
	
	public BloodSquidModel(ModelPart root) {
		this.body = root.getChild("body");
		this.tentacle1 = root.getChild("tentacle1");
		this.tentacle2 = root.getChild("tentacle2");
		this.tentacle3 = root.getChild("tentacle3");
		this.tentacle4 = root.getChild("tentacle4");
		this.tentacle5 = root.getChild("tentacle5");
		this.tentacle6 = root.getChild("tentacle6");
		this.tentacle7 = root.getChild("tentacle7");
		this.tentacle8 = root.getChild("tentacle8");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData tentacle1 = modelPartData.addChild("tentacle1", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 31.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData tentacle2 = modelPartData.addChild("tentacle2", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, 31.0F, 3.5F, 0.0F, 0.7854F, 0.0F));

		ModelPartData tentacle3 = modelPartData.addChild("tentacle3", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 31.0F, 5.0F));

		ModelPartData tentacle4 = modelPartData.addChild("tentacle4", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 31.0F, 3.5F, 0.0F, -0.7854F, 0.0F));

		ModelPartData tentacle5 = modelPartData.addChild("tentacle5", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, 31.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData tentacle6 = modelPartData.addChild("tentacle6", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-3.5F, 31.0F, -3.5F, 0.0F, -2.3562F, 0.0F));

		ModelPartData tentacle7 = modelPartData.addChild("tentacle7", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 31.0F, -5.0F, 0.0F, -3.1416F, 0.0F));

		ModelPartData tentacle8 = modelPartData.addChild("tentacle8", ModelPartBuilder.create().uv(48, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, 31.0F, -3.5F, 0.0F, -3.927F, 0.0F));
		return TexturedModelData.of(modelData, 64, 32);
	}
	@Override
	public void setAngles(BloodSquidEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);

		//this.animateMovement(ModAnimations.swimAnimation, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		this.animateMovement(ModAnimations.swimAnimation, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tentacle1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tentacle2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tentacle3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tentacle4.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tentacle5.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tentacle6.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tentacle7.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		tentacle8.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart getPart() {
		return body;
		//throw new UnsupportedOperationException("Unimplemented method 'getPart'");
	}
	
}