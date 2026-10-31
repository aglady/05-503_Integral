package ru.gr05503.domain;

import java.util.List;

public interface CalculationRepository {
    void save(Calculation calculation);
    void delete(Calculation calculation);
    List<Calculation> findAll();
}