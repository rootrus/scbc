package com.scb.phone.view.fragment.moreoptions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.calendar.CalendarLandingActivity;
import com.scb.phone.view.activity.help.HelpActivity;
import com.scb.phone.view.activity.p038tc.EasyAppTermsAndConditionsActivity;
import com.scb.phone.view.activity.profilemanagement.ProfileManagementActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingActivity;
import com.scb.phone.view.adapter.moreoptions.MoreOptionsAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.FragmentBuilder_BindBaseReviewFragment;
import p040o.HmlPinActivity;
import p040o.ICheckExtractionServer;
import p040o.MyECouponActivity_ViewBinding;
import p040o.UrlTileProvider;
import p040o.getDiskUsed;
import p040o.getEventAppSize;
import p040o.getEventAppSize$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getPaymentBillPartner;
import p040o.lambda$deleteFinalizedReport$2;
import p040o.setTapText;
import p040o.zzmd;
import p040o.zzwl;

public class MoreOptionsFragment extends BaseFragment implements ICheckExtractionServer, FragmentBuilder_BindBaseReviewFragment {
    @BindView
    RecyclerView mRecyclerView;
    @HmlPinActivity
    public getEventAppSize moreOptionsPresenter;

    public static MoreOptionsFragment IconCompatParcelizer(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.scb.phone.EXTRA_GIFTING_ENABLE", z);
        MoreOptionsFragment moreOptionsFragment = new MoreOptionsFragment();
        moreOptionsFragment.setArguments(bundle);
        return moreOptionsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zzmd.zzm.zzb.zza zza;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88522131494079, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        ((HomeActivity) getActivity()).MediaMetadataCompat = true;
        this.moreOptionsPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setTransitioning();
        ActionBarContextView();
        ParcelableVolumeInfo(getString(R.string.more_options));
        if (!(getArguments() == null || getContext() == null)) {
            getContext();
            this.mRecyclerView.setLayoutManager(new LinearLayoutManager());
            RecyclerView recyclerView = this.mRecyclerView;
            Context context = getContext();
            boolean z2 = getArguments().getBoolean("com.scb.phone.EXTRA_GIFTING_ENABLE");
            zzmd.zzm.zzb.zza zza2 = zzmd.zzm.zzb.zza.JURISTIC;
            if (getActivity() instanceof PreLoadCheckActivity) {
                zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
            } else {
                zza = null;
            }
            if (zza2 == zza) {
                z = true;
            }
            recyclerView.setAdapter(new MoreOptionsAdapter(context, this, z2, z));
        }
        return inflate;
    }

    public void onDestroy() {
        this.moreOptionsPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ActionBarContextView();
        ParcelableVolumeInfo(getString(R.string.more_options));
    }

    /* renamed from: com.scb.phone.view.fragment.moreoptions.MoreOptionsFragment$5 */
    static /* synthetic */ class C60905 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.getPaymentBillPartner[] r0 = p040o.getPaymentBillPartner.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.getPaymentBillPartner r1 = p040o.getPaymentBillPartner.GIFTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getPaymentBillPartner r1 = p040o.getPaymentBillPartner.CALENDAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getPaymentBillPartner r1 = p040o.getPaymentBillPartner.PROFILE_MANAGEMENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getPaymentBillPartner r1 = p040o.getPaymentBillPartner.HELP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                o.getPaymentBillPartner r1 = p040o.getPaymentBillPartner.SECURITY_TIPS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.getPaymentBillPartner r1 = p040o.getPaymentBillPartner.TERMS_CONDITIONS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.getPaymentBillPartner r1 = p040o.getPaymentBillPartner.PRIVACY_MANAGEMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.moreoptions.MoreOptionsFragment.C60905.<clinit>():void");
        }
    }

    public final void write(getPaymentBillPartner getpaymentbillpartner) {
        zzwl zzwl;
        zzwl zzwl2;
        zzwl zzwl3;
        boolean z = true;
        Intent intent = null;
        int i = 10001;
        switch (C60905.write[getpaymentbillpartner.ordinal()]) {
            case 1:
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("action_mo_gift_box");
                }
                intent = new Intent(getContext(), GiftingActivity.class);
                break;
            case 2:
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("action_mo_calendar");
                }
                getEventAppSize geteventappsize = this.moreOptionsPresenter;
                if (geteventappsize.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    geteventappsize.RatingCompat.AlertController$RecycleListView();
                }
                geteventappsize.read.IconCompatParcelizer();
                geteventappsize.read.IconCompatParcelizer(new getEventAppSize$MediaBrowserCompat$CustomActionResultReceiver(geteventappsize, (byte) 0));
                break;
            case 3:
                i = 10002;
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("action_mo_settings");
                }
                intent = new Intent(getContext(), ProfileManagementActivity.class);
                break;
            case 4:
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("action_mo_help");
                }
                intent = new Intent(getContext(), HelpActivity.class);
                break;
            case 5:
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("action_mo_security_tips");
                }
                getEventAppSize geteventappsize2 = this.moreOptionsPresenter;
                String stackedBackground = setStackedBackground();
                UrlTileProvider urlTileProvider = geteventappsize2.IconCompatParcelizer;
                if (urlTileProvider.write.write() == null) {
                    zzwl = null;
                } else {
                    zzwl = urlTileProvider.write.write().IconCompatParcelizer;
                }
                if (zzwl != null) {
                    UrlTileProvider urlTileProvider2 = geteventappsize2.IconCompatParcelizer;
                    if (urlTileProvider2.write.write() == null) {
                        zzwl2 = null;
                    } else {
                        zzwl2 = urlTileProvider2.write.write().IconCompatParcelizer;
                    }
                    if (zzwl2.read != null) {
                        UrlTileProvider urlTileProvider3 = geteventappsize2.IconCompatParcelizer;
                        if (urlTileProvider3.write.write() == null) {
                            zzwl3 = null;
                        } else {
                            zzwl3 = urlTileProvider3.write.write().IconCompatParcelizer;
                        }
                        if (zzwl3.IconCompatParcelizer != null) {
                            lambda$deleteFinalizedReport$2 lambda_deletefinalizedreport_2 = new lambda$deleteFinalizedReport$2(geteventappsize2, stackedBackground);
                            if (geteventappsize2.RatingCompat == null) {
                                z = false;
                            }
                            if (z) {
                                lambda_deletefinalizedreport_2.IconCompatParcelizer(geteventappsize2.RatingCompat);
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("action_mo_tc");
                }
                EasyAppTermsAndConditionsActivity.IconCompatParcelizer(getContext());
                break;
            case 7:
                if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("data_privacy_management");
                }
                this.moreOptionsPresenter.write();
                break;
        }
        if (intent != null) {
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
                startActivityForResult(intent, i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
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
        } catch (ActivityNotFoundException | NullPointerException unused) {
            this.moreOptionsPresenter.write((int) R.string.error_generic_resource);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onLogoutButton() {
        if (getActivity() instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) getActivity();
            baseActivity.mo13676d_("action_mo_logout");
            baseActivity.setCustomView();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getDiskUsed getdiskused) {
        Intent intent = new Intent(getContext(), CalendarLandingActivity.class);
        intent.putExtra("SCHEDULE_DATA", getdiskused);
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
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FragmentActivity activity = getActivity();
        if (i == 10002 && i2 == -1 && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).MediaBrowserCompat$ItemReceiver = true;
        }
    }

    public final void read(String str) {
        if (!(str == null || str.length() == 0)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
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
        }
    }
}
