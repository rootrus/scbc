package com.scb.phone.view.fragment.easycash.issuer;

import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.RectangleRelativeLayout;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashIssuerLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private EasycashIssuerLandingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public EasycashIssuerLandingFragment_ViewBinding(final EasycashIssuerLandingFragment easycashIssuerLandingFragment, View view) {
        super(easycashIssuerLandingFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashIssuerLandingFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.add_issuer_button, "field 'addIssuerButton' and method 'addIssuerClick'");
        easycashIssuerLandingFragment.addIssuerButton = (Button) onStart.write(IconCompatParcelizer2, R.id.add_issuer_button, "field 'addIssuerButton'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashIssuerLandingFragment.this.addIssuerClick();
            }
        });
        easycashIssuerLandingFragment.issuerRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_issuer, "field 'issuerRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.rectangle_relative_layout, "field 'issuerErrorCard' and method 'onIssuerErrorClick'");
        easycashIssuerLandingFragment.issuerErrorCard = (RectangleRelativeLayout) onStart.write(IconCompatParcelizer3, R.id.rectangle_relative_layout, "field 'issuerErrorCard'", RectangleRelativeLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashIssuerLandingFragment.this.onIssuerErrorClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'nextButtonClick'");
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashIssuerLandingFragment.this.nextButtonClick();
            }
        });
    }

    public final void read() {
        EasycashIssuerLandingFragment easycashIssuerLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (easycashIssuerLandingFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            easycashIssuerLandingFragment.addIssuerButton = null;
            easycashIssuerLandingFragment.issuerRecyclerView = null;
            easycashIssuerLandingFragment.issuerErrorCard = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
