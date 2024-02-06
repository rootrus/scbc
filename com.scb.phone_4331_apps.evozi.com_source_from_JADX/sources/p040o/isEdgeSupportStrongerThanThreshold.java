package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.isEdgeSupportStrongerThanThreshold */
public final class isEdgeSupportStrongerThanThreshold extends writeUInt64NoTag<injectOnDeviceDeserializer> {

    /* renamed from: o.isEdgeSupportStrongerThanThreshold$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<injectOnDeviceDeserializer> {
        public static final read write = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((injectOnDeviceDeserializer) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public isEdgeSupportStrongerThanThreshold(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
