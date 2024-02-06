package com.scb.phone.view.fragment.investment.fundswitch;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.FundActionsSearchActivity;
import com.scb.phone.view.activity.investment.FundFactSheetActivity;
import com.scb.phone.view.activity.investment.assessment.QuestionnaireActivity;
import com.scb.phone.view.adapter.investment.FundClientListAdapter;
import com.scb.phone.view.custom.common.CustomFundSelect;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.investment.BaseScheduleFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.math.BigDecimal;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ActivityBuilder_BindMoneyOutActivity;
import p040o.ActivityBuilder_BindMutualFundTermsAndConditionsActivity;
import p040o.CheckParameters_Factory;
import p040o.CrashlyticsCore;
import p040o.DataTransportState;
import p040o.DeliveryMechanism;
import p040o.ExecutorUtils;
import p040o.FragmentBuilder_BindBulkTransferGroupsFragment;
import p040o.FragmentBuilder_BindCCTermsAndConditionsFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.acceptCardlessTnc;
import p040o.determineFrom;
import p040o.doBackgroundInitializationAsync;
import p040o.getDestination;
import p040o.getICheckDeserializerRtti;
import p040o.isProximityOn;
import p040o.markInitializationComplete;
import p040o.removeIfFromRandomAccessList;
import p040o.setGuidingLine;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.waitForAutomaticDataCollectionEnabled;
import p059me.relex.circleindicator.CircleIndicator;

