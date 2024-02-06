package com.scb.phone.view.adapter.loan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.Futures;
import p040o.getBillPaymentTransactions;
import p040o.getCreditCardSummary;
import p040o.onStart;
import p040o.validateGER;
import p040o.validateSPMV;

public final class SmeLoanDetailPnItemAdapter extends getCreditCardSummary {
    private List<Futures.C34115> MediaBrowserCompat$ItemReceiver;
    private View.OnClickListener read = new getBillPaymentTransactions(this);

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder MediaBrowserCompat$ItemReceiver;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = childViewHolder;
            childViewHolder.textPnNextPaymentAmountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_pn_next_payment_amount_value, "field 'textPnNextPaymentAmountValue'", TextView.class);
            childViewHolder.textPnInterestRateValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_pn_interest_rate_value, "field 'textPnInterestRateValue'", TextView.class);
            childViewHolder.textPnNextPaymentDateValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_pn_next_payment_date_value, "field 'textPnNextPaymentDateValue'", TextView.class);
            childViewHolder.textPnStartDateValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_pn_start_date_value, "field 'textPnStartDateValue'", TextView.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (childViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                childViewHolder.textPnNextPaymentAmountValue = null;
                childViewHolder.textPnInterestRateValue = null;
                childViewHolder.textPnNextPaymentDateValue = null;
                childViewHolder.textPnStartDateValue = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class GroupItemViewHolder_ViewBinding implements Unbinder {
        private GroupItemViewHolder IconCompatParcelizer;

        public GroupItemViewHolder_ViewBinding(GroupItemViewHolder groupItemViewHolder, View view) {
            this.IconCompatParcelizer = groupItemViewHolder;
            groupItemViewHolder.container = onStart.IconCompatParcelizer(view, R.id.container, "field 'container'");
            groupItemViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            groupItemViewHolder.textAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_amount, "field 'textAmount'", TextView.class);
            groupItemViewHolder.textPaidOffStatus = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_paid_off_status, "field 'textPaidOffStatus'", TextView.class);
            groupItemViewHolder.textTimestamp = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_timestamp, "field 'textTimestamp'", TextView.class);
            groupItemViewHolder.expandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIcon'", ImageView.class);
        }

        public final void read() {
            GroupItemViewHolder groupItemViewHolder = this.IconCompatParcelizer;
            if (groupItemViewHolder != null) {
                this.IconCompatParcelizer = null;
                groupItemViewHolder.container = null;
                groupItemViewHolder.textTitle = null;
                groupItemViewHolder.textAmount = null;
                groupItemViewHolder.textPaidOffStatus = null;
                groupItemViewHolder.textTimestamp = null;
                groupItemViewHolder.expandIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SmeLoanDetailPnItemAdapter(Context context, validateGER validateger, List<Futures.C34115> list) {
        super(context, validateger);
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        return new GroupItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83892131493615, viewGroup, false), this.read);
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83902131493616, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof GroupItemViewHolder) {
            GroupItemViewHolder groupItemViewHolder = (GroupItemViewHolder) setcontentview;
            Futures.C34115 r4 = SmeLoanDetailPnItemAdapter.this.MediaBrowserCompat$ItemReceiver.get(i);
            groupItemViewHolder.textTitle.setText(r4.read);
            groupItemViewHolder.textAmount.setText(r4.MediaBrowserCompat$SearchResultReceiver);
            groupItemViewHolder.textTimestamp.setText(r4.IconCompatParcelizer);
            boolean z = false;
            groupItemViewHolder.textPaidOffStatus.setVisibility(DiskLruCache.VERSION_1.equals(r4.RatingCompat) ? 0 : 8);
            int i2 = groupItemViewHolder.AlertController$RecycleListView.write;
            if ((Integer.MIN_VALUE & i2) != 0) {
                if ((i2 & 4) != 0) {
                    z = true;
                }
                groupItemViewHolder.expandIcon.setImageResource(z ? R.drawable.ic_expand_less_black_24dp : R.drawable.ic_expand_more_black_24dp);
            }
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            Futures.C34115 r3 = SmeLoanDetailPnItemAdapter.this.MediaBrowserCompat$ItemReceiver.get(i);
            childViewHolder.textPnNextPaymentAmountValue.setText(r3.write);
            childViewHolder.textPnInterestRateValue.setText(r3.MediaBrowserCompat$CustomActionResultReceiver);
            childViewHolder.textPnNextPaymentDateValue.setText(r3.MediaBrowserCompat$ItemReceiver);
            childViewHolder.textPnStartDateValue.setText(r3.MediaDescriptionCompat);
        }
    }

    class GroupItemViewHolder extends validateSPMV {
        @BindView
        View container;
        @BindView
        ImageView expandIcon;
        @BindView
        TextView textAmount;
        @BindView
        TextView textPaidOffStatus;
        @BindView
        TextView textTimestamp;
        @BindView
        TextView textTitle;

        GroupItemViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.container.setOnClickListener(onClickListener);
        }
    }

    class ChildViewHolder extends validateSPMV {
        @BindView
        TextView textPnInterestRateValue;
        @BindView
        TextView textPnNextPaymentAmountValue;
        @BindView
        TextView textPnNextPaymentDateValue;
        @BindView
        TextView textPnStartDateValue;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
