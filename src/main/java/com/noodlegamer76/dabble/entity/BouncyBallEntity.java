package com.noodlegamer76.dabble.entity;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.ThrowableProjectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

import java.util.Objects;

public class BouncyBallEntity extends AbstractHurtingProjectile {
    public BouncyBallEntity(EntityType<? extends AbstractHurtingProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }



    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        super.onHitBlock(pResult);
        Vec3 delta = getDeltaMovement();
        int face = pResult.getDirection().get3DDataValue();

        //bounces ball
        double horizontalMultiplier = 1;
        double verticalMultiplier = 0.75;
        if (face == 4 || face == 5) {
            setDeltaMovement(-delta.x * horizontalMultiplier, delta.y, delta.z);
        }
        else if(face == 0 || face == 1) {
            setDeltaMovement(delta.x, -delta.y * verticalMultiplier, delta.z);
        }
        else if (face == 2 || face == 3) {
            setDeltaMovement(delta.x, delta.y, -delta.z * horizontalMultiplier);
        }
    }

    @Override
    protected float getInertia() {
        return 1;
    }
    

    @Override
    public boolean isOnFire() {
        return false;
    }

    @Override
    protected boolean canHitEntity(Entity p_37341_) {
        return false;
    }

    @Override
    protected void defineSynchedData() {

    }
}