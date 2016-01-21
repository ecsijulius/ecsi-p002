package hu.ecsijulius;

import java.util.Date;

import javax.inject.Inject;

public class TestClass {
	@Inject
	private Date date;

	public TestClass() {
	}

	public Date getDate() {
		return date;
	}
}
