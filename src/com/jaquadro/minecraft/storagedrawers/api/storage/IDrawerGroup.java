package com.jaquadro.minecraft.storagedrawers.api.storage;

public interface IDrawerGroup
{
    /**
     * Gets the number of drawers contained within this group.
     */
    public int getDrawerCount ();

    /**
     * Gets the drawer at the given slot within this group.
     */
    public IDrawer getDrawer (int slot);

    /**
     * Gets whether the drawer in the given slot is usable.
     */
    public boolean isDrawerEnabled (int slot);
}