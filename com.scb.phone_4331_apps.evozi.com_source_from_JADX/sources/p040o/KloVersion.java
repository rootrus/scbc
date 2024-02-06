package p040o;

import java.util.List;
import p040o.FieldType;
import p040o.getSessionIdFromSessionFile;
import p040o.zzjx;

/* renamed from: o.KloVersion */
public final class KloVersion extends FieldType.DataType {
    private final setStatusBarScrim MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final ReverseNaturalOrdering MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final getEulerY MediaDescriptionCompat;
    private final setExpandedComponentIdHint MediaSessionCompat$Token;

    /* renamed from: o.KloVersion$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* bridge */ /* synthetic */ Object write(Object obj) {
            List list = (List) obj;
            onGetStartedClick.write((Object) list, "it");
            return list;
        }
    }

    /* renamed from: o.KloVersion$read */
    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<getSessionIdFromSessionFile> {
        private /* synthetic */ KloVersion MediaBrowserCompat$CustomActionResultReceiver;

        read(KloVersion kloVersion) {
            this.MediaBrowserCompat$CustomActionResultReceiver = kloVersion;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            KloVersion kloVersion = this.MediaBrowserCompat$CustomActionResultReceiver;
            getSessionIdFromSessionFile.read read = ((getSessionIdFromSessionFile) obj).MediaBrowserCompat$MediaItem.get(0);
            onGetStartedClick.write((Object) read, "<set-?>");
            kloVersion.MediaMetadataCompat = read;
        }
    }

    /* renamed from: o.KloVersion$write */
    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<zzjx.zze.zza> {
        private /* synthetic */ KloVersion read;

        write(KloVersion kloVersion) {
            this.read = kloVersion;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            zzjx.zze.zza zza = (zzjx.zze.zza) obj;
            KloVersion kloVersion = this.read;
            onGetStartedClick.IconCompatParcelizer((Object) zza, "it");
            onGetStartedClick.write((Object) zza, "<set-?>");
            kloVersion.MediaBrowserCompat$ItemReceiver = zza;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public KloVersion(RegularImmutableBiMap regularImmutableBiMap, setStatusBarScrim setstatusbarscrim, setExpandedComponentIdHint setexpandedcomponentidhint, getEulerY geteulery, Text text, ReverseNaturalOrdering reverseNaturalOrdering, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap, setexpandedcomponentidhint, text, setitemicontintlist);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setstatusbarscrim, "hmlGetSetupAccountsCase");
        onGetStartedClick.write((Object) setexpandedcomponentidhint, "hmlSetupDetailsCase");
        onGetStartedClick.write((Object) geteulery, "getUserProfileUseCase");
        onGetStartedClick.write((Object) text, "hmlConfirmSetupDetailsCase");
        onGetStartedClick.write((Object) reverseNaturalOrdering, "hmlAccountSetupDisplayMapper");
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
        this.MediaBrowserCompat$MediaItem = setstatusbarscrim;
        this.MediaSessionCompat$Token = setexpandedcomponentidhint;
        this.MediaDescriptionCompat = geteulery;
        this.MediaBrowserCompat$SearchResultReceiver = reverseNaturalOrdering;
    }

    public final void onDestroy() {
        setStatusBarScrim setstatusbarscrim = this.MediaBrowserCompat$MediaItem;
        if (!setstatusbarscrim.MediaBrowserCompat$MediaItem.isDisposed()) {
            setstatusbarscrim.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public final void IconCompatParcelizer() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        DebitCardResetOtpActivity doOnNext = DebitCardResetOtpActivity.zip(this.MediaBrowserCompat$MediaItem.IconCompatParcelizer().map(IconCompatParcelizer.write), this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver().doOnNext(new write(this)), new KloVersion$MediaBrowserCompat$CustomActionResultReceiver(this)).doOnNext(new KloVersion$MediaBrowserCompat$ItemReceiver(this)).doOnNext(new read(this));
        onGetStartedClick.IconCompatParcelizer((Object) doOnNext, "observable");
        super.IconCompatParcelizer((DebitCardResetOtpActivity<getSessionIdFromSessionFile>) doOnNext);
    }
}
