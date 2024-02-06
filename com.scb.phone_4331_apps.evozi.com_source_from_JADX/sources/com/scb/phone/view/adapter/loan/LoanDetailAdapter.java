package com.scb.phone.view.adapter.loan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Futures;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class LoanDetailAdapter extends onActivityCreated {
    private LayoutInflater MediaBrowserCompat$CustomActionResultReceiver;
    private List<Futures.C34051> MediaBrowserCompat$ItemReceiver;
    private Context write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class LoanSummaryDetailViewHolder_ViewBinding implements Unbinder {
        private LoanSummaryDetailViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public LoanSummaryDetailViewHolder_ViewBinding(LoanSummaryDetailViewHolder loanSummaryDetailViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = loanSummaryDetailViewHolder;
            loanSummaryDetailViewHolder.loanTypeImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_loan_type, "field 'loanTypeImage'", ImageView.class);
            loanSummaryDetailViewHolder.loanName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_name_text_view, "field 'loanName'", TextView.class);
            loanSummaryDetailViewHolder.loanAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_detail_account_number, "field 'loanAccountNumber'", TextView.class);
            loanSummaryDetailViewHolder.outstandingAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_outstanding_amount_text_view, "field 'outstandingAmount'", TextView.class);
            loanSummaryDetailViewHolder.linearLoanOutstanding = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.linear_loan_outstanding, "field 'linearLoanOutstanding'", LinearLayout.class);
            loanSummaryDetailViewHolder.relativeLoanRestricted = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.relative_loan_restricted, "field 'relativeLoanRestricted'", RelativeLayout.class);
            loanSummaryDetailViewHolder.restrictedImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.restricted_image_view, "field 'restrictedImageView'", ImageView.class);
        }

        public final void read() {
            LoanSummaryDetailViewHolder loanSummaryDetailViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (loanSummaryDetailViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                loanSummaryDetailViewHolder.loanTypeImage = null;
                loanSummaryDetailViewHolder.loanName = null;
                loanSummaryDetailViewHolder.loanAccountNumber = null;
                loanSummaryDetailViewHolder.outstandingAmount = null;
                loanSummaryDetailViewHolder.linearLoanOutstanding = null;
                loanSummaryDetailViewHolder.relativeLoanRestricted = null;
                loanSummaryDetailViewHolder.restrictedImageView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public LoanDetailAdapter(Context context, List<Futures.C34051> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.write = context;
        this.MediaBrowserCompat$ItemReceiver = list == null ? new ArrayList<>() : list;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Futures.C34051 r7 = this.MediaBrowserCompat$ItemReceiver.get(i);
        LoanSummaryDetailViewHolder loanSummaryDetailViewHolder = new LoanSummaryDetailViewHolder(this.MediaBrowserCompat$CustomActionResultReceiver.inflate(R.layout.f84112131493637, (ViewGroup) null));
        if (r7.MediaDescriptionCompat) {
            loanSummaryDetailViewHolder.linearLoanOutstanding.setVisibility(4);
            loanSummaryDetailViewHolder.relativeLoanRestricted.setVisibility(0);
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(this.write, r7.MediaMetadataCompat), loanSummaryDetailViewHolder.restrictedImageView, r7.IconCompatParcelizer);
        } else {
            loanSummaryDetailViewHolder.linearLoanOutstanding.setVisibility(0);
            loanSummaryDetailViewHolder.relativeLoanRestricted.setVisibility(8);
        }
        FragmentBuilder_BindDepositSelectorFragment.write(setLastBaselineToBottomHeight.write(this.write, r7.MediaBrowserCompat$MediaItem), loanSummaryDetailViewHolder.loanTypeImage, r7.setChecked);
        loanSummaryDetailViewHolder.loanName.setText(r7.MediaSessionCompat$Token);
        loanSummaryDetailViewHolder.loanAccountNumber.setText(r7.MediaBrowserCompat$CustomActionResultReceiver);
        loanSummaryDetailViewHolder.outstandingAmount.setText(r7.AppCompatViewInflater);
        viewGroup.addView(loanSummaryDetailViewHolder.AlertController$RecycleListView, 0);
        return loanSummaryDetailViewHolder.AlertController$RecycleListView;
    }

    static class LoanSummaryDetailViewHolder extends RecyclerView.setContentView {
        View AlertController$RecycleListView;
        @BindView
        LinearLayout linearLoanOutstanding;
        @BindView
        TextView loanAccountNumber;
        @BindView
        TextView loanName;
        @BindView
        ImageView loanTypeImage;
        @BindView
        TextView outstandingAmount;
        @BindView
        RelativeLayout relativeLoanRestricted;
        @BindView
        ImageView restrictedImageView;

        LoanSummaryDetailViewHolder(View view) {
            super(view);
            this.AlertController$RecycleListView = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
