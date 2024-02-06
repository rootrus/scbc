package p040o;

import p040o.AbstractMapBasedMultiset;
import p040o.writeUInt64NoTag;

/* renamed from: o.sm */
public final class C5413sm extends writeUInt64NoTag<C1290xf5767c6e> {
    public final toLongArray IconCompatParcelizer;
    public final AbstractMapBasedMultiset.MapBasedElementSet.C30081 read;

    /* renamed from: o.sm$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C1290xf5767c6e> {
        private /* synthetic */ immediateFailedFuture IconCompatParcelizer;

        public IconCompatParcelizer(immediateFailedFuture immediatefailedfuture) {
            this.IconCompatParcelizer = immediatefailedfuture;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1290xf5767c6e) obj).read(this.IconCompatParcelizer);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5413sm(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray, AbstractMapBasedMultiset.MapBasedElementSet.C30081 r4) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "mTermsAndConditionsMapper");
        onGetStartedClick.write((Object) r4, "mAcceptMutualFundTermsAndConditionsCase");
        this.IconCompatParcelizer = tolongarray;
        this.read = r4;
    }

    public final void onDestroy() {
        AbstractMapBasedMultiset.MapBasedElementSet.C30081 r0 = this.read;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
