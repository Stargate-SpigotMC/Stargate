package net.cryogena.stargate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;

public class Gate {
	private String address = "";
	private boolean irisActive = false;
	private boolean isLocked = false;
	private String owner = "";
	private BlockFace facing = null;
	private ArrayList<String> trusted = new ArrayList<String>();
	//
	public Gate(Plugin plugin) {
		//
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isIrisActive() {
		return irisActive;
	}
	public void setIrisActive(boolean irisActive) {
		this.irisActive = irisActive;
	}
	public boolean isLocked() {
		return isLocked;
	}
	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public BlockFace getFacing() {
		return facing;
	}
	public void setFacing(BlockFace facing) {
		this.facing = facing;
	}
	public boolean isTrusted(String playerName) {
		return trusted.contains(playerName);
	}
	public boolean setTrusted(String playerName, boolean trust) {
		if (trust && !isTrusted(playerName)) {
			trusted.add(playerName);
			return true;
		}
		if (!trust && isTrusted(playerName)) {
			trusted.remove(playerName);
			return true;
		}
		return false;
	}
}
