package io.github.mcengine.api.lang.extension.skript;

import org.bukkit.plugin.Plugin;

/**
 * Lang Skript contract for scripted components that integrate with the language
 * system (e.g., expression bindings, triggers that resolve translation keys).
 *
 * <p>
 * Skript modules often act as glue between scripts and YAML files in
 * {@code {pluginName}/lang/{langType}.yml}.
 * </p>
 */
public interface IMCEngineLangSkript {

    /**
     * Invoked when the Lang Skript module is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Lang Skript module is unloaded or disabled by the engine.
     * <p>Implementations should unregister script handlers and free resources.</p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this Skript module.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
