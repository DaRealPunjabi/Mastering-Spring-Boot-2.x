package com.example.learn.chapter1;

import com.example.learn.chapter1.business_components.ComplexLogicService;
import com.example.learn.chapter1.profilesconfig.DataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class NewComponent {

    //@Autowired
    DataSourceConfig dataSourceConfig;

    @Autowired
    public NewComponent(
            DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
        System.out.println("Setting Up Environment:");
    }


    @PostConstruct
    public void init(){
        dataSourceConfig.setup();
    }
}