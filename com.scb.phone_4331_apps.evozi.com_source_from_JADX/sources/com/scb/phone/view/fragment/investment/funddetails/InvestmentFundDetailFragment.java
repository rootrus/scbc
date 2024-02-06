package com.scb.phone.view.fragment.investment.funddetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.investment.fundswitch.FundSwitchLandingActivity;
import com.scb.phone.view.activity.investment.purchase.FundPurchaseLandingActivity;
import com.scb.phone.view.activity.investment.redeem.FundRedeemLandingActivity;
import com.scb.phone.view.adapter.investment.funddetails.InvestmentDetailsFundListAdapter;
import com.scb.phone.view.custom.common.CustomFundsActions;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.DataCollectionArbiter;
import p040o.DataTransportState;
import p040o.FragmentBuilder_BindBilledTabFragment;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.HmlPinActivity;
import p040o.InstallIdProvider;
import p040o.MarshalByte;
import p040o.addBarCodeFoundEventListener;
import p040o.doBackgroundInitializationAsync;
import p040o.getCheckUsabilityData$MediaBrowserCompat$ItemReceiver;
import p040o.getCurrentTimeMillis;
import p040o.getOsDisplayVersionString;
import p040o.getTransferEligibleAmount;
import p040o.logException;
import p040o.logoutUser;
import p059me.relex.circleindicator.CircleIndicator;

public class InvestmentFundDetailFragment extends BaseFragment implements getCheckUsabilityData$MediaBrowserCompat$ItemReceiver, ViewPager.MediaMetadataCompat, FragmentBuilder_BindBilledTabFragment {
    private int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    CustomFundsActions customFundsActions;
    @HmlPinActivity
    public addBarCodeFoundEventListener investmentFundDetailsPresenter;
    @BindView
    LinearLayout ltfDividendContainer;
    @BindView
    LinearLayout ltfDividendFragmentContainer;
    @BindView
    TextView ltfDividendTitle;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    ImageView mExpandIcon;
    @BindView
    ViewGroup mLayoutExpanded;
    @BindView
    FragmentWrapContentViewPager mViewPager;
    @BindView
    NestedScrollView nestedScrollView;
    @BindView
    TabLayout tabLayout;
    @BindView
    FragmentWrapContentViewPager tabPager;

