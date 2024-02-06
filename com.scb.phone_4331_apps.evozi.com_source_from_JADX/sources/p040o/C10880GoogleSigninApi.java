package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.adapter.bulktransfer.RecipientsAdapter;

/* renamed from: o.GoogleSigninApi  reason: case insensitive filesystem */
public final /* synthetic */ class C10880GoogleSigninApi implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ RecipientsAdapter.RecipientsHolder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C10880GoogleSigninApi(RecipientsAdapter.RecipientsHolder recipientsHolder) {
        this.MediaBrowserCompat$ItemReceiver = recipientsHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        RecipientsAdapter.RecipientsHolder recipientsHolder = this.MediaBrowserCompat$ItemReceiver;
        if (recipientsHolder.Keep != null) {
            recipientsHolder.AlertController$RecycleListView.MediaBrowserCompat$MediaItem = z;
            recipientsHolder.Keep.write();
        }
    }
}
