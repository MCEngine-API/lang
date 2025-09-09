package io.github.mcengine.api.lang.extension.addon;

import org.bukkit.plugin.Plugin;

/**
 * Lang AddOn contract for modules that extend MCEngine's language/translation features.
 *
 * <p>
 * Implementations are dynamically loaded and may register commands, listeners,
 * or tasks related to language detection and translation file management under
 * {@code {pluginName}/lang/{langType}.yml}.
 * </p>
 */
public interface IMCEngineLangAddOn {

    /**
     * Invoked when the Lang AddOn is loaded by the engine.
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onLoad(Plugin plugin);

    /**
     * Invoked when the Lang AddOn is unloaded or disabled by the engine.
     * <p>Implementations should release resources and unregister listeners.</p>
     *
     * @param plugin the hosting plugin instance providing runtime context
     */
    void onDisload(Plugin plugin);

    /**
     * Supplies the engine-assigned unique identifier for this AddOn instance.
     *
     * @param id unique identifier assigned by the engine
     */
    void setId(String id);
}
