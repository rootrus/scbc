package p040o;

import kotlin.TypeCastException;
import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.EkycSuccessActivity */
public final class EkycSuccessActivity {
    private static final BaseDiscoverFundFilterActivity<closePinLocation<?>, HmlPromptPayVerificationActivity.IconCompatParcelizer, closePinLocation<?>> IconCompatParcelizer = C6456x5a7a0cf.IconCompatParcelizer;
    private static final BaseDiscoverFundFilterActivity<Object, HmlPromptPayVerificationActivity.IconCompatParcelizer, Object> MediaBrowserCompat$CustomActionResultReceiver = EkycSuccessActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
    private static final BaseDiscoverFundFilterActivity<NTBActivity, HmlPromptPayVerificationActivity.IconCompatParcelizer, NTBActivity> MediaBrowserCompat$ItemReceiver = write.MediaBrowserCompat$ItemReceiver;
    private static final BaseDiscoverFundFilterActivity<NTBActivity, HmlPromptPayVerificationActivity.IconCompatParcelizer, NTBActivity> read = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
    private static final EkycOtpActivity write = new EkycOtpActivity("ZERO");

    public static final Object IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        Object read2 = hmlPromptPayVerificationActivity.read(0, MediaBrowserCompat$CustomActionResultReceiver);
        if (read2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        return read2;
    }

    public static final Object MediaBrowserCompat$ItemReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Object obj) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        if (obj == null) {
            onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
            obj = hmlPromptPayVerificationActivity.read(0, MediaBrowserCompat$CustomActionResultReceiver);
            if (obj == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
        }
        if (obj == 0) {
            return write;
        }
        if (obj instanceof Integer) {
            return hmlPromptPayVerificationActivity.read(new NTBActivity(hmlPromptPayVerificationActivity, ((Number) obj).intValue()), read);
        }
        if (obj != null) {
            return ((closePinLocation) obj).MediaBrowserCompat$CustomActionResultReceiver(hmlPromptPayVerificationActivity);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    public static final void IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Object obj) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        if (obj != write) {
            if (obj instanceof NTBActivity) {
                ((NTBActivity) obj).MediaBrowserCompat$CustomActionResultReceiver = 0;
                hmlPromptPayVerificationActivity.read(obj, MediaBrowserCompat$ItemReceiver);
                return;
            }
            Object read2 = hmlPromptPayVerificationActivity.read(null, IconCompatParcelizer);
            if (read2 != null) {
                ((closePinLocation) read2).write(hmlPromptPayVerificationActivity, obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    /* renamed from: o.EkycSuccessActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<NTBActivity, HmlPromptPayVerificationActivity.IconCompatParcelizer, NTBActivity> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(2);
        }

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
            NTBActivity nTBActivity = (NTBActivity) obj;
            HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = (HmlPromptPayVerificationActivity.IconCompatParcelizer) obj2;
            onGetStartedClick.write((Object) nTBActivity, "state");
            onGetStartedClick.write((Object) iconCompatParcelizer, "element");
            if (iconCompatParcelizer instanceof closePinLocation) {
                Object MediaBrowserCompat$CustomActionResultReceiver = ((closePinLocation) iconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver(nTBActivity.IconCompatParcelizer);
                Object[] objArr = nTBActivity.write;
                int i = nTBActivity.MediaBrowserCompat$CustomActionResultReceiver;
                nTBActivity.MediaBrowserCompat$CustomActionResultReceiver = i + 1;
                objArr[i] = MediaBrowserCompat$CustomActionResultReceiver;
            }
            return nTBActivity;
        }
    }

    /* renamed from: o.EkycSuccessActivity$write */
    static final class write extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<NTBActivity, HmlPromptPayVerificationActivity.IconCompatParcelizer, NTBActivity> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
            super(2);
        }

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
            NTBActivity nTBActivity = (NTBActivity) obj;
            HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = (HmlPromptPayVerificationActivity.IconCompatParcelizer) obj2;
            onGetStartedClick.write((Object) nTBActivity, "state");
            onGetStartedClick.write((Object) iconCompatParcelizer, "element");
            if (iconCompatParcelizer instanceof closePinLocation) {
                HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity = nTBActivity.IconCompatParcelizer;
                Object[] objArr = nTBActivity.write;
                int i = nTBActivity.MediaBrowserCompat$CustomActionResultReceiver;
                nTBActivity.MediaBrowserCompat$CustomActionResultReceiver = i + 1;
                ((closePinLocation) iconCompatParcelizer).write(hmlPromptPayVerificationActivity, objArr[i]);
            }
            return nTBActivity;
        }
    }
}
