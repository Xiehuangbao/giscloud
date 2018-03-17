package com.giscloud.registrycenter.model;

public class ServiceGroup {
    private Integer id;

    private String name;

    private String description;

    private String operation;

    private String input;

    private String output;

    private String capability;

    public ServiceGroup(Integer id, String name, String description, String operation, String input, String output, String capability) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.operation = operation;
        this.input = input;
        this.output = output;
        this.capability = capability;
    }

    public ServiceGroup() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input == null ? null : input.trim();
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output == null ? null : output.trim();
    }

    public String getCapability() {
        return capability;
    }

    public void setCapability(String capability) {
        this.capability = capability == null ? null : capability.trim();
    }
}