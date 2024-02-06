package com.scb.phone.view.fragment.investment;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import com.p032rd.PageIndicatorView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.investment.assessment.AssessmentPopupActivity;
import com.scb.phone.view.activity.investment.assessment.RiskLevelAssessmentActivity;
import com.scb.phone.view.adapter.investment.InvestmentContextualAdsAdapter;
import com.scb.phone.view.adapter.investment.InvestmentDetailsAssetGroupListAdapter;
import com.scb.phone.view.custom.InfiniteRecyclerView;
import com.scb.phone.view.custom.common.CustomFundsActions;
import com.scb.phone.view.custom.common.CustomRiskAssessmentDialogFragment;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_BindHowToAddAccountStep2Activity;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CrashlyticsCore;
import p040o.FragmentBuilder_BindBilledTabFragment;
import p040o.FragmentBuilder_BindDummyAndroid41Fragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Utils;
import p040o.WscIndexFieldsRequest;
import p040o.WscRetrieveScanSettingsRequest;
import p040o.WscSendImageRequest;
import p040o.addI16;
import p040o.addI64;
import p040o.addMatrix;
import p040o.addU16;
import p040o.generateTokenForDeejungInstallment;
import p040o.getDocumentNote;
import p040o.getDocumentNote$MediaBrowserCompat$ItemReceiver;
import p040o.getKernelIDSrcAtop;
import p040o.getKernelIDSrcAtop$read$MediaBrowserCompat$ItemReceiver;
import p040o.getMicrAmount;
import p040o.getOversizeImage;
import p040o.isComplex;
import p040o.markInitializationComplete;
import p040o.markInitializationStarted;
import p040o.newPassportOnDeviceExtractionServer;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setWscClientId;
import p040o.subShort3;
import p040o.subShort4;
import p040o.toJSON;

public class InvestmentDetailsFragment extends BaseFragment implements getMicrAmount.IconCompatParcelizer, FragmentBuilder_BindBilledTabFragment, newPassportOnDeviceExtractionServer {
    private markInitializationComplete IconCompatParcelizer;
    public InvestmentContextualAdsAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private boolean MediaDescriptionCompat = false;
    @BindView
    ConstraintLayout contextualAdsView;
    @BindView
    CustomFundsActions customFundsActions;
    @HmlPinActivity
    public getDocumentNote investmentDetailsPresenter;
    @BindView
    LinearLayout layoutIndicator;
    @BindView
    ListView mAssetGroupListView;
    @BindView
    PieChart mChart;
    @BindView
    TextView mCustomerName;
    @BindView
    LinearLayout mCustomerNameView;
    @BindView
    LinearLayout mExpiredProfileView;
    @BindView
    NestedScrollView mInvestmentDetailScrollView;
    @BindView
    TextView mNetGain;
    @BindView
    ImageView mNetGainIndicator;
    @BindView
    TextView mNetGainPercent;
    @BindView
    TextView mRiskExpiryDate;
    @BindView
    TextView mRiskLevel;
    @BindView
    LinearLayout mRiskProfileView;
    @BindView
    TabLayout mTabLayout;
    @BindView
    FragmentWrapContentViewPager mTabPager;
    @BindView
    TextView mTotalBalance;
    @BindView
    LinearLayout pieChartContainer;
    @BindView
    public PageIndicatorView pivAdsIndicator;
    @BindView
    InfiniteRecyclerView rvContextualAds;

    public static InvestmentDetailsFragment write() {
        return new InvestmentDetailsFragment();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.MediaBrowserCompat$MediaItem = bundle.getBoolean("IS_AUTO_SCROLL", false);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88172131494044, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.investmentDetailsPresenter.MediaBrowserCompat$ItemReceiver(this);
        getDocumentNote getdocumentnote = this.investmentDetailsPresenter;
        getdocumentnote.read.MediaBrowserCompat$ItemReceiver();
        getdocumentnote.read.IconCompatParcelizer(new getDocumentNote.write(getdocumentnote, (byte) 0));
        CustomRiskAssessmentDialogFragment.read(this);
        super.setTransitioning();
        setHasOptionsMenu(true);
        setActionBarVisibilityCallback();
        this.MediaBrowserCompat$CustomActionResultReceiver = new InvestmentContextualAdsAdapter(new ArrayList(), this);
        InfiniteRecyclerView infiniteRecyclerView = this.rvContextualAds;
        getContext();
        infiniteRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.rvContextualAds.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.rvContextualAds.setOnSnapPositionChangeListener(new ActivityBuilder_BindHowToAddAccountStep2Activity(this));
        this.customFundsActions.setOnCustomFundsActionsClickListener(this);
        this.mTabPager.setAdapter(new generateTokenForDeejungInstallment(getFragmentManager(), getContext()));
        this.mTabLayout.setupWithViewPager(this.mTabPager);
        return inflate;
    }

