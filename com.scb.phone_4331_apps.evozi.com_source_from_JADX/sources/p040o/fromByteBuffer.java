package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.fromByteBuffer */
public final class fromByteBuffer extends writeUInt64NoTag<C6404xb2f77424> {
    /* access modifiers changed from: private */
    public final toLongArray write;

    /* renamed from: o.fromByteBuffer$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C6404xb2f77424> {
        private /* synthetic */ fromByteBuffer IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

        public read(fromByteBuffer frombytebuffer, String str) {
            this.IconCompatParcelizer = frombytebuffer;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C6404xb2f77424) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.write, (String) null, this.MediaBrowserCompat$CustomActionResultReceiver, (String) null, (String) null, false, false, (String) null, 72));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public fromByteBuffer(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "termsAndConditionsMapper");
        this.write = tolongarray;
    }
}
