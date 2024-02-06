package com.scb.phone.view.fragment.ntb.address;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.AddressSearchActivity;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlBusinessInformationActivity;
import p040o.ActivityBuilder_ContributeHmlBusinessOccupationInfoActivity;
import p040o.ActivityBuilder_ContributeHmlCaptureDocumentActivity;
import p040o.ActivityBuilder_ContributeHmlCompanyNameActivity;
import p040o.ActivityBuilder_ContributeHmlConsentActivity;
import p040o.ActivityBuilder_ContributeHmlConsumerEmailAboutActivity;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C4219ct;
import p040o.C4221cw;
import p040o.C4223cy;
import p040o.C6312x348e09af;
import p040o.C6313x2875d002;
import p040o.C6314x74c04b0;
import p040o.C6315x3f37bd55;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.MoreExecutors;
import p040o.MyECouponActivity_ViewBinding;
import p040o.addDelayedShutdownHook;
import p040o.blend;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public abstract class BaseAddressFragment extends BaseFragment implements KtaJsonCheck.read {
    private boolean AlertController$RecycleListView;
    private boolean AppCompatActivity;
    private boolean AppCompatDelegateImpl$ListMenuDecorView;
    private boolean AppCompatDialogFragment;
    private ArrayAdapter<MoreExecutors> IconCompatParcelizer;
    private FragmentBuilder_BindChangeChannelStatementReviewFragment.write Keep;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    public blend MediaBrowserCompat$MediaItem = new blend();
    public String MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f3094x50fd9e4a = true;
    public String MediaDescriptionCompat;
    public AutoValue_CrashlyticsReport_CustomAttribute MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token;
    private KtaJsonCheck.MediaDescriptionCompat ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private boolean PlaybackStateCompat$CustomAction;
    public int RatingCompat;
    @BindView
    public CustomAddressInput alley;
    @BindView
    public CustomAddressInput city;
    @BindView
    TextView countryLabel;
    @BindView
    Spinner customSpinner;
    @BindView
    public TextView districtLabel;
    @BindView
    View dividerView;
    @BindView
    public CustomAddressInput floor;
    @BindView
    public CustomAddressInput houseNo;
    @BindView
    public RelativeLayout layoutCustomSpinner;
    @BindView
    public CustomAddressInput moo;
    @BindView
    protected Button nextButton;
    @BindView
    LinearLayout otherCountryAddressSection;
    @BindView
    public CustomAddressInput otherCountryDistrict;
    @BindView
    public CustomAddressInput otherCountryRoad;
    @BindView
    public TextView postalCodeLabel;
    @HmlPinActivity
    public C4223cy presenter;
    @BindView
    public TextView provinceLabel;
    @BindView
    protected TextView provinceTitle;
    @BindView
    public CustomAddressInput roadTH;
    private boolean setContentView;
    private boolean setHasDecor;
    @BindView
    public CustomAddressInput state;
    @BindView
    public TextView subDistrictLabel;
    @BindView
    public TextView textAddressTitle;
    @BindView
    LinearLayout thailandAddressSection;
    @BindView
    public CustomAddressInput trok;
    @BindView
    public TextView tvRemark;
    @BindView
    public CustomAddressInput unit;
    @BindView
    public CustomAddressInput village;
    @BindView
    public CustomAddressInput zipCode;

    /* access modifiers changed from: protected */
    public int IconCompatParcelizer() {
        return R.layout.f85642131493791;
    }

    public void write(String str) {
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) {
            this.Keep = (FragmentBuilder_BindChangeChannelStatementReviewFragment.write) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.ParcelableVolumeInfo = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(IconCompatParcelizer(), viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.nextButton.setEnabled(false);
        return inflate;
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C4223cy cyVar = this.presenter;
        boolean z = true;
        C4219ct ctVar = new C4219ct(true);
        if (cyVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ctVar.IconCompatParcelizer(cyVar.RatingCompat);
        }
        this.MediaDescriptionCompat = "TH";
        this.layoutCustomSpinner.setVisibility(8);
    }

    public final void RatingCompat(String str) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            super.onViewCreated(r7, r8)
            o.FragmentBuilder_BindChangeChannelStatementReviewFragment$write r7 = r6.Keep
            if (r7 == 0) goto L_0x015e
            android.os.Bundle r7 = r6.getArguments()
            if (r7 == 0) goto L_0x0150
            java.lang.String r8 = "BUNDLE_ADDRESS_TYPE"
            int r8 = r7.getInt(r8)
            r6.RatingCompat = r8
            java.lang.String r8 = "BUNDLE_ADDRESS_ORIGINAL_FEATURE"
            int r7 = r7.getInt(r8)
            if (r7 != 0) goto L_0x0043
            o.KtaJsonCheck$MediaDescriptionCompat r8 = r6.ParcelableVolumeInfo
            if (r8 == 0) goto L_0x0043
            o.blend r0 = r6.MediaBrowserCompat$MediaItem
            java.lang.String r8 = r8.read()
            o.cy r1 = r6.presenter
            o.Iterables$12 r1 = r1.IconCompatParcelizer
            java.lang.String r1 = r1.write()
            java.lang.String r2 = "source"
            r0.read(r2, r8)
            if (r1 == 0) goto L_0x0043
            java.lang.String r2 = "touchpoint"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x0043
            java.lang.String r8 = "customer_group"
            r0.read(r8, r1)
        L_0x0043:
            int r8 = r6.RatingCompat
            r0 = 2
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0096
            if (r8 == r2) goto L_0x007e
            if (r8 == r0) goto L_0x0065
            r3 = 3
            if (r8 != r3) goto L_0x00c1
            if (r7 != r2) goto L_0x00c1
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            if (r7 == 0) goto L_0x00c1
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            com.scb.phone.view.activity.BaseActivity r7 = (com.scb.phone.view.activity.BaseActivity) r7
            java.lang.String r8 = "mfonboard_mailaddress"
            r7.mo13676d_(r8)
            goto L_0x00c1
        L_0x0065:
            if (r7 != 0) goto L_0x007c
            o.blend r7 = r6.MediaBrowserCompat$MediaItem
            androidx.fragment.app.FragmentActivity r8 = r6.getActivity()
            if (r8 == 0) goto L_0x007c
            androidx.fragment.app.FragmentActivity r8 = r6.getActivity()
            com.scb.phone.view.activity.BaseActivity r8 = (com.scb.phone.view.activity.BaseActivity) r8
            o.getKernelIDDst r8 = r8.scbAnalytics
            java.lang.String r3 = "ekyc_workaddress"
            r7.MediaBrowserCompat$ItemReceiver(r8, r3)
        L_0x007c:
            r7 = r2
            goto L_0x00c2
        L_0x007e:
            if (r7 != 0) goto L_0x00c1
            o.blend r7 = r6.MediaBrowserCompat$MediaItem
            androidx.fragment.app.FragmentActivity r8 = r6.getActivity()
            if (r8 == 0) goto L_0x00c1
            androidx.fragment.app.FragmentActivity r8 = r6.getActivity()
            com.scb.phone.view.activity.BaseActivity r8 = (com.scb.phone.view.activity.BaseActivity) r8
            o.getKernelIDDst r8 = r8.scbAnalytics
            java.lang.String r3 = "ekyc_currentaddress"
            r7.MediaBrowserCompat$ItemReceiver(r8, r3)
            goto L_0x00c1
        L_0x0096:
            if (r7 != 0) goto L_0x00ae
            o.blend r7 = r6.MediaBrowserCompat$MediaItem
            androidx.fragment.app.FragmentActivity r8 = r6.getActivity()
            if (r8 == 0) goto L_0x00c1
            androidx.fragment.app.FragmentActivity r8 = r6.getActivity()
            com.scb.phone.view.activity.BaseActivity r8 = (com.scb.phone.view.activity.BaseActivity) r8
            o.getKernelIDDst r8 = r8.scbAnalytics
            java.lang.String r3 = "ekyc_homeaddress"
            r7.MediaBrowserCompat$ItemReceiver(r8, r3)
            goto L_0x00c1
        L_0x00ae:
            if (r7 != r2) goto L_0x00c1
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            if (r7 == 0) goto L_0x00c1
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            com.scb.phone.view.activity.BaseActivity r7 = (com.scb.phone.view.activity.BaseActivity) r7
            java.lang.String r8 = "mfonboard_houseaddress"
            r7.mo13676d_(r8)
        L_0x00c1:
            r7 = r1
        L_0x00c2:
            o.cy r8 = r6.presenter
            int r3 = r6.RatingCompat
            o.LatLng r4 = r8.write
            o.LocalProjectProvider$6 r4 = r4.MediaBrowserCompat$ItemReceiver
            o.getProjection r4 = r4.write()
            r5 = 0
            if (r4 == 0) goto L_0x010f
            if (r3 == 0) goto L_0x00ed
            if (r3 == r2) goto L_0x00e2
            if (r3 != r0) goto L_0x00f8
            o.animateCamera r0 = r4.setHasDecor
            if (r0 == 0) goto L_0x00f8
            o.animateCamera r0 = r4.setHasDecor
            o.AutoValue_CrashlyticsReport_CustomAttribute r0 = p040o.getDigest.MediaBrowserCompat$ItemReceiver(r0)
            goto L_0x00f9
        L_0x00e2:
            o.animateCamera r0 = r4.write
            if (r0 == 0) goto L_0x00f8
            o.animateCamera r0 = r4.write
            o.AutoValue_CrashlyticsReport_CustomAttribute r0 = p040o.getDigest.MediaBrowserCompat$ItemReceiver(r0)
            goto L_0x00f9
        L_0x00ed:
            o.animateCamera r0 = r4.MediaBrowserCompat$MediaItem
            if (r0 == 0) goto L_0x00f8
            o.animateCamera r0 = r4.MediaBrowserCompat$MediaItem
            o.AutoValue_CrashlyticsReport_CustomAttribute r0 = p040o.getDigest.MediaBrowserCompat$ItemReceiver(r0)
            goto L_0x00f9
        L_0x00f8:
            r0 = r5
        L_0x00f9:
            if (r0 == 0) goto L_0x010f
            o.cv r3 = new o.cv
            r3.<init>(r8, r0)
            T r4 = r8.RatingCompat
            if (r4 == 0) goto L_0x0106
            r4 = r2
            goto L_0x0107
        L_0x0106:
            r4 = r1
        L_0x0107:
            if (r4 == 0) goto L_0x010e
            T r8 = r8.RatingCompat
            r3.IconCompatParcelizer(r8)
        L_0x010e:
            r5 = r0
        L_0x010f:
            r6.MediaMetadataCompat = r5
            if (r7 == 0) goto L_0x0132
            o.cy r7 = r6.presenter
            T r8 = r7.RatingCompat
            if (r8 == 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r2 = r1
        L_0x011b:
            if (r2 == 0) goto L_0x0122
            T r8 = r7.RatingCompat
            r8.AlertController$RecycleListView()
        L_0x0122:
            o.LatLng r8 = r7.write
            r8.write()
            o.LatLng r8 = r7.write
            o.cy$MediaBrowserCompat$ItemReceiver r0 = new o.cy$MediaBrowserCompat$ItemReceiver
            r0.<init>(r7, r1)
            r8.IconCompatParcelizer(r0)
            goto L_0x0150
        L_0x0132:
            o.cy r7 = r6.presenter
            o.ct r8 = new o.ct
            r8.<init>(r2)
            T r0 = r7.RatingCompat
            if (r0 == 0) goto L_0x013e
            r1 = r2
        L_0x013e:
            if (r1 == 0) goto L_0x0145
            T r7 = r7.RatingCompat
            r8.IconCompatParcelizer(r7)
        L_0x0145:
            java.lang.String r7 = "TH"
            r6.MediaDescriptionCompat = r7
            android.widget.RelativeLayout r7 = r6.layoutCustomSpinner
            r8 = 8
            r7.setVisibility(r8)
        L_0x0150:
            android.widget.TextView r7 = r6.textAddressTitle
            java.lang.String r8 = r6.MediaBrowserCompat$SearchResultReceiver
            r7.setText(r8)
            o.FragmentBuilder_BindChangeChannelStatementReviewFragment$write r7 = r6.Keep
            java.lang.String r8 = r6.MediaBrowserCompat$SearchResultReceiver
            r7.write((java.lang.String) r8)
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ntb.address.BaseAddressFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        FragmentBuilder_BindChangeChannelStatementReviewFragment.write write = this.Keep;
        if (write != null) {
            write.write(this.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(final List<MoreExecutors> list) {
        this.countryLabel.setText(getString(R.string.country));
        this.dividerView.setVisibility(8);
        if (this.IconCompatParcelizer == null && list != null) {
            MoreExecutors moreExecutors = new MoreExecutors();
            moreExecutors.MediaBrowserCompat$ItemReceiver = "";
            moreExecutors.IconCompatParcelizer = getString(R.string.country_hint);
            list.add(0, moreExecutors);
            int MediaBrowserCompat$CustomActionResultReceiver2 = C4223cy.MediaBrowserCompat$CustomActionResultReceiver(list, C4223cy.write(this.MediaMetadataCompat));
            C61005 r1 = new ArrayAdapter<MoreExecutors>(getContext(), list) {
                public final boolean isEnabled(int i) {
                    return true;
                }

                public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
                    View dropDownView = super.getDropDownView(i, view, viewGroup);
                    TextView textView = (TextView) dropDownView;
                    if (i == 0) {
                        BaseAddressFragment.this.getResources();
                        textView.setTextColor(-3553587);
                    } else {
                        BaseAddressFragment.this.getResources();
                        textView.setTextColor(-13290951);
                    }
                    return dropDownView;
                }

                public final View getView(int i, View view, ViewGroup viewGroup) {
                    View view2 = super.getView(i, view, viewGroup);
                    TextView textView = (TextView) view2;
                    if (i == 0) {
                        BaseAddressFragment.this.getResources();
                        textView.setTextColor(-3553587);
                    } else {
                        BaseAddressFragment.this.getResources();
                        textView.setTextColor(-13290951);
                    }
                    return view2;
                }
            };
            this.IconCompatParcelizer = r1;
            this.customSpinner.setAdapter(r1);
            this.customSpinner.setSelection(MediaBrowserCompat$CustomActionResultReceiver2);
            this.customSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (!BaseAddressFragment.this.f3094x50fd9e4a) {
                        boolean unused = BaseAddressFragment.this.f3094x50fd9e4a = false;
                        BaseAddressFragment.write(BaseAddressFragment.this);
                        BaseAddressFragment.MediaBrowserCompat$CustomActionResultReceiver(BaseAddressFragment.this);
                    }
                    BaseAddressFragment.this.MediaDescriptionCompat = ((MoreExecutors) list.get(i)).MediaBrowserCompat$ItemReceiver;
                    C4223cy cyVar = BaseAddressFragment.this.presenter;
                    C4219ct ctVar = new C4219ct("TH".equalsIgnoreCase(((MoreExecutors) list.get(i)).MediaBrowserCompat$ItemReceiver));
                    if (cyVar.RatingCompat != null) {
                        ctVar.IconCompatParcelizer(cyVar.RatingCompat);
                    }
                }
            });
        }
    }

    public final void read() {
        this.thailandAddressSection.setVisibility(0);
        this.otherCountryAddressSection.setVisibility(8);
        this.provinceTitle.setText(Html.fromHtml(getString(R.string.ntb_province)));
        this.houseNo.setOnValueChangeListener(new ActivityBuilder_ContributeHmlCompanyNameActivity(this, true));
        this.floor.setOnValueChangeListener(new ActivityBuilder_ContributeHmlCaptureDocumentActivity(this, true));
        this.village.setOnValueChangeListener(new C6313x2875d002(this, true));
        this.unit.setOnValueChangeListener(new ActivityBuilder_ContributeHmlConsumerEmailAboutActivity(this, true));
        this.floor.setOnFocusChanged(new ActivityBuilder_ContributeHmlConsentActivity(this));
        this.unit.setOnFocusChanged(new ActivityBuilder_ContributeHmlConsentActivity(this));
        this.village.setOnFocusChanged(new ActivityBuilder_ContributeHmlConsentActivity(this));
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final /* synthetic */ void MediaBrowserCompat$MediaItem(boolean z, boolean z2) {
        this.MediaSessionCompat$ResultReceiverWrapper = z2;
        MediaBrowserCompat$ItemReceiver(z);
    }

    public final /* synthetic */ void MediaDescriptionCompat(boolean z, boolean z2) {
        this.MediaSessionCompat$Token = z2;
        MediaBrowserCompat$ItemReceiver(z);
    }

    public final /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(boolean z, boolean z2) {
        this.AppCompatActivity = z2;
        MediaBrowserCompat$ItemReceiver(z);
    }

    public final /* synthetic */ void RatingCompat(boolean z, boolean z2) {
        this.AppCompatDelegateImpl$ListMenuDecorView = z2;
        MediaBrowserCompat$ItemReceiver(z);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.thailandAddressSection.setVisibility(8);
        this.otherCountryAddressSection.setVisibility(0);
        this.moo.setTitleLabel(getString(R.string.village_no));
        this.alley.setTitleLabel(getString(R.string.alley_other_country));
        this.houseNo.setOnValueChangeListener(new C6312x348e09af(this, false));
        this.otherCountryRoad.setOnValueChangeListener(new C6315x3f37bd55(this, false));
        this.city.setOnValueChangeListener(new C6314x74c04b0(this, false));
        this.state.setOnValueChangeListener(new ActivityBuilder_ContributeHmlBusinessInformationActivity(this, false));
        this.zipCode.setOnValueChangeListener(new ActivityBuilder_ContributeHmlBusinessOccupationInfoActivity(this, false));
        MediaBrowserCompat$ItemReceiver(false);
    }

    public final void IconCompatParcelizer(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute, boolean z) {
        if (z) {
            this.houseNo.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaDescriptionCompat);
            this.moo.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.RatingCompat);
            this.roadTH.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$ResultReceiverWrapper);
            this.floor.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.Keep);
            this.unit.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.PlaybackStateCompat);
            this.village.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$QueueItem);
            this.trok.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.ParcelableVolumeInfo);
            this.alley.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaMetadataCompat);
            this.subDistrictLabel.setText(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver);
            this.districtLabel.setText(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$ItemReceiver);
            this.provinceLabel.setText(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$MediaItem);
            this.postalCodeLabel.setText(autoValue_CrashlyticsReport_CustomAttribute.f2671x50fd9e4a);
        } else {
            this.houseNo.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaDescriptionCompat);
            this.moo.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.RatingCompat);
            this.otherCountryRoad.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$ResultReceiverWrapper);
            this.floor.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.Keep);
            this.unit.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.PlaybackStateCompat);
            this.village.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$QueueItem);
            this.alley.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaMetadataCompat);
            this.otherCountryDistrict.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver);
            this.city.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$MediaItem);
            this.state.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$Token);
            this.zipCode.setTextValue(autoValue_CrashlyticsReport_CustomAttribute.f2671x50fd9e4a);
        }
        if (z) {
            this.MediaSessionCompat$ResultReceiverWrapper = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.MediaDescriptionCompat);
            this.MediaSessionCompat$Token = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.Keep);
            this.AppCompatDelegateImpl$ListMenuDecorView = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.PlaybackStateCompat);
            this.AppCompatActivity = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$QueueItem);
            this.setContentView = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaSessionCompat$QueueItem = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$ItemReceiver);
            this.PlaybackStateCompat$CustomAction = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$MediaItem);
            this.PlaybackStateCompat = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.f2671x50fd9e4a);
        } else {
            this.MediaSessionCompat$ResultReceiverWrapper = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.MediaDescriptionCompat);
            this.AlertController$RecycleListView = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$ResultReceiverWrapper);
            this.MediaBrowserCompat$CustomActionResultReceiver = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$MediaItem);
            this.setHasDecor = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$Token);
            this.AppCompatDialogFragment = C4223cy.MediaBrowserCompat$ItemReceiver(autoValue_CrashlyticsReport_CustomAttribute.f2671x50fd9e4a);
        }
        MediaBrowserCompat$ItemReceiver(z);
    }

    public final /* synthetic */ void write(boolean z, boolean z2) {
        this.MediaSessionCompat$ResultReceiverWrapper = z2;
        MediaBrowserCompat$ItemReceiver(z);
    }

    public final /* synthetic */ void IconCompatParcelizer(boolean z, boolean z2) {
        this.AlertController$RecycleListView = z2;
        MediaBrowserCompat$ItemReceiver(z);
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(boolean z, boolean z2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
        MediaBrowserCompat$ItemReceiver(z);
    }

    public final /* synthetic */ void read(boolean z, boolean z2) {
        this.setHasDecor = z2;
        MediaBrowserCompat$ItemReceiver(z);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(boolean z, boolean z2) {
        this.AppCompatDialogFragment = z2;
        MediaBrowserCompat$ItemReceiver(z);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        boolean z2 = true;
        if (!z && this.MediaSessionCompat$ResultReceiverWrapper && this.AlertController$RecycleListView && this.MediaBrowserCompat$CustomActionResultReceiver && this.setHasDecor && this.AppCompatDialogFragment) {
            this.nextButton.setEnabled(true);
        } else if (!z || !this.MediaSessionCompat$ResultReceiverWrapper || !this.setContentView || !this.MediaSessionCompat$QueueItem || !this.PlaybackStateCompat$CustomAction || !this.PlaybackStateCompat) {
            this.nextButton.setEnabled(false);
        } else if (this.MediaSessionCompat$Token || this.AppCompatDelegateImpl$ListMenuDecorView) {
            Button button = this.nextButton;
            if (!this.MediaSessionCompat$Token || !this.AppCompatDelegateImpl$ListMenuDecorView || !this.AppCompatActivity) {
                z2 = false;
            }
            button.setEnabled(z2);
        } else {
            this.nextButton.setEnabled(true);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10002 && i2 == -1 && intent != null) {
            C4223cy cyVar = this.presenter;
            C4221cw cwVar = new C4221cw((addDelayedShutdownHook) intent.getParcelableExtra("SUB_DISTRICT_DISPLAY"));
            if (cyVar.RatingCompat != null) {
                cwVar.IconCompatParcelizer(cyVar.RatingCompat);
            }
            this.setContentView = true;
            this.MediaSessionCompat$QueueItem = true;
            this.PlaybackStateCompat$CustomAction = true;
            this.PlaybackStateCompat = true;
            MediaBrowserCompat$ItemReceiver(true);
        }
    }

    public final void MediaDescriptionCompat(String str) {
        this.subDistrictLabel.setText(str);
    }

    public final void IconCompatParcelizer(String str) {
        this.districtLabel.setText(str);
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        this.provinceLabel.setText(str);
    }

    public final void read(String str) {
        this.postalCodeLabel.setText(str);
    }

    /* access modifiers changed from: protected */
    public final void MediaDescriptionCompat() {
        this.setContentView = true;
        this.MediaSessionCompat$QueueItem = true;
        this.PlaybackStateCompat$CustomAction = true;
        this.PlaybackStateCompat = true;
    }

    @OnClick
    public void onSelectProvinceClick() {
        blend blend = this.MediaBrowserCompat$MediaItem;
        if (getActivity() != null) {
            blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_subdistrict");
        }
        Intent read = AddressSearchActivity.read(getContext(), getActivity() instanceof BaseActivity ? ((BaseActivity) getActivity()).setTitle() : "");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 10002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNextButtonClick() {
        /*
            r21 = this;
            r0 = r21
            o.cy r1 = r0.presenter
            int r2 = r0.RatingCompat
            java.lang.String r3 = r0.MediaDescriptionCompat
            com.scb.phone.view.custom.common.CustomAddressInput r4 = r0.houseNo
            android.widget.EditText r4 = r4.inputTextField
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r5 = r0.moo
            android.widget.EditText r5 = r5.inputTextField
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r6 = r0.roadTH
            android.widget.EditText r6 = r6.inputTextField
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r7 = r0.floor
            android.widget.EditText r7 = r7.inputTextField
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r8 = r0.unit
            android.widget.EditText r8 = r8.inputTextField
            android.text.Editable r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r9 = r0.village
            android.widget.EditText r9 = r9.inputTextField
            android.text.Editable r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r10 = r0.alley
            android.widget.EditText r10 = r10.inputTextField
            android.text.Editable r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r10.trim()
            android.widget.TextView r11 = r0.subDistrictLabel
            java.lang.CharSequence r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            android.widget.TextView r12 = r0.districtLabel
            java.lang.CharSequence r12 = r12.getText()
            java.lang.String r12 = r12.toString()
            android.widget.TextView r13 = r0.provinceLabel
            java.lang.CharSequence r13 = r13.getText()
            java.lang.String r13 = r13.toString()
            android.widget.TextView r14 = r0.postalCodeLabel
            java.lang.CharSequence r14 = r14.getText()
            java.lang.String r14 = r14.toString()
            com.scb.phone.view.custom.common.CustomAddressInput r15 = r0.otherCountryDistrict
            android.widget.EditText r15 = r15.inputTextField
            android.text.Editable r15 = r15.getText()
            java.lang.String r15 = r15.toString()
            java.lang.String r15 = r15.trim()
            r20 = r1
            com.scb.phone.view.custom.common.CustomAddressInput r1 = r0.otherCountryRoad
            android.widget.EditText r1 = r1.inputTextField
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r16 = r1.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r1 = r0.city
            android.widget.EditText r1 = r1.inputTextField
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r17 = r1.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r1 = r0.state
            android.widget.EditText r1 = r1.inputTextField
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r18 = r1.trim()
            com.scb.phone.view.custom.common.CustomAddressInput r1 = r0.zipCode
            android.widget.EditText r1 = r1.inputTextField
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r19 = r1.trim()
            java.lang.String r1 = ""
            java.lang.String r0 = "(^\\h*)|(\\h*$)"
            java.lang.String r11 = r11.replaceAll(r0, r1)
            java.lang.String r12 = r12.replaceAll(r0, r1)
            java.lang.String r13 = r13.replaceAll(r0, r1)
            o.standardSubSet r0 = p040o.C4223cy.read(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            o.containsRow r1 = p040o.containsRow.IconCompatParcelizer()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x011b
            if (r2 == r4) goto L_0x0118
            r5 = 2
            if (r2 == r5) goto L_0x0115
            r0 = r4
            goto L_0x011e
        L_0x0115:
            r1.MediaSessionCompat$QueueItem = r0
            goto L_0x011d
        L_0x0118:
            r1.write = r0
            goto L_0x011d
        L_0x011b:
            r1.MediaMetadataCompat = r0
        L_0x011d:
            r0 = r3
        L_0x011e:
            if (r0 != 0) goto L_0x013e
            r0 = r20
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0127
            goto L_0x0128
        L_0x0127:
            r4 = r3
        L_0x0128:
            if (r4 == 0) goto L_0x012f
            T r2 = r0.RatingCompat
            r2.AlertController$RecycleListView()
        L_0x012f:
            o.LatLng r2 = r0.write
            r2.MediaBrowserCompat$CustomActionResultReceiver(r1)
            o.LatLng r1 = r0.write
            o.cy$MediaBrowserCompat$CustomActionResultReceiver r2 = new o.cy$MediaBrowserCompat$CustomActionResultReceiver
            r2.<init>(r0, r3)
            r1.IconCompatParcelizer(r2)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ntb.address.BaseAddressFragment.onNextButtonClick():void");
    }

    public void write() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    static /* synthetic */ void write(BaseAddressFragment baseAddressFragment) {
        baseAddressFragment.MediaSessionCompat$ResultReceiverWrapper = false;
        baseAddressFragment.setContentView = false;
        baseAddressFragment.MediaSessionCompat$QueueItem = false;
        baseAddressFragment.PlaybackStateCompat$CustomAction = false;
        baseAddressFragment.MediaSessionCompat$Token = false;
        baseAddressFragment.AppCompatDelegateImpl$ListMenuDecorView = false;
        baseAddressFragment.AppCompatActivity = false;
        baseAddressFragment.PlaybackStateCompat = false;
        baseAddressFragment.AlertController$RecycleListView = false;
        baseAddressFragment.MediaBrowserCompat$CustomActionResultReceiver = false;
        baseAddressFragment.setHasDecor = false;
        baseAddressFragment.AppCompatDialogFragment = false;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(BaseAddressFragment baseAddressFragment) {
        baseAddressFragment.provinceLabel.setText(baseAddressFragment.getString(R.string.select_province));
        baseAddressFragment.districtLabel.setText(baseAddressFragment.getString(R.string.will_be_autofilled));
        baseAddressFragment.subDistrictLabel.setText(baseAddressFragment.getString(R.string.will_be_autofilled));
        baseAddressFragment.postalCodeLabel.setText(baseAddressFragment.getString(R.string.will_be_autofilled));
        CustomAddressInput customAddressInput = baseAddressFragment.houseNo;
        customAddressInput.inputTextField.removeTextChangedListener(customAddressInput);
        customAddressInput.inputTextField.setText("");
        CustomAddressInput customAddressInput2 = baseAddressFragment.unit;
        customAddressInput2.inputTextField.removeTextChangedListener(customAddressInput2);
        customAddressInput2.inputTextField.setText("");
        CustomAddressInput customAddressInput3 = baseAddressFragment.floor;
        customAddressInput3.inputTextField.removeTextChangedListener(customAddressInput3);
        customAddressInput3.inputTextField.setText("");
        CustomAddressInput customAddressInput4 = baseAddressFragment.village;
        customAddressInput4.inputTextField.removeTextChangedListener(customAddressInput4);
        customAddressInput4.inputTextField.setText("");
        CustomAddressInput customAddressInput5 = baseAddressFragment.moo;
        customAddressInput5.inputTextField.removeTextChangedListener(customAddressInput5);
        customAddressInput5.inputTextField.setText("");
        CustomAddressInput customAddressInput6 = baseAddressFragment.trok;
        customAddressInput6.inputTextField.removeTextChangedListener(customAddressInput6);
        customAddressInput6.inputTextField.setText("");
        CustomAddressInput customAddressInput7 = baseAddressFragment.alley;
        customAddressInput7.inputTextField.removeTextChangedListener(customAddressInput7);
        customAddressInput7.inputTextField.setText("");
        CustomAddressInput customAddressInput8 = baseAddressFragment.roadTH;
        customAddressInput8.inputTextField.removeTextChangedListener(customAddressInput8);
        customAddressInput8.inputTextField.setText("");
        CustomAddressInput customAddressInput9 = baseAddressFragment.otherCountryRoad;
        customAddressInput9.inputTextField.removeTextChangedListener(customAddressInput9);
        customAddressInput9.inputTextField.setText("");
        CustomAddressInput customAddressInput10 = baseAddressFragment.otherCountryDistrict;
        customAddressInput10.inputTextField.removeTextChangedListener(customAddressInput10);
        customAddressInput10.inputTextField.setText("");
        CustomAddressInput customAddressInput11 = baseAddressFragment.city;
        customAddressInput11.inputTextField.removeTextChangedListener(customAddressInput11);
        customAddressInput11.inputTextField.setText("");
        CustomAddressInput customAddressInput12 = baseAddressFragment.state;
        customAddressInput12.inputTextField.removeTextChangedListener(customAddressInput12);
        customAddressInput12.inputTextField.setText("");
        CustomAddressInput customAddressInput13 = baseAddressFragment.zipCode;
        customAddressInput13.inputTextField.removeTextChangedListener(customAddressInput13);
        customAddressInput13.inputTextField.setText("");
        baseAddressFragment.nextButton.setEnabled(false);
    }

    public static /* synthetic */ void IconCompatParcelizer(BaseAddressFragment baseAddressFragment, boolean z) {
        if (z) {
            return;
        }
        if (baseAddressFragment.MediaSessionCompat$Token || baseAddressFragment.AppCompatDelegateImpl$ListMenuDecorView) {
            baseAddressFragment.village.MediaBrowserCompat$CustomActionResultReceiver(baseAddressFragment.AppCompatActivity);
            baseAddressFragment.floor.MediaBrowserCompat$CustomActionResultReceiver(baseAddressFragment.MediaSessionCompat$Token);
            baseAddressFragment.unit.MediaBrowserCompat$CustomActionResultReceiver(baseAddressFragment.AppCompatDelegateImpl$ListMenuDecorView);
            return;
        }
        CustomAddressInput customAddressInput = baseAddressFragment.village;
        customAddressInput.errorInline.setVisibility(8);
        customAddressInput.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput.getContext(), R.drawable.shape_gray_rounded_rectangle));
        CustomAddressInput customAddressInput2 = baseAddressFragment.floor;
        customAddressInput2.errorInline.setVisibility(8);
        customAddressInput2.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput2.getContext(), R.drawable.shape_gray_rounded_rectangle));
        CustomAddressInput customAddressInput3 = baseAddressFragment.unit;
        customAddressInput3.errorInline.setVisibility(8);
        customAddressInput3.inputTextField.setBackground(setLastBaselineToBottomHeight.write(customAddressInput3.getContext(), R.drawable.shape_gray_rounded_rectangle));
    }
}
