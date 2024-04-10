package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.openjdk.jol.info.ClassLayout;

import java.util.BitSet;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		boolean[] smallSubgraph = new boolean[288];
		System.out.println("SMALL subgraph: BOOLEAN\n" + ClassLayout.parseInstance(smallSubgraph).toPrintable());

		boolean[] mediumSubgraph = new boolean[638];
		System.out.println("MEDIUM subgraph: BOOLEAN\n" + ClassLayout.parseInstance(mediumSubgraph).toPrintable());

		boolean[] largeSubgraph = new boolean[1000];
		System.out.println("LARGE subgraph: BOOLEAN\n" + ClassLayout.parseInstance(largeSubgraph).toPrintable());

		BitSet smallBitSet = new BitSet(288);
		for(int i = 0; i < 288; i++) {smallBitSet.set(i);}
		System.out.println("SMALL subgraph: BITSET\n" + ClassLayout.parseInstance(smallBitSet).toPrintable());

		BitSet mediumBitSet = new BitSet(638);
		for(int i = 0; i < 638; i++) {mediumBitSet.set(i);}
		System.out.println("MEDIUM subgraph: BITSET\n" + ClassLayout.parseInstance(mediumBitSet).toPrintable());

		BitSet largeBitSet = new BitSet(1000);
		for(int i = 0; i < 1000; i++) {largeBitSet.set(i);}
		System.out.println("LARGE subgraph: BITSET\n" + ClassLayout.parseInstance(largeBitSet).toPrintable());

		//3 fields Boolean vs Bitset
		ShowBitset showBitset = new ShowBitset("0", "Sherlock Holmes", 2010);
		ShowBoolean showBoolean = new ShowBoolean("1", "Sherlock Holmes", 2010);

		System.out.println("BITSET 3 fields class:\n" + ClassLayout.parseInstance(showBitset).toPrintable());
		System.out.println("BOOLEAN 3 fields class:\n" + ClassLayout.parseInstance(showBoolean).toPrintable());

		//15 fields Boolean vs Bitset
		UpdateShowInputBitset updateShowBitset = new UpdateShowInputBitset("0", "bitset", 2024);
		UpdateShowInputBoolean updateShowBoolean = new UpdateShowInputBoolean("0", "boolean", 2025);

		System.out.println("BITSET 33 fields class:\n" + ClassLayout.parseInstance(updateShowBitset).toPrintable());
		System.out.println("BOOLEAN 33 fields class:\n" + ClassLayout.parseInstance(updateShowBoolean).toPrintable());

		SpringApplication.run(DemoApplication.class, args);
	}


}
