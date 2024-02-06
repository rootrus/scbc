package com.scb.phone.view.fragment.debitcard;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DebitCardLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DebitCardLandingFragment IconCompatParcelizer;

    public DebitCardLandingFragment_ViewBinding(DebitCardLandingFragment debitCardLandingFragment, View view) {
        super(debitCardLandingFragment, view);
        this.IconCompatParcelizer = debitCardLandingFragment;
        debitCardLandingFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        DebitCardLandingFragment debitCardLandingFragment = this.IconCompatParcelizer;
        if (debitCardLandingFragment != null) {
            this.IconCompatParcelizer = null;
            debitCardLandingFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
