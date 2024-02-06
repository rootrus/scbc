package p040o;

import com.scb.phone.p035di.C1860x33cfacb;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$MenuPopupWindow$MenuDropDownListView */
final class zzmd$zzl$MenuPopupWindow$MenuDropDownListView extends C1860x33cfacb.IconCompatParcelizer {
    private /* synthetic */ zzmd.zzl MediaBrowserCompat$ItemReceiver;
    private BillPaymentActivity read;

    private zzmd$zzl$MenuPopupWindow$MenuDropDownListView(zzmd.zzl zzl) {
        this.MediaBrowserCompat$ItemReceiver = zzl;
    }

    /* synthetic */ zzmd$zzl$MenuPopupWindow$MenuDropDownListView(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        BillPaymentActivity billPaymentActivity = (BillPaymentActivity) obj;
        if (billPaymentActivity != null) {
            this.read = billPaymentActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.read != null) {
            return new zzmd.zzl.ScrollingTabContainerView(this.MediaBrowserCompat$ItemReceiver);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(BillPaymentActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
