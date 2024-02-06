package p040o;

import p040o.IdCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.MapTypeAdapterFactory */
public final /* synthetic */ class MapTypeAdapterFactory implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ MapTypeAdapterFactory IconCompatParcelizer = new MapTypeAdapterFactory();

    /* renamed from: o.MapTypeAdapterFactory$Adapter */
    public final /* synthetic */ class Adapter implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ Adapter MediaBrowserCompat$ItemReceiver = new Adapter();

        private /* synthetic */ Adapter() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((IdCaptureModule.KtaExceptionResponseDeserializer) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    private /* synthetic */ MapTypeAdapterFactory() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getIIdExtractionServerOnDevice) obj).read();
    }
}
