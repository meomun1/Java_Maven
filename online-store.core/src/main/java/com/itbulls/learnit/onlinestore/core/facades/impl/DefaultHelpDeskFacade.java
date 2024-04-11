package com.itbulls.learnit.onlinestore.core.facades.impl;

import com.itbulls.learnit.onlinestore.core.facades.HelpDeskFacade;
import com.itbulls.learnit.onlinestore.persistence.dto.converter.UserDtoToUserConverter;
import com.itbulls.learnit.onlinestore.persistence.enteties.SupportTicket;

public class DefaultHelpDeskFacade implements HelpDeskFacade {
	

	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SupportTicket getNextSupportTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfTickets() {
		// TODO Auto-generated method stub
		return 0;
	}

}
