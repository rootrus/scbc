package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getLongEdge */
public final /* synthetic */ class getLongEdge implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Boolean read;

    public /* synthetic */ getLongEdge(Boolean bool) {
        this.read = bool;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaPassportExtractor) obj).IconCompatParcelizer(this.read);
    }
}
