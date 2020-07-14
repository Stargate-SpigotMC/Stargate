package net.cryogena.stargate;

import org.bukkit.plugin.java.JavaPlugin;

public class Stargate extends JavaPlugin {
	private GatesLib gates;
	private Listeners listeners;
	private boolean enabled = false;
	//
	public Stargate() {
		gates = new GatesLib(this);
		listeners = new Listeners(this);
	}
	public void onEnable() {
		enabled = true;
	}
	public void onDisable() {
		enabled = false;
	}
}
