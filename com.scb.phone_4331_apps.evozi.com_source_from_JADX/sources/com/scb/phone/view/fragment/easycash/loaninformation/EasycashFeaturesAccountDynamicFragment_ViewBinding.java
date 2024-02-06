package com.scb.phone.view.fragment.easycash.loaninformation;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class EasycashFeaturesAccountDynamicFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EasycashFeaturesAccountDynamicFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public EasycashFeaturesAccountDynamicFragment_ViewBinding(final EasycashFeaturesAccountDynamicFragment easycashFeaturesAccountDynamicFragment, View view) {
        super(easycashFeaturesAccountDynamicFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashFeaturesAccountDynamicFragment;
        easycashFeaturesAccountDynamicFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_account_dynamic, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_action, "field 'btnNext' and method 'onNextButtonClicked'");
        easycashFeaturesAccountDynamicFragment.btnNext = (Button) onStart.write(IconCompatParcelizer, R.id.btn_action, "field 'btnNext'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashFeaturesAccountDynamicFragment.this.onNextButtonClicked();
            }
        });
    }

    public final void read() {
        EasycashFeaturesAccountDynamicFragment easycashFeaturesAccountDynamicFragment = this.MediaBrowserCompat$ItemReceiver;
        if (easycashFeaturesAccountDynamicFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            easycashFeaturesAccountDynamicFragment.recyclerView = null;
            easycashFeaturesAccountDynamicFragment.btnNext = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
