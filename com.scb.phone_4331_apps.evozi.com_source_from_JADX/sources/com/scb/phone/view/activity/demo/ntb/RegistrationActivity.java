package com.scb.phone.view.activity.demo.ntb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.data.network.service.ThemesService;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.csent.PrivacyCSentWebViewActivity;
import com.scb.phone.view.activity.registration.RegistrationPersonalInformationActivity;
import com.scb.phone.view.activity.wifisettings.WifiSettingsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Locale;
import p039io.github.inflationx.calligraphy3.TypefaceUtils;
import p040o.AlertController$RecycleListView;
import p040o.C6992x633f693d;
import p040o.FragmentBuilder_BindDirectDebitInputMainFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PrepaidActivationService;
import p040o.ZSYR2K;
import p040o.detectShadows;
import p040o.detectShadows$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.detectShadows$MediaBrowserCompat$ItemReceiver;
import p040o.detectShadows$MediaBrowserCompat$MediaItem;
import p040o.getCompressedRearImageSize;
import p040o.onGetLayoutInflater;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class RegistrationActivity extends BaseActivity implements getCompressedRearImageSize {
    @BindView
    public TextView notSureButton;
    @HmlPinActivity
    public detectShadows presenter;
    @BindView
    public TextView tvMobilePreregistration;
    @BindView
    public TextView tvPrivacyNotice;
    @BindView
    public TextView tvSwitchToEng;
    @BindView
    public TextView tvSwitchToThai;

    public static final class write {
        public ThemesService MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        @HmlPinActivity
        public write(ThemesService themesService) {
            this.MediaBrowserCompat$ItemReceiver = themesService;
        }
    }

    public final void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f79602131493185);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        mo13676d_("registration_intro_question");
        detectShadows detectshadows = this.presenter;
        if (detectshadows == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        detectshadows.MediaBrowserCompat$ItemReceiver(this);
        detectShadows detectshadows2 = this.presenter;
        if (detectshadows2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String D_ = mo3026D_();
        onGetStartedClick.IconCompatParcelizer((Object) D_, "language");
        onGetStartedClick.write((Object) D_, "locale");
        writeUInt64NoTag.IconCompatParcelizer mediaMetadataCompat = new detectShadows.MediaMetadataCompat(D_);
        boolean z = true;
        if (detectshadows2.RatingCompat != null) {
            mediaMetadataCompat.IconCompatParcelizer(detectshadows2.RatingCompat);
        }
        String MediaBrowserCompat$CustomActionResultReceiver = detectshadows2.read.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            writeUInt64NoTag.IconCompatParcelizer detectshadows_mediabrowsercompat_mediaitem = new detectShadows$MediaBrowserCompat$MediaItem(MediaBrowserCompat$CustomActionResultReceiver);
            if (detectshadows2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                detectshadows_mediabrowsercompat_mediaitem.IconCompatParcelizer(detectshadows2.RatingCompat);
            }
        }
        detectShadows detectshadows3 = this.presenter;
        if (detectshadows3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        detectshadows3.write.IconCompatParcelizer.read((Boolean) null);
        detectshadows3.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.write((Boolean) null);
        TextView textView = this.notSureButton;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("notSureButton");
        }
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        textView.setText(spannableString);
        Resources resources = getResources();
        onGetStartedClick.IconCompatParcelizer((Object) resources, "resources");
        String string = getString(R.string.preregistration_clickable);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.preregistration_clickable)");
        String string2 = getString(R.string.preregistration_mobile);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.preregistration_mobile)");
        CharSequence MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindDirectDebitInputMainFragment.MediaBrowserCompat$ItemReceiver(resources, string, string2, (String) null, true, R.color.f71012131100257, new C5592xc67d4d95(this), 40);
        TextView textView2 = this.tvMobilePreregistration;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMobilePreregistration");
        }
        textView2.setText(MediaBrowserCompat$ItemReceiver);
        TextView textView3 = this.tvMobilePreregistration;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMobilePreregistration");
        }
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @OnClick
    public final void clickNonCustomer() {
        detectShadows detectshadows = this.presenter;
        if (detectshadows == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        detectshadows.MediaDescriptionCompat.write.IconCompatParcelizer(true);
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = detectShadows$MediaBrowserCompat$CustomActionResultReceiver.write;
        if (detectshadows.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(detectshadows.RatingCompat);
        }
    }

    @OnClick
    public final void clickCustomer() {
        detectShadows detectshadows = this.presenter;
        if (detectshadows == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (AlertController$RecycleListView.RatingCompat((Context) this) == 0) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = detectShadows$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (detectshadows.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(detectshadows.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = detectShadows.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (detectshadows.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(detectshadows.RatingCompat);
        }
    }

    @OnClick
    public final void clickSwitchToEng() {
        MediaBrowserCompat$SearchResultReceiver("en");
    }

    @OnClick
    public final void clickSwitchToThai() {
        MediaBrowserCompat$SearchResultReceiver("th");
    }

    @OnClick
    public final void clickNotSure() {
        detectShadows detectshadows = this.presenter;
        if (detectshadows == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (AlertController$RecycleListView.RatingCompat((Context) this) == 0) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = detectShadows.write.read;
            if (detectshadows.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(detectshadows.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = detectShadows.read.MediaBrowserCompat$CustomActionResultReceiver;
        if (detectshadows.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(detectshadows.RatingCompat);
        }
    }

    public final void write() {
        Intent intent = new Intent(this, WifiSettingsActivity.class);
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

    public final void write(boolean z) {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[1];
        zsyr2kArr[0] = new ZSYR2K("source", z ? "not_sure" : "yes");
        this.scbAnalytics.write("registration_personalinfo", zsyr2kArr);
        RegistrationPersonalInformationActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
    }

    public final void IconCompatParcelizer() {
        Intent MediaBrowserCompat$ItemReceiver = WelcomeAboardActivity.MediaBrowserCompat$ItemReceiver(this, "registration_welcome");
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

    public final void read() {
        TextView textView = this.tvSwitchToEng;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSwitchToEng");
        }
        textView.setTextAppearance(R.style.f98212131821041);
        textView.setTypeface(TypefaceUtils.load(getAssets(), "fonts/db_heavent_medium.ttf"));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TextView textView = this.tvSwitchToThai;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSwitchToThai");
        }
        textView.setTextAppearance(R.style.f98212131821041);
        textView.setTypeface(TypefaceUtils.load(getAssets(), "fonts/db_heavent_medium.ttf"));
    }

    public static final class read implements C6992x633f693d {
        private /* synthetic */ RegistrationActivity IconCompatParcelizer;

        read(RegistrationActivity registrationActivity) {
            this.IconCompatParcelizer = registrationActivity;
        }

        public final boolean read(String str) {
            onGetStartedClick.write((Object) str, ImagesContract.URL);
            detectShadows detectshadows = this.IconCompatParcelizer.presenter;
            if (detectshadows == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, ImagesContract.URL);
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new detectShadows.RatingCompat(str);
            if (detectshadows.RatingCompat != null) {
                ratingCompat.IconCompatParcelizer(detectshadows.RatingCompat);
            }
            return true;
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "label");
        TextView textView = this.tvPrivacyNotice;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPrivacyNotice");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setText(Html.fromHtml(str, 0));
        } else {
            textView.setText(Html.fromHtml(str));
        }
        PrepaidActivationService prepaidActivationService = new PrepaidActivationService(new read(this));
        TextView textView2 = this.tvPrivacyNotice;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPrivacyNotice");
        }
        textView2.setMovementMethod(prepaidActivationService);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        PrivacyCSentWebViewActivity.write write2 = PrivacyCSentWebViewActivity.MediaBrowserCompat$MediaItem;
        Intent read2 = PrivacyCSentWebViewActivity.write.read(this, str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        mo13676d_("privacy_notice_self_regis");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        PreregisteredMobileActivity$MediaBrowserCompat$ItemReceiver preregisteredMobileActivity$MediaBrowserCompat$ItemReceiver = PreregisteredMobileActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, PreregisteredMobileActivity.class);
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

    public final void onDestroy() {
        detectShadows detectshadows = this.presenter;
        if (detectshadows == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        detectshadows.onDestroy();
        super.onDestroy();
    }

    public static final /* synthetic */ boolean write(RegistrationActivity registrationActivity) {
        return AlertController$RecycleListView.RatingCompat((Context) registrationActivity) == 0;
    }

    private final void MediaBrowserCompat$SearchResultReceiver(String str) {
        detectShadows detectshadows = this.presenter;
        if (detectshadows == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) str, "language");
        detectshadows.IconCompatParcelizer.read(str);
        onGetLayoutInflater.MediaBrowserCompat$CustomActionResultReceiver(new Locale(str).getLanguage());
        mo3029b_(str);
    }
}
