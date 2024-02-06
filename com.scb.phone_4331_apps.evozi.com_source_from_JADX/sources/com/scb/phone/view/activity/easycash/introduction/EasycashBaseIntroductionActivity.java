package com.scb.phone.view.activity.easycash.introduction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.squareup.picasso.Picasso;
import p040o.C7355pQ;
import p040o.C7358pT;
import p040o.Check;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.HmlPinActivity;
import p040o.IsgDetectionModule_GetDocumentDetectorFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Onboarding;
import p040o.PrepaidActivationService;
import p040o.forEachClear;
import p040o.getLegacySharedPrefs;
import p040o.setAllowCollapse;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public abstract class EasycashBaseIntroductionActivity extends BaseActivity implements Check {
    @BindView
    public ImageView imagePlaceholder;
    @HmlPinActivity
    public forEachClear tracker;
    @BindView
    TextView tvPrivacyNotice;
    @BindView
    LinearLayout vPrivacyNotice;
    @BindView
    WebView webView;

    public /* synthetic */ void IconCompatParcelizer() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract void mo14347x50fd9e4a();

    /* access modifiers changed from: protected */
    public abstract IsgDetectionModule_GetDocumentDetectorFactory MediaSessionCompat$Token();

    public static final /* synthetic */ void write(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((EasycashBaseIntroductionActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77562131492981);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$Token().MediaBrowserCompat$ItemReceiver(this);
        IsgDetectionModule_GetDocumentDetectorFactory MediaSessionCompat$Token = MediaSessionCompat$Token();
        Onboarding.C37171 r0 = (Onboarding.C37171) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_INTRODUCTION");
        if (r0 != null) {
            writeUInt64NoTag.IconCompatParcelizer write = new IsgDetectionModule_GetDocumentDetectorFactory.write(r0);
            if (MediaSessionCompat$Token.RatingCompat != null) {
                write.IconCompatParcelizer(MediaSessionCompat$Token.RatingCompat);
            }
        }
    }

    public final void read(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles_type_4.css\"/>");
        sb.append(str);
        this.webView.loadDataWithBaseURL("file:///android_asset/", sb.toString(), "text/html", "utf-8", (String) null);
    }

    public final void write(String str) {
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(str);
        write.read = true;
        write.read(this.imagePlaceholder, (FragmentBuilder_BindEkycFragment) null);
        this.imagePlaceholder.post(new C7355pQ(this));
    }

    public final void IconCompatParcelizer(String str) {
        this.tvPrivacyNotice.setText(setAllowCollapse.write(str, 0));
        this.tvPrivacyNotice.setMovementMethod(new PrepaidActivationService(new C7358pT(this)));
    }

    public final void write() {
        this.vPrivacyNotice.setVisibility(8);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
    }

    @OnClick
    public void onClickApplyNow() {
        mo14347x50fd9e4a();
    }

    public void onBackPressed() {
        if ("CREDIT_POWER".equals(getIntent().getStringExtra("com.scb.phone.view.activity.easycash.PRODUCT_TYPE"))) {
            EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
            return;
        }
        setResult(-1, new Intent());
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onDestroy() {
        this.tracker = null;
        MediaSessionCompat$Token().onDestroy();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final String MediaSessionCompat$QueueItem() {
        if (((getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE")) == null) {
            return null;
        }
        return ((getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE")).MediaMetadataCompat;
    }
}
