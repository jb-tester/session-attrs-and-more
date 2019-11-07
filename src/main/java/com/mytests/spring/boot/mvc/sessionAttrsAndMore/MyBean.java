package com.mytests.spring.boot.mvc.sessionAttrsAndMore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/7/2019.
 * Project: session-attrs-and-more
 * *******************************
 */

public class MyBean {

    String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
