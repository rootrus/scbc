package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class AddFavoriteTransferInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private AddFavoriteTransferInputFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public AddFavoriteTransferInputFragment_ViewBinding(final AddFavoriteTransferInputFragment addFavoriteTransferInputFragment, View view) {
        super(addFavoriteTransferInputFragment, view);
        this.MediaBrowserCompat$ItemReceiver = addFavoriteTransferInputFragment;
        addFavoriteTransferInputFragment.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
        addFavoriteTransferInputFragment.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        addFavoriteTransferInputFragment.textAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number, "field 'textAccountNumber'", TextView.class);
        addFavoriteTransferInputFragment.viewGroupAccountNumber = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_account_number, "field 'viewGroupAccountNumber'", ViewGroup.class);
        addFavoriteTransferInputFragment.editAccountNumber = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_account_number, "field 'editAccountNumber'", EditText.class);
        addFavoriteTransferInputFragment.inputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'inputLayout'", TextInputLayout.class);
        addFavoriteTransferInputFragment.editAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'editAmount'", AmountEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.view_edit, "field 'editImageView' and method 'navigateBack'");
        addFavoriteTransferInputFragment.editImageView = (ImageView) onStart.write(IconCompatParcelizer2, R.id.view_edit, "field 'editImageView'", ImageView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AddFavoriteTransferInputFragment.this.navigateBack();
            }
        });
        addFavoriteTransferInputFragment.remainingLimitLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_linear_layout, "field 'remainingLimitLinearLayout'", LinearLayout.class);
        addFavoriteTransferInputFragment.textRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_remaining_limit_text_view, "field 'textRemainingLimit'", TextView.class);
        addFavoriteTransferInputFragment.remainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'remainingLimit'", TextView.class);
        addFavoriteTransferInputFragment.remainingLimitError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_error_text_view, "field 'remainingLimitError'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_add_favorite, "field 'buttonAddFavorite' and method 'addFavorite'");
        addFavoriteTransferInputFragment.buttonAddFavorite = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.button_add_favorite, "field 'buttonAddFavorite'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AddFavoriteTransferInputFragment.this.addFavorite();
            }
        });
    }

    public final void read() {
        AddFavoriteTransferInputFragment addFavoriteTransferInputFragment = this.MediaBrowserCompat$ItemReceiver;
        if (addFavoriteTransferInputFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            addFavoriteTransferInputFragment.imageIcon = null;
            addFavoriteTransferInputFragment.textTitle = null;
            addFavoriteTransferInputFragment.textAccountNumber = null;
            addFavoriteTransferInputFragment.viewGroupAccountNumber = null;
            addFavoriteTransferInputFragment.editAccountNumber = null;
            addFavoriteTransferInputFragment.inputLayout = null;
            addFavoriteTransferInputFragment.editAmount = null;
            addFavoriteTransferInputFragment.editImageView = null;
            addFavoriteTransferInputFragment.remainingLimitLinearLayout = null;
            addFavoriteTransferInputFragment.textRemainingLimit = null;
            addFavoriteTransferInputFragment.remainingLimit = null;
            addFavoriteTransferInputFragment.remainingLimitError = null;
            addFavoriteTransferInputFragment.buttonAddFavorite = null;
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
