package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.ScbEditText;
import com.scb.phone.view.custom.ScbTextInputLayout;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseTargetSelectedFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseTargetSelectedFragment IconCompatParcelizer;

    public BaseTargetSelectedFragment_ViewBinding(BaseTargetSelectedFragment baseTargetSelectedFragment, View view) {
        super(baseTargetSelectedFragment, view);
        this.IconCompatParcelizer = baseTargetSelectedFragment;
        baseTargetSelectedFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        baseTargetSelectedFragment.mReferenceTextView1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_text_input_layout1, "field 'mReferenceTextView1'", TextView.class);
        baseTargetSelectedFragment.mReferenceTextView2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_text_input_layout2, "field 'mReferenceTextView2'", TextView.class);
        baseTargetSelectedFragment.mReferenceTextView3 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_text_input_layout3, "field 'mReferenceTextView3'", TextView.class);
        baseTargetSelectedFragment.mButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_continue, "field 'mButton'", DefaultButton.class);
        baseTargetSelectedFragment.mCustomTransferAndPayBiller = (CustomTransferAndPayBiller) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_transfer_and_pay_biller, "field 'mCustomTransferAndPayBiller'", CustomTransferAndPayBiller.class);
        baseTargetSelectedFragment.mReferenceEditText1 = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_label_edit_text1, "field 'mReferenceEditText1'", ScbEditText.class);
        baseTargetSelectedFragment.mReferenceEditText2 = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_label_edit_text2, "field 'mReferenceEditText2'", ScbEditText.class);
        baseTargetSelectedFragment.mReferenceEditText3 = (ScbEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reference_label_edit_text3, "field 'mReferenceEditText3'", ScbEditText.class);
        baseTargetSelectedFragment.mDivider = onStart.IconCompatParcelizer(view, R.id.bill_divider_view, "field 'mDivider'");
        baseTargetSelectedFragment.mAmountInputLayout = (ScbTextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_amount_text_input, "field 'mAmountInputLayout'", ScbTextInputLayout.class);
        baseTargetSelectedFragment.mAmountValue = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_amount_value_edit_text, "field 'mAmountValue'", AmountEditText.class);
        baseTargetSelectedFragment.mRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'mRemainingLimit'", TextView.class);
        baseTargetSelectedFragment.mLimitProgress = (ViewGroup) onStart.IconCompatParcelizer(view, R.id.limit_view_group_progress, "field 'mLimitProgress'", ViewGroup.class);
        baseTargetSelectedFragment.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
    }

    public void read() {
        BaseTargetSelectedFragment baseTargetSelectedFragment = this.IconCompatParcelizer;
        if (baseTargetSelectedFragment != null) {
            this.IconCompatParcelizer = null;
            baseTargetSelectedFragment.mRecyclerView = null;
            baseTargetSelectedFragment.mReferenceTextView1 = null;
            baseTargetSelectedFragment.mReferenceTextView2 = null;
            baseTargetSelectedFragment.mReferenceTextView3 = null;
            baseTargetSelectedFragment.mButton = null;
            baseTargetSelectedFragment.mCustomTransferAndPayBiller = null;
            baseTargetSelectedFragment.mReferenceEditText1 = null;
            baseTargetSelectedFragment.mReferenceEditText2 = null;
            baseTargetSelectedFragment.mReferenceEditText3 = null;
            baseTargetSelectedFragment.mDivider = null;
            baseTargetSelectedFragment.mAmountInputLayout = null;
            baseTargetSelectedFragment.mAmountValue = null;
            baseTargetSelectedFragment.mRemainingLimit = null;
            baseTargetSelectedFragment.mLimitProgress = null;
            baseTargetSelectedFragment.noteEditText = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
