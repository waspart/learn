package com.aspart.art.heros;

import com.aspart.art.imm.Mortal;

public class ADHero implements Mortal {

	@Override
	public void die() {
		System.out.println("an ADHero died!");
	}

}
