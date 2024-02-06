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
import p040o.Futures;
import p040o.getBusinessOwnerLatestLoanOfferStatus;
import p040o.getCreditCardSummary;
import p040o.onStart;
import p040o.validateGER;
import p040o.validateSPMV;

public final class SmeLoanDetailCommercialItemAdapter extends getCreditCardSummary {
    private List<Futures.ChainingListenableFuture> MediaBrowserCompat$ItemReceiver;
    private View.OnClickListener read = new getBusinessOwnerLatestLoanOfferStatus(this);

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder write;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.write = childViewHolder;
            childViewHolder.textCommercialAccountNameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_commercial_account_name_value, "field 'textCommercialAccountNameValue'", TextView.class);
            childViewHolder.textCommercialInstallmentAmountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_commercial_installment_amount_value, "field 'textCommercialInstallmentAmountValue'", TextView.class);
            childViewHolder.textCommercialInterestRateValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_commercial_interest_rate_value, "field 'textCommercialInterestRateValue'", TextView.class);
            childViewHolder.textCommercialNoOfLatePaymentValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_commercial_no_of_late_payment_value, "field 'textCommercialNoOfLatePaymentValue'", TextView.class);
            childViewHolder.textCommercialTenorValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_commercial_tenor_value, "field 'textCommercialTenorValue'", TextView.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.write;
            if (childViewHolder != null) {
                this.write = null;
                childViewHolder.textCommercialAccountNameValue = null;
                childViewHolder.textCommercialInstallmentAmountValue = null;
                childViewHolder.textCommercialInterestRateValue = null;
                childViewHolder.textCommercialNoOfLatePaymentValue = null;
                childViewHolder.textCommercialTenorValue = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class GroupItemViewHolder_ViewBinding implements Unbinder {
        private GroupItemViewHolder MediaBrowserCompat$ItemReceiver;

        public GroupItemViewHolder_ViewBinding(GroupItemViewHolder groupItemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = groupItemViewHolder;
            groupItemViewHolder.container = onStart.IconCompatParcelizer(view, R.id.container, "field 'container'");
            groupItemViewHolder.textDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_sme_loan_commercial_description, "field 'textDescription'", TextView.class);
            groupItemViewHolder.expandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIcon'", ImageView.class);
        }

        public final void read() {
            GroupItemViewHolder groupItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (groupItemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                groupItemViewHolder.container = null;
                groupItemViewHolder.textDescription = null;
                groupItemViewHolder.expandIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SmeLoanDetailCommercialItemAdapter(Context context, validateGER validateger, List<Futures.ChainingListenableFuture> list) {
        super(context, validateger);
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        return new GroupItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83842131493610, viewGroup, false), this.read);
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83852131493611, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof GroupItemViewHolder) {
            GroupItemViewHolder groupItemViewHolder = (GroupItemViewHolder) setcontentview;
            groupItemViewHolder.textDescription.setText(SmeLoanDetailCommercialItemAdapter.this.MediaBrowserCompat$ItemReceiver.get(i).setBackgroundResource);
            boolean z = true;
            groupItemViewHolder.write.setClickable(true);
            groupItemViewHolder.expandIcon.setVisibility(0);
            int i2 = groupItemViewHolder.AlertController$RecycleListView.write;
            if ((Integer.MIN_VALUE & i2) != 0) {
                if ((i2 & 4) == 0) {
                    z = false;
                }
                groupItemViewHolder.expandIcon.setImageResource(z ? R.drawable.ic_expand_less_black_24dp : R.drawable.ic_expand_more_black_24dp);
            }
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            Futures.ChainingListenableFuture chainingListenableFuture = SmeLoanDetailCommercialItemAdapter.this.MediaBrowserCompat$ItemReceiver.get(i);
            childViewHolder.textCommercialAccountNameValue.setText(chainingListenableFuture.IconCompatParcelizer);
            childViewHolder.textCommercialInstallmentAmountValue.setText(chainingListenableFuture.MediaMetadataCompat);
            childViewHolder.textCommercialInterestRateValue.setText(chainingListenableFuture.RatingCompat);
            childViewHolder.textCommercialNoOfLatePaymentValue.setText(chainingListenableFuture.MediaBrowserCompat$MediaItem);
            childViewHolder.textCommercialTenorValue.setText(chainingListenableFuture.AppCompatDelegateImpl$ListMenuDecorView);
        }
    }

    class GroupItemViewHolder extends validateSPMV {
        @BindView
        View container;
        @BindView
        ImageView expandIcon;
        @BindView
        TextView textDescription;

        GroupItemViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.container.setOnClickListener(onClickListener);
        }
    }

    class ChildViewHolder extends validateSPMV {
        @BindView
        TextView textCommercialAccountNameValue;
        @BindView
        TextView textCommercialInstallmentAmountValue;
        @BindView
        TextView textCommercialInterestRateValue;
        @BindView
        TextView textCommercialNoOfLatePaymentValue;
        @BindView
        TextView textCommercialTenorValue;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
