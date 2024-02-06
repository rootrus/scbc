package p040o;

import android.os.SystemClock;
import android.view.View;
import com.scb.phone.view.adapter.prelogin.QuickAccountSelectAdapter;

/* renamed from: o.getCasaTxnList */
public final /* synthetic */ class getCasaTxnList implements View.OnClickListener {
    private final /* synthetic */ QuickAccountSelectAdapter.FooterHolder IconCompatParcelizer;
    private final /* synthetic */ QuickAccountSelectAdapter write;

    public /* synthetic */ getCasaTxnList(QuickAccountSelectAdapter quickAccountSelectAdapter, QuickAccountSelectAdapter.FooterHolder footerHolder) {
        this.write = quickAccountSelectAdapter;
        this.IconCompatParcelizer = footerHolder;
    }

    public final void onClick(View view) {
        QuickAccountSelectAdapter quickAccountSelectAdapter = this.write;
        QuickAccountSelectAdapter.FooterHolder footerHolder = this.IconCompatParcelizer;
        if (SystemClock.elapsedRealtime() - quickAccountSelectAdapter.write >= 600) {
            quickAccountSelectAdapter.write = SystemClock.elapsedRealtime();
            footerHolder.mSwitchCompat.toggle();
            quickAccountSelectAdapter.MediaBrowserCompat$MediaItem = footerHolder.mSwitchCompat.isChecked();
            if (quickAccountSelectAdapter.MediaBrowserCompat$MediaItem) {
                quickAccountSelectAdapter.MediaBrowserCompat$ItemReceiver = quickAccountSelectAdapter.read.size() + 2;
            } else {
                quickAccountSelectAdapter.MediaBrowserCompat$ItemReceiver = 1;
            }
            quickAccountSelectAdapter.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(quickAccountSelectAdapter.MediaBrowserCompat$MediaItem);
            quickAccountSelectAdapter.IconCompatParcelizer.write();
        }
    }
}
