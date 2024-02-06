package com.scb.phone.view.fragment.promptpay;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PromptPayQRInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PromptPayQRInputFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public PromptPayQRInputFragment_ViewBinding(final PromptPayQRInputFragment promptPayQRInputFragment, View view) {
        super(promptPayQRInputFragment, view);
        this.MediaBrowserCompat$ItemReceiver = promptPayQRInputFragment;
        promptPayQRInputFragment.mobileListRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mobile_list_recycler_view, "field 'mobileListRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.create_qr_code_button, "field 'createQRCodeButton' and method 'createQRCodeButton'");
        promptPayQRInputFragment.createQRCodeButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.create_qr_code_button, "field 'createQRCodeButton'", DefaultButton.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PromptPayQRInputFragment.this.createQRCodeButton();
            }
        });
        promptPayQRInputFragment.editAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'editAmount'", AmountEditText.class);
    }

    public final void read() {
        PromptPayQRInputFragment promptPayQRInputFragment = this.MediaBrowserCompat$ItemReceiver;
        if (promptPayQRInputFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            promptPayQRInputFragment.mobileListRecyclerView = null;
            promptPayQRInputFragment.createQRCodeButton = null;
            promptPayQRInputFragment.editAmount = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
