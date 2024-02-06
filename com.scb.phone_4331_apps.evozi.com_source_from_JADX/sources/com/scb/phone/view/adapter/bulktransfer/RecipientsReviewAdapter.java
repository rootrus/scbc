package com.scb.phone.view.adapter.bulktransfer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import java.util.List;
import p040o.onStart;
import p040o.setThreadFactory;

public final class RecipientsReviewAdapter extends RecyclerView.IconCompatParcelizer<RecipientsReviewViewHolder> {
    private List<setThreadFactory> write;

    public class RecipientsReviewViewHolder_ViewBinding implements Unbinder {
        private RecipientsReviewViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public RecipientsReviewViewHolder_ViewBinding(RecipientsReviewViewHolder recipientsReviewViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = recipientsReviewViewHolder;
            recipientsReviewViewHolder.target = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target, "field 'target'", CustomTransferAndPayTarget.class);
            recipientsReviewViewHolder.amount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount, "field 'amount'", CustomTransferAndPayItem.class);
            recipientsReviewViewHolder.fee = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fee, "field 'fee'", CustomTransferAndPayItem.class);
        }

        public final void read() {
            RecipientsReviewViewHolder recipientsReviewViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (recipientsReviewViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                recipientsReviewViewHolder.target = null;
                recipientsReviewViewHolder.amount = null;
                recipientsReviewViewHolder.fee = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        RecipientsReviewViewHolder recipientsReviewViewHolder = (RecipientsReviewViewHolder) setcontentview;
        setThreadFactory setthreadfactory = this.write.get(i);
        recipientsReviewViewHolder.target.setAvatar(setthreadfactory.MediaBrowserCompat$CustomActionResultReceiver);
        recipientsReviewViewHolder.target.setTargetName(setthreadfactory.RatingCompat);
        recipientsReviewViewHolder.target.setReferenceNumbers(setthreadfactory.IconCompatParcelizer);
        recipientsReviewViewHolder.target.setFavoriteName(setthreadfactory.MediaMetadataCompat);
        recipientsReviewViewHolder.target.mFavouriteIcon.setVisibility(8);
        recipientsReviewViewHolder.amount.setValue(setthreadfactory.MediaBrowserCompat$ItemReceiver);
        recipientsReviewViewHolder.fee.setValue(setthreadfactory.MediaDescriptionCompat);
        if (setthreadfactory.MediaBrowserCompat$SearchResultReceiver) {
            recipientsReviewViewHolder.fee.scheduleFeeText.setVisibility(0);
        }
        recipientsReviewViewHolder.fee.mDividerView.setVisibility(8);
    }

    public RecipientsReviewAdapter(List<setThreadFactory> list) {
        this.write = list;
    }

    public final int IconCompatParcelizer() {
        List<setThreadFactory> list = this.write;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class RecipientsReviewViewHolder extends RecyclerView.setContentView {
        @BindView
        CustomTransferAndPayItem amount;
        @BindView
        CustomTransferAndPayItem fee;
        @BindView
        CustomTransferAndPayTarget target;

        public RecipientsReviewViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new RecipientsReviewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82372131493463, viewGroup, false));
    }
}
