package com.scb.phone.view.adapter.bulktransfer;

import android.graphics.drawable.Drawable;
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
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ThreadFactoryBuilder;
import p040o.onStart;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;

public final class BulkTransferSuccessAdapter extends RecyclerView.IconCompatParcelizer<SuccessViewHolder> {
    private final List<ThreadFactoryBuilder> read;

    public class SuccessViewHolder_ViewBinding implements Unbinder {
        private SuccessViewHolder write;

        public SuccessViewHolder_ViewBinding(SuccessViewHolder successViewHolder, View view) {
            this.write = successViewHolder;
            successViewHolder.successFulIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.successful_icon, "field 'successFulIcon'", ImageView.class);
            successViewHolder.bankLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bank_logo, "field 'bankLogo'", ImageView.class);
            successViewHolder.accountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_name, "field 'accountName'", TextView.class);
            successViewHolder.accountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_number, "field 'accountNumber'", TextView.class);
            successViewHolder.amount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount, "field 'amount'", TextView.class);
            successViewHolder.fee = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fee, "field 'fee'", TextView.class);
            successViewHolder.nickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nick_name, "field 'nickName'", TextView.class);
            successViewHolder.errorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'errorTitle'", TextView.class);
            successViewHolder.feeSubTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fee_sub_title, "field 'feeSubTitle'", TextView.class);
        }

        public final void read() {
            SuccessViewHolder successViewHolder = this.write;
            if (successViewHolder != null) {
                this.write = null;
                successViewHolder.successFulIcon = null;
                successViewHolder.bankLogo = null;
                successViewHolder.accountName = null;
                successViewHolder.accountNumber = null;
                successViewHolder.amount = null;
                successViewHolder.fee = null;
                successViewHolder.nickName = null;
                successViewHolder.errorTitle = null;
                successViewHolder.feeSubTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2;
        SuccessViewHolder successViewHolder = (SuccessViewHolder) setcontentview;
        ThreadFactoryBuilder threadFactoryBuilder = this.read.get(i);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(successViewHolder.bankLogo.getContext(), (int) R.drawable.bankicon_place_holder, successViewHolder.bankLogo, threadFactoryBuilder.MediaBrowserCompat$CustomActionResultReceiver, successViewHolder.bankLogo.getContext().getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(successViewHolder.bankLogo.getContext(), R.color.f66402131099796));
        successViewHolder.accountName.setText(threadFactoryBuilder.IconCompatParcelizer);
        successViewHolder.accountNumber.setText(threadFactoryBuilder.MediaBrowserCompat$ItemReceiver);
        successViewHolder.amount.setText(threadFactoryBuilder.MediaSessionCompat$Token);
        successViewHolder.fee.setText(threadFactoryBuilder.MediaBrowserCompat$SearchResultReceiver);
        successViewHolder.nickName.setText(threadFactoryBuilder.MediaMetadataCompat);
        successViewHolder.errorTitle.setText(threadFactoryBuilder.read);
        int i3 = 0;
        if (threadFactoryBuilder.MediaBrowserCompat$MediaItem) {
            successViewHolder.successFulIcon.setVisibility(8);
            successViewHolder.feeSubTitle.setVisibility(0);
            return;
        }
        Drawable write = setLastBaselineToBottomHeight.write(successViewHolder.successFulIcon.getContext(), threadFactoryBuilder.MediaDescriptionCompat ? R.drawable.ic_check_circle_black_48dp : R.drawable.ic_cross_circle);
        TextView textView = successViewHolder.errorTitle;
        if (threadFactoryBuilder.MediaDescriptionCompat) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        if (write != null) {
            Drawable MediaBrowserCompat$MediaItem = setBaselineAligned.MediaBrowserCompat$MediaItem(write);
            if (threadFactoryBuilder.MediaDescriptionCompat) {
                i2 = setLastBaselineToBottomHeight.read(successViewHolder.successFulIcon.getContext(), R.color.f66422131099798);
            } else {
                i2 = setLastBaselineToBottomHeight.read(successViewHolder.successFulIcon.getContext(), R.color.f66452131099801);
            }
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(write, i2);
            successViewHolder.successFulIcon.setImageDrawable(MediaBrowserCompat$MediaItem);
        }
    }

    public BulkTransferSuccessAdapter(List<ThreadFactoryBuilder> list) {
        this.read = list;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    static class SuccessViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView accountName;
        @BindView
        public TextView accountNumber;
        @BindView
        public TextView amount;
        @BindView
        public ImageView bankLogo;
        @BindView
        public TextView errorTitle;
        @BindView
        public TextView fee;
        @BindView
        public TextView feeSubTitle;
        @BindView
        public TextView nickName;
        @BindView
        public ImageView successFulIcon;

        SuccessViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new SuccessViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91102131494337, viewGroup, false));
    }
}
