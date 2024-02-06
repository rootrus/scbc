package com.scb.phone.view.fragment.etb;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ETBMarketConductDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ETBMarketConductDetailFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public ETBMarketConductDetailFragment_ViewBinding(final ETBMarketConductDetailFragment eTBMarketConductDetailFragment, View view) {
        super(eTBMarketConductDetailFragment, view);
        this.IconCompatParcelizer = eTBMarketConductDetailFragment;
        eTBMarketConductDetailFragment.viewContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pdf_container, "field 'viewContainer'", FrameLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_read, "field 'btnRead' and method 'onReadButtonClick'");
        eTBMarketConductDetailFragment.btnRead = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_read, "field 'btnRead'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ETBMarketConductDetailFragment.this.onReadButtonClick();
            }
        });
    }

    public final void read() {
        ETBMarketConductDetailFragment eTBMarketConductDetailFragment = this.IconCompatParcelizer;
        if (eTBMarketConductDetailFragment != null) {
            this.IconCompatParcelizer = null;
            eTBMarketConductDetailFragment.viewContainer = null;
            eTBMarketConductDetailFragment.btnRead = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
