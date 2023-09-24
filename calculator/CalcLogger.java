package calculator;

import interfaces.Loggable;

public class CalcLogger implements Loggable {

    /***
     * Логируемая информация
     *
     * */
    @Override
    public void saveLog(String str) {
        System.out.println("Логирование " + str);
    }
}
