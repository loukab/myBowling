/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 
 ./gradlew test
  ./gradlew test --continuous

 */

 package com.example.project;

 import static org.junit.jupiter.api.Assertions.assertEquals;
 
 import javax.management.monitor.GaugeMonitor;
 
 import org.junit.jupiter.api.DisplayName;
 import org.junit.jupiter.api.Test;
 import org.junit.jupiter.params.ParameterizedTest;
 import org.junit.jupiter.params.provider.CsvSource;
 
 class BowlingTests {
 
 
 @Test 
	  void testGutterRoll() {
		 Game g = new Game();
		 for (int i=0; i<20; i++){
			 g.roll(0);
 
		 }
		 assertEquals(0, g.score());
	 
	 }
 
	 public void testAllOnes() throws Exception {
		Game g = new Game();
		for (int i =0; i<20; i++)
			g.roll(1);
		assertEquals(20, g.score());
		
	}
 }
 