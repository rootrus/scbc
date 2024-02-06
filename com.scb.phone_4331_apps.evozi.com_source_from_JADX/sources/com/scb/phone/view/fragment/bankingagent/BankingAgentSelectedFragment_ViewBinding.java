package com.scb.phone.view.fragment.bankingagent;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class BankingAgentSelectedFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BankingAgentSelectedFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public BankingAgentSelectedFragment_ViewBinding(final BankingAgentSelectedFragment bankingAgentSelectedFragment, View view) {
        super(bankingAgentSelectedFragment, view);
        this.IconCompatParcelizer = bankingAgentSelectedFragment;
        bankingAgentSelectedFragment.amountText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_amount, "field 'amountText'", AmountEditText.class);
        bankingAgentSelectedFragment.dailyLimitText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_daily_limit, "field 'dailyLimitText'", TextView.class);
        bankingAgentSelectedFragment.agentName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_title_text_view, "field 'agentName'", TextView.class);
        bankingAgentSelectedFragment.amountError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_inline_error, "field 'amountError'", TextView.class);
        bankingAgentSelectedFragment.agentIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.item_icon_image_view, "field 'agentIcon'", ImageView.class);
        bankingAgentSelectedFragment.feeText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_fee, "field 'feeText'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_close_button, "method 'onCloseClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BankingAgentSelectedFragment.this.onCloseClicked();
            }
        });
    }

    public final void read() {
        BankingAgentSelectedFragment bankingAgentSelectedFragment = this.IconCompatParcelizer;
        if (bankingAgentSelectedFragment != null) {
            this.IconCompatParcelizer = null;
            bankingAgentSelectedFragment.amountText = null;
            bankingAgentSelectedFragment.dailyLimitText = null;
            bankingAgentSelectedFragment.agentName = null;
            bankingAgentSelectedFragment.amountError = null;
            bankingAgentSelectedFragment.agentIcon = null;
            bankingAgentSelectedFragment.feeText = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
