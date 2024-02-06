package com.scb.phone.view.adapter.ccrredemption.product;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.IIdDeserializer;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.getMailingAddressConfirmation;
import p040o.intoSet;
import p040o.onStart;
import p040o.postAddressesValidation;
import p040o.readString;
import p040o.setLastBaselineToBottomHeight;
import p040o.zzpf;

public final class ProductListAdapter extends postAddressesValidation {
    public long MediaBrowserCompat$ItemReceiver = 0;
    public IIdDeserializer read;
    public List<intoSet> write = new ArrayList();

    public class ProductViewHolder_ViewBinding implements Unbinder {
        private ProductViewHolder IconCompatParcelizer;

        public ProductViewHolder_ViewBinding(ProductViewHolder productViewHolder, View view) {
            this.IconCompatParcelizer = productViewHolder;
            productViewHolder.imvProduct = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.imv_product, "field 'imvProduct'", ImageView.class);
            productViewHolder.txvProductName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_product_name, "field 'txvProductName'", TextView.class);
            productViewHolder.txvItemCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_item_code, "field 'txvItemCode'", TextView.class);
            productViewHolder.txvPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_product_points, "field 'txvPoints'", TextView.class);
            productViewHolder.timeLimitLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_time_limit_layout, "field 'timeLimitLayout'", LinearLayout.class);
            productViewHolder.txvTimeLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_time_limit, "field 'txvTimeLimit'", TextView.class);
        }

        public final void read() {
            ProductViewHolder productViewHolder = this.IconCompatParcelizer;
            if (productViewHolder != null) {
                this.IconCompatParcelizer = null;
                productViewHolder.imvProduct = null;
                productViewHolder.txvProductName = null;
                productViewHolder.txvItemCode = null;
                productViewHolder.txvPoints = null;
                productViewHolder.timeLimitLayout = null;
                productViewHolder.txvTimeLimit = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup) {
        return new ProductViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f92332131494460, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        String str;
        char c;
        String str2;
        int i2;
        String str3;
        String str4;
        String str5;
        RecyclerView.setContentView setcontentview2 = setcontentview;
        if (setcontentview2 instanceof ProductViewHolder) {
            intoSet intoset = this.write.get(i);
            String str6 = intoset.MediaSessionCompat$QueueItem;
            String str7 = intoset.MediaDescriptionCompat;
            readString readstring = intoset.PlaybackStateCompat;
            ProductViewHolder productViewHolder = (ProductViewHolder) setcontentview2;
            Context context = productViewHolder.write.getContext();
            ImageView imageView = productViewHolder.imvProduct;
            if (str7 != null) {
                imageView.getContext();
                StringBuilder sb = new StringBuilder();
                sb.append("https://fasteasy.scbeasy.com:8888/api/ccrewardredemption/");
                sb.append(str7);
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.donations_place_holder, imageView, sb.toString());
            } else {
                imageView.setImageResource(R.drawable.donations_place_holder);
            }
            if (readstring == readString.ECOUPON) {
                String string = intoset.setBackgroundResource.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.product_points, new Object[]{NumberFormat.getInstance(Locale.getDefault()).format(intoset.PlaybackStateCompat$CustomAction)});
                long intValue = (long) intoset.PlaybackStateCompat$CustomAction.intValue();
                Integer num = intoset.MediaBrowserCompat$ItemReceiver;
                String str8 = "";
                if (intoset.MediaBrowserCompat$ItemReceiver == null) {
                    str3 = str8;
                } else {
                    str3 = intoset.setBackgroundResource.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.ccr_mins, new Object[]{NumberFormat.getInstance(Locale.getDefault()).format(intoset.MediaBrowserCompat$ItemReceiver)});
                }
                Integer num2 = intoset.MediaBrowserCompat$CustomActionResultReceiver;
                if (intoset.MediaBrowserCompat$CustomActionResultReceiver.intValue() == 0) {
                    str4 = intoset.setBackgroundResource.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.ccr_sold_out, new Object[0]);
                    str = str6;
                } else {
                    str = str6;
                    str4 = intoset.setBackgroundResource.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.ccr_coupon_left, new Object[]{NumberFormat.getInstance(Locale.getDefault()).format(intoset.MediaBrowserCompat$CustomActionResultReceiver)});
                }
                boolean z = intValue > this.MediaBrowserCompat$ItemReceiver;
                boolean z2 = num2.intValue() == 0;
                if (z) {
                    str5 = string;
                    str8 = context.getString(R.string.ccr_more_point_needed, new Object[]{String.valueOf(NumberFormat.getInstance(Locale.getDefault()).format(intValue - this.MediaBrowserCompat$ItemReceiver))});
                } else {
                    str5 = string;
                }
                String str9 = str8;
                TextView textView = productViewHolder.txvProductName;
                int i3 = R.color.f66402131099796;
                textView.setTextColor(setLastBaselineToBottomHeight.read(context, (z2 || z) ? R.color.f66402131099796 : R.color.f67252131099881));
                productViewHolder.txvItemCode.setText(str4);
                productViewHolder.txvItemCode.setTextColor(setLastBaselineToBottomHeight.read(context, z2 ? R.color.f67152131099871 : R.color.f66182131099773));
                TextView textView2 = productViewHolder.txvPoints;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str5);
                sb2.append(" ");
                sb2.append(str9);
                textView2.setText(sb2.toString());
                TextView textView3 = productViewHolder.txvPoints;
                if (!z2 && !z) {
                    i3 = R.color.f66092131099764;
                }
                textView3.setTextColor(setLastBaselineToBottomHeight.read(context, i3));
                productViewHolder.txvTimeLimit.setText(str3);
                productViewHolder.timeLimitLayout.setVisibility(num != null ? 0 : 8);
            } else {
                str = str6;
                String format = NumberFormat.getInstance(Locale.getDefault()).format(intoset.PlaybackStateCompat$CustomAction);
                if (intoset.setHasDecor == zzpf.zza.MILEAGE) {
                    str2 = intoset.setBackgroundResource.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.mileage_points_per_miles, new Object[]{format, NumberFormat.getInstance(Locale.getDefault()).format(intoset.f2870x50fd9e4a.IconCompatParcelizer)});
                } else if (intoset.IconCompatParcelizer == null || intoset.ParcelableVolumeInfo == null || intoset.MediaBrowserCompat$MediaItem == null) {
                    i2 = 1;
                    c = 0;
                    str2 = intoset.setBackgroundResource.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.product_points, new Object[]{format});
                    String str10 = intoset.MediaSessionCompat$Token;
                    TextView textView4 = productViewHolder.txvItemCode;
                    Object[] objArr = new Object[i2];
                    objArr[c] = str10;
                    textView4.setText(context.getString(R.string.item_code, objArr));
                    productViewHolder.timeLimitLayout.setVisibility(8);
                    productViewHolder.txvProductName.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f67252131099881));
                    productViewHolder.txvItemCode.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66182131099773));
                    productViewHolder.txvPoints.setText(str2);
                    productViewHolder.txvPoints.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
                } else {
                    str2 = intoset.setBackgroundResource.read.getString(Iterables$3$MediaBrowserCompat$MediaItem.product_points_and_points_plus_cash, new Object[]{format, NumberFormat.getInstance(Locale.getDefault()).format(intoset.ParcelableVolumeInfo), NumberFormat.getInstance(Locale.getDefault()).format(intoset.IconCompatParcelizer), intoset.MediaBrowserCompat$MediaItem});
                }
                i2 = 1;
                c = 0;
                String str102 = intoset.MediaSessionCompat$Token;
                TextView textView42 = productViewHolder.txvItemCode;
                Object[] objArr2 = new Object[i2];
                objArr2[c] = str102;
                textView42.setText(context.getString(R.string.item_code, objArr2));
                productViewHolder.timeLimitLayout.setVisibility(8);
                productViewHolder.txvProductName.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f67252131099881));
                productViewHolder.txvItemCode.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66182131099773));
                productViewHolder.txvPoints.setText(str2);
                productViewHolder.txvPoints.setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
            }
            productViewHolder.txvProductName.setText(str);
            productViewHolder.write.setOnClickListener(new getMailingAddressConfirmation(this, intoset));
        }
    }

    public final void write(RecyclerView.setContentView setcontentview) {
        super.write(setcontentview);
        if (setcontentview instanceof ProductViewHolder) {
            ((ProductViewHolder) setcontentview).imvProduct.setImageDrawable((Drawable) null);
        }
    }

    public final int write() {
        List<intoSet> list = this.write;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static class ProductViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView imvProduct;
        @BindView
        LinearLayout timeLimitLayout;
        @BindView
        TextView txvItemCode;
        @BindView
        TextView txvPoints;
        @BindView
        TextView txvProductName;
        @BindView
        TextView txvTimeLimit;

        public ProductViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
