package com.scb.phone.view.fragment.bankingactions;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BankingActionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BankingActionFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public BankingActionFragment_ViewBinding(final BankingActionFragment bankingActionFragment, View view) {
        super(bankingActionFragment, view);
        this.IconCompatParcelizer = bankingActionFragment;
        bankingActionFragment.cusIvProfile = (CustomProfileImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cus_iv_profile, "field 'cusIvProfile'", CustomProfileImageView.class);
        bankingActionFragment.tvHomeWelcomeHeadline = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome_headline, "field 'tvHomeWelcomeHeadline'", TextView.class);
        bankingActionFragment.tvHomeWelcomeUserName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_home_welcome, "field 'tvHomeWelcomeUserName'", TextView.class);
        bankingActionFragment.rvBankingActions = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_banking_actions, "field 'rvBankingActions'", RecyclerView.class);
        bankingActionFragment.ivBgBankService = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_bg_bank_service, "field 'ivBgBankService'", ImageView.class);
        bankingActionFragment.llLayoutInternetError = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_banking_actions_internet_error, "field 'llLayoutInternetError'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.banking_actions_try_again, "method 'onTryAgainButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BankingActionFragment.this.onTryAgainButtonClick();
            }
        });
    }

    public final void read() {
        BankingActionFragment bankingActionFragment = this.IconCompatParcelizer;
        if (bankingActionFragment != null) {
            this.IconCompatParcelizer = null;
            bankingActionFragment.cusIvProfile = null;
            bankingActionFragment.tvHomeWelcomeHeadline = null;
            bankingActionFragment.tvHomeWelcomeUserName = null;
            bankingActionFragment.rvBankingActions = null;
            bankingActionFragment.ivBgBankService = null;
            bankingActionFragment.llLayoutInternetError = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
