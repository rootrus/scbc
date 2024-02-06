package p040o;

import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.zal */
public final class zal extends FragmentBuilder_BindSummaryFragment {
    public static BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver(getStartValueInt getstartvalueint) {
        String str = null;
        String str2 = getstartvalueint != null ? getstartvalueint.IconCompatParcelizer : null;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        if (getstartvalueint != null) {
            str = getstartvalueint.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (str != null) {
            str3 = str;
        }
        return new BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver(str2, str3);
    }
}
