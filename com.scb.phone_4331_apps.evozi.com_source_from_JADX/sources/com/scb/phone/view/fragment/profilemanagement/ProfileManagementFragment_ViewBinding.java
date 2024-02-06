package com.scb.phone.view.fragment.profilemanagement;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ProfileManagementFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ProfileManagementFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public ProfileManagementFragment_ViewBinding(final ProfileManagementFragment profileManagementFragment, View view) {
        super(profileManagementFragment, view);
        this.IconCompatParcelizer = profileManagementFragment;
        profileManagementFragment.userNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.user_name, "field 'userNameTextView'", TextView.class);
        profileManagementFragment.avatarImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.avatar_image_view, "field 'avatarImageView'", ImageView.class);
        profileManagementFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.profile_management_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.select_image, "method 'onSelectImageClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ProfileManagementFragment.this.onSelectImageClicked();
            }
        });
    }

    public final void read() {
        ProfileManagementFragment profileManagementFragment = this.IconCompatParcelizer;
        if (profileManagementFragment != null) {
            this.IconCompatParcelizer = null;
            profileManagementFragment.userNameTextView = null;
            profileManagementFragment.avatarImageView = null;
            profileManagementFragment.mRecyclerView = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
