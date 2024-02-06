package p040o;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: o.kK */
public final /* synthetic */ class C7188kK implements View.OnTouchListener {
    public static final /* synthetic */ C7188kK MediaBrowserCompat$CustomActionResultReceiver = new C7188kK();

    private /* synthetic */ C7188kK() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return view.requestFocusFromTouch();
    }
}
