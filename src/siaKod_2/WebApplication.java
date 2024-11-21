package siaKod_2;//конкретный класс приложений

public class WebApplication extends ClientApplication {

    public WebApplication(AnalyticsProvider provider) {
        super(provider);
    }


    public void collectReport() {
        System.out.println("Формируем отчёт для веб-приложения.");
        provider.getVisitorStats();
        provider.getTrafficSources();
        provider.getConversionRates();
    }
}

