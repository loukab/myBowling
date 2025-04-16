/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

 package com.example.project;

 public class Game {
	 private int rolls[] = new int[21];
	 private int currentRoll=0;
	 public void roll(int pins) {
		 rolls[currentRoll]=pins;
		 currentRoll+=1;
	 }
	 public int score(){
		 int score = 0;
		 for(
			 int i=0; i<20; i++
		 )score+=rolls[i];
		 return score;
	 }
	 
	 }
 