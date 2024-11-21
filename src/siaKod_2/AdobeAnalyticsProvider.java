package siaKod_2;//конкретная реализация

public class AdobeAnalyticsProvider implements AnalyticsProvider {


    public void getVisitorStats() {
        System.out.println("Получаем статистику посещений из Adobe Analytics.");
    }


    public void getTrafficSources() {
        System.out.println("Получаем источники трафика из Adobe Analytics.");
    }


    public void getConversionRates() {
        System.out.println("Получаем данные о конверсиях из Adobe Analytics.");
    }
}

