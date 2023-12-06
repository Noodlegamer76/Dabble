package com.noodlegamer76.dabble.entity;

import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class BouncyBallEntity extends ThrowableProjectile {
    public BouncyBallEntity(EntityType<? extends ThrowableProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        unsetRemoved();
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        super.onHitBlock(pResult);
        Direction direction = pResult.getDirection();
        Vec3 delta = getDeltaMovement();
        int face = direction.get3DDataValue();
        if(face == 0 || face == 1) {
            setDeltaMovement(delta.x, -delta.y, delta.z);
        }
        else if (face == 4 || face == 5) {
            setDeltaMovement(-delta.x, delta.y, delta.z);
        }
        else if (face == 2 || face == 3) {
            setDeltaMovement(delta.x, delta.y, -delta.z);
        }
        else {
            System.out.println("OH GOD IT DIDNT WORK");
        }
    }

    @Override
    protected void defineSynchedData() {

    }
}