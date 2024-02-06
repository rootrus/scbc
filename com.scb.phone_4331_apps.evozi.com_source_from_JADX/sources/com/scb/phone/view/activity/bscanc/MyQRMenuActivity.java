package com.scb.phone.view.activity.bscanc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.bscanc.BScanCEntryPointActivity;
import com.scb.phone.view.activity.bscanc.QRPaymentCoachMarkActivity;
import com.scb.phone.view.activity.promptpay.PromptPayQRActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CreditCardCaptureModule_GetIParametersFactory;
import p040o.FirebaseInstanceId;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYRK;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class MyQRMenuActivity extends BaseActivity implements CreditCardCaptureModule_GetIParametersFactory.write {
    final ZSYRK MediaDescriptionCompat = new ZSYRK();
    @HmlPinActivity
    public FirebaseInstanceId.zza presenter;
    @BindView
    public TextView qrPaymentButton;
    @BindView
    public TextView qrReceivingMoneyButton;

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, MyQRMenuActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f76842131492909);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.myqr_title);
        setTabContainer();
        FirebaseInstanceId.zza zza = this.presenter;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        zza.MediaBrowserCompat$ItemReceiver(this);
        FirebaseInstanceId.zza zza2 = this.presenter;
        if (zza2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (!zza2.read.MediaBrowserCompat$CustomActionResultReceiver().isEmpty()) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FirebaseInstanceId.zza.read.IconCompatParcelizer;
            if (zza2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(zza2.RatingCompat);
            }
        }
        TextView textView = this.qrReceivingMoneyButton;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrReceivingMoneyButton");
        }
        textView.setOnClickListener(new MyQRMenuActivity$MediaBrowserCompat$ItemReceiver(this));
        TextView textView2 = this.qrPaymentButton;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("qrPaymentButton");
        }
        textView2.setOnClickListener(new read(this));
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "lifestyle_myqr");
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ MyQRMenuActivity MediaBrowserCompat$CustomActionResultReceiver;

        read(MyQRMenuActivity myQRMenuActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = myQRMenuActivity;
        }

        public final void onClick(View view) {
            MyQRMenuActivity myQRMenuActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            myQRMenuActivity.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(myQRMenuActivity.scbAnalytics, "bscanc_qrforpay");
            FirebaseInstanceId.zza zza = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (zza == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            zza.IconCompatParcelizer();
        }
    }

    public final void write() {
        MyQRCoachMarkActivity$MediaBrowserCompat$ItemReceiver myQRCoachMarkActivity$MediaBrowserCompat$ItemReceiver = MyQRCoachMarkActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, MyQRCoachMarkActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 1000);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(this, PromptPayQRActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        QRPaymentCoachMarkActivity.write write = QRPaymentCoachMarkActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, QRPaymentCoachMarkActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        BScanCEntryPointActivity.write write = BScanCEntryPointActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, BScanCEntryPointActivity.class);
        intent.putExtra("KEYS_IS_SETTING_PAGE", false);
        Intent intent2 = new Intent(intent);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent2).read();
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

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1000) {
            if (i == 1001 && i2 == -1) {
                FirebaseInstanceId.zza zza = this.presenter;
                if (zza == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                zza.IconCompatParcelizer();
            }
        } else if (i2 == 0) {
            finish();
        }
    }
}
