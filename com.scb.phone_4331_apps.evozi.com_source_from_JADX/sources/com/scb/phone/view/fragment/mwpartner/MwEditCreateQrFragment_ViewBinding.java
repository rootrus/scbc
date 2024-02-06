package com.scb.phone.view.fragment.mwpartner;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.MwAmountEditText;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.item.ItemIconCustom;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwEditCreateQrFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private MwEditCreateQrFragment write;

    public MwEditCreateQrFragment_ViewBinding(final MwEditCreateQrFragment mwEditCreateQrFragment, View view) {
        super(mwEditCreateQrFragment, view);
        this.write = mwEditCreateQrFragment;
        mwEditCreateQrFragment.accountSummary = (ItemIconCustom) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_summary, "field 'accountSummary'", ItemIconCustom.class);
        mwEditCreateQrFragment.amountInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_input_layout, "field 'amountInputLayout'", TextInputLayout.class);
        mwEditCreateQrFragment.amountEditText = (MwAmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.et_amount, "field 'amountEditText'", MwAmountEditText.class);
        mwEditCreateQrFragment.shopReference = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.shop_note, "field 'shopReference'", NoteEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_create_qr, "field 'createQrBtn' and method 'onCreateQrClick'");
        mwEditCreateQrFragment.createQrBtn = (Button) onStart.write(IconCompatParcelizer, R.id.btn_create_qr, "field 'createQrBtn'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwEditCreateQrFragment.this.onCreateQrClick();
            }
        });
        mwEditCreateQrFragment.constraintLayout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container, "field 'constraintLayout'", ConstraintLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_reset, "method 'onResetToDefaultClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwEditCreateQrFragment.this.onResetToDefaultClick();
            }
        });
    }

    public final void read() {
        MwEditCreateQrFragment mwEditCreateQrFragment = this.write;
        if (mwEditCreateQrFragment != null) {
            this.write = null;
            mwEditCreateQrFragment.accountSummary = null;
            mwEditCreateQrFragment.amountInputLayout = null;
            mwEditCreateQrFragment.amountEditText = null;
            mwEditCreateQrFragment.shopReference = null;
            mwEditCreateQrFragment.createQrBtn = null;
            mwEditCreateQrFragment.constraintLayout = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
