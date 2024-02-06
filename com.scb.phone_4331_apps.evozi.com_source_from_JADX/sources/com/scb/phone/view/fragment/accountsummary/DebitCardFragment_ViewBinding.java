package com.scb.phone.view.fragment.accountsummary;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DebitCardFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DebitCardFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public DebitCardFragment_ViewBinding(final DebitCardFragment debitCardFragment, View view) {
        super(debitCardFragment, view);
        this.MediaBrowserCompat$ItemReceiver = debitCardFragment;
        debitCardFragment.ivDebit = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_debit, "field 'ivDebit'", ImageView.class);
        debitCardFragment.csLayoutParent = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_layout_parent, "field 'csLayoutParent'", ConstraintLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.cs_layout_card, "field 'csLayoutCard' and method 'navigateToDebitCardDetail'");
        debitCardFragment.csLayoutCard = (ConstraintLayout) onStart.write(IconCompatParcelizer, R.id.cs_layout_card, "field 'csLayoutCard'", ConstraintLayout.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitCardFragment.this.navigateToDebitCardDetail();
            }
        });
    }

    public final void read() {
        DebitCardFragment debitCardFragment = this.MediaBrowserCompat$ItemReceiver;
        if (debitCardFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            debitCardFragment.ivDebit = null;
            debitCardFragment.csLayoutParent = null;
            debitCardFragment.csLayoutCard = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
