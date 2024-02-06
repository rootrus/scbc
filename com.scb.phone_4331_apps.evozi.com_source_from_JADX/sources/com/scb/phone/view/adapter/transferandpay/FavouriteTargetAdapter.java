package com.scb.phone.view.adapter.transferandpay;

import android.content.Context;
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
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getCustomerContactInformation;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class FavouriteTargetAdapter extends RecyclerView.IconCompatParcelizer<ItemViewHolder> {
    public int MediaBrowserCompat$ItemReceiver = -1;
    private Drawable MediaDescriptionCompat;
    private Context MediaMetadataCompat;
    public List<? extends CrashlyticsReport.Session.Builder> read;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment write;

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$ItemReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = itemViewHolder;
            itemViewHolder.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_name_text_view, "field 'name'", TextView.class);
            itemViewHolder.avatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_avatar_image_view, "field 'avatar'", ImageView.class);
            itemViewHolder.selectedBorder = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_selected_border_image_view, "field 'selectedBorder'", ImageView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                itemViewHolder.name = null;
                itemViewHolder.avatar = null;
                itemViewHolder.selectedBorder = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ItemViewHolder itemViewHolder = (ItemViewHolder) setcontentview;
        CrashlyticsReport.Session.Builder builder = (CrashlyticsReport.Session.Builder) this.read.get(i);
        CrashlyticsReport.Session.Event.Application.Builder builder2 = (CrashlyticsReport.Session.Event.Application.Builder) builder;
        if (this.MediaBrowserCompat$ItemReceiver != i) {
            itemViewHolder.name.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f65772131099731));
            itemViewHolder.selectedBorder.setVisibility(8);
        } else {
            itemViewHolder.name.setTextColor(setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f67252131099881));
            itemViewHolder.selectedBorder.setVisibility(0);
        }
        if ("TRANSFER".equalsIgnoreCase(builder2.PlaybackStateCompat)) {
            this.MediaDescriptionCompat = setLastBaselineToBottomHeight.write(this.MediaMetadataCompat, R.drawable.bankicon_place_holder);
        } else if ("REMITTANCE".equalsIgnoreCase(builder2.PlaybackStateCompat)) {
            this.MediaDescriptionCompat = setLastBaselineToBottomHeight.write(this.MediaMetadataCompat, R.drawable.bankicon_remittance);
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat, this.MediaDescriptionCompat, itemViewHolder.avatar, builder.MediaBrowserCompat$CustomActionResultReceiver(), this.MediaMetadataCompat.getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
        itemViewHolder.name.setText(builder.read());
        itemViewHolder.write.setOnClickListener(new getCustomerContactInformation(this, i));
    }

    public FavouriteTargetAdapter(Context context, List<? extends CrashlyticsReport.Session.Builder> list, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment) {
        this.MediaMetadataCompat = context;
        this.read = list;
        this.MediaDescriptionCompat = setLastBaselineToBottomHeight.write(context, R.drawable.biller_place_holder);
        this.write = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
    }

    public FavouriteTargetAdapter(Context context, List<CrashlyticsReport.Session.Builder> list, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment, byte b) {
        this(context, list, fragmentBuilder_BindCcSofBillPaymentOnlyFragment);
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView avatar;
        @BindView
        TextView name;
        @BindView
        ImageView selectedBorder;

        ItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82762131493502, viewGroup, false));
    }
}
