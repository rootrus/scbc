package p040o;

import android.view.MotionEvent;

/* renamed from: o.setSubmitButtonEnabled */
public final class setSubmitButtonEnabled {
    public static boolean read(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
