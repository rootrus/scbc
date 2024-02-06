package p040o;

import p040o.Joiner;

/* renamed from: o.Joiner$3$MediaBrowserCompat$ItemReceiver */
public final class Joiner$3$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ String read;
    private /* synthetic */ Joiner.C35523 write;

    public Joiner$3$MediaBrowserCompat$ItemReceiver(Joiner.C35523 r1, String str) {
        this.write = r1;
        this.read = str;
    }

    public final /* synthetic */ Object write(Object obj) {
        PlaceBuffer placeBuffer = (PlaceBuffer) obj;
        onGetStartedClick.write((Object) placeBuffer, "dpParams");
        Joiner.C35523 r0 = this.write;
        String MediaBrowserCompat$CustomActionResultReceiver = validateSPR2.MediaBrowserCompat$CustomActionResultReceiver(validateSPR2.write, placeBuffer.MediaBrowserCompat$MediaItem, placeBuffer.MediaBrowserCompat$SearchResultReceiver, this.read, placeBuffer.read);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "ISprintUtilities.encrypt…ard(cardNumber, dpParams)");
        r0.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver;
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
