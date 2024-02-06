package com.scb.phone.view.fragment.sme.gifting;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class GiftSelectionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private GiftSelectionFragment MediaBrowserCompat$ItemReceiver;

    public GiftSelectionFragment_ViewBinding(GiftSelectionFragment giftSelectionFragment, View view) {
        super(giftSelectionFragment, view);
        this.MediaBrowserCompat$ItemReceiver = giftSelectionFragment;
        giftSelectionFragment.moneyPresentText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.money_present_text, "field 'moneyPresentText'", TextView.class);
        giftSelectionFragment.errorLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_layout, "field 'errorLayout'", LinearLayout.class);
        giftSelectionFragment.moneyPresentRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.money_present_rv, "field 'moneyPresentRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        GiftSelectionFragment giftSelectionFragment = this.MediaBrowserCompat$ItemReceiver;
        if (giftSelectionFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            giftSelectionFragment.moneyPresentText = null;
            giftSelectionFragment.errorLayout = null;
            giftSelectionFragment.moneyPresentRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
