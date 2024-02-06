package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IsEdgeConfident */
public final class IsEdgeConfident extends writeUInt64NoTag<newIdExtractor> {
    /* access modifiers changed from: private */
    public final isTopPrivateDomain IconCompatParcelizer;
    public final AbstractIndexedListIterator MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.IsEdgeConfident$IconCompatParcelizer */
    public static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public IconCompatParcelizer(IsEdgeConfident isEdgeConfident) {
            super(1, isEdgeConfident);
        }

        public final String getName() {
            return "onLoadFail";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(IsEdgeConfident.class);
        }

        public final String getSignature() {
            return "onLoadFail(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "p1");
            IsEdgeConfident.IconCompatParcelizer((IsEdgeConfident) this.receiver, th);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.IsEdgeConfident$read */
    public static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<zoomControlsEnabled, HmlVerifyPhoneValidateOtpActivity> {
        public read(IsEdgeConfident isEdgeConfident) {
            super(1, isEdgeConfident);
        }

        public final String getName() {
            return "onLoadSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(IsEdgeConfident.class);
        }

        public final String getSignature() {
            return "onLoadSuccess(Lcom/scb/phone/domain/entity/remittance/RemittanceTransactionResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            zoomControlsEnabled zoomcontrolsenabled = (zoomControlsEnabled) obj;
            onGetStartedClick.write((Object) zoomcontrolsenabled, "p1");
            IsEdgeConfident.read((IsEdgeConfident) this.receiver, zoomcontrolsenabled);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.IsEdgeConfident$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<newIdExtractor> {
        private /* synthetic */ IsEdgeConfident MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ zoomControlsEnabled read;

        write(IsEdgeConfident isEdgeConfident, zoomControlsEnabled zoomcontrolsenabled) {
            this.MediaBrowserCompat$CustomActionResultReceiver = isEdgeConfident;
            this.read = zoomcontrolsenabled;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((newIdExtractor) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.write(this.read));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IsEdgeConfident(RegularImmutableBiMap regularImmutableBiMap, isTopPrivateDomain istopprivatedomain, AbstractIndexedListIterator abstractIndexedListIterator) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) istopprivatedomain, "remittanceDisplayMapper");
        onGetStartedClick.write((Object) abstractIndexedListIterator, "transactionsCase");
        this.IconCompatParcelizer = istopprivatedomain;
        this.MediaBrowserCompat$ItemReceiver = abstractIndexedListIterator;
    }

    public static final /* synthetic */ void IconCompatParcelizer(IsEdgeConfident isEdgeConfident, Throwable th) {
        writeUInt64NoTag.IconCompatParcelizer isEdgeConfident$MediaBrowserCompat$CustomActionResultReceiver = new IsEdgeConfident$MediaBrowserCompat$CustomActionResultReceiver(th);
        if (isEdgeConfident.RatingCompat != null) {
            isEdgeConfident$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(isEdgeConfident.RatingCompat);
        }
    }

    public static final /* synthetic */ void read(IsEdgeConfident isEdgeConfident, zoomControlsEnabled zoomcontrolsenabled) {
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(isEdgeConfident, zoomcontrolsenabled);
        if (isEdgeConfident.RatingCompat != null) {
            write2.IconCompatParcelizer(isEdgeConfident.RatingCompat);
        }
    }
}
