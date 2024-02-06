package p040o;

/* renamed from: o.GetIdListener */
public final /* synthetic */ class GetIdListener implements findFragmentByWho {
    private final /* synthetic */ withClearedAuthToken MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ GetIdListener(withClearedAuthToken withclearedauthtoken, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = withclearedauthtoken;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final Object IconCompatParcelizer(Object obj) {
        withClearedAuthToken withclearedauthtoken = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        return withclearedauthtoken.write.MediaBrowserCompat$CustomActionResultReceiver(withclearedauthtoken.IconCompatParcelizer, (ThreadFactoryBuilder) obj, z);
    }
}
