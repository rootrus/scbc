package p040o;

import com.scb.phone.view.activity.directdebit.DirectDebitOtpActivity;
import com.scb.phone.view.activity.hml.HmlBaseSuccessActivity;
import p040o.Page;
import p040o.access$2300;

/* renamed from: o.t */
public final /* synthetic */ class C10155t implements FundFactSheetActivity {
    private final /* synthetic */ setImageBitmapInternal write;

    public /* synthetic */ C10155t(setImageBitmapInternal setimagebitmapinternal) {
        this.write = setimagebitmapinternal;
    }

    /* renamed from: o.t$2 */
    public final class C74922 implements MileageQuantitySelectionActivity<HmlBaseSuccessActivity> {
        public static void MediaBrowserCompat$CustomActionResultReceiver(HmlBaseSuccessActivity hmlBaseSuccessActivity, Page.Side side) {
            hmlBaseSuccessActivity.presenter = side;
        }
    }

    /* renamed from: o.t$a */
    public final class C7493a implements MileageQuantitySelectionActivity<DirectDebitOtpActivity> {
        public static void MediaBrowserCompat$CustomActionResultReceiver(DirectDebitOtpActivity directDebitOtpActivity, nativeGetImage nativegetimage) {
            directDebitOtpActivity.presenter = nativegetimage;
        }
    }

    public final Object invoke(Object obj) {
        setImageBitmapInternal setimagebitmapinternal = this.write;
        setimagebitmapinternal.MediaBrowserCompat$ItemReceiver(setimagebitmapinternal.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((Throwable) obj, access$2300.write.JUST_DISMISS));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
