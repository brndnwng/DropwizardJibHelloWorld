package com.brandon.application;

import com.brandon.configuration.HelloWorldJibConfiguration;
import com.brandon.resources.HelloWordResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloWorldJibApplication extends Application<HelloWorldJibConfiguration> {
    @Override
    public void run(HelloWorldJibConfiguration bHackConfiguration, Environment environment) throws Exception {

        environment.jersey().register(new HelloWordResource());
    }

    public static void main(String args[]) throws Exception {
        new HelloWorldJibApplication().run(args);
    }
}
