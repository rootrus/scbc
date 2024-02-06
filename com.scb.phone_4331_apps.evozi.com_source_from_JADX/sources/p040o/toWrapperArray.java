package p040o;

import p040o.BeginSignInRequest;

/* renamed from: o.toWrapperArray */
public final /* synthetic */ class toWrapperArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BeginSignInRequest.GoogleIdTokenRequestOptions.Builder read;

    public /* synthetic */ toWrapperArray(BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder) {
        this.read = builder;
    }

    public final Object write(Object obj) {
        return this.read.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) obj);
    }
}
