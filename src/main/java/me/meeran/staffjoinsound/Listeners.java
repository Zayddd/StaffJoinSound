package me.meeran.staffjoinsound;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) 
    {
        Player p = e.getPlayer();

        if (p.hasPermission("staffsound.join"))
            
        p.playSound(p.getLocation(), Sound.WITHER_DEATH, 1, 1);
        
        //Plan to add alternate sounds to make the customization a little bit better. - Zayd.
    }
}
