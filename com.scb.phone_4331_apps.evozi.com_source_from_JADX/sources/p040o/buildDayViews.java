package p040o;

import android.os.Handler;
import com.scb.phone.view.activity.ndid.NationalIdCameraActivity;

/* renamed from: o.buildDayViews */
public final /* synthetic */ class buildDayViews implements Runnable {
    private final /* synthetic */ NationalIdCameraActivity IconCompatParcelizer;

    public /* synthetic */ buildDayViews(NationalIdCameraActivity nationalIdCameraActivity) {
        this.IconCompatParcelizer = nationalIdCameraActivity;
    }

    public final void run() {
        NationalIdCameraActivity nationalIdCameraActivity = this.IconCompatParcelizer;
        nationalIdCameraActivity.ivCapture.setVisibility(8);
        nationalIdCameraActivity.overlay.setVisibility(8);
        nationalIdCameraActivity.ivArrowBack.setVisibility(8);
        nationalIdCameraActivity.tvTitle.setVisibility(8);
        new Handler().postDelayed(new getFirstDayOfWeek(nationalIdCameraActivity), 200);
    }
}
