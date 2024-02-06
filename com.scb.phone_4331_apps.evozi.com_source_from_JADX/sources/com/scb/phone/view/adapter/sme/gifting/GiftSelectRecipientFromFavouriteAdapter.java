package com.scb.phone.view.adapter.sme.gifting;

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
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getPdfUrl;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class GiftSelectRecipientFromFavouriteAdapter extends RecyclerView.IconCompatParcelizer<RecipientViewHolder> {
    private final C5784x1db42caa MediaBrowserCompat$ItemReceiver;
    private final List<CrashlyticsReport.Session.Event.Application.Builder> write;

    public class RecipientViewHolder_ViewBinding implements Unbinder {
        private RecipientViewHolder IconCompatParcelizer;

        public RecipientViewHolder_ViewBinding(RecipientViewHolder recipientViewHolder, View view) {
            this.IconCompatParcelizer = recipientViewHolder;
            recipientViewHolder.billerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_name_text_view, "field 'billerName'", TextView.class);
            recipientViewHolder.billerAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_avatar_image_view, "field 'billerAvatar'", ImageView.class);
        }

        public final void read() {
            RecipientViewHolder recipientViewHolder = this.IconCompatParcelizer;
            if (recipientViewHolder != null) {
                this.IconCompatParcelizer = null;
                recipientViewHolder.billerName = null;
                recipientViewHolder.billerAvatar = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        RecipientViewHolder recipientViewHolder = (RecipientViewHolder) setcontentview;
        CrashlyticsReport.Session.Event.Application.Builder builder = this.write.get(i);
        recipientViewHolder.AlertController$RecycleListView.setOnClickListener(new getPdfUrl(recipientViewHolder, builder));
        recipientViewHolder.billerName.setText(builder.read());
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(recipientViewHolder.AlertController$RecycleListView.getContext(), (int) R.drawable.bankicon_place_holder, recipientViewHolder.billerAvatar, builder.MediaBrowserCompat$CustomActionResultReceiver(), recipientViewHolder.AlertController$RecycleListView.getContext().getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(recipientViewHolder.AlertController$RecycleListView.getContext(), R.color.f66402131099796));
    }

    public GiftSelectRecipientFromFavouriteAdapter(List<CrashlyticsReport.Session.Event.Application.Builder> list, C5784x1db42caa giftSelectRecipientFromFavouriteAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = giftSelectRecipientFromFavouriteAdapter$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public static class RecipientViewHolder extends RecyclerView.setContentView {
        final View AlertController$RecycleListView;
        @BindView
        public ImageView billerAvatar;
        @BindView
        public TextView billerName;
        public final C5784x1db42caa setHasDecor;

        RecipientViewHolder(View view, C5784x1db42caa giftSelectRecipientFromFavouriteAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
            super(view);
            this.AlertController$RecycleListView = view;
            this.setHasDecor = giftSelectRecipientFromFavouriteAdapter$MediaBrowserCompat$CustomActionResultReceiver;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new RecipientViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91492131494376, viewGroup, false), this.MediaBrowserCompat$ItemReceiver);
    }
}
