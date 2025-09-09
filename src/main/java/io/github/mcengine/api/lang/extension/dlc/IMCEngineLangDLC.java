package io.github.mcengine.api.lang.extension.dlc;

import org.bukkit.plugin.Plugin;

/**
 * Lang DLC contract for downloadable language content that participates in the
 * localization pipeline (e.g., additional language packs or updated bundles).
 *
 * <p>
 * DLCs typically provide YAML files under
 * {@code {pluginName}/lang/{langType}.yml}.
 * </p>
 */
public interface IMCEngineLangDLC {

    /**
     * Invoked when the Lang DLC is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Lang DLC is unloaded or disabled by the engine.
     * <p>Implementations should detach hooks and free resources.</p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this DLC instance.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
