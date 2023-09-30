package com.mauro.RestAPIApplication.mappers;

// Interface to allow for different mapper in future
public interface Mapper<A,B> {

    B mapTo(A a);

    A mapFrom(B b);

}
