package p040o;

import com.scb.phone.view.activity.ndid.NationalIdCameraActivity;

/* renamed from: o.getFirstDayOfWeek */
public final /* synthetic */ class getFirstDayOfWeek implements Runnable {
    private final /* synthetic */ NationalIdCameraActivity read;

    public /* synthetic */ getFirstDayOfWeek(NationalIdCameraActivity nationalIdCameraActivity) {
        this.read = nationalIdCameraActivity;
    }

    public final void run() {
        NationalIdCameraActivity nationalIdCameraActivity = this.read;
        nationalIdCameraActivity.setResult(-1);
        nationalIdCameraActivity.finish();
    }
}
