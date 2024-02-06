package com.scb.phone.view.fragment.bankingactions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.investment.select.SelectInvestmentActivity;
import com.scb.phone.view.adapter.bankingactions.BankingActionAdapter;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10829Sizeof;
import p040o.CheckParameters;
import p040o.Flash;
import p040o.FragmentBuilder_BindBaseRequestToPayFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Futures;
import p040o.HmlETBLandingActivity;
import p040o.HmlETBPersonalInfoActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ParseMicr;
import p040o.PartnerAuthorizeService;
import p040o.PassportCaptureExperienceCriteriaHolder;
import p040o.PlaceFilter;
import p040o.PlacesOptions;
import p040o.PrepaidRepositoryModule;
import p040o.getAccountNumber;
import p040o.getFrameColor;
import p040o.getPaddingPercent;
import p040o.getPartnerAuthorize;
import p040o.getPassportSampleImage;
import p040o.onCheckBoxClick;
import p040o.requestEmailOtp;
import p040o.setFrameColor;
import p040o.setLastBaselineToBottomHeight;
import p040o.setPassportSampleImage;
import p040o.setTapText;
import p040o.startTask;
import p040o.zzmd;
import p040o.zzwi;

public class BankingActionFragment extends BaseFragment implements CheckParameters, FragmentBuilder_BindBaseRequestToPayFragment {
    private static int MediaDescriptionCompat = PrepaidRepositoryModule.INVESTMENT.ordinal();
    public boolean IconCompatParcelizer = false;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    private startTask MediaBrowserCompat$MediaItem;
    private HmlETBPersonalInfoActivity<Integer> MediaBrowserCompat$SearchResultReceiver = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
    private List<startTask> MediaMetadataCompat;
    private BulkTransferDeepLinkActivity RatingCompat;
    @HmlPinActivity
    public C10829Sizeof bankingActionPresenter;
    @BindView
    CustomProfileImageView cusIvProfile;
    @BindView
    ImageView ivBgBankService;
    @BindView
    LinearLayout llLayoutInternetError;
    @BindView
    RecyclerView rvBankingActions;
    @BindView
    TextView tvHomeWelcomeHeadline;
    @BindView
    TextView tvHomeWelcomeUserName;

