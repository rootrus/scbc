package com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EBillSelectedFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private EBillSelectedFragment write;

    public EBillSelectedFragment_ViewBinding(final EBillSelectedFragment eBillSelectedFragment, View view) {
        super(eBillSelectedFragment, view);
        this.write = eBillSelectedFragment;
        eBillSelectedFragment.mContainerLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_container_linear_layout, "field 'mContainerLayout'", LinearLayout.class);
        eBillSelectedFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_selected_tabs, "field 'mTabLayout'", TabLayout.class);
        eBillSelectedFragment.mTabPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_selected_view_pager, "field 'mTabPager'", FragmentWrapContentViewPager.class);
        eBillSelectedFragment.mCustomTransferAndPayBiller = (CustomTransferAndPayBiller) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_custom_transfer_and_pay_biller, "field 'mCustomTransferAndPayBiller'", CustomTransferAndPayBiller.class);
        eBillSelectedFragment.mRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'mRemainingLimit'", TextView.class);
        eBillSelectedFragment.mAmountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_amount_edit_text, "field 'mAmountEditText'", AmountEditText.class);
        eBillSelectedFragment.mTextInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_amount_text_input, "field 'mTextInputLayout'", TextInputLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_continue, "field 'mButton' and method 'onAdditionalInfoButtonClicked'");
        eBillSelectedFragment.mButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.button_continue, "field 'mButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EBillSelectedFragment.this.onAdditionalInfoButtonClicked();
            }
        });
        eBillSelectedFragment.mLimitProgress = (ViewGroup) onStart.IconCompatParcelizer(view, R.id.limit_view_group_progress, "field 'mLimitProgress'", ViewGroup.class);
        eBillSelectedFragment.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
    }

    public final void read() {
        EBillSelectedFragment eBillSelectedFragment = this.write;
        if (eBillSelectedFragment != null) {
            this.write = null;
            eBillSelectedFragment.mContainerLayout = null;
            eBillSelectedFragment.mTabLayout = null;
            eBillSelectedFragment.mTabPager = null;
            eBillSelectedFragment.mCustomTransferAndPayBiller = null;
            eBillSelectedFragment.mRemainingLimit = null;
            eBillSelectedFragment.mAmountEditText = null;
            eBillSelectedFragment.mTextInputLayout = null;
            eBillSelectedFragment.mButton = null;
            eBillSelectedFragment.mLimitProgress = null;
            eBillSelectedFragment.noteEditText = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
