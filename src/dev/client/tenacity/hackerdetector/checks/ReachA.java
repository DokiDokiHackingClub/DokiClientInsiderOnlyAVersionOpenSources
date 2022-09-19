package dev.client.tenacity.hackerdetector.checks;

import dev.client.tenacity.hackerdetector.Category;
import dev.client.tenacity.hackerdetector.Detection;
import net.minecraft.entity.player.EntityPlayer;

public class ReachA extends Detection {

    public ReachA() {
        super("Reach A", Category.COMBAT);
    }

    @Override
    public boolean runCheck(EntityPlayer player) {
        return false;
    }
}
