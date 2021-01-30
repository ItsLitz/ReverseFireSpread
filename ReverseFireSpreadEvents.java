package me.Litz.ReverseFireSpread.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBurnEvent;

public class ReverseFireSpreadEvents implements Listener {
    @EventHandler
    public void BurnPlace(BlockBurnEvent event) {

        // You should do '/Gamerule RandomTickSpeed 1' if you're planning on burning leaves to prevent decay

        World world = event.getBlock().getWorld();
        Block block = event.getBlock();
        Location location = block.getLocation();
        double locationX = block.getLocation().getX();
        double locationY = block.getLocation().getY();
        double locationZ = block.getLocation().getZ();
        Location loc = new Location(world, locationX, locationY+1, locationZ);
        Location loc2 = new Location(world, locationX, locationY-1, locationZ);
        Location loc3 = new Location(world, locationX-1, locationY, locationZ);
        Location loc4 = new Location(world, locationX+1, locationY, locationZ);
        Location loc5 = new Location(world, locationX, locationY, locationZ+1);
        Location loc6 = new Location(world, locationX, locationY, locationZ-1);
        Location loc7 = new Location(world, locationX, locationY+2, locationZ);
        loc.getBlock().setType(block.getType());
        loc2.getBlock().setType(block.getType());
        loc3.getBlock().setType(block.getType());
        loc4.getBlock().setType(block.getType());
        loc5.getBlock().setType(block.getType());
        loc6.getBlock().setType(block.getType());
        loc7.getBlock().setType(Material.FIRE);
        event.isCancelled();
    }
}
