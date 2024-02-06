package com.scb.phone.view.fragment.sme.gifting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomSelectAccountGift;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseGiftTransferInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private BaseGiftTransferInputFragment write;

    public BaseGiftTransferInputFragment_ViewBinding(final BaseGiftTransferInputFragment baseGiftTransferInputFragment, View view) {
        super(baseGiftTransferInputFragment, view);
        this.write = baseGiftTransferInputFragment;
        baseGiftTransferInputFragment.giftTransferImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_transfer_image, "field 'giftTransferImage'", ImageView.class);
        baseGiftTransferInputFragment.giftTransferTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_transfer_title, "field 'giftTransferTitle'", TextView.class);
        baseGiftTransferInputFragment.giftTransferDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_transfer_description, "field 'giftTransferDescription'", TextView.class);
        baseGiftTransferInputFragment.customSelectAccountGift = (CustomSelectAccountGift) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_select_account_gift, "field 'customSelectAccountGift'", CustomSelectAccountGift.class);
        baseGiftTransferInputFragment.customTransferAndPayBiller = (CustomTransferAndPayBiller) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_recipient_gift, "field 'customTransferAndPayBiller'", CustomTransferAndPayBiller.class);
        baseGiftTransferInputFragment.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_send_gift, "field 'sendGiftButton' and method 'onSendGiftButtonClicked'");
        baseGiftTransferInputFragment.sendGiftButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_send_gift, "field 'sendGiftButton'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseGiftTransferInputFragment.this.onSendGiftButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.gift_input_preview_button, "field 'previewButton' and method 'onPreviewButtonClicked'");
        baseGiftTransferInputFragment.previewButton = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.gift_input_preview_button, "field 'previewButton'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseGiftTransferInputFragment.this.onPreviewButtonClicked();
            }
        });
    }

    public void read() {
        BaseGiftTransferInputFragment baseGiftTransferInputFragment = this.write;
        if (baseGiftTransferInputFragment != null) {
            this.write = null;
            baseGiftTransferInputFragment.giftTransferImage = null;
            baseGiftTransferInputFragment.giftTransferTitle = null;
            baseGiftTransferInputFragment.giftTransferDescription = null;
            baseGiftTransferInputFragment.customSelectAccountGift = null;
            baseGiftTransferInputFragment.customTransferAndPayBiller = null;
            baseGiftTransferInputFragment.noteEditText = null;
            baseGiftTransferInputFragment.sendGiftButton = null;
            baseGiftTransferInputFragment.previewButton = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
