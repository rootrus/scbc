package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.scbs.LandingAccountsAdapter;

/* renamed from: o.CloseAccountService */
public final /* synthetic */ class CloseAccountService implements View.OnClickListener {
    private final /* synthetic */ LandingAccountsAdapter.AccountViewHolder MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ NativeSessionFile write;

    public /* synthetic */ CloseAccountService(LandingAccountsAdapter.AccountViewHolder accountViewHolder, NativeSessionFile nativeSessionFile) {
        this.MediaBrowserCompat$ItemReceiver = accountViewHolder;
        this.write = nativeSessionFile;
    }

    public final void onClick(View view) {
        LandingAccountsAdapter.AccountViewHolder accountViewHolder = this.MediaBrowserCompat$ItemReceiver;
        LandingAccountsAdapter.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.write);
    }
}
