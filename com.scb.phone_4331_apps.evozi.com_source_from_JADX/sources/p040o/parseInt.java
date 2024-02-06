package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.parseInt */
public final class parseInt extends RttiJsonBill<IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory> {

    /* renamed from: o.parseInt$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory> {
        private /* synthetic */ isSet MediaBrowserCompat$ItemReceiver;

        public read(isSet isset) {
            this.MediaBrowserCompat$ItemReceiver = isset;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory idCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory = (IdCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory) obj;
            if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver) {
                idCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory.read();
            } else {
                idCaptureModule_GetIExceptionResponseDeserializerOnDeviceFactory.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public parseInt(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    /* renamed from: o.parseInt$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Runnable {
        private /* synthetic */ parseInt read;

        public IconCompatParcelizer(parseInt parseint) {
            this.read = parseint;
        }

        public final void run() {
            parseInt parseint = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C51363.MediaBrowserCompat$CustomActionResultReceiver;
            if (parseint.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(parseint.RatingCompat);
            }
        }
    }
}
