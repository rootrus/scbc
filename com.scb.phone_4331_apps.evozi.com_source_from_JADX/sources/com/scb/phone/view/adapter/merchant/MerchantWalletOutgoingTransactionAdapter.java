package com.scb.phone.view.adapter.merchant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;
import java.util.List;
import p040o.QueueFileLogStore;
import p040o.getBusinessOwnerSetupResult;
import p040o.getCustomerContact;
import p040o.getLogBytes;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateGER;
import p040o.validateSPMV;

public final class MerchantWalletOutgoingTransactionAdapter extends getCustomerContact<QueueFileLogStore.LogBytes> {
    private getLogBytes MediaBrowserCompat$MediaItem;

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return false;
    }

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = childViewHolder;
            childViewHolder.textTransferTo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_transfer_to_value, "field 'textTransferTo'", TextView.class);
            childViewHolder.textAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_name_value, "field 'textAccountName'", TextView.class);
            childViewHolder.textAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number_value, "field 'textAccountNumber'", TextView.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (childViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                childViewHolder.textTransferTo = null;
                childViewHolder.textAccountName = null;
                childViewHolder.textAccountNumber = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class OutgoingGroupItemViewHolder_ViewBinding extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder_ViewBinding {
        private OutgoingGroupItemViewHolder write;

        public OutgoingGroupItemViewHolder_ViewBinding(OutgoingGroupItemViewHolder outgoingGroupItemViewHolder, View view) {
            super(outgoingGroupItemViewHolder, view);
            this.write = outgoingGroupItemViewHolder;
            outgoingGroupItemViewHolder.container = onStart.IconCompatParcelizer(view, R.id.container, "field 'container'");
            outgoingGroupItemViewHolder.viewVerticalLine = onStart.IconCompatParcelizer(view, R.id.view_vertical_line, "field 'viewVerticalLine'");
            outgoingGroupItemViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            outgoingGroupItemViewHolder.textAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_amount, "field 'textAmount'", TextView.class);
            outgoingGroupItemViewHolder.textTimestamp = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_timestamp, "field 'textTimestamp'", TextView.class);
            outgoingGroupItemViewHolder.viewVerticalLineBelowDot = onStart.IconCompatParcelizer(view, R.id.view_vertical_line_below_dot, "field 'viewVerticalLineBelowDot'");
        }

        public final void read() {
            OutgoingGroupItemViewHolder outgoingGroupItemViewHolder = this.write;
            if (outgoingGroupItemViewHolder != null) {
                this.write = null;
                outgoingGroupItemViewHolder.container = null;
                outgoingGroupItemViewHolder.viewVerticalLine = null;
                outgoingGroupItemViewHolder.textTitle = null;
                outgoingGroupItemViewHolder.textAmount = null;
                outgoingGroupItemViewHolder.textTimestamp = null;
                outgoingGroupItemViewHolder.viewVerticalLineBelowDot = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public MerchantWalletOutgoingTransactionAdapter(validateGER validateger) {
        super((validateGER) null);
        this.MediaBrowserCompat$ItemReceiver = validateger;
        this.read = new getBusinessOwnerSetupResult(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getLogBytes getlogbytes, List<QueueFileLogStore.LogBytes> list) {
        this.MediaBrowserCompat$MediaItem = getlogbytes;
        super.IconCompatParcelizer(list);
    }

    public final int MediaMetadataCompat(int i) {
        return this.MediaMetadataCompat.get(i) == null ? 0 : 1;
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new OutgoingGroupItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83352131493561, viewGroup, false), this.read);
        }
        if (i == 0) {
            return new write(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83992131493625, viewGroup, false));
        }
        return null;
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83332131493559, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof OutgoingGroupItemViewHolder) {
            ((OutgoingGroupItemViewHolder) setcontentview).MediaBrowserCompat$ItemReceiver(i);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            childViewHolder.textTransferTo.setText(MerchantWalletOutgoingTransactionAdapter.this.MediaBrowserCompat$MediaItem.read);
            childViewHolder.textAccountName.setText(MerchantWalletOutgoingTransactionAdapter.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver);
            childViewHolder.textAccountNumber.setText(MerchantWalletOutgoingTransactionAdapter.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver);
        }
    }

    class write extends validateSPMV {
        write(View view) {
            super(view);
        }
    }

    class OutgoingGroupItemViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder {
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

        OutgoingGroupItemViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.container.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(int i) {
            QueueFileLogStore.LogBytes logBytes = (QueueFileLogStore.LogBytes) MerchantWalletOutgoingTransactionAdapter.this.MediaMetadataCompat.get(i);
            Context context = this.write.getContext();
            this.textTitle.setText(context.getString(R.string.wallet_detail_transfer_out));
            this.textTimestamp.setText(logBytes.MediaBrowserCompat$ItemReceiver);
            this.viewVerticalLine.setVisibility(i == 0 ? 4 : 0);
            this.viewVerticalLineBelowDot.setVisibility(i == MerchantWalletOutgoingTransactionAdapter.this.MediaMetadataCompat.size() - 1 ? 8 : 0);
            this.write.setClickable(true);
            this.expandIcon.setVisibility(0);
            this.textAmount.setText(String.format(context.getString(R.string.debit_value), new Object[]{logBytes.read}));
            this.textAmount.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66452131099801));
            BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(this);
        }
    }

    class ChildViewHolder extends validateSPMV {
        @BindView
        TextView textAccountName;
        @BindView
        TextView textAccountNumber;
        @BindView
        TextView textTransferTo;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
