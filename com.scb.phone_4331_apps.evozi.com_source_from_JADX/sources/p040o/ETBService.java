package p040o;

import android.view.View;
import com.scb.phone.view.adapter.requesttopay.OutgoingAdapter;

/* renamed from: o.ETBService */
public final /* synthetic */ class ETBService implements View.OnClickListener {
    private final /* synthetic */ OutgoingAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ ETBService(OutgoingAdapter outgoingAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = outgoingAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        OutgoingAdapter outgoingAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.read;
        OutgoingAdapter.read read2 = outgoingAdapter.MediaBrowserCompat$ItemReceiver;
        if (read2 != null) {
            read2.read(i);
        }
    }
}
