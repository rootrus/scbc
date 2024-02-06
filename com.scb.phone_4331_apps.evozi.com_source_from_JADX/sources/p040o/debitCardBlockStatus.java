package p040o;

import android.view.View;
import com.scb.phone.view.adapter.landingpage.TileAdapter;

/* renamed from: o.debitCardBlockStatus */
public final /* synthetic */ class debitCardBlockStatus implements View.OnClickListener {
    private final /* synthetic */ TileAdapter.BaseHolder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ debitCardBlockStatus(TileAdapter.BaseHolder baseHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseHolder;
    }

    public final void onClick(View view) {
        TileAdapter.BaseHolder baseHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        baseHolder.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(baseHolder.PlaybackStateCompat);
    }
}
