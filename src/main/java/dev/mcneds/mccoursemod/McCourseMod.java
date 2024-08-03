package dev.mcneds.mccoursemod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class McCourseMod implements ModInitializer {
	public static final String MOD_ID = "mc-course-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}