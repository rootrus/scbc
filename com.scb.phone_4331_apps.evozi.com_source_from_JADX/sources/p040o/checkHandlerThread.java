package p040o;

import p040o.CredentialRequest;

/* renamed from: o.checkHandlerThread */
public final /* synthetic */ class checkHandlerThread implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CredentialRequest.Builder IconCompatParcelizer;

    public /* synthetic */ checkHandlerThread(CredentialRequest.Builder builder) {
        this.IconCompatParcelizer = builder;
    }

    public final Object write(Object obj) {
        return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver((notifyListeners) obj);
    }
}
