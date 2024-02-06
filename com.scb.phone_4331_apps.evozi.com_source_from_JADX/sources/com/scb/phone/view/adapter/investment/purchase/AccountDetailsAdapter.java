package com.scb.phone.view.adapter.investment.purchase;

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
import java.util.ArrayList;
import java.util.List;
import p040o.immediateCheckedFuture;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class AccountDetailsAdapter extends onActivityCreated {
    public int IconCompatParcelizer = 0;
    private Context MediaBrowserCompat$ItemReceiver;
    public List<immediateCheckedFuture> write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$ItemReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = itemViewHolder;
            itemViewHolder.background = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_container_linear_layout, "field 'background'", LinearLayout.class);
            itemViewHolder.nickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nick_name_text_view, "field 'nickName'", TextView.class);
            itemViewHolder.balance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_account_no_text_view, "field 'balance'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                itemViewHolder.background = null;
                itemViewHolder.nickName = null;
                itemViewHolder.balance = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public AccountDetailsAdapter(Context context, List<immediateCheckedFuture> list) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.write = list == null ? new ArrayList<>() : list;
    }

    public final int getCount() {
        return this.write.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        immediateCheckedFuture immediatecheckedfuture = this.write.get(i);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82632131493489, viewGroup, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(inflate);
        itemViewHolder.nickName.setText(immediatecheckedfuture.PlaybackStateCompat);
        if (!TextUtils.isEmpty(immediatecheckedfuture.PlaybackStateCompat)) {
            itemViewHolder.nickName.setText(immediatecheckedfuture.PlaybackStateCompat);
        } else {
            itemViewHolder.nickName.setText(immediatecheckedfuture.MediaBrowserCompat$ItemReceiver);
        }
        itemViewHolder.balance.setText(immediatecheckedfuture.MediaDescriptionCompat);
        LinearLayout linearLayout = itemViewHolder.background;
        StringBuilder sb = new StringBuilder();
        sb.append("TAG_ACCOUNT_LIST_ADAPTER");
        sb.append(i);
        linearLayout.setTag(sb.toString());
        if (this.IconCompatParcelizer == i) {
            itemViewHolder.background.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$ItemReceiver, R.drawable.rounded_purple_view_pager));
        } else {
            itemViewHolder.background.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$ItemReceiver, R.drawable.bg_white_rounded));
        }
        viewGroup.addView(inflate);
        return itemViewHolder.PlaybackStateCompat;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        View PlaybackStateCompat;
        @BindView
        LinearLayout background;
        @BindView
        TextView balance;
        @BindView
        TextView nickName;

        ItemViewHolder(View view) {
            super(view);
            this.PlaybackStateCompat = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
