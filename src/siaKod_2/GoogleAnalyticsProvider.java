package siaKod_2;//конкретная реализация

public class GoogleAnalyticsProvider implements AnalyticsProvider {


    public void getVisitorStats() {
        System.out.println("Получаем статистику посещений из Google Analytics.");
    }


    public void getTrafficSources() {
        System.out.println("Получаем источники трафика из Google Analytics.");
    }


    public void getConversionRates() {
        System.out.println("Получаем данные о конверсиях из Google Analytics.");
    }
}

