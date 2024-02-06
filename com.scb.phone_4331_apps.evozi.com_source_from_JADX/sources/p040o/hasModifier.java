package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.hasModifier */
public final class hasModifier extends writeUInt64NoTag<getFirstName$MediaBrowserCompat$ItemReceiver> {

    /* renamed from: o.hasModifier$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

        public write(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFirstName$MediaBrowserCompat$ItemReceiver) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public hasModifier(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
