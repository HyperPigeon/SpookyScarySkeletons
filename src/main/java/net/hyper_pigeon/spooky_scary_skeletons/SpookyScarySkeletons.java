package net.hyper_pigeon.spooky_scary_skeletons;

import net.hyper_pigeon.spooky_scary_skeletons.registry.SpookyScarySkeletonEntities;
import net.hyper_pigeon.spooky_scary_skeletons.registry.SpookyScarySkeletonsEnchantments;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Random;

import net.fabricmc.api.ModInitializer;

public class SpookyScarySkeletons implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Spooky Scary Skeletons");

	@Override
	public void onInitialize() {
		SpookyScarySkeletonEntities.init();
		SpookyScarySkeletonsEnchantments.init();
	}
}
