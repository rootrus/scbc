package com.scb.phone.view.adapter.gift;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onActivityCreated;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class GiftMoneySelectThemeAdapter extends onActivityCreated {
    public List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> IconCompatParcelizer;
    private final LayoutInflater MediaBrowserCompat$ItemReceiver;

    public final int getItemPosition(Object obj) {
        onGetStartedClick.write(obj, "object");
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write(obj, "object");
        return view == obj;
    }

    public GiftMoneySelectThemeAdapter(Context context) {
        Object systemService = context != null ? context.getSystemService("layout_inflater") : null;
        if (systemService != null) {
            this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) systemService;
            this.IconCompatParcelizer = new ArrayList();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "container");
        View inflate = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f85002131493727, (ViewGroup) null);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "mInflater.inflate(R.layo…eme_gift_card_item, null)");
        GiftMoneySelectThemeViewHolder giftMoneySelectThemeViewHolder = new GiftMoneySelectThemeViewHolder(inflate);
        AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r5 = this.IconCompatParcelizer.get(i);
        onGetStartedClick.write((Object) r5, "display");
        View view = giftMoneySelectThemeViewHolder.write;
        onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
        if (view.getContext() != null) {
            ImageView imageView = giftMoneySelectThemeViewHolder.ivGiftCard;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivGiftCard");
            }
            String str = r5.MediaMetadataCompat;
            if (str == null) {
                str = "";
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaMetadataCompat(imageView, str);
        }
        TextView textView = giftMoneySelectThemeViewHolder.tvGiftCardName;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvGiftCardName");
        }
        textView.setText(r5.MediaBrowserCompat$SearchResultReceiver);
        TextView textView2 = giftMoneySelectThemeViewHolder.tvGiftCardDescription;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvGiftCardDescription");
        }
        textView2.setText(r5.read);
        View view2 = giftMoneySelectThemeViewHolder.write;
        onGetStartedClick.IconCompatParcelizer((Object) view2, "itemViewHolder.itemView");
        viewGroup.addView(view2, 0);
        return view2;
    }

    public final class GiftMoneySelectThemeViewHolder_ViewBinding implements Unbinder {
        private GiftMoneySelectThemeViewHolder MediaBrowserCompat$ItemReceiver;

        public GiftMoneySelectThemeViewHolder_ViewBinding(GiftMoneySelectThemeViewHolder giftMoneySelectThemeViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = giftMoneySelectThemeViewHolder;
            giftMoneySelectThemeViewHolder.ivGiftCard = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_theme_gift_card, "field 'ivGiftCard'", ImageView.class);
            giftMoneySelectThemeViewHolder.tvGiftCardName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_theme_gift_card_name, "field 'tvGiftCardName'", TextView.class);
            giftMoneySelectThemeViewHolder.tvGiftCardDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_theme_gift_card_description, "field 'tvGiftCardDescription'", TextView.class);
        }

        public final void read() {
            GiftMoneySelectThemeViewHolder giftMoneySelectThemeViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (giftMoneySelectThemeViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                giftMoneySelectThemeViewHolder.ivGiftCard = null;
                giftMoneySelectThemeViewHolder.tvGiftCardName = null;
                giftMoneySelectThemeViewHolder.tvGiftCardDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        onGetStartedClick.write((Object) viewGroup, "container");
        onGetStartedClick.write(obj, "object");
        viewGroup.removeView((View) obj);
    }

    public final class GiftMoneySelectThemeViewHolder extends RecyclerView.setContentView {
        @BindView
        public ImageView ivGiftCard;
        @BindView
        public TextView tvGiftCardDescription;
        @BindView
        public TextView tvGiftCardName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GiftMoneySelectThemeViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "parent");
            ButterKnife.IconCompatParcelizer(this, this.write);
        }
    }
}
