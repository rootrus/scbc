package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.chequemanagement.chequestatus.ChequeStatusFragment;

/* renamed from: o.productAddress */
public final class productAddress extends setCardElevation {
    private Context IconCompatParcelizer;
    private ChequeStatusFragment MediaBrowserCompat$CustomActionResultReceiver;
    private ChequeStatusFragment read;
    private int[] write = {R.string.cheque_status_tab_received, R.string.cheque_status_tab_issued};

    public productAddress(setTitleMarginStart settitlemarginstart, Context context, int i, int i2) {
        super(settitlemarginstart);
        this.IconCompatParcelizer = context;
        this.read = ChequeStatusFragment.IconCompatParcelizer(true, i);
        this.MediaBrowserCompat$CustomActionResultReceiver = ChequeStatusFragment.IconCompatParcelizer(false, i2);
    }

    public final int getCount() {
        return this.write.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.IconCompatParcelizer.getString(this.write[i]);
    }

    public final /* bridge */ /* synthetic */ Fragment read(int i) {
        if (i == 0) {
            return this.read;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}
