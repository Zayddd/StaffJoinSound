package me.meeran.staffjoinsound;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class StaffSoundCommand implements CommandExecutor {

    public void openGui(Player p){
        Inventory inv = Bukkit.createInventory(null, 27, "EXP Shop");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if(cmd.getName().equalsIgnoreCase("staffsound")){
            Player p = (Player) sender;
            openGui(p);


        }

        return false;
    }
}
