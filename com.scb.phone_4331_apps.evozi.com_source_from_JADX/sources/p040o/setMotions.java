package p040o;

import android.view.MotionEvent;
import android.view.View;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;

/* renamed from: o.setMotions */
public final /* synthetic */ class setMotions implements View.OnTouchListener {
    private final /* synthetic */ getRangeIndex IconCompatParcelizer;

    public /* synthetic */ setMotions(getRangeIndex getrangeindex) {
        this.IconCompatParcelizer = getrangeindex;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        getRangeIndex getrangeindex = this.IconCompatParcelizer;
        view.performClick();
        getrangeindex.MediaBrowserCompat$CustomActionResultReceiver = true;
        ((MwBusinessDetailsActivity) getrangeindex.write).PlaybackStateCompat$CustomAction();
        return false;
    }
}
