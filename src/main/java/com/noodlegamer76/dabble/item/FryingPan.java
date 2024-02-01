package com.noodlegamer76.dabble.item;

import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

public class FryingPan extends BlockItem implements Equipable {

    public FryingPan(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public EquipmentSlot getEquipmentSlot() {
        return EquipmentSlot.HEAD;
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 2;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        stack.addAttributeModifier(Attributes.ATTACK_KNOCKBACK, new AttributeModifier("knockback", 2.5, AttributeModifier.Operation.MULTIPLY_BASE), EquipmentSlot.MAINHAND);
        return super.getAttributeModifiers(slot, stack);
    }


}
