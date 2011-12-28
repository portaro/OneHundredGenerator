package com.djdch.bukkit.onehundredgenerator.configuration;

import com.djdch.bukkit.onehundredgenerator.OneHundredGenerator;
import com.djdch.bukkit.onehundredgenerator.generator.ChunkProviderGenerate;

/**
 *
 * @author djdch
 *
 */
public class WorldConfiguration {
	/**
	 *
	 */
	public OneHundredGenerator plugin;

	/**
	 *
	 */
	public ChunkProviderGenerate ChunkProvider;

	/**
	 *
	 */
	public boolean isInit = false;

	/**
	 *
	 * @param plug
	 */
	public WorldConfiguration(OneHundredGenerator plug) {
		this.plugin = plug;
	}
}