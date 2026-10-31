package ru.gr05503.domain;

public record RealisedMethod(String name, Integration method) {
    @Override
    public String toString() {
        return name;
    }
}
