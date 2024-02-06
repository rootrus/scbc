package p040o;

import android.view.View;
import com.scb.phone.view.adapter.debitcard.SelectionAdapter;

/* renamed from: o.BScanCService */
public final /* synthetic */ class BScanCService implements View.OnClickListener {
    private final /* synthetic */ SelectionAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ BScanCService(SelectionAdapter selectionAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = selectionAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        SelectionAdapter selectionAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        selectionAdapter.MediaBrowserCompat$ItemReceiver.read(this.read);
    }
}
