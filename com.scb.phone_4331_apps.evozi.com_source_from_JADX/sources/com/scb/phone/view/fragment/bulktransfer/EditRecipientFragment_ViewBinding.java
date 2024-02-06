package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CounterEditText;
import com.scb.phone.view.custom.common.CustomLimit;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EditRecipientFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private EditRecipientFragment write;

    public EditRecipientFragment_ViewBinding(final EditRecipientFragment editRecipientFragment, View view) {
        super(editRecipientFragment, view);
        this.write = editRecipientFragment;
        editRecipientFragment.customLimit = (CustomLimit) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_limit, "field 'customLimit'", CustomLimit.class);
        editRecipientFragment.bankIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'bankIcon'", ImageView.class);
        editRecipientFragment.bankName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'bankName'", TextView.class);
        editRecipientFragment.accountNumberText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number, "field 'accountNumberText'", TextView.class);
        editRecipientFragment.amountInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'amountInputLayout'", TextInputLayout.class);
        editRecipientFragment.amountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'amountEditText'", AmountEditText.class);
        editRecipientFragment.nickNameCounterEditText = (CounterEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nick_name_edit_text, "field 'nickNameCounterEditText'", CounterEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_save, "field 'saveButton' and method 'onSaveButtonClick'");
        editRecipientFragment.saveButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_save, "field 'saveButton'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EditRecipientFragment.this.onSaveButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.view_edit, "method 'navigateBack'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EditRecipientFragment.this.navigateBack();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.button_delete, "method 'onDeleteButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EditRecipientFragment.this.onDeleteButtonClick();
            }
        });
    }

    public final void read() {
        EditRecipientFragment editRecipientFragment = this.write;
        if (editRecipientFragment != null) {
            this.write = null;
            editRecipientFragment.customLimit = null;
            editRecipientFragment.bankIcon = null;
            editRecipientFragment.bankName = null;
            editRecipientFragment.accountNumberText = null;
            editRecipientFragment.amountInputLayout = null;
            editRecipientFragment.amountEditText = null;
            editRecipientFragment.nickNameCounterEditText = null;
            editRecipientFragment.saveButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
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
