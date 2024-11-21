package siaKod_2;//абстракция и один из столбов моста

public abstract class ClientApplication {
    protected AnalyticsProvider provider;

    public ClientApplication(AnalyticsProvider provider) {
        this.provider = provider;
    }

    public abstract void collectReport();
}

