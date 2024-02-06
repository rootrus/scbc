package com.scb.phone.view.fragment.hml.frictionlessmoa;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlMoaFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlMoaFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlMoaFragment_ViewBinding(final HmlMoaFragment hmlMoaFragment, View view) {
        super(hmlMoaFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlMoaFragment;
        hmlMoaFragment.btMoa = (CustomAcceptDeclineButtons) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_moabuttons, "field 'btMoa'", CustomAcceptDeclineButtons.class);
        hmlMoaFragment.accountHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_header, "field 'accountHeader'", TextView.class);
        hmlMoaFragment.disclaimer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_disclaimer, "field 'disclaimer'", TextView.class);
        hmlMoaFragment.accountList = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_account_list, "field 'accountList'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_moa_next, "field 'nextButton' and method 'onNextClicked'");
        hmlMoaFragment.nextButton = (Button) onStart.write(IconCompatParcelizer, R.id.bt_moa_next, "field 'nextButton'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlMoaFragment.this.onNextClicked();
            }
        });
    }

    public final void read() {
        HmlMoaFragment hmlMoaFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlMoaFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlMoaFragment.btMoa = null;
            hmlMoaFragment.accountHeader = null;
            hmlMoaFragment.disclaimer = null;
            hmlMoaFragment.accountList = null;
            hmlMoaFragment.nextButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
