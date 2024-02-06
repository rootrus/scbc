package p040o;

import com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentSuccessFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributesPartnerDiscoverWebViewActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6327xab7aa57 implements HistoryAdapter$GroupFooterViewHolder {
    private final WeakReference<BillPaymentSuccessFragment> IconCompatParcelizer;
    private final boolean read;

    /* synthetic */ C6327xab7aa57(BillPaymentSuccessFragment billPaymentSuccessFragment, boolean z, byte b) {
        this(billPaymentSuccessFragment, z);
    }

    private C6327xab7aa57(BillPaymentSuccessFragment billPaymentSuccessFragment, boolean z) {
        this.IconCompatParcelizer = new WeakReference<>(billPaymentSuccessFragment);
        this.read = z;
    }

    public final void write() {
        BillPaymentSuccessFragment billPaymentSuccessFragment = this.IconCompatParcelizer.get();
        if (billPaymentSuccessFragment != null) {
            billPaymentSuccessFragment.requestPermissions(ActivityBuilder_ContributesPartnerDiscoverWebViewActivity.write, 6);
        }
    }

    public final void read() {
        if (this.IconCompatParcelizer.get() != null) {
            BillPaymentSuccessFragment.MediaBrowserCompat$MediaItem();
        }
    }

    public final void IconCompatParcelizer() {
        BillPaymentSuccessFragment billPaymentSuccessFragment = this.IconCompatParcelizer.get();
        if (billPaymentSuccessFragment != null) {
            billPaymentSuccessFragment.IconCompatParcelizer(this.read);
        }
    }
}
