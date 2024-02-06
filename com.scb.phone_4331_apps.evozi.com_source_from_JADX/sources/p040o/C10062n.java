package p040o;

import com.scb.phone.view.activity.fastpay.FastPayBillPaymentReviewActivity;
import com.scb.phone.view.activity.fastpay.FastPayOtpActivity;
import com.scb.phone.view.activity.fastpay.FastPaySettingActivity;
import com.scb.phone.view.activity.fastpay.FastPayTransferReviewActivity;
import com.scb.phone.view.activity.fastpay.ManageFastPayQrScanActivity;
import com.scb.phone.view.activity.forgotpin.ForgotPinOtpActivity;

/* renamed from: o.n */
public final /* synthetic */ class C10062n implements findFragmentByWho {
    public static final /* synthetic */ C10062n MediaBrowserCompat$ItemReceiver = new C10062n();

    private /* synthetic */ C10062n() {
    }

    /* renamed from: o.n$2 */
    public final class C72612 implements MileageQuantitySelectionActivity<FastPaySettingActivity> {
        public static void read(FastPaySettingActivity fastPaySettingActivity, nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata) {
            fastPaySettingActivity.presenter = nativewritetiffimagewithmetadata;
        }
    }

    /* renamed from: o.n$7 */
    public final class C72667 implements MileageQuantitySelectionActivity<ManageFastPayQrScanActivity> {
        public static void MediaBrowserCompat$ItemReceiver(ManageFastPayQrScanActivity manageFastPayQrScanActivity, releaseFileBuffer releasefilebuffer) {
            manageFastPayQrScanActivity.presenter = releasefilebuffer;
        }
    }

    /* renamed from: o.n$4 */
    public final class C72634 implements MileageQuantitySelectionActivity<FastPayBillPaymentReviewActivity> {
        public static void IconCompatParcelizer(FastPayBillPaymentReviewActivity fastPayBillPaymentReviewActivity, nativeWritePngImage nativewritepngimage) {
            fastPayBillPaymentReviewActivity.fastPayBillPaymentReviewPresenter = nativewritepngimage;
        }
    }

    /* renamed from: o.n$3 */
    public final class C72623 implements MileageQuantitySelectionActivity<FastPayOtpActivity> {
        public static void write(FastPayOtpActivity fastPayOtpActivity, nativeWriteJpegImage nativewritejpegimage) {
            fastPayOtpActivity.presenter = nativewritejpegimage;
        }
    }

    /* renamed from: o.n$6 */
    public final class C72656 implements MileageQuantitySelectionActivity<ForgotPinOtpActivity> {
        public static void MediaBrowserCompat$ItemReceiver(ForgotPinOtpActivity forgotPinOtpActivity, OcrFailureData ocrFailureData) {
            forgotPinOtpActivity.presenter = ocrFailureData;
        }
    }

    /* renamed from: o.n$8 */
    public final class C72678 implements MileageQuantitySelectionActivity<FastPayTransferReviewActivity> {
        public static void MediaBrowserCompat$ItemReceiver(FastPayTransferReviewActivity fastPayTransferReviewActivity, readImageFromFileBuffer readimagefromfilebuffer) {
            fastPayTransferReviewActivity.fastPayTransferReviewPresenter = readimagefromfilebuffer;
        }
    }

    public final Object IconCompatParcelizer(Object obj) {
        return ((getPreviousExpirable) obj).write;
    }
}
