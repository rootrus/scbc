package com.scb.phone.view.activity.partner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.investment.InvestmentDetailsActivity;
import com.scb.phone.view.activity.investment.assessment.AssessmentPopupActivity;
import com.scb.phone.view.activity.investment.assessment.RiskLevelAssessmentActivity;
import com.scb.phone.view.activity.investment.funddetails.InvestmentFundDetailsActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOnboardingLandingActivity;
import com.scb.phone.view.activity.investment.purchase.FundPurchaseLandingActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountInfoActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.webview.SCBWebView;
import com.scb.phone.view.custom.webview.SCBWebView$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AlertController$RecycleListView;
import p040o.C4305dx;
import p040o.CrashlyticsCore;
import p040o.FragmentBuilder_BindEasycashLandingEmptyFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.InstallIdProvider;
import p040o.LinkedListMultimap;
import p040o.LocalProjectProvider;
import p040o.LocationServices;
import p040o.MyECouponActivity_ViewBinding;
import p040o.constant;
import p040o.constant$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.doBackgroundInitializationAsync;
import p040o.dx$AlertController$RecycleListView;
import p040o.dx$AppCompatDelegateImpl$ListMenuDecorView;
import p040o.dx$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.dx$MediaBrowserCompat$ItemReceiver;
import p040o.dx$MediaBrowserCompat$MediaItem;
import p040o.dx$MediaBrowserCompat$SearchResultReceiver;
import p040o.forEachSrcAtop;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzmd;
import p040o.zzvf;

public final class PartnerDiscoverWebViewActivity extends SCBUniversalWebViewActivity implements LocalProjectProvider.write {
    private boolean MediaBrowserCompat$MediaItem;
    private forEachSrcAtop MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public C4305dx presenterDiscoverWebView;

