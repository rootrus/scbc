package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SelectRecipientFromFavouriteFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private SelectRecipientFromFavouriteFragment MediaBrowserCompat$ItemReceiver;

    public SelectRecipientFromFavouriteFragment_ViewBinding(final SelectRecipientFromFavouriteFragment selectRecipientFromFavouriteFragment, View view) {
        super(selectRecipientFromFavouriteFragment, view);
        this.MediaBrowserCompat$ItemReceiver = selectRecipientFromFavouriteFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_add, "field 'addButton' and method 'onAddButtonClick'");
        selectRecipientFromFavouriteFragment.addButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.button_add, "field 'addButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SelectRecipientFromFavouriteFragment.this.onAddButtonClick();
            }
        });
        selectRecipientFromFavouriteFragment.emptyCard = onStart.IconCompatParcelizer(view, R.id.vw_favourite_empty, "field 'emptyCard'");
        selectRecipientFromFavouriteFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_favourite, "field 'recyclerView'", RecyclerView.class);
        selectRecipientFromFavouriteFragment.favouriteSuggestion = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_favourite_add_suggestion, "field 'favouriteSuggestion'", TextView.class);
        selectRecipientFromFavouriteFragment.favouriteTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'favouriteTitle'", TextView.class);
    }

    public final void read() {
        SelectRecipientFromFavouriteFragment selectRecipientFromFavouriteFragment = this.MediaBrowserCompat$ItemReceiver;
        if (selectRecipientFromFavouriteFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            selectRecipientFromFavouriteFragment.addButton = null;
            selectRecipientFromFavouriteFragment.emptyCard = null;
            selectRecipientFromFavouriteFragment.recyclerView = null;
            selectRecipientFromFavouriteFragment.favouriteSuggestion = null;
            selectRecipientFromFavouriteFragment.favouriteTitle = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
