package com.scb.phone.view.adapter.transferandpay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.getEasycashNtbLoansList;
import p040o.onStart;

public final class PaybackPeriodAdapter extends RecyclerView.IconCompatParcelizer {
    public List<AutoValue_CrashlyticsReport_Session_Event_Device> MediaBrowserCompat$ItemReceiver;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment read;
    public int write = -1;

    class read extends SelectedItemHolder {
    }

    public class SelectedItemHolder_ViewBinding implements Unbinder {
        private SelectedItemHolder MediaBrowserCompat$ItemReceiver;

        public SelectedItemHolder_ViewBinding(SelectedItemHolder selectedItemHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = selectedItemHolder;
            selectedItemHolder.amount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_text_view, "field 'amount'", TextView.class);
            selectedItemHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_container_relative_layout, "field 'container'", RelativeLayout.class);
        }

        public final void read() {
            SelectedItemHolder selectedItemHolder = this.MediaBrowserCompat$ItemReceiver;
            if (selectedItemHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                selectedItemHolder.amount = null;
                selectedItemHolder.container = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public PaybackPeriodAdapter(List<AutoValue_CrashlyticsReport_Session_Event_Device> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new PaybackPeriodAdapter$MediaBrowserCompat$ItemReceiver(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82302131493456, viewGroup, false));
        }
        return new SelectedItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82312131493457, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        SelectedItemHolder selectedItemHolder = (SelectedItemHolder) setcontentview;
        selectedItemHolder.amount.setText(this.MediaBrowserCompat$ItemReceiver.get(i).read);
        if (!(setcontentview instanceof read)) {
            selectedItemHolder.container.setOnClickListener(new getEasycashNtbLoansList(this, i));
        }
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return i == this.write ? 0 : 1;
    }

    class SelectedItemHolder extends RecyclerView.setContentView {
        @BindView
        TextView amount;
        @BindView
        RelativeLayout container;

        SelectedItemHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
