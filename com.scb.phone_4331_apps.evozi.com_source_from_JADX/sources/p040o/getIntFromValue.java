package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getIntFromValue */
public final class getIntFromValue extends writeUInt64NoTag<PassportCaptureModule_GetExtractionParametersFactory> {
    public registerAnalyticsListener read;

    /* renamed from: o.getIntFromValue$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetExtractionParametersFactory> {
        private /* synthetic */ getIntFromValue MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(getIntFromValue getintfromvalue) {
            this.MediaBrowserCompat$ItemReceiver = getintfromvalue;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_GetExtractionParametersFactory) obj).IconCompatParcelizer(getIntFromValue.read(this.MediaBrowserCompat$ItemReceiver).write);
        }
    }

    /* renamed from: o.getIntFromValue$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetExtractionParametersFactory> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_GetExtractionParametersFactory) obj).read();
        }
    }

    public static final /* synthetic */ registerAnalyticsListener read(getIntFromValue getintfromvalue) {
        registerAnalyticsListener registeranalyticslistener = getintfromvalue.read;
        if (registeranalyticslistener == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        return registeranalyticslistener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getIntFromValue(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
