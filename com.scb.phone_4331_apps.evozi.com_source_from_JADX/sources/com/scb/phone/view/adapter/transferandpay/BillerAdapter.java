package com.scb.phone.view.adapter.transferandpay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.deleteIssuer;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class BillerAdapter extends RecyclerView.IconCompatParcelizer<ItemViewHolder> {
    public RecyclerView$MediaBrowserCompat$SearchResultReceiver MediaBrowserCompat$ItemReceiver;
    private Drawable MediaBrowserCompat$SearchResultReceiver;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment MediaDescriptionCompat;
    private Context MediaMetadataCompat;
    public List<CrashlyticsReport.Session.Builder> read;
    public boolean write = false;

    @FunctionalInterface
    public interface IconCompatParcelizer {
        void IconCompatParcelizer();
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = itemViewHolder;
            itemViewHolder.gridLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_grid_layout, "field 'gridLayout'", RelativeLayout.class);
            itemViewHolder.listLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_list_layout, "field 'listLayout'", RelativeLayout.class);
            itemViewHolder.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_name_text_view, "field 'name'", TextView.class);
            itemViewHolder.avatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_avatar_image_view, "field 'avatar'", ImageView.class);
            itemViewHolder.nameList = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_name_text_view_list, "field 'nameList'", TextView.class);
            itemViewHolder.codeList = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_code_text_view_list, "field 'codeList'", TextView.class);
            itemViewHolder.avatarList = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_avatar_image_view_list, "field 'avatarList'", ImageView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                itemViewHolder.gridLayout = null;
                itemViewHolder.listLayout = null;
                itemViewHolder.name = null;
                itemViewHolder.avatar = null;
                itemViewHolder.nameList = null;
                itemViewHolder.codeList = null;
                itemViewHolder.avatarList = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2 = i;
        ItemViewHolder itemViewHolder = (ItemViewHolder) setcontentview;
        CrashlyticsReport.Session.Builder builder = this.read.get(i2);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat, this.MediaBrowserCompat$SearchResultReceiver, itemViewHolder.avatar, builder.MediaBrowserCompat$CustomActionResultReceiver(), this.MediaMetadataCompat.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
        itemViewHolder.name.setText(builder.read());
        itemViewHolder.write.setOnClickListener(new deleteIssuer(this, i2));
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat, this.MediaBrowserCompat$SearchResultReceiver, itemViewHolder.avatarList, builder.MediaBrowserCompat$CustomActionResultReceiver(), this.MediaMetadataCompat.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(this.MediaMetadataCompat, R.color.f66402131099796));
        itemViewHolder.nameList.setText(builder.read());
        if (builder instanceof CrashlyticsReport.Session.Event.Application.Execution) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) builder;
            if (execution.f2698x50fd9e4a.equals("")) {
                itemViewHolder.codeList.setText(this.MediaMetadataCompat.getString(R.string.biller_ac, new Object[]{execution.MediaBrowserCompat$SearchResultReceiver}));
            } else {
                itemViewHolder.codeList.setText(execution.MediaDescriptionCompat);
            }
        }
        if (this.write) {
            itemViewHolder.gridLayout.setVisibility(0);
            itemViewHolder.listLayout.setVisibility(8);
            return;
        }
        itemViewHolder.gridLayout.setVisibility(8);
        itemViewHolder.listLayout.setVisibility(0);
    }

    public BillerAdapter(Context context, List<CrashlyticsReport.Session.Builder> list, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment) {
        this.MediaMetadataCompat = context;
        this.read = list;
        this.MediaDescriptionCompat = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
        this.MediaBrowserCompat$SearchResultReceiver = setLastBaselineToBottomHeight.write(context, R.drawable.biller_place_holder);
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$ItemReceiver;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null || (recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof GridLayoutManager)) {
            this.write = true;
        }
    }

    public static void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.IconCompatParcelizer();
    }

    public final CrashlyticsReport.Session.Builder IconCompatParcelizer(int i) {
        List<CrashlyticsReport.Session.Builder> list = this.read;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.read.get(i);
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView avatar;
        @BindView
        ImageView avatarList;
        @BindView
        TextView codeList;
        @BindView
        RelativeLayout gridLayout;
        @BindView
        RelativeLayout listLayout;
        @BindView
        TextView name;
        @BindView
        TextView nameList;

        ItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82342131493460, viewGroup, false));
    }
}
