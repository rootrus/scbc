package p040o;

import android.view.View;
import com.scb.phone.view.adapter.ntb.selectaccount.SelectAccountAdapter;

/* renamed from: o.getSetupResult */
public final /* synthetic */ class getSetupResult implements View.OnClickListener {
    private final /* synthetic */ SelectAccountAdapter IconCompatParcelizer;
    private final /* synthetic */ int read;

    public /* synthetic */ getSetupResult(SelectAccountAdapter selectAccountAdapter, int i) {
        this.IconCompatParcelizer = selectAccountAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        SelectAccountAdapter selectAccountAdapter = this.IconCompatParcelizer;
        selectAccountAdapter.write.MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
