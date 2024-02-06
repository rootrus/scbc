package com.scb.phone.view.fragment.accountsummary;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class AccountSummaryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private AccountSummaryFragment MediaBrowserCompat$ItemReceiver;

    public AccountSummaryFragment_ViewBinding(final AccountSummaryFragment accountSummaryFragment, View view) {
        super(accountSummaryFragment, view);
        this.MediaBrowserCompat$ItemReceiver = accountSummaryFragment;
        accountSummaryFragment.mAppBarLayout = (AppBarLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.smooth_app_bar_layout, "field 'mAppBarLayout'", AppBarLayout.class);
        accountSummaryFragment.cusIvProfile = (CustomProfileImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cus_iv_profile, "field 'cusIvProfile'", CustomProfileImageView.class);
        accountSummaryFragment.tvHomeWelcomeUserName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome, "field 'tvHomeWelcomeUserName'", TextView.class);
        accountSummaryFragment.tvHomeWelcomeHeadline = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome_headline, "field 'tvHomeWelcomeHeadline'", TextView.class);
        accountSummaryFragment.ivBgAccountSummary = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_bg_account_summary, "field 'ivBgAccountSummary'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.account_summary_add_button, "field 'accountSummaryAddButton' and method 'onAddAccountButtonClicked'");
        accountSummaryFragment.accountSummaryAddButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.account_summary_add_button, "field 'accountSummaryAddButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AccountSummaryFragment.this.onAddAccountButtonClicked();
            }
        });
    }

    public final void read() {
        AccountSummaryFragment accountSummaryFragment = this.MediaBrowserCompat$ItemReceiver;
        if (accountSummaryFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            accountSummaryFragment.mAppBarLayout = null;
            accountSummaryFragment.cusIvProfile = null;
            accountSummaryFragment.tvHomeWelcomeUserName = null;
            accountSummaryFragment.tvHomeWelcomeHeadline = null;
            accountSummaryFragment.ivBgAccountSummary = null;
            accountSummaryFragment.accountSummaryAddButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
