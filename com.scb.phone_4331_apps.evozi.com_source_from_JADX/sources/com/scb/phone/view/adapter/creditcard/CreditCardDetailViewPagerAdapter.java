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
import com.scb.phone.view.custom.common.AdjustableImageView;
import java.util.List;
import p040o.C7221landing;
import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.FragmentBuilder_BindBillPaymentFavouriteTargetFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.chain;
import p040o.isRequired;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.postRemittanceAccounts;

public final class CreditCardDetailViewPagerAdapter extends onActivityCreated {
    public ViewGroup.LayoutParams IconCompatParcelizer;
    public FragmentBuilder_BindBillPaymentFavouriteTargetFragment MediaBrowserCompat$CustomActionResultReceiver;
    private List<chain> MediaBrowserCompat$ItemReceiver;
    private LayoutInflater MediaBrowserCompat$SearchResultReceiver;
    public CheckCaptureModule_GetIJsonExactionHelperRttiFactory.read read;
    private Context write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class CreditCardItemViewHolder_ViewBinding implements Unbinder {
        private CreditCardItemViewHolder MediaBrowserCompat$ItemReceiver;

        public CreditCardItemViewHolder_ViewBinding(CreditCardItemViewHolder creditCardItemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = creditCardItemViewHolder;
            creditCardItemViewHolder.creditCardImageView = (AdjustableImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_image_view, "field 'creditCardImageView'", AdjustableImageView.class);
            creditCardItemViewHolder.tvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_name_text_view, "field 'tvName'", TextView.class);
            creditCardItemViewHolder.tvNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'tvNumber'", TextView.class);
            creditCardItemViewHolder.tvFrontNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_front_text_view, "field 'tvFrontNumber'", TextView.class);
            creditCardItemViewHolder.tvSecondFrontNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_2nd_front_text_view, "field 'tvSecondFrontNumber'", TextView.class);
            creditCardItemViewHolder.points = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_points_text_view, "field 'points'", TextView.class);
            creditCardItemViewHolder.containerPoints = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_points_container_relative_layout, "field 'containerPoints'", RelativeLayout.class);
            creditCardItemViewHolder.giftIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_gift, "field 'giftIcon'", ImageView.class);
            creditCardItemViewHolder.pointLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_points_label, "field 'pointLabel'", TextView.class);
            creditCardItemViewHolder.errorContainerPoints = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_card_points_container_relative_layout, "field 'errorContainerPoints'", RelativeLayout.class);
            creditCardItemViewHolder.blockContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rl_block, "field 'blockContainer'", RelativeLayout.class);
            creditCardItemViewHolder.imageBlock = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_block, "field 'imageBlock'", ImageView.class);
            creditCardItemViewHolder.textBlock = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_block, "field 'textBlock'", TextView.class);
        }

        public final void read() {
            CreditCardItemViewHolder creditCardItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (creditCardItemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                creditCardItemViewHolder.creditCardImageView = null;
                creditCardItemViewHolder.tvName = null;
                creditCardItemViewHolder.tvNumber = null;
                creditCardItemViewHolder.tvFrontNumber = null;
                creditCardItemViewHolder.tvSecondFrontNumber = null;
                creditCardItemViewHolder.points = null;
                creditCardItemViewHolder.containerPoints = null;
                creditCardItemViewHolder.giftIcon = null;
                creditCardItemViewHolder.pointLabel = null;
                creditCardItemViewHolder.errorContainerPoints = null;
                creditCardItemViewHolder.blockContainer = null;
                creditCardItemViewHolder.imageBlock = null;
                creditCardItemViewHolder.textBlock = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CreditCardDetailViewPagerAdapter(Context context, List<chain> list, FragmentBuilder_BindBillPaymentFavouriteTargetFragment fragmentBuilder_BindBillPaymentFavouriteTargetFragment) {
        this.MediaBrowserCompat$SearchResultReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.write = context;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindBillPaymentFavouriteTargetFragment;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        chain chain = this.MediaBrowserCompat$ItemReceiver.get(i);
        CreditCardItemViewHolder creditCardItemViewHolder = new CreditCardItemViewHolder(this.MediaBrowserCompat$SearchResultReceiver.inflate(R.layout.f82482131493474, (ViewGroup) null));
        FragmentBuilder_BindDepositSelectorFragment.write(chain.MediaSessionCompat$ResultReceiverWrapper, (ImageView) creditCardItemViewHolder.creditCardImageView);
        if (this.IconCompatParcelizer == null) {
            creditCardItemViewHolder.creditCardImageView.post(new C7221landing(this, creditCardItemViewHolder));
        } else {
            creditCardItemViewHolder.blockContainer.setLayoutParams(this.IconCompatParcelizer);
            creditCardItemViewHolder.blockContainer.requestLayout();
        }
        creditCardItemViewHolder.tvName.setText(chain.setCheckable);
        creditCardItemViewHolder.tvNumber.setText(chain.f2806x50fd9e4a);
        creditCardItemViewHolder.tvFrontNumber.setText(chain.MediaBrowserCompat$SearchResultReceiver);
        creditCardItemViewHolder.tvSecondFrontNumber.setText(chain.MediaSessionCompat$QueueItem);
        creditCardItemViewHolder.points.setTag(chain.MediaDescriptionCompat);
        RelativeLayout relativeLayout = creditCardItemViewHolder.containerPoints;
        StringBuilder sb = new StringBuilder();
        sb.append("CREDIT_CARD_NUMBER");
        sb.append(chain.MediaDescriptionCompat);
        relativeLayout.setTag(sb.toString());
        RelativeLayout relativeLayout2 = creditCardItemViewHolder.errorContainerPoints;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREDIT_CARD_NUMBER_ERROR");
        sb2.append(chain.MediaDescriptionCompat);
        relativeLayout2.setTag(sb2.toString());
        FragmentBuilder_BindBillPaymentFavouriteTargetFragment fragmentBuilder_BindBillPaymentFavouriteTargetFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindBillPaymentFavouriteTargetFragment != null) {
            fragmentBuilder_BindBillPaymentFavouriteTargetFragment.MediaBrowserCompat$ItemReceiver(i);
        }
        boolean z = true;
        if (chain.setSplitBackground != 1) {
            z = false;
        }
        if (z) {
            creditCardItemViewHolder.giftIcon.setVisibility(0);
        } else {
            creditCardItemViewHolder.giftIcon.setVisibility(4);
        }
        creditCardItemViewHolder.pointLabel.setVisibility(0);
        creditCardItemViewHolder.pointLabel.setText(chain.setPadding);
        creditCardItemViewHolder.containerPoints.setOnClickListener(new postRemittanceAccounts(this, chain));
        if (this.read.MediaBrowserCompat$CustomActionResultReceiver(chain)) {
            creditCardItemViewHolder.blockContainer.setVisibility(0);
            String string = this.write.getString(R.string.credit_card_temporary_block_message);
            if (this.read.write(chain)) {
                if (chain.MediaBrowserCompat$MediaItem != null) {
                    string = chain.MediaBrowserCompat$MediaItem;
                } else {
                    string = this.write.getString(R.string.credit_card_block_message);
                }
            }
            creditCardItemViewHolder.textBlock.setText(string);
        } else {
            creditCardItemViewHolder.blockContainer.setVisibility(8);
        }
        viewGroup.addView(creditCardItemViewHolder.AlertController$RecycleListView, 0);
        return creditCardItemViewHolder.AlertController$RecycleListView;
    }

    public final void IconCompatParcelizer(isRequired isrequired) {
        for (chain next : this.MediaBrowserCompat$ItemReceiver) {
            if (next.MediaDescriptionCompat.equals(isrequired.MediaBrowserCompat$ItemReceiver)) {
                next.setGroupDividerEnabled = isrequired.MediaDescriptionCompat;
                next.IconCompatParcelizer = isrequired.MediaBrowserCompat$CustomActionResultReceiver;
                next.MediaBrowserCompat$ItemReceiver = isrequired.read;
                next.RatingCompat = isrequired.IconCompatParcelizer;
                return;
            }
        }
    }

    public static class CreditCardItemViewHolder extends RecyclerView.setContentView {
        View AlertController$RecycleListView;
        @BindView
        public RelativeLayout blockContainer;
        @BindView
        RelativeLayout containerPoints;
        @BindView
        public AdjustableImageView creditCardImageView;
        @BindView
        RelativeLayout errorContainerPoints;
        @BindView
        ImageView giftIcon;
        @BindView
        ImageView imageBlock;
        @BindView
        TextView pointLabel;
        @BindView
        TextView points;
        @BindView
        TextView textBlock;
        @BindView
        TextView tvFrontNumber;
        @BindView
        TextView tvName;
        @BindView
        TextView tvNumber;
        @BindView
        TextView tvSecondFrontNumber;

        CreditCardItemViewHolder(View view) {
            super(view);
            this.AlertController$RecycleListView = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
