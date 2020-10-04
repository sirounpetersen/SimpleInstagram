package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jaS7wES4RmTXglzGqPKPwTHTWvfabsPYyvYBUE5R")
                .clientKey("Yi86wfJ8Xd0ozfPbGS1WfYPaHwQwQQjj3VyHUk80")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}