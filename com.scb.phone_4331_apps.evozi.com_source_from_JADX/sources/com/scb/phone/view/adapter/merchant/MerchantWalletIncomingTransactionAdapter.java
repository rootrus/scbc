package com.scb.phone.view.adapter.merchant;

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
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.getCustomerContact;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateGER;
import p040o.validateSPMV;

public final class MerchantWalletIncomingTransactionAdapter extends getCustomerContact<AutoCrashlyticsReportEncoder> {
    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return false;
    }

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder write;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.write = childViewHolder;
            childViewHolder.textTransferFrom = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_transfer_from_value, "field 'textTransferFrom'", TextView.class);
            childViewHolder.textBuyerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_buyer_name_value, "field 'textBuyerName'", TextView.class);
            childViewHolder.textPaymentChannel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_payment_channel_value, "field 'textPaymentChannel'", TextView.class);
            childViewHolder.textShopReference = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_shop_reference_value, "field 'textShopReference'", TextView.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.write;
            if (childViewHolder != null) {
                this.write = null;
                childViewHolder.textTransferFrom = null;
                childViewHolder.textBuyerName = null;
                childViewHolder.textPaymentChannel = null;
                childViewHolder.textShopReference = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class IncomingGroupItemViewHolder_ViewBinding extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder_ViewBinding {
        private IncomingGroupItemViewHolder MediaBrowserCompat$ItemReceiver;

        public IncomingGroupItemViewHolder_ViewBinding(IncomingGroupItemViewHolder incomingGroupItemViewHolder, View view) {
            super(incomingGroupItemViewHolder, view);
            this.MediaBrowserCompat$ItemReceiver = incomingGroupItemViewHolder;
            incomingGroupItemViewHolder.container = onStart.IconCompatParcelizer(view, R.id.container, "field 'container'");
            incomingGroupItemViewHolder.viewVerticalLine = onStart.IconCompatParcelizer(view, R.id.view_vertical_line, "field 'viewVerticalLine'");
            incomingGroupItemViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            incomingGroupItemViewHolder.textAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_amount, "field 'textAmount'", TextView.class);
            incomingGroupItemViewHolder.textTimestamp = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_timestamp, "field 'textTimestamp'", TextView.class);
            incomingGroupItemViewHolder.viewVerticalLineBelowDot = onStart.IconCompatParcelizer(view, R.id.view_vertical_line_below_dot, "field 'viewVerticalLineBelowDot'");
        }

        public final void read() {
            IncomingGroupItemViewHolder incomingGroupItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (incomingGroupItemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                incomingGroupItemViewHolder.container = null;
                incomingGroupItemViewHolder.viewVerticalLine = null;
                incomingGroupItemViewHolder.textTitle = null;
                incomingGroupItemViewHolder.textAmount = null;
                incomingGroupItemViewHolder.textTimestamp = null;
                incomingGroupItemViewHolder.viewVerticalLineBelowDot = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public MerchantWalletIncomingTransactionAdapter(validateGER validateger) {
        super(validateger);
    }

    public final int MediaMetadataCompat(int i) {
        return this.MediaMetadataCompat.get(i) == null ? 0 : 1;
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new IncomingGroupItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83352131493561, viewGroup, false), this.read);
        }
        if (i == 0) {
            return new IconCompatParcelizer(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83992131493625, viewGroup, false));
        }
        return null;
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83322131493558, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof IncomingGroupItemViewHolder) {
            ((IncomingGroupItemViewHolder) setcontentview).MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        if (setcontentview instanceof ChildViewHolder) {
            ((ChildViewHolder) setcontentview).MediaBrowserCompat$ItemReceiver(i);
        }
    }

    class IconCompatParcelizer extends validateSPMV {
        IconCompatParcelizer(View view) {
            super(view);
        }
    }

    class IncomingGroupItemViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder {
        @BindView
        View container;
        @BindView
        TextView textAmount;
        @BindView
        TextView textTimestamp;
        @BindView
        TextView textTitle;
        @BindView
        View viewVerticalLine;
        @BindView
        View viewVerticalLineBelowDot;

        IncomingGroupItemViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.container.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
            AutoCrashlyticsReportEncoder autoCrashlyticsReportEncoder = (AutoCrashlyticsReportEncoder) MerchantWalletIncomingTransactionAdapter.this.MediaMetadataCompat.get(i);
            Context context = this.write.getContext();
            this.textTitle.setText(autoCrashlyticsReportEncoder.MediaBrowserCompat$MediaItem);
            this.textTimestamp.setText(autoCrashlyticsReportEncoder.MediaMetadataCompat);
            int i2 = 0;
            this.viewVerticalLine.setVisibility(i == 0 ? 4 : 0);
            this.viewVerticalLineBelowDot.setVisibility(i == MerchantWalletIncomingTransactionAdapter.this.MediaMetadataCompat.size() - 1 ? 8 : 0);
            this.write.setClickable(true);
            this.expandIcon.setVisibility(0);
            boolean equalsIgnoreCase = "C".equalsIgnoreCase(autoCrashlyticsReportEncoder.MediaBrowserCompat$ItemReceiver);
            this.textAmount.setText(String.format(context.getString(equalsIgnoreCase ? R.string.credit_value : R.string.debit_value), new Object[]{autoCrashlyticsReportEncoder.write}));
            this.textAmount.setTextColor(setLastBaselineToBottomHeight.read(context, equalsIgnoreCase ? R.color.f66422131099798 : R.color.f67152131099871));
            boolean equalsIgnoreCase2 = DiskLruCache.VERSION_1.equalsIgnoreCase(autoCrashlyticsReportEncoder.MediaBrowserCompat$SearchResultReceiver);
            ImageView imageView = this.expandIcon;
            if (!equalsIgnoreCase2) {
                i2 = 4;
            }
            imageView.setVisibility(i2);
            if (equalsIgnoreCase2) {
                BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(this);
            }
        }
    }

    class ChildViewHolder extends validateSPMV {
        @BindView
        TextView textBuyerName;
        @BindView
        TextView textPaymentChannel;
        @BindView
        TextView textShopReference;
        @BindView
        TextView textTransferFrom;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(int i) {
            AutoCrashlyticsReportEncoder autoCrashlyticsReportEncoder = (AutoCrashlyticsReportEncoder) MerchantWalletIncomingTransactionAdapter.this.MediaMetadataCompat.get(i);
            this.textTransferFrom.setText(autoCrashlyticsReportEncoder.read);
            this.textBuyerName.setText(autoCrashlyticsReportEncoder.IconCompatParcelizer);
            this.textPaymentChannel.setText(autoCrashlyticsReportEncoder.MediaBrowserCompat$CustomActionResultReceiver);
            this.textShopReference.setText(autoCrashlyticsReportEncoder.RatingCompat);
        }
    }
}
