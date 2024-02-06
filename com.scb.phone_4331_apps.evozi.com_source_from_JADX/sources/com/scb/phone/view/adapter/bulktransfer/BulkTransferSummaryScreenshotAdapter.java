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
import p040o.SimpleTimeLimiter;
import p040o.onStart;
import p040o.setBaselineAligned;
import p040o.setLastBaselineToBottomHeight;

public final class BulkTransferSummaryScreenshotAdapter extends RecyclerView.IconCompatParcelizer<SummaryScreenshotViewHolder> {
    private final List<SimpleTimeLimiter.C37891> write;

    public class SummaryScreenshotViewHolder_ViewBinding implements Unbinder {
        private SummaryScreenshotViewHolder MediaBrowserCompat$ItemReceiver;

        public SummaryScreenshotViewHolder_ViewBinding(SummaryScreenshotViewHolder summaryScreenshotViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = summaryScreenshotViewHolder;
            summaryScreenshotViewHolder.bankLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bank_logo_image_view, "field 'bankLogo'", ImageView.class);
            summaryScreenshotViewHolder.accountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_name_text_view, "field 'accountName'", TextView.class);
            summaryScreenshotViewHolder.statusIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.status_icon, "field 'statusIcon'", ImageView.class);
            summaryScreenshotViewHolder.accountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_number_text_view, "field 'accountNumber'", TextView.class);
            summaryScreenshotViewHolder.amount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_text_view, "field 'amount'", TextView.class);
            summaryScreenshotViewHolder.nickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nickname_text_view, "field 'nickname'", TextView.class);
            summaryScreenshotViewHolder.fee = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fee_text_view, "field 'fee'", TextView.class);
            summaryScreenshotViewHolder.error = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'error'", TextView.class);
            summaryScreenshotViewHolder.separator = onStart.IconCompatParcelizer(view, R.id.separator_view, "field 'separator'");
        }

        public final void read() {
            SummaryScreenshotViewHolder summaryScreenshotViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (summaryScreenshotViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                summaryScreenshotViewHolder.bankLogo = null;
                summaryScreenshotViewHolder.accountName = null;
                summaryScreenshotViewHolder.statusIcon = null;
                summaryScreenshotViewHolder.accountNumber = null;
                summaryScreenshotViewHolder.amount = null;
                summaryScreenshotViewHolder.nickname = null;
                summaryScreenshotViewHolder.fee = null;
                summaryScreenshotViewHolder.error = null;
                summaryScreenshotViewHolder.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        SummaryScreenshotViewHolder summaryScreenshotViewHolder = (SummaryScreenshotViewHolder) setcontentview;
        SimpleTimeLimiter.C37891 r0 = this.write.get(i);
        boolean z = true;
        if (i == this.write.size() - 1) {
            z = false;
        }
        summaryScreenshotViewHolder.read(r0, z);
    }

    public BulkTransferSummaryScreenshotAdapter(List<SimpleTimeLimiter.C37891> list) {
        this.write = list;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    static class SummaryScreenshotViewHolder extends RecyclerView.setContentView {
        @BindView
        protected TextView accountName;
        @BindView
        protected TextView accountNumber;
        @BindView
        protected TextView amount;
        @BindView
        protected ImageView bankLogo;
        @BindView
        protected TextView error;
        @BindView
        protected TextView fee;
        @BindView
        protected TextView nickname;
        @BindView
        protected View separator;
        @BindView
        protected ImageView statusIcon;

        SummaryScreenshotViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        /* access modifiers changed from: package-private */
        public final void read(SimpleTimeLimiter.C37891 r8, boolean z) {
            int i;
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.bankLogo.getContext(), (int) R.drawable.bankicon_place_holder, this.bankLogo, r8.MediaBrowserCompat$CustomActionResultReceiver, this.bankLogo.getContext().getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(this.bankLogo.getContext(), R.color.f66402131099796));
            this.accountName.setText(r8.write);
            this.statusIcon.setImageResource(r8.RatingCompat ? R.drawable.ic_check_circle_black_48dp : R.drawable.ic_cross_circle);
            Drawable MediaBrowserCompat$MediaItem = setBaselineAligned.MediaBrowserCompat$MediaItem(this.statusIcon.getDrawable());
            if (r8.RatingCompat) {
                i = setLastBaselineToBottomHeight.read(this.statusIcon.getContext(), R.color.f66422131099798);
            } else {
                i = setLastBaselineToBottomHeight.read(this.statusIcon.getContext(), R.color.f66452131099801);
            }
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$MediaItem, i);
            this.accountNumber.setText(r8.IconCompatParcelizer);
            this.amount.setText(r8.MediaBrowserCompat$ItemReceiver);
            this.nickname.setText(r8.MediaBrowserCompat$SearchResultReceiver);
            this.fee.setText(r8.MediaBrowserCompat$MediaItem);
            int i2 = 8;
            this.error.setVisibility(r8.RatingCompat ? 8 : 0);
            this.error.setText(r8.read);
            View view = this.separator;
            if (z) {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new SummaryScreenshotViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91132131494340, viewGroup, false));
    }
}
