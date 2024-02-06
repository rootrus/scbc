package p040o;

import p040o.getSignal;

/* renamed from: o.forUriString */
public final /* synthetic */ class forUriString implements findFragmentByWho {
    private final /* synthetic */ getIsatapIPv4Address read;

    public /* synthetic */ forUriString(getIsatapIPv4Address getisatapipv4address) {
        this.read = getisatapipv4address;
    }

    public final Object IconCompatParcelizer(Object obj) {
        getIsatapIPv4Address getisatapipv4address = this.read;
        zzrr zzrr = (zzrr) obj;
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = 4;
        String str = zzrr.MediaBrowserCompat$ItemReceiver;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        MediaBrowserCompat$CustomActionResultReceiver.read = getisatapipv4address.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_mutualfund_label);
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = getICheckDeserializerRtti.MediaDescriptionCompat(zzrr.read);
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = zzrr.read;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
    }
}
