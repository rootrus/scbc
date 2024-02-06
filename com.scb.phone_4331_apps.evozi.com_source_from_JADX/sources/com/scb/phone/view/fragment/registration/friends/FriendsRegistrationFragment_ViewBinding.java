package com.scb.phone.view.fragment.registration.friends;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ClearableFullWidthEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class FriendsRegistrationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private FriendsRegistrationFragment write;

    public FriendsRegistrationFragment_ViewBinding(final FriendsRegistrationFragment friendsRegistrationFragment, View view) {
        super(friendsRegistrationFragment, view);
        this.write = friendsRegistrationFragment;
        friendsRegistrationFragment.rootView = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_layout, "field 'rootView'", ConstraintLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.b_ok, "field 'okButton' and method 'onClickOkButton'");
        friendsRegistrationFragment.okButton = (Button) onStart.write(IconCompatParcelizer, R.id.b_ok, "field 'okButton'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FriendsRegistrationFragment.this.onClickOkButton();
            }
        });
        friendsRegistrationFragment.inputReferralCode = (ClearableFullWidthEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cet_referral_code, "field 'inputReferralCode'", ClearableFullWidthEditText.class);
        friendsRegistrationFragment.titleDetail = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_sub, "field 'titleDetail'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.b_skip, "method 'onClickSkipButton'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FriendsRegistrationFragment.this.onClickSkipButton();
            }
        });
    }

    public final void read() {
        FriendsRegistrationFragment friendsRegistrationFragment = this.write;
        if (friendsRegistrationFragment != null) {
            this.write = null;
            friendsRegistrationFragment.rootView = null;
            friendsRegistrationFragment.okButton = null;
            friendsRegistrationFragment.inputReferralCode = null;
            friendsRegistrationFragment.titleDetail = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
