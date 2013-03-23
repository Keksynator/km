package km.mods;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxyKM extends CommonProxyKM{

	@Override
	public void registerRenderThings()
	{
		MinecraftForgeClient.preloadTexture("/km/resources/block/blocks001.png");
	}
	
}
