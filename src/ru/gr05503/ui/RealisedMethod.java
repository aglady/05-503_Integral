package ru.gr05503.ui;

import ru.gr05503.domain.Integration;

public record RealisedMethod(String name, Integration method) {
    @Override
    public String toString() {
        return name;
    }
}
