package me.meeran.staffjoinsound;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public  class StaffSoundCommand implements CommandExecutor {


    private Inventory gui = Bukkit.createInventory(null, 9, (ChatColor.DARK_RED + "StaffSound"));


    public void openGUI(Player p){
        gui.setItem(0, new ItemStack(Material.GRASS));
        ItemStack grass = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) grass.getItemMeta();
        skullMeta.setDisplayName(ChatColor.GRAY + "Player: " + ChatColor.YELLOW + p.getName());
        skullMeta.setOwner(p.getName());
        grass.setItemMeta(skullMeta);
        gui.setItem(1, grass);
        p.openInventory(gui);
    }





    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if (cmd.getName().equalsIgnoreCase("staffsound")) {
            Player p = (Player) sender;
            openGUI(p);

        }
        return true;
    }

} class StaffSoundListener implements Listener{

    //TODO Fix this stuuff lmaoo

    public void openGUISounds(Player p){
        //gui.setItem(0, new ItemStack(Material.GRASS));
        //ItemStack grass = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        //SkullMeta skullMeta = (SkullMeta) grass.getItemMeta();
        //skullMeta.setDisplayName(ChatColor.GRAY + "Player: " + ChatColor.YELLOW + p.getName());
        //skullMeta.setOwner(p.getName());
        //grass.setItemMeta(skullMeta);
        //gui.setItem(1, grass);
        //p.openInventory(gui);
    }

    private Inventory guiswitch = Bukkit.createInventory(null, 9, (ChatColor.DARK_RED + "StaffSound Switch"));
    private Inventory guisettings = Bukkit.createInventory(null, 27, (ChatColor.DARK_RED + "StaffSound Sounds"));


    @EventHandler
    public void ClickListener(InventoryClickEvent e){
        HumanEntity p = e.getWhoClicked();
        if(e.getInventory().getTitle().equalsIgnoreCase("StaffSound")){
            if(e.getSlot() == 4){
                e.getWhoClicked().openInventory(guiswitch);
            }
            if(e.getSlot() == 6){
                //openGUISounds(p.ge);
                //openGUISounds(Player p);
            }

        }
    }


}
