package com.example.learn.chapter1.business_components;

public interface Sendable<T> {
    void send(T object);
}