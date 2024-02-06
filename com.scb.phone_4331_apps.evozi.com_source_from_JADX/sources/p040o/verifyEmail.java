package p040o;

import android.view.View;
import com.scb.phone.view.adapter.ntb.selectaccount.SelectAccountAdapter;

/* renamed from: o.verifyEmail */
public final /* synthetic */ class verifyEmail implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ SelectAccountAdapter MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ verifyEmail(SelectAccountAdapter selectAccountAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = selectAccountAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        SelectAccountAdapter selectAccountAdapter = this.MediaBrowserCompat$ItemReceiver;
        selectAccountAdapter.write.write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
