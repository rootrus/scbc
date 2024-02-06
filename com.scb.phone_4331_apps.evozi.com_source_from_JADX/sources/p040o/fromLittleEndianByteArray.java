package p040o;

import p040o.getSignal;

/* renamed from: o.fromLittleEndianByteArray */
public final /* synthetic */ class fromLittleEndianByteArray implements findFragmentByWho {
    private final /* synthetic */ getIsatapIPv4Address read;

    public /* synthetic */ fromLittleEndianByteArray(getIsatapIPv4Address getisatapipv4address) {
        this.read = getisatapipv4address;
    }

    public final Object IconCompatParcelizer(Object obj) {
        zzur zzur = (zzur) obj;
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = 7;
        String str = zzur.MediaBrowserCompat$ItemReceiver;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        MediaBrowserCompat$CustomActionResultReceiver.read = zzur.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = zzur.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = zzur.MediaBrowserCompat$SearchResultReceiver;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
    }
}
