package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.generateAuthToken */
public final /* synthetic */ class generateAuthToken implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;

    public /* synthetic */ generateAuthToken(String str) {
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((newCreditCardParameters) obj).read(this.IconCompatParcelizer);
    }
}
