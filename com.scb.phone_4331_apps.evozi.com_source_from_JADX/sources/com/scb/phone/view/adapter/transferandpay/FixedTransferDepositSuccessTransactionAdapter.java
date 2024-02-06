package com.scb.phone.view.adapter.transferandpay;

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
import p040o.CrashlyticsReport;
import p040o.onStart;

public final class FixedTransferDepositSuccessTransactionAdapter extends RecyclerView.IconCompatParcelizer<DepositViewHolder> {
    private List<CrashlyticsReport.Session.Device.Builder> read;

    public class DepositViewHolder_ViewBinding implements Unbinder {
        private DepositViewHolder MediaBrowserCompat$ItemReceiver;

        public DepositViewHolder_ViewBinding(DepositViewHolder depositViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = depositViewHolder;
            depositViewHolder.mTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'mTitleTextView'", TextView.class);
            depositViewHolder.mStatusSuccessImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.status_success_image, "field 'mStatusSuccessImageView'", ImageView.class);
            depositViewHolder.mStatusErrorImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.status_error_image, "field 'mStatusErrorImageView'", ImageView.class);
            depositViewHolder.mAmountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_value_text_view, "field 'mAmountTextView'", TextView.class);
            depositViewHolder.mInterestTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.interest_value_text_view, "field 'mInterestTextView'", TextView.class);
            depositViewHolder.mWithholdingTaxTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.withholding_tax_value_text_view, "field 'mWithholdingTaxTextView'", TextView.class);
            depositViewHolder.mTotalTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_value_text_view, "field 'mTotalTextView'", TextView.class);
            depositViewHolder.mErrorTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'mErrorTextView'", TextView.class);
        }

        public final void read() {
            DepositViewHolder depositViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (depositViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                depositViewHolder.mTitleTextView = null;
                depositViewHolder.mStatusSuccessImageView = null;
                depositViewHolder.mStatusErrorImageView = null;
                depositViewHolder.mAmountTextView = null;
                depositViewHolder.mInterestTextView = null;
                depositViewHolder.mWithholdingTaxTextView = null;
                depositViewHolder.mTotalTextView = null;
                depositViewHolder.mErrorTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DepositViewHolder depositViewHolder = (DepositViewHolder) setcontentview;
        List<CrashlyticsReport.Session.Device.Builder> list = this.read;
        CrashlyticsReport.Session.Device.Builder builder = (list == null || i < 0 || i >= list.size()) ? null : this.read.get(i);
        if (builder != null) {
            depositViewHolder.mTitleTextView.setText(builder.IconCompatParcelizer);
            depositViewHolder.mAmountTextView.setText(builder.write);
            depositViewHolder.mInterestTextView.setText(builder.MediaBrowserCompat$ItemReceiver);
            depositViewHolder.mWithholdingTaxTextView.setText(builder.MediaBrowserCompat$MediaItem);
            depositViewHolder.mTotalTextView.setText(builder.MediaDescriptionCompat);
            if (builder.read) {
                depositViewHolder.mStatusSuccessImageView.setVisibility(0);
                depositViewHolder.mStatusErrorImageView.setVisibility(8);
                depositViewHolder.mErrorTextView.setVisibility(8);
                return;
            }
            depositViewHolder.mErrorTextView.setVisibility(0);
            depositViewHolder.mErrorTextView.setText(builder.MediaBrowserCompat$CustomActionResultReceiver);
            depositViewHolder.mStatusErrorImageView.setVisibility(0);
            depositViewHolder.mStatusSuccessImageView.setVisibility(8);
            return;
        }
        depositViewHolder.mTitleTextView.setText((CharSequence) null);
        depositViewHolder.mAmountTextView.setText((CharSequence) null);
        depositViewHolder.mInterestTextView.setText((CharSequence) null);
        depositViewHolder.mWithholdingTaxTextView.setText((CharSequence) null);
        depositViewHolder.mTotalTextView.setText((CharSequence) null);
        depositViewHolder.mStatusSuccessImageView.setVisibility(8);
        depositViewHolder.mStatusErrorImageView.setVisibility(8);
    }

    public FixedTransferDepositSuccessTransactionAdapter(List<CrashlyticsReport.Session.Device.Builder> list) {
        this.read = list;
    }

    public final int IconCompatParcelizer() {
        List<CrashlyticsReport.Session.Device.Builder> list = this.read;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    protected static class DepositViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView mAmountTextView;
        @BindView
        TextView mErrorTextView;
        @BindView
        TextView mInterestTextView;
        @BindView
        ImageView mStatusErrorImageView;
        @BindView
        ImageView mStatusSuccessImageView;
        @BindView
        TextView mTitleTextView;
        @BindView
        TextView mTotalTextView;
        @BindView
        TextView mWithholdingTaxTextView;

        DepositViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DepositViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91452131494372, viewGroup, false));
    }
}
