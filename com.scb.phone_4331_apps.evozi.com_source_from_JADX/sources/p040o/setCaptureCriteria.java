package p040o;

import java.util.List;
import p040o.StandardTable;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCaptureCriteria */
public final class setCaptureCriteria extends writeUInt64NoTag<C7129hC> {
    private final toPrettyString IconCompatParcelizer;
    public final GoogleJsonResponseException MediaBrowserCompat$ItemReceiver;
    public final setTextInputAccessibilityDelegate read;
    public final StandardTable.Row.RowEntrySet write;

    /* renamed from: o.setCaptureCriteria$IconCompatParcelizer */
    static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<C7129hC, HmlVerifyPhoneValidateOtpActivity> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final String getName() {
            return "navigateNext";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C7129hC.class);
        }

        public final String getSignature() {
            return "navigateNext()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C7129hC hCVar = (C7129hC) obj;
            onGetStartedClick.write((Object) hCVar, "p1");
            hCVar.read();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.setCaptureCriteria$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7129hC> {
        private /* synthetic */ List read;

        public read(List list) {
            this.read = list;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7129hC) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
        }
    }

    /* renamed from: o.setCaptureCriteria$write */
    public static final /* synthetic */ class write extends InvestmentFundDetailsActivity implements FundFactSheetActivity<getRating, HmlVerifyPhoneValidateOtpActivity> {
        public write(setCaptureCriteria setcapturecriteria) {
            super(1, setcapturecriteria);
        }

        public final String getName() {
            return "onConfirmSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(setCaptureCriteria.class);
        }

        public final String getSignature() {
            return "onConfirmSuccess(Lcom/scb/phone/domain/entity/investment/scbs/open/SuitabilityAssessmentResult;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            getRating getrating = (getRating) obj;
            onGetStartedClick.write((Object) getrating, "p1");
            setCaptureCriteria.MediaBrowserCompat$ItemReceiver((setCaptureCriteria) this.receiver, getrating);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setCaptureCriteria(RegularImmutableBiMap regularImmutableBiMap, setTextInputAccessibilityDelegate settextinputaccessibilitydelegate, GoogleJsonResponseException googleJsonResponseException, toPrettyString toprettystring, StandardTable.Row.RowEntrySet rowEntrySet) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) settextinputaccessibilitydelegate, "getSuitabilityQuestionsSummaryCase");
        onGetStartedClick.write((Object) googleJsonResponseException, "suitabilityConfirmationCase");
        onGetStartedClick.write((Object) toprettystring, "suitabilityInfoSCBSCase");
        onGetStartedClick.write((Object) rowEntrySet, "suitabilitySummaryDisplayMapper");
        this.read = settextinputaccessibilitydelegate;
        this.MediaBrowserCompat$ItemReceiver = googleJsonResponseException;
        this.IconCompatParcelizer = toprettystring;
        this.write = rowEntrySet;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [o.inject_adapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(p040o.setCaptureCriteria r6, p040o.getRating r7) {
        /*
            T r0 = r6.RatingCompat
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            if (r0 == 0) goto L_0x0010
            T r0 = r6.RatingCompat
            r0.aj_()
        L_0x0010:
            o.toPrettyString r0 = r6.IconCompatParcelizer
            java.lang.String r3 = r7.MediaBrowserCompat$ItemReceiver
            java.lang.String r4 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r7 = r7.read
            o.GeoDataClient$BoundsMode r5 = new o.GeoDataClient$BoundsMode
            r5.<init>(r3, r4, r7)
            o.HmlSetNTBPinSuccessActivity$MediaBrowserCompat$ItemReceiver$MediaBrowserCompat$CustomActionResultReceiver r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r7.IconCompatParcelizer((p040o.GeoDataClient.BoundsMode) r5)
            o.setCaptureCriteria$IconCompatParcelizer r7 = p040o.setCaptureCriteria.IconCompatParcelizer.read
            o.FundFactSheetActivity r7 = (p040o.FundFactSheetActivity) r7
            if (r7 == 0) goto L_0x002e
            o.inject_adapter r0 = new o.inject_adapter
            r0.<init>(r7)
            r7 = r0
        L_0x002e:
            o.writeUInt64NoTag$IconCompatParcelizer r7 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r7
            T r0 = r6.RatingCompat
            if (r0 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r1 = r2
        L_0x0036:
            if (r1 == 0) goto L_0x003d
            T r6 = r6.RatingCompat
            r7.IconCompatParcelizer(r6)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setCaptureCriteria.MediaBrowserCompat$ItemReceiver(o.setCaptureCriteria, o.getRating):void");
    }
}
