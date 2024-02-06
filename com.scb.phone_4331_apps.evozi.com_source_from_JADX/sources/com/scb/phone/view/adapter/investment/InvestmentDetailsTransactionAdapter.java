package com.scb.phone.view.adapter.investment;

import android.content.Context;
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
import okhttp3.internal.cache.DiskLruCache;
import p040o.CrashlyticsCore;
import p040o.FragmentBuilder_BindBondNoAccountsErrorFragment;
import p040o.changeStatementChannel;
import p040o.getICheckDeserializerRtti;
import p040o.onStart;

public final class InvestmentDetailsTransactionAdapter extends RecyclerView.IconCompatParcelizer<TransactionHolder> {
    private Context MediaBrowserCompat$ItemReceiver;
    private List<CrashlyticsCore.C32473> read;
    public FragmentBuilder_BindBondNoAccountsErrorFragment write;

    public class TransactionHolder_ViewBinding implements Unbinder {
        private TransactionHolder IconCompatParcelizer;

        public TransactionHolder_ViewBinding(TransactionHolder transactionHolder, View view) {
            this.IconCompatParcelizer = transactionHolder;
            transactionHolder.container = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_container, "field 'container'", RelativeLayout.class);
            transactionHolder.mLine = onStart.IconCompatParcelizer(view, R.id.transaction_line, "field 'mLine'");
            transactionHolder.mBottomLine = onStart.IconCompatParcelizer(view, R.id.transaction_vertical_line_view, "field 'mBottomLine'");
            transactionHolder.mEmptyDot = onStart.IconCompatParcelizer(view, R.id.transaction_empty_dot, "field 'mEmptyDot'");
            transactionHolder.mDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_date_time, "field 'mDateTime'", TextView.class);
            transactionHolder.mClientNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_client_no, "field 'mClientNo'", TextView.class);
            transactionHolder.mTransactionType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_transaction_type, "field 'mTransactionType'", TextView.class);
            transactionHolder.mFundCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_fund_code, "field 'mFundCode'", TextView.class);
            transactionHolder.mQuantity = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_quantity, "field 'mQuantity'", TextView.class);
            transactionHolder.mQuantityLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_quantity_label, "field 'mQuantityLabel'", TextView.class);
            transactionHolder.mTransactionLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_transaction_label, "field 'mTransactionLabel'", TextView.class);
            transactionHolder.mReference = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_reference, "field 'mReference'", TextView.class);
            transactionHolder.mEffectiveDateLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_effective_date_label, "field 'mEffectiveDateLabel'", TextView.class);
            transactionHolder.mEffectiveDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_effective_date_value, "field 'mEffectiveDate'", TextView.class);
            transactionHolder.mAllowDelete = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_allow_delete_image_view, "field 'mAllowDelete'", ImageView.class);
        }

        public final void read() {
            TransactionHolder transactionHolder = this.IconCompatParcelizer;
            if (transactionHolder != null) {
                this.IconCompatParcelizer = null;
                transactionHolder.container = null;
                transactionHolder.mLine = null;
                transactionHolder.mBottomLine = null;
                transactionHolder.mEmptyDot = null;
                transactionHolder.mDateTime = null;
                transactionHolder.mClientNo = null;
                transactionHolder.mTransactionType = null;
                transactionHolder.mFundCode = null;
                transactionHolder.mQuantity = null;
                transactionHolder.mQuantityLabel = null;
                transactionHolder.mTransactionLabel = null;
                transactionHolder.mReference = null;
                transactionHolder.mEffectiveDateLabel = null;
                transactionHolder.mEffectiveDate = null;
                transactionHolder.mAllowDelete = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        TransactionHolder transactionHolder = (TransactionHolder) setcontentview;
        CrashlyticsCore.C32473 r0 = InvestmentDetailsTransactionAdapter.this.read.get(i);
        boolean z = true;
        transactionHolder.mLine.setVisibility(i == 0 ? 4 : 0);
        if (i != InvestmentDetailsTransactionAdapter.this.read.size() - 1) {
            z = false;
        }
        transactionHolder.mBottomLine.setVisibility(z ? 8 : 0);
        transactionHolder.mDateTime.setText(r0.MediaSessionCompat$QueueItem);
        transactionHolder.mClientNo.setText(getICheckDeserializerRtti.MediaDescriptionCompat(r0.MediaBrowserCompat$ItemReceiver));
        transactionHolder.mTransactionType.setText(r0.MediaSessionCompat$Token);
        transactionHolder.mFundCode.setText(r0.MediaBrowserCompat$CustomActionResultReceiver);
        transactionHolder.mQuantity.setText(r0.MediaMetadataCompat);
        transactionHolder.mQuantityLabel.setText(r0.MediaBrowserCompat$MediaItem);
        transactionHolder.mTransactionLabel.setText(r0.f2694x50fd9e4a);
        transactionHolder.mReference.setText(r0.RatingCompat);
        transactionHolder.mAllowDelete.setVisibility(DiskLruCache.VERSION_1.equals(r0.read) ? 0 : 8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) transactionHolder.mEmptyDot.getLayoutParams();
        if (r0.MediaBrowserCompat$SearchResultReceiver) {
            layoutParams.addRule(8, R.id.transaction_reference);
            transactionHolder.mEffectiveDateLabel.setVisibility(8);
            transactionHolder.mEffectiveDate.setVisibility(8);
        } else {
            layoutParams.addRule(8, R.id.transaction_effective_date_value);
            transactionHolder.mEffectiveDateLabel.setVisibility(0);
            transactionHolder.mEffectiveDate.setVisibility(0);
            transactionHolder.mEffectiveDate.setText(r0.IconCompatParcelizer);
            transactionHolder.mEffectiveDateLabel.setText(R.string.investment_transaction_effective_date_label);
        }
        transactionHolder.mEmptyDot.setLayoutParams(layoutParams);
        transactionHolder.mAllowDelete.setOnClickListener(new changeStatementChannel(this, i));
    }

    public InvestmentDetailsTransactionAdapter(Context context, List<CrashlyticsCore.C32473> list, FragmentBuilder_BindBondNoAccountsErrorFragment fragmentBuilder_BindBondNoAccountsErrorFragment) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = list;
        this.write = fragmentBuilder_BindBondNoAccountsErrorFragment;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    class TransactionHolder extends RecyclerView.setContentView {
        @BindView
        RelativeLayout container;
        @BindView
        ImageView mAllowDelete;
        @BindView
        View mBottomLine;
        @BindView
        TextView mClientNo;
        @BindView
        TextView mDateTime;
        @BindView
        TextView mEffectiveDate;
        @BindView
        TextView mEffectiveDateLabel;
        @BindView
        View mEmptyDot;
        @BindView
        TextView mFundCode;
        @BindView
        View mLine;
        @BindView
        TextView mQuantity;
        @BindView
        TextView mQuantityLabel;
        @BindView
        TextView mReference;
        @BindView
        TextView mTransactionLabel;
        @BindView
        TextView mTransactionType;

        TransactionHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new TransactionHolder(LayoutInflater.from(this.MediaBrowserCompat$ItemReceiver).inflate(R.layout.f83062131493532, viewGroup, false));
    }
}
