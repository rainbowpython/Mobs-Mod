package com.example.name.modid.entity.client;

import com.example.name.modid.entity.custom.BloodSquidEntity;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.SquidEntityModel;

public class BloodSquidModel <T extends BloodSquidEntity> extends SquidEntityModel<T>{
    public BloodSquidModel(ModelPart root) {
        super(root);
    }
    
}
