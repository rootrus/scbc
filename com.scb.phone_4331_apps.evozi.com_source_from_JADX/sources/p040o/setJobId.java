package p040o;

import com.scb.phone.domain.interactor.emailverification.EnterVerificationCodeUseCase;
import p040o.writeUInt64NoTag;

/* renamed from: o.setJobId */
public final class setJobId extends writeUInt64NoTag<C6980x2ace65f3> {
    public final setTabIconTintResource IconCompatParcelizer;
    public long MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$MediaItem = "";
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$SearchResultReceiver = "";
    /* access modifiers changed from: private */
    public final tryWeakKeys MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public String MediaMetadataCompat = "";
    private final EnterVerificationCodeUseCase MediaSessionCompat$QueueItem;
    public final setTabIconTint read;
    public write write = write.ENTER_VERIFICATION_CODE;

    /* renamed from: o.setJobId$write */
    public enum write {
        NEW_VERIFICATION_CODE,
        ENTER_VERIFICATION_CODE
    }

    /* renamed from: o.setJobId$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C6980x2ace65f3> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C6980x2ace65f3) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.setJobId$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C6980x2ace65f3> {
        private /* synthetic */ setJobId MediaBrowserCompat$CustomActionResultReceiver;

        public read(setJobId setjobid) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setjobid;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C6980x2ace65f3) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setJobId(RegularImmutableBiMap regularImmutableBiMap, setTabIconTint settabicontint, setTabIconTintResource settabicontintresource, EnterVerificationCodeUseCase enterVerificationCodeUseCase, tryWeakKeys tryweakkeys) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) settabicontint, "setupEmailCase");
        onGetStartedClick.write((Object) settabicontintresource, "generateOTP");
        onGetStartedClick.write((Object) enterVerificationCodeUseCase, "verificationCodeUseCase");
        onGetStartedClick.write((Object) tryweakkeys, "manageEmailCommonDisplayMapper");
        this.read = settabicontint;
        this.IconCompatParcelizer = settabicontintresource;
        this.MediaSessionCompat$QueueItem = enterVerificationCodeUseCase;
        this.MediaDescriptionCompat = tryweakkeys;
    }

    public final void onDestroy() {
        setTabIconTintResource settabicontintresource = this.IconCompatParcelizer;
        if (!settabicontintresource.MediaBrowserCompat$MediaItem.isDisposed()) {
            settabicontintresource.MediaBrowserCompat$MediaItem.dispose();
        }
        EnterVerificationCodeUseCase enterVerificationCodeUseCase = this.MediaSessionCompat$QueueItem;
        if (!enterVerificationCodeUseCase.MediaBrowserCompat$MediaItem.isDisposed()) {
            enterVerificationCodeUseCase.MediaBrowserCompat$MediaItem.dispose();
        }
        setTabIconTint settabicontint = this.read;
        if (!settabicontint.MediaBrowserCompat$MediaItem.isDisposed()) {
            settabicontint.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(setJobId setjobid) {
        if (setjobid.RatingCompat != null) {
            setjobid.RatingCompat.aj_();
        }
    }
}
