package p040o;

import android.view.View;
import com.scb.phone.view.adapter.requesttopay.IncomingAdapter;

/* renamed from: o.getDonationDocument */
public final /* synthetic */ class getDonationDocument implements View.OnClickListener {
    private final /* synthetic */ IncomingAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ getDonationDocument(IncomingAdapter incomingAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = incomingAdapter;
        this.write = i;
    }

    public final void onClick(View view) {
        IncomingAdapter incomingAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.write;
        IncomingAdapter.read read = incomingAdapter.MediaBrowserCompat$ItemReceiver;
        if (read != null) {
            read.write(i);
        }
    }
}
