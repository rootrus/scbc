package com.scb.phone.view.fragment.landingpage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public class GroupFavoriteFragment_ViewBinding extends BaseDragAndDropFragment_ViewBinding {
    private GroupFavoriteFragment IconCompatParcelizer;

    public GroupFavoriteFragment_ViewBinding(GroupFavoriteFragment groupFavoriteFragment, View view) {
        super(groupFavoriteFragment, view);
        this.IconCompatParcelizer = groupFavoriteFragment;
        groupFavoriteFragment.mRemoveTileLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remove_tile_relative_layout, "field 'mRemoveTileLayout'", RelativeLayout.class);
        groupFavoriteFragment.mTrashImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.trash_image_view, "field 'mTrashImageView'", ImageView.class);
        groupFavoriteFragment.mRemoveTileTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remove_tile_text_view, "field 'mRemoveTileTextView'", TextView.class);
        groupFavoriteFragment.mEmptyTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_text_view, "field 'mEmptyTextView'", TextView.class);
    }

    public final void read() {
        GroupFavoriteFragment groupFavoriteFragment = this.IconCompatParcelizer;
        if (groupFavoriteFragment != null) {
            this.IconCompatParcelizer = null;
            groupFavoriteFragment.mRemoveTileLayout = null;
            groupFavoriteFragment.mTrashImageView = null;
            groupFavoriteFragment.mRemoveTileTextView = null;
            groupFavoriteFragment.mEmptyTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
