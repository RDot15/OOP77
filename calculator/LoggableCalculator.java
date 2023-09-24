package calculator;

import interfaces.Calculable;
import interfaces.Loggable;

public class LoggableCalculator implements Calculable {
    protected Calculable calc;
    Loggable calcLogger = new CalcLogger();


    public LoggableCalculator(Calculable calc) {
        calcLogger.saveLog(" " + calc.getResult());
        this.calc = calc;
    }
    /**
     *
     * Повторение команд пользователя. вывод информации
     *
     */

    @Override
    public Calculable sum(int arg) {
        calcLogger.saveLog(calc.getResult() + " + " + arg);
        return this.calc.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        calcLogger.saveLog(calc.getResult() + " * " + arg);
        return this.calc.multi(arg);
    }

    @Override
    public Calculable div(int arg) {
        calcLogger.saveLog(calc.getResult() + " / " + arg);
        return this.calc.div(arg);
    }

    @Override
    public int getResult() {
        int result = this.calc.getResult();
        calcLogger.saveLog(" = " + result);
        return this.calc.getResult();
    }
}


