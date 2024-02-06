package p040o;

import p040o.getSignal;

/* renamed from: o.fromValid */
public final /* synthetic */ class fromValid implements findFragmentByWho {
    private final /* synthetic */ getIsatapIPv4Address MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ fromValid(getIsatapIPv4Address getisatapipv4address) {
        this.MediaBrowserCompat$ItemReceiver = getisatapipv4address;
    }

    public final Object IconCompatParcelizer(Object obj) {
        zzry zzry = (zzry) obj;
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = 14;
        String str = zzry.MediaBrowserCompat$ItemReceiver;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        MediaBrowserCompat$CustomActionResultReceiver.read = zzry.read.read;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = getICheckDeserializerRtti.IconCompatParcelizer(zzry.write, zzry.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = zzry.write;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
    }
}
