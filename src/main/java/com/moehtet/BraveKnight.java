package com.moehtet;

public class BraveKnight implements Knight{
	public Quest quest;
	public BraveKnight(Quest quest) {
		this.quest=quest;
	}
	@Override
	public void embarkOnQuest() throws QuestException {
		quest.embark();
	}

}
