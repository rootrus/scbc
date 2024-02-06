package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.an */
public final /* synthetic */ class C4040an implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ C4040an IconCompatParcelizer = new C4040an();

    private /* synthetic */ C4040an() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).read(true);
    }
}
