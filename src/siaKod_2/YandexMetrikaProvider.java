package siaKod_2;//конкретная рреализация

public class YandexMetrikaProvider implements AnalyticsProvider {


    public void getVisitorStats() {
        System.out.println("Получаем статистику посещений из Яндекс.Метрики.");
    }


    public void getTrafficSources() {
        System.out.println("Получаем источники трафика из Яндекс.Метрики.");
    }


    public void getConversionRates() {
        System.out.println("Получаем данные о конверсиях из Яндекс.Метрики.");
    }
}

