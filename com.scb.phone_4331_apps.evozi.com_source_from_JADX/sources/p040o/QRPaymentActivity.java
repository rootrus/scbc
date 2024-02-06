package p040o;

import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.QRPaymentActivity */
public final class QRPaymentActivity extends onSaveClick implements ExpandableListView.OnGroupClickListener {
    private final ExpandableListView.OnGroupClickListener write;

    private QRPaymentActivity(ExpandableListView.OnGroupClickListener onGroupClickListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.write = onGroupClickListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.MediaBrowserCompat$CustomActionResultReceiver.read.size()) {
                break;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i2).MediaSessionCompat$Token) {
                int MediaBrowserCompat$CustomActionResultReceiver = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i2).ParcelableVolumeInfo);
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    i3 += expandableListView.getExpandableListAdapter().getChildrenCount(i4) + 1;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver == i3) {
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Intercept click: ");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
                    sb.append("; group position: ");
                    sb.append(i);
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                    MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i2));
                    break;
                }
            }
            i2++;
        }
        ExpandableListView.OnGroupClickListener onGroupClickListener = this.write;
        if (onGroupClickListener == null || !onGroupClickListener.onGroupClick(expandableListView, view, i, j)) {
            return false;
        }
        return true;
    }

    private static ExpandableListView.OnGroupClickListener MediaBrowserCompat$CustomActionResultReceiver(ExpandableListView expandableListView) {
        try {
            Field declaredField = Class.forName("android.widget.ExpandableListView").getDeclaredField("mOnGroupClickListener");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (ExpandableListView.OnGroupClickListener) declaredField.get(expandableListView);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("OneOnGroupClickListener - Reflection: ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((ExpandableListView) view).setOnGroupClickListener(this.write);
    }

    static boolean MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        ExpandableListView.OnGroupClickListener MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver((ExpandableListView) deejungTransferLandingActivity.IconCompatParcelizer);
        if (MediaBrowserCompat$CustomActionResultReceiver == null || !(MediaBrowserCompat$CustomActionResultReceiver instanceof QRPaymentActivity)) {
            QRPaymentActivity qRPaymentActivity = new QRPaymentActivity(MediaBrowserCompat$CustomActionResultReceiver, deejungTransferLandingActivity);
            ((ExpandableListView) deejungTransferLandingActivity.IconCompatParcelizer).setOnGroupClickListener(qRPaymentActivity);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, qRPaymentActivity);
            return true;
        }
        ((QRPaymentActivity) MediaBrowserCompat$CustomActionResultReceiver).read(deejungTransferLandingActivity);
        return false;
    }
}
