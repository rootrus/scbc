package p040o;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* renamed from: o.BillPaymentSearchAdapter$BillPaymentSearchViewHolder_ViewBinding */
public final class BillPaymentSearchAdapter$BillPaymentSearchViewHolder_ViewBinding implements AccountSummaryDeepLinkActivity<List<Address>> {
    private final Locale IconCompatParcelizer;
    private final Context MediaBrowserCompat$CustomActionResultReceiver;
    private final double MediaBrowserCompat$ItemReceiver;
    private final double read;
    private final int write;

    public static DebitCardResetOtpActivity<List<Address>> IconCompatParcelizer(Context context, TransferToMeStep1Adapter$LocalViewHolder transferToMeStep1Adapter$LocalViewHolder, Locale locale, double d, double d2, int i) {
        return DebitCardResetOtpActivity.create(new BillPaymentSearchAdapter$BillPaymentSearchViewHolder_ViewBinding(context, locale, d, d2, 20)).compose(new C7088x8ecc07bc(transferToMeStep1Adapter$LocalViewHolder.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver));
    }

    private BillPaymentSearchAdapter$BillPaymentSearchViewHolder_ViewBinding(Context context, Locale locale, double d, double d2, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.read = d;
        this.MediaBrowserCompat$ItemReceiver = d2;
        this.write = i;
        this.IconCompatParcelizer = locale;
    }

    public final void read(onOkClick<List<Address>> onokclick) throws Exception {
        try {
            List<Address> fromLocation = new Geocoder(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer).getFromLocation(this.read, this.MediaBrowserCompat$ItemReceiver, this.write);
            if (!onokclick.isDisposed()) {
                onokclick.MediaBrowserCompat$CustomActionResultReceiver(fromLocation);
                onokclick.MediaBrowserCompat$CustomActionResultReceiver();
            }
        } catch (IOException unused) {
            if (!onokclick.isDisposed()) {
                DebitCardResetOtpActivity.create(new TransferToOthersStep1Adapter$LocalViewHolder_ViewBinding(this.IconCompatParcelizer, this.read, this.MediaBrowserCompat$ItemReceiver, this.write)).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new TransferToOthersStep1Adapter$LocalViewHolder(onokclick));
            }
        }
    }
}
