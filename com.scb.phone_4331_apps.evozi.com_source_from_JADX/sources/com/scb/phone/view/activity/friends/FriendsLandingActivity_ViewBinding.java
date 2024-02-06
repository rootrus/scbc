package com.scb.phone.view.activity.friends;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class FriendsLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private FriendsLandingActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public FriendsLandingActivity_ViewBinding(final FriendsLandingActivity friendsLandingActivity, View view) {
        super(friendsLandingActivity, view);
        this.IconCompatParcelizer = friendsLandingActivity;
        friendsLandingActivity.ivFriendHeader = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_friends_header, "field 'ivFriendHeader'", ImageView.class);
        friendsLandingActivity.tvRefCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_code, "field 'tvRefCode'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tv_terms_and_conditions, "field 'tvTermCondition' and method 'openTermsAndConditions'");
        friendsLandingActivity.tvTermCondition = (TextView) onStart.write(IconCompatParcelizer2, R.id.tv_terms_and_conditions, "field 'tvTermCondition'", TextView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FriendsLandingActivity.this.openTermsAndConditions();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_copy, "method 'onCopy'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FriendsLandingActivity.this.onCopy();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.btn_share, "method 'onShare'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FriendsLandingActivity.this.onShare();
            }
        });
    }

    public final void read() {
        FriendsLandingActivity friendsLandingActivity = this.IconCompatParcelizer;
        if (friendsLandingActivity != null) {
            this.IconCompatParcelizer = null;
            friendsLandingActivity.ivFriendHeader = null;
            friendsLandingActivity.tvRefCode = null;
            friendsLandingActivity.tvTermCondition = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
