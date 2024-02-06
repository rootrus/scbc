package com.scb.phone.view.activity.partner;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.investment.InvestmentDetailsActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOnboardingLandingActivity;
import com.scb.phone.view.activity.investment.roboadvisor.C5652x8cbd2afd;
import com.scb.phone.view.activity.investment.roboadvisor.RoboAdvisorLandingActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountInfoActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.investment.scbs.ScbsLandingActivity;
import com.scb.phone.view.activity.landingpage.PartnerWebViewActivity;
import com.scb.phone.view.activity.p038tc.MutualFundTermsAndConditionsActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import java.util.Map;
import org.bouncycastle.i18n.MessageBundle;
import p040o.C4310dy;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlNdidSelectIdpActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.ListOfException;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlacePhotoMetadataResult;
import p040o.access$2300;
import p040o.dy$MediaSessionCompat$QueueItem;
import p040o.forEachSubtract;
import p040o.isCrashed;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setGenerator;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class PartnerLandingActivity extends BaseActivity implements ListOfException, PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver {
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public C4310dy presenter;
    @BindView
    public RecyclerView rvSubTile;
    @HmlPinActivity
    public forEachSubtract tracker;
    @BindView
    public TextView tvDisclaimer;
    @BindView
    public TextView tvDisclaimerSticky;

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, long j) {
        onGetStartedClick.write((Object) context, "context");
        Intent putExtra = new Intent(context, PartnerLandingActivity.class).putExtra(Name.MARK, j);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PartnerL…a).putExtra(EXTRA_ID, id)");
        return putExtra;
    }

    private static final /* synthetic */ void IconCompatParcelizer(Context context, Intent intent) {
        try {
            Intent read2 = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            ((PartnerLandingActivity) context).startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public PartnerLandingActivity() {
        FundActionsSuccessActivity mediaMetadataCompat = new MediaMetadataCompat(this);
        onGetStartedClick.write((Object) mediaMetadataCompat, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(mediaMetadataCompat);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79202131493145);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        RecyclerView recyclerView = this.rvSubTile;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvSubTile");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager());
        boolean z = false;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((PartnerLandingAdapter) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
        long longExtra = getIntent().getLongExtra(Name.MARK, -1);
        C4310dy dyVar = this.presenter;
        if (dyVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dyVar.MediaBrowserCompat$ItemReceiver(this);
        C4310dy dyVar2 = this.presenter;
        if (dyVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        PlacePhotoMetadataResult read2 = dyVar2.read(longExtra);
        if (read2 != null) {
            List<PlacePhotoMetadataResult> list = read2.setGroupDividerEnabled;
            if (list == null) {
                list = HmlNationalIdActivity.IconCompatParcelizer;
            }
            writeUInt64NoTag.IconCompatParcelizer dy_mediasessioncompat_queueitem = new dy$MediaSessionCompat$QueueItem(dyVar2, read2, dyVar2.IconCompatParcelizer.IconCompatParcelizer((List<? extends PlacePhotoMetadataResult>) list, dyVar2.read.write.read() != null), list);
            if (dyVar2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                dy_mediasessioncompat_queueitem.IconCompatParcelizer(dyVar2.RatingCompat);
                return;
            }
            return;
        }
        dyVar2.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic, access$2300.write.NAVIGATE_BACK);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [o.dw] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(p040o.setGenerator r8) {
        /*
            r7 = this;
            java.lang.String r0 = "display"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            o.dy r0 = r7.presenter
            if (r0 != 0) goto L_0x000e
            java.lang.String r1 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x000e:
            java.lang.String r1 = "tile"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r1)
            boolean r1 = r8 instanceof p040o.setCrashed
            if (r1 == 0) goto L_0x00ea
            o.PlacePhotoMetadataResult r8 = r8.MediaMetadataCompat
            r0.MediaBrowserCompat$ItemReceiver = r8
            boolean r1 = r8.MediaBrowserCompat$SearchResultReceiver
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002e
            o.StreetViewPanoramaOrientation r1 = r0.write
            o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r1 = r1.write
            boolean r1 = r1.setShortcut()
            if (r1 != 0) goto L_0x002e
            r1 = r3
            goto L_0x002f
        L_0x002e:
            r1 = r2
        L_0x002f:
            if (r1 == 0) goto L_0x0042
            o.dy$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver r8 = p040o.C4314xdddf0c3b.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r8 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r8
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x003a
            r2 = r3
        L_0x003a:
            if (r2 == 0) goto L_0x0041
            T r0 = r0.RatingCompat
            r8.IconCompatParcelizer(r0)
        L_0x0041:
            return
        L_0x0042:
            java.lang.String r1 = r8.setShortcut
            o.getGeoDataClient r4 = p040o.getGeoDataClient.DEEPLINK
            java.lang.String r4 = r4.name()
            boolean r4 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x0066
            o.dy$MediaBrowserCompat$ItemReceiver r1 = new o.dy$MediaBrowserCompat$ItemReceiver
            r1.<init>(r8)
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r4 = r0.RatingCompat
            if (r4 == 0) goto L_0x005d
            r4 = r3
            goto L_0x005e
        L_0x005d:
            r4 = r2
        L_0x005e:
            if (r4 == 0) goto L_0x00a2
            T r4 = r0.RatingCompat
            r1.IconCompatParcelizer(r4)
            goto L_0x00a2
        L_0x0066:
            o.getGeoDataClient r4 = p040o.getGeoDataClient.FUNCTION
            java.lang.String r4 = r4.name()
            boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r4)
            if (r1 == 0) goto L_0x00a2
            java.lang.String r1 = r8.MediaSessionCompat$ResultReceiverWrapper
            boolean r1 = p040o.C4310dy.IconCompatParcelizer(r1)
            if (r1 == 0) goto L_0x00a2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r5 = r8.MediaDescriptionCompat
            if (r5 != 0) goto L_0x0088
            java.lang.String r5 = ""
        L_0x0088:
            java.lang.String r6 = "feature"
            r4.put(r6, r5)
            o.dy$read r4 = new o.dy$read
            r4.<init>(r1)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x009a
            r1 = r3
            goto L_0x009b
        L_0x009a:
            r1 = r2
        L_0x009b:
            if (r1 == 0) goto L_0x00a2
            T r1 = r0.RatingCompat
            r4.IconCompatParcelizer(r1)
        L_0x00a2:
            java.lang.String r1 = r8.setShortcut
            o.getGeoDataClient r4 = p040o.getGeoDataClient.DEEPLINK
            java.lang.String r4 = r4.name()
            boolean r4 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x00b6
            int r8 = r8.setPopupCallback
            if (r8 != r3) goto L_0x00c9
            r8 = r3
            goto L_0x00ca
        L_0x00b6:
            o.getGeoDataClient r4 = p040o.getGeoDataClient.FUNCTION
            java.lang.String r4 = r4.name()
            boolean r1 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r1, (java.lang.Object) r4)
            if (r1 == 0) goto L_0x00c9
            java.lang.String r8 = r8.MediaSessionCompat$ResultReceiverWrapper
            boolean r8 = p040o.C4310dy.IconCompatParcelizer(r8)
            goto L_0x00ca
        L_0x00c9:
            r8 = r2
        L_0x00ca:
            if (r8 == 0) goto L_0x00e7
            o.dy$ParcelableVolumeInfo r8 = p040o.C4310dy.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r8 = (p040o.FundFactSheetActivity) r8
            if (r8 == 0) goto L_0x00d8
            o.dw r1 = new o.dw
            r1.<init>(r8)
            r8 = r1
        L_0x00d8:
            o.writeUInt64NoTag$IconCompatParcelizer r8 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r8
            T r1 = r0.RatingCompat
            if (r1 == 0) goto L_0x00df
            r2 = r3
        L_0x00df:
            if (r2 == 0) goto L_0x00e6
            T r0 = r0.RatingCompat
            r8.IconCompatParcelizer(r0)
        L_0x00e6:
            return
        L_0x00e7:
            r0.write()
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.PartnerLandingActivity.MediaBrowserCompat$ItemReceiver(o.setGenerator):void");
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.containsKey("STATE_SELECTED_TILE_ID")) {
            C4310dy dyVar = this.presenter;
            if (dyVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            dyVar.MediaBrowserCompat$ItemReceiver = dyVar.read(bundle.getLong("STATE_SELECTED_TILE_ID"));
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        long j;
        onGetStartedClick.write((Object) bundle, "outState");
        super.onSaveInstanceState(bundle);
        C4310dy dyVar = this.presenter;
        if (dyVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        PlacePhotoMetadataResult placePhotoMetadataResult = dyVar.MediaBrowserCompat$ItemReceiver;
        if (placePhotoMetadataResult != null) {
            j = placePhotoMetadataResult.AppCompatViewInflater;
        } else {
            j = -1;
        }
        bundle.putLong("STATE_SELECTED_TILE_ID", j);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        MediaSessionCompat$QueueItem(str);
    }

    public final void MediaDescriptionCompat(String str) {
        onGetStartedClick.write((Object) str, "disclaimerSticky");
        TextView textView = this.tvDisclaimerSticky;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDisclaimerSticky");
        }
        textView.setText(str);
        TextView textView2 = this.tvDisclaimerSticky;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDisclaimerSticky");
        }
        textView2.setVisibility(0);
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "disclaimer");
        TextView textView = this.tvDisclaimer;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDisclaimer");
        }
        textView.setText(str);
        TextView textView2 = this.tvDisclaimer;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDisclaimer");
        }
        textView2.setVisibility(0);
    }

    public final void MediaMetadataCompat(String str) {
        onGetStartedClick.write((Object) str, "eventName");
        IconCompatParcelizer(str, (Map<String, String>) null);
    }

    public final void IconCompatParcelizer(String str, Map<String, String> map) {
        onGetStartedClick.write((Object) str, "eventName");
        forEachSubtract foreachsubtract = this.tracker;
        if (foreachsubtract == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        foreachsubtract.MediaBrowserCompat$ItemReceiver();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                String str3 = (String) next.getValue();
                forEachSubtract foreachsubtract2 = this.tracker;
                if (foreachsubtract2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
                }
                foreachsubtract2.read(str2, str3);
            }
        }
        forEachSubtract foreachsubtract3 = this.tracker;
        if (foreachsubtract3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        foreachsubtract3.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, str);
    }

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ PartnerLandingActivity write;

        read(PartnerLandingActivity partnerLandingActivity, String str) {
            this.write = partnerLandingActivity;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            this.write.write(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.auto_partnership_landing_being_redirected_external_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.auto_partnership_landing_being_redirected_external_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.confirm), new read(this, str));
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.cancel), C5682x32c36c8b.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$ItemReceiver.setCancelable(false);
        MediaBrowserCompat$ItemReceiver.show();
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.auto_save_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(i);
        if (!(string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.auto_save_dialog_go_settings), new PartnerLandingActivity$MediaBrowserCompat$ItemReceiver(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.auto_save_dialog_cancel), IconCompatParcelizer.MediaBrowserCompat$ItemReceiver).show();
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [o.dw] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaDescriptionCompat() {
        /*
            r3 = this;
            o.dy r0 = r3.presenter
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "presenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r1)
        L_0x0009:
            boolean r1 = r3.setGroupDividerEnabled()
            boolean r2 = r3.mo13022E_()
            if (r1 == 0) goto L_0x0019
            if (r2 != 0) goto L_0x0019
            r0.write()
            return
        L_0x0019:
            o.dy$AlertController$RecycleListView r1 = p040o.dy$AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
            if (r1 == 0) goto L_0x0025
            o.dw r2 = new o.dw
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 == 0) goto L_0x0035
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.PartnerLandingActivity.MediaDescriptionCompat():void");
    }

    public final void read() {
        super.startActivityForResult(PinLoginActivity.write((Context) this), 1234);
        setSubtitle();
    }

    public final void IconCompatParcelizer(String str) {
        PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver partnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaDescriptionCompat;
        Intent MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this, str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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

    public final void write(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, intent).read();
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
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        } catch (NullPointerException e2) {
            onCheckBoxClick.IconCompatParcelizer(e2);
        }
    }

    public final void write() {
        Intent read2 = InvestmentDetailsActivity.read(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent write2 = FundOnboardingLandingActivity.write(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, write2).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        MutualFundTermsAndConditionsActivity.IconCompatParcelizer iconCompatParcelizer = MutualFundTermsAndConditionsActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, MutualFundTermsAndConditionsActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        MutualFundTermsAndConditionsActivity.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(context, intent);
    }

    public final void IconCompatParcelizer() {
        AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver addAccountInfoActivity$MediaBrowserCompat$ItemReceiver = AddAccountInfoActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, AddAccountInfoActivity.class);
        intent.putExtra("EXTRA_FLOW_TYPE", 0);
        IntentTidInjectionContextAspect.aspectOf();
        AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver.write(context, intent);
    }

    public final void MediaMetadataCompat() {
        Intent read2 = ScbsLandingActivity.read(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        C5652x8cbd2afd roboAdvisorLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = RoboAdvisorLandingActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, RoboAdvisorLandingActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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

    public final void MediaBrowserCompat$ItemReceiver(String str, long j, int i) {
        onGetStartedClick.write((Object) str, "applicationURL");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, intent).read();
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
        } catch (ActivityNotFoundException unused) {
            write(j, i);
        }
    }

    public final void write(long j, int i) {
        Intent putExtra = new Intent(this, PartnerWebViewActivity.class).putExtra("com.scb.phone.EXTRA_PARTNER_ID", j).putExtra("EXTRA_REQUIRE_LOGIN", i);
        IntentTidInjectionContextAspect.aspectOf();
        IconCompatParcelizer((Context) this, putExtra);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1234 && i2 == -1) {
            C4310dy dyVar = this.presenter;
            if (dyVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            dyVar.write();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onDestroy() {
        C4310dy dyVar = this.presenter;
        if (dyVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dyVar.onDestroy();
        super.onDestroy();
    }

    public static final class write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public boolean RatingCompat;
        public String read;
        public String write;

        private write() {
        }

        public write(String str, String str2, String str3, String str4, String str5) {
            this.read = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
            this.MediaBrowserCompat$ItemReceiver = str4;
            this.write = str5;
            this.RatingCompat = true;
        }
    }

    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<PartnerLandingAdapter> {
        private /* synthetic */ PartnerLandingActivity IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(PartnerLandingActivity partnerLandingActivity) {
            super(0);
            this.IconCompatParcelizer = partnerLandingActivity;
        }

        public final /* synthetic */ Object invoke() {
            return new PartnerLandingAdapter(this.IconCompatParcelizer);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(PartnerLandingActivity partnerLandingActivity) {
        Intent addFlags = new Intent(partnerLandingActivity, HomeActivity.class).putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.more_options_tab).addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(partnerLandingActivity, addFlags).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(partnerLandingActivity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            partnerLandingActivity.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(isCrashed iscrashed) {
        onGetStartedClick.write((Object) iscrashed, "display");
        IconCompatParcelizer("highlight_banner_subtile", (Map<String, String>) HmlNdidSelectIdpActivity.read((HmlVerifyEmailSuccessfulActivity<? extends K, ? extends V>[]) new HmlVerifyEmailSuccessfulActivity[]{new HmlVerifyEmailSuccessfulActivity("user_action", "click_link"), new HmlVerifyEmailSuccessfulActivity("ads_id", iscrashed.write), new HmlVerifyEmailSuccessfulActivity("ads_name", iscrashed.MediaBrowserCompat$ItemReceiver)}));
        write(iscrashed.read);
    }

    public final void IconCompatParcelizer(List<? extends setGenerator> list) {
        onGetStartedClick.write((Object) list, "list");
        PartnerLandingAdapter partnerLandingAdapter = (PartnerLandingAdapter) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        onGetStartedClick.write((Object) list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        partnerLandingAdapter.read = list;
        partnerLandingAdapter.IconCompatParcelizer.write();
    }
}
