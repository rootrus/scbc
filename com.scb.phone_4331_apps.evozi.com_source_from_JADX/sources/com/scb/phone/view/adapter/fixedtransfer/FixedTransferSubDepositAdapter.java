package com.scb.phone.view.adapter.fixedtransfer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.getBondTermsAndConditions;
import p040o.onStart;
import p040o.parseEventExecutionException;

public final class FixedTransferSubDepositAdapter extends RecyclerView.IconCompatParcelizer<SubDepositViewHolder> {
    public List<parseEventExecutionException> MediaBrowserCompat$ItemReceiver;
    public C5754x33d87c9f read;

    public class SubDepositViewHolder_ViewBinding implements Unbinder {
        private SubDepositViewHolder MediaBrowserCompat$ItemReceiver;

        public SubDepositViewHolder_ViewBinding(SubDepositViewHolder subDepositViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = subDepositViewHolder;
            subDepositViewHolder.tvNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_number, "field 'tvNumber'", TextView.class);
            subDepositViewHolder.tvAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'tvAmount'", TextView.class);
            subDepositViewHolder.cbSelect = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cb_select, "field 'cbSelect'", CheckBox.class);
            subDepositViewHolder.tvDepositDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_deposit_date, "field 'tvDepositDate'", TextView.class);
            subDepositViewHolder.tvMaturityDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_maturity_date, "field 'tvMaturityDate'", TextView.class);
            subDepositViewHolder.pbDepositProgress = (ProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pb_deposit_progress, "field 'pbDepositProgress'", ProgressBar.class);
        }

        public final void read() {
            SubDepositViewHolder subDepositViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (subDepositViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                subDepositViewHolder.tvNumber = null;
                subDepositViewHolder.tvAmount = null;
                subDepositViewHolder.cbSelect = null;
                subDepositViewHolder.tvDepositDate = null;
                subDepositViewHolder.tvMaturityDate = null;
                subDepositViewHolder.pbDepositProgress = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        SubDepositViewHolder subDepositViewHolder = (SubDepositViewHolder) setcontentview;
        parseEventExecutionException parseeventexecutionexception = this.MediaBrowserCompat$ItemReceiver.get(i);
        C5754x33d87c9f fixedTransferSubDepositAdapter$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        Context context = subDepositViewHolder.write.getContext();
        subDepositViewHolder.tvNumber.setText(context.getString(R.string.subdeposit_number, new Object[]{parseeventexecutionexception.MediaBrowserCompat$ItemReceiver}));
        subDepositViewHolder.tvAmount.setText(context.getString(R.string.deposit_amount_value, new Object[]{parseeventexecutionexception.MediaBrowserCompat$CustomActionResultReceiver}));
        subDepositViewHolder.cbSelect.setChecked(parseeventexecutionexception.MediaMetadataCompat);
        subDepositViewHolder.tvDepositDate.setText(context.getString(R.string.subdeposit_deposit_date, new Object[]{parseeventexecutionexception.write}));
        subDepositViewHolder.tvMaturityDate.setText(context.getString(R.string.subdeposit_maturity_date, new Object[]{parseeventexecutionexception.MediaBrowserCompat$MediaItem}));
        subDepositViewHolder.pbDepositProgress.setProgress((int) parseeventexecutionexception.read);
        subDepositViewHolder.cbSelect.setOnCheckedChangeListener(new getBondTermsAndConditions(subDepositViewHolder, parseeventexecutionexception, fixedTransferSubDepositAdapter$MediaBrowserCompat$CustomActionResultReceiver));
    }

    public FixedTransferSubDepositAdapter(List<parseEventExecutionException> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int IconCompatParcelizer() {
        List<parseEventExecutionException> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static class SubDepositViewHolder extends RecyclerView.setContentView {
        @BindView
        CheckBox cbSelect;
        @BindView
        ProgressBar pbDepositProgress;
        @BindView
        TextView tvAmount;
        @BindView
        TextView tvDepositDate;
        @BindView
        TextView tvMaturityDate;
        @BindView
        TextView tvNumber;

        public SubDepositViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new SubDepositViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83932131493619, viewGroup, false));
    }
}
