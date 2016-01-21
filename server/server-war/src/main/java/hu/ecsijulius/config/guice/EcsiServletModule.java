package hu.ecsijulius.config.guice;

import hu.ecsijulius.HelloWorldServlet;

import com.google.inject.servlet.ServletModule;

public class EcsiServletModule extends ServletModule {
	@Override
	protected void configureServlets() {
		serve("/hi").with(HelloWorldServlet.class);
	}
}
