package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashFeaturesLoanInformationFragment_ViewBinding extends BaseFeaturesLoanInformationFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private EasycashFeaturesLoanInformationFragment write;

    public EasycashFeaturesLoanInformationFragment_ViewBinding(final EasycashFeaturesLoanInformationFragment easycashFeaturesLoanInformationFragment, View view) {
        super(easycashFeaturesLoanInformationFragment, view);
        this.write = easycashFeaturesLoanInformationFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'nextButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesLoanInformationFragment.this.nextButtonClick();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
