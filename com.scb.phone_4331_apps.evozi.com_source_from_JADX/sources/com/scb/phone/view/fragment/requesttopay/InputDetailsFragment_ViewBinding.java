package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class InputDetailsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private InputDetailsFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public InputDetailsFragment_ViewBinding(final InputDetailsFragment inputDetailsFragment, View view) {
        super(inputDetailsFragment, view);
        this.MediaBrowserCompat$ItemReceiver = inputDetailsFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        inputDetailsFragment.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                InputDetailsFragment.this.onReviewButtonClick();
            }
        });
        inputDetailsFragment.textInputAmount = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_text_input, "field 'textInputAmount'", TextInputLayout.class);
        inputDetailsFragment.editAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_edit_text, "field 'editAmount'", AmountEditText.class);
        inputDetailsFragment.paybackPeriodRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_recycler_view, "field 'paybackPeriodRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.proxy_number_edit_image_view, "field 'proxyNumberEditImageView' and method 'onProxyNumberEditClick'");
        inputDetailsFragment.proxyNumberEditImageView = (ImageView) onStart.write(IconCompatParcelizer3, R.id.proxy_number_edit_image_view, "field 'proxyNumberEditImageView'", ImageView.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                InputDetailsFragment.this.onProxyNumberEditClick();
            }
        });
        inputDetailsFragment.rtpNoteEditText = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_input_rtp_note, "field 'rtpNoteEditText'", EditText.class);
        inputDetailsFragment.rtpNoteErrorTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_label_rtp_note, "field 'rtpNoteErrorTextView'", TextView.class);
        inputDetailsFragment.proxyNumberTypeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.proxy_number_image_view, "field 'proxyNumberTypeImageView'", ImageView.class);
        inputDetailsFragment.proxyNumberRequestNameTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.proxy_number_request_name_text_view, "field 'proxyNumberRequestNameTextView'", TextView.class);
        inputDetailsFragment.proxyNumberRequestNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.proxy_number_request_number_text_view, "field 'proxyNumberRequestNumberTextView'", TextView.class);
    }

    public final void read() {
        InputDetailsFragment inputDetailsFragment = this.MediaBrowserCompat$ItemReceiver;
        if (inputDetailsFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            inputDetailsFragment.buttonReview = null;
            inputDetailsFragment.textInputAmount = null;
            inputDetailsFragment.editAmount = null;
            inputDetailsFragment.paybackPeriodRecyclerView = null;
            inputDetailsFragment.proxyNumberEditImageView = null;
            inputDetailsFragment.rtpNoteEditText = null;
            inputDetailsFragment.rtpNoteErrorTextView = null;
            inputDetailsFragment.proxyNumberTypeImageView = null;
            inputDetailsFragment.proxyNumberRequestNameTextView = null;
            inputDetailsFragment.proxyNumberRequestNumberTextView = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
