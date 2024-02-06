package p040o;

import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.activity.investment.onboarding.FundAppFormActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOnboardingSuccessActivity;

/* renamed from: o.PaFaceConstants */
public final /* synthetic */ class PaFaceConstants implements FundAppFormActivity.write {
    private final /* synthetic */ FundAppFormActivity MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.PaFaceConstants$DetectComplete */
    public final /* synthetic */ class DetectComplete implements FundAppFormActivity.write {
        private final /* synthetic */ FundAppFormActivity write;

        public /* synthetic */ DetectComplete(FundAppFormActivity fundAppFormActivity) {
            this.write = fundAppFormActivity;
        }

        public final Fragment MediaBrowserCompat$ItemReceiver() {
            return FundAppFormActivity.AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    /* renamed from: o.PaFaceConstants$InterruptType */
    public final /* synthetic */ class InterruptType implements FundAppFormActivity.write {
        private final /* synthetic */ FundAppFormActivity MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ InterruptType(FundAppFormActivity fundAppFormActivity) {
            this.MediaBrowserCompat$ItemReceiver = fundAppFormActivity;
        }

        public final Fragment MediaBrowserCompat$ItemReceiver() {
            return FundAppFormActivity.AppCompatActivity();
        }
    }

    public /* synthetic */ PaFaceConstants(FundAppFormActivity fundAppFormActivity) {
        this.MediaBrowserCompat$ItemReceiver = fundAppFormActivity;
    }

    public final Fragment MediaBrowserCompat$ItemReceiver() {
        return FundAppFormActivity.setContentView();
    }

    /* renamed from: o.PaFaceConstants$EnvironmentalTips */
    public final /* synthetic */ class EnvironmentalTips implements DebitCardMarketConductDeepLinkActivity {
        private final /* synthetic */ FundOnboardingSuccessActivity MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ EnvironmentalTips(FundOnboardingSuccessActivity fundOnboardingSuccessActivity) {
            this.MediaBrowserCompat$ItemReceiver = fundOnboardingSuccessActivity;
        }

        public final void IconCompatParcelizer(Object obj) {
            Toast.makeText(this.MediaBrowserCompat$ItemReceiver, ((Throwable) obj).getMessage(), 0).show();
        }
    }

    /* renamed from: o.PaFaceConstants$MotionType */
    public final /* synthetic */ class MotionType implements DebitCardMarketConductDeepLinkActivity {
        private final /* synthetic */ FundOnboardingSuccessActivity read;

        public /* synthetic */ MotionType(FundOnboardingSuccessActivity fundOnboardingSuccessActivity) {
            this.read = fundOnboardingSuccessActivity;
        }

        public final void IconCompatParcelizer(Object obj) {
            setUseVideoFrame setusevideoframe = this.read.presenter;
            boolean z = true;
            if (setusevideoframe.read.MediaBrowserCompat$CustomActionResultReceiver.setShortcut()) {
                removeTorchLuminanceListener removetorchluminancelistener = removeTorchLuminanceListener.IconCompatParcelizer;
                if (setusevideoframe.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    removetorchluminancelistener.IconCompatParcelizer(setusevideoframe.RatingCompat);
                    return;
                }
                return;
            }
            BarCodeCaptureView_Factory barCodeCaptureView_Factory = BarCodeCaptureView_Factory.IconCompatParcelizer;
            if (setusevideoframe.RatingCompat == null) {
                z = false;
            }
            if (z) {
                barCodeCaptureView_Factory.IconCompatParcelizer(setusevideoframe.RatingCompat);
            }
        }
    }
}
