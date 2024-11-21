package siaKod_2;//конкретный класс приложений

public class DesktopApplication extends ClientApplication {

    public DesktopApplication(AnalyticsProvider provider) {
        super(provider);
    }


    public void collectReport() {
        System.out.println("Формируем отчёт для настольного приложения.");
        provider.getVisitorStats();
        provider.getTrafficSources();
        provider.getConversionRates();
    }
}

