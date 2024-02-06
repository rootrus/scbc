package p040o;

import android.view.MotionEvent;
import android.view.View;
import com.scb.phone.view.activity.ndid.NdidNationalIdInputActivity;

/* renamed from: o.isDayEnabled */
public final /* synthetic */ class isDayEnabled implements View.OnTouchListener {
    private final /* synthetic */ NdidNationalIdInputActivity write;

    public /* synthetic */ isDayEnabled(NdidNationalIdInputActivity ndidNationalIdInputActivity) {
        this.write = ndidNationalIdInputActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.write.MediaSessionCompat$Token();
    }
}
