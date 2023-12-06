package com.noodlegamer76.dabble.item;

import com.noodlegamer76.dabble.entity.BouncyBallEntity;
import com.noodlegamer76.dabble.entity.InitEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TestItem extends Item {
    //item i use to trigger stuff in the mod
    public TestItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        BouncyBallEntity ball = new BouncyBallEntity(InitEntity.BOUNCY_BALL.get(), pLevel);
        ball.setPos(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ());
        pLevel.addFreshEntity(ball);
        ball.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), pPlayer.getXRot(), 1, 0);
        return super.use(pLevel, pPlayer, pUsedHand);

    }
}
