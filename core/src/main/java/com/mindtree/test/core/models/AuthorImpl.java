package com.mindtree.test.core.models;

import javax.annotation.Resource;

import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class,adapter=Author.class)
public class AuthorImpl {

}
