package p040o;

/* renamed from: o.setTabIconTint$MediaBrowserCompat$CustomActionResultReceiver */
final class setTabIconTint$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    private /* synthetic */ setTabIconTint read;

    setTabIconTint$MediaBrowserCompat$CustomActionResultReceiver(setTabIconTint settabicontint) {
        this.read = settabicontint;
    }

    public final /* synthetic */ Object write(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        return this.read.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem(str);
    }
}
