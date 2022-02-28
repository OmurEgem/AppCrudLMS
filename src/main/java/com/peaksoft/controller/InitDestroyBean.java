package com.peaksoft.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InitDestroyBean {
    @PostConstruct
    public void doInit(){
        System.out.println("Doing bean initialization");
    }
    @PreDestroy
    public void doDestroy(){
        System.out.println("Doing bean destruction");
    }
}
