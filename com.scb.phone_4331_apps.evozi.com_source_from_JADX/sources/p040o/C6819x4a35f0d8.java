package p040o;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: o.FragmentBuilder_BindSuccessQuickOperationFragment$MediaBrowserCompat$ItemReceiver */
final class C6819x4a35f0d8 implements View.OnGenericMotionListener {
    private /* synthetic */ FragmentBuilder_BindSuccessQuickOperationFragment MediaBrowserCompat$ItemReceiver;

    C6819x4a35f0d8(FragmentBuilder_BindSuccessQuickOperationFragment fragmentBuilder_BindSuccessQuickOperationFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindSuccessQuickOperationFragment;
    }

    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        WeakReference write = this.MediaBrowserCompat$ItemReceiver.RatingCompat;
        if (write != null) {
            Object obj = null;
            if (write != null) {
                obj = write.get();
            }
            if (obj != null) {
                ((Activity) obj).getWindow().superDispatchGenericMotionEvent(motionEvent);
            } else {
                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Weakreference null.");
            }
        }
        return false;
    }
}
