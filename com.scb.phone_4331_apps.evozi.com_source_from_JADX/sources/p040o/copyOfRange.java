package p040o;

import p040o.getSignal;

/* renamed from: o.copyOfRange */
public final /* synthetic */ class copyOfRange implements findFragmentByWho {
    private final /* synthetic */ getIsatapIPv4Address MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ copyOfRange(getIsatapIPv4Address getisatapipv4address) {
        this.MediaBrowserCompat$ItemReceiver = getisatapipv4address;
    }

    public final Object IconCompatParcelizer(Object obj) {
        getIsatapIPv4Address getisatapipv4address = this.MediaBrowserCompat$ItemReceiver;
        zzun zzun = (zzun) obj;
        String IconCompatParcelizer = getICheckDeserializerRtti.IconCompatParcelizer(zzun.MediaBrowserCompat$CustomActionResultReceiver, (String) null);
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = 15;
        String str = zzun.IconCompatParcelizer;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        MediaBrowserCompat$CustomActionResultReceiver.read = getisatapipv4address.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.account_management_product_type);
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = zzun.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = IconCompatParcelizer;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
    }
}
