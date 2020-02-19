package fr.zeamateis.nuwa.contentpack.common.json.data.events.processes;

import api.contentpack.json.process.IProcess;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * {@link IProcess} to manipulate {@link Entity} Motion vector
 *
 * @author ZeAmateis
 */
public class MovementSpeedProcess implements IProcess {

    private double[] moveFactor;

    @Override
    public void process(World worldIn, BlockPos posIn, Entity entityIn) {
        entityIn.setMotion(entityIn.getMotion().mul(moveFactor[0], moveFactor[1], moveFactor[2]));
    }

    @Override
    public String getRegistryName() {
        return "nuwa:movement_speed_process";
    }
}
