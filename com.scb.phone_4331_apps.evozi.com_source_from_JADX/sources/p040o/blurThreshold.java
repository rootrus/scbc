package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingTcActivity;
import p040o.CaptureMessage;

/* renamed from: o.blurThreshold */
public final /* synthetic */ class blurThreshold implements DialogInterface.OnClickListener {
    private final /* synthetic */ ScbsOnboardingTcActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ blurThreshold(ScbsOnboardingTcActivity scbsOnboardingTcActivity) {
        this.MediaBrowserCompat$ItemReceiver = scbsOnboardingTcActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CaptureMessage.KUIMessageOrientation kUIMessageOrientation = this.MediaBrowserCompat$ItemReceiver.presenter;
        inject_licenseOverlay inject_licenseoverlay = inject_licenseOverlay.MediaBrowserCompat$CustomActionResultReceiver;
        if (kUIMessageOrientation.RatingCompat != null) {
            inject_licenseoverlay.IconCompatParcelizer(kUIMessageOrientation.RatingCompat);
        }
    }
}
