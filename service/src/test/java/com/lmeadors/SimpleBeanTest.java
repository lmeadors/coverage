package com.lmeadors;

import static org.junit.Assert.assertEquals;

public class SimpleBeanTest {


    @org.junit.Test
    public void should_work_or_something() {

        SimpleBean simpleBean = new SimpleBean();

        simpleBean.setBlah("test");
        assertEquals("test", simpleBean.getBlah());

    }

}
