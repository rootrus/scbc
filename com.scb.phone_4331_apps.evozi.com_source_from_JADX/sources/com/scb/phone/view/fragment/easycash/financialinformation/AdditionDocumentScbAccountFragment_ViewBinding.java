package com.scb.phone.view.fragment.easycash.financialinformation;

import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class AdditionDocumentScbAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private AdditionDocumentScbAccountFragment write;

    public AdditionDocumentScbAccountFragment_ViewBinding(final AdditionDocumentScbAccountFragment additionDocumentScbAccountFragment, View view) {
        super(additionDocumentScbAccountFragment, view);
        this.write = additionDocumentScbAccountFragment;
        additionDocumentScbAccountFragment.rgScbAccount = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_group_scb_account, "field 'rgScbAccount'", RadioGroup.class);
        additionDocumentScbAccountFragment.accountSelector = (CustomAccountSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_selector, "field 'accountSelector'", CustomAccountSelector.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'nextButton' and method 'onNextButtonClicked'");
        additionDocumentScbAccountFragment.nextButton = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'nextButton'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AdditionDocumentScbAccountFragment.this.onNextButtonClicked();
            }
        });
    }

    public final void read() {
        AdditionDocumentScbAccountFragment additionDocumentScbAccountFragment = this.write;
        if (additionDocumentScbAccountFragment != null) {
            this.write = null;
            additionDocumentScbAccountFragment.rgScbAccount = null;
            additionDocumentScbAccountFragment.accountSelector = null;
            additionDocumentScbAccountFragment.nextButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
