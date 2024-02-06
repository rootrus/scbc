package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.PhenotypeFlag;
import p040o.Predicates;
import p040o.StandardTable;
import p040o.Utils;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentCaptureExperience */
public final class DocumentCaptureExperience extends writeUInt64NoTag<C7141hv> {
    public final isLowerCase IconCompatParcelizer;
    public final Predicates.C37371 MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final PhenotypeFlag.zza read;
    /* access modifiers changed from: private */
    public final StandardTable.Values write;

    /* renamed from: o.DocumentCaptureExperience$IconCompatParcelizer */
    public static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<getCurrentPlace, HmlVerifyPhoneValidateOtpActivity> {
        public IconCompatParcelizer(DocumentCaptureExperience documentCaptureExperience) {
            super(1, documentCaptureExperience);
        }

        public final String getName() {
            return "onRequestFormSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(DocumentCaptureExperience.class);
        }

        public final String getSignature() {
            return "onRequestFormSuccess(Lcom/scb/phone/domain/entity/juristic/JuristicRequestFormResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            getCurrentPlace getcurrentplace = (getCurrentPlace) obj;
            onGetStartedClick.write((Object) getcurrentplace, "p1");
            DocumentCaptureExperience.MediaBrowserCompat$ItemReceiver((DocumentCaptureExperience) this.receiver, getcurrentplace);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.DocumentCaptureExperience$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7141hv> {
        private /* synthetic */ DocumentCaptureExperience MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ getCurrentPlace read;

        read(DocumentCaptureExperience documentCaptureExperience, getCurrentPlace getcurrentplace) {
            this.MediaBrowserCompat$ItemReceiver = documentCaptureExperience;
            this.read = getcurrentplace;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            C7141hv hvVar = (C7141hv) obj;
            StandardTable.Values MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.write;
            getCurrentPlace getcurrentplace = this.read;
            onGetStartedClick.write((Object) getcurrentplace, "domain");
            String str2 = getcurrentplace.write;
            OffsetDateTime offsetDateTime = getcurrentplace.MediaBrowserCompat$ItemReceiver;
            if (offsetDateTime != null) {
                str = MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer("dd MMM yyyy - HH:mm", offsetDateTime);
            } else {
                str = null;
            }
            hvVar.write(new Utils.C39312(str2, str));
        }
    }

    /* renamed from: o.DocumentCaptureExperience$write */
    public static final /* synthetic */ class write extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public write(DocumentCaptureExperience documentCaptureExperience) {
            super(1, documentCaptureExperience);
        }

        public final String getName() {
            return "onRequestFormError";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(DocumentCaptureExperience.class);
        }

        public final String getSignature() {
            return "onRequestFormError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            ((DocumentCaptureExperience) this.receiver).MediaBrowserCompat$ItemReceiver(((DocumentCaptureExperience) this.receiver).MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public DocumentCaptureExperience(Predicates.C37371 r2, PhenotypeFlag.zza zza, isLowerCase islowercase, StandardTable.Values values, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "getUserEmailCase");
        onGetStartedClick.write((Object) zza, "validateEmailUseCase");
        onGetStartedClick.write((Object) islowercase, "juristicRequestFormCase");
        onGetStartedClick.write((Object) values, "juristicRequestFormDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = r2;
        this.read = zza;
        this.IconCompatParcelizer = islowercase;
        this.write = values;
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(DocumentCaptureExperience documentCaptureExperience, getCurrentPlace getcurrentplace) {
        boolean z = true;
        if (documentCaptureExperience.RatingCompat != null) {
            documentCaptureExperience.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(documentCaptureExperience, getcurrentplace);
        if (documentCaptureExperience.RatingCompat == null) {
            z = false;
        }
        if (z) {
            read2.IconCompatParcelizer(documentCaptureExperience.RatingCompat);
        }
    }
}
