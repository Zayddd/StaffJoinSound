package me.meeran.staffjoinsound;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class StaffSoundCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if (cmd.getName().equalsIgnoreCase("staffsound")) {
            Player p = (Player) sender;

        }
        return false;
    }


    public void open(Player player) {
        //Creates blank inventory
        Inventory inv = Bukkit.createInventory(null, 9, "Games");
        player.openInventory(inv);

    }
}
