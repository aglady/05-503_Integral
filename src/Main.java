import ru.gr05503.application.CalculationService;
import ru.gr05503.infrastructure.Exp4jFormulaParser;
import ru.gr05503.infrastructure.InMemoryCalculationRepository;
import ru.gr05503.ui.CalculatorWindow;

void main() {
    CalculationService service = new CalculationService(
            new InMemoryCalculationRepository(),
            new Exp4jFormulaParser()
    );
    new CalculatorWindow(service).setVisible(true);
}