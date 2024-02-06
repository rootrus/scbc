package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ProcessPageOutRep */
public final /* synthetic */ class ProcessPageOutRep implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;

    public /* synthetic */ ProcessPageOutRep(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCountryLong getcountrylong = (getCountryLong) obj;
        if (this.IconCompatParcelizer) {
            getcountrylong.RatingCompat();
        } else {
            getcountrylong.read();
        }
    }
}
