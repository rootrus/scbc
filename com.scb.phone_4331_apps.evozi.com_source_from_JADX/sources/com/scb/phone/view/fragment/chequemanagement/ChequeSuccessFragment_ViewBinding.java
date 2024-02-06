package com.scb.phone.view.fragment.chequemanagement;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onCreateDialog;
import p040o.onStart;

public class ChequeSuccessFragment_ViewBinding extends BaseChequeReviewFragment_ViewBinding {
    private ChequeSuccessFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public ChequeSuccessFragment_ViewBinding(final ChequeSuccessFragment chequeSuccessFragment, View view) {
        super(chequeSuccessFragment, view);
        this.IconCompatParcelizer = chequeSuccessFragment;
        chequeSuccessFragment.titleSuccessTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_success_title, "field 'titleSuccessTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_button, "field 'returnButtonTextView' and method 'onReturnButtonIsClicked'");
        chequeSuccessFragment.returnButtonTextView = (TextView) onStart.write(IconCompatParcelizer2, R.id.return_button, "field 'returnButtonTextView'", TextView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChequeSuccessFragment.this.onReturnButtonIsClicked();
            }
        });
        chequeSuccessFragment.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'refIdTextView'", TextView.class);
        chequeSuccessFragment.dateTimeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'dateTimeTextView'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton' and method 'saveSlipButton'");
        chequeSuccessFragment.autoSaveOffSaveButton = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.auto_save_off_save_button, "field 'autoSaveOffSaveButton'", DefaultButton.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChequeSuccessFragment.this.saveSlipButton();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.share_button, "field 'shareButton'");
        chequeSuccessFragment.shareButton = (DefaultButton) onStart.write(IconCompatParcelizer4, R.id.share_button, "field 'shareButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ChequeSuccessFragment.this.onShareButtonClick();
            }
        });
        chequeSuccessFragment.remainingBalanceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_balance_text_view, "field 'remainingBalanceTextView'", TextView.class);
        chequeSuccessFragment.spaceBetweenButton = (Space) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.space_between_button, "field 'spaceBetweenButton'", Space.class);
    }

    public final void read() {
        ChequeSuccessFragment chequeSuccessFragment = this.IconCompatParcelizer;
        if (chequeSuccessFragment != null) {
            this.IconCompatParcelizer = null;
            chequeSuccessFragment.titleSuccessTextView = null;
            chequeSuccessFragment.returnButtonTextView = null;
            chequeSuccessFragment.refIdTextView = null;
            chequeSuccessFragment.dateTimeTextView = null;
            chequeSuccessFragment.autoSaveOffSaveButton = null;
            chequeSuccessFragment.shareButton = null;
            chequeSuccessFragment.remainingBalanceTextView = null;
            chequeSuccessFragment.spaceBetweenButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
