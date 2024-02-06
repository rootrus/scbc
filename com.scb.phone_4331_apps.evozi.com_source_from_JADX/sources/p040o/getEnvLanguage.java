package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.LinkedListMultimap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvLanguage */
public final class getEnvLanguage extends writeUInt64NoTag<getBackException> {
    public String IconCompatParcelizer;
    public final LinkedListMultimap.MultisetView.C35811 MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.getEnvLanguage$MediaMetadataCompat */
    public static final /* synthetic */ class MediaMetadataCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<ringWrite, HmlVerifyPhoneValidateOtpActivity> {
        public MediaMetadataCompat(getEnvLanguage getenvlanguage) {
            super(1, getenvlanguage);
        }

        public final String getName() {
            return "getAddressConfirmationSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(getEnvLanguage.class);
        }

        public final String getSignature() {
            return "getAddressConfirmationSuccess(Lcom/scb/phone/presentation/model/display/mailingaddress/MailingAddressConfirmationDetailsDisplay;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ringWrite ringwrite = (ringWrite) obj;
            onGetStartedClick.write((Object) ringwrite, "p1");
            getEnvLanguage.MediaBrowserCompat$ItemReceiver((getEnvLanguage) this.receiver, ringwrite);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getEnvLanguage$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getBackException> {
        private /* synthetic */ ringWrite write;

        read(ringWrite ringwrite) {
            this.write = ringwrite;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getBackException) obj).read(this.write);
        }
    }

    /* renamed from: o.getEnvLanguage$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getBackException> {
        public static final write write = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getBackException) obj).read();
        }
    }

    /* renamed from: o.getEnvLanguage$IconCompatParcelizer */
    public static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public IconCompatParcelizer(getEnvLanguage getenvlanguage) {
            super(1, getenvlanguage);
        }

        public final String getName() {
            return "postAddressConfirmationError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(getEnvLanguage.class);
        }

        public final String getSignature() {
            return "postAddressConfirmationError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            getEnvLanguage.MediaBrowserCompat$ItemReceiver((getEnvLanguage) this.receiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getEnvLanguage$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<getBackException> {
        private /* synthetic */ readElement MediaBrowserCompat$CustomActionResultReceiver;

        ParcelableVolumeInfo(readElement readelement) {
            this.MediaBrowserCompat$CustomActionResultReceiver = readelement;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getBackException) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.getEnvLanguage$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getBackException> {
        private /* synthetic */ getEnvLanguage read;

        RatingCompat(getEnvLanguage getenvlanguage) {
            this.read = getenvlanguage;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getBackException getbackexception = (getBackException) obj;
            String MediaBrowserCompat$CustomActionResultReceiver = this.read.IconCompatParcelizer;
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                getbackexception.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getEnvLanguage(RegularImmutableBiMap regularImmutableBiMap, LinkedListMultimap.MultisetView.C35811 r3) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "controller");
        this.MediaBrowserCompat$ItemReceiver = r3;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    }

    /* renamed from: o.getEnvLanguage$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat implements Runnable {
        public static final MediaDescriptionCompat read = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final void run() {
            access$2300.write write = access$2300.write.JUST_DISMISS;
        }
    }

    public static final /* synthetic */ void read(getEnvLanguage getenvlanguage, Throwable th) {
        String str;
        ILocationSourceDelegate.zza zza;
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza.IconCompatParcelizer;
            }
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("1002", str, true)) {
                getenvlanguage.MediaBrowserCompat$ItemReceiver(getenvlanguage.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                return;
            }
        }
        getenvlanguage.MediaBrowserCompat$ItemReceiver(getenvlanguage.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getEnvLanguage getenvlanguage, ringWrite ringwrite) {
        boolean z = true;
        if (getenvlanguage.RatingCompat != null) {
            getenvlanguage.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(ringwrite);
        if (getenvlanguage.RatingCompat != null) {
            read2.IconCompatParcelizer(getenvlanguage.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.write;
        if (getenvlanguage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(getenvlanguage.RatingCompat);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getEnvLanguage getenvlanguage, Throwable th) {
        String str;
        ILocationSourceDelegate.zza zza;
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate == null || (zza = iLocationSourceDelegate.write) == null) {
                str = null;
            } else {
                str = zza.IconCompatParcelizer;
            }
            boolean z = true;
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("901", str, true)) {
                if (getenvlanguage.RatingCompat != null) {
                    getenvlanguage.RatingCompat.aj_();
                }
                writeUInt64NoTag.IconCompatParcelizer ratingCompat = new RatingCompat(getenvlanguage);
                if (getenvlanguage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    ratingCompat.IconCompatParcelizer(getenvlanguage.RatingCompat);
                    return;
                }
                return;
            }
        }
        getenvlanguage.MediaBrowserCompat$ItemReceiver(getenvlanguage.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getEnvLanguage getenvlanguage, readElement readelement) {
        boolean z = true;
        if (getenvlanguage.RatingCompat != null) {
            getenvlanguage.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new ParcelableVolumeInfo(readelement);
        if (getenvlanguage.RatingCompat == null) {
            z = false;
        }
        if (z) {
            parcelableVolumeInfo.IconCompatParcelizer(getenvlanguage.RatingCompat);
        }
    }
}
