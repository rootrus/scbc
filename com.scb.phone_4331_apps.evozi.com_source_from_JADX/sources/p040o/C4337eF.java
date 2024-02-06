package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.eF */
public final class C4337eF extends writeUInt64NoTag<getVariantAsync$MediaBrowserCompat$CustomActionResultReceiver> {

    /* renamed from: o.eF$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getVariantAsync$MediaBrowserCompat$CustomActionResultReceiver> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getVariantAsync$MediaBrowserCompat$CustomActionResultReceiver) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.eF$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getVariantAsync$MediaBrowserCompat$CustomActionResultReceiver> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getVariantAsync$MediaBrowserCompat$CustomActionResultReceiver) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4337eF(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
