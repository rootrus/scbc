package p040o;

import android.view.View;
import android.widget.AdapterView;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.QRPaymentActivity_ViewBinding */
public final class QRPaymentActivity_ViewBinding extends onSaveClick implements AdapterView.OnItemSelectedListener {
    private final AdapterView.OnItemSelectedListener read;

    private QRPaymentActivity_ViewBinding(AdapterView.OnItemSelectedListener onItemSelectedListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
        this.read = onItemSelectedListener;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = 0;
        while (true) {
            if (i2 < this.MediaBrowserCompat$CustomActionResultReceiver.read.size()) {
                if (i == DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i2).ParcelableVolumeInfo) && this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i2).MediaSessionCompat$Token) {
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Selected item ");
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
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.read;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i, j);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append(" Nothing selected. ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.read;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((AdapterView) view).setOnItemSelectedListener(this.read);
    }

    static boolean write(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        AdapterView.OnItemSelectedListener onItemSelectedListener = ((AdapterView) deejungTransferLandingActivity.IconCompatParcelizer).getOnItemSelectedListener();
        if (onItemSelectedListener == null || !(onItemSelectedListener instanceof QRPaymentActivity_ViewBinding)) {
            QRPaymentActivity_ViewBinding qRPaymentActivity_ViewBinding = new QRPaymentActivity_ViewBinding(onItemSelectedListener, deejungTransferLandingActivity);
            ((AdapterView) deejungTransferLandingActivity.IconCompatParcelizer).setOnItemSelectedListener(qRPaymentActivity_ViewBinding);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, qRPaymentActivity_ViewBinding);
            return true;
        }
        ((QRPaymentActivity_ViewBinding) onItemSelectedListener).read(deejungTransferLandingActivity);
        return false;
    }
}
