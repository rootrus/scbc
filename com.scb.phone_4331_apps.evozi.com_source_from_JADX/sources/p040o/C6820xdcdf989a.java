package p040o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import p040o.FragmentBuilder_BindSuccessQuickOperationFragment;

/* renamed from: o.FragmentBuilder_BindSuccessQuickOperationFragment$read$MediaBrowserCompat$ItemReceiver */
public final class C6820xdcdf989a extends GestureDetector.SimpleOnGestureListener {
    private /* synthetic */ FragmentBuilder_BindSuccessQuickOperationFragment.read MediaBrowserCompat$ItemReceiver;

    C6820xdcdf989a(FragmentBuilder_BindSuccessQuickOperationFragment.read read) {
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        FragmentBuilder_BindTempLimitHomeFragment MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.read.write;
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return true;
        }
        MediaBrowserCompat$CustomActionResultReceiver.tap();
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        FragmentBuilder_BindTempLimitHomeFragment MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.read.write;
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            MediaBrowserCompat$CustomActionResultReceiver.longTap();
        }
    }
}
