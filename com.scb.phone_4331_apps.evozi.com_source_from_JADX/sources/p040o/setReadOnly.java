package p040o;

import p040o.PointDouble;
import p040o.immediateFailedCheckedFuture;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzfe;

/* renamed from: o.setReadOnly */
public abstract class setReadOnly<T extends PointDouble> extends writeUInt64NoTag<T> {
    public final TextRecognizer IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    final setTimestampMillis MediaBrowserCompat$SearchResultReceiver;
    public zzfe.zza MediaDescriptionCompat;
    final toLongArray MediaMetadataCompat;
    final setItemIconTintList read;
    final getFieldSetter write;

    public abstract void IconCompatParcelizer();

    public abstract void MediaBrowserCompat$ItemReceiver();

    /* renamed from: o.setReadOnly$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PointDouble) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.setReadOnly$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ immediateFailedFuture MediaBrowserCompat$CustomActionResultReceiver;

        public MediaDescriptionCompat(immediateFailedFuture immediatefailedfuture) {
            this.MediaBrowserCompat$CustomActionResultReceiver = immediatefailedfuture;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PointDouble) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.setReadOnly$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        public static final RatingCompat IconCompatParcelizer = new RatingCompat();

        RatingCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PointDouble) obj).read();
        }
    }

    /* renamed from: o.setReadOnly$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PointDouble) obj).MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    /* renamed from: o.setReadOnly$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ setReadOnly IconCompatParcelizer;

        public write(setReadOnly setreadonly) {
            this.IconCompatParcelizer = setreadonly;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            PointDouble pointDouble = (PointDouble) obj;
            getFieldSetter getfieldsetter = this.IconCompatParcelizer.write;
            immediateFailedCheckedFuture.read IconCompatParcelizer2 = immediateFailedCheckedFuture.IconCompatParcelizer();
            IconCompatParcelizer2.read = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_accept_ncb_consent_title);
            IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_accept_ncb_consent_text);
            IconCompatParcelizer2.IconCompatParcelizer = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_accept_ncb_consent_positive);
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = getfieldsetter.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.hml_consent_confirm_accept_ncb_consent_negative);
            immediateFailedCheckedFuture immediatefailedcheckedfuture = new immediateFailedCheckedFuture(IconCompatParcelizer2, (byte) 0);
            onGetStartedClick.IconCompatParcelizer((Object) immediatefailedcheckedfuture, "hmlConsentDisplayMapper.…sformAcceptAlertDisplay()");
            zzct.zza MediaBrowserCompat$SearchResultReceiver = this.IconCompatParcelizer.read.read.MediaBrowserCompat$SearchResultReceiver();
            setTimestampMillis settimestampmillis = this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
            if (settimestampmillis.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView() != null) {
                String str = settimestampmillis.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().IconCompatParcelizer;
            }
            pointDouble.MediaBrowserCompat$ItemReceiver(immediatefailedcheckedfuture, MediaBrowserCompat$SearchResultReceiver);
        }
    }

    /* access modifiers changed from: protected */
    public final TextRecognizer MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setReadOnly(toLongArray tolongarray, getFieldSetter getfieldsetter, TextRecognizer textRecognizer, setItemIconTintList setitemicontintlist, setTimestampMillis settimestampmillis, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) tolongarray, "termsAndConsMapper");
        onGetStartedClick.write((Object) getfieldsetter, "hmlConsentDisplayMapper");
        onGetStartedClick.write((Object) textRecognizer, "consentCase");
        onGetStartedClick.write((Object) setitemicontintlist, "businessOwnerFlowCase");
        onGetStartedClick.write((Object) settimestampmillis, "successCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaMetadataCompat = tolongarray;
        this.write = getfieldsetter;
        this.IconCompatParcelizer = textRecognizer;
        this.read = setitemicontintlist;
        this.MediaBrowserCompat$SearchResultReceiver = settimestampmillis;
    }

    public final String write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final void read() {
        boolean z = true;
        if (this.read.read.MediaBrowserCompat$SearchResultReceiver() == zzct.zza.CONSUMER) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = RatingCompat.IconCompatParcelizer;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public void onDestroy() {
        TextRecognizer textRecognizer = this.IconCompatParcelizer;
        if (!textRecognizer.MediaBrowserCompat$MediaItem.isDisposed()) {
            textRecognizer.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
