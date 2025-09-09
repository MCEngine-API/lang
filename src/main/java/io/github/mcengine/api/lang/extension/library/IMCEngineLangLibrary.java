package io.github.mcengine.api.lang.extension.library;

import org.bukkit.plugin.Plugin;

/**
 * Lang Library contract for foundational/shared code that supports the language
 * system (e.g., YAML parsers, caching layers, file watchers).
 *
 * <p>
 * Libraries commonly help read and resolve keys from
 * {@code {pluginName}/lang/{langType}.yml}.
 * </p>
 */
public interface IMCEngineLangLibrary {

    /**
     * Invoked when the Lang Library is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Lang Library is unloaded or disabled by the engine.
     * <p>Implementations should free resources and unregister integrations.</p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this Library instance.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
