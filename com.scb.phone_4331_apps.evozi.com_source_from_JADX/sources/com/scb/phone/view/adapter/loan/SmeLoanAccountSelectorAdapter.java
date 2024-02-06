package com.scb.phone.view.adapter.loan;

import android.text.TextUtils;
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
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.Futures;
import p040o.onActivityCreated;
import p040o.onStart;

public final class SmeLoanAccountSelectorAdapter extends onActivityCreated {
    private List<Futures.ChainingListenableFuture> MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = itemViewHolder;
            itemViewHolder.imageAccountIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_account_icon, "field 'imageAccountIcon'", ImageView.class);
            itemViewHolder.textAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number, "field 'textAccountNumber'", TextView.class);
            itemViewHolder.textAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_name, "field 'textAccountName'", TextView.class);
            itemViewHolder.textBalanceTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_balance_title, "field 'textBalanceTitle'", TextView.class);
            itemViewHolder.textBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_balance, "field 'textBalance'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                itemViewHolder.imageAccountIcon = null;
                itemViewHolder.textAccountNumber = null;
                itemViewHolder.textAccountName = null;
                itemViewHolder.textBalanceTitle = null;
                itemViewHolder.textBalance = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SmeLoanAccountSelectorAdapter(List<Futures.ChainingListenableFuture> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list == null ? new ArrayList<>() : list;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83772131493603, viewGroup, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(inflate);
        Futures.ChainingListenableFuture chainingListenableFuture = SmeLoanAccountSelectorAdapter.this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
        String str = chainingListenableFuture.MediaBrowserCompat$ItemReceiver;
        if (TextUtils.isEmpty(str)) {
            str = chainingListenableFuture.IconCompatParcelizer;
        }
        if (!TextUtils.isEmpty(chainingListenableFuture.setContentView)) {
            Picasso.read().write(chainingListenableFuture.setContentView).read(itemViewHolder.imageAccountIcon, (FragmentBuilder_BindEkycFragment) null);
        }
        itemViewHolder.textAccountName.setText(str);
        itemViewHolder.textAccountNumber.setText(chainingListenableFuture.read);
        itemViewHolder.textBalanceTitle.setText(chainingListenableFuture.f2712x50fd9e4a);
        itemViewHolder.textBalance.setText(chainingListenableFuture.ParcelableVolumeInfo);
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    class ItemViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView imageAccountIcon;
        @BindView
        TextView textAccountName;
        @BindView
        TextView textAccountNumber;
        @BindView
        TextView textBalance;
        @BindView
        TextView textBalanceTitle;

        ItemViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
