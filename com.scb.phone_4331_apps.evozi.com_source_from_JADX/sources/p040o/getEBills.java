package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.LendingIssuerAdapter;

/* renamed from: o.getEBills */
public final /* synthetic */ class getEBills implements View.OnClickListener {
    private final /* synthetic */ calculateUsedDiskSpaceInBytes MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ LendingIssuerAdapter read;

    public /* synthetic */ getEBills(LendingIssuerAdapter lendingIssuerAdapter, calculateUsedDiskSpaceInBytes calculateuseddiskspaceinbytes) {
        this.read = lendingIssuerAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = calculateuseddiskspaceinbytes;
    }

    public final void onClick(View view) {
        LendingIssuerAdapter lendingIssuerAdapter = this.read;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        LendingIssuerAdapter.IconCompatParcelizer iconCompatParcelizer = lendingIssuerAdapter.write;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.read(str);
        }
    }
}
