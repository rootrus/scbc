package com.scb.phone.view.activity.partner;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.forgotpin.ForgotPinPersonalInfoActivity;
import com.scb.phone.view.activity.forgotpin.PinLockActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.File;
import p040o.AlertController$RecycleListView;
import p040o.C1246xea60bf60;
import p040o.DecoratorResult;
import p040o.DirectionButton;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Futures;
import p040o.MaterialCalendarView;
import p040o.MerchantService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaybackStateCompat;
import p040o.access$2200;
import p040o.getThemeSelectableBackgroundId;
import p040o.printStackTrace;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.zzmd;

public abstract class AbstractPartnerLoginActivity extends BaseActivity implements printStackTrace, MerchantService {
    public PlaybackStateCompat.CustomAction MediaBrowserCompat$MediaItem;
    public printStackTrace.write MediaMetadataCompat;
    @BindView
    ImageView partnerBgLogin;
    @BindView
    ImageView partnerButtonClose;
    @BindView
    CustomKeypad partnerCustomKeypad;
    @BindView
    CustomPinInput partnerCustomPinInput;
    @BindView
    ImageView partnerImageAvatar;
    @BindView
    TextView partnerTextSubtitle;
    @BindView
    TextView partnerTextUserName;
    @BindView
    TextView partnerTextWelcome;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract printStackTrace.write mo34189x50fd9e4a();

    /* renamed from: P_ */
    public final void mo13717P_() {
    }

    public final void al_() {
    }

    public static final /* synthetic */ void IconCompatParcelizer(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((AbstractPartnerLoginActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79212131493146);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setContentHeight();
        this.partnerTextSubtitle.setText(getString(R.string.enter_pin_to_login));
        this.partnerCustomPinInput.setPinInputListener(this);
        this.partnerCustomKeypad.setKeypadListener(this.partnerCustomPinInput);
        this.partnerCustomKeypad.setEnabledLines(true);
        printStackTrace.write MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo34189x50fd9e4a();
        this.MediaMetadataCompat = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.write((printStackTrace) this);
        if (getIntent().getExtras() != null) {
            this.MediaMetadataCompat.IconCompatParcelizer(getIntent().getExtras().getString("com.scb.phone.view.activity.partner.EXTRA_PARTNER_APPLICATION_ID", (String) null), getIntent().getExtras().getString("com.scb.phone.view.activity.partner.EXTRA_UUID", (String) null));
            this.MediaMetadataCompat.write(setTitleOptional());
        }
        mo13676d_("login_partner");
    }

    public final void setContentHeight() {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.partnerButtonClose.setPadding(32, AlertController$RecycleListView.IconCompatParcelizer((Context) this), 0, 32);
        this.partnerTextWelcome.setPadding(0, AlertController$RecycleListView.IconCompatParcelizer((Context) this), 0, 0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.MediaMetadataCompat.IconCompatParcelizer(str);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onCloseClick() {
        this.MediaMetadataCompat.MediaBrowserCompat$MediaItem();
    }

    @OnClick
    public void onForgotPinClick() {
        this.MediaMetadataCompat.MediaSessionCompat$ResultReceiverWrapper();
    }

    public final void write() {
        ForgotPinPersonalInfoActivity.write(this);
    }

    public final void MediaSessionCompat$QueueItem() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.forgot_pin_dialog_title_juristic);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.forgot_pin_dialog_description_juristic);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.forgot_pin_dialog_not_now_juristic), getThemeSelectableBackgroundId.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.find_us), new DirectionButton(this)).show();
    }

    public final void MediaBrowserCompat$ItemReceiver(Futures.C34104 r3) {
        this.partnerTextUserName.setText(r3.RatingCompat);
        this.partnerTextWelcome.setText(r3.read);
        FragmentBuilder_BindDepositSelectorFragment.read((int) R.drawable.profile_placeholder, this.partnerImageAvatar, r3.MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        String string = getString(R.string.other_error);
        if (access_2200 != null && !TextUtils.isEmpty(access_2200.IconCompatParcelizer)) {
            string = access_2200.IconCompatParcelizer;
        }
        AlertController$RecycleListView.read(this, R.id.view_group_root, R.drawable.ic_error_white_24dp, string, R.color.f71012131100257, R.color.f66062131099761, AlertController$RecycleListView.IconCompatParcelizer((Context) this));
        this.partnerCustomPinInput.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver(File file) {
        Drawable write = setLastBaselineToBottomHeight.write(getApplicationContext(), R.drawable.bg_money_out);
        getApplicationContext();
        FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(file, this.partnerBgLogin, write);
    }

    public final void MediaMetadataCompat() {
        this.partnerTextSubtitle.setText(getString(R.string.enter_pin_to_login_juristic));
        this.partnerBgLogin.setImageResource(R.drawable.bg_money_out_juristic);
    }

    public final void MediaDescriptionCompat() {
        DecoratorResult decoratorResult = new DecoratorResult(this);
        View inflate = getLayoutInflater().inflate(R.layout.f85352131493762, (ViewGroup) null);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.fingerprint_dialog_title));
        sb.append(" \"");
        sb.append(getString(R.string.app_name));
        sb.append("\"");
        ((TextView) inflate.findViewById(R.id.tv_fp_title)).setText(sb.toString());
        ((Button) inflate.findViewById(R.id.btn_fp_cancel)).setOnClickListener(new MaterialCalendarView(decoratorResult));
        C1246xea60bf60 playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver = new C1246xea60bf60(this);
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.write = false;
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaSessionCompat$QueueItem = inflate;
        PlaybackStateCompat.CustomAction write = playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.write();
        this.MediaBrowserCompat$MediaItem = write;
        write.show();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        PlaybackStateCompat.CustomAction customAction = this.MediaBrowserCompat$MediaItem;
        if (customAction != null) {
            customAction.dismiss();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.partnerTextSubtitle.setText(R.string.fingerprint_new_enrollment);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        PlaybackStateCompat.CustomAction customAction = this.MediaBrowserCompat$MediaItem;
        if (customAction != null && customAction.isShowing()) {
            ((TextView) this.MediaBrowserCompat$MediaItem.findViewById(R.id.tv_fp_title)).setText(R.string.fingerprint_dialog_title_try_again);
        }
    }

    public final void RatingCompat() {
        Intent intent = new Intent(this, PinLockActivity.class);
        intent.addFlags(268468224);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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

    public final boolean IconCompatParcelizer() {
        return Build.VERSION.SDK_INT >= 23 && zzmd.zzm.zzb.zza.INDIVIDUAL == setTitleOptional() && this.MediaMetadataCompat.MediaBrowserCompat$SearchResultReceiver();
    }

    public final void MediaBrowserCompat$MediaItem() {
        PinLockActivity.read(this);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        PlaybackStateCompat.CustomAction customAction = this.MediaBrowserCompat$MediaItem;
        if (customAction != null && !customAction.isShowing()) {
            this.MediaMetadataCompat.MediaMetadataCompat();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        finish();
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }

    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }
}
