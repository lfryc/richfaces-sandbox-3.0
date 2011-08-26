package org.docs.richfaces;

import java.util.ArrayList;
import java.util.List;

public class Bean {

	private List<Person> personList = new ArrayList<Person>();

	public Bean() {
		for (int i = 0; i < 100; i++) {
			personList.add(new Person("fakeName" + i));
		}
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

}
