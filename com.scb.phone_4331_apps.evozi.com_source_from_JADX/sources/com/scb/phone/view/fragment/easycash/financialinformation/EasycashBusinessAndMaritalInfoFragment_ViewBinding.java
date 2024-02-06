package com.scb.phone.view.fragment.easycash.financialinformation;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class EasycashBusinessAndMaritalInfoFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private EasycashBusinessAndMaritalInfoFragment MediaBrowserCompat$ItemReceiver;

    public EasycashBusinessAndMaritalInfoFragment_ViewBinding(final EasycashBusinessAndMaritalInfoFragment easycashBusinessAndMaritalInfoFragment, View view) {
        super(easycashBusinessAndMaritalInfoFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashBusinessAndMaritalInfoFragment;
        easycashBusinessAndMaritalInfoFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_business_and_marital, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_action, "field 'btnNext' and method 'onNextButtonClicked'");
        easycashBusinessAndMaritalInfoFragment.btnNext = (Button) onStart.write(IconCompatParcelizer, R.id.btn_action, "field 'btnNext'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashBusinessAndMaritalInfoFragment.this.onNextButtonClicked();
            }
        });
    }

    public final void read() {
        EasycashBusinessAndMaritalInfoFragment easycashBusinessAndMaritalInfoFragment = this.MediaBrowserCompat$ItemReceiver;
        if (easycashBusinessAndMaritalInfoFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            easycashBusinessAndMaritalInfoFragment.recyclerView = null;
            easycashBusinessAndMaritalInfoFragment.btnNext = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
