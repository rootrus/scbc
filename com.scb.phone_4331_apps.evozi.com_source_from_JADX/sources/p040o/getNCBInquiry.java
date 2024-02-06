package p040o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ImageViewCropStart;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.ZHER2K;

/* renamed from: o.getNCBInquiry */
public final class getNCBInquiry extends onActivityCreated {
    public int IconCompatParcelizer = R.drawable.bg_white_rounded;
    private final Context MediaBrowserCompat$CustomActionResultReceiver;
    private final List<chain> MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$SearchResultReceiver = R.drawable.rounded_purple_view_pager;
    public write read;
    public int write;

    /* renamed from: o.getNCBInquiry$write */
    public interface write {
        void IconCompatParcelizer(chain chain, int i);
    }

    public getNCBInquiry(Context context, List<? extends chain> list) {
        onGetStartedClick.write((Object) context, "context");
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write(obj, "obj");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) view, obj);
    }

    public final int getCount() {
        List<chain> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        onGetStartedClick.write((Object) viewGroup, "container");
        onGetStartedClick.write(obj, "obj");
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "container");
        List<chain> list = this.MediaBrowserCompat$ItemReceiver;
        String str = null;
        chain chain = list != null ? list.get(i) : null;
        View inflate = LayoutInflater.from(this.MediaBrowserCompat$CustomActionResultReceiver).inflate(R.layout.f82412131493467, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(cont…                   false)");
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(inflate);
        if (this.write == i) {
            ConstraintLayout constraintLayout = (ConstraintLayout) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.card_container);
            onGetStartedClick.IconCompatParcelizer((Object) constraintLayout, "vh.view.card_container");
            constraintLayout.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver));
            ((TextView) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.tv_card_reference_name)).setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$CustomActionResultReceiver, R.color.f66092131099764));
        } else {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.card_container);
            onGetStartedClick.IconCompatParcelizer((Object) constraintLayout2, "vh.view.card_container");
            constraintLayout2.setBackground(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer));
            ((TextView) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.tv_card_reference_name)).setTextColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$CustomActionResultReceiver, R.color.f66182131099773));
        }
        if (chain != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.tv_card_available_credit);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView, "view.tv_card_available_credit");
            appCompatTextView.setText(chain.MediaBrowserCompat$CustomActionResultReceiver);
            TextView textView = (TextView) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.tv_card_reference_name);
            onGetStartedClick.IconCompatParcelizer((Object) textView, "view.tv_card_reference_name");
            textView.setText(chain.AppCompatViewInflater);
            TextView textView2 = (TextView) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.tv_card_last_number);
            onGetStartedClick.IconCompatParcelizer((Object) textView2, "view.tv_card_last_number");
            textView2.setText(chain.f2806x50fd9e4a);
        } else {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.tv_card_available_credit);
            onGetStartedClick.IconCompatParcelizer((Object) appCompatTextView2, "view.tv_card_available_credit");
            appCompatTextView2.setText((CharSequence) null);
            TextView textView3 = (TextView) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.tv_card_reference_name);
            onGetStartedClick.IconCompatParcelizer((Object) textView3, "view.tv_card_reference_name");
            textView3.setText((CharSequence) null);
            TextView textView4 = (TextView) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.tv_card_last_number);
            onGetStartedClick.IconCompatParcelizer((Object) textView4, "view.tv_card_last_number");
            textView4.setText((CharSequence) null);
        }
        if (chain != null) {
            str = chain.MediaSessionCompat$ResultReceiverWrapper;
        }
        if (str == null) {
            str = "";
        }
        ImageViewCropStart imageViewCropStart = (ImageViewCropStart) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.image_card_art);
        onGetStartedClick.IconCompatParcelizer((Object) imageViewCropStart, "view.image_card_art");
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(str, imageViewCropStart);
        TextView textView5 = (TextView) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.tv_card_reference_name);
        onGetStartedClick.IconCompatParcelizer((Object) textView5, "vh.view.tv_card_reference_name");
        StringBuilder sb = new StringBuilder();
        sb.append("TAG_ACCOUNT_SOURCE_ADAPTER_TEXT");
        sb.append(i);
        textView5.setTag(sb.toString());
        ConstraintLayout constraintLayout3 = (ConstraintLayout) iconCompatParcelizer.Keep.findViewById(ZHER2K.write.card_container);
        onGetStartedClick.IconCompatParcelizer((Object) constraintLayout3, "vh.view.card_container");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TAG_ACCOUNT_SOURCE_ADAPTER");
        sb2.append(i);
        constraintLayout3.setTag(sb2.toString());
        write write2 = this.read;
        if (write2 != null) {
            iconCompatParcelizer.Keep.setOnClickListener(new getNCBInquiry$MediaBrowserCompat$ItemReceiver(write2, chain, i));
        }
        viewGroup.addView(iconCompatParcelizer.Keep, 0);
        return iconCompatParcelizer.Keep;
    }

    /* renamed from: o.getNCBInquiry$IconCompatParcelizer */
    public final class IconCompatParcelizer extends RecyclerView.setContentView {
        final View Keep;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(View view) {
            super(view);
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            this.Keep = view;
        }

        static void MediaBrowserCompat$ItemReceiver(String str, ImageView imageView) {
            FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer = Picasso.read().write(str).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_card_without_logo).IconCompatParcelizer((int) R.drawable.default_card).IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]);
            IconCompatParcelizer.write = true;
            IconCompatParcelizer.read(imageView, (FragmentBuilder_BindEkycFragment) null);
        }
    }
}
