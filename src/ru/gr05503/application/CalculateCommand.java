package ru.gr05503.application;

import ru.gr05503.domain.Calculation;
import ru.gr05503.domain.RealisedMethod;

public class CalculateCommand implements Command{
    private final CalculationService service;
    private final String formula;           // формула f(x), как её ввёл пользователь
    private final double lower;             // нижний предел a
    private final double upper;             // верхний предел b
    private final int intervals;            // число отрезков n
    private final RealisedMethod method;
    private Calculation calculation;

    public CalculateCommand(
            CalculationService service,
            String formula,
            double lower,
            double upper,
            int intervals,
            RealisedMethod method
    ) {
        this.service = service;
        this.formula = formula;
        this.lower = lower;
        this.upper = upper;
        this.intervals = intervals;
        this.method = method;
    }

    @Override
    public void execute() {
        calculation = service.calculate(formula, lower, upper, intervals, method);
    }

    @Override
    public void undo() {
        service.delete(calculation);
    }
}
