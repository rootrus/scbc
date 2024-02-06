package com.scb.phone.view.adapter.accountsummary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomMerchantRecentTransaction;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.EasycashDFWYNRepositoryModule;
import p040o.doWriteToLog;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.openLogFile;

public final class MerchantWalletViewPagerAdapter extends onActivityCreated {
    public List<doWriteToLog> IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    private LayoutInflater MediaBrowserCompat$ItemReceiver;
    public C5725x3a81547f read;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder write;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.write = itemViewHolder;
            itemViewHolder.layoutMerchantDetail = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_merchant_detail, "field 'layoutMerchantDetail'", ViewGroup.class);
            itemViewHolder.layoutMerchantDetailError = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_merchant_detail_error, "field 'layoutMerchantDetailError'", ViewGroup.class);
            itemViewHolder.layoutMerchantDetailLoading = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_merchant_detail_loading, "field 'layoutMerchantDetailLoading'", ViewGroup.class);
            itemViewHolder.textMerchantWalletName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_name_text_view, "field 'textMerchantWalletName'", TextView.class);
            itemViewHolder.textMerchantWalletAccount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_account_text_view, "field 'textMerchantWalletAccount'", TextView.class);
            itemViewHolder.textMerchantWalletTotalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_total_amount_text_view, "field 'textMerchantWalletTotalAmount'", TextView.class);
            itemViewHolder.layoutMerchantWalletLastTransactions = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_last_transactions_linear_layout, "field 'layoutMerchantWalletLastTransactions'", LinearLayout.class);
            itemViewHolder.viewMerchantWalletLatestStatements = onStart.IconCompatParcelizer(view, R.id.view_latest_statements, "field 'viewMerchantWalletLatestStatements'");
            itemViewHolder.viewMerchantWalletLatestStatementsError = onStart.IconCompatParcelizer(view, R.id.view_latest_statements_error, "field 'viewMerchantWalletLatestStatementsError'");
            itemViewHolder.textMerchantWalletErrorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_title, "field 'textMerchantWalletErrorTitle'", TextView.class);
            itemViewHolder.textMerchantWalletErrorMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_message, "field 'textMerchantWalletErrorMessage'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.write;
            if (itemViewHolder != null) {
                this.write = null;
                itemViewHolder.layoutMerchantDetail = null;
                itemViewHolder.layoutMerchantDetailError = null;
                itemViewHolder.layoutMerchantDetailLoading = null;
                itemViewHolder.textMerchantWalletName = null;
                itemViewHolder.textMerchantWalletAccount = null;
                itemViewHolder.textMerchantWalletTotalAmount = null;
                itemViewHolder.layoutMerchantWalletLastTransactions = null;
                itemViewHolder.viewMerchantWalletLatestStatements = null;
                itemViewHolder.viewMerchantWalletLatestStatementsError = null;
                itemViewHolder.textMerchantWalletErrorTitle = null;
                itemViewHolder.textMerchantWalletErrorMessage = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public MerchantWalletViewPagerAdapter(Context context, List<doWriteToLog> list) {
        this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.IconCompatParcelizer = list == null ? new ArrayList<>() : list;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
    }

    public final int getCount() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            return 1;
        }
        return this.IconCompatParcelizer.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        ItemViewHolder itemViewHolder = new ItemViewHolder(this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f83342131493560, (ViewGroup) null));
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            itemViewHolder.IconCompatParcelizer(new doWriteToLog());
            itemViewHolder.layoutMerchantDetailError.setVisibility(8);
            itemViewHolder.layoutMerchantDetail.setVisibility(4);
            itemViewHolder.layoutMerchantDetailLoading.setVisibility(0);
        } else {
            doWriteToLog dowritetolog = this.IconCompatParcelizer.get(i);
            if (dowritetolog.write) {
                itemViewHolder.IconCompatParcelizer(dowritetolog);
                itemViewHolder.write.setOnClickListener(new EasycashDFWYNRepositoryModule(this, i));
            } else {
                itemViewHolder.IconCompatParcelizer(dowritetolog);
                itemViewHolder.layoutMerchantDetailError.setVisibility(0);
                itemViewHolder.layoutMerchantDetail.setVisibility(4);
                itemViewHolder.layoutMerchantDetailLoading.setVisibility(8);
            }
        }
        View view = itemViewHolder.write;
        viewGroup.addView(view, 0);
        return view;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        ViewGroup layoutMerchantDetail;
        @BindView
        ViewGroup layoutMerchantDetailError;
        @BindView
        ViewGroup layoutMerchantDetailLoading;
        @BindView
        LinearLayout layoutMerchantWalletLastTransactions;
        @BindView
        TextView textMerchantWalletAccount;
        @BindView
        TextView textMerchantWalletErrorMessage;
        @BindView
        TextView textMerchantWalletErrorTitle;
        @BindView
        TextView textMerchantWalletName;
        @BindView
        TextView textMerchantWalletTotalAmount;
        @BindView
        View viewMerchantWalletLatestStatements;
        @BindView
        View viewMerchantWalletLatestStatementsError;

        ItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(doWriteToLog dowritetolog) {
            this.layoutMerchantDetailError.setVisibility(8);
            this.layoutMerchantDetail.setVisibility(0);
            this.layoutMerchantDetailLoading.setVisibility(8);
            this.textMerchantWalletName.setText(dowritetolog.IconCompatParcelizer);
            this.textMerchantWalletAccount.setText(dowritetolog.MediaBrowserCompat$SearchResultReceiver);
            this.textMerchantWalletTotalAmount.setText(dowritetolog.MediaDescriptionCompat);
            openLogFile openlogfile = dowritetolog.MediaMetadataCompat;
            if (openlogfile == null || openlogfile.read == null || openlogfile.read.isEmpty()) {
                MediaBrowserCompat$ItemReceiver();
            } else {
                write(openlogfile.read);
            }
        }

        private void write(List<AutoCrashlyticsReportEncoder> list) {
            View view;
            this.viewMerchantWalletLatestStatements.setVisibility(0);
            this.viewMerchantWalletLatestStatementsError.setVisibility(8);
            if (this.layoutMerchantWalletLastTransactions.getChildCount() > 0) {
                this.layoutMerchantWalletLastTransactions.removeAllViews();
            }
            for (int i = 0; i < 2; i++) {
                CustomMerchantRecentTransaction customMerchantRecentTransaction = new CustomMerchantRecentTransaction(this.write.getContext());
                if (i < list.size()) {
                    customMerchantRecentTransaction.setRecentTransactionDisplay(list.get(i));
                }
                if (i > 0 && list.size() > 1 && (view = customMerchantRecentTransaction.borderView) != null) {
                    view.setVisibility(0);
                }
                this.layoutMerchantWalletLastTransactions.addView(customMerchantRecentTransaction);
            }
        }

        private void MediaBrowserCompat$ItemReceiver() {
            View view;
            this.viewMerchantWalletLatestStatements.setVisibility(4);
            this.viewMerchantWalletLatestStatementsError.setVisibility(0);
            this.textMerchantWalletErrorTitle.setVisibility(8);
            this.textMerchantWalletErrorMessage.setText(R.string.account_summary_no_last_transaction);
            for (int i = 0; i < 2; i++) {
                CustomMerchantRecentTransaction customMerchantRecentTransaction = new CustomMerchantRecentTransaction(this.write.getContext());
                if (i > 0 && (view = customMerchantRecentTransaction.borderView) != null) {
                    view.setVisibility(0);
                }
                this.layoutMerchantWalletLastTransactions.addView(customMerchantRecentTransaction);
            }
        }
    }
}
