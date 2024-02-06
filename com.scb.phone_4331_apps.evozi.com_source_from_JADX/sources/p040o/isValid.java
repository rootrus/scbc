package p040o;

import p040o.getSignal;

/* renamed from: o.isValid */
public final /* synthetic */ class isValid implements findFragmentByWho {
    private final /* synthetic */ getIsatapIPv4Address IconCompatParcelizer;

    public /* synthetic */ isValid(getIsatapIPv4Address getisatapipv4address) {
        this.IconCompatParcelizer = getisatapipv4address;
    }

    public final Object IconCompatParcelizer(Object obj) {
        onIndoorLevelActivated onindoorlevelactivated = (onIndoorLevelActivated) obj;
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = 3;
        String str = onindoorlevelactivated.MediaBrowserCompat$ItemReceiver;
        if (str == null || str.isEmpty()) {
            str = "";
        }
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        MediaBrowserCompat$CustomActionResultReceiver.read = onindoorlevelactivated.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = getICheckDeserializerRtti.IconCompatParcelizer(onindoorlevelactivated.read, onindoorlevelactivated.write);
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = onindoorlevelactivated.read;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
    }
}
