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
import p040o.chain;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class CreditCardDetailsAdapter extends onActivityCreated {
    public List<chain> IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver = 0;
    private Context read;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = itemViewHolder;
            itemViewHolder.background = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_container_linear_layout, "field 'background'", LinearLayout.class);
            itemViewHolder.nickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nick_name_text_view, "field 'nickName'", TextView.class);
            itemViewHolder.availableBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_account_no_text_view, "field 'availableBalance'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                itemViewHolder.background = null;
                itemViewHolder.nickName = null;
                itemViewHolder.availableBalance = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CreditCardDetailsAdapter(Context context, List<chain> list) {
        this.read = context;
        this.IconCompatParcelizer = list == null ? new ArrayList<>() : list;
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        chain chain = this.IconCompatParcelizer.get(i);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82632131493489, viewGroup, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(inflate);
        if (!TextUtils.isEmpty(chain.AppCompatViewInflater)) {
            itemViewHolder.nickName.setText(chain.AppCompatViewInflater);
        } else {
            itemViewHolder.nickName.setText(chain.setPopupCallback);
        }
        itemViewHolder.availableBalance.setText(chain.MediaBrowserCompat$CustomActionResultReceiver);
        LinearLayout linearLayout = itemViewHolder.background;
        StringBuilder sb = new StringBuilder();
        sb.append("TAG_CREDIT_CARD_LIST_ADAPTER");
        sb.append(i);
        linearLayout.setTag(sb.toString());
        if (this.MediaBrowserCompat$CustomActionResultReceiver == i) {
            itemViewHolder.background.setBackground(setLastBaselineToBottomHeight.write(this.read, R.drawable.rounded_purple_view_pager));
        } else {
            itemViewHolder.background.setBackground(setLastBaselineToBottomHeight.write(this.read, R.drawable.bg_white_rounded));
        }
        viewGroup.addView(inflate);
        return itemViewHolder.AlertController$RecycleListView;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        View AlertController$RecycleListView;
        @BindView
        TextView availableBalance;
        @BindView
        LinearLayout background;
        @BindView
        TextView nickName;

        ItemViewHolder(View view) {
            super(view);
            this.AlertController$RecycleListView = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
