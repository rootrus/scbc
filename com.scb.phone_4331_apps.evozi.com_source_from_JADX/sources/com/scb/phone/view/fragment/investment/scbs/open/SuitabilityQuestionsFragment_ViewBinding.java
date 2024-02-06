package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class SuitabilityQuestionsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SuitabilityQuestionsFragment MediaBrowserCompat$ItemReceiver;

    public SuitabilityQuestionsFragment_ViewBinding(SuitabilityQuestionsFragment suitabilityQuestionsFragment, View view) {
        super(suitabilityQuestionsFragment, view);
        this.MediaBrowserCompat$ItemReceiver = suitabilityQuestionsFragment;
        suitabilityQuestionsFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_suitability, "field 'recyclerView'", RecyclerView.class);
    }

    public final void read() {
        SuitabilityQuestionsFragment suitabilityQuestionsFragment = this.MediaBrowserCompat$ItemReceiver;
        if (suitabilityQuestionsFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            suitabilityQuestionsFragment.recyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
