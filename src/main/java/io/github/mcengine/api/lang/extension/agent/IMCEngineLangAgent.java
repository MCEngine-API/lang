package io.github.mcengine.api.lang.extension.agent;

import org.bukkit.plugin.Plugin;

/**
 * Lang Agent contract for autonomous components that handle language-related
 * tasks (e.g., probing player language, preloading YAML bundles, cache warmup).
 *
 * <p>
 * Agents are discovered and managed by the engine lifecycle and operate on
 * YAML files under {@code {pluginName}/lang/{langType}.yml}.
 * </p>
 */
public interface IMCEngineLangAgent {

    /**
     * Invoked when the Lang Agent is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Lang Agent is unloaded or disabled by the engine.
     * <p>Implementations should release resources and stop background work.</p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this Agent instance.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
