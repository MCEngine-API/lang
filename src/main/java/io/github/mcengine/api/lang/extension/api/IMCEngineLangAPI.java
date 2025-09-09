package io.github.mcengine.api.lang.extension.api;

import org.bukkit.plugin.Plugin;

/**
 * Lang API contract for modules that expose programmatic capabilities related
 * to MCEngine’s language system (e.g., registries, resolvers, detectors).
 *
 * <p>
 * Implementations may register services that read from
 * {@code {pluginName}/lang/{langType}.yml} and provide discovery or fallback logic.
 * </p>
 */
public interface IMCEngineLangAPI {

    /**
     * Invoked when the Lang API module is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Lang API module is unloaded or disabled by the engine.
     * <p>Implementations should unregister services and free resources.</p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this API module.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
