package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.HmlPinActivity;
import p040o.ListenerCallbackThreadType;
import p040o.ListenerCallbackThreadType$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.classification$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getKernelIDClear;
import p040o.immediateCheckedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class MwChangeCasaSuccessActivity extends BaseActivity implements classification$MediaBrowserCompat$CustomActionResultReceiver {
    public static final write MediaDescriptionCompat = new write((byte) 0);
    @HmlPinActivity
    public ListenerCallbackThreadType presenter;
    @BindView
    public TextView tvAccountNo;
    @BindView
    public TextView tvAccountType;
    @BindView
    public TextView tvDateTime;
    @BindView
    public TextView tvNickName;
    @BindView
    public TextView tvWalletId;

    public final void onBackPressed() {
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78812131493106);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        ListenerCallbackThreadType listenerCallbackThreadType = this.presenter;
        if (listenerCallbackThreadType == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        listenerCallbackThreadType.MediaBrowserCompat$ItemReceiver(this);
        ListenerCallbackThreadType listenerCallbackThreadType2 = this.presenter;
        if (listenerCallbackThreadType2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Parcelable parcelableExtra = getIntent().getParcelableExtra("depositDisplay");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(KEY_DEPOSIT_DISPLAY)");
        immediateCheckedFuture immediatecheckedfuture = (immediateCheckedFuture) parcelableExtra;
        Parcelable parcelableExtra2 = getIntent().getParcelableExtra("merchantOtpDisplay");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra2, "intent.getParcelableExtr…KEY_MERCHANT_OTP_DISPLAY)");
        AutoCrashlyticsReportEncoder.C3050xc3999712 crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = (AutoCrashlyticsReportEncoder.C3050xc3999712) parcelableExtra2;
        onGetStartedClick.write((Object) immediatecheckedfuture, "depositDisplay");
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder, "merchantOtpDisplay");
        writeUInt64NoTag.IconCompatParcelizer listenerCallbackThreadType$MediaBrowserCompat$ItemReceiver = new ListenerCallbackThreadType$MediaBrowserCompat$ItemReceiver(listenerCallbackThreadType2, immediatecheckedfuture, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        if (listenerCallbackThreadType2.RatingCompat != null) {
            listenerCallbackThreadType$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(listenerCallbackThreadType2.RatingCompat);
        }
        new getKernelIDClear().MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "merchant_successful_change_casa");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "walletId");
        onGetStartedClick.write((Object) str2, "accountNo");
        onGetStartedClick.write((Object) str3, "accountType");
        onGetStartedClick.write((Object) str4, "nickName");
        onGetStartedClick.write((Object) str5, "timeStamp");
        TextView textView = this.tvWalletId;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvWalletId");
        }
        textView.setText(str);
        TextView textView2 = this.tvAccountNo;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAccountNo");
        }
        textView2.setText(str2);
        TextView textView3 = this.tvAccountType;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAccountType");
        }
        textView3.setText(str3);
        TextView textView4 = this.tvNickName;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNickName");
        }
        CharSequence charSequence = str4;
        textView4.setText(charSequence);
        TextView textView5 = this.tvNickName;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNickName");
        }
        int i = 0;
        if (charSequence.length() == 0) {
            i = 8;
        }
        textView5.setVisibility(i);
        TextView textView6 = this.tvDateTime;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDateTime");
        }
        textView6.setText(str5);
    }

    @OnClick
    public final void onClickDone() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
        MediaBrowserCompat$CustomActionResultReceiver.addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void onDestroy() {
        super.onDestroy();
        ListenerCallbackThreadType listenerCallbackThreadType = this.presenter;
        if (listenerCallbackThreadType == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        listenerCallbackThreadType.onDestroy();
    }
}
