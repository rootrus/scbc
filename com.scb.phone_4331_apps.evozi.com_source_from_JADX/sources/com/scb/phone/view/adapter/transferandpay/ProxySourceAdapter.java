package com.scb.phone.view.adapter.transferandpay;

import android.content.Context;
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
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.getEasycashSalesheets;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.setSymbol;

public final class ProxySourceAdapter extends onActivityCreated {
    public int IconCompatParcelizer = 0;
    private LayoutInflater MediaBrowserCompat$CustomActionResultReceiver;
    private Context MediaBrowserCompat$ItemReceiver;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment read;
    public List<setSymbol> write;

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = itemViewHolder;
            itemViewHolder.background = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_source_linear_layout, "field 'background'", LinearLayout.class);
            itemViewHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_source_name_text_view, "field 'title'", TextView.class);
            itemViewHolder.fund = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_source_funds_text_view, "field 'fund'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                itemViewHolder.background = null;
                itemViewHolder.title = null;
                itemViewHolder.fund = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ProxySourceAdapter(Context context, List<setSymbol> list, FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.write = list == null ? new ArrayList<>() : list;
        this.read = fragmentBuilder_BindCcSofBillPaymentOnlyFragment;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = this.MediaBrowserCompat$CustomActionResultReceiver.inflate(R.layout.f82182131493444, viewGroup, false);
        setSymbol setsymbol = this.write.get(i);
        ItemViewHolder itemViewHolder = new ItemViewHolder(inflate);
        if (setsymbol != null) {
            itemViewHolder.title.setText(setsymbol.write);
            itemViewHolder.fund.setText(setsymbol.MediaBrowserCompat$CustomActionResultReceiver);
            LinearLayout linearLayout = itemViewHolder.background;
            StringBuilder sb = new StringBuilder();
            sb.append("TAG_ACCOUNT_SOURCE_ADAPTER");
            sb.append(i);
            linearLayout.setTag(sb.toString());
            if (this.IconCompatParcelizer == i) {
                itemViewHolder.background.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$ItemReceiver, R.drawable.rounded_purple_view_pager));
            } else {
                itemViewHolder.background.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$ItemReceiver, R.drawable.bg_white_rounded));
            }
            if (this.write.size() > 1) {
                itemViewHolder.background.setOnClickListener(new getEasycashSalesheets(this, i));
            }
        }
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    public final int getCount() {
        return this.write.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        LinearLayout background;
        @BindView
        TextView fund;
        @BindView
        TextView title;

        ItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