    public void onPageScrolled(int i, float f, int i2) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87552131493982, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.investmentFundDetailsPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.investment_fund_detail_title));
        setActionBarVisibilityCallback();
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = getActivity().getIntent().getIntExtra("SELECTED_FUND_LIST_POSITION", -1);
            this.IconCompatParcelizer = getActivity().getIntent().getIntExtra("SELECTED_CLIENT_LIST_POSITION", -1);
            doBackgroundInitializationAsync dobackgroundinitializationasync = (doBackgroundInitializationAsync) getActivity().getIntent().getParcelableExtra("INVESTMENT_DETAILS_CLIENT");
            addBarCodeFoundEventListener addbarcodefoundeventlistener = this.investmentFundDetailsPresenter;
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            addbarcodefoundeventlistener.IconCompatParcelizer = dobackgroundinitializationasync;
            addbarcodefoundeventlistener.read = i;
            if (dobackgroundinitializationasync != null) {
                MarshalByte marshalByte = new MarshalByte(dobackgroundinitializationasync, i);
                if (addbarcodefoundeventlistener.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    marshalByte.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
                }
            }
            addbarcodefoundeventlistener.MediaBrowserCompat$CustomActionResultReceiver(i);
            this.ltfDividendContainer.setVisibility(8);
        }
        this.customFundsActions.setOnCustomFundsActionsClickListener(this);
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public final void IconCompatParcelizer(doBackgroundInitializationAsync dobackgroundinitializationasync) {
        this.mViewPager.setAdapter(new InvestmentDetailsFundListAdapter(dobackgroundinitializationasync));
        this.mViewPager.addOnPageChangeListener(this);
        this.mViewPager.setClipToPadding(false);
        this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0, getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0);
        this.mViewPager.setOffscreenPageLimit(1);
        this.mCircleIndicator.setViewPager(this.mViewPager);
        this.mViewPager.setCurrentItem(this.MediaBrowserCompat$CustomActionResultReceiver);
        if (dobackgroundinitializationasync.MediaBrowserCompat$MediaItem.size() == 1 || dobackgroundinitializationasync.MediaBrowserCompat$MediaItem.size() >= 10) {
            this.mCircleIndicator.setVisibility(8);
        } else {
            this.mCircleIndicator.setVisibility(0);
        }
        this.customFundsActions.setButtonEnabled("BUTTON_PURCHASE", dobackgroundinitializationasync.MediaBrowserCompat$ItemReceiver);
        this.customFundsActions.setButtonEnabled("BUTTON_REDEEM", dobackgroundinitializationasync.MediaBrowserCompat$CustomActionResultReceiver);
        this.customFundsActions.setButtonEnabled("BUTTON_SWITCH", dobackgroundinitializationasync.read);
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.investment_fund_detail_title));
        setActionBarVisibilityCallback();
    }

    public final void IconCompatParcelizer(logException logexception) {
        if (logexception != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_FUND_DETAILS_SUMMARY");
            intent.putExtra("INVESTMENT_FUND_LIST", logexception);
            getContext().sendBroadcast(intent);
        }
    }

    @OnClick
    public void onLayoutCollapsedClick() {
        if (this.mLayoutExpanded.getVisibility() == 8) {
            FragmentBuilder_BindDeejungPlansFragment.write(this.mLayoutExpanded);
            this.mExpandIcon.setImageResource(R.drawable.ic_expand_less_black_24dp);
            return;
        }
        this.mExpandIcon.setImageResource(R.drawable.ic_expand_more_black_24dp);
        FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.mLayoutExpanded);
    }

    public void onDestroy() {
        this.investmentFundDetailsPresenter.onDestroy();
        super.onDestroy();
    }

    public void onPageSelected(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            addBarCodeFoundEventListener addbarcodefoundeventlistener = this.investmentFundDetailsPresenter;
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            addbarcodefoundeventlistener.read = i2;
            logoutUser logoutuser = new logoutUser(addbarcodefoundeventlistener, i2);
            if (addbarcodefoundeventlistener.RatingCompat != null) {
                logoutuser.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FundPurchaseLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), this.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$ItemReceiver(InstallIdProvider installIdProvider) {
        FundPurchaseLandingActivity.IconCompatParcelizer(getContext(), installIdProvider, this.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FundRedeemLandingActivity.write(getContext(), this.IconCompatParcelizer);
    }

    public final void write(getOsDisplayVersionString getosdisplayversionstring) {
        FundRedeemLandingActivity.MediaBrowserCompat$ItemReceiver(getContext(), getosdisplayversionstring, this.IconCompatParcelizer);
    }

    public final void write(DataTransportState dataTransportState) {
        FundSwitchLandingActivity.write(getContext(), dataTransportState, this.IconCompatParcelizer);
    }

    public final void read() {
        FundSwitchLandingActivity.read(getContext(), this.IconCompatParcelizer);
    }

    public final void IconCompatParcelizer() {
        this.ltfDividendContainer.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<DataCollectionArbiter> list, String str) {
        this.ltfDividendContainer.setVisibility(0);
        this.tabLayout.setVisibility(8);
        this.tabPager.setVisibility(8);
        this.ltfDividendFragmentContainer.setVisibility(0);
        this.ltfDividendTitle.setVisibility(0);
        this.ltfDividendTitle.setText(R.string.ltf_summary);
        getChildFragmentManager().read().IconCompatParcelizer(R.id.ltf_dividend_fragment_container, LtfTabFragment.read(list, str), getString(R.string.ltf_summary)).write();
    }

    public final void IconCompatParcelizer(List<DataCollectionArbiter> list, String str) {
        this.ltfDividendContainer.setVisibility(0);
        this.tabLayout.setVisibility(8);
        this.tabPager.setVisibility(8);
        this.ltfDividendFragmentContainer.setVisibility(0);
        this.ltfDividendTitle.setVisibility(0);
        this.ltfDividendTitle.setText(R.string.ssf_summary);
        getChildFragmentManager().read().IconCompatParcelizer(R.id.ltf_dividend_fragment_container, LtfTabFragment.read(list, str), getString(R.string.ssf_summary)).write();
    }

    public final void read(List<getCurrentTimeMillis> list) {
        this.ltfDividendContainer.setVisibility(0);
        this.tabLayout.setVisibility(8);
        this.tabPager.setVisibility(8);
        this.ltfDividendFragmentContainer.setVisibility(0);
        this.ltfDividendTitle.setVisibility(0);
        this.ltfDividendTitle.setText(R.string.dividend);
        getChildFragmentManager().read().IconCompatParcelizer(R.id.ltf_dividend_fragment_container, DividendTabFragment.IconCompatParcelizer(list), getString(R.string.dividend)).write();
    }

    public final void IconCompatParcelizer(List<DataCollectionArbiter> list, List<getCurrentTimeMillis> list2, String str) {
        this.ltfDividendContainer.setVisibility(0);
        this.ltfDividendFragmentContainer.setVisibility(8);
        this.ltfDividendTitle.setVisibility(8);
        this.tabLayout.setVisibility(0);
        this.tabPager.setVisibility(0);
        this.tabPager.setAdapter(new getTransferEligibleAmount(getFragmentManager(), getContext(), list, list2, str, addBarCodeFoundEventListener.write(str)));
        this.tabLayout.setupWithViewPager(this.tabPager);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = -1477774519(0xffffffffa7eaf349, float:-6.5211817E-15)
            if (r0 == r4) goto L_0x002a
            r4 = -1432358687(0xffffffffaa9ff0e1, float:-2.8411217E-13)
            if (r0 == r4) goto L_0x0020
            r4 = -278559890(0xffffffffef65836e, float:-7.1030956E28)
            if (r0 != r4) goto L_0x0034
            java.lang.String r0 = "BUTTON_PURCHASE"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = r3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "BUTTON_SWITCH"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = r1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "BUTTON_REDEEM"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = r2
            goto L_0x0035
        L_0x0034:
            r6 = -1
        L_0x0035:
            if (r6 == 0) goto L_0x00a0
            if (r6 == r2) goto L_0x006e
            if (r6 != r1) goto L_0x00d3
            o.addBarCodeFoundEventListener r6 = r5.investmentFundDetailsPresenter
            int r0 = r5.MediaBrowserCompat$CustomActionResultReceiver
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r2 = r3
        L_0x0045:
            if (r2 == 0) goto L_0x004c
            T r1 = r6.RatingCompat
            r1.AlertController$RecycleListView()
        L_0x004c:
            r6.read = r0
            o.EmptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver r0 = new o.EmptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver
            r0.<init>()
            o.doBackgroundInitializationAsync r1 = r6.IconCompatParcelizer
            java.lang.String r1 = r1.IconCompatParcelizer
            r0.read = r1
            o.StreetViewPanoramaLink r1 = r6.MediaBrowserCompat$ItemReceiver
            o.EmptyImmutableSetMultimap r2 = new o.EmptyImmutableSetMultimap
            r2.<init>(r0, r3)
            r1.IconCompatParcelizer((p040o.EmptyImmutableSetMultimap) r2)
            o.StreetViewPanoramaLink r0 = r6.MediaBrowserCompat$ItemReceiver
            o.addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver r1 = new o.addBarCodeFoundEventListener$MediaBrowserCompat$ItemReceiver
            r1.<init>(r6, r3)
            r0.IconCompatParcelizer(r1)
            return
        L_0x006e:
            o.addBarCodeFoundEventListener r6 = r5.investmentFundDetailsPresenter
            int r0 = r5.MediaBrowserCompat$CustomActionResultReceiver
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r2 = r3
        L_0x0078:
            if (r2 == 0) goto L_0x007f
            T r1 = r6.RatingCompat
            r1.AlertController$RecycleListView()
        L_0x007f:
            r6.read = r0
            o.StreetViewPanoramaLink r0 = r6.MediaBrowserCompat$ItemReceiver
            o.EmptyImmutableMap$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.EmptyImmutableMap.IconCompatParcelizer()
            o.doBackgroundInitializationAsync r2 = r6.IconCompatParcelizer
            java.lang.String r2 = r2.IconCompatParcelizer
            r1.write = r2
            o.EmptyImmutableMap r2 = new o.EmptyImmutableMap
            r2.<init>(r1, r3)
            r0.IconCompatParcelizer((p040o.EmptyImmutableMap) r2)
            o.StreetViewPanoramaLink r0 = r6.MediaBrowserCompat$ItemReceiver
            o.addBarCodeFoundEventListener$IconCompatParcelizer r1 = new o.addBarCodeFoundEventListener$IconCompatParcelizer
            r1.<init>(r6, r3)
            r0.IconCompatParcelizer(r1)
            return
        L_0x00a0:
            o.addBarCodeFoundEventListener r6 = r5.investmentFundDetailsPresenter
            int r0 = r5.MediaBrowserCompat$CustomActionResultReceiver
            T r1 = r6.RatingCompat
            if (r1 == 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r2 = r3
        L_0x00aa:
            if (r2 == 0) goto L_0x00b1
            T r1 = r6.RatingCompat
            r1.AlertController$RecycleListView()
        L_0x00b1:
            r6.read = r0
            o.StreetViewPanoramaLink r0 = r6.MediaBrowserCompat$ItemReceiver
            o.EmptyImmutableList$1$MediaBrowserCompat$ItemReceiver r1 = p040o.EmptyImmutableList.C97281.read()
            o.doBackgroundInitializationAsync r2 = r6.IconCompatParcelizer
            java.lang.String r2 = r2.IconCompatParcelizer
            r1.read = r2
            o.EmptyImmutableList$1 r2 = new o.EmptyImmutableList$1
            r2.<init>(r1, r3)
            java.lang.String r1 = ""
            r0.write(r2, r1)
            o.StreetViewPanoramaLink r0 = r6.MediaBrowserCompat$ItemReceiver
            o.addBarCodeFoundEventListener$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.addBarCodeFoundEventListener$MediaBrowserCompat$CustomActionResultReceiver
            r1.<init>(r6, r3)
            r0.IconCompatParcelizer(r1)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.funddetails.InvestmentFundDetailFragment.write(java.lang.String):void");
    }
}
