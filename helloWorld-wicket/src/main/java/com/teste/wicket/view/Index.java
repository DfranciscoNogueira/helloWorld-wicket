package com.teste.wicket.view;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;

public class Index extends WebPage {

    private static final long serialVersionUID = 1L;
    
    private String texto = "Ola mundo !";
    
    public Index(){
        this.add(new Label("teste", new PropertyModel<String>(this, "texto")));
    }

}
