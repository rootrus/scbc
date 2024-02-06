package p040o;

import p040o.access$2300;
import p040o.getContour;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseLocalModel */
public final /* synthetic */ class FirebaseLocalModel implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getContour.IconCompatParcelizer write;

    /* renamed from: o.FirebaseLocalModel$Builder */
    public final /* synthetic */ class Builder implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ chain write;

        public /* synthetic */ Builder(chain chain) {
            this.write = chain;
        }

        public final void IconCompatParcelizer(Object obj) {
            getContour.read(this.write, (setResultDeserializer) obj);
        }
    }

    public /* synthetic */ FirebaseLocalModel(getContour.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.write = iconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getContour.IconCompatParcelizer iconCompatParcelizer = this.write;
        ((setResultDeserializer) obj).write(getContour.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS));
    }
}
