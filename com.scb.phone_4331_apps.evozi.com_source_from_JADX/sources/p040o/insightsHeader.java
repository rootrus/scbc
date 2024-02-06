package p040o;

import android.view.View;
import com.scb.phone.view.adapter.ccrredemption.product.EligiblePrivilegesAdapter;

/* renamed from: o.insightsHeader */
public final /* synthetic */ class insightsHeader implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ EligiblePrivilegesAdapter write;

    public /* synthetic */ insightsHeader(EligiblePrivilegesAdapter eligiblePrivilegesAdapter, int i) {
        this.write = eligiblePrivilegesAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        EligiblePrivilegesAdapter eligiblePrivilegesAdapter = this.write;
        eligiblePrivilegesAdapter.read.MediaBrowserCompat$ItemReceiver(eligiblePrivilegesAdapter.MediaBrowserCompat$CustomActionResultReceiver.get(this.IconCompatParcelizer));
    }
}
