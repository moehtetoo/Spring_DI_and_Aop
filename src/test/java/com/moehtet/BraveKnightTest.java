package com.moehtet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

public class BraveKnightTest {
	Knight knight;
	Quest mockQuest;
	@Before
	public void startUp() {
		 mockQuest=mock(Quest.class);
		 knight= new BraveKnight(mockQuest);
	}
	
	@Test
	public void knight_should_embark_on_quest() {
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
	}

}
