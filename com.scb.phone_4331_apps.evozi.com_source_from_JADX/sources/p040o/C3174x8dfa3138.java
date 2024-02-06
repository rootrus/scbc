package p040o;

/* renamed from: o.CircularRevealFrameLayout$MediaBrowserCompat$CustomActionResultReceiver */
final class C3174x8dfa3138<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    private /* synthetic */ CircularRevealFrameLayout IconCompatParcelizer;
    private /* synthetic */ String[] write;

    C3174x8dfa3138(CircularRevealFrameLayout circularRevealFrameLayout, String[] strArr) {
        this.IconCompatParcelizer = circularRevealFrameLayout;
        this.write = strArr;
    }

    public final /* synthetic */ Object write(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        return new RtpInputDeepLinkActivity(this.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver(str, this.write));
    }
}
