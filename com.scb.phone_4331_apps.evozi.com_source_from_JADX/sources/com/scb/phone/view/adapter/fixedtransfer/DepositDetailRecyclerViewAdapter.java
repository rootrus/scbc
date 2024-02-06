package com.scb.phone.view.adapter.fixedtransfer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.onStart;
import p040o.parseEventExecutionException;

public final class DepositDetailRecyclerViewAdapter extends RecyclerView.IconCompatParcelizer<DepositViewHolder> {
    private List<parseEventExecutionException> write;

    public class DepositViewHolder_ViewBinding implements Unbinder {
        private DepositViewHolder write;

        public DepositViewHolder_ViewBinding(DepositViewHolder depositViewHolder, View view) {
            this.write = depositViewHolder;
            depositViewHolder.mDepositCount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_deposit_count_title, "field 'mDepositCount'", TextView.class);
            depositViewHolder.mDepositAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_deposit_amount_value, "field 'mDepositAmount'", TextView.class);
            depositViewHolder.mDepositDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_deposit_date_value, "field 'mDepositDate'", TextView.class);
            depositViewHolder.mMaturityDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_maturity_date_value, "field 'mMaturityDate'", TextView.class);
            depositViewHolder.mDepositInterest = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_deposit_interest_value, "field 'mDepositInterest'", TextView.class);
            depositViewHolder.mDepositInterestRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_deposit_interest_rate_value, "field 'mDepositInterestRate'", TextView.class);
            depositViewHolder.mDepositWithholdingTax = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_deposit_withholding_tax_value, "field 'mDepositWithholdingTax'", TextView.class);
            depositViewHolder.mDepositNetAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_deposit_net_amount_value, "field 'mDepositNetAmount'", TextView.class);
            depositViewHolder.viewLineCloseList = onStart.IconCompatParcelizer(view, R.id.view_line_close_list, "field 'viewLineCloseList'");
        }

        public final void read() {
            DepositViewHolder depositViewHolder = this.write;
            if (depositViewHolder != null) {
                this.write = null;
                depositViewHolder.mDepositCount = null;
                depositViewHolder.mDepositAmount = null;
                depositViewHolder.mDepositDate = null;
                depositViewHolder.mMaturityDate = null;
                depositViewHolder.mDepositInterest = null;
                depositViewHolder.mDepositInterestRate = null;
                depositViewHolder.mDepositWithholdingTax = null;
                depositViewHolder.mDepositNetAmount = null;
                depositViewHolder.viewLineCloseList = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DepositViewHolder depositViewHolder = (DepositViewHolder) setcontentview;
        List<parseEventExecutionException> list = this.write;
        parseEventExecutionException parseeventexecutionexception = (list == null || i < 0 || i >= list.size()) ? null : this.write.get(i);
        if (parseeventexecutionexception != null) {
            TextView textView = depositViewHolder.mDepositCount;
            StringBuilder sb = new StringBuilder();
            sb.append(depositViewHolder.write.getContext().getString(R.string.fixed_transfer_deposit_count));
            sb.append(parseeventexecutionexception.MediaBrowserCompat$ItemReceiver);
            textView.setText(sb.toString());
            depositViewHolder.mDepositAmount.setText(parseeventexecutionexception.MediaBrowserCompat$CustomActionResultReceiver);
            depositViewHolder.mDepositDate.setText(parseeventexecutionexception.write);
            depositViewHolder.mMaturityDate.setText(parseeventexecutionexception.MediaBrowserCompat$MediaItem);
            depositViewHolder.mDepositInterest.setText(parseeventexecutionexception.IconCompatParcelizer);
            depositViewHolder.mDepositInterestRate.setText(parseeventexecutionexception.MediaDescriptionCompat);
            depositViewHolder.mDepositWithholdingTax.setText(parseeventexecutionexception.MediaBrowserCompat$SearchResultReceiver);
            depositViewHolder.mDepositNetAmount.setText(parseeventexecutionexception.RatingCompat);
        } else {
            depositViewHolder.mDepositCount.setText((CharSequence) null);
            depositViewHolder.mDepositAmount.setText((CharSequence) null);
            depositViewHolder.mDepositDate.setText((CharSequence) null);
            depositViewHolder.mMaturityDate.setText((CharSequence) null);
            depositViewHolder.mDepositInterest.setText((CharSequence) null);
            depositViewHolder.mDepositInterestRate.setText((CharSequence) null);
            depositViewHolder.mDepositWithholdingTax.setText((CharSequence) null);
            depositViewHolder.mDepositNetAmount.setText((CharSequence) null);
        }
        if (this.write.isEmpty() || i != this.write.size() - 1) {
            depositViewHolder.viewLineCloseList.setVisibility(8);
        } else {
            depositViewHolder.viewLineCloseList.setVisibility(0);
        }
    }

    public DepositDetailRecyclerViewAdapter(List<parseEventExecutionException> list) {
        this.write = list;
    }

    public final int IconCompatParcelizer() {
        List<parseEventExecutionException> list = this.write;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    protected static class DepositViewHolder extends RecyclerView.setContentView {
        @BindView
        TextView mDepositAmount;
        @BindView
        TextView mDepositCount;
        @BindView
        TextView mDepositDate;
        @BindView
        TextView mDepositInterest;
        @BindView
        TextView mDepositInterestRate;
        @BindView
        TextView mDepositNetAmount;
        @BindView
        TextView mDepositWithholdingTax;
        @BindView
        TextView mMaturityDate;
        @BindView
        View viewLineCloseList;

        DepositViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DepositViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82832131493509, viewGroup, false));
    }
}
