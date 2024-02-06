package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.EasycashSalesheetAdapter;

/* renamed from: o.getDealReview */
public final /* synthetic */ class getDealReview implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ EasycashSalesheetAdapter MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getDealReview(EasycashSalesheetAdapter easycashSalesheetAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = easycashSalesheetAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        EasycashSalesheetAdapter easycashSalesheetAdapter = this.MediaBrowserCompat$ItemReceiver;
        easycashSalesheetAdapter.write.read(easycashSalesheetAdapter.read.get(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
