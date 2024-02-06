package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.hml.HmlOutcomeApproveFragment;
import com.scb.phone.view.fragment.hml.HmlOutcomeCounterOfferFragment;
import com.scb.phone.view.fragment.hml.HmlOutcomePendingFragment;
import com.scb.phone.view.fragment.hml.HmlOutcomePendingWithAIPFragment;
import com.scb.phone.view.fragment.hml.HmlOutcomeRejectFragment;
import com.scb.phone.view.fragment.hml.HmlOutcomeResubmissionFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerOutcomeApproveFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerOutcomePendingFragment;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerResubmissionFragment;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.ZSYR2K;
import p040o.access$2300;
import p040o.getCurrentImageIndex;
import p040o.getMRZ2;
import p040o.getNonFatalSessionFilesDir;
import p040o.handleUncaughtException;
import p040o.isHandlingException;
import p040o.listCompleteSessionFiles;
import p040o.onGetStartedClick;
import p040o.registerAnalyticsListener;
import p040o.setScrimVisibleHeightTrigger;
import p040o.submitAllReports;
import p040o.zzct;
import p040o.zzcz;
import p040o.zziu;

public class HmlApplicationOutcomeActivity extends BaseActivity implements getMRZ2 {
    @HmlPinActivity
    public getCurrentImageIndex presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String mo14478x50fd9e4a() {
        return "etb";
    }

