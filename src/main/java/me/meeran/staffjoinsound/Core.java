package me.meeran.staffjoinsound;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;



public class Core extends JavaPlugin {

    public void onEnable() {
        this.getConfig();
        getConfig().addDefault("config", true);
        this.Commands();
        this.Listener();
    }


    public void Commands() {
        this.getCommand("staffsound").setExecutor(new StaffSoundCommand());

    }

    public void Listener() {
        this.getServer().getPluginManager().registerEvents((Listener) new Listeners(), (Plugin) this);
    }




}
