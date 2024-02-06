package com.scb.phone.view.activity.prepaid;

import android.text.TextUtils;
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
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import p040o.C7513tX;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.onActivityCreated;
import p040o.onStart;

public final class PrepaidCardAdapter extends onActivityCreated {
    List<? extends C7513tX.IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
    private final String write;

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class PrepaidHolder_ViewBinding implements Unbinder {
        private PrepaidHolder write;

        public PrepaidHolder_ViewBinding(PrepaidHolder prepaidHolder, View view) {
            this.write = prepaidHolder;
            prepaidHolder.tvNickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_nickname, "field 'tvNickname'", TextView.class);
            prepaidHolder.tvLastNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'tvLastNumber'", TextView.class);
            prepaidHolder.tvFrontNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_front_text_view, "field 'tvFrontNumber'", TextView.class);
            prepaidHolder.tvSecondFrontNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_2nd_front_text_view, "field 'tvSecondFrontNumber'", TextView.class);
            prepaidHolder.tvPoint = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_point, "field 'tvPoint'", TextView.class);
            prepaidHolder.ivCard = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_card, "field 'ivCard'", ImageView.class);
            prepaidHolder.lloverlayContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_overlay_container, "field 'lloverlayContainer'", LinearLayout.class);
            prepaidHolder.ivThumb = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_thumb, "field 'ivThumb'", ImageView.class);
            prepaidHolder.tvOverlayDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_overlay_description, "field 'tvOverlayDescription'", TextView.class);
        }

        public final void read() {
            PrepaidHolder prepaidHolder = this.write;
            if (prepaidHolder != null) {
                this.write = null;
                prepaidHolder.tvNickname = null;
                prepaidHolder.tvLastNumber = null;
                prepaidHolder.tvFrontNumber = null;
                prepaidHolder.tvSecondFrontNumber = null;
                prepaidHolder.tvPoint = null;
                prepaidHolder.ivCard = null;
                prepaidHolder.lloverlayContainer = null;
                prepaidHolder.ivThumb = null;
                prepaidHolder.tvOverlayDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public PrepaidCardAdapter(String str) {
        this.write = str;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.size();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        PrepaidHolder prepaidHolder = new PrepaidHolder(viewGroup, this.write);
        C7513tX.IconCompatParcelizer iconCompatParcelizer = (C7513tX.IconCompatParcelizer) this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
        prepaidHolder.tvNickname.setVisibility(0);
        prepaidHolder.tvNickname.setText(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$MediaItem);
        prepaidHolder.tvFrontNumber.setText(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
        prepaidHolder.tvSecondFrontNumber.setText(iconCompatParcelizer.MediaMetadataCompat());
        prepaidHolder.tvLastNumber.setText(iconCompatParcelizer.write());
        if (iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver() == null || TextUtils.isEmpty(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat)) {
            prepaidHolder.lloverlayContainer.setVisibility(8);
            if (!iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$CustomActionResultReceiver.contains("SHOW_TRAVEL_DETAILS")) {
                if (iconCompatParcelizer.MediaBrowserCompat$MediaItem()) {
                    prepaidHolder.tvPoint.setText(prepaidHolder.setHasDecor);
                    prepaidHolder.tvPoint.setBackgroundResource(R.drawable.trapezoid_gray);
                    prepaidHolder.tvPoint.setVisibility(0);
                } else if (iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver() == null) {
                    prepaidHolder.tvPoint.setVisibility(8);
                } else {
                    prepaidHolder.tvPoint.setText(iconCompatParcelizer.IconCompatParcelizer());
                    prepaidHolder.tvPoint.setBackgroundResource(R.drawable.trapezoid_purple);
                    prepaidHolder.tvPoint.setVisibility(0);
                }
            }
        } else {
            prepaidHolder.lloverlayContainer.setVisibility(0);
            prepaidHolder.tvOverlayDescription.setText(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver().MediaDescriptionCompat);
            prepaidHolder.tvPoint.setVisibility(8);
        }
        if (iconCompatParcelizer.RatingCompat()) {
            prepaidHolder.ivThumb.setImageResource(R.mipmap.f93142131623939);
        }
        Picasso.read().write(iconCompatParcelizer.read()).IconCompatParcelizer((int) R.drawable.default_card_without_logo).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_card_without_logo).read(prepaidHolder.ivCard, (FragmentBuilder_BindEkycFragment) null);
        viewGroup.addView(prepaidHolder.write);
        return prepaidHolder.write;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public static class PrepaidHolder extends RecyclerView.setContentView {
        @BindView
        ImageView ivCard;
        @BindView
        ImageView ivThumb;
        @BindView
        LinearLayout lloverlayContainer;
        final String setHasDecor;
        @BindView
        TextView tvFrontNumber;
        @BindView
        TextView tvLastNumber;
        @BindView
        TextView tvNickname;
        @BindView
        TextView tvOverlayDescription;
        @BindView
        TextView tvPoint;
        @BindView
        TextView tvSecondFrontNumber;

        public PrepaidHolder(ViewGroup viewGroup, String str) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90492131494276, viewGroup, false));
            this.setHasDecor = str;
            ButterKnife.IconCompatParcelizer(this, this.write);
        }
    }
}
