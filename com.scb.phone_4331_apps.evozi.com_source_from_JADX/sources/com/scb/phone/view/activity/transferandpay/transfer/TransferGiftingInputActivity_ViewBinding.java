package com.scb.phone.view.activity.transferandpay.transfer;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.NoteEditText;
import p040o.onCreateDialog;
import p040o.onStart;

public final class TransferGiftingInputActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private TransferGiftingInputActivity write;

    public TransferGiftingInputActivity_ViewBinding(final TransferGiftingInputActivity transferGiftingInputActivity, View view) {
        super(transferGiftingInputActivity, view);
        this.write = transferGiftingInputActivity;
        transferGiftingInputActivity.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_gift_input_preview, "method 'onPreviewButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferGiftingInputActivity.this.onPreviewButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_send_gift, "method 'onSendGiftButtonClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferGiftingInputActivity.this.onSendGiftButtonClicked();
            }
        });
    }

    public final void read() {
        TransferGiftingInputActivity transferGiftingInputActivity = this.write;
        if (transferGiftingInputActivity != null) {
            this.write = null;
            transferGiftingInputActivity.noteEditText = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
