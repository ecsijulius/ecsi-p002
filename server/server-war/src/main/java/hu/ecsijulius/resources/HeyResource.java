package hu.ecsijulius.resources;

import hu.ecsijulius.SecondTest;
import hu.ecsijulius.TestClass;

import java.text.SimpleDateFormat;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/Hey")
public class HeyResource {

	@Inject
	TestClass first;
	@Inject
	SecondTest second;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String get() {
		return ("Hey there");
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/foo")
	public String foo(@QueryParam("test") String test) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		StringBuilder builder = new StringBuilder();

		builder.append("Hi there. You entered ").append(test).append("\n");
		builder.append("The first date is:")
				.append(sdf.format(first.getDate())).append("\n");
		builder.append("The second date is:")
				.append(sdf.format(second.getDate())).append("\n");

		return builder.toString();
	}
}
