package me.meeran.staffjoinsound;

import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {

    public void onEnable() 
    {
        Bukkit.getConsoleSender.sendMessage("StaffSound by Meeran has been enabled, you can view this public repository at https://github.com/FreeMeeranCoding/StaffJoinSound");
        this.getConfig();
        getConfig().addDefault("config", true);
        this.registerCommands();
        this.registerListeners();
    }
    
    public void registerCommands() 
    {
        this.getCommand("staffsound").setExecutor(new StaffSoundCommand());
    }

    public void registerListeners() 
    {
        this.getServer().getPluginManager().registerEvents((Listener) new Listeners(), (Plugin) this);
    }
}
