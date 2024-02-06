package com.scb.phone.view.adapter.investment.onboarding;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.IdManager;
import p040o.getMoreCardTransactions;
import p040o.onActivityCreated;
import p040o.onStart;

public final class FundAccountPagerAdapter extends onActivityCreated {
    private final List<IdManager> IconCompatParcelizer;
    private LayoutInflater MediaBrowserCompat$CustomActionResultReceiver;
    public final read MediaBrowserCompat$ItemReceiver;
    private Context read;
    public int write = -1;

    public interface read {
        void write(int i);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder IconCompatParcelizer;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.IconCompatParcelizer = itemViewHolder;
            itemViewHolder.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_name, "field 'name'", TextView.class);
            itemViewHolder.number = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number, "field 'number'", TextView.class);
            itemViewHolder.branch = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_branch, "field 'branch'", TextView.class);
            itemViewHolder.layoutContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_container, "field 'layoutContainer'", LinearLayout.class);
            itemViewHolder.cardViewContainer = (CardView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_container, "field 'cardViewContainer'", CardView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.IconCompatParcelizer;
            if (itemViewHolder != null) {
                this.IconCompatParcelizer = null;
                itemViewHolder.name = null;
                itemViewHolder.number = null;
                itemViewHolder.branch = null;
                itemViewHolder.layoutContainer = null;
                itemViewHolder.cardViewContainer = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public FundAccountPagerAdapter(Context context, List<IdManager> list, read read2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.IconCompatParcelizer = list;
        this.read = context;
        this.MediaBrowserCompat$ItemReceiver = read2;
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final int getItemPosition(Object obj) {
        if (obj == null || !(obj instanceof LinearLayout)) {
            return -1;
        }
        LinearLayout linearLayout = (LinearLayout) obj;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.layout_container);
        linearLayout2.setSelected(false);
        String str = (String) linearLayout.getTag();
        if (this.write >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.write);
            if (sb.toString().equals(str)) {
                linearLayout2.setSelected(true);
                return super.getItemPosition(obj);
            }
        }
        linearLayout2.setSelected(false);
        return super.getItemPosition(obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        IdManager idManager = this.IconCompatParcelizer.get(i);
        ItemViewHolder itemViewHolder = new ItemViewHolder(this.MediaBrowserCompat$CustomActionResultReceiver.inflate(R.layout.f82842131493510, (ViewGroup) null));
        itemViewHolder.name.setText(idManager.IconCompatParcelizer);
        itemViewHolder.number.setText(idManager.read);
        itemViewHolder.branch.setVisibility(idManager.MediaDescriptionCompat ? 0 : 8);
        itemViewHolder.branch.setText(idManager.MediaBrowserCompat$CustomActionResultReceiver);
        View view = itemViewHolder.Keep;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        view.setTag(sb.toString());
        itemViewHolder.layoutContainer.setOnClickListener(new getMoreCardTransactions(this, i));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, this.read.getResources().getDrawable(R.drawable.card_selector_state_selected));
        stateListDrawable.addState(new int[0], this.read.getResources().getDrawable(R.drawable.card_selector_state_normal));
        itemViewHolder.layoutContainer.setBackground(stateListDrawable);
        int i2 = this.write;
        if (i2 < 0 || i != i2) {
            itemViewHolder.layoutContainer.setSelected(false);
        } else {
            itemViewHolder.layoutContainer.setSelected(true);
        }
        viewGroup.addView(view, 0);
        return view;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        View Keep;
        @BindView
        TextView branch;
        @BindView
        CardView cardViewContainer;
        @BindView
        LinearLayout layoutContainer;
        @BindView
        TextView name;
        @BindView
        TextView number;

        ItemViewHolder(View view) {
            super(view);
            this.Keep = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
