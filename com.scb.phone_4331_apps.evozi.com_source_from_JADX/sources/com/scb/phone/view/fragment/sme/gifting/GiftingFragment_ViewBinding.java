package com.scb.phone.view.fragment.sme.gifting;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class GiftingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private GiftingFragment write;

    public GiftingFragment_ViewBinding(GiftingFragment giftingFragment, View view) {
        super(giftingFragment, view);
        this.write = giftingFragment;
        giftingFragment.giftsRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gifts_recycler_view, "field 'giftsRecyclerView'", RecyclerView.class);
        giftingFragment.giftsEmptyArea = onStart.IconCompatParcelizer(view, R.id.gifts_empty_msg, "field 'giftsEmptyArea'");
        giftingFragment.giftsEmptyMsg = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gifts_empty_msg_text, "field 'giftsEmptyMsg'", TextView.class);
    }

    public final void read() {
        GiftingFragment giftingFragment = this.write;
        if (giftingFragment != null) {
            this.write = null;
            giftingFragment.giftsRecyclerView = null;
            giftingFragment.giftsEmptyArea = null;
            giftingFragment.giftsEmptyMsg = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
