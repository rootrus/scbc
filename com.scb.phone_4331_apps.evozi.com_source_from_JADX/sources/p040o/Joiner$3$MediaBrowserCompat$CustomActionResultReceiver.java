package p040o;

import p040o.Joiner;

/* renamed from: o.Joiner$3$MediaBrowserCompat$CustomActionResultReceiver */
public final class Joiner$3$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    private /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ Joiner.C35523 write;

    public Joiner$3$MediaBrowserCompat$CustomActionResultReceiver(Joiner.C35523 r1, String str) {
        this.write = r1;
        this.IconCompatParcelizer = str;
    }

    public final /* synthetic */ Object write(Object obj) {
        PlaceBuffer placeBuffer = (PlaceBuffer) obj;
        onGetStartedClick.write((Object) placeBuffer, "it");
        Joiner.C35523 r0 = this.write;
        String str = r0.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("encryptedCreditCardNumber");
        }
        return Joiner.C35523.MediaBrowserCompat$ItemReceiver(r0, str, this.IconCompatParcelizer, placeBuffer);
    }
}
