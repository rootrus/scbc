package p040o;

import p040o.getSignal;

/* renamed from: o.fromInteger */
public final /* synthetic */ class fromInteger implements findFragmentByWho {
    private final /* synthetic */ getIsatapIPv4Address MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ fromInteger(getIsatapIPv4Address getisatapipv4address, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getisatapipv4address;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final Object IconCompatParcelizer(Object obj) {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        zzup zzup = (zzup) obj;
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver2 = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat = 2;
        String str = zzup.MediaBrowserCompat$ItemReceiver;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = str;
        MediaBrowserCompat$CustomActionResultReceiver2.read = zzup.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(zzup.MediaBrowserCompat$CustomActionResultReceiver, z);
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = zzup.MediaBrowserCompat$CustomActionResultReceiver;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0);
    }
}
