package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: o.setUsername  reason: case insensitive filesystem */
public final class C10864setUsername extends setReadOnly<PointDouble> {

    /* renamed from: o.setUsername$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PointDouble> {
        private /* synthetic */ boolean read;

        read(boolean z) {
            this.read = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PointDouble) obj).MediaBrowserCompat$ItemReceiver(this.read);
        }
    }

    /* renamed from: o.setUsername$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PointDouble> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PointDouble) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C10864setUsername(toLongArray tolongarray, getFieldSetter getfieldsetter, RegularImmutableBiMap regularImmutableBiMap, TextRecognizer textRecognizer, setItemIconTintList setitemicontintlist, setTimestampMillis settimestampmillis) {
        super(tolongarray, getfieldsetter, textRecognizer, setitemicontintlist, settimestampmillis, regularImmutableBiMap);
        onGetStartedClick.write((Object) tolongarray, "termsAndConsMapper");
        onGetStartedClick.write((Object) getfieldsetter, "hmlConsentDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) textRecognizer, "consentCase");
        onGetStartedClick.write((Object) setitemicontintlist, "businessOwnerFlowCase");
        onGetStartedClick.write((Object) settimestampmillis, "easycashSuccessCase");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        MediaBrowserCompat$CustomActionResultReceiver(true);
    }

    public final void IconCompatParcelizer() {
        MediaBrowserCompat$CustomActionResultReceiver(false);
    }

    public final void onDestroy() {
        TextRecognizer MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        if (!MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.isDisposed()) {
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        zzfe.zza zza = this.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("type");
        }
        boolean z2 = true;
        if (zza == zzfe.zza.NCB_CONSENT) {
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(z);
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                read2.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.write;
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
