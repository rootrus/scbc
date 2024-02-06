package com.scb.phone.view.adapter.etb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class InformationPanelAdapter extends RecyclerView.IconCompatParcelizer<ItemHolder> {
    public final List<read> read = new ArrayList();

    public static final class read {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
        public String write;
    }

    public class ItemHolder_ViewBinding implements Unbinder {
        private ItemHolder IconCompatParcelizer;

        public ItemHolder_ViewBinding(ItemHolder itemHolder, View view) {
            this.IconCompatParcelizer = itemHolder;
            itemHolder.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_item_information_panel_title, "field 'tvTitle'", TextView.class);
            itemHolder.tvTargetName = (ImageTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_name_text_view, "field 'tvTargetName'", ImageTextView.class);
            itemHolder.tvSub1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_item_information_panel_sub_1, "field 'tvSub1'", TextView.class);
            itemHolder.tvSub2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_item_information_panel_sub_2, "field 'tvSub2'", TextView.class);
            itemHolder.spSeparator = (Space) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.space_separator, "field 'spSeparator'", Space.class);
        }

        public final void read() {
            ItemHolder itemHolder = this.IconCompatParcelizer;
            if (itemHolder != null) {
                this.IconCompatParcelizer = null;
                itemHolder.tvTitle = null;
                itemHolder.tvTargetName = null;
                itemHolder.tvSub1 = null;
                itemHolder.tvSub2 = null;
                itemHolder.spSeparator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ItemHolder itemHolder = (ItemHolder) setcontentview;
        read read2 = this.read.get(i);
        itemHolder.tvTitle.setText(read2.MediaBrowserCompat$ItemReceiver);
        String str = read2.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            Context context = itemHolder.AlertController$RecycleListView;
            FragmentBuilder_BindDepositSelectorFragment.read(context, (int) R.drawable.bankicon_place_holder, itemHolder.tvTargetName, str, context.getResources().getDimensionPixelOffset(R.dimen.f74412131165877), setLastBaselineToBottomHeight.read(itemHolder.AlertController$RecycleListView, R.color.f66402131099796));
        }
        itemHolder.tvTargetName.setText(read2.IconCompatParcelizer);
        String str2 = read2.write;
        int i2 = 0;
        if (str2 != null) {
            itemHolder.tvSub1.setVisibility(0);
            itemHolder.tvSub1.setText(str2);
        }
        String str3 = read2.read;
        if (str3 != null) {
            itemHolder.tvSub2.setVisibility(0);
            itemHolder.tvSub2.setText(str3);
        }
        Space space = itemHolder.spSeparator;
        if (i == this.read.size() - 1) {
            i2 = 8;
        }
        space.setVisibility(i2);
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    static class ItemHolder extends RecyclerView.setContentView {
        Context AlertController$RecycleListView;
        @BindView
        Space spSeparator;
        @BindView
        TextView tvSub1;
        @BindView
        TextView tvSub2;
        @BindView
        ImageTextView tvTargetName;
        @BindView
        TextView tvTitle;

        public ItemHolder(View view) {
            super(view);
            this.AlertController$RecycleListView = view.getContext();
            ButterKnife.IconCompatParcelizer(this, this.write);
            this.tvSub1.setVisibility(8);
            this.tvSub2.setVisibility(8);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new ItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90672131494294, viewGroup, false));
    }
}
