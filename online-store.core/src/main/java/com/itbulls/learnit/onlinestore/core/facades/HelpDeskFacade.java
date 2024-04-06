package com.itbulls.learnit.onlinestore.core.facades;

import com.itbulls.learnit.onlinestore.persistence.enteties.SupportTicket;

public interface HelpDeskFacade {
	
	void addNewSupportTicket(SupportTicket supportTicket);
	
	SupportTicket getNextSupportTicket();
	
	int getNumberOfTickets();

}
