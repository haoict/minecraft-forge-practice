package com.haoict.forgepractice;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ForgePractice.MODID, name = ForgePractice.NAME, version = ForgePractice.VERSION)
public class ForgePractice {
    public static final String MODID = "forgepractice";
    public static final String NAME = "Haoict Forge Practice";
    public static final String VERSION = "0.0.1";

    private static Logger logger;

    public static Item.ToolMaterial myToolMaterial;
    public static Item mySword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();

        myToolMaterial = EnumHelper.addToolMaterial("MATERIAL_NAME", 4, 10000, 20.0f, 100.0f, 30);
        mySword = new HaoSword(myToolMaterial);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
