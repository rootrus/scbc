package p040o;

import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.MyQRMenuActivity */
public final class MyQRMenuActivity extends onSaveClick implements ExpandableListView.OnChildClickListener {
    private final ExpandableListView.OnChildClickListener IconCompatParcelizer;

    private MyQRMenuActivity(ExpandableListView.OnChildClickListener onChildClickListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.IconCompatParcelizer = onChildClickListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        int i3 = i;
        int i4 = i2;
        int i5 = 0;
        while (true) {
            if (i5 >= this.MediaBrowserCompat$CustomActionResultReceiver.read.size()) {
                break;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i5).MediaSessionCompat$Token) {
                int MediaBrowserCompat$CustomActionResultReceiver = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i5).ParcelableVolumeInfo);
                int i6 = 0;
                for (int i7 = 0; i7 < i3; i7++) {
                    i6 += expandableListView.getExpandableListAdapter().getChildrenCount(i7) + 1;
                }
                if (i6 + i4 + 1 == MediaBrowserCompat$CustomActionResultReceiver) {
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Intercept click: ");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
                    sb.append("; group position: ");
                    sb.append(i);
                    sb.append(", child position: ");
                    sb.append(i2);
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i5));
                    break;
                }
            }
            i5++;
        }
        ExpandableListView.OnChildClickListener onChildClickListener = this.IconCompatParcelizer;
        if (onChildClickListener == null || !onChildClickListener.onChildClick(expandableListView, view, i, i2, j)) {
            return false;
        }
        return true;
    }

    private static ExpandableListView.OnChildClickListener MediaBrowserCompat$CustomActionResultReceiver(ExpandableListView expandableListView) {
        try {
            Field declaredField = Class.forName("android.widget.ExpandableListView").getDeclaredField("mOnChildClickListener");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (ExpandableListView.OnChildClickListener) declaredField.get(expandableListView);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnChildClickListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((ExpandableListView) view).setOnChildClickListener(this.IconCompatParcelizer);
    }

    static boolean MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        ExpandableListView.OnChildClickListener MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver((ExpandableListView) deejungTransferLandingActivity.IconCompatParcelizer);
        if (MediaBrowserCompat$CustomActionResultReceiver == null || !(MediaBrowserCompat$CustomActionResultReceiver instanceof MyQRMenuActivity)) {
            MyQRMenuActivity myQRMenuActivity = new MyQRMenuActivity(MediaBrowserCompat$CustomActionResultReceiver, deejungTransferLandingActivity);
            ((ExpandableListView) deejungTransferLandingActivity.IconCompatParcelizer).setOnChildClickListener(myQRMenuActivity);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, myQRMenuActivity);
            return true;
        }
        ((MyQRMenuActivity) MediaBrowserCompat$CustomActionResultReceiver).read(deejungTransferLandingActivity);
        return false;
    }
}
