package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.setLuminanceThreshold;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCameraInitStatus */
public final /* synthetic */ class getCameraInitStatus implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setLuminanceThreshold.C53383 write;

    public /* synthetic */ getCameraInitStatus(setLuminanceThreshold.C53383 r1) {
        this.write = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).write(setLuminanceThreshold.this.write);
    }
}
