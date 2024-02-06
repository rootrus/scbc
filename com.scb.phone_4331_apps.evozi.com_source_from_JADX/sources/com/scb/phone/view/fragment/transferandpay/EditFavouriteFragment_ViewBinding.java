package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EditFavouriteFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EditFavouriteFragment IconCompatParcelizer;
    private View write;

    public EditFavouriteFragment_ViewBinding(final EditFavouriteFragment editFavouriteFragment, View view) {
        super(editFavouriteFragment, view);
        this.IconCompatParcelizer = editFavouriteFragment;
        editFavouriteFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_edit_favourite, "field 'mRecyclerView'", RecyclerView.class);
        editFavouriteFragment.mFavouriteEmpty = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_favourite_empty, "field 'mFavouriteEmpty'", LinearLayout.class);
        editFavouriteFragment.favouriteEmptySuggestion = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_favourite_add_suggestion, "field 'favouriteEmptySuggestion'", TextView.class);
        editFavouriteFragment.favouriteAddIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_add_icon, "field 'favouriteAddIcon'", ImageView.class);
        editFavouriteFragment.favouriteEmptySuggestionWithImage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_favourite_add_suggestion_with_image, "field 'favouriteEmptySuggestionWithImage'", TextView.class);
        editFavouriteFragment.favouriteEmptySuggestionTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_favourite_add_title, "field 'favouriteEmptySuggestionTitle'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.vw_error_view, "field 'mError' and method 'onErrorViewClicked'");
        editFavouriteFragment.mError = IconCompatParcelizer2;
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EditFavouriteFragment.this.onErrorViewClicked();
            }
        });
    }

    public final void read() {
        EditFavouriteFragment editFavouriteFragment = this.IconCompatParcelizer;
        if (editFavouriteFragment != null) {
            this.IconCompatParcelizer = null;
            editFavouriteFragment.mRecyclerView = null;
            editFavouriteFragment.mFavouriteEmpty = null;
            editFavouriteFragment.favouriteEmptySuggestion = null;
            editFavouriteFragment.favouriteAddIcon = null;
            editFavouriteFragment.favouriteEmptySuggestionWithImage = null;
            editFavouriteFragment.favouriteEmptySuggestionTitle = null;
            editFavouriteFragment.mError = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
