package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomFavoriteHeaderSection;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FavouriteTargetFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FavouriteTargetFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public FavouriteTargetFragment_ViewBinding(final FavouriteTargetFragment favouriteTargetFragment, View view) {
        super(favouriteTargetFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = favouriteTargetFragment;
        favouriteTargetFragment.mCustomFavoriteHeaderSection = (CustomFavoriteHeaderSection) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.favourite_custom_header, "field 'mCustomFavoriteHeaderSection'", CustomFavoriteHeaderSection.class);
        favouriteTargetFragment.mFavouriteTargetRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_favourite_target, "field 'mFavouriteTargetRecyclerView'", RecyclerView.class);
        favouriteTargetFragment.mFavouriteEmpty = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_favourite_empty, "field 'mFavouriteEmpty'", LinearLayout.class);
        favouriteTargetFragment.mFavouriteEmptySuggestion = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_favourite_add_suggestion, "field 'mFavouriteEmptySuggestion'", TextView.class);
        favouriteTargetFragment.mFavouriteAddIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_add_icon, "field 'mFavouriteAddIcon'", ImageView.class);
        favouriteTargetFragment.mFavouriteEmptySuggestionWithImage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_favourite_add_suggestion_with_image, "field 'mFavouriteEmptySuggestionWithImage'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.vw_error_view, "field 'mError' and method 'onErrorViewClicked'");
        favouriteTargetFragment.mError = IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FavouriteTargetFragment.this.onErrorViewClicked();
            }
        });
    }

    public final void read() {
        FavouriteTargetFragment favouriteTargetFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (favouriteTargetFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            favouriteTargetFragment.mCustomFavoriteHeaderSection = null;
            favouriteTargetFragment.mFavouriteTargetRecyclerView = null;
            favouriteTargetFragment.mFavouriteEmpty = null;
            favouriteTargetFragment.mFavouriteEmptySuggestion = null;
            favouriteTargetFragment.mFavouriteAddIcon = null;
            favouriteTargetFragment.mFavouriteEmptySuggestionWithImage = null;
            favouriteTargetFragment.mError = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
