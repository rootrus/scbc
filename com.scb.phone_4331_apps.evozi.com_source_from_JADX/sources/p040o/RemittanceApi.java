package p040o;

import android.view.View;
import com.scb.phone.view.adapter.closeaccount.AccountTargetAdapter;

/* renamed from: o.RemittanceApi */
public final /* synthetic */ class RemittanceApi implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ AccountTargetAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ RemittanceApi(AccountTargetAdapter accountTargetAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = accountTargetAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        AccountTargetAdapter accountTargetAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        accountTargetAdapter.write.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
    }
}
