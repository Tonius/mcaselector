package net.querz.mcaselector.version.anvil116;

import net.querz.mcaselector.version.anvil113.Anvil113ChunkDataProcessor;

public class Anvil116ChunkDataProcessor extends Anvil113ChunkDataProcessor {

	@Override
	protected int getPaletteIndex(int index, long[] blockStates, int bits, int clean) {
		int indicesPerLong = (int) (64D / bits);
		int blockStatesIndex = index / indicesPerLong;
		int startBit = (index % indicesPerLong) * bits;
		return (int) (blockStates[blockStatesIndex] >> startBit) & clean;
	}
}