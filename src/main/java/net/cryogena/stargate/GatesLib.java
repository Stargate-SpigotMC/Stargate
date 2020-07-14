package net.cryogena.stargate;

import java.util.Arrays;
import java.util.List;

import org.bukkit.block.Block;
import org.bukkit.plugin.Plugin;

public class GatesLib {
	private Block[] _blocks_ = new Block[] {};
	private Gate[] _gates_ = new Gate[] {};
	//
	public GatesLib(Plugin plugin) {
		//
	}
	public void clearGates() {
		_gates_ = new Gate[] {};
	}
	public void clearBlocks() {
		_blocks_ = new Block[] {};
	}
	public boolean isProtected(Block block) {
		return Arrays.asList(_blocks_).contains(block);
	}
	public boolean setProtect(Block block, boolean protect) {
		if (protect && !isProtected(block)) {
			_blocks_[_blocks_.length] = block;
			return true;
		}
		if (!protect && isProtected(block)) {
			List<Block> list = Arrays.asList(_blocks_);
			list.remove(block);
			_blocks_ = list.toArray(new Block[0]);
			return true;
		}
		return false;
	}
	public boolean isGate(Gate gate) {
		return Arrays.asList(_gates_).contains(gate);
	}
	public boolean setGate(Gate gate, boolean add) {
		if (add && !isGate(gate)) {
			_gates_[_gates_.length] = gate;
			return true;
		}
		if (!add && isGate(gate)) {
			List<Gate> list = Arrays.asList(_gates_);
			list.remove(gate);
			_gates_ = list.toArray(new Gate[0]);
			return true;
		}
		return false;
	}
	public List<Gate> getGates() {
		return Arrays.asList(_gates_);
	}
}
