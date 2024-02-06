package com.scb.phone.view.fragment.investment.assessment;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RiskSelectionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RiskSelectionFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public RiskSelectionFragment_ViewBinding(final RiskSelectionFragment riskSelectionFragment, View view) {
        super(riskSelectionFragment, view);
        this.MediaBrowserCompat$ItemReceiver = riskSelectionFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'continueButton' and method 'continueButtonClicked'");
        riskSelectionFragment.continueButton = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'continueButton'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RiskSelectionFragment.this.continueButtonClicked(view);
            }
        });
        riskSelectionFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.risk_levels_recycler_view, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        RiskSelectionFragment riskSelectionFragment = this.MediaBrowserCompat$ItemReceiver;
        if (riskSelectionFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            riskSelectionFragment.continueButton = null;
            riskSelectionFragment.recyclerView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
