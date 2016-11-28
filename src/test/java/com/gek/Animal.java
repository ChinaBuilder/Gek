package com.gek;

import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface Animal {
	public String sayWord();

	public void doMySelf();

	public void eatSomething();
	public void test();
}
