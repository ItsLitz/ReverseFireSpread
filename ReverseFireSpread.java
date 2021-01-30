package me.Litz.ReverseFireSpread;
import me.Litz.ReverseFireSpread.events.ReverseFireSpreadEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ReverseFireSpread extends JavaPlugin{

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ReverseFireSpreadEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Litz]: Plugin enabled on startup");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Litz]: Plugin disabled on shutdown");
    }
}
