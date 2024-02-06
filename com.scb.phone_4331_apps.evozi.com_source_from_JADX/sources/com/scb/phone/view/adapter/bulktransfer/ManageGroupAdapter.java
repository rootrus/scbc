package com.scb.phone.view.adapter.bulktransfer;

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
import p040o.SingleDataEntity;
import p040o.UncaughtExceptionHandlers;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class ManageGroupAdapter extends RecyclerView.IconCompatParcelizer<RecipientViewHolder> {
    public List<UncaughtExceptionHandlers> read;
    public write write;

    @FunctionalInterface
    public interface write {
        void MediaBrowserCompat$ItemReceiver(UncaughtExceptionHandlers uncaughtExceptionHandlers);
    }

    public class RecipientViewHolder_ViewBinding implements Unbinder {
        private RecipientViewHolder MediaBrowserCompat$ItemReceiver;

        public RecipientViewHolder_ViewBinding(RecipientViewHolder recipientViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = recipientViewHolder;
            recipientViewHolder.imageLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.logo_image_view, "field 'imageLogo'", ImageView.class);
            recipientViewHolder.recipientName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recipient_name, "field 'recipientName'", TextView.class);
            recipientViewHolder.recipientNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recipient_number, "field 'recipientNumber'", TextView.class);
            recipientViewHolder.totalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_amount, "field 'totalAmount'", TextView.class);
        }

        public final void read() {
            RecipientViewHolder recipientViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (recipientViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                recipientViewHolder.imageLogo = null;
                recipientViewHolder.recipientName = null;
                recipientViewHolder.recipientNumber = null;
                recipientViewHolder.totalAmount = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        RecipientViewHolder recipientViewHolder = (RecipientViewHolder) setcontentview;
        UncaughtExceptionHandlers uncaughtExceptionHandlers = this.read.get(i);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(recipientViewHolder.setHasDecor.getContext(), (int) R.drawable.bankicon_place_holder, recipientViewHolder.imageLogo, uncaughtExceptionHandlers.IconCompatParcelizer, recipientViewHolder.setHasDecor.getContext().getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(recipientViewHolder.setHasDecor.getContext(), R.color.f66402131099796));
        recipientViewHolder.recipientName.setText(uncaughtExceptionHandlers.MediaMetadataCompat);
        recipientViewHolder.recipientNumber.setText(uncaughtExceptionHandlers.read);
        recipientViewHolder.totalAmount.setText(uncaughtExceptionHandlers.MediaBrowserCompat$ItemReceiver);
        recipientViewHolder.setHasDecor.setOnClickListener(new SingleDataEntity(this, i));
    }

    public ManageGroupAdapter(List<UncaughtExceptionHandlers> list, write write2) {
        this.read = list;
        this.write = write2;
    }

    public final int IconCompatParcelizer() {
        List<UncaughtExceptionHandlers> list = this.read;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static class RecipientViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView imageLogo;
        @BindView
        TextView recipientName;
        @BindView
        TextView recipientNumber;
        /* access modifiers changed from: package-private */
        public View setHasDecor;
        @BindView
        TextView totalAmount;

        public RecipientViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.setHasDecor = view;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new RecipientViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f84202131493646, viewGroup, false));
    }
}
