package com.scb.phone.view.adapter.easycash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.NativeSessionFileProvider;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class CardLoanOfferViewPagerAdapter extends onActivityCreated {
    private boolean IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver = 0;
    private List<NativeSessionFileProvider> MediaBrowserCompat$ItemReceiver;
    private boolean read;

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder IconCompatParcelizer;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.IconCompatParcelizer = itemViewHolder;
            itemViewHolder.card = onStart.IconCompatParcelizer(view, R.id.card, "field 'card'");
            itemViewHolder.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_name_text_view, "field 'name'", TextView.class);
            itemViewHolder.description = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_description_text_view, "field 'description'", ThaiTextView.class);
            itemViewHolder.imageCardArt = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_card_art, "field 'imageCardArt'", ImageView.class);
            itemViewHolder.imageCardFull = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_card_full, "field 'imageCardFull'", ImageView.class);
            itemViewHolder.cardDots = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_dots_linear_layout, "field 'cardDots'", LinearLayout.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.IconCompatParcelizer;
            if (itemViewHolder != null) {
                this.IconCompatParcelizer = null;
                itemViewHolder.card = null;
                itemViewHolder.name = null;
                itemViewHolder.description = null;
                itemViewHolder.imageCardArt = null;
                itemViewHolder.imageCardFull = null;
                itemViewHolder.cardDots = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CardLoanOfferViewPagerAdapter(List<NativeSessionFileProvider> list, boolean z, boolean z2) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.IconCompatParcelizer = z;
        this.read = z2;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater layoutInflater = (LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater");
        NativeSessionFileProvider nativeSessionFileProvider = this.MediaBrowserCompat$ItemReceiver.get(i);
        if (!nativeSessionFileProvider.write) {
            view = layoutInflater.inflate(R.layout.f81852131493411, viewGroup, false);
        } else {
            View inflate = layoutInflater.inflate(R.layout.f83252131493551, viewGroup, false);
            ItemViewHolder itemViewHolder = new ItemViewHolder(inflate, this.IconCompatParcelizer, this.read);
            int i2 = 8;
            if (itemViewHolder.Keep) {
                itemViewHolder.imageCardFull.setVisibility(0);
                itemViewHolder.imageCardArt.setVisibility(8);
            } else {
                itemViewHolder.imageCardFull.setVisibility(8);
                itemViewHolder.imageCardArt.setVisibility(0);
            }
            itemViewHolder.name.setText(nativeSessionFileProvider.MediaBrowserCompat$ItemReceiver);
            itemViewHolder.description.setText(nativeSessionFileProvider.MediaBrowserCompat$CustomActionResultReceiver);
            Picasso.read().write(nativeSessionFileProvider.IconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_card_without_logo).IconCompatParcelizer((int) R.drawable.default_card).read(itemViewHolder.Keep ? itemViewHolder.imageCardFull : itemViewHolder.imageCardArt, (FragmentBuilder_BindEkycFragment) null);
            View view2 = itemViewHolder.card;
            StringBuilder sb = new StringBuilder();
            sb.append("TAG_ACCOUNT_SELECTOR_ADAPTER_BACKGROUND");
            sb.append(i);
            view2.setTag(sb.toString());
            LinearLayout linearLayout = itemViewHolder.cardDots;
            if (itemViewHolder.PlaybackStateCompat) {
                i2 = 0;
            }
            linearLayout.setVisibility(i2);
            itemViewHolder.card.setBackground(setLastBaselineToBottomHeight.write(viewGroup.getContext(), this.MediaBrowserCompat$CustomActionResultReceiver == i ? R.drawable.rounded_purple_view_pager : R.drawable.bg_white_rounded));
            view = inflate;
        }
        viewGroup.addView(view, 0);
        return view;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        boolean Keep;
        boolean PlaybackStateCompat;
        @BindView
        View card;
        @BindView
        LinearLayout cardDots;
        @BindView
        ThaiTextView description;
        @BindView
        ImageView imageCardArt;
        @BindView
        ImageView imageCardFull;
        @BindView
        TextView name;

        ItemViewHolder(View view, boolean z, boolean z2) {
            super(view);
            this.PlaybackStateCompat = z;
            this.Keep = z2;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
