package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.rU */
public final class C5203rU extends writeUInt64NoTag<C7084x69fb5f23> {
    public final toLongArray MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.rU$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7084x69fb5f23> {
        public static final read read = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7084x69fb5f23) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.rU$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7084x69fb5f23> {
        private /* synthetic */ immediateFailedFuture read;

        public write(immediateFailedFuture immediatefailedfuture) {
            this.read = immediatefailedfuture;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7084x69fb5f23) obj).read(this.read);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5203rU(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "mTermsAndConditionsMapper");
        this.MediaBrowserCompat$ItemReceiver = tolongarray;
    }
}
