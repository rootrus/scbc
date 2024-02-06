package p040o;

import android.view.View;
import com.scb.phone.view.adapter.ntb.selectaccount.SelectAccountAdapter;

/* renamed from: o.DepositService */
public final /* synthetic */ class DepositService implements View.OnClickListener {
    private final /* synthetic */ SelectAccountAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ DepositService(SelectAccountAdapter selectAccountAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = selectAccountAdapter;
        this.write = i;
    }

    public final void onClick(View view) {
        SelectAccountAdapter selectAccountAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        selectAccountAdapter.write.MediaBrowserCompat$ItemReceiver(this.write);
    }
}
