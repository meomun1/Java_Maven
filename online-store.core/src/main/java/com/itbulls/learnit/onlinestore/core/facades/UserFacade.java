package com.itbulls.learnit.onlinestore.core.facades;

import java.util.List;

import com.itbulls.learnit.onlinestore.persistence.enteties.User;

public interface UserFacade {

	void registerUser(User user, String partnerCode);

	User getUserByEmail(String email);

    List<User> getUsers();

	User getUserById(int userId);

	void updateUser(User user);

	List<User> getReferralsForUser(User loggedInUser);
}