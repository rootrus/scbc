package p040o;

import p040o.onFrontImageProcessed;
import p040o.writeUInt64NoTag;

/* renamed from: o.setErrorRecommendation */
public final /* synthetic */ class setErrorRecommendation implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;

    public /* synthetic */ setErrorRecommendation(String str) {
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((onFrontImageProcessed.IconCompatParcelizer) obj).read(this.IconCompatParcelizer);
    }
}
