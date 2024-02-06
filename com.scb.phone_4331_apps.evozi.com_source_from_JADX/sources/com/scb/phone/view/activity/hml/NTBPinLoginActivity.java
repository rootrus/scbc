package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlNTBPinDisabledActivity;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.MerchantService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER2K;
import p040o.getOversizeImage;
import p040o.isUserLoggedIn;
import p040o.onGetStartedClick;
import p040o.proxyGetIPassportDetector;
import p040o.setTapText;

public class NTBPinLoginActivity extends BaseActivity implements MerchantService, proxyGetIPassportDetector {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);
    private HashMap MediaMetadataCompat;
    @BindView
    public ImageView buttonClose;
    @BindView
    public CustomKeypad customKeypad;
    @BindView
    public CustomPinInput customPinInput;
    @BindView
    public ImageView imageAvatar;
    @HmlPinActivity
    public isUserLoggedIn presenter;
    @BindView
    public TextView textSubtitle;
    @BindView
    public TextView textWelcome;

    public View IconCompatParcelizer(int i) {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new HashMap();
        }
        View view = (View) this.MediaMetadataCompat.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaMetadataCompat.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void IconCompatParcelizer() {
    }

    /* renamed from: P_ */
    public final void mo13717P_() {
    }

    public final void al_() {
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79292131493154);
        mo13676d_("ntb_pin_login");
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setContentHeight();
        setSubtitle();
        TextView textView = this.textSubtitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textSubtitle");
        }
        textView.setText(R.string.ntb_enter_pin);
        LinearLayout linearLayout = (LinearLayout) IconCompatParcelizer(ZHER2K.write.view_forgot_pin);
        onGetStartedClick.IconCompatParcelizer((Object) linearLayout, "view_forgot_pin");
        linearLayout.setVisibility(8);
        CustomPinInput customPinInput2 = this.customPinInput;
        if (customPinInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinInput2.setPinInputListener(this);
        CustomKeypad customKeypad2 = this.customKeypad;
        if (customKeypad2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customKeypad");
        }
        CustomPinInput customPinInput3 = this.customPinInput;
        if (customPinInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customKeypad2.setKeypadListener(customPinInput3);
        CustomKeypad customKeypad3 = this.customKeypad;
        if (customKeypad3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customKeypad");
        }
        customKeypad3.setEnabledLines(true);
        ImageView imageView = this.buttonClose;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonClose");
        }
        imageView.setOnClickListener(new read(this));
        Window window = getWindow();
        onGetStartedClick.IconCompatParcelizer((Object) window, "window");
        View decorView = window.getDecorView();
        onGetStartedClick.IconCompatParcelizer((Object) decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        ImageView imageView2 = this.buttonClose;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonClose");
        }
        Context context = this;
        imageView2.setPadding(32, AlertController$RecycleListView.IconCompatParcelizer(context), 0, 32);
        TextView textView2 = this.textWelcome;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textWelcome");
        }
        textView2.setPadding(0, AlertController$RecycleListView.IconCompatParcelizer(context), 0, 0);
        isUserLoggedIn isuserloggedin = this.presenter;
        if (isuserloggedin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isuserloggedin.MediaBrowserCompat$ItemReceiver(this);
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
        Context applicationContext = getApplicationContext();
        if (applicationContext != null) {
            applicationContext.deleteDatabase("webview.db");
            applicationContext.deleteDatabase("webviewCache.db");
        }
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ NTBPinLoginActivity write;

        read(NTBPinLoginActivity nTBPinLoginActivity) {
            this.write = nTBPinLoginActivity;
        }

        public final void onClick(View view) {
            NTBPinLoginActivity.MediaBrowserCompat$ItemReceiver(this.write);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "pin");
        isUserLoggedIn isuserloggedin = this.presenter;
        if (isuserloggedin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        isuserloggedin.write(str);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        setResult(-1);
        finish();
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        write(this, R.id.view_group_root, str, getOversizeImage.ERROR);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        finish();
        HmlNTBPinDisabledActivity.write write = HmlNTBPinDisabledActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent putExtra = new Intent(context, HmlNTBPinDisabledActivity.class).putExtra("PIN_EXPIRED_FLAG", false);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBPi…RED_FLAG, pinExpiredFlag)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, putExtra).read();
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

    public final void read() {
        CustomPinInput customPinInput2 = this.customPinInput;
        if (customPinInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinInput2.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(NTBPinLoginActivity nTBPinLoginActivity) {
        nTBPinLoginActivity.finish();
        nTBPinLoginActivity.overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }
}
