
// Sword implementation

package com.ben10.rachel;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.ben10.rachel.Mods.ITEM_GROUP;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -1, -2.2f, new Settings().group(ITEM_GROUP));
    }
}