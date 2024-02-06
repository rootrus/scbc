package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingTcActivity;
import p040o.CaptureMessage;

/* renamed from: o.getSilentLivingThr */
public final /* synthetic */ class getSilentLivingThr implements DialogInterface.OnClickListener {
    private final /* synthetic */ ScbsOnboardingTcActivity write;

    public /* synthetic */ getSilentLivingThr(ScbsOnboardingTcActivity scbsOnboardingTcActivity) {
        this.write = scbsOnboardingTcActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CaptureMessage.KUIMessageOrientation kUIMessageOrientation = this.write.presenter;
        setSdkCaptureRequested setsdkcapturerequested = setSdkCaptureRequested.read;
        if (kUIMessageOrientation.RatingCompat != null) {
            setsdkcapturerequested.IconCompatParcelizer(kUIMessageOrientation.RatingCompat);
        }
    }
}
