package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.EBillAmountFragment;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment.EBillAmountFragment$MediaBrowserCompat$ItemReceiver;
import java.text.NumberFormat;
import p040o.CrashlyticsReport;

/* renamed from: o.getLendingIssuer */
public final class getLendingIssuer extends setCardElevation implements EBillAmountFragment$MediaBrowserCompat$ItemReceiver {
    private Context IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver = -1;
    private int[] MediaBrowserCompat$ItemReceiver = {R.string.full_amount, R.string.minimum_amount, R.string.specify_amount};
    private CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder read;
    private Double write = Double.valueOf(0.0d);

    public getLendingIssuer(setTitleMarginStart settitlemarginstart, Context context, CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder) {
        super(settitlemarginstart);
        this.IconCompatParcelizer = context;
        this.read = builder;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return EBillAmountFragment.write(this.read.AlertController$RecycleListView, "", "");
        }
        if (i == 1) {
            return EBillAmountFragment.write("", this.read.PlaybackStateCompat, "");
        }
        if (i != 2) {
            return null;
        }
        EBillAmountFragment write2 = EBillAmountFragment.write("", "", getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(NumberFormat.getCurrencyInstance()).format(this.write));
        write2.IconCompatParcelizer = this;
        return write2;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.IconCompatParcelizer.getString(this.MediaBrowserCompat$ItemReceiver[i]);
    }

    public final void IconCompatParcelizer(double d) {
        this.write = Double.valueOf(d);
    }

    public final Double IconCompatParcelizer() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i == 1) {
            return getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.read.PlaybackStateCompat);
        }
        if (i != 2) {
            return getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.read.AlertController$RecycleListView);
        }
        return this.write;
    }
}
