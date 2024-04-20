package com.example.name.modid;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.name.modid.entity.ModEntities;
import com.example.name.modid.entity.custom.BloodSquidEntity;

public class MobMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "mob-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("mob-mod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		FabricDefaultAttributeRegistry.register(ModEntities.BLOOD_SQUID, BloodSquidEntity.createBloodSquidAttributes());
		LOGGER.info("Hello Fabric world!");
		ModEntities.registerModEntities();
	}
}