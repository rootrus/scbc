package p040o;

import java.util.Comparator;
import p040o.injectRttiCheckDeserializer;
import p040o.setLuminanceThreshold;
import p040o.writeUInt64NoTag;

/* renamed from: o.CameraInitializationEvent */
public final /* synthetic */ class CameraInitializationEvent implements Comparator {
    public static final /* synthetic */ CameraInitializationEvent write = new CameraInitializationEvent();

    private /* synthetic */ CameraInitializationEvent() {
    }

    public final int compare(Object obj, Object obj2) {
        return setLuminanceThreshold.C53383.MediaBrowserCompat$ItemReceiver((getAppIdentifier) obj, (getAppIdentifier) obj2);
    }

    /* renamed from: o.CameraInitializationEvent$CameraInitStatus */
    public final /* synthetic */ class CameraInitStatus implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ setLuminanceThreshold.C53371 IconCompatParcelizer;

        public /* synthetic */ CameraInitStatus(setLuminanceThreshold.C53371 r1) {
            this.IconCompatParcelizer = r1;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((injectRttiCheckDeserializer.RatingCompat) obj).MediaBrowserCompat$ItemReceiver(setLuminanceThreshold.this.read);
        }
    }
}
