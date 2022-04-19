package com.amazon.ata.resources.model;

/**
 * The class representing a Customer.
 * <p>
 * DO NOT MODIFY THIS CLASS.
 * <p>
 * Assume this code belongs to another team and you have read-only access.
 */
public class Customer {
    private final String id;
    private final String name;

    public Customer(final String id, final String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
