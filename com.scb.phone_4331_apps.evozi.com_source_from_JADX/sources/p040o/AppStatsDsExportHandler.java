package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.ILocationSourceDelegate;
import p040o.LinkedListMultimap;
import p040o.QueueFile;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsDsExportHandler */
public final class AppStatsDsExportHandler extends writeUInt64NoTag<C1354hx> {
    public final LinkedListMultimap.MultisetView.C35822.C35831 IconCompatParcelizer;

    /* renamed from: o.AppStatsDsExportHandler$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C1354hx> {
        private /* synthetic */ QueueFile.C37451 MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(QueueFile.C37451 r1) {
            this.MediaBrowserCompat$ItemReceiver = r1;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C1354hx hxVar = (C1354hx) obj;
            hxVar.aj_();
            hxVar.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.AppStatsDsExportHandler$MediaDescriptionCompat */
    public static final /* synthetic */ class MediaDescriptionCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<QueueFile.C37451, HmlVerifyPhoneValidateOtpActivity> {
        public MediaDescriptionCompat(AppStatsDsExportHandler appStatsDsExportHandler) {
            super(1, appStatsDsExportHandler);
        }

        public final String getName() {
            return "goodToKnowSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(AppStatsDsExportHandler.class);
        }

        public final String getSignature() {
            return "goodToKnowSuccess(Lcom/scb/phone/presentation/model/display/mailingaddress/MailingAddressGoodToKnowDisplayEntity;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            QueueFile.C37451 r2 = (QueueFile.C37451) obj;
            onGetStartedClick.write((Object) r2, "p1");
            AppStatsDsExportHandler.write((AppStatsDsExportHandler) this.receiver, r2);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.AppStatsDsExportHandler$RatingCompat */
    public static final /* synthetic */ class RatingCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public RatingCompat(AppStatsDsExportHandler appStatsDsExportHandler) {
            super(1, appStatsDsExportHandler);
        }

        public final String getName() {
            return "goodToKnowFail";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(AppStatsDsExportHandler.class);
        }

        public final String getSignature() {
            return "goodToKnowFail(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            AppStatsDsExportHandler.IconCompatParcelizer((AppStatsDsExportHandler) this.receiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public AppStatsDsExportHandler(LinkedListMultimap.MultisetView.C35822.C35831 r2, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "controller");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.IconCompatParcelizer = r2;
    }

    /* renamed from: o.AppStatsDsExportHandler$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ register IconCompatParcelizer;

        private write() {
        }

        public /* synthetic */ write(register register) {
            this.IconCompatParcelizer = register;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return register.MediaBrowserCompat$CustomActionResultReceiver((GlideException) obj);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.IconCompatParcelizer.IconCompatParcelizer();
    }

    /* renamed from: o.AppStatsDsExportHandler$read */
    static final class read implements Runnable {
        private /* synthetic */ AppStatsDsExportHandler read;

        read(AppStatsDsExportHandler appStatsDsExportHandler) {
            this.read = appStatsDsExportHandler;
        }

        public final void run() {
            AppStatsDsExportHandler appStatsDsExportHandler = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C3035xd6ceea76.write;
            if (appStatsDsExportHandler.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(appStatsDsExportHandler.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(AppStatsDsExportHandler appStatsDsExportHandler, Throwable th) {
        ILocationSourceDelegate iLocationSourceDelegate;
        ILocationSourceDelegate.zza zza;
        String str = null;
        RetrofitException retrofitException = (RetrofitException) (!(th instanceof RetrofitException) ? null : th);
        if (!(retrofitException == null || (iLocationSourceDelegate = retrofitException.IconCompatParcelizer) == null || (zza = iLocationSourceDelegate.write) == null)) {
            str = zza.IconCompatParcelizer;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "3001")) {
            access$2200 MediaBrowserCompat$ItemReceiver = appStatsDsExportHandler.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "errorDisplay");
            appStatsDsExportHandler.MediaBrowserCompat$ItemReceiver(appStatsDsExportHandler.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_error_verify_email_verify, Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_error_verify_email_not_now, new read(appStatsDsExportHandler), new AppStatsDsExportHandler$MediaBrowserCompat$ItemReceiver(appStatsDsExportHandler)));
            return;
        }
        appStatsDsExportHandler.MediaBrowserCompat$ItemReceiver(appStatsDsExportHandler.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }

    public static final /* synthetic */ void write(AppStatsDsExportHandler appStatsDsExportHandler, QueueFile.C37451 r2) {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(r2);
        if (appStatsDsExportHandler.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(appStatsDsExportHandler.RatingCompat);
        }
    }
}
