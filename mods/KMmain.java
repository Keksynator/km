package km.mods;

import km.mods.block.BlockKMore;

import net.minecraft.block.Block;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Keksynator_KMmod", name = "KMmod", version = "PreA1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class KMmain {
	
	@SidedProxy(clientSide = "km.mods.ClientProxyKM", serverSide = "km.mods.CommonProxyKM")
	
	int KMoreID;
	
	public static CommonProxyKM proxy;
	
	public static Block KMore;
	
	@Init
	public void load(FMLInitializationEvent event)
	{

		KMore = new BlockKMore().setBlockName("KMore");
	
		GameRegistry.registerBlock(KMore);
		
		LanguageRegistry.addName(KMore, "KM Ore");
	}

}
