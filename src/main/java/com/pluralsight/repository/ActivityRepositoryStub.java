package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Activity;
import com.pluralsight.model.User;

public class ActivityRepositoryStub implements ActivityRepository {

	@Override
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();

		Activity activity1 = new Activity();
		activity1.setDescription("swim");
		activity1.setDuration(21);
		activities.add(activity1);

		Activity activity2 = new Activity();
		activity2.setDescription("run");
		activity2.setDuration(31);
		activities.add(activity2);

		Activity activity3 = new Activity();
		activity3.setDescription("cycle");
		activity3.setDuration(55);
		activities.add(activity3);

		return activities;
	}

	@Override
	public Activity findActivity(String activityId) {
		Activity activity1 = new Activity();
		activity1.setId("1234");
		activity1.setDescription("swim");
		activity1.setDuration(21);

		User user = new User();
		user.setId("5555");
		user.setName("ram");
		activity1.setUser(user);

		return activity1;
	}

	@Override
	public void create(Activity activity) {
		// insert to db

	}

}
