package p040o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.C0065xe743b54a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.BulkTransferInfoActivity_ViewBinding */
public final class BulkTransferInfoActivity_ViewBinding extends onSaveClick implements C0065xe743b54a {
    private GestureDetector read = new GestureDetector(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat(), new GestureDetector.SimpleOnGestureListener() {
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    });

    private BulkTransferInfoActivity_ViewBinding(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final boolean IconCompatParcelizer(RecyclerView recyclerView, MotionEvent motionEvent) {
        View write = recyclerView.write(motionEvent.getX(), motionEvent.getY());
        if (write != null && this.read.onTouchEvent(motionEvent)) {
            int i = 0;
            while (true) {
                if (i >= this.MediaBrowserCompat$CustomActionResultReceiver.read.size()) {
                    break;
                } else if (write.equals(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i).IconCompatParcelizer)) {
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onItemClick ");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i).ParcelableVolumeInfo);
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                    MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i));
                    break;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, MotionEvent motionEvent) {
        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append("onTouchEvent ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append("onRequestDisallowInterceptTouchEvent ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
    }

    private static ArrayList<C0065xe743b54a> read(View view) {
        try {
            Field declaredField = Class.forName("androidx.recyclerview.widget.RecyclerView").getDeclaredField("mOnItemTouchListeners");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (ArrayList) declaredField.get(view);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneRecyclerOnItemTouchListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.mOnItemTouchListeners.remove(this);
        if (recyclerView.RatingCompat == this) {
            recyclerView.RatingCompat = null;
        }
    }

    static boolean IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        ArrayList<C0065xe743b54a> read2 = read(deejungTransferLandingActivity.IconCompatParcelizer);
        if (read2 != null) {
            Iterator<C0065xe743b54a> it = read2.iterator();
            while (it.hasNext()) {
                C0065xe743b54a next = it.next();
                if (next != null && (next instanceof BulkTransferInfoActivity_ViewBinding)) {
                    ((BulkTransferInfoActivity_ViewBinding) next).read(deejungTransferLandingActivity);
                    return false;
                }
            }
        }
        BulkTransferInfoActivity_ViewBinding bulkTransferInfoActivity_ViewBinding = new BulkTransferInfoActivity_ViewBinding(deejungTransferLandingActivity);
        ((RecyclerView) deejungTransferLandingActivity.IconCompatParcelizer).mOnItemTouchListeners.add(new BulkTransferInfoActivity_ViewBinding(deejungTransferLandingActivity));
        BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, bulkTransferInfoActivity_ViewBinding);
        return true;
    }
}
