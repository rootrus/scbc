package com.scb.phone.view.fragment.sme.gifting;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class GiftRecipientFromOthersFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private GiftRecipientFromOthersFragment MediaBrowserCompat$ItemReceiver;

    public GiftRecipientFromOthersFragment_ViewBinding(final GiftRecipientFromOthersFragment giftRecipientFromOthersFragment, View view) {
        super(giftRecipientFromOthersFragment, view);
        this.MediaBrowserCompat$ItemReceiver = giftRecipientFromOthersFragment;
        giftRecipientFromOthersFragment.accountNumber = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_account_number, "field 'accountNumber'", EditText.class);
        giftRecipientFromOthersFragment.bankIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'bankIcon'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_confirm, "field 'confirmButton' and method 'buttonConfirmClick'");
        giftRecipientFromOthersFragment.confirmButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.button_confirm, "field 'confirmButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                GiftRecipientFromOthersFragment.this.buttonConfirmClick();
            }
        });
    }

    public final void read() {
        GiftRecipientFromOthersFragment giftRecipientFromOthersFragment = this.MediaBrowserCompat$ItemReceiver;
        if (giftRecipientFromOthersFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            giftRecipientFromOthersFragment.accountNumber = null;
            giftRecipientFromOthersFragment.bankIcon = null;
            giftRecipientFromOthersFragment.confirmButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
