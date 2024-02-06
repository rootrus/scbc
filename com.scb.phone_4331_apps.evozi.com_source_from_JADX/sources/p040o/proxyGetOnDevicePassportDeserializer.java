package p040o;

import p040o.CrashlyticsController;

/* renamed from: o.proxyGetOnDevicePassportDeserializer */
public interface proxyGetOnDevicePassportDeserializer {

    /* renamed from: o.proxyGetOnDevicePassportDeserializer$IconCompatParcelizer */
    public interface IconCompatParcelizer extends C7385x18ceaefe {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver(awaitEvent awaitevent);

        void write();
    }

    /* renamed from: o.proxyGetOnDevicePassportDeserializer$read */
    public interface read extends C7385x18ceaefe {
        void MediaBrowserCompat$ItemReceiver();

        void read(awaitEvent awaitevent);

        void write();
    }

    /* renamed from: o.proxyGetOnDevicePassportDeserializer$write */
    public interface write extends C7385x18ceaefe {
        void IconCompatParcelizer(CrashlyticsController.AnySessionPartFileFilter anySessionPartFileFilter);

        void MediaBrowserCompat$ItemReceiver();

        void write();
    }

    boolean read();

    void write();
}
