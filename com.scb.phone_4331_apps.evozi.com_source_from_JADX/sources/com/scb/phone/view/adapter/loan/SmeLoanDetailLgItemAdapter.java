package com.scb.phone.view.adapter.loan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.Futures;
import p040o.getBusinessOwnerApplicationById;
import p040o.getCreditCardSummary;
import p040o.makeListenable;
import p040o.onStart;
import p040o.validateGER;
import p040o.validateSPMV;

public final class SmeLoanDetailLgItemAdapter extends getCreditCardSummary {
    private List<Futures.ChainingListenableFuture.C34131> MediaBrowserCompat$ItemReceiver;
    private View.OnClickListener read = new getBusinessOwnerApplicationById(this);

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder MediaBrowserCompat$ItemReceiver;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = childViewHolder;
            childViewHolder.textIssuedTypeValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_issued_type_value, "field 'textIssuedTypeValue'", TextView.class);
            childViewHolder.textIssuedDebitAccountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_issued_debit_account_value, "field 'textIssuedDebitAccountValue'", TextView.class);
            childViewHolder.textIssuedDocumentNoValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_issued_document_no_value, "field 'textIssuedDocumentNoValue'", TextView.class);
            childViewHolder.textIssuedStartDateValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_issued_start_date_value, "field 'textIssuedStartDateValue'", TextView.class);
            childViewHolder.textIssuedNextFeeAmountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_issued_next_fee_amount_value, "field 'textIssuedNextFeeAmountValue'", TextView.class);
            childViewHolder.textIssuedFeeRateValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_issued_fee_rate_value, "field 'textIssuedFeeRateValue'", TextView.class);
            childViewHolder.layoutClaimed = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_claimed, "field 'layoutClaimed'", LinearLayout.class);
            childViewHolder.layoutClaimedList = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_claimed_list, "field 'layoutClaimedList'", LinearLayout.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (childViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                childViewHolder.textIssuedTypeValue = null;
                childViewHolder.textIssuedDebitAccountValue = null;
                childViewHolder.textIssuedDocumentNoValue = null;
                childViewHolder.textIssuedStartDateValue = null;
                childViewHolder.textIssuedNextFeeAmountValue = null;
                childViewHolder.textIssuedFeeRateValue = null;
                childViewHolder.layoutClaimed = null;
                childViewHolder.layoutClaimedList = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class GroupItemViewHolder_ViewBinding implements Unbinder {
        private GroupItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public GroupItemViewHolder_ViewBinding(GroupItemViewHolder groupItemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = groupItemViewHolder;
            groupItemViewHolder.container = onStart.IconCompatParcelizer(view, R.id.container, "field 'container'");
            groupItemViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            groupItemViewHolder.textAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_amount, "field 'textAmount'", TextView.class);
            groupItemViewHolder.textClaimedStatus = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_claimed_status, "field 'textClaimedStatus'", TextView.class);
            groupItemViewHolder.textTimestamp = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_timestamp, "field 'textTimestamp'", TextView.class);
            groupItemViewHolder.expandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIcon'", ImageView.class);
        }

        public final void read() {
            GroupItemViewHolder groupItemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (groupItemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                groupItemViewHolder.container = null;
                groupItemViewHolder.textTitle = null;
                groupItemViewHolder.textAmount = null;
                groupItemViewHolder.textClaimedStatus = null;
                groupItemViewHolder.textTimestamp = null;
                groupItemViewHolder.expandIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ClaimedItemViewHolder_ViewBinding implements Unbinder {
        private ClaimedItemViewHolder MediaBrowserCompat$ItemReceiver;

        public ClaimedItemViewHolder_ViewBinding(ClaimedItemViewHolder claimedItemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = claimedItemViewHolder;
            claimedItemViewHolder.viewSeparator = onStart.IconCompatParcelizer(view, R.id.view_separator, "field 'viewSeparator'");
            claimedItemViewHolder.textClaimedAmountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_claimed_amount_value, "field 'textClaimedAmountValue'", TextView.class);
            claimedItemViewHolder.textClaimedDateValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_claimed_date_value, "field 'textClaimedDateValue'", TextView.class);
            claimedItemViewHolder.textClaimedInterestAmountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_claimed_interest_amount_value, "field 'textClaimedInterestAmountValue'", TextView.class);
            claimedItemViewHolder.textClaimedInterestRateValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_claimed_interest_rate_value, "field 'textClaimedInterestRateValue'", TextView.class);
        }

        public final void read() {
            ClaimedItemViewHolder claimedItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (claimedItemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                claimedItemViewHolder.viewSeparator = null;
                claimedItemViewHolder.textClaimedAmountValue = null;
                claimedItemViewHolder.textClaimedDateValue = null;
                claimedItemViewHolder.textClaimedInterestAmountValue = null;
                claimedItemViewHolder.textClaimedInterestRateValue = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SmeLoanDetailLgItemAdapter(Context context, validateGER validateger, List<Futures.ChainingListenableFuture.C34131> list) {
        super(context, validateger);
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        return new GroupItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83872131493613, viewGroup, false), this.read);
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83882131493614, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof GroupItemViewHolder) {
            GroupItemViewHolder groupItemViewHolder = (GroupItemViewHolder) setcontentview;
            Futures.ChainingListenableFuture.C34131 r5 = SmeLoanDetailLgItemAdapter.this.MediaBrowserCompat$ItemReceiver.get(i);
            groupItemViewHolder.textTitle.setText(r5.MediaBrowserCompat$ItemReceiver);
            groupItemViewHolder.textTimestamp.setText(r5.MediaMetadataCompat);
            boolean z = false;
            if (DiskLruCache.VERSION_1.equals(r5.IconCompatParcelizer)) {
                groupItemViewHolder.textClaimedStatus.setVisibility(0);
            } else {
                groupItemViewHolder.textClaimedStatus.setVisibility(8);
            }
            groupItemViewHolder.write.setClickable(true);
            groupItemViewHolder.expandIcon.setVisibility(0);
            groupItemViewHolder.textAmount.setText(r5.MediaDescriptionCompat);
            int i2 = groupItemViewHolder.AlertController$RecycleListView.write;
            if ((Integer.MIN_VALUE & i2) != 0) {
                if ((i2 & 4) != 0) {
                    z = true;
                }
                groupItemViewHolder.expandIcon.setImageResource(z ? R.drawable.ic_expand_less_black_24dp : R.drawable.ic_expand_more_black_24dp);
            }
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            Futures.ChainingListenableFuture.C34131 r8 = SmeLoanDetailLgItemAdapter.this.MediaBrowserCompat$ItemReceiver.get(i);
            childViewHolder.textIssuedTypeValue.setText(r8.MediaBrowserCompat$MediaItem);
            childViewHolder.textIssuedDebitAccountValue.setText(r8.read);
            childViewHolder.textIssuedDocumentNoValue.setText(r8.MediaBrowserCompat$CustomActionResultReceiver);
            childViewHolder.textIssuedStartDateValue.setText(r8.ParcelableVolumeInfo);
            childViewHolder.textIssuedNextFeeAmountValue.setText(r8.RatingCompat);
            childViewHolder.textIssuedFeeRateValue.setText(r8.MediaBrowserCompat$SearchResultReceiver);
            List<makeListenable> list = r8.write;
            childViewHolder.layoutClaimedList.removeAllViews();
            if (list == null || list.isEmpty()) {
                childViewHolder.layoutClaimed.setVisibility(8);
                return;
            }
            childViewHolder.layoutClaimed.setVisibility(0);
            Context context = childViewHolder.PlaybackStateCompat.getContext();
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                makeListenable makelistenable = list.get(i3);
                if (i3 == 0) {
                    LinearLayout linearLayout = childViewHolder.layoutClaimedList;
                    ClaimedItemViewHolder write = new ClaimedItemViewHolder(context).write(makelistenable);
                    write.viewSeparator.setVisibility(8);
                    linearLayout.addView(write);
                } else {
                    childViewHolder.layoutClaimedList.addView(new ClaimedItemViewHolder(context).write(makelistenable));
                }
            }
        }
    }

    class GroupItemViewHolder extends validateSPMV {
        @BindView
        View container;
        @BindView
        ImageView expandIcon;
        @BindView
        TextView textAmount;
        @BindView
        TextView textClaimedStatus;
        @BindView
        TextView textTimestamp;
        @BindView
        TextView textTitle;

        GroupItemViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.container.setOnClickListener(onClickListener);
        }
    }

    class ChildViewHolder extends validateSPMV {
        View PlaybackStateCompat;
        @BindView
        LinearLayout layoutClaimed;
        @BindView
        LinearLayout layoutClaimedList;
        @BindView
        TextView textIssuedDebitAccountValue;
        @BindView
        TextView textIssuedDocumentNoValue;
        @BindView
        TextView textIssuedFeeRateValue;
        @BindView
        TextView textIssuedNextFeeAmountValue;
        @BindView
        TextView textIssuedStartDateValue;
        @BindView
        TextView textIssuedTypeValue;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.PlaybackStateCompat = view;
        }
    }

    class ClaimedItemViewHolder extends LinearLayout {
        @BindView
        TextView textClaimedAmountValue;
        @BindView
        TextView textClaimedDateValue;
        @BindView
        TextView textClaimedInterestAmountValue;
        @BindView
        TextView textClaimedInterestRateValue;
        @BindView
        View viewSeparator;

        public ClaimedItemViewHolder(Context context) {
            super(context);
            setOrientation(1);
            LayoutInflater.from(context).inflate(R.layout.f83862131493612, this, true);
            ButterKnife.IconCompatParcelizer(this);
        }

        public final ClaimedItemViewHolder write(makeListenable makelistenable) {
            this.textClaimedAmountValue.setText(makelistenable.read);
            this.textClaimedDateValue.setText(makelistenable.MediaBrowserCompat$CustomActionResultReceiver);
            this.textClaimedInterestAmountValue.setText(makelistenable.MediaBrowserCompat$ItemReceiver);
            this.textClaimedInterestRateValue.setText(makelistenable.write);
            return this;
        }
    }
}
