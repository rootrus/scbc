package com.scb.phone.view.fragment.ntb.selectaccount;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SelectPurposeFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private SelectPurposeFragment write;

    public SelectPurposeFragment_ViewBinding(final SelectPurposeFragment selectPurposeFragment, View view) {
        super(selectPurposeFragment, view);
        this.write = selectPurposeFragment;
        selectPurposeFragment.purposeSpinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner_purpose, "field 'purposeSpinner'", Spinner.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_select, "field 'selectButton' and method 'onSelectClick'");
        selectPurposeFragment.selectButton = (Button) onStart.write(IconCompatParcelizer, R.id.btn_select, "field 'selectButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SelectPurposeFragment.this.onSelectClick();
            }
        });
    }

    public final void read() {
        SelectPurposeFragment selectPurposeFragment = this.write;
        if (selectPurposeFragment != null) {
            this.write = null;
            selectPurposeFragment.purposeSpinner = null;
            selectPurposeFragment.selectButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
