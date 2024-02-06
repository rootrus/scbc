package com.scb.phone.view.fragment.transferandpay.fixedtransfer;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FixedTransferInputFormFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private FixedTransferInputFormFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private TextWatcher MediaMetadataCompat;
    private View RatingCompat;
    private View write;

    public FixedTransferInputFormFragment_ViewBinding(final FixedTransferInputFormFragment fixedTransferInputFormFragment, View view) {
        super(fixedTransferInputFormFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fixedTransferInputFormFragment;
        fixedTransferInputFormFragment.ivIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_icon, "field 'ivIcon'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_edit, "field 'ivEdit' and method 'navigateBack'");
        fixedTransferInputFormFragment.ivEdit = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_edit, "field 'ivEdit'", ImageView.class);
        this.RatingCompat = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FixedTransferInputFormFragment.this.navigateBack(view);
            }
        });
        fixedTransferInputFormFragment.tvAccountTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_title, "field 'tvAccountTitle'", TextView.class);
        fixedTransferInputFormFragment.tvAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_number, "field 'tvAccountNumber'", TextView.class);
        fixedTransferInputFormFragment.llInputAccountNumberContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_account_number_container, "field 'llInputAccountNumberContainer'", LinearLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.et_input_account_number, "field 'etEnterAccountNumber' and method 'onEditAccountNumberChange'");
        fixedTransferInputFormFragment.etEnterAccountNumber = (EditText) onStart.write(IconCompatParcelizer3, R.id.et_input_account_number, "field 'etEnterAccountNumber'", EditText.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        C95904 r0 = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                FixedTransferInputFormFragment.this.onEditAccountNumberChange(charSequence, i, i2, i3);
            }
        };
        this.MediaMetadataCompat = r0;
        ((TextView) IconCompatParcelizer3).addTextChangedListener(r0);
        fixedTransferInputFormFragment.tvLabelNoDeposit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_label_no_deposit, "field 'tvLabelNoDeposit'", TextView.class);
        fixedTransferInputFormFragment.llSelectDepositContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_select_deposit_container, "field 'llSelectDepositContainer'", LinearLayout.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.iv_collapse, "field 'ivCollapse' and method 'onExpandMoreClick'");
        fixedTransferInputFormFragment.ivCollapse = (ImageView) onStart.write(IconCompatParcelizer4, R.id.iv_collapse, "field 'ivCollapse'", ImageView.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FixedTransferInputFormFragment.this.onExpandMoreClick(view);
            }
        });
        fixedTransferInputFormFragment.tvSelectedDeposits = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_selected_deposits, "field 'tvSelectedDeposits'", TextView.class);
        fixedTransferInputFormFragment.llSelectDepositSelectorContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_select_deposit_selector_container, "field 'llSelectDepositSelectorContainer'", LinearLayout.class);
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.cb_selector_select_all_deposit, "field 'cbSelectorSelectAllDeposit' and method 'onSelectAllSubDepositCheckedChanged'");
        fixedTransferInputFormFragment.cbSelectorSelectAllDeposit = (CheckBox) onStart.write(IconCompatParcelizer5, R.id.cb_selector_select_all_deposit, "field 'cbSelectorSelectAllDeposit'", CheckBox.class);
        this.write = IconCompatParcelizer5;
        ((CompoundButton) IconCompatParcelizer5).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FixedTransferInputFormFragment.this.onSelectAllSubDepositCheckedChanged(compoundButton, z);
            }
        });
        fixedTransferInputFormFragment.rvDeposit = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_deposit, "field 'rvDeposit'", RecyclerView.class);
        fixedTransferInputFormFragment.etNote = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_note, "field 'etNote'", NoteEditText.class);
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.bt_review, "field 'btReview' and method 'onReviewButtonClick'");
        fixedTransferInputFormFragment.btReview = (Button) onStart.write(IconCompatParcelizer6, R.id.bt_review, "field 'btReview'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FixedTransferInputFormFragment.this.onReviewButtonClick(view);
            }
        });
    }

    public final void read() {
        FixedTransferInputFormFragment fixedTransferInputFormFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fixedTransferInputFormFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fixedTransferInputFormFragment.ivIcon = null;
            fixedTransferInputFormFragment.ivEdit = null;
            fixedTransferInputFormFragment.tvAccountTitle = null;
            fixedTransferInputFormFragment.tvAccountNumber = null;
            fixedTransferInputFormFragment.llInputAccountNumberContainer = null;
            fixedTransferInputFormFragment.etEnterAccountNumber = null;
            fixedTransferInputFormFragment.tvLabelNoDeposit = null;
            fixedTransferInputFormFragment.llSelectDepositContainer = null;
            fixedTransferInputFormFragment.ivCollapse = null;
            fixedTransferInputFormFragment.tvSelectedDeposits = null;
            fixedTransferInputFormFragment.llSelectDepositSelectorContainer = null;
            fixedTransferInputFormFragment.cbSelectorSelectAllDeposit = null;
            fixedTransferInputFormFragment.rvDeposit = null;
            fixedTransferInputFormFragment.etNote = null;
            fixedTransferInputFormFragment.btReview = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            ((TextView) this.MediaBrowserCompat$ItemReceiver).removeTextChangedListener(this.MediaMetadataCompat);
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            ((CompoundButton) this.write).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
