package p040o;

import p040o.DeepLinkUri;

/* renamed from: o.zzgl */
public final /* synthetic */ class zzgl implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ ProductAction write;

    public /* synthetic */ zzgl(ProductAction productAction) {
        this.write = productAction;
    }

    public final Object write(Object obj) {
        return ProductAction.write((DeepLinkUri.Builder.ParseResult) obj);
    }
}
