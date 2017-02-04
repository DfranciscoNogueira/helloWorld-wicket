package com.teste.wicket.config;

import org.apache.wicket.protocol.http.WebApplication;

import com.teste.wicket.view.Index;

public class WicketApplication extends WebApplication {

    public WicketApplication() {
        super();
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Class getHomePage() {
        return Index.class;
    }

}
