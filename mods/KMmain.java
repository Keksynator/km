package km.mods;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Keksynator_KMmod", name = "KMmod", version = "PreA1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class KMmain {
	
	@SidedProxy(clientSide = "km.mods.ClientProxyKM", serverSide = "km.mods.CommonProxyKM")
	
	public static CommonProxyKM proxy;
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		
	}

}
