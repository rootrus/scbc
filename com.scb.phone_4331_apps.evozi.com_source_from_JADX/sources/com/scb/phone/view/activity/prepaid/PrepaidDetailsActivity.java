package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$MediaItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.DetailsTabHolder;
import com.scb.phone.view.activity.prepaid.cashout.PrepaidCashOutLandingAndInputActivity;
import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import com.scb.phone.view.activity.prepaid.reset.PrepaidResetPinSuccessActivity;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.WrapContentViewPager;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelDetailTabFragment;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelServicesTabFragment;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelWalletTabFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import java.util.Map;
import p040o.C7513tX;
import p040o.FragmentBuilder_BindCcSofTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindChubbReviewFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getCustomAttributes;
import p040o.getICheckDeserializerRtti;
import p040o.getKernelIDDstAtop;
import p040o.getModel;
import p040o.getModelClass;
import p040o.getSummary;
import p040o.getTileHeight;
import p040o.getTitleAnimationOrientation;
import p040o.isGeodesic;
import p040o.isSimulator;
import p040o.newState;
import p040o.onGetStartedClick;
import p040o.setCores;
import p040o.setSimulator;
import p040o.setTapText;
import p040o.setupDialog;
import p040o.show;
import p040o.tX$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.tX$MediaBrowserCompat$ItemReceiver;
import p040o.withKeyValueSeparator;
import p059me.relex.circleindicator.CircleIndicator;

