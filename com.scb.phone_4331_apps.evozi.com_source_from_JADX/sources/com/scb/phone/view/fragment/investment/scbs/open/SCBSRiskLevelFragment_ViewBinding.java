package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SCBSRiskLevelFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SCBSRiskLevelFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public SCBSRiskLevelFragment_ViewBinding(final SCBSRiskLevelFragment sCBSRiskLevelFragment, View view) {
        super(sCBSRiskLevelFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = sCBSRiskLevelFragment;
        sCBSRiskLevelFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_risk_level, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'nextButton' and method 'onNextClick'");
        sCBSRiskLevelFragment.nextButton = (Button) onStart.write(IconCompatParcelizer, R.id.button_next, "field 'nextButton'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SCBSRiskLevelFragment.this.onNextClick();
            }
        });
    }

    public final void read() {
        SCBSRiskLevelFragment sCBSRiskLevelFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (sCBSRiskLevelFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            sCBSRiskLevelFragment.recyclerView = null;
            sCBSRiskLevelFragment.nextButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
