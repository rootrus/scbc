package com.scb.phone.view.activity.chequemanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C$Gson$Types;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ChequeAnnouncementActivity extends BaseActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.read {
    private Intent MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public Button btnAckKnowledge;
    @HmlPinActivity
    public C$Gson$Types.ParameterizedTypeImpl presenter;

    public static final Intent write(Context context, Intent intent) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) intent, "nextIntent");
        Intent intent2 = new Intent(context, ChequeAnnouncementActivity.class);
        intent2.putExtra("EXTRAS_CHEQUE_ANNOUNCEMENT_INTENT", intent);
        return intent2;
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        setContentView(R.layout.f77082131492933);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.announce_cheque_title);
        setTabContainer();
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras = intent2.getExtras();
        if (!(extras == null || (intent = (Intent) extras.getParcelable("EXTRAS_CHEQUE_ANNOUNCEMENT_INTENT")) == null)) {
            onGetStartedClick.IconCompatParcelizer((Object) intent, "it");
            this.MediaBrowserCompat$SearchResultReceiver = intent;
        }
        C$Gson$Types.ParameterizedTypeImpl parameterizedTypeImpl = this.presenter;
        if (parameterizedTypeImpl == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        parameterizedTypeImpl.MediaBrowserCompat$ItemReceiver(this);
        C$Gson$Types.ParameterizedTypeImpl parameterizedTypeImpl2 = this.presenter;
        if (parameterizedTypeImpl2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = false;
        if (parameterizedTypeImpl2.read.getBoolean(parameterizedTypeImpl2.IconCompatParcelizer, false)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C$Gson$Types.ParameterizedTypeImpl.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (parameterizedTypeImpl2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(parameterizedTypeImpl2.RatingCompat);
            }
        }
        Button button = this.btnAckKnowledge;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnAckKnowledge");
        }
        button.setOnClickListener(new IconCompatParcelizer(this));
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ ChequeAnnouncementActivity MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(ChequeAnnouncementActivity chequeAnnouncementActivity) {
            this.MediaBrowserCompat$ItemReceiver = chequeAnnouncementActivity;
        }

        public final void onClick(View view) {
            C$Gson$Types.ParameterizedTypeImpl parameterizedTypeImpl = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (parameterizedTypeImpl == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            boolean z = true;
            parameterizedTypeImpl.read.edit().putBoolean(parameterizedTypeImpl.IconCompatParcelizer, true).apply();
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C$Gson$Types.ParameterizedTypeImpl.write.write;
            if (parameterizedTypeImpl.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(parameterizedTypeImpl.RatingCompat);
            }
        }
    }

    public final void read() {
        Intent intent = this.MediaBrowserCompat$SearchResultReceiver;
        if (intent == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextIntent");
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
