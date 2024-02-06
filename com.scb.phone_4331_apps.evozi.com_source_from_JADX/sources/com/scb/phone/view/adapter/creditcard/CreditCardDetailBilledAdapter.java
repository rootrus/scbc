package com.scb.phone.view.adapter.creditcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindBillPaymentBillerListFragment;
import p040o.countryInfo;
import p040o.getInterface;
import p040o.onStart;

public final class CreditCardDetailBilledAdapter extends RecyclerView.IconCompatParcelizer<BilledHolder> {
    public FragmentBuilder_BindBillPaymentBillerListFragment MediaBrowserCompat$ItemReceiver;
    public List<getInterface> read;

    public class BilledHolder_ViewBinding implements Unbinder {
        private BilledHolder IconCompatParcelizer;

        public BilledHolder_ViewBinding(BilledHolder billedHolder, View view) {
            this.IconCompatParcelizer = billedHolder;
            billedHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container_biller, "field 'container'", RelativeLayout.class);
            billedHolder.month = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_date_text_view, "field 'month'", TextView.class);
            billedHolder.value = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_value_text_view, "field 'value'", TextView.class);
            billedHolder.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.billed_arrow_image_view, "field 'icon'", ImageView.class);
            billedHolder.footerDividerView = onStart.IconCompatParcelizer(view, R.id.footer_divider_view, "field 'footerDividerView'");
        }

        public final void read() {
            BilledHolder billedHolder = this.IconCompatParcelizer;
            if (billedHolder != null) {
                this.IconCompatParcelizer = null;
                billedHolder.container = null;
                billedHolder.month = null;
                billedHolder.value = null;
                billedHolder.icon = null;
                billedHolder.footerDividerView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        BilledHolder billedHolder = (BilledHolder) setcontentview;
        billedHolder.month.setText(this.read.get(i).MediaBrowserCompat$CustomActionResultReceiver);
        billedHolder.value.setText(this.read.get(i).IconCompatParcelizer);
        billedHolder.container.setOnClickListener(new countryInfo(this, i));
        if (i == this.read.size() - 1) {
            billedHolder.footerDividerView.setVisibility(0);
        } else {
            billedHolder.footerDividerView.setVisibility(8);
        }
    }

    public CreditCardDetailBilledAdapter(List<getInterface> list, FragmentBuilder_BindBillPaymentBillerListFragment fragmentBuilder_BindBillPaymentBillerListFragment) {
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBillPaymentBillerListFragment;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    static class BilledHolder extends RecyclerView.setContentView {
        @BindView
        RelativeLayout container;
        @BindView
        View footerDividerView;
        @BindView
        ImageView icon;
        @BindView
        TextView month;
        @BindView
        TextView value;

        BilledHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new BilledHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82502131493476, viewGroup, false));
    }
}