    public void onBackPressed() {
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, boolean z) {
        Intent intent = new Intent(context, HmlApplicationOutcomeActivity.class);
        intent.putExtra("SHOW_PENDING_STATE", z);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setPrimaryBackground();
        setContentView(R.layout.f77952131493020);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getCurrentImageIndex getcurrentimageindex = this.presenter;
        boolean z = false;
        if (getIntent().getBooleanExtra("SHOW_PENDING_STATE", false)) {
            if (getcurrentimageindex.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getcurrentimageindex.RatingCompat.AlertController$RecycleListView();
            }
            setScrimVisibleHeightTrigger setscrimvisibleheighttrigger = getcurrentimageindex.IconCompatParcelizer;
            setscrimvisibleheighttrigger.write(setscrimvisibleheighttrigger.MediaBrowserCompat$ItemReceiver(), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzcz.zzh.zza>() {
                public final /* synthetic */ void onNext(Object obj) {
                    zzcz.zzh.zza zza = (zzcz.zzh.zza) obj;
                    super.onNext(zza);
                    getCurrentImageIndex getcurrentimageindex = getCurrentImageIndex.this;
                    getWordAtPoint getwordatpoint = new getWordAtPoint(this, zza);
                    if (getcurrentimageindex.RatingCompat != null) {
                        getwordatpoint.IconCompatParcelizer(getcurrentimageindex.RatingCompat);
                    }
                    getCurrentImageIndex.write(getCurrentImageIndex.this);
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    getCurrentImageIndex.this.MediaBrowserCompat$ItemReceiver(getCurrentImageIndex.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                }
            });
            return;
        }
        if (getcurrentimageindex.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getcurrentimageindex.RatingCompat.AlertController$RecycleListView();
        }
        getcurrentimageindex.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        getcurrentimageindex.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zziu.zza>() {
            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onNext(java.lang.Object r5) {
                /*
                    r4 = this;
                    o.zziu$zza r5 = (p040o.zziu.zza) r5
                    o.getCurrentImageIndex r0 = p040o.getCurrentImageIndex.this
                    p040o.getCurrentImageIndex.MediaBrowserCompat$CustomActionResultReceiver(r0)
                    java.lang.String r0 = r5.IconCompatParcelizer
                    int r1 = r0.hashCode()
                    r2 = 1
                    r3 = 0
                    switch(r1) {
                        case -1881380961: goto L_0x0059;
                        case -1785066387: goto L_0x004f;
                        case -1260652556: goto L_0x0045;
                        case -75067603: goto L_0x003b;
                        case 35394935: goto L_0x0031;
                        case 769348599: goto L_0x0027;
                        case 1487362715: goto L_0x001d;
                        case 1675813340: goto L_0x0013;
                        default: goto L_0x0012;
                    }
                L_0x0012:
                    goto L_0x0063
                L_0x0013:
                    java.lang.String r1 = "COUNTER"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0063
                    r0 = r2
                    goto L_0x0064
                L_0x001d:
                    java.lang.String r1 = "PENDING_LEADS_RESUBMIT"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0063
                    r0 = 4
                    goto L_0x0064
                L_0x0027:
                    java.lang.String r1 = "PENDING_WITH_AIP"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0063
                    r0 = 6
                    goto L_0x0064
                L_0x0031:
                    java.lang.String r1 = "PENDING"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0063
                    r0 = 3
                    goto L_0x0064
                L_0x003b:
                    java.lang.String r1 = "APPROVE"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0063
                    r0 = r3
                    goto L_0x0064
                L_0x0045:
                    java.lang.String r1 = "PENDING_OCR_RESUBMIT"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0063
                    r0 = 5
                    goto L_0x0064
                L_0x004f:
                    java.lang.String r1 = "UPSELL"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0063
                    r0 = 7
                    goto L_0x0064
                L_0x0059:
                    java.lang.String r1 = "REJECT"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0063
                    r0 = 2
                    goto L_0x0064
                L_0x0063:
                    r0 = -1
                L_0x0064:
                    switch(r0) {
                        case 0: goto L_0x00e6;
                        case 1: goto L_0x00d1;
                        case 2: goto L_0x00bc;
                        case 3: goto L_0x00a7;
                        case 4: goto L_0x0092;
                        case 5: goto L_0x0092;
                        case 6: goto L_0x007d;
                        case 7: goto L_0x0068;
                        default: goto L_0x0067;
                    }
                L_0x0067:
                    return
                L_0x0068:
                    o.getCurrentImageIndex r0 = p040o.getCurrentImageIndex.this
                    o.setTLx r1 = new o.setTLx
                    r1.<init>(r4, r5)
                    T r5 = r0.RatingCompat
                    if (r5 == 0) goto L_0x0074
                    goto L_0x0075
                L_0x0074:
                    r2 = r3
                L_0x0075:
                    if (r2 == 0) goto L_0x007c
                    T r5 = r0.RatingCompat
                    r1.IconCompatParcelizer(r5)
                L_0x007c:
                    return
                L_0x007d:
                    o.getCurrentImageIndex r0 = p040o.getCurrentImageIndex.this
                    o.setBRy r1 = new o.setBRy
                    r1.<init>(r4, r5)
                    T r5 = r0.RatingCompat
                    if (r5 == 0) goto L_0x0089
                    goto L_0x008a
                L_0x0089:
                    r2 = r3
                L_0x008a:
                    if (r2 == 0) goto L_0x0091
                    T r5 = r0.RatingCompat
                    r1.IconCompatParcelizer(r5)
                L_0x0091:
                    return
                L_0x0092:
                    o.getCurrentImageIndex r0 = p040o.getCurrentImageIndex.this
                    o.ColorDepth r1 = new o.ColorDepth
                    r1.<init>(r4, r5)
                    T r5 = r0.RatingCompat
                    if (r5 == 0) goto L_0x009e
                    goto L_0x009f
                L_0x009e:
                    r2 = r3
                L_0x009f:
                    if (r2 == 0) goto L_0x00a6
                    T r5 = r0.RatingCompat
                    r1.IconCompatParcelizer(r5)
                L_0x00a6:
                    return
                L_0x00a7:
                    o.getCurrentImageIndex r0 = p040o.getCurrentImageIndex.this
                    o.ae r1 = new o.ae
                    r1.<init>(r4, r5)
                    T r5 = r0.RatingCompat
                    if (r5 == 0) goto L_0x00b3
                    goto L_0x00b4
                L_0x00b3:
                    r2 = r3
                L_0x00b4:
                    if (r2 == 0) goto L_0x00bb
                    T r5 = r0.RatingCompat
                    r1.IconCompatParcelizer(r5)
                L_0x00bb:
                    return
                L_0x00bc:
                    o.getCurrentImageIndex r0 = p040o.getCurrentImageIndex.this
                    o.getWordsinRect r1 = new o.getWordsinRect
                    r1.<init>(r4, r5)
                    T r5 = r0.RatingCompat
                    if (r5 == 0) goto L_0x00c8
                    goto L_0x00c9
                L_0x00c8:
                    r2 = r3
                L_0x00c9:
                    if (r2 == 0) goto L_0x00d0
                    T r5 = r0.RatingCompat
                    r1.IconCompatParcelizer(r5)
                L_0x00d0:
                    return
                L_0x00d1:
                    o.getCurrentImageIndex r0 = p040o.getCurrentImageIndex.this
                    o.setTRy r1 = new o.setTRy
                    r1.<init>(r4, r5)
                    T r5 = r0.RatingCompat
                    if (r5 == 0) goto L_0x00dd
                    goto L_0x00de
                L_0x00dd:
                    r2 = r3
                L_0x00de:
                    if (r2 == 0) goto L_0x00e5
                    T r5 = r0.RatingCompat
                    r1.IconCompatParcelizer(r5)
                L_0x00e5:
                    return
                L_0x00e6:
                    o.getCurrentImageIndex r0 = p040o.getCurrentImageIndex.this
                    o.CropType r1 = new o.CropType
                    r1.<init>(r4, r5)
                    T r5 = r0.RatingCompat
                    if (r5 == 0) goto L_0x00f2
                    goto L_0x00f3
                L_0x00f2:
                    r2 = r3
                L_0x00f3:
                    if (r2 == 0) goto L_0x00fa
                    T r5 = r0.RatingCompat
                    r1.IconCompatParcelizer(r5)
                L_0x00fa:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.getCurrentImageIndex.C45414.onNext(java.lang.Object):void");
            }

            public final void onError(Throwable th) {
                getCurrentImageIndex.this.MediaBrowserCompat$ItemReceiver(getCurrentImageIndex.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new OcrWord(this)));
            }
        });
    }

    public final void IconCompatParcelizer(String str, Boolean bool) {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[3];
        zsyr2kArr[0] = new ZSYR2K("user_type", mo14478x50fd9e4a());
        zsyr2kArr[1] = new ZSYR2K("status", str);
        zsyr2kArr[2] = new ZSYR2K("loan_type", bool.booleanValue() ? "business_owner" : "consumer");
        this.scbAnalytics.write("p10x1_application_outcome", zsyr2kArr);
    }

    public void write(isHandlingException ishandlingexception, zzct.zza zza, Boolean bool) {
        IconCompatParcelizer("pending_application", bool);
        if (zza == zzct.zza.BUSINESS_OWNER) {
            getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, HmlBusinessOwnerOutcomePendingFragment.IconCompatParcelizer(ishandlingexception)).write();
            return;
        }
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, HmlOutcomePendingFragment.IconCompatParcelizer(ishandlingexception)).write();
    }

    public final void MediaBrowserCompat$ItemReceiver(listCompleteSessionFiles listcompletesessionfiles, Boolean bool) {
        IconCompatParcelizer("approval_in_principle", bool);
        HmlOutcomePendingWithAIPFragment.read read = HmlOutcomePendingWithAIPFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) listcompletesessionfiles, "display");
        HmlOutcomePendingWithAIPFragment hmlOutcomePendingWithAIPFragment = new HmlOutcomePendingWithAIPFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_PENDING_WITH_AIP_EXTRA", listcompletesessionfiles);
        hmlOutcomePendingWithAIPFragment.setArguments(bundle);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, hmlOutcomePendingWithAIPFragment).write();
    }

    public void IconCompatParcelizer(getNonFatalSessionFilesDir getnonfatalsessionfilesdir, Boolean bool, zzct.zza zza) {
        IconCompatParcelizer("approved_loan", bool);
        if (zza == zzct.zza.BUSINESS_OWNER) {
            HmlBusinessOwnerOutcomeApproveFragment.write write = HmlBusinessOwnerOutcomeApproveFragment.IconCompatParcelizer;
            onGetStartedClick.write((Object) getnonfatalsessionfilesdir, "display");
            HmlBusinessOwnerOutcomeApproveFragment hmlBusinessOwnerOutcomeApproveFragment = new HmlBusinessOwnerOutcomeApproveFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("HML_OUTCOME_APPROVE_EXTRA", getnonfatalsessionfilesdir);
            hmlBusinessOwnerOutcomeApproveFragment.setArguments(bundle);
            getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, hmlBusinessOwnerOutcomeApproveFragment).write();
            return;
        }
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, HmlOutcomeApproveFragment.MediaBrowserCompat$ItemReceiver(getnonfatalsessionfilesdir)).write();
    }

    public void read(handleUncaughtException handleuncaughtexception, Boolean bool) {
        IconCompatParcelizer("counter_offer", bool);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, HmlOutcomeCounterOfferFragment.IconCompatParcelizer(handleuncaughtexception)).write();
    }

    public final void MediaBrowserCompat$ItemReceiver(handleUncaughtException handleuncaughtexception, Boolean bool) {
        IconCompatParcelizer("counter_offer_upsell", bool);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, HmlOutcomeCounterOfferFragment.write(handleuncaughtexception, true)).write();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(registerAnalyticsListener registeranalyticslistener, zzct.zza zza, Boolean bool) {
        IconCompatParcelizer("document_resubmission", bool);
        if (zza == zzct.zza.BUSINESS_OWNER) {
            HmlBusinessOwnerResubmissionFragment.IconCompatParcelizer iconCompatParcelizer = HmlBusinessOwnerResubmissionFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) registeranalyticslistener, "display");
            HmlBusinessOwnerResubmissionFragment hmlBusinessOwnerResubmissionFragment = new HmlBusinessOwnerResubmissionFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("HML_OUTCOME_RESUBMISSION_EXTRA", registeranalyticslistener);
            hmlBusinessOwnerResubmissionFragment.setArguments(bundle);
            getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, hmlBusinessOwnerResubmissionFragment).write();
            return;
        }
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, HmlOutcomeResubmissionFragment.IconCompatParcelizer(registeranalyticslistener)).write();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(submitAllReports submitallreports, zzct.zza zza, Boolean bool) {
        IconCompatParcelizer("rejected_loan", bool);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, HmlOutcomeRejectFragment.IconCompatParcelizer(submitallreports, zza)).write();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        RatingCompat(false);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
