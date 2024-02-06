package p040o;

import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;

/* renamed from: o.ActivityBuilder_BindBulkTransferActivity */
public final /* synthetic */ class ActivityBuilder_BindBulkTransferActivity implements Runnable {
    private final /* synthetic */ HmlCalculatorFragment read;

    public /* synthetic */ ActivityBuilder_BindBulkTransferActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.read = hmlCalculatorFragment;
    }

    public final void run() {
        HmlCalculatorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
