package com.scb.phone.view.adapter.deposit;

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
import java.util.ArrayList;
import java.util.List;
import p040o.doWriteToLog;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class MerchantWalletSelectorAdapter extends onActivityCreated {
    private List<doWriteToLog> IconCompatParcelizer;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$ItemReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = itemViewHolder;
            itemViewHolder.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
            itemViewHolder.textAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number, "field 'textAccountNumber'", TextView.class);
            itemViewHolder.textAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_name, "field 'textAccountName'", TextView.class);
            itemViewHolder.textBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_balance, "field 'textBalance'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                itemViewHolder.imageIcon = null;
                itemViewHolder.textAccountNumber = null;
                itemViewHolder.textAccountName = null;
                itemViewHolder.textBalance = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public MerchantWalletSelectorAdapter(List<doWriteToLog> list) {
        this.IconCompatParcelizer = list == null ? new ArrayList<>() : list;
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83762131493602, viewGroup, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(inflate);
        doWriteToLog dowritetolog = MerchantWalletSelectorAdapter.this.IconCompatParcelizer.get(i);
        itemViewHolder.textAccountName.setText(dowritetolog.IconCompatParcelizer);
        itemViewHolder.textAccountNumber.setText(dowritetolog.MediaBrowserCompat$SearchResultReceiver);
        itemViewHolder.textBalance.setText(dowritetolog.MediaDescriptionCompat);
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView imageIcon;
        @BindView
        TextView textAccountName;
        @BindView
        TextView textAccountNumber;
        @BindView
        TextView textBalance;

        ItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.imageIcon.setImageDrawable(setLastBaselineToBottomHeight.write(view.getContext(), R.drawable.ic_scb_wallet_shop));
        }
    }
}
