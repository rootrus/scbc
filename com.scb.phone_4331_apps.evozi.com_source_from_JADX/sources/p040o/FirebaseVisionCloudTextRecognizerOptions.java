package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionCloudTextRecognizerOptions */
public final /* synthetic */ class FirebaseVisionCloudTextRecognizerOptions implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ access$2200 MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.FirebaseVisionCloudTextRecognizerOptions$Builder */
    public final /* synthetic */ class Builder implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ Builder IconCompatParcelizer = new Builder();

        private /* synthetic */ Builder() {
        }

        public final void IconCompatParcelizer(Object obj) {
            KotlinDetector.MediaBrowserCompat$CustomActionResultReceiver((getAddress5) obj);
        }
    }

    public /* synthetic */ FirebaseVisionCloudTextRecognizerOptions(access$2200 access_2200) {
        this.MediaBrowserCompat$ItemReceiver = access_2200;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getAddress5) obj).write(this.MediaBrowserCompat$ItemReceiver);
    }
}
