package siaKod_2;

public class Main {
    public static void main(String[] args) {
        // Создаем провайдеры данных
        AnalyticsProvider googleAnalytics = new GoogleAnalyticsProvider();
        AnalyticsProvider yandexMetrika = new YandexMetrikaProvider();
        AnalyticsProvider adobeAnalytics = new AdobeAnalyticsProvider();

        // Создаем клиентские приложения с различными провайдерами
        ClientApplication webAppWithGoogle = new WebApplication(googleAnalytics);
        ClientApplication mobileAppWithYandex = new MobileApplication(yandexMetrika);
        ClientApplication desktopAppWithAdobe = new DesktopApplication(adobeAnalytics);

        // Формируем отчёты для каждого приложения
        System.out.println("---- Отчёт для веб-приложения с Google Analytics ----");
        webAppWithGoogle.collectReport();

        System.out.println("\n---- Отчёт для мобильного приложения с Яндекс.Метрикой ----");
        mobileAppWithYandex.collectReport();

        System.out.println("\n---- Отчёт для настольного приложения с Adobe Analytics ----");
        desktopAppWithAdobe.collectReport();
    }
}

