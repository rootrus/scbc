package com.scb.phone.view.activity.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.demo.ntb.RegistrationActivity;
import com.scb.phone.view.activity.ntb.ReviewInfoResultActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setFilename;
import p040o.setTapText;

public final class UserUnderAgeErrorActivity extends ReviewInfoResultActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);
    @BindView
    public Button returnHomeButton;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "destination");
            setFilename setfilename = new setFilename();
            setfilename.MediaDescriptionCompat = R.drawable.ic_notice;
            setfilename.MediaBrowserCompat$SearchResultReceiver = context.getString(R.string.mf_onboarding_page_personal_information);
            setfilename.MediaMetadataCompat = context.getString(R.string.error_ekyc_default_title);
            setfilename.IconCompatParcelizer = context.getString(R.string.error_ekyc_passport_1001_text);
            setfilename.MediaBrowserCompat$ItemReceiver = false;
            Intent intent = new Intent(context, UserUnderAgeErrorActivity.class);
            intent.putExtra("EXTRA_REVIEW_DISPLAY", setfilename);
            intent.putExtra("EXTRA_CLASS_DESTINATION", str);
            return intent;
        }
    }

    public final void write(String str, String str2, String str3, String str4) {
        super.write(str, str2, str3, str4);
        Button button = this.findUsButton;
        onGetStartedClick.IconCompatParcelizer((Object) button, "findUsButton");
        button.setVisibility(8);
        Button button2 = this.returnHomeButton;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("returnHomeButton");
        }
        button2.setText(getString(R.string.registration_facial_recognition_button_return_label));
    }

    public final void returnHome() {
        Intent intent;
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras = intent2.getExtras();
        if (extras != null) {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) extras.getString("EXTRA_CLASS_DESTINATION"), (Object) "CLASS_DESTINATION_REGISTRATION")) {
                intent = new Intent(this, RegistrationActivity.class);
                onGetStartedClick.IconCompatParcelizer((Object) intent.addFlags(268468224), "intent.addFlags(Intent.F…r FLAG_ACTIVITY_NEW_TASK)");
            } else {
                intent = HomeActivity.IconCompatParcelizer((Context) this);
                onGetStartedClick.IconCompatParcelizer((Object) intent, "HomeActivity.createStartIntent(this)");
            }
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
            finish();
        }
    }
}
