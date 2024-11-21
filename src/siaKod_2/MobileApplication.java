package siaKod_2;//конкретный класс приложений

public class MobileApplication extends ClientApplication {

    public MobileApplication(AnalyticsProvider provider) {
        super(provider);
    }


    public void collectReport() {
        System.out.println("Формируем отчёт для мобильного приложения.");
        provider.getVisitorStats();
        provider.getTrafficSources();
        provider.getConversionRates();
    }
}

