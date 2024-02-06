package com.scb.phone.view.adapter.investment;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.doBackgroundInitializationAsync;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class FundClientListAdapter extends onActivityCreated {
    public int MediaBrowserCompat$CustomActionResultReceiver = 0;
    private Context MediaBrowserCompat$ItemReceiver;
    private List<doBackgroundInitializationAsync> read;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = itemViewHolder;
            itemViewHolder.background = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.client_list_container_linear_layout, "field 'background'", LinearLayout.class);
            itemViewHolder.nickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nick_name_text_view, "field 'nickName'", TextView.class);
            itemViewHolder.clientNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_client_no_text_view, "field 'clientNo'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                itemViewHolder.background = null;
                itemViewHolder.nickName = null;
                itemViewHolder.clientNo = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public FundClientListAdapter(Context context, List<doBackgroundInitializationAsync> list) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = list;
    }

    public final int getCount() {
        return this.read.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        doBackgroundInitializationAsync dobackgroundinitializationasync = this.read.get(i);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83632131493589, viewGroup, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(inflate);
        itemViewHolder.nickName.setText(dobackgroundinitializationasync.MediaSessionCompat$QueueItem);
        if (TextUtils.isEmpty(dobackgroundinitializationasync.MediaSessionCompat$QueueItem)) {
            itemViewHolder.nickName.setVisibility(8);
            itemViewHolder.clientNo.setGravity(16);
        }
        itemViewHolder.clientNo.setText(dobackgroundinitializationasync.MediaMetadataCompat);
        LinearLayout linearLayout = itemViewHolder.background;
        StringBuilder sb = new StringBuilder();
        sb.append("TAG_PURCHASE_CLIENT_LIST_ADAPTER");
        sb.append(i);
        linearLayout.setTag(sb.toString());
        if (this.MediaBrowserCompat$CustomActionResultReceiver == i) {
            itemViewHolder.background.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$ItemReceiver, R.drawable.rounded_purple_view_pager));
        } else {
            itemViewHolder.background.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$ItemReceiver, R.drawable.bg_white_rounded));
        }
        viewGroup.addView(inflate);
        return itemViewHolder.AlertController$RecycleListView;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        View AlertController$RecycleListView;
        @BindView
        LinearLayout background;
        @BindView
        TextView clientNo;
        @BindView
        TextView nickName;

        ItemViewHolder(View view) {
            super(view);
            this.AlertController$RecycleListView = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
