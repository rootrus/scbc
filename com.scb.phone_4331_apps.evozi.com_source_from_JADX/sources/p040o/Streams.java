package p040o;

import java.util.List;
import p040o.IdCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.Streams */
public final /* synthetic */ class Streams implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getFieldNames$MediaBrowserCompat$CustomActionResultReceiver write;

    public /* synthetic */ Streams(getFieldNames$MediaBrowserCompat$CustomActionResultReceiver getfieldnames_mediabrowsercompat_customactionresultreceiver, Throwable th) {
        this.write = getfieldnames_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getFieldNames$MediaBrowserCompat$CustomActionResultReceiver getfieldnames_mediabrowsercompat_customactionresultreceiver = this.write;
        IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory idCaptureModule_GetIExceptionResponseDeserializerKtaFactory = (IdCaptureModule_GetIExceptionResponseDeserializerKtaFactory) obj;
        idCaptureModule_GetIExceptionResponseDeserializerKtaFactory.write(getfieldnames_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, (Runnable) new getDatePartOfDateTimePattern(idCaptureModule_GetIExceptionResponseDeserializerKtaFactory)));
    }

    /* renamed from: o.Streams$AppendableWriter */
    public final /* synthetic */ class AppendableWriter implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ List read;

        public /* synthetic */ AppendableWriter(List list) {
            this.read = list;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((IdCaptureModule.OnDeviceExceptionResponseDeserializer.C69031) obj).write(this.read);
        }

        /* renamed from: o.Streams$AppendableWriter$CurrentWrite */
        public final /* synthetic */ class CurrentWrite implements DebitCardMarketConductDeepLinkActivity {
            private final /* synthetic */ getBoundFields MediaBrowserCompat$ItemReceiver;

            public /* synthetic */ CurrentWrite(getBoundFields getboundfields) {
                this.MediaBrowserCompat$ItemReceiver = getboundfields;
            }

            public final void IconCompatParcelizer(Object obj) {
                this.MediaBrowserCompat$ItemReceiver.write(((requestActivityUpdates) obj).IconCompatParcelizer != null, getTimePartOfDateTimePattern.MediaBrowserCompat$ItemReceiver);
            }
        }
    }
}
