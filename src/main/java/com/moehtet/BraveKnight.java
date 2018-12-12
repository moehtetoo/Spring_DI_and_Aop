package com.moehtet;

public class BraveKnight implements Knight{
	private Quest quest;
	public BraveKnight(Quest quest) {
		this.quest=quest;
	}
	public BraveKnight(Quest quest,Minstrel minstrel) {
		this.quest=quest;
	}
	@Override
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}
	@Override
	public void testAop() throws QuestException {
		quest.embark();
	}

}
