package choonster.forgedeobfuscationtestmod;


import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ForgeDeobfuscationTestMod.MODID, acceptedMinecraftVersions = "[1.10.2]")
public class ForgeDeobfuscationTestMod {
	static final String MODID = "forgedeobfuscationtestmod";

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		final Logger logger = event.getModLog();

		logger.info("Calling I18n.translateToLocalFormatted");
		String foo = I18n.translateToLocalFormatted("test123", 1, 2, 3);
		logger.info("Called method");
	}
}
