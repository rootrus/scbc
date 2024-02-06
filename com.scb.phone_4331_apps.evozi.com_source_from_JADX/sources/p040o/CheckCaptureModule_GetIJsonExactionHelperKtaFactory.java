package p040o;

/* renamed from: o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory */
public interface CheckCaptureModule_GetIJsonExactionHelperKtaFactory extends CheckCaptureModule_GetICheckDeserializerRttiFactory {

    /* renamed from: o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$ItemReceiver(int i);
    }

    /* renamed from: o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$ItemReceiver();

        void write();
    }

    /* renamed from: o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory$write */
    public interface write extends read {
        void read(setUuidFromUtf8Bytes setuuidfromutf8bytes);

        void read(toGraph tograph);

        void read(boolean z);
    }

    void IconCompatParcelizer();

    void MediaBrowserCompat$ItemReceiver();

    void MediaBrowserCompat$ItemReceiver(buildReportData buildreportdata);

    /* renamed from: d_ */
    void mo16057d_(String str);

    void read();
}
