package p040o;

/* renamed from: o.SignInClientImpl */
public final /* synthetic */ class SignInClientImpl implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ setReferenceCounted MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ SignInClientImpl(setReferenceCounted setreferencecounted) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setreferencecounted;
    }

    public final Object write(Object obj) {
        isInlineCleanup isinlinecleanup = (isInlineCleanup) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(isinlinecleanup).map(new zacv(isinlinecleanup)).onErrorReturn(new CodePackage(isinlinecleanup));
    }
}
