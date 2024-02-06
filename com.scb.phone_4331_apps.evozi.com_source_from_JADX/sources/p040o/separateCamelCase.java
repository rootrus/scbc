package p040o;

/* renamed from: o.separateCamelCase */
public class separateCamelCase extends writeUInt64NoTag<getHair> {
    @HmlPinActivity
    public separateCamelCase(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    static /* synthetic */ void IconCompatParcelizer(boolean z, getHair gethair) {
        gethair.IconCompatParcelizer();
        if (z) {
            gethair.write();
        } else {
            gethair.read();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(Boolean bool, getHair gethair) {
        if (bool.booleanValue()) {
            gethair.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            gethair.MediaBrowserCompat$ItemReceiver();
        }
    }
}
