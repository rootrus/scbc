package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;

/* renamed from: o.pm */
public final /* synthetic */ class C10107pm implements DialogInterface.OnClickListener {
    private final /* synthetic */ ManageEmailLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C10107pm(ManageEmailLandingActivity manageEmailLandingActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = manageEmailLandingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        setShadowDetection setshadowdetection = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        setGlareDetection setglaredetection = setGlareDetection.write;
        if (setshadowdetection.RatingCompat != null) {
            setglaredetection.IconCompatParcelizer(setshadowdetection.RatingCompat);
        }
        dialogInterface.dismiss();
    }
}
