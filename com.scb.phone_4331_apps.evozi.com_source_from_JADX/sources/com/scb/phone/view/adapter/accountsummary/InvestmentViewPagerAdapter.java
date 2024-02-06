package com.scb.phone.view.adapter.accountsummary;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.EasycashCommercialInfoRepositoryModule;
import p040o.EasycashFeatureAccountRepositoryModule;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.sendReports;

public final class InvestmentViewPagerAdapter extends onActivityCreated {
    private final List<sendReports> MediaBrowserCompat$CustomActionResultReceiver;
    private InvestmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private LayoutInflater read;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = viewHolder;
            viewHolder.mErrorDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_description, "field 'mErrorDescription'", TextView.class);
            viewHolder.mCardTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_card_title, "field 'mCardTitle'", TextView.class);
            viewHolder.mTotalBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_investment_total_balance_text_view, "field 'mTotalBalance'", TextView.class);
            viewHolder.mNetGain = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_investment_net_gain_text_view, "field 'mNetGain'", TextView.class);
            viewHolder.mLastUpdatedDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_investment_last_updated_date_text_view, "field 'mLastUpdatedDate'", TextView.class);
            viewHolder.mLastUpdatedDateTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_investment_last_updated_date_title, "field 'mLastUpdatedDateTitle'", TextView.class);
            viewHolder.mNetGainIndicator = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_investment_gain_indicator, "field 'mNetGainIndicator'", ImageView.class);
            viewHolder.investmentCardErrorLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.my_investment_card_error, "field 'investmentCardErrorLayout'", LinearLayout.class);
            viewHolder.investmentCardLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_investment_card_contents, "field 'investmentCardLayout'", LinearLayout.class);
            viewHolder.cardBg = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_card_bg, "field 'cardBg'", ImageView.class);
            viewHolder.investmentIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_investment_icon, "field 'investmentIcon'", ImageView.class);
        }

        public final void read() {
            ViewHolder viewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (viewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                viewHolder.mErrorDescription = null;
                viewHolder.mCardTitle = null;
                viewHolder.mTotalBalance = null;
                viewHolder.mNetGain = null;
                viewHolder.mLastUpdatedDate = null;
                viewHolder.mLastUpdatedDateTitle = null;
                viewHolder.mNetGainIndicator = null;
                viewHolder.investmentCardErrorLayout = null;
                viewHolder.investmentCardLayout = null;
                viewHolder.cardBg = null;
                viewHolder.investmentIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public InvestmentViewPagerAdapter(Context context, List<sendReports> list, InvestmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver investmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver) {
        this.read = (LayoutInflater) context.getSystemService("layout_inflater");
        this.MediaBrowserCompat$ItemReceiver = investmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        ViewHolder viewHolder = new ViewHolder(this.read.inflate(R.layout.f83052131493531, viewGroup, false));
        sendReports sendreports = this.MediaBrowserCompat$CustomActionResultReceiver.get(i);
        InvestmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver investmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        if (TextUtils.isEmpty(sendreports.read)) {
            viewHolder.investmentCardErrorLayout.setVisibility(8);
            viewHolder.investmentCardLayout.setVisibility(0);
            String str = sendreports.MediaMetadataCompat;
            if (str.length() > 18) {
                viewHolder.mTotalBalance.setTextSize(0, viewHolder.read.getResources().getDimension(R.dimen.f75372131165999));
            }
            viewHolder.mTotalBalance.setText(str);
            viewHolder.mNetGainIndicator.setImageResource(sendreports.IconCompatParcelizer);
            viewHolder.mNetGain.setTextColor(viewHolder.read.getResources().getColor(sendreports.MediaBrowserCompat$MediaItem));
            viewHolder.mNetGain.setText(sendreports.RatingCompat);
            viewHolder.mLastUpdatedDate.setText(sendreports.MediaBrowserCompat$ItemReceiver);
            viewHolder.mCardTitle.setText(sendreports.MediaBrowserCompat$SearchResultReceiver);
            Picasso.read().write(sendreports.MediaDescriptionCompat).read(viewHolder.investmentIcon, (FragmentBuilder_BindEkycFragment) null);
            if (sendreports.MediaSessionCompat$ResultReceiverWrapper == 0) {
                viewHolder.cardBg.setImageResource(R.drawable.bg_investment_card);
            } else {
                viewHolder.cardBg.setImageResource(R.drawable.bg_scbs_card);
            }
            if (sendreports.MediaBrowserCompat$CustomActionResultReceiver) {
                viewHolder.mLastUpdatedDateTitle.setVisibility(8);
                viewHolder.mLastUpdatedDate.setVisibility(8);
            }
            viewHolder.read.setOnClickListener(new EasycashFeatureAccountRepositoryModule(investmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver, sendreports));
        } else {
            viewHolder.investmentCardErrorLayout.setVisibility(0);
            viewHolder.investmentCardLayout.setVisibility(8);
            viewHolder.mErrorDescription.setText(sendreports.read);
            viewHolder.investmentCardErrorLayout.setOnClickListener(new EasycashCommercialInfoRepositoryModule(investmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver));
        }
        viewGroup.addView(viewHolder.read, 0);
        return viewHolder.read;
    }

    public static class ViewHolder {
        @BindView
        ImageView cardBg;
        @BindView
        LinearLayout investmentCardErrorLayout;
        @BindView
        LinearLayout investmentCardLayout;
        @BindView
        ImageView investmentIcon;
        @BindView
        TextView mCardTitle;
        @BindView
        TextView mErrorDescription;
        @BindView
        TextView mLastUpdatedDate;
        @BindView
        TextView mLastUpdatedDateTitle;
        @BindView
        TextView mNetGain;
        @BindView
        ImageView mNetGainIndicator;
        @BindView
        TextView mTotalBalance;
        final View read;

        public ViewHolder(View view) {
            this.read = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
