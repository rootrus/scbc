package p040o;

import android.view.View;
import android.widget.AdapterView;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.QRPaymentCoachMarkActivity */
public final class QRPaymentCoachMarkActivity extends onSaveClick implements AdapterView.OnItemClickListener {
    private final AdapterView.OnItemClickListener IconCompatParcelizer;

    private QRPaymentCoachMarkActivity(AdapterView.OnItemClickListener onItemClickListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.IconCompatParcelizer = onItemClickListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        View view2;
        int i2 = 0;
        while (true) {
            if (i2 < this.MediaBrowserCompat$CustomActionResultReceiver.read.size()) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i2).IconCompatParcelizer.getClass().getCanonicalName().contains("se.emilsjolander.stickylistheaders.WrapperView")) {
                    view2 = BulkTransferSuccessActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i2).IconCompatParcelizer);
                } else {
                    view2 = this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i2).IconCompatParcelizer;
                }
                if (view2 != null && view2.equals(view)) {
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Click on item ");
                    sb.append(i);
                    sb.append(". ");
                    sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i2));
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        AdapterView.OnItemClickListener onItemClickListener = this.IconCompatParcelizer;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((AdapterView) view).setOnItemClickListener(this.IconCompatParcelizer);
    }

    public static boolean write(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        AdapterView.OnItemClickListener onItemClickListener = ((AdapterView) deejungTransferLandingActivity.IconCompatParcelizer).getOnItemClickListener();
        if (onItemClickListener == null || !(onItemClickListener instanceof QRPaymentCoachMarkActivity)) {
            QRPaymentCoachMarkActivity qRPaymentCoachMarkActivity = new QRPaymentCoachMarkActivity(onItemClickListener, deejungTransferLandingActivity);
            ((AdapterView) deejungTransferLandingActivity.IconCompatParcelizer).setOnItemClickListener(new QRPaymentCoachMarkActivity(onItemClickListener, deejungTransferLandingActivity));
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, qRPaymentCoachMarkActivity);
            return true;
        }
        ((QRPaymentCoachMarkActivity) onItemClickListener).read(deejungTransferLandingActivity);
        return false;
    }
}