    public static final /* synthetic */ void write(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((BankingActionFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        PlaceFilter.zzb zzb;
        boolean z2 = false;
        View inflate = layoutInflater.inflate(R.layout.f85702131493797, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.bankingActionPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
        C10829Sizeof sizeof = this.bankingActionPresenter;
        if (sizeof.read.read.MediaBrowserCompat$CustomActionResultReceiver() && !zzmd.zzm.zzb.zza.JURISTIC.equals(sizeof.write.IconCompatParcelizer())) {
            setPassportSampleImage setpassportsampleimage = new setPassportSampleImage(sizeof);
            if (sizeof.RatingCompat != null) {
                setpassportsampleimage.IconCompatParcelizer(sizeof.RatingCompat);
            }
        }
        C10829Sizeof sizeof2 = this.bankingActionPresenter;
        setFrameColor setframecolor = new setFrameColor(sizeof2);
        if (sizeof2.RatingCompat != null) {
            setframecolor.IconCompatParcelizer(sizeof2.RatingCompat);
        }
        sizeof2.write();
        if (zzmd.zzm.zzb.zza.INDIVIDUAL == sizeof2.write.IconCompatParcelizer()) {
            Flash flash = Flash.write;
            if (sizeof2.RatingCompat != null) {
                flash.IconCompatParcelizer(sizeof2.RatingCompat);
            }
            zzwi MediaBrowserCompat$CustomActionResultReceiver2 = sizeof2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null || (zzb = MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper) == null) {
                z = false;
            } else {
                z = zzb.MediaBrowserCompat$SearchResultReceiver;
            }
            if (z) {
                ParseMicr parseMicr = ParseMicr.IconCompatParcelizer;
                if (sizeof2.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    parseMicr.IconCompatParcelizer(sizeof2.RatingCompat);
                }
                sizeof2.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(new getPaddingPercent(sizeof2), new PassportCaptureExperienceCriteriaHolder(sizeof2));
            } else {
                getAccountNumber getaccountnumber = getAccountNumber.MediaBrowserCompat$ItemReceiver;
                if (sizeof2.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    getaccountnumber.IconCompatParcelizer(sizeof2.RatingCompat);
                }
            }
        } else {
            getAccountNumber getaccountnumber2 = getAccountNumber.MediaBrowserCompat$ItemReceiver;
            if (sizeof2.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                getaccountnumber2.IconCompatParcelizer(sizeof2.RatingCompat);
            }
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.RatingCompat;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
        this.RatingCompat = this.MediaBrowserCompat$SearchResultReceiver.throttleFirst(700, TimeUnit.MILLISECONDS).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new PartnerAuthorizeService(this), getPartnerAuthorize.write);
    }

    public void onResume() {
        super.onResume();
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ActionBarContextView();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<startTask> list) {
        this.MediaMetadataCompat = list;
        BankingActionAdapter bankingActionAdapter = new BankingActionAdapter(this, getContext());
        ArrayList<startTask> arrayList = new ArrayList<>();
        bankingActionAdapter.MediaBrowserCompat$ItemReceiver = arrayList;
        arrayList.addAll(list);
        this.rvBankingActions.setAdapter(bankingActionAdapter);
        this.rvBankingActions.setNestedScrollingEnabled(true);
    }

    public final void read(Futures.C34104 r3) {
        this.tvHomeWelcomeUserName.setVisibility(TextUtils.isEmpty(r3.RatingCompat) ? 8 : 0);
        this.tvHomeWelcomeUserName.setText(r3.RatingCompat);
        this.tvHomeWelcomeHeadline.setText(r3.read);
        this.cusIvProfile.setImageUrl(r3.MediaBrowserCompat$ItemReceiver);
    }

    public final void IconCompatParcelizer(int i) {
        C10829Sizeof sizeof = this.bankingActionPresenter;
        getFrameColor getframecolor = new getFrameColor(i);
        if (sizeof.RatingCompat != null) {
            getframecolor.IconCompatParcelizer(sizeof.RatingCompat);
        }
    }

    public final void read(int i) {
        this.MediaBrowserCompat$SearchResultReceiver.onNext(Integer.valueOf(i));
    }

    private void read(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.putExtra("BANKING_SERVICE_TILE_TAG", true);
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
    }

    public final void write(boolean z) {
        int i = 8;
        this.llLayoutInternetError.setVisibility(z ? 8 : 0);
        RecyclerView recyclerView = this.rvBankingActions;
        if (z) {
            i = 0;
        }
        recyclerView.setVisibility(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == MediaDescriptionCompat && i2 == -1) {
            C10829Sizeof sizeof = this.bankingActionPresenter;
            getPassportSampleImage getpassportsampleimage = getPassportSampleImage.read;
            if (sizeof.RatingCompat != null) {
                getpassportsampleimage.IconCompatParcelizer(sizeof.RatingCompat);
                return;
            }
            return;
        }
        startTask starttask = this.MediaBrowserCompat$MediaItem;
        if (starttask != null && i == 7135 && i2 == -1) {
            read(starttask.IconCompatParcelizer);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_SHOW_BANKING_ACTION_TUTORIAL");
        getContext().sendBroadcast(intent);
    }

    public final void read() {
        if (getContext() != null) {
            SelectInvestmentActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
        }
    }

    @OnClick
    public void onTryAgainButtonClick() {
        this.bankingActionPresenter.write();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.bankingActionPresenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.RatingCompat;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final void MediaDescriptionCompat() {
        Context context = getContext();
        if (context != null) {
            if (this.bankingActionPresenter.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver() && !this.bankingActionPresenter.read.MediaBrowserCompat$ItemReceiver.write()) {
                FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(new File(this.bankingActionPresenter.read.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(), PlacesOptions.Builder.BG_BANKING_SERVICE.component), this.ivBgBankService, setLastBaselineToBottomHeight.write(context, R.drawable.landing_page_header));
            }
            this.cusIvProfile.setClickable(true);
            this.cusIvProfile.setOnClickListener(new requestEmailOtp(this));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.cusIvProfile.setBorderState(5);
        this.cusIvProfile.setClickable(true);
        this.cusIvProfile.IconCompatParcelizer();
        this.IconCompatParcelizer = false;
    }

    public final void IconCompatParcelizer() {
        this.cusIvProfile.setBorderState(2);
        this.cusIvProfile.setClickable(true);
        this.cusIvProfile.IconCompatParcelizer();
        this.IconCompatParcelizer = true;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.cusIvProfile.setBorderState(1);
        this.cusIvProfile.setClickable(true);
        this.cusIvProfile.IconCompatParcelizer();
        this.IconCompatParcelizer = false;
    }

    public final void write() {
        this.cusIvProfile.setClickable(false);
        this.cusIvProfile.setBorderState(0);
        this.IconCompatParcelizer = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        if (r0 != false) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void IconCompatParcelizer(com.scb.phone.view.fragment.bankingactions.BankingActionFragment r4, java.lang.Integer r5) {
        /*
            java.util.List<o.startTask> r0 = r4.MediaMetadataCompat
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c9
            java.util.List<o.startTask> r0 = r4.MediaMetadataCompat
            int r5 = r5.intValue()
            java.lang.Object r5 = r0.get(r5)
            o.startTask r5 = (p040o.startTask) r5
            r4.MediaBrowserCompat$MediaItem = r5
            java.lang.String r5 = r5.read
            if (r5 == 0) goto L_0x002f
            o.startTask r5 = r4.MediaBrowserCompat$MediaItem
            java.lang.String r5 = r5.read
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x002f
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            com.scb.phone.view.activity.BaseActivity r0 = (com.scb.phone.view.activity.BaseActivity) r0
            r0.mo13676d_(r5)
        L_0x002f:
            o.startTask r5 = r4.MediaBrowserCompat$MediaItem
            java.lang.Boolean r5 = r5.write
            if (r5 == 0) goto L_0x00c2
            o.startTask r5 = r4.MediaBrowserCompat$MediaItem
            java.lang.Boolean r5 = r5.write
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00c2
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            r0 = 0
            if (r5 == 0) goto L_0x0059
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            boolean r5 = r5 instanceof com.scb.phone.view.activity.BaseActivity
            if (r5 == 0) goto L_0x0059
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            com.scb.phone.view.activity.BaseActivity r5 = (com.scb.phone.view.activity.BaseActivity) r5
            boolean r5 = r5.setGroupDividerEnabled()
            goto L_0x005a
        L_0x0059:
            r5 = r0
        L_0x005a:
            if (r5 == 0) goto L_0x0076
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            if (r5 == 0) goto L_0x0074
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            boolean r5 = r5 instanceof com.scb.phone.view.activity.BaseActivity
            if (r5 == 0) goto L_0x0074
            androidx.fragment.app.FragmentActivity r5 = r4.getActivity()
            com.scb.phone.view.activity.BaseActivity r5 = (com.scb.phone.view.activity.BaseActivity) r5
            boolean r0 = r5.mo13022E_()
        L_0x0074:
            if (r0 == 0) goto L_0x00c2
        L_0x0076:
            android.content.Intent r5 = new android.content.Intent
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            java.lang.Class<com.scb.phone.view.activity.prelogin.PinLoginActivity> r1 = com.scb.phone.view.activity.prelogin.PinLoginActivity.class
            r5.<init>(r0, r1)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0092
            o.ZoomDocumentActivity r5 = p040o.setTapText.write(r0, r5)     // Catch:{ all -> 0x00bd }
            android.content.Intent r5 = r5.read()     // Catch:{ all -> 0x00bd }
        L_0x0092:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: "
            r2.<init>(r3)     // Catch:{ all -> 0x00bd }
            android.net.Uri r3 = r5.getData()     // Catch:{ all -> 0x00bd }
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "\n with context "
            r2.append(r3)     // Catch:{ all -> 0x00bd }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x00bd }
            r2.append(r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00bd }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r0)     // Catch:{ all -> 0x00bd }
            com.scb.phone.view.fragment.bankingactions.BankingActionFragment r4 = (com.scb.phone.view.fragment.bankingactions.BankingActionFragment) r4     // Catch:{ all -> 0x00bd }
            r0 = 7135(0x1bdf, float:9.998E-42)
            r4.startActivityForResult(r5, r0)     // Catch:{ all -> 0x00bd }
            return
        L_0x00bd:
            r4 = move-exception
            r4.printStackTrace()
            return
        L_0x00c2:
            o.startTask r5 = r4.MediaBrowserCompat$MediaItem
            java.lang.String r5 = r5.IconCompatParcelizer
            r4.read((java.lang.String) r5)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.bankingactions.BankingActionFragment.IconCompatParcelizer(com.scb.phone.view.fragment.bankingactions.BankingActionFragment, java.lang.Integer):void");
    }
}
