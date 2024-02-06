package p040o;

import android.view.View;
import com.scb.phone.view.adapter.loan.SmeLoanDetailLgItemAdapter;

/* renamed from: o.getBusinessOwnerApplicationById */
public final /* synthetic */ class getBusinessOwnerApplicationById implements View.OnClickListener {
    private final /* synthetic */ SmeLoanDetailLgItemAdapter read;

    public /* synthetic */ getBusinessOwnerApplicationById(SmeLoanDetailLgItemAdapter smeLoanDetailLgItemAdapter) {
        this.read = smeLoanDetailLgItemAdapter;
    }

    public final void onClick(View view) {
        this.read.MediaBrowserCompat$ItemReceiver(view);
    }
}
