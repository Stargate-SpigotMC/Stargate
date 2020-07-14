package net.cryogena.stargate;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.block.Block;
import org.bukkit.plugin.Plugin;

public class GatesLib {
	private ArrayList<Block> blocks = new ArrayList<Block>();
	private ArrayList<Gate> gates = new ArrayList<Gate>();
	//
	public GatesLib(Plugin plugin) {
		//
	}
	public void clearGates() {
		gates = new ArrayList<Gate>();
	}
	public void clearBlocks() {
		blocks = new ArrayList<Block>();
	}
	public boolean isProtected(Block block) {
		return blocks.contains(block);
	}
	public boolean setProtect(Block block, boolean protect) {
		if (protect && !isProtected(block)) {
			blocks.add(block);
			return true;
		}
		if (!protect && isProtected(block)) {
			blocks.remove(block);
			return true;
		}
		return false;
	}
	public boolean isGate(Gate gate) {
		return gates.contains(gate);
	}
	public boolean setGate(Gate gate, boolean add) {
		if (add && !isGate(gate)) {
			gates.add(gate);
			return true;
		}
		if (!add && isGate(gate)) {
			gates.remove(gate);
			return true;
		}
		return false;
	}
	public List<Gate> getGates() {
		return gates;
	}
}
