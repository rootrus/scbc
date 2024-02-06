package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.AbstractAppSpiCall */
public final class AbstractAppSpiCall extends writeUInt64NoTag<RttiCheckExtractor_Factory> {
    /* access modifiers changed from: private */
    public final getKeyEquivalence IconCompatParcelizer;
    public final ChequeInquiryDeepLinkActivity MediaBrowserCompat$ItemReceiver = new ChequeInquiryDeepLinkActivity();
    public getExitingScheduledExecutorService read;
    public final C4164c_ write;

    /* renamed from: o.AbstractAppSpiCall$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ AbstractAppSpiCall read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(AbstractAppSpiCall abstractAppSpiCall) {
            super(1);
            this.read = abstractAppSpiCall;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.AbstractAppSpiCall$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<RttiCheckExtractor_Factory> {
        private /* synthetic */ AbstractAppSpiCall IconCompatParcelizer;
        private /* synthetic */ endTask MediaBrowserCompat$CustomActionResultReceiver;

        read(AbstractAppSpiCall abstractAppSpiCall, endTask endtask) {
            this.IconCompatParcelizer = abstractAppSpiCall;
            this.MediaBrowserCompat$CustomActionResultReceiver = endtask;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((RttiCheckExtractor_Factory) obj).read(AbstractAppSpiCall.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer), this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.AbstractAppSpiCall$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<endTask, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ AbstractAppSpiCall write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(AbstractAppSpiCall abstractAppSpiCall) {
            super(1);
            this.write = abstractAppSpiCall;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            endTask endtask = (endTask) obj;
            onGetStartedClick.write((Object) endtask, "generateQRDisplay");
            AbstractAppSpiCall.IconCompatParcelizer(this.write, endtask);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ getExitingScheduledExecutorService MediaBrowserCompat$CustomActionResultReceiver(AbstractAppSpiCall abstractAppSpiCall) {
        getExitingScheduledExecutorService getexitingscheduledexecutorservice = abstractAppSpiCall.read;
        if (getexitingscheduledexecutorservice == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewDisplay");
        }
        return getexitingscheduledexecutorservice;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public AbstractAppSpiCall(RegularImmutableBiMap regularImmutableBiMap, C4164c_ c_Var, getKeyEquivalence getkeyequivalence) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) c_Var, "generateQRBarcodeCase");
        onGetStartedClick.write((Object) getkeyequivalence, "generateQRDisplayMapper");
        this.write = c_Var;
        this.IconCompatParcelizer = getkeyequivalence;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$ItemReceiver.dispose();
    }

    public static final /* synthetic */ void IconCompatParcelizer(AbstractAppSpiCall abstractAppSpiCall, endTask endtask) {
        boolean z = true;
        if (abstractAppSpiCall.RatingCompat != null) {
            abstractAppSpiCall.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(abstractAppSpiCall, endtask);
        if (abstractAppSpiCall.RatingCompat == null) {
            z = false;
        }
        if (z) {
            read2.IconCompatParcelizer(abstractAppSpiCall.RatingCompat);
        }
    }
}
