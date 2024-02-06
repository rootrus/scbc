package com.scb.phone.view.activity.hml;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.profilemanagement.ProfileManagementActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setTapText;

public abstract class HmlBaseEmailAboutActivity extends BaseActivity {
    private Unbinder MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public TextView description;
    @BindView
    public TextView editEmailDescription;
    @BindView
    public TextView editEmailHeader;
    @BindView
    public TextView header;
    @BindView
    public TextView instructionsHeader;
    @BindView
    public TextView returnHomeDescription;
    @BindView
    public TextView returnHomeHeader;
    @BindView
    public TextView selectBannerHeader;
    @BindView
    public Button settingsButton;
    @BindView
    public TextView verifyEmailDescription;
    @BindView
    public TextView verifyEmailHeader;

    public abstract int ActionMenuView();

    public abstract String AppCompatActivity();

    public abstract int AppCompatDelegateImpl$ListMenuDecorView();

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract int mo14501x50fd9e4a();

    public abstract int MediaSessionCompat$QueueItem();

    public abstract int MediaSessionCompat$ResultReceiverWrapper();

    public abstract int MediaSessionCompat$Token();

    public abstract int setContentView();

    public abstract int setIcon();

    public abstract int setItemInvoker();

    public abstract int setMenu();

    public abstract int setOverlayMode();

    public abstract int setWindowCallback();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78292131493054);
        this.MediaBrowserCompat$SearchResultReceiver = ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(setMenu()));
        setTabContainer();
        TextView textView = this.header;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("header");
        }
        textView.setText(getString(setContentView()));
        TextView textView2 = this.description;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("description");
        }
        textView2.setText(getString(MediaSessionCompat$ResultReceiverWrapper()));
        TextView textView3 = this.instructionsHeader;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("instructionsHeader");
        }
        textView3.setText(getString(AppCompatDelegateImpl$ListMenuDecorView()));
        TextView textView4 = this.editEmailHeader;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editEmailHeader");
        }
        textView4.setText(getString(MediaSessionCompat$QueueItem()));
        TextView textView5 = this.editEmailDescription;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editEmailDescription");
        }
        textView5.setText(getString(MediaSessionCompat$Token()));
        TextView textView6 = this.verifyEmailHeader;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verifyEmailHeader");
        }
        textView6.setText(getString(ActionMenuView()));
        TextView textView7 = this.verifyEmailDescription;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verifyEmailDescription");
        }
        textView7.setText(getString(setWindowCallback()));
        TextView textView8 = this.returnHomeHeader;
        if (textView8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("returnHomeHeader");
        }
        textView8.setText(getString(setIcon()));
        TextView textView9 = this.returnHomeDescription;
        if (textView9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("returnHomeDescription");
        }
        textView9.setText(getString(setItemInvoker()));
        TextView textView10 = this.selectBannerHeader;
        if (textView10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectBannerHeader");
        }
        textView10.setText(getString(setOverlayMode()));
        Button button = this.settingsButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("settingsButton");
        }
        button.setText(getString(mo14501x50fd9e4a()));
        this.scbAnalytics.write("p10x1_business_verification_personal_info", new ZSYR2K("user_type", "etb"), new ZSYR2K("loan_type", AppCompatActivity()));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(setMenu()));
        setTabContainer();
    }

    @OnClick
    public final void onButtonSettingsClick() {
        Intent MediaBrowserCompat$ItemReceiver = ProfileManagementActivity.MediaBrowserCompat$ItemReceiver(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        Unbinder unbinder = this.MediaBrowserCompat$SearchResultReceiver;
        if (unbinder != null) {
            unbinder.read();
        }
        super.onDestroy();
    }
}
