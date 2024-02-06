package com.scb.phone.view.fragment.sme.gifting;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class GiftRecipientFromFavouriteFragment_ViewBinding extends BaseFragment_ViewBinding {
    private GiftRecipientFromFavouriteFragment write;

    public GiftRecipientFromFavouriteFragment_ViewBinding(GiftRecipientFromFavouriteFragment giftRecipientFromFavouriteFragment, View view) {
        super(giftRecipientFromFavouriteFragment, view);
        this.write = giftRecipientFromFavouriteFragment;
        giftRecipientFromFavouriteFragment.emptyCard = onStart.IconCompatParcelizer(view, R.id.vw_favourite_empty, "field 'emptyCard'");
        giftRecipientFromFavouriteFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_favourite, "field 'recyclerView'", RecyclerView.class);
        giftRecipientFromFavouriteFragment.favouriteSuggestion = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_favourite_add_suggestion, "field 'favouriteSuggestion'", TextView.class);
    }

    public final void read() {
        GiftRecipientFromFavouriteFragment giftRecipientFromFavouriteFragment = this.write;
        if (giftRecipientFromFavouriteFragment != null) {
            this.write = null;
            giftRecipientFromFavouriteFragment.emptyCard = null;
            giftRecipientFromFavouriteFragment.recyclerView = null;
            giftRecipientFromFavouriteFragment.favouriteSuggestion = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
