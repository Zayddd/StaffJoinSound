package me.meeran.staffjoinsound;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        if (p.hasPermission(""))
        p.playSound(p.getLocation(), Sound.WITHER_DEATH, 1, 1);

    }
}
