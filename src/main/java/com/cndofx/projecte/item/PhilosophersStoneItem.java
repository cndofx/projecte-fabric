package com.cndofx.projecte.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PhilosophersStoneItem extends Item {

    public PhilosophersStoneItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return stack.copy();
    }
}
