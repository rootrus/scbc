package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageResolutionInternal */
public final /* synthetic */ class setImageResolutionInternal implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ setImageResolutionInternal read = new setImageResolutionInternal();

    private /* synthetic */ setImageResolutionInternal() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).read(false);
    }
}
