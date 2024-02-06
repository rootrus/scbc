package p040o;

import p040o.getAddress3;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRegisteredVersions */
public final class getRegisteredVersions extends writeUInt64NoTag<getAddress3.write> {
    public final toLongArray read;

    /* renamed from: o.getRegisteredVersions$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getAddress3.write> {
        private /* synthetic */ immediateFailedFuture MediaBrowserCompat$ItemReceiver;

        public read(immediateFailedFuture immediatefailedfuture) {
            this.MediaBrowserCompat$ItemReceiver = immediatefailedfuture;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getAddress3.write) obj).read(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getRegisteredVersions(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "mTermsAndConditionsMapper");
        this.read = tolongarray;
    }
}
