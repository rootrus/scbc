package p040o;

import com.scb.phone.data.network.service.InvestmentService;
import com.scb.phone.data.network.service.MutualFundsService;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.nB */
public final class C4997nB extends writeUInt64NoTag<setFaceLeftPadding> {
    public double IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver = "";
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    public C3088x7e3e3ebd MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public String MediaMetadataCompat = "";
    public String read = "";
    public setAddress write;

    /* renamed from: o.nB$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceLeftPadding> {
        private /* synthetic */ double IconCompatParcelizer;
        private /* synthetic */ C4997nB MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ double write;

        public MediaMetadataCompat(C4997nB nBVar, double d, double d2) {
            this.MediaBrowserCompat$ItemReceiver = nBVar;
            this.IconCompatParcelizer = d;
            this.write = d2;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            setFaceLeftPadding setfaceleftpadding = (setFaceLeftPadding) obj;
            if (C4997nB.RatingCompat(this.MediaBrowserCompat$ItemReceiver).RatingCompat) {
                setfaceleftpadding.MediaBrowserCompat$ItemReceiver(new HmlVerifyEmailSuccessfulActivity(Double.valueOf(this.IconCompatParcelizer), Double.valueOf(this.write)), this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat, this.MediaBrowserCompat$ItemReceiver.read);
            } else {
                setfaceleftpadding.write((HmlVerifyEmailSuccessfulActivity<Double, Double>) new HmlVerifyEmailSuccessfulActivity(Double.valueOf(this.IconCompatParcelizer), Double.valueOf(this.write)));
            }
        }
    }

    /* renamed from: o.nB$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceLeftPadding> {
        private /* synthetic */ int write;

        public RatingCompat(int i) {
            this.write = i;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((setFaceLeftPadding) obj).read(this.write);
        }
    }

    /* renamed from: o.nB$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<setFaceLeftPadding> {
        private /* synthetic */ double MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ C4997nB read;

        public write(C4997nB nBVar, double d) {
            this.read = nBVar;
            this.MediaBrowserCompat$CustomActionResultReceiver = d;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            setFaceLeftPadding setfaceleftpadding = (setFaceLeftPadding) obj;
            String format = C4997nB.IconCompatParcelizer(this.read).format(this.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) format, "formatter.format(result)");
            setfaceleftpadding.IconCompatParcelizer(format);
            if (!C4997nB.RatingCompat(this.read).RatingCompat) {
                return;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver > ((double) C4997nB.RatingCompat(this.read).MediaSessionCompat$ResultReceiverWrapper)) {
                setfaceleftpadding.read();
            } else {
                setfaceleftpadding.write();
            }
        }
    }

    public static final /* synthetic */ setAddress MediaBrowserCompat$ItemReceiver(C4997nB nBVar) {
        setAddress setaddress = nBVar.write;
        if (setaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("purposeList");
        }
        return setaddress;
    }

    public static final /* synthetic */ C3088x7e3e3ebd RatingCompat(C4997nB nBVar) {
        C3088x7e3e3ebd autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread = nBVar.MediaDescriptionCompat;
        if (autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remittanceAmountFormDisplay");
        }
        return autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4997nB(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    /* renamed from: o.nB$read */
    public static final class read {
        public MutualFundsService MediaBrowserCompat$CustomActionResultReceiver;
        public InvestmentService read;

        private read() {
        }

        @HmlPinActivity
        public read(MutualFundsService mutualFundsService, InvestmentService investmentService) {
            this.MediaBrowserCompat$CustomActionResultReceiver = mutualFundsService;
            this.read = investmentService;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i >= 0) {
            setAddress setaddress = this.write;
            if (setaddress == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("purposeList");
            }
            List<String> list = setaddress.MediaBrowserCompat$ItemReceiver;
            if (list != null) {
                this.read = list.get(i);
                return;
            }
            return;
        }
        this.read = "";
    }

    public final void read(String str) {
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            str = "";
        }
        this.MediaMetadataCompat = str;
    }

    /* renamed from: o.nB$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<DecimalFormat> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN);
            return decimalFormat;
        }
    }

    public static final /* synthetic */ DecimalFormat IconCompatParcelizer(C4997nB nBVar) {
        return (DecimalFormat) nBVar.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
