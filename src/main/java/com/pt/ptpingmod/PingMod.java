package com.pt.ptpingmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = PingMod.MODID, name = PingMod.NAME, version = PingMod.VERSION)
public class PingMod {

    public static final String MODID = "ptpingmod";
    public static final String NAME = "PT Ping Mod";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(NAME + " cargado correctamente.");
    }
}
