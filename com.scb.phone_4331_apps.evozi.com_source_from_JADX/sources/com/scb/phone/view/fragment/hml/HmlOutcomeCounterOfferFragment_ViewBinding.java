package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlOutcomeCounterOfferFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlOutcomeCounterOfferFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlOutcomeCounterOfferFragment_ViewBinding(final HmlOutcomeCounterOfferFragment hmlOutcomeCounterOfferFragment, View view) {
        super(hmlOutcomeCounterOfferFragment, view);
        this.IconCompatParcelizer = hmlOutcomeCounterOfferFragment;
        hmlOutcomeCounterOfferFragment.headerBackground = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_counter_background, "field 'headerBackground'", ImageView.class);
        hmlOutcomeCounterOfferFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_offers, "field 'recyclerView'", RecyclerView.class);
        hmlOutcomeCounterOfferFragment.dateText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_date, "field 'dateText'", TextView.class);
        hmlOutcomeCounterOfferFragment.hourRemarkText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_hml_hour_remark, "field 'hourRemarkText'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_return_home, "method 'onButtonReturnHomeClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeCounterOfferFragment.this.onButtonReturnHomeClicked(view);
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_decline_all, "method 'onButtonDeclineAllClicked'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeCounterOfferFragment.this.onButtonDeclineAllClicked(view);
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.bt_hml_contact_call_center, "method 'onContactCallCenter'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlOutcomeCounterOfferFragment.this.onContactCallCenter(view);
            }
        });
    }

    public final void read() {
        HmlOutcomeCounterOfferFragment hmlOutcomeCounterOfferFragment = this.IconCompatParcelizer;
        if (hmlOutcomeCounterOfferFragment != null) {
            this.IconCompatParcelizer = null;
            hmlOutcomeCounterOfferFragment.headerBackground = null;
            hmlOutcomeCounterOfferFragment.recyclerView = null;
            hmlOutcomeCounterOfferFragment.dateText = null;
            hmlOutcomeCounterOfferFragment.hourRemarkText = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
