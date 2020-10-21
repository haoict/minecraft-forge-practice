package com.haoict.forgepractice;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class HaoSword extends ItemSword {

    public static String registryName = "haosword";

    public HaoSword(ToolMaterial material) {
        super(material);

        this.setRegistryName(registryName);
        this.setUnlocalizedName(registryName);
        this.setCreativeTab(CreativeTabs.COMBAT);
    }
}