    public static final Intent read(Context context, String str, String str2) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, PartnerDiscoverWebViewActivity.class);
        intent.putExtra(ImagesContract.URL, str);
        intent.putExtra(MessageBundle.TITLE_ENTRY, str2);
        return intent;
    }

    public static final class write {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public String read;
        public String write;

        private write() {
        }

        public write(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaDescriptionCompat = str2;
            this.MediaBrowserCompat$MediaItem = str3;
            this.IconCompatParcelizer = str4;
            this.MediaMetadataCompat = str6;
            this.MediaBrowserCompat$CustomActionResultReceiver = str7;
            this.read = str5;
            this.write = str8;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaBrowserCompat$SearchResultReceiver = new forEachSrcAtop();
        C4305dx dxVar = this.presenterDiscoverWebView;
        if (dxVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
        }
        dxVar.MediaBrowserCompat$ItemReceiver(this);
        if (this.presenterDiscoverWebView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "data");
        SCBWebView sCBWebView = this.partnerWebView;
        FragmentBuilder_BindEasycashLandingEmptyFragment partnerDiscoverWebViewActivity$MediaBrowserCompat$CustomActionResultReceiver = new C8882x8876c5a4();
        onGetStartedClick.write((Object) partnerDiscoverWebViewActivity$MediaBrowserCompat$CustomActionResultReceiver, "webViewScriptConfig");
        onGetStartedClick.write((Object) str, "data");
        sCBWebView.post(new SCBWebView$MediaBrowserCompat$ItemReceiver(sCBWebView, str, partnerDiscoverWebViewActivity$MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "data");
        SCBWebView sCBWebView = this.partnerWebView;
        FragmentBuilder_BindEasycashLandingEmptyFragment partnerDiscoverWebViewActivity$MediaBrowserCompat$ItemReceiver = new PartnerDiscoverWebViewActivity$MediaBrowserCompat$ItemReceiver();
        onGetStartedClick.write((Object) partnerDiscoverWebViewActivity$MediaBrowserCompat$ItemReceiver, "webViewScriptConfig");
        onGetStartedClick.write((Object) str, "data");
        sCBWebView.post(new SCBWebView$MediaBrowserCompat$ItemReceiver(sCBWebView, str, partnerDiscoverWebViewActivity$MediaBrowserCompat$ItemReceiver));
    }

    public static final class read implements FragmentBuilder_BindEasycashLandingEmptyFragment {
        public final String IconCompatParcelizer() {
            return "onInvestFundSucceeded";
        }

        public final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver() {
            return "WebJS";
        }

        public final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(String str) {
            return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((FragmentBuilder_BindEasycashLandingEmptyFragment) this, str);
        }

        public final /* synthetic */ String write() {
            return "";
        }

        read() {
        }

        public final /* synthetic */ String read() {
            return MediaBrowserCompat$CustomActionResultReceiver(write());
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        SCBWebView.MediaBrowserCompat$CustomActionResultReceiver(this.partnerWebView, new read());
    }

    public final void MediaMetadataCompat() {
        forEachSrcAtop foreachsrcatop = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.read, forEachSrcAtop.write.write);
        forEachSrcAtop foreachsrcatop2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, forEachSrcAtop.read.RatingCompat);
    }

    public final void MediaDescriptionCompat() {
        forEachSrcAtop foreachsrcatop = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.read, forEachSrcAtop.write.write);
        forEachSrcAtop foreachsrcatop2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, forEachSrcAtop.read.read);
    }

    public final void RatingCompat() {
        forEachSrcAtop foreachsrcatop = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.read, forEachSrcAtop.write.MediaBrowserCompat$ItemReceiver);
        forEachSrcAtop foreachsrcatop2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, forEachSrcAtop.read.RatingCompat);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        forEachSrcAtop foreachsrcatop = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.read, forEachSrcAtop.write.MediaBrowserCompat$ItemReceiver);
        forEachSrcAtop foreachsrcatop2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, forEachSrcAtop.read.read);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(doBackgroundInitializationAsync dobackgroundinitializationasync, int i) {
        onGetStartedClick.write((Object) dobackgroundinitializationasync, "investmentDetailsClientDisplay");
        Intent read2 = InvestmentFundDetailsActivity.read(this, dobackgroundinitializationasync, i);
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

    public final void write() {
        FundPurchaseLandingActivity.IconCompatParcelizer(this);
    }

    public final void read(InstallIdProvider installIdProvider) {
        FundPurchaseLandingActivity.read(this, installIdProvider);
    }

    public final void read(HashMap<String, Object> hashMap) {
        Bundle extras;
        onGetStartedClick.write((Object) hashMap, "investFundMap");
        Intent intent = getIntent();
        boolean z = false;
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            z = extras.getBoolean("IS_NEED_HISTORY_STACK", false);
        }
        PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver partnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaDescriptionCompat;
        Intent MediaBrowserCompat$CustomActionResultReceiver = PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this, hashMap, z, (Intent) null);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(int i) {
        AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver addAccountInfoActivity$MediaBrowserCompat$ItemReceiver = AddAccountInfoActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, AddAccountInfoActivity.class);
        intent.putExtra("EXTRA_FLOW_TYPE", i);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(this, FundOnboardingLandingActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsCore.C32441 r4) {
        Intent MediaBrowserCompat$ItemReceiver = AssessmentPopupActivity.MediaBrowserCompat$ItemReceiver(this, r4);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 321);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "userName");
        Intent MediaBrowserCompat$CustomActionResultReceiver = RiskLevelAssessmentActivity.MediaBrowserCompat$CustomActionResultReceiver(this, str);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 322);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HomeActivity.write((Context) this, true);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i != 321) {
            if (i != 322) {
                if (i == 2000) {
                    SCBWebView.MediaBrowserCompat$CustomActionResultReceiver(this.partnerWebView, new read());
                }
            } else if (i2 == -1) {
                C4305dx dxVar = this.presenterDiscoverWebView;
                if (dxVar == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
                }
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = dx$AppCompatDelegateImpl$ListMenuDecorView.IconCompatParcelizer;
                if (dxVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(dxVar.RatingCompat);
                }
            } else if (intent != null && intent.getBooleanExtra("showPopup", false)) {
                C4305dx dxVar2 = this.presenterDiscoverWebView;
                if (dxVar2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
                }
                LocationServices locationServices = dxVar2.IconCompatParcelizer;
                if (locationServices == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("investmentNow");
                }
                CrashlyticsCore.C32441 r9 = dxVar2.read;
                if (r9 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("investmentProfileDisplay");
                }
                dxVar2.MediaBrowserCompat$CustomActionResultReceiver(locationServices, r9);
            }
        } else if (i2 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra("riskPopupResult") : null;
            if (stringExtra != null) {
                int hashCode = stringExtra.hashCode();
                if (hashCode != -250841563) {
                    if (hashCode == 197473256 && stringExtra.equals("selectLevel")) {
                        C4305dx dxVar3 = this.presenterDiscoverWebView;
                        if (dxVar3 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
                        }
                        CrashlyticsCore.C32441 r8 = dxVar3.read;
                        if (r8 == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver("investmentProfileDisplay");
                        }
                        String str = r8.IconCompatParcelizer;
                        CharSequence charSequence = str;
                        if (charSequence == null || charSequence.length() == 0) {
                            writeUInt64NoTag.IconCompatParcelizer appCompatDialogFragment = new C4305dx.AppCompatDialogFragment(dxVar3.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(dxVar3.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.AppCompatActivity()));
                            if (dxVar3.RatingCompat == null) {
                                z = false;
                            }
                            if (z) {
                                appCompatDialogFragment.IconCompatParcelizer(dxVar3.RatingCompat);
                                return;
                            }
                            return;
                        }
                        writeUInt64NoTag.IconCompatParcelizer setcontentview = new C4305dx.setContentView(str);
                        if (dxVar3.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            setcontentview.IconCompatParcelizer(dxVar3.RatingCompat);
                        }
                    }
                } else if (stringExtra.equals("refreshInvestments")) {
                    C4305dx dxVar4 = this.presenterDiscoverWebView;
                    if (dxVar4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
                    }
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C4305dx.AppCompatActivity.MediaBrowserCompat$ItemReceiver;
                    if (dxVar4.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        iconCompatParcelizer2.IconCompatParcelizer(dxVar4.RatingCompat);
                    }
                }
            }
        }
    }

    static final class RatingCompat implements Runnable {
        private /* synthetic */ PartnerDiscoverWebViewActivity IconCompatParcelizer;

        RatingCompat(PartnerDiscoverWebViewActivity partnerDiscoverWebViewActivity) {
            this.IconCompatParcelizer = partnerDiscoverWebViewActivity;
        }

        public final void run() {
            this.IconCompatParcelizer.Keep();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        runOnUiThread(new RatingCompat(this));
    }

    static final class IconCompatParcelizer implements Runnable {
        private /* synthetic */ PartnerDiscoverWebViewActivity MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(PartnerDiscoverWebViewActivity partnerDiscoverWebViewActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = partnerDiscoverWebViewActivity;
        }

        public final void run() {
            this.MediaBrowserCompat$CustomActionResultReceiver.ay_();
        }
    }

    public final void read() {
        runOnUiThread(new IconCompatParcelizer(this));
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
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
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.MediaBrowserCompat$MediaItem = true;
        AlertController$RecycleListView.write((Activity) this, (int) R.id.root, (int) R.drawable.ic_check_circle_white_24dp, getString(R.string.investment_risk_assessment_renew_success), (int) R.color.f67402131099896);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "bridgeKey");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        super.MediaBrowserCompat$ItemReceiver(str, str2);
        boolean z = false;
        switch (str.hashCode()) {
            case -1753201697:
                if (str.equals("onRequestFundData")) {
                    C4305dx dxVar = this.presenterDiscoverWebView;
                    if (dxVar == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
                    }
                    onGetStartedClick.write((Object) str2, "params");
                    LinkedListMultimap.NodeIterator nodeIterator = dxVar.write;
                    FundFactSheetActivity dx_mediabrowsercompat_customactionresultreceiver = new dx$MediaBrowserCompat$CustomActionResultReceiver(dxVar);
                    FundFactSheetActivity read2 = new C4305dx.read(dxVar);
                    RequestBody create = RequestBody.Companion.create(MediaType.Companion.parse("application/json; charset=utf-8"), str2);
                    onGetStartedClick.write((Object) dx_mediabrowsercompat_customactionresultreceiver, "onSuccess");
                    onGetStartedClick.write((Object) read2, "onError");
                    onGetStartedClick.write((Object) create, "params");
                    nodeIterator.IconCompatParcelizer(nodeIterator.MediaBrowserCompat$CustomActionResultReceiver, dx_mediabrowsercompat_customactionresultreceiver, read2, new constant$MediaBrowserCompat$CustomActionResultReceiver.write(create));
                    return;
                }
                return;
            case -679241884:
                if (str.equals("onRequestHistoricalData")) {
                    C4305dx dxVar2 = this.presenterDiscoverWebView;
                    if (dxVar2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
                    }
                    onGetStartedClick.write((Object) str2, "params");
                    LinkedListMultimap.NodeIterator nodeIterator2 = dxVar2.write;
                    FundFactSheetActivity dx_mediabrowsercompat_itemreceiver = new dx$MediaBrowserCompat$ItemReceiver(dxVar2);
                    FundFactSheetActivity fundFactSheetActivity = C4305dx.write.IconCompatParcelizer;
                    RequestBody create2 = RequestBody.Companion.create(MediaType.Companion.parse("application/json; charset=utf-8"), str2);
                    onGetStartedClick.write((Object) dx_mediabrowsercompat_itemreceiver, "onSuccess");
                    onGetStartedClick.write((Object) fundFactSheetActivity, "onError");
                    onGetStartedClick.write((Object) create2, "params");
                    nodeIterator2.IconCompatParcelizer(nodeIterator2.IconCompatParcelizer, dx_mediabrowsercompat_itemreceiver, fundFactSheetActivity, new constant.write.read(create2));
                    return;
                }
                return;
            case 73069417:
                if (str.equals("onOpenPDF")) {
                    C4305dx dxVar3 = this.presenterDiscoverWebView;
                    if (dxVar3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
                    }
                    onGetStartedClick.write((Object) str2, "params");
                    Object fromJson = new Gson().fromJson(str2, new C4305dx.Keep().getType());
                    if (fromJson != null) {
                        String str3 = (String) ((HashMap) fromJson).get(ImagesContract.URL);
                        if (str3 != null) {
                            writeUInt64NoTag.IconCompatParcelizer sethasdecor = new C4305dx.setHasDecor(str3);
                            if (dxVar3.RatingCompat != null) {
                                z = true;
                            }
                            if (z) {
                                sethasdecor.IconCompatParcelizer(dxVar3.RatingCompat);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
                }
                return;
            case 973476761:
                if (str.equals("onInvestFund")) {
                    C4305dx dxVar4 = this.presenterDiscoverWebView;
                    if (dxVar4 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
                    }
                    onGetStartedClick.write((Object) str2, "params");
                    boolean z2 = dxVar4.MediaMetadataCompat;
                    if (z2) {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4305dx.setBackgroundResource.MediaBrowserCompat$CustomActionResultReceiver;
                        if (dxVar4.RatingCompat != null) {
                            iconCompatParcelizer.IconCompatParcelizer(dxVar4.RatingCompat);
                        }
                    } else if (!z2) {
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C4305dx.setExpandedFormat.write;
                        if (dxVar4.RatingCompat != null) {
                            iconCompatParcelizer2.IconCompatParcelizer(dxVar4.RatingCompat);
                        }
                    }
                    Object fromJson2 = new Gson().fromJson(str2, new dx$AlertController$RecycleListView().getType());
                    if (fromJson2 != null) {
                        HashMap hashMap = (HashMap) fromJson2;
                        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver(hashMap.get(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem), (Object) zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.RatingCompat)) {
                            onGetStartedClick.write((Object) str2, "params");
                            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = C4305dx.IconCompatParcelizer.write;
                            if (dxVar4.RatingCompat != null) {
                                z = true;
                            }
                            if (z) {
                                iconCompatParcelizer3.IconCompatParcelizer(dxVar4.RatingCompat);
                            }
                            LinkedListMultimap.NodeIterator nodeIterator3 = dxVar4.write;
                            FundFactSheetActivity dx_mediabrowsercompat_mediaitem = new dx$MediaBrowserCompat$MediaItem(dxVar4);
                            FundFactSheetActivity mediaDescriptionCompat = new C4305dx.MediaDescriptionCompat(dxVar4);
                            RequestBody create3 = RequestBody.Companion.create(MediaType.Companion.parse("application/json; charset=utf-8"), str2);
                            onGetStartedClick.write((Object) dx_mediabrowsercompat_mediaitem, "onSuccess");
                            onGetStartedClick.write((Object) mediaDescriptionCompat, "onError");
                            onGetStartedClick.write((Object) create3, "params");
                            nodeIterator3.IconCompatParcelizer(nodeIterator3.read, dx_mediabrowsercompat_mediaitem, mediaDescriptionCompat, new constant.IconCompatParcelizer.read(create3));
                            return;
                        }
                        onGetStartedClick.write((Object) hashMap, "investFundMap");
                        HashMap hashMap2 = new HashMap();
                        Map map = hashMap2;
                        map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, hashMap.get(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver));
                        map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, Uri.encode(String.valueOf(hashMap.get(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat)), "utf-8"));
                        map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.write, hashMap.get(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.read));
                        map.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper, hashMap.get(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver));
                        onGetStartedClick.write((Object) hashMap2, "investFundMap");
                        zzvf RatingCompat2 = dxVar4.MediaBrowserCompat$SearchResultReceiver.write.RatingCompat();
                        Boolean valueOf = Boolean.valueOf(RatingCompat2 != null && RatingCompat2.write());
                        onGetStartedClick.IconCompatParcelizer((Object) valueOf, "registrationAccountsCase…gisteredAccountsInCache()");
                        if (valueOf.booleanValue()) {
                            zzvf RatingCompat3 = dxVar4.MediaBrowserCompat$SearchResultReceiver.write.RatingCompat();
                            if (RatingCompat3 == null) {
                                RatingCompat3 = null;
                            }
                            onGetStartedClick.IconCompatParcelizer((Object) RatingCompat3, "registrationAccountsCase.registeredAccountsInCache");
                            dxVar4.MediaBrowserCompat$CustomActionResultReceiver((HashMap<String, Object>) hashMap2, RatingCompat3);
                            return;
                        }
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = C4305dx.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
                        if (dxVar4.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            iconCompatParcelizer4.IconCompatParcelizer(dxVar4.RatingCompat);
                        }
                        LinkedListMultimap.NodeIterator nodeIterator4 = dxVar4.write;
                        FundFactSheetActivity dx_mediabrowsercompat_searchresultreceiver = new dx$MediaBrowserCompat$SearchResultReceiver(dxVar4, hashMap2);
                        FundFactSheetActivity mediaMetadataCompat = new C4305dx.MediaMetadataCompat(dxVar4);
                        onGetStartedClick.write((Object) dx_mediabrowsercompat_searchresultreceiver, "onSuccess");
                        onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
                        nodeIterator4.IconCompatParcelizer(nodeIterator4.write, dx_mediabrowsercompat_searchresultreceiver, mediaMetadataCompat, new constant.read.IconCompatParcelizer());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any?> /* = java.util.HashMap<kotlin.String, kotlin.Any?> */");
                }
                return;
            default:
                return;
        }
    }

    private final void AppCompatActivity() {
        if (this.MediaBrowserCompat$MediaItem) {
            Intent intent = new Intent(this, InvestmentDetailsActivity.class);
            intent.addFlags(67108864);
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
        } else {
            finish();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        onGetStartedClick.write((Object) menuItem, "item");
        if (menuItem.getItemId() != R.id.menu_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        AppCompatActivity();
        return true;
    }

    public final void onBackPressed() {
        AppCompatActivity();
    }

    public final void onDestroy() {
        super.onDestroy();
        C4305dx dxVar = this.presenterDiscoverWebView;
        if (dxVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenterDiscoverWebView");
        }
        dxVar.onDestroy();
    }
}
