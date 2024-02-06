package com.scb.phone.view.activity.prelogin;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class PreLoginActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;
    private PreLoginActivity write;

    public PreLoginActivity_ViewBinding(final PreLoginActivity preLoginActivity, View view) {
        super(preLoginActivity, view);
        this.write = preLoginActivity;
        preLoginActivity.imageAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_avatar, "field 'imageAvatar'", ImageView.class);
        preLoginActivity.textUserName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_user_name, "field 'textUserName'", TextView.class);
        preLoginActivity.mTutorialViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tutorial_view_pager, "field 'mTutorialViewPager'", ViewPager.class);
        preLoginActivity.mOverlayImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overlay_image_view, "field 'mOverlayImageView'", ImageView.class);
        preLoginActivity.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root, "field 'mRootView'", RelativeLayout.class);
        preLoginActivity.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_login, "method 'onLoginButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreLoginActivity.this.onLoginButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.menu_balance, "method 'onMenuQuickBalanceClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreLoginActivity.this.onMenuQuickBalanceClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.menu_top_up, "method 'onMenuTopUpClick'");
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreLoginActivity.this.onMenuTopUpClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.menu_prompt_pay, "method 'onMenuPromptPayClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreLoginActivity.this.onMenuPromptPayClick();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.view_need_help, "method 'onNeedHelpClick'");
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreLoginActivity.this.onNeedHelpClick();
            }
        });
    }

    public final void read() {
        PreLoginActivity preLoginActivity = this.write;
        if (preLoginActivity != null) {
            this.write = null;
            preLoginActivity.imageAvatar = null;
            preLoginActivity.textUserName = null;
            preLoginActivity.mTutorialViewPager = null;
            preLoginActivity.mOverlayImageView = null;
            preLoginActivity.mRootView = null;
            preLoginActivity.mCircleIndicator = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
