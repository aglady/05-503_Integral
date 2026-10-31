package ru.gr05503.domain;

import java.util.function.DoubleUnaryOperator;

public interface Integration {
    double integrateSum(DoubleUnaryOperator f, double a, double b, int n);
}