public class FundSwitchLandingFragment extends BaseScheduleFragment<setGuidingLine> implements ViewPager.MediaMetadataCompat, CheckParameters_Factory, FragmentBuilder_BindBulkTransferGroupsFragment, FragmentBuilder_BindCCTermsAndConditionsFragment {
    private double IconCompatParcelizer;
    private FundClientListAdapter MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver = false;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private waitForAutomaticDataCollectionEnabled f3088x50fd9e4a;
    /* access modifiers changed from: private */
    public acceptCardlessTnc MediaDescriptionCompat;
    private List<doBackgroundInitializationAsync> MediaMetadataCompat;
    private BigDecimal MediaSessionCompat$QueueItem = new BigDecimal(0);
    private int MediaSessionCompat$ResultReceiverWrapper;
    private DataTransportState MediaSessionCompat$Token;
    private String ParcelableVolumeInfo;
    private String RatingCompat;
    @BindView
    DefaultButton buttonReview;
    @BindView
    TextView fundSelectTitle;
    @BindView
    CustomFundSelect fundSwitchIn;
    @HmlPinActivity
    public setGuidingLine fundSwitchLandingPresenter;
    @BindView
    CustomFundSelect fundSwitchOut;
    @BindView
    CircleIndicator mCircleIndicator;
    @BindView
    LinearLayout mFundPayContainer;
    @BindView
    NoSwipeViewPager mViewPager;
    @BindView
    NestedScrollView nestedScrollView;
    @BindView
    TabLayout tabLayout;
    @BindView
    FragmentWrapContentViewPager tabPager;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89272131494154, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.fundSwitchLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        setGuidingLine setguidingline = this.fundSwitchLandingPresenter;
        if (setguidingline.RatingCompat != null) {
            setguidingline.RatingCompat.AlertController$RecycleListView();
        }
        setguidingline.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        setguidingline.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setGuidingLine.write(setguidingline, (byte) 0));
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            this.MediaSessionCompat$ResultReceiverWrapper = getActivity().getIntent().getIntExtra("SELECTED_CLIENT_LIST_POSITION", 0);
        }
        this.fundSwitchIn.setVisibility(0);
        this.fundSelectTitle.setText(R.string.mf_switch_input_3);
        this.fundSwitchOut.setFundTitle(R.string.mf_switch_input_4);
        this.fundSwitchOut.setFundCode(getResources().getString(R.string.mf_switch_input_5));
        this.fundSwitchOut.setOnFundSelectClickListener(this);
        this.fundSwitchIn.topDivider.setVisibility(8);
        this.fundSwitchIn.setFundTitle(R.string.mf_switch_input_6);
        this.fundSwitchIn.setFundCode(getResources().getString(R.string.mf_switch_input_7));
        this.fundSwitchIn.setOnFundSelectClickListener(this);
        this.fundSwitchIn.setEnableFund(false);
        this.mViewPager.addOnPageChangeListener(this);
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.mf_switch_input_1));
        setActionBarVisibilityCallback();
        write();
        MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("mfschedule_switch");
        }
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.mf_switch_input_1));
        setActionBarVisibilityCallback();
    }

    private void write() {
        this.tabLayout.setVisibility(0);
        this.tabPager.setVisibility(0);
        acceptCardlessTnc acceptcardlesstnc = new acceptCardlessTnc(getChildFragmentManager(), getContext(), this, (byte) 0);
        this.MediaDescriptionCompat = acceptcardlesstnc;
        DataTransportState dataTransportState = this.MediaSessionCompat$Token;
        if (dataTransportState != null) {
            acceptcardlesstnc.MediaBrowserCompat$CustomActionResultReceiver(dataTransportState.MediaBrowserCompat$ItemReceiver, this.MediaSessionCompat$Token.read, this.MediaSessionCompat$Token.MediaMetadataCompat, (String) null, (String) null);
            this.MediaDescriptionCompat.notifyDataSetChanged();
        }
        this.tabPager.setAdapter(this.MediaDescriptionCompat);
        this.tabPager.setOffscreenPageLimit(3);
        this.tabPager.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                FundSwitchLandingFragment.this.MediaDescriptionCompat.IconCompatParcelizer = i;
                FundSwitchLandingFragment.this.MediaBrowserCompat$CustomActionResultReceiver();
            }
        });
        this.tabLayout.setupWithViewPager(this.tabPager);
        DataTransportState dataTransportState2 = this.MediaSessionCompat$Token;
        if (dataTransportState2 != null && "0".equals(dataTransportState2.IconCompatParcelizer) && DiskLruCache.VERSION_1.equals(this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver)) {
            ((ViewGroup) this.tabLayout.getChildAt(0)).getChildAt(0).setVisibility(8);
            TabLayout.IconCompatParcelizer IconCompatParcelizer2 = this.tabLayout.IconCompatParcelizer(1);
            TabLayout tabLayout2 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver;
            if (tabLayout2 != null) {
                tabLayout2.write(IconCompatParcelizer2, true);
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        DataTransportState dataTransportState3 = this.MediaSessionCompat$Token;
        if (dataTransportState3 != null && DiskLruCache.VERSION_1.equals(dataTransportState3.IconCompatParcelizer) && "0".equals(this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver)) {
            ((ViewGroup) this.tabLayout.getChildAt(0)).getChildAt(1).setVisibility(8);
            this.tabLayout.IconCompatParcelizer(0).IconCompatParcelizer();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.buttonReview.setButtonEnabled(false);
        if (this.MediaSessionCompat$Token != null && this.f3088x50fd9e4a != null) {
            if (this.IconCompatParcelizer > 0.0d || this.MediaSessionCompat$QueueItem.doubleValue() > 0.0d || this.MediaDescriptionCompat.IconCompatParcelizer == 2) {
                this.buttonReview.setButtonEnabled(true);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(View view) {
        DataTransportState dataTransportState;
        int i = this.MediaSessionCompat$ResultReceiverWrapper;
        List<doBackgroundInitializationAsync> list = this.MediaMetadataCompat;
        if (!(list != null && list.size() > i)) {
            return;
        }
        if (view.equals(this.fundSwitchOut)) {
            this.fundSwitchLandingPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat.get(this.MediaSessionCompat$ResultReceiverWrapper).IconCompatParcelizer);
        } else if (view.equals(this.fundSwitchIn) && (dataTransportState = this.MediaSessionCompat$Token) != null) {
            this.fundSwitchLandingPresenter.IconCompatParcelizer(dataTransportState.MediaDescriptionCompat);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 7003) {
            if (i2 == -1) {
                this.MediaSessionCompat$Token = (DataTransportState) intent.getParcelableExtra("com.scb.phone.SWITCH_FUND_SEARCH_SELECTED");
                MediaBrowserCompat$ItemReceiver();
                this.MediaBrowserCompat$SearchResultReceiver = true;
                write();
                this.MediaSessionCompat$QueueItem = new BigDecimal(0);
                this.IconCompatParcelizer = 0.0d;
                Intent intent2 = new Intent();
                intent2.setAction("BROADCAST_CLEAR_AMOUNT");
                getContext().sendBroadcast(intent2);
                MediaBrowserCompat$CustomActionResultReceiver();
                CustomFundSelect customFundSelect = this.fundSwitchIn;
                customFundSelect.setFundCode(getResources().getString(R.string.mf_switch_input_7));
                customFundSelect.fundInfo.setVisibility(8);
                customFundSelect.description.setVisibility(8);
                this.f3088x50fd9e4a = null;
                this.fundSwitchIn.setEnableFund(true);
            }
        } else if (i == 7004 && i2 == -1) {
            waitForAutomaticDataCollectionEnabled waitforautomaticdatacollectionenabled = (waitForAutomaticDataCollectionEnabled) intent.getParcelableExtra("com.scb.phone.SWITCH_FUND_SEARCH_SELECTED");
            this.f3088x50fd9e4a = waitforautomaticdatacollectionenabled;
            CustomFundSelect customFundSelect2 = this.fundSwitchIn;
            String str = waitforautomaticdatacollectionenabled.RatingCompat;
            String str2 = this.f3088x50fd9e4a.read;
            customFundSelect2.setFundCode(str);
            customFundSelect2.description.setVisibility(0);
            customFundSelect2.setDescription(str2);
            this.MediaSessionCompat$QueueItem = new BigDecimal(0);
            this.IconCompatParcelizer = 0.0d;
            Intent intent3 = new Intent();
            intent3.setAction("BROADCAST_CLEAR_AMOUNT");
            getContext().sendBroadcast(intent3);
            this.MediaBrowserCompat$SearchResultReceiver = true;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = "page_switch";
            super.onActivityResult(i, i2, intent);
        }
    }

    private void MediaBrowserCompat$ItemReceiver() {
        CustomFundSelect customFundSelect = this.fundSwitchOut;
        String str = this.MediaSessionCompat$Token.MediaSessionCompat$ResultReceiverWrapper;
        String str2 = this.MediaSessionCompat$Token.MediaBrowserCompat$MediaItem;
        customFundSelect.setFundCode(str);
        customFundSelect.description.setVisibility(0);
        customFundSelect.setDescription(str2);
    }

    public void onResume() {
        super.onResume();
        if (!(getActivity() == null || getActivity().getIntent() == null || !DiskLruCache.VERSION_1.equals(getActivity().getIntent().getStringExtra("SELECTED_CLIENT_LIST_POSITION")))) {
            CustomFundSelect customFundSelect = this.fundSwitchOut;
            customFundSelect.setFundCode(getResources().getString(R.string.mf_switch_input_5));
            customFundSelect.fundInfo.setVisibility(8);
            customFundSelect.description.setVisibility(8);
            this.MediaSessionCompat$Token = null;
            CustomFundSelect customFundSelect2 = this.fundSwitchIn;
            customFundSelect2.setFundCode(getResources().getString(R.string.mf_switch_input_7));
            customFundSelect2.fundInfo.setVisibility(8);
            customFundSelect2.description.setVisibility(8);
            this.f3088x50fd9e4a = null;
            CustomFundSelect customFundSelect3 = this.fundSwitchOut;
            customFundSelect3.setFundCode(getResources().getString(R.string.mf_switch_input_5));
            customFundSelect3.fundInfo.setVisibility(8);
            customFundSelect3.description.setVisibility(8);
            this.MediaSessionCompat$Token = null;
            write();
            this.MediaSessionCompat$QueueItem = new BigDecimal(0);
            this.IconCompatParcelizer = 0.0d;
            Intent intent = new Intent();
            intent.setAction("BROADCAST_CLEAR_AMOUNT");
            getContext().sendBroadcast(intent);
            MediaBrowserCompat$CustomActionResultReceiver();
            getActivity().setIntent((Intent) null);
        }
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            this.MediaBrowserCompat$SearchResultReceiver = false;
            MediaBrowserCompat$CustomActionResultReceiver();
            write();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        this.IconCompatParcelizer = d;
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void read(BigDecimal bigDecimal) {
        this.MediaSessionCompat$QueueItem = bigDecimal;
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    @OnClick
    public void onReviewButtonClick() {
        PlaybackStateCompat$CustomAction();
        int i = this.MediaDescriptionCompat.IconCompatParcelizer;
        if (i != 0) {
            if (i == 1) {
                this.ParcelableVolumeInfo = "U";
            } else if (i == 2) {
                DataTransportState dataTransportState = this.MediaSessionCompat$Token;
                if (dataTransportState != null) {
                    this.MediaSessionCompat$QueueItem = getICheckDeserializerRtti.ParcelableVolumeInfo(dataTransportState.read);
                }
                this.ParcelableVolumeInfo = "U";
            }
            this.fundSwitchLandingPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat, this.MediaSessionCompat$Token, this.f3088x50fd9e4a, this.ParcelableVolumeInfo, removeIfFromRandomAccessList.read(this.IconCompatParcelizer), getICheckDeserializerRtti.IconCompatParcelizer(this.MediaSessionCompat$QueueItem.doubleValue()));
        }
        this.ParcelableVolumeInfo = "A";
        this.fundSwitchLandingPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat, this.MediaSessionCompat$Token, this.f3088x50fd9e4a, this.ParcelableVolumeInfo, removeIfFromRandomAccessList.read(this.IconCompatParcelizer), getICheckDeserializerRtti.IconCompatParcelizer(this.MediaSessionCompat$QueueItem.doubleValue()));
    }

    public final void IconCompatParcelizer(DeliveryMechanism deliveryMechanism) {
        Intent intent = new Intent(getContext(), FundActionsSearchActivity.class);
        intent.putExtra("com.scb.phone.FUND_ACTION_INDICATOR", "FUND_ACTION_SWITCH_OUT");
        intent.putExtra("com.scb.phone.ARGS_FUND_SEARCH_DATA", deliveryMechanism);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 7003);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(determineFrom determinefrom) {
        Intent intent = new Intent(getContext(), FundActionsSearchActivity.class);
        intent.putExtra("com.scb.phone.FUND_ACTION_INDICATOR", "FUND_ACTION_SWITCH_IN");
        intent.putExtra("com.scb.phone.ARGS_FUND_SEARCH_DATA", determinefrom);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 7004);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(ExecutorUtils.C33371 r5) {
        Context context = getContext();
        if (context != null) {
            Intent IconCompatParcelizer2 = QuestionnaireActivity.IconCompatParcelizer(context, getClass().getName(), r5, "mfschedule_switchinfundfact");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(IconCompatParcelizer2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(IconCompatParcelizer2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer(String str, String str2, isProximityOn isproximityon) {
        write(str, str2, R.string.ok, new ActivityBuilder_BindMoneyOutActivity(this, isproximityon));
    }

    public final void IconCompatParcelizer(ExecutorUtils.C33371 r5) {
        Context context = getContext();
        if (context != null) {
            Intent MediaBrowserCompat$ItemReceiver = FundFactSheetActivity.MediaBrowserCompat$ItemReceiver(context, r5.write(), r5, "mfschedule_switchinfundfact");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.MediaSessionCompat$QueueItem = new BigDecimal(0);
        this.IconCompatParcelizer = 0.0d;
        Intent intent = new Intent();
        intent.setAction("BROADCAST_CLEAR_AMOUNT");
        getContext().sendBroadcast(intent);
    }

    public final /* bridge */ /* synthetic */ getDestination MediaDescriptionCompat() {
        return this.fundSwitchLandingPresenter;
    }

    public void onPageSelected(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper = i;
        boolean z = true;
        int[] iArr = {i - 1, i, i + 1};
        int i2 = 0;
        while (true) {
            View view = null;
            if (i2 >= 3) {
                break;
            }
            int i3 = iArr[i2];
            NoSwipeViewPager noSwipeViewPager = this.mViewPager;
            if (noSwipeViewPager != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("TAG_PURCHASE_CLIENT_LIST_ADAPTER");
                sb.append(i3);
                view = noSwipeViewPager.findViewWithTag(sb.toString());
            }
            if (view != null) {
                if (i == i3) {
                    view.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.rounded_purple_view_pager));
                } else {
                    view.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.bg_white_rounded));
                }
            }
            i2++;
        }
        List<doBackgroundInitializationAsync> list = this.MediaMetadataCompat;
        if (list == null || list.size() <= i) {
            z = false;
        }
        if (z) {
            this.RatingCompat = this.MediaMetadataCompat.get(i).IconCompatParcelizer;
        } else {
            this.fundSwitchLandingPresenter.write((int) R.string.error_generic_resource);
        }
        FundClientListAdapter fundClientListAdapter = this.MediaBrowserCompat$MediaItem;
        if (fundClientListAdapter != null) {
            fundClientListAdapter.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
        CustomFundSelect customFundSelect = this.fundSwitchOut;
        customFundSelect.setFundCode(getResources().getString(R.string.mf_switch_input_5));
        customFundSelect.fundInfo.setVisibility(8);
        customFundSelect.description.setVisibility(8);
        this.MediaSessionCompat$Token = null;
        CustomFundSelect customFundSelect2 = this.fundSwitchIn;
        customFundSelect2.setFundCode(getResources().getString(R.string.mf_switch_input_7));
        customFundSelect2.fundInfo.setVisibility(8);
        customFundSelect2.description.setVisibility(8);
        this.f3088x50fd9e4a = null;
        CustomFundSelect customFundSelect3 = this.fundSwitchOut;
        customFundSelect3.setFundCode(getResources().getString(R.string.mf_switch_input_5));
        customFundSelect3.fundInfo.setVisibility(8);
        customFundSelect3.description.setVisibility(8);
        this.MediaSessionCompat$Token = null;
        write();
        this.MediaSessionCompat$QueueItem = new BigDecimal(0);
        this.IconCompatParcelizer = 0.0d;
        Intent intent = new Intent();
        intent.setAction("BROADCAST_CLEAR_AMOUNT");
        getContext().sendBroadcast(intent);
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaMetadataCompat() {
        CustomFundSelect customFundSelect = this.fundSwitchIn;
        customFundSelect.setFundCode(getResources().getString(R.string.mf_switch_input_7));
        customFundSelect.fundInfo.setVisibility(8);
        customFundSelect.description.setVisibility(8);
        this.f3088x50fd9e4a = null;
        CustomFundSelect customFundSelect2 = this.fundSwitchOut;
        customFundSelect2.setFundCode(getResources().getString(R.string.mf_switch_input_5));
        customFundSelect2.fundInfo.setVisibility(8);
        customFundSelect2.description.setVisibility(8);
        this.MediaSessionCompat$Token = null;
    }

    public final void IconCompatParcelizer(markInitializationComplete markinitializationcomplete) {
        List<doBackgroundInitializationAsync> list = markinitializationcomplete.MediaBrowserCompat$ItemReceiver;
        this.MediaMetadataCompat = list;
        if (list != null && list.size() > this.MediaSessionCompat$ResultReceiverWrapper) {
            int i = this.MediaSessionCompat$ResultReceiverWrapper;
            List<doBackgroundInitializationAsync> list2 = this.MediaMetadataCompat;
            FundClientListAdapter fundClientListAdapter = new FundClientListAdapter(getContext(), list2);
            this.MediaBrowserCompat$MediaItem = fundClientListAdapter;
            this.mViewPager.setAdapter(fundClientListAdapter);
            this.mViewPager.setClipToPadding(false);
            this.mViewPager.setPadding(getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0, getResources().getDimensionPixelOffset(R.dimen.f75562131166025), 0);
            this.mViewPager.setOffscreenPageLimit(1);
            this.mCircleIndicator.setViewPager(this.mViewPager);
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.mViewPager.setCurrentItem(i);
            if (list2.size() == 1 || list2.size() >= 10) {
                this.mCircleIndicator.setVisibility(8);
            } else {
                this.mCircleIndicator.setVisibility(0);
            }
            this.RatingCompat = list2.get(i).IconCompatParcelizer;
        } else {
            this.fundSwitchLandingPresenter.write((int) R.string.error_generic_resource);
        }
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            this.MediaSessionCompat$Token = (DataTransportState) getActivity().getIntent().getParcelableExtra("com.scb.phone.SWITCH_FUND_SEARCH_SELECTED");
        }
        if (this.MediaSessionCompat$Token != null) {
            MediaBrowserCompat$ItemReceiver();
            this.fundSwitchIn.setEnableFund(true);
            write();
            return;
        }
        this.fundSwitchOut.setFundCode(getResources().getString(R.string.mf_switch_input_5));
    }

    public final void write(ExecutorUtils.C33371 r4, CrashlyticsCore.C32462 r5) {
        write(r5.MediaBrowserCompat$CustomActionResultReceiver, r5.IconCompatParcelizer, r5.read.equals("P") ? R.string.proceed : R.string.ok, new ActivityBuilder_BindMutualFundTermsAndConditionsActivity(this, r4));
    }
}
