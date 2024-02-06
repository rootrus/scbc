package p040o;

import p040o.onFrontImageProcessed;
import p040o.writeUInt64NoTag;

/* renamed from: o.getErrorRecommendation */
public final /* synthetic */ class getErrorRecommendation implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String write;

    public /* synthetic */ getErrorRecommendation(String str) {
        this.write = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((onFrontImageProcessed.IconCompatParcelizer) obj).write(this.write);
    }
}
