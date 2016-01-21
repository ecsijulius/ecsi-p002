package hu.ecsijulius.config.guice;

import hu.ecsijulius.HelloWorldServlet;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;

public class EServletModule extends ServletModule {

	@Override
	protected void configureServlets() {
		bind(HelloWorldServlet.class).in(Singleton.class);
		serve("/hi").with(HelloWorldServlet.class);
	}

}