    public void onResume() {
        super.onResume();
        if (this.MediaBrowserCompat$MediaItem) {
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.rvContextualAds.setStackedBackground;
            if (bulkTransferDeepLinkActivity != null) {
                bulkTransferDeepLinkActivity.dispose();
            }
            this.rvContextualAds.MediaMetadataCompat();
        }
    }

    public void onPause() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
        super.onPause();
        if (this.MediaBrowserCompat$MediaItem && (bulkTransferDeepLinkActivity = this.rvContextualAds.setStackedBackground) != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_AUTO_SCROLL", this.MediaBrowserCompat$MediaItem);
    }

    private void read(List<markInitializationStarted> list) {
        if (list.size() == 0) {
            this.pieChartContainer.setVisibility(8);
        }
        this.mChart.setUsePercentValues(true);
        this.mChart.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = false;
        this.mChart.setExtraOffsets(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.mChart.setPadding(10, 10, 10, 10);
        this.mChart.setDrawHoleEnabled(true);
        this.mChart.setHoleColor(-1);
        this.mChart.setHoleRadius(35.0f);
        this.mChart.setTransparentCircleRadius(35.0f);
        this.mChart.setRotationAngle(BitmapDescriptorFactory.HUE_RED);
        this.mChart.setRotationEnabled(false);
        this.mChart.setHighlightPerTapEnabled(false);
        this.mChart.setRotationAngle(270.0f);
        PieChart pieChart = this.mChart;
        int size = list.size();
        int[] iArr = new int[size];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            markInitializationStarted markinitializationstarted = list.get(i);
            arrayList.add(new addI64((float) ((int) Float.parseFloat(markinitializationstarted.write)), markinitializationstarted.read, ""));
            iArr[i] = setLastBaselineToBottomHeight.read(getContext(), markInitializationStarted.write(markinitializationstarted.IconCompatParcelizer));
        }
        addI16 addi16 = new addI16(arrayList, "");
        addi16.MediaBrowserCompat$CustomActionResultReceiver = false;
        addi16.MediaBrowserCompat$ItemReceiver = subShort3.read(1.0f);
        subShort4 subshort4 = new subShort4(40.0f);
        addi16.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = subshort4.MediaBrowserCompat$ItemReceiver;
        addi16.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = subshort4.MediaBrowserCompat$CustomActionResultReceiver;
        addi16.write = subShort3.read(5.0f);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(Integer.valueOf(iArr[i2]));
        }
        addi16.read = arrayList2;
        addMatrix addmatrix = new addMatrix(addi16);
        addmatrix.IconCompatParcelizer((addU16) new FragmentBuilder_BindDummyAndroid41Fragment(this.mChart, new DecimalFormat("###,###,###")));
        addmatrix.MediaBrowserCompat$MediaItem();
        addmatrix.IconCompatParcelizer();
        addmatrix.MediaBrowserCompat$CustomActionResultReceiver(Typeface.createFromAsset(getContext().getAssets(), "fonts/PSL001Pro.ttf"));
        pieChart.setData(addmatrix);
        this.mChart.MediaSessionCompat$Token();
        this.mChart.MediaBrowserCompat$CustomActionResultReceiver(isComplex.IconCompatParcelizer);
        this.mAssetGroupListView.setAdapter(new InvestmentDetailsAssetGroupListAdapter(getContext(), list));
        this.mChart.MediaSessionCompat$QueueItem().MediaSessionCompat$ResultReceiverWrapper = false;
        this.mChart.setDrawEntryLabels(false);
        this.mChart.setTranslationX(-10.0f);
        this.mChart.invalidate();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setHasOptionsMenu(true);
        setActionBarVisibilityCallback();
    }

    public void onDestroy() {
        getDocumentNote getdocumentnote = this.investmentDetailsPresenter;
        if (getdocumentnote != null) {
            getdocumentnote.onDestroy();
        }
        super.onDestroy();
    }

    public final void read(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.investment_details_view, str, getoversizeimage);
            }
        }
    }

    public final void read(markInitializationComplete markinitializationcomplete) {
        this.IconCompatParcelizer = markinitializationcomplete;
        MediaBrowserCompat$CustomActionResultReceiver(markinitializationcomplete);
    }

    public final void read() {
        getDocumentNote getdocumentnote = this.investmentDetailsPresenter;
        getdocumentnote.read.MediaBrowserCompat$ItemReceiver(false);
        getdocumentnote.read.IconCompatParcelizer(new getDocumentNote.write(getdocumentnote, (byte) 0));
        this.MediaDescriptionCompat = true;
    }

    private void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (getUserVisibleHint() && activity != null) {
            AlertController$RecycleListView.write((Activity) activity, (int) R.id.view_group_root, (int) R.drawable.ic_check_circle_white_24dp, getString(R.string.investment_risk_assessment_renew_success), (int) R.color.f67402131099896);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        char c = 65535;
        boolean z = false;
        if (i == 7000) {
            if (i2 == 0) {
                MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
                if (getActivity() instanceof BaseActivity) {
                    ((BaseActivity) getActivity()).aj_();
                }
            } else if (i2 == -1) {
                getDocumentNote getdocumentnote = this.investmentDetailsPresenter;
                getdocumentnote.read.write();
                getdocumentnote.read.IconCompatParcelizer(new getDocumentNote$MediaBrowserCompat$ItemReceiver(getdocumentnote, (byte) 0));
            }
        } else if (i == 321) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("riskPopupResult");
                int hashCode = stringExtra.hashCode();
                if (hashCode != -250841563) {
                    if (hashCode == 197473256 && stringExtra.equals("selectLevel")) {
                        c = 1;
                    }
                } else if (stringExtra.equals("refreshInvestments")) {
                    c = 0;
                }
                if (c == 0) {
                    getDocumentNote getdocumentnote2 = this.investmentDetailsPresenter;
                    getdocumentnote2.read.MediaBrowserCompat$ItemReceiver(false);
                    getdocumentnote2.read.IconCompatParcelizer(new getDocumentNote.write(getdocumentnote2, (byte) 0));
                    WscSendImageRequest wscSendImageRequest = WscSendImageRequest.IconCompatParcelizer;
                    if (getdocumentnote2.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        wscSendImageRequest.IconCompatParcelizer(getdocumentnote2.RatingCompat);
                    }
                } else if (c == 1) {
                    getDocumentNote getdocumentnote3 = this.investmentDetailsPresenter;
                    String str = getdocumentnote3.IconCompatParcelizer.MediaMetadataCompat.IconCompatParcelizer;
                    if (str == null || str.isEmpty()) {
                        setWscClientId setwscclientid = new setWscClientId(getdocumentnote3.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(getdocumentnote3.write.MediaBrowserCompat$ItemReceiver.AppCompatActivity()));
                        if (getdocumentnote3.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            setwscclientid.IconCompatParcelizer(getdocumentnote3.RatingCompat);
                            return;
                        }
                        return;
                    }
                    WscIndexFieldsRequest.FIELD_INDEXES field_indexes = new WscIndexFieldsRequest.FIELD_INDEXES(str);
                    if (getdocumentnote3.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        field_indexes.IconCompatParcelizer(getdocumentnote3.RatingCompat);
                    }
                }
            }
        } else if (i != 322) {
        } else {
            if (i2 == -1) {
                getDocumentNote getdocumentnote4 = this.investmentDetailsPresenter;
                toJSON tojson = toJSON.read;
                if (getdocumentnote4.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    tojson.IconCompatParcelizer(getdocumentnote4.RatingCompat);
                }
            } else if (intent != null && intent.getBooleanExtra("showPopup", false)) {
                getDocumentNote getdocumentnote5 = this.investmentDetailsPresenter;
                int i3 = getdocumentnote5.MediaBrowserCompat$ItemReceiver;
                if (i3 == 0 || i3 == 1) {
                    WscRetrieveScanSettingsRequest wscRetrieveScanSettingsRequest = new WscRetrieveScanSettingsRequest(getdocumentnote5);
                    if (getdocumentnote5.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        wscRetrieveScanSettingsRequest.IconCompatParcelizer(getdocumentnote5.RatingCompat);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
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
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = r3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "BUTTON_SWITCH"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = r1
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "BUTTON_REDEEM"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0034
            r7 = r2
            goto L_0x0035
        L_0x0034:
            r7 = -1
        L_0x0035:
            java.lang.String r0 = "\n with context "
            java.lang.String r4 = "Uri intercepted on support Fragment.startActivity(Intent), modified: "
            java.lang.String r5 = "SELECTED_CLIENT_LIST_POSITION"
            if (r7 == 0) goto L_0x00d5
            if (r7 == r2) goto L_0x008b
            if (r7 != r1) goto L_0x011e
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r1 = r6.getContext()
            java.lang.Class<com.scb.phone.view.activity.investment.fundswitch.FundSwitchLandingActivity> r2 = com.scb.phone.view.activity.investment.fundswitch.FundSwitchLandingActivity.class
            r7.<init>(r1, r2)
            r7.putExtra(r5, r3)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0060
            o.ZoomDocumentActivity r7 = p040o.setTapText.write(r1, r7)     // Catch:{ all -> 0x0086 }
            android.content.Intent r7 = r7.read()     // Catch:{ all -> 0x0086 }
        L_0x0060:
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r3.<init>(r4)     // Catch:{ all -> 0x0086 }
            android.net.Uri r4 = r7.getData()     // Catch:{ all -> 0x0086 }
            r3.append(r4)     // Catch:{ all -> 0x0086 }
            r3.append(r0)     // Catch:{ all -> 0x0086 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x0086 }
            r3.append(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0086 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0086 }
            r0 = r6
            com.scb.phone.view.fragment.investment.InvestmentDetailsFragment r0 = (com.scb.phone.view.fragment.investment.InvestmentDetailsFragment) r0     // Catch:{ all -> 0x0086 }
            r0.startActivity(r7)     // Catch:{ all -> 0x0086 }
            return
        L_0x0086:
            r7 = move-exception
            r7.printStackTrace()
            return
        L_0x008b:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r1 = r6.getContext()
            java.lang.Class<com.scb.phone.view.activity.investment.redeem.FundRedeemLandingActivity> r2 = com.scb.phone.view.activity.investment.redeem.FundRedeemLandingActivity.class
            r7.<init>(r1, r2)
            r7.putExtra(r5, r3)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00aa
            o.ZoomDocumentActivity r7 = p040o.setTapText.write(r1, r7)     // Catch:{ all -> 0x00d0 }
            android.content.Intent r7 = r7.read()     // Catch:{ all -> 0x00d0 }
        L_0x00aa:
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00d0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r3.<init>(r4)     // Catch:{ all -> 0x00d0 }
            android.net.Uri r4 = r7.getData()     // Catch:{ all -> 0x00d0 }
            r3.append(r4)     // Catch:{ all -> 0x00d0 }
            r3.append(r0)     // Catch:{ all -> 0x00d0 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x00d0 }
            r3.append(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00d0 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r0)     // Catch:{ all -> 0x00d0 }
            r0 = r6
            com.scb.phone.view.fragment.investment.InvestmentDetailsFragment r0 = (com.scb.phone.view.fragment.investment.InvestmentDetailsFragment) r0     // Catch:{ all -> 0x00d0 }
            r0.startActivity(r7)     // Catch:{ all -> 0x00d0 }
            return
        L_0x00d0:
            r7 = move-exception
            r7.printStackTrace()
            return
        L_0x00d5:
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r1 = r6.getContext()
            java.lang.Class<com.scb.phone.view.activity.investment.purchase.FundPurchaseLandingActivity> r2 = com.scb.phone.view.activity.investment.purchase.FundPurchaseLandingActivity.class
            r7.<init>(r1, r2)
            r7.putExtra(r5, r3)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()     // Catch:{ all -> 0x011a }
            if (r1 == 0) goto L_0x00f4
            o.ZoomDocumentActivity r7 = p040o.setTapText.write(r1, r7)     // Catch:{ all -> 0x011a }
            android.content.Intent r7 = r7.read()     // Catch:{ all -> 0x011a }
        L_0x00f4:
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            r3.<init>(r4)     // Catch:{ all -> 0x011a }
            android.net.Uri r4 = r7.getData()     // Catch:{ all -> 0x011a }
            r3.append(r4)     // Catch:{ all -> 0x011a }
            r3.append(r0)     // Catch:{ all -> 0x011a }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x011a }
            r3.append(r0)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x011a }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r0)     // Catch:{ all -> 0x011a }
            r0 = r6
            com.scb.phone.view.fragment.investment.InvestmentDetailsFragment r0 = (com.scb.phone.view.fragment.investment.InvestmentDetailsFragment) r0     // Catch:{ all -> 0x011a }
            r0.startActivity(r7)     // Catch:{ all -> 0x011a }
            return
        L_0x011a:
            r7 = move-exception
            r7.printStackTrace()
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.InvestmentDetailsFragment.write(java.lang.String):void");
    }

    public final void read(CrashlyticsCore.C32441 r5) {
        Intent MediaBrowserCompat$ItemReceiver = AssessmentPopupActivity.MediaBrowserCompat$ItemReceiver(getContext(), r5);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$ItemReceiver, 321);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(String str) {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = RiskLevelAssessmentActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), str);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$CustomActionResultReceiver2, 322);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver(ArrayList<Utils.C39334> arrayList) {
        InvestmentContextualAdsAdapter investmentContextualAdsAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) arrayList, "list");
        investmentContextualAdsAdapter.read.clear();
        investmentContextualAdsAdapter.read.addAll(arrayList);
        investmentContextualAdsAdapter.IconCompatParcelizer.write();
    }

    public final void read(int i) {
        this.contextualAdsView.setVisibility(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.MediaBrowserCompat$MediaItem = true;
        this.layoutIndicator.setVisibility(0);
        this.pivAdsIndicator.setCount(i);
        this.rvContextualAds.MediaMetadataCompat();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        HomeActivity.write(getContext(), true);
    }

    public final void write(Utils.C39334 r5) {
        getKernelIDSrcAtop.read read = getKernelIDSrcAtop.CREATOR;
        String valueOf = String.valueOf(r5.MediaBrowserCompat$ItemReceiver);
        String str = r5.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) valueOf, "adId");
        onGetStartedClick.write((Object) str, "adName");
        read(getKernelIDSrcAtop.read.read(valueOf, str, getKernelIDSrcAtop$read$MediaBrowserCompat$ItemReceiver.CLICK));
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(r5.IconCompatParcelizer));
            intent.putExtra("IS_NEED_HISTORY_STACK", true);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$CustomActionResultReceiver(p040o.markInitializationComplete r7) {
        /*
            r6 = this;
            o.CrashlyticsCore$5 r0 = r7.RatingCompat
            android.widget.TextView r1 = r6.mTotalBalance
            java.lang.String r2 = r0.RatingCompat
            r1.setText(r2)
            android.widget.ImageView r1 = r6.mNetGainIndicator
            int r2 = r0.MediaDescriptionCompat
            r1.setImageResource(r2)
            android.widget.TextView r1 = r6.mNetGain
            android.content.res.Resources r2 = r6.getResources()
            int r3 = r0.MediaBrowserCompat$SearchResultReceiver
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.TextView r1 = r6.mNetGainPercent
            android.content.res.Resources r2 = r6.getResources()
            int r3 = r0.MediaBrowserCompat$SearchResultReceiver
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
            android.widget.TextView r1 = r6.mNetGain
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.read
            r2.append(r3)
            java.lang.String r3 = r0.IconCompatParcelizer
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            android.widget.TextView r1 = r6.mNetGainPercent
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "("
            r2.append(r3)
            java.lang.String r3 = r0.read
            r2.append(r3)
            java.lang.String r3 = r0.MediaBrowserCompat$ItemReceiver
            r2.append(r3)
            java.lang.String r3 = "%)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setText(r2)
            android.widget.TextView r1 = r6.mCustomerName
            o.CrashlyticsCore$1 r2 = r7.MediaMetadataCompat
            java.lang.String r2 = r2.IconCompatParcelizer
            r1.setText(r2)
            o.CrashlyticsCore$1 r1 = r7.MediaMetadataCompat
            java.lang.String r1 = r1.MediaDescriptionCompat
            int r2 = r1.hashCode()
            r3 = 2
            r4 = 1
            r5 = 0
            switch(r2) {
                case 48: goto L_0x0094;
                case 49: goto L_0x008a;
                case 50: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x009e
        L_0x0080:
            java.lang.String r2 = "2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009e
            r1 = r3
            goto L_0x009f
        L_0x008a:
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009e
            r1 = r5
            goto L_0x009f
        L_0x0094:
            java.lang.String r2 = "0"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009e
            r1 = r4
            goto L_0x009f
        L_0x009e:
            r1 = -1
        L_0x009f:
            r2 = 8
            if (r1 == 0) goto L_0x00e4
            if (r1 == r4) goto L_0x00d1
            if (r1 != r3) goto L_0x00f6
            android.widget.LinearLayout r1 = r6.mCustomerNameView
            r1.setVisibility(r5)
            android.widget.LinearLayout r1 = r6.mRiskProfileView
            r1.setVisibility(r5)
            android.widget.LinearLayout r1 = r6.mExpiredProfileView
            r1.setVisibility(r2)
            r6.MediaBrowserCompat$ItemReceiver((p040o.CrashlyticsCore.C32515) r0)
            android.widget.LinearLayout r0 = r6.mExpiredProfileView
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.mRiskLevel
            o.CrashlyticsCore$1 r1 = r7.MediaMetadataCompat
            java.lang.String r1 = r1.f2693x50fd9e4a
            r0.setText(r1)
            android.widget.TextView r0 = r6.mRiskExpiryDate
            o.CrashlyticsCore$1 r1 = r7.MediaMetadataCompat
            java.lang.String r1 = r1.MediaMetadataCompat
            r0.setText(r1)
            goto L_0x00f6
        L_0x00d1:
            android.widget.LinearLayout r1 = r6.mCustomerNameView
            r1.setVisibility(r2)
            android.widget.LinearLayout r1 = r6.mRiskProfileView
            r1.setVisibility(r2)
            android.widget.LinearLayout r1 = r6.mExpiredProfileView
            r1.setVisibility(r5)
            r6.MediaBrowserCompat$ItemReceiver((p040o.CrashlyticsCore.C32515) r0)
            goto L_0x00f6
        L_0x00e4:
            android.widget.LinearLayout r1 = r6.mCustomerNameView
            r1.setVisibility(r2)
            android.widget.LinearLayout r1 = r6.mRiskProfileView
            r1.setVisibility(r2)
            android.widget.LinearLayout r1 = r6.mExpiredProfileView
            r1.setVisibility(r5)
            r6.MediaBrowserCompat$ItemReceiver((p040o.CrashlyticsCore.C32515) r0)
        L_0x00f6:
            com.scb.phone.view.custom.common.CustomFundsActions r0 = r6.customFundsActions
            o.CrashlyticsCore$1 r1 = r7.MediaMetadataCompat
            java.lang.String r1 = r1.read
            java.lang.String r2 = "BUTTON_PURCHASE"
            r0.setButtonEnabled(r2, r1)
            com.scb.phone.view.custom.common.CustomFundsActions r0 = r6.customFundsActions
            o.CrashlyticsCore$1 r1 = r7.MediaMetadataCompat
            java.lang.String r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = "BUTTON_REDEEM"
            r0.setButtonEnabled(r2, r1)
            com.scb.phone.view.custom.common.CustomFundsActions r0 = r6.customFundsActions
            o.CrashlyticsCore$1 r7 = r7.MediaMetadataCompat
            java.lang.String r7 = r7.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = "BUTTON_SWITCH"
            r0.setButtonEnabled(r1, r7)
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            if (r7 == 0) goto L_0x012e
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            boolean r7 = r7 instanceof com.scb.phone.view.activity.BaseActivity
            if (r7 == 0) goto L_0x012e
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            com.scb.phone.view.activity.BaseActivity r7 = (com.scb.phone.view.activity.BaseActivity) r7
            r7.aj_()
        L_0x012e:
            android.content.Context r7 = r6.getContext()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.scb.phone/BROADCAST_INVESTMENT_DETAILS"
            r0.<init>(r1)
            r7.sendBroadcast(r0)
            boolean r7 = r6.MediaDescriptionCompat
            if (r7 == 0) goto L_0x0145
            r6.MediaBrowserCompat$ItemReceiver()
            r6.MediaDescriptionCompat = r5
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.InvestmentDetailsFragment.MediaBrowserCompat$CustomActionResultReceiver(o.markInitializationComplete):void");
    }

    private void MediaBrowserCompat$ItemReceiver(CrashlyticsCore.C32515 r3) {
        if (!r3.RatingCompat.equals("0.00")) {
            read(r3.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            this.mChart.setVisibility(8);
        }
    }
}
