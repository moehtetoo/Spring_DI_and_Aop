package com.moehtet;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class BraveKnightTest {

	@Test
	public void knight_should_embark_on_quest() {
		Quest mockQuest=mock(Quest.class);
		Knight knight= new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest,times(1)).embark();
	}

}