public class PrepaidDetailsActivity extends BaseActivity implements tX$MediaBrowserCompat$CustomActionResultReceiver, NestedScrollView.IconCompatParcelizer, DetailsTabHolder.IconCompatParcelizer, FragmentBuilder_BindChubbReviewFragment, FragmentBuilder_BindCcSofTermsAndConditionsFragment, newState.IconCompatParcelizer {
    /* access modifiers changed from: private */
    public isSimulator AlertController$RecycleListView;
    private getSummary AppCompatActivity;
    private read AppCompatDelegateImpl$ListMenuDecorView;
    private getCustomAttributes AppCompatDialogFragment;
    private TabLayout$MediaBrowserCompat$ItemReceiver Keep = new TabLayout$MediaBrowserCompat$ItemReceiver() {
        public final void write(TabLayout.IconCompatParcelizer iconCompatParcelizer) {
            isSimulator MediaBrowserCompat$CustomActionResultReceiver = ((C7513tX.IconCompatParcelizer) PrepaidDetailsActivity.this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.get(PrepaidDetailsActivity.this.vpCard.getCurrentItem())).MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.contains("SHOW_TRAVEL_DETAILS")) {
                PrepaidDetailsActivity.this.MediaBrowserCompat$MediaItem.write(MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.read);
                WrapContentViewPager wrapContentViewPager = PrepaidDetailsActivity.this.vpPrepaidTravelContent;
                wrapContentViewPager.IconCompatParcelizer = iconCompatParcelizer.read;
                wrapContentViewPager.requestLayout();
                return;
            }
            WrapContentViewPager wrapContentViewPager2 = PrepaidDetailsActivity.this.vpPrepaidNormalContent;
            wrapContentViewPager2.IconCompatParcelizer = iconCompatParcelizer.read;
            wrapContentViewPager2.requestLayout();
        }
    };
    public tX$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem;
    private getModel MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public getModelClass MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public PrepaidCardAdapter MediaMetadataCompat;
    private getKernelIDDstAtop MediaSessionCompat$ResultReceiverWrapper;
    private ViewPager$MediaBrowserCompat$MediaItem MediaSessionCompat$Token = new ViewPager$MediaBrowserCompat$MediaItem() {
        public final void onPageSelected(int i) {
            isSimulator MediaBrowserCompat$ItemReceiver = PrepaidDetailsActivity.this.AlertController$RecycleListView;
            int unused = PrepaidDetailsActivity.this.setBackgroundResource = i;
            PrepaidDetailsActivity prepaidDetailsActivity = PrepaidDetailsActivity.this;
            isSimulator unused2 = prepaidDetailsActivity.AlertController$RecycleListView = ((C7513tX.IconCompatParcelizer) prepaidDetailsActivity.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.get(i)).MediaBrowserCompat$CustomActionResultReceiver();
            int i2 = 0;
            if (!PrepaidDetailsActivity.this.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver.contains("SHOW_TRAVEL_DETAILS")) {
                PrepaidDetailsActivity.this.MediaBrowserCompat$MediaItem.read(PrepaidDetailsActivity.this.AlertController$RecycleListView);
                PrepaidDetailsActivity.this.MediaBrowserCompat$MediaItem.write(((C7513tX.IconCompatParcelizer) PrepaidDetailsActivity.this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.get(i)).MediaBrowserCompat$CustomActionResultReceiver().RatingCompat, (String) null, 0);
            } else if (!MediaBrowserCompat$ItemReceiver.f2878x50fd9e4a.equals(PrepaidDetailsActivity.this.AlertController$RecycleListView.f2878x50fd9e4a)) {
                PrepaidDetailsActivity.this.vpPrepaidTravelContent.setCurrentItem(0);
            } else {
                i2 = PrepaidDetailsActivity.this.vpPrepaidTravelContent.getCurrentItem();
            }
            PrepaidDetailsActivity.this.MediaBrowserCompat$MediaItem.write(PrepaidDetailsActivity.this.AlertController$RecycleListView, i2);
            PrepaidDetailsActivity.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(PrepaidDetailsActivity.this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver);
        }
    };
    private setCores PlaybackStateCompat;
    private read PlaybackStateCompat$CustomAction;
    @BindView
    AppCompatButton btnPrepaidTravelTopup;
    @BindView
    AppCompatButton btnPrepaidTravelTransfer;
    @BindView
    Button btnTopUp;
    @BindView
    CircleIndicator indicator;
    @BindView
    CustomTabLayout normalPrepaidTab;
    @BindView
    View normalTravelView;
    @BindView
    View prepaidTravelView;
    @BindView
    View rootTravelTopup;
    @BindView
    NestedScrollView scrollView;
    /* access modifiers changed from: private */
    public int setBackgroundResource = 0;
    private read setContentView;
    private newState setHasDecor;
    @BindView
    CustomTabLayout travelPrepaidTab;
    @BindView
    TextView tvBalanceLabel;
    @BindView
    TextView tvBalanceValue;
    @BindView
    ViewPager vpCard;
    @BindView
    WrapContentViewPager vpPrepaidNormalContent;
    @BindView
    WrapContentViewPager vpPrepaidTravelContent;

    public interface read {
        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        void mo15128x50fd9e4a();

        void read(isSimulator issimulator);
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, getModelClass getmodelclass, isSimulator issimulator, int i) {
        return new Intent(context, PrepaidDetailsActivity.class).putExtra("EXTRA_SUMMARY", getmodelclass).putExtra("EXTRA_SELECTED_CARD", issimulator).putExtra("EXTRA_SELECTED_CARD_POSITION", i);
    }

    public static Intent read(Context context) {
        return new Intent(context, PrepaidDetailsActivity.class).addFlags(603979776);
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, PrepaidDetailsActivity.class).addFlags(603979776).putExtra("EXTRA_REFRESH_WALLET", true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79352131493160);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.prepaid_details_title);
        setTabContainer();
        Intent intent = getIntent();
        this.AlertController$RecycleListView = (isSimulator) intent.getParcelableExtra("EXTRA_SELECTED_CARD");
        this.setBackgroundResource = intent.getExtras().getInt("EXTRA_SELECTED_CARD_POSITION", 0);
        getModelClass getmodelclass = (getModelClass) intent.getParcelableExtra("EXTRA_SUMMARY");
        this.MediaDescriptionCompat = getmodelclass;
        PrepaidCardAdapter prepaidCardAdapter = new PrepaidCardAdapter(getmodelclass.MediaBrowserCompat$ItemReceiver);
        this.MediaMetadataCompat = prepaidCardAdapter;
        this.vpCard.setAdapter(prepaidCardAdapter);
        this.vpCard.addOnPageChangeListener(this.MediaSessionCompat$Token);
        this.vpCard.setClipToPadding(false);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (((float) displayMetrics.widthPixels) * 0.06f);
        this.vpCard.setPadding(i, 0, i, 0);
        this.vpCard.setOffscreenPageLimit(1);
        this.MediaBrowserCompat$MediaItem.write((tX$MediaBrowserCompat$CustomActionResultReceiver) this);
        this.scrollView.setOnScrollChangeListener(this);
        this.MediaSessionCompat$ResultReceiverWrapper = new getKernelIDDstAtop();
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat, this.AlertController$RecycleListView, this.setBackgroundResource);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.setHasDecor == null) {
            newState newstate = new newState(this.MediaDescriptionCompat, this, this, this);
            this.setHasDecor = newstate;
            this.vpPrepaidNormalContent.setAdapter(newstate);
            this.normalPrepaidTab.setupWithViewPager(this.vpPrepaidNormalContent);
            this.normalPrepaidTab.addOnTabSelectedListener(this.Keep);
        }
    }

    public final void write() {
        if (this.AppCompatActivity == null) {
            getSummary getsummary = new getSummary(getSupportFragmentManager(), this, this.AlertController$RecycleListView, this.MediaDescriptionCompat);
            this.AppCompatActivity = getsummary;
            this.vpPrepaidTravelContent.setAdapter(getsummary);
            this.vpPrepaidTravelContent.setOffscreenPageLimit(3);
            this.travelPrepaidTab.setupWithViewPager(this.vpPrepaidTravelContent);
            this.travelPrepaidTab.addOnTabSelectedListener(this.Keep);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        boolean booleanExtra = intent.getBooleanExtra("EXTRA_REFRESH_WALLET", false);
        read read2 = this.setContentView;
        if (read2 != null && booleanExtra) {
            read2.read(this.AlertController$RecycleListView);
        }
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof PrepaidTravelWalletTabFragment) {
            PrepaidTravelWalletTabFragment prepaidTravelWalletTabFragment = (PrepaidTravelWalletTabFragment) fragment;
            this.setContentView = prepaidTravelWalletTabFragment;
            isSimulator issimulator = this.AlertController$RecycleListView;
            if (prepaidTravelWalletTabFragment != null) {
                prepaidTravelWalletTabFragment.read(issimulator);
            }
        } else if (fragment instanceof PrepaidTravelDetailTabFragment) {
            this.PlaybackStateCompat$CustomAction = (read) fragment;
        } else if (fragment instanceof PrepaidTravelServicesTabFragment) {
            this.AppCompatDelegateImpl$ListMenuDecorView = (PrepaidTravelServicesTabFragment) fragment;
        }
    }

    public final void write(isSimulator issimulator) {
        read read2 = this.setContentView;
        if (read2 != null) {
            read2.read(issimulator);
        }
    }

    public final void IconCompatParcelizer(isSimulator issimulator) {
        read read2 = this.PlaybackStateCompat$CustomAction;
        if (read2 != null) {
            read2.read(issimulator);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(isSimulator issimulator) {
        read read2 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (read2 != null) {
            read2.read(issimulator);
        }
    }

    public final void read(List<C7513tX.IconCompatParcelizer> list) {
        PrepaidCardAdapter prepaidCardAdapter = this.MediaMetadataCompat;
        prepaidCardAdapter.MediaBrowserCompat$CustomActionResultReceiver = list;
        prepaidCardAdapter.notifyDataSetChanged();
        this.vpCard.setCurrentItem(this.setBackgroundResource);
        if (list.size() >= 10) {
            this.indicator.setViewPager((ViewPager) null);
            this.indicator.setVisibility(8);
            return;
        }
        this.indicator.setViewPager(this.vpCard);
        this.indicator.setVisibility(0);
    }

    public final void write(String str) {
        this.tvBalanceValue.setText(String.format("%s %s", new Object[]{str, getString(R.string.prepaid_baht)}));
    }

    public final void MediaBrowserCompat$ItemReceiver(setCores setcores) {
        boolean z;
        this.PlaybackStateCompat = setcores;
        newState newstate = this.setHasDecor;
        List<setSimulator> list = setcores.MediaBrowserCompat$CustomActionResultReceiver;
        newstate.MediaBrowserCompat$CustomActionResultReceiver = list;
        DetailsTabHolder detailsTabHolder = newstate.write;
        if (detailsTabHolder != null) {
            detailsTabHolder.read(list);
        }
        DetailsTabHolder detailsTabHolder2 = this.setHasDecor.write;
        if (detailsTabHolder2 != null) {
            z = detailsTabHolder2.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
        } else {
            z = false;
        }
        if (z) {
            this.setHasDecor.write.MediaBrowserCompat$MediaItem.write(false);
        }
    }

    public final void IconCompatParcelizer(isSimulator issimulator, withKeyValueSeparator.IconCompatParcelizer iconCompatParcelizer) {
        this.setHasDecor.IconCompatParcelizer = issimulator;
        newState newstate = this.setHasDecor;
        PointTabHolder pointTabHolder = newstate.MediaBrowserCompat$ItemReceiver;
        if (pointTabHolder != null) {
            getModelClass getmodelclass = newstate.read;
            isSimulator issimulator2 = newstate.IconCompatParcelizer;
            if (iconCompatParcelizer.read != null || iconCompatParcelizer.IconCompatParcelizer == null) {
                pointTabHolder.tvYouHave.setVisibility(0);
                pointTabHolder.layoutPointValue.setVisibility(0);
                pointTabHolder.tvUnable.setVisibility(8);
                isGeodesic isgeodesic = iconCompatParcelizer.read;
                String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(isgeodesic.MediaMetadataCompat).doubleValue());
                pointTabHolder.tvPointValue.setText(MediaBrowserCompat$CustomActionResultReceiver);
                pointTabHolder.tvPointLabel.setText(issimulator2.MediaSessionCompat$ResultReceiverWrapper);
                if ("0".equals(MediaBrowserCompat$CustomActionResultReceiver)) {
                    pointTabHolder.tvRemark.setVisibility(8);
                    return;
                }
                pointTabHolder.tvRemark.setVisibility(0);
                String MediaBrowserCompat$CustomActionResultReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(isgeodesic.write).doubleValue());
                StringBuilder sb = new StringBuilder();
                sb.append(pointTabHolder.MediaBrowserCompat$CustomActionResultReceiver.getContext().getString(R.string.prepaid_message_m_card, new Object[]{MediaBrowserCompat$CustomActionResultReceiver2, issimulator2.MediaSessionCompat$ResultReceiverWrapper, isgeodesic.MediaBrowserCompat$ItemReceiver}));
                sb.append("\n");
                sb.append(pointTabHolder.MediaBrowserCompat$CustomActionResultReceiver.getContext().getString(R.string.prepaid_point_m_card));
                pointTabHolder.tvRemark.setText(sb.toString());
                return;
            }
            pointTabHolder.tvYouHave.setVisibility(8);
            pointTabHolder.layoutPointValue.setVisibility(8);
            pointTabHolder.tvUnable.setVisibility(0);
            pointTabHolder.tvRemark.setVisibility(8);
            pointTabHolder.tvUnable.setText(getmodelclass.IconCompatParcelizer);
        }
    }

    public final void IconCompatParcelizer(isSimulator issimulator, getCustomAttributes getcustomattributes) {
        PrepaidCashOutLandingAndInputActivity.read read2 = PrepaidCashOutLandingAndInputActivity.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) this, "context");
        onGetStartedClick.write((Object) getcustomattributes, "prepaidTravelWalletSummaryDisplay");
        onGetStartedClick.write((Object) issimulator, "prepaidCardDisplay");
        Intent putExtra = new Intent(this, PrepaidCashOutLandingAndInputActivity.class).putExtra("EXTRA_PREPAID_TRAVEL_WALLET_SUMMARY_DISPLAY", getcustomattributes).putExtra("EXTRA_PREPAID_CARD_DISPLAY", issimulator);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidC…PLAY, prepaidCardDisplay)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onTopUpClick() {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onPrepaidTravelTopUpClick() {
        this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_topup");
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onTransferOutClick() {
        this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_transferout");
        this.MediaBrowserCompat$MediaItem.write(this.AppCompatDialogFragment);
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        setCores setcores;
        if (i >= i2) {
            boolean z = false;
            int measuredHeight = nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight();
            if (!this.MediaBrowserCompat$MediaItem.write(this.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver) || this.vpPrepaidTravelContent.getCurrentItem() != 1) {
                if (this.vpPrepaidNormalContent.getCurrentItem() == 0 && i >= measuredHeight - 250) {
                    DetailsTabHolder detailsTabHolder = this.setHasDecor.write;
                    if (detailsTabHolder != null) {
                        z = detailsTabHolder.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
                    }
                    if (!z && (setcores = this.PlaybackStateCompat) != null && "0".equals(setcores.read)) {
                        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver);
                        this.setHasDecor.write.MediaBrowserCompat$MediaItem.write(true);
                    }
                }
            } else if (i >= measuredHeight - 250) {
                this.PlaybackStateCompat$CustomAction.mo15128x50fd9e4a();
            }
        }
    }

    public final void IconCompatParcelizer(getModel getmodel) {
        this.MediaBrowserCompat$SearchResultReceiver = getmodel;
        this.MediaBrowserCompat$MediaItem.read(getmodel);
    }

    public final void read(boolean z) {
        this.btnPrepaidTravelTopup.setEnabled(z);
        this.btnTopUp.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.btnPrepaidTravelTransfer.setEnabled(z);
    }

    public final void read() {
        newState newstate = this.setHasDecor;
        String string = getString(R.string.prepaid_empty_no_transactions);
        DetailsTabHolder detailsTabHolder = newstate.write;
        if (detailsTabHolder != null) {
            detailsTabHolder.mTextMessagePrepaid.setText(string);
            detailsTabHolder.mTextMessagePrepaid.setVisibility(0);
            detailsTabHolder.customError.setVisibility(8);
            detailsTabHolder.mRecyclerViewPrepaid.setVisibility(8);
            detailsTabHolder.mLoadingView.setVisibility(8);
        }
    }

    public final void RatingCompat() {
        DetailsTabHolder detailsTabHolder = this.setHasDecor.write;
        if (detailsTabHolder != null) {
            detailsTabHolder.mTextMessagePrepaid.setVisibility(8);
            detailsTabHolder.customError.setVisibility(0);
            detailsTabHolder.mRecyclerViewPrepaid.setVisibility(8);
            detailsTabHolder.mLoadingView.setVisibility(8);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        DetailsTabHolder detailsTabHolder;
        newState newstate = this.setHasDecor;
        if (newstate != null && (detailsTabHolder = newstate.write) != null) {
            detailsTabHolder.mTextMessagePrepaid.setVisibility(8);
            detailsTabHolder.customError.setVisibility(8);
            detailsTabHolder.mRecyclerViewPrepaid.setVisibility(8);
            detailsTabHolder.mLoadingView.setVisibility(0);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<getModel> list) {
        this.tvBalanceValue.setVisibility(0);
        this.tvBalanceLabel.setVisibility(0);
        this.vpPrepaidNormalContent.setVisibility(0);
        this.normalTravelView.setVisibility(0);
        this.prepaidTravelView.setVisibility(8);
        this.rootTravelTopup.setVisibility(8);
        this.btnTopUp.setVisibility(0);
        write(this.AlertController$RecycleListView.MediaSessionCompat$QueueItem);
        newState newstate = this.setHasDecor;
        DetailsTabHolder detailsTabHolder = newstate.write;
        if (detailsTabHolder != null) {
            detailsTabHolder.mTextTxnMonthPrepaid.setText(detailsTabHolder.MediaBrowserCompat$CustomActionResultReceiver.getString(R.string.deposit_detail_filter_this_month));
            DetailsTabHolder detailsTabHolder2 = newstate.write;
            Menu MediaBrowserCompat$CustomActionResultReceiver = detailsTabHolder2.mToolbarTxnPrepaid.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.clear();
            if (list == null || list.isEmpty()) {
                detailsTabHolder2.mTextTxnMonthPrepaid.setVisibility(8);
                return;
            }
            detailsTabHolder2.mTextTxnMonthPrepaid.setVisibility(0);
            for (getModel getmodel : list) {
                MediaBrowserCompat$CustomActionResultReceiver.add(getmodel.write);
            }
            detailsTabHolder2.MediaBrowserCompat$ItemReceiver = (Map) new show(list).write(setupDialog.IconCompatParcelizer(getTitleAnimationOrientation.read));
            detailsTabHolder2.mToolbarTxnPrepaid.setOnMenuItemClickListener(new getTileHeight(detailsTabHolder2));
        }
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(this, PrepaidTravelGettingStartedActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 1999);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaMetadataCompat() {
        this.tvBalanceValue.setVisibility(8);
        this.tvBalanceLabel.setVisibility(8);
        this.vpPrepaidNormalContent.setVisibility(8);
        this.prepaidTravelView.setVisibility(0);
        this.normalTravelView.setVisibility(8);
        this.rootTravelTopup.setVisibility(0);
        this.btnTopUp.setVisibility(8);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.MediaBrowserCompat$MediaItem.read(this.setBackgroundResource);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo15112x50fd9e4a() {
        Intent IconCompatParcelizer = PrepaidConfirmPinActivity.IconCompatParcelizer(this, this.AlertController$RecycleListView.RatingCompat, getString(R.string.prepaid_reset_otp_title), getString(R.string.prepaid_reset_otp_message));
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 1777);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(getCustomAttributes getcustomattributes) {
        this.AppCompatDialogFragment = getcustomattributes;
    }

    public final void IconCompatParcelizer(boolean z, boolean z2) {
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(z, z2);
    }

    public final void MediaSessionCompat$Token() {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1777 && i2 == -1) {
            Intent MediaBrowserCompat$ItemReceiver = PrepaidResetOtpActivity.MediaBrowserCompat$ItemReceiver(this, this.AlertController$RecycleListView.RatingCompat, PrepaidConfirmPinActivity.read(intent));
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(read2, 1888);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (i == 1888 && i2 == -1) {
            Intent IconCompatParcelizer = PrepaidResetPinSuccessActivity.IconCompatParcelizer(this);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read3 = setTapText.write(this, IconCompatParcelizer).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb2.append(read3.getData());
                sb2.append("\n with context ");
                sb2.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                startActivity(read3);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (i == 1999 && i2 == 0) {
            finish();
        }
    }

    public void onDestroy() {
        this.MediaBrowserCompat$MediaItem.onDestroy();
        super.onDestroy();
    }

    public final void read(isSimulator issimulator) {
        Intent read2 = PrepaidInputActivity.read(this, issimulator.MediaBrowserCompat$ItemReceiver, issimulator.RatingCompat, issimulator.IconCompatParcelizer);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(isSimulator issimulator) {
        Intent write = PrepaidInputActivity.write(this, issimulator.MediaBrowserCompat$ItemReceiver, issimulator.RatingCompat, issimulator.IconCompatParcelizer, this.AppCompatDialogFragment);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$MediaItem(isSimulator issimulator) {
        read read2 = this.setContentView;
        if (read2 != null) {
            read2.read(issimulator);
        }
        read read3 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (read3 != null) {
            read3.read(issimulator);
        }
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_PREPAID_LOCK_CARD_REFRESH");
        sendBroadcast(intent);
    }
}
