package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.ScbTextInputLayout;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CardlessWithdrawAmountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private CardlessWithdrawAmountFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public CardlessWithdrawAmountFragment_ViewBinding(final CardlessWithdrawAmountFragment cardlessWithdrawAmountFragment, View view) {
        super(cardlessWithdrawAmountFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = cardlessWithdrawAmountFragment;
        cardlessWithdrawAmountFragment.mAccountSourceTab = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_source_of_fund, "field 'mAccountSourceTab'", TabLayout.class);
        cardlessWithdrawAmountFragment.mLayoutWithdrawAmount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_withdraw_amount, "field 'mLayoutWithdrawAmount'", LinearLayout.class);
        cardlessWithdrawAmountFragment.mViewPagerSourceOfFund = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager_source_of_fund, "field 'mViewPagerSourceOfFund'", FragmentWrapContentViewPager.class);
        cardlessWithdrawAmountFragment.mRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'mRemainingLimit'", TextView.class);
        cardlessWithdrawAmountFragment.mFootnoteTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.footnote_text_view, "field 'mFootnoteTextView'", TextView.class);
        cardlessWithdrawAmountFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_continue, "field 'mButton' and method 'onReviewButtonClicked'");
        cardlessWithdrawAmountFragment.mButton = (Button) onStart.write(IconCompatParcelizer2, R.id.button_continue, "field 'mButton'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CardlessWithdrawAmountFragment.this.onReviewButtonClicked();
            }
        });
        cardlessWithdrawAmountFragment.mTextEmptyState = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_empty_state, "field 'mTextEmptyState'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_add_account, "field 'mButtonAddAccount' and method 'onAddAccountButtonClicked'");
        cardlessWithdrawAmountFragment.mButtonAddAccount = (Button) onStart.write(IconCompatParcelizer3, R.id.button_add_account, "field 'mButtonAddAccount'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CardlessWithdrawAmountFragment.this.onAddAccountButtonClicked();
            }
        });
        cardlessWithdrawAmountFragment.mLayoutError = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_error, "field 'mLayoutError'", RelativeLayout.class);
        cardlessWithdrawAmountFragment.amountInputLayout = (ScbTextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_input_layout, "field 'amountInputLayout'", ScbTextInputLayout.class);
        cardlessWithdrawAmountFragment.amountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_amount, "field 'amountEditText'", AmountEditText.class);
    }

    public final void read() {
        CardlessWithdrawAmountFragment cardlessWithdrawAmountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (cardlessWithdrawAmountFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            cardlessWithdrawAmountFragment.mAccountSourceTab = null;
            cardlessWithdrawAmountFragment.mLayoutWithdrawAmount = null;
            cardlessWithdrawAmountFragment.mViewPagerSourceOfFund = null;
            cardlessWithdrawAmountFragment.mRemainingLimit = null;
            cardlessWithdrawAmountFragment.mFootnoteTextView = null;
            cardlessWithdrawAmountFragment.mRecyclerView = null;
            cardlessWithdrawAmountFragment.mButton = null;
            cardlessWithdrawAmountFragment.mTextEmptyState = null;
            cardlessWithdrawAmountFragment.mButtonAddAccount = null;
            cardlessWithdrawAmountFragment.mLayoutError = null;
            cardlessWithdrawAmountFragment.amountInputLayout = null;
            cardlessWithdrawAmountFragment.amountEditText = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
