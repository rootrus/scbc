package com.scb.phone.view.adapter.creditcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.chain;
import p040o.onActivityCreated;
import p040o.onStart;

public final class CreditCardDetailPurchaseViewPagerAdapter extends onActivityCreated {
    private LayoutInflater IconCompatParcelizer;
    private List<chain> MediaBrowserCompat$ItemReceiver;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$ItemReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = itemViewHolder;
            itemViewHolder.creditCardImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_image_view, "field 'creditCardImage'", ImageView.class);
            itemViewHolder.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_name_text_view, "field 'name'", TextView.class);
            itemViewHolder.number = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'number'", TextView.class);
            itemViewHolder.frontNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_front_text_view, "field 'frontNumber'", TextView.class);
            itemViewHolder.secondFrontNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_2nd_front_text_view, "field 'secondFrontNumber'", TextView.class);
            itemViewHolder.availableValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.available_value_text_view, "field 'availableValue'", TextView.class);
            itemViewHolder.containerPoints = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.available_amount_container_relative_layout, "field 'containerPoints'", RelativeLayout.class);
            itemViewHolder.availableLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.available_label_text_view, "field 'availableLabel'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                itemViewHolder.creditCardImage = null;
                itemViewHolder.name = null;
                itemViewHolder.number = null;
                itemViewHolder.frontNumber = null;
                itemViewHolder.secondFrontNumber = null;
                itemViewHolder.availableValue = null;
                itemViewHolder.containerPoints = null;
                itemViewHolder.availableLabel = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CreditCardDetailPurchaseViewPagerAdapter(Context context, List<chain> list) {
        this.IconCompatParcelizer = (LayoutInflater) context.getSystemService("layout_inflater");
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        chain chain = this.MediaBrowserCompat$ItemReceiver.get(i);
        ItemViewHolder itemViewHolder = new ItemViewHolder(this.IconCompatParcelizer.inflate(R.layout.f82492131493475, (ViewGroup) null));
        FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer2 = Picasso.read().write(chain.MediaSessionCompat$ResultReceiverWrapper).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_card_without_logo).IconCompatParcelizer((int) R.drawable.default_card);
        IconCompatParcelizer2.write = true;
        IconCompatParcelizer2.read(itemViewHolder.creditCardImage, (FragmentBuilder_BindEkycFragment) null);
        itemViewHolder.AlertController$RecycleListView.setTag(chain);
        itemViewHolder.name.setText(chain.setCheckable);
        itemViewHolder.number.setText(chain.f2806x50fd9e4a);
        itemViewHolder.frontNumber.setText(chain.MediaBrowserCompat$SearchResultReceiver);
        itemViewHolder.secondFrontNumber.setText(chain.MediaSessionCompat$QueueItem);
        itemViewHolder.availableValue.setTag(chain.MediaDescriptionCompat);
        itemViewHolder.availableValue.setText(chain.MediaBrowserCompat$CustomActionResultReceiver);
        RelativeLayout relativeLayout = itemViewHolder.containerPoints;
        StringBuilder sb = new StringBuilder();
        sb.append("CREDIT_CARD_NUMBER");
        sb.append(chain.MediaDescriptionCompat);
        relativeLayout.setTag(sb.toString());
        viewGroup.addView(itemViewHolder.AlertController$RecycleListView, 0);
        return itemViewHolder.AlertController$RecycleListView;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        View AlertController$RecycleListView;
        @BindView
        TextView availableLabel;
        @BindView
        TextView availableValue;
        @BindView
        RelativeLayout containerPoints;
        @BindView
        ImageView creditCardImage;
        @BindView
        TextView frontNumber;
        @BindView
        TextView name;
        @BindView
        TextView number;
        @BindView
        TextView secondFrontNumber;

        ItemViewHolder(View view) {
            super(view);
            this.AlertController$RecycleListView = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
