package ru.hamrusy.madgrief.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryType;
import ru.hamrusy.madgrief.Utils;

public class PistonsListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onItemMove(InventoryMoveItemEvent e) {
        if (Utils.getConfig().getBoolean("pistons.enable") != false) {
            if (e.getDestination().getType() != InventoryType.HOPPER)
                return;
            if (e.getSource().getType() != InventoryType.CHEST)
                return;
            e.setCancelled(false);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPiston(BlockPistonExtendEvent e) {
        if (Utils.getConfig().getBoolean("pistons.enable") != false) {
            e.setCancelled(false);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onRetract(BlockPistonRetractEvent e){
        if (Utils.getConfig().getBoolean("pistons.enable") != false) {
            e.setCancelled(false);
        }
    }
}
