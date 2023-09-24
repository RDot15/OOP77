package calculator;

import interfaces.Calculable;

public final class Calculator implements Calculable {

    private int primaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    /**
     * Реализация
     * калькулятора .
     *
     * */
    @Override
    public Calculable sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public Calculable div(int arg) {
        if(arg == 0) {
            System.out.println("Делить на ноль нельзя!");
        }
        primaryArg /= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}
