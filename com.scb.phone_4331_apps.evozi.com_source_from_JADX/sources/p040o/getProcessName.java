package p040o;

import com.scb.phone.data.network.service.GiftingService;
import p040o.Lists;
import p040o.ProviderInstaller;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getProcessName */
public final class getProcessName extends writeUInt64NoTag<onFaceExtracted> {
    public final Lists.OnePlusArrayList MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.getProcessName$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<onFaceExtracted> {
        public static final MediaDescriptionCompat write = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((onFaceExtracted) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.getProcessName$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<onFaceExtracted> {
        private /* synthetic */ boolean read;

        public write(boolean z) {
            this.read = z;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((onFaceExtracted) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
        }
    }

    /* renamed from: o.getProcessName$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ getProcessName read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(getProcessName getprocessname) {
            super(1);
            this.read = getprocessname;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "it");
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getProcessName$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<onFaceExtracted> {
        public static final MediaMetadataCompat write = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((onFaceExtracted) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getProcessName(RegularImmutableBiMap regularImmutableBiMap, Lists.OnePlusArrayList onePlusArrayList, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) onePlusArrayList, "controller");
        onGetStartedClick.write((Object) providerInstallListener, "validateReferralCase");
        this.MediaBrowserCompat$ItemReceiver = onePlusArrayList;
    }

    /* renamed from: o.getProcessName$read */
    public static final class read {
        public GiftingService MediaBrowserCompat$ItemReceiver;

        private read() {
        }

        @HmlPinActivity
        public read(GiftingService giftingService) {
            this.MediaBrowserCompat$ItemReceiver = giftingService;
        }
    }

    public static final /* synthetic */ void read(getProcessName getprocessname) {
        if (getprocessname.RatingCompat != null) {
            getprocessname.RatingCompat.aj_();
        }
    }
}
