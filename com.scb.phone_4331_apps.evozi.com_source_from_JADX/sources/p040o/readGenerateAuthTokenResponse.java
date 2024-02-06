package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.readGenerateAuthTokenResponse */
public final /* synthetic */ class readGenerateAuthTokenResponse implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;

    public /* synthetic */ readGenerateAuthTokenResponse(String str) {
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CreditCardParameters) obj).write(this.IconCompatParcelizer);
    }
}
