package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.scb.phone.view.activity.thirdparty.FacebookConsentDeepLinkActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CrashlyticsReport;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class PartnerSuccessRedirectActivity extends AppCompatActivity {
    public static Intent IconCompatParcelizer(Context context, CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage) {
        Intent intent = new Intent(context, PartnerSuccessRedirectActivity.class);
        intent.putExtra("BUTTON_REDIRECT_SUCCESS", binaryImage);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) getIntent().getParcelableExtra("BUTTON_REDIRECT_SUCCESS");
        if (binaryImage.IconCompatParcelizer == null && binaryImage.MediaBrowserCompat$ItemReceiver != null && binaryImage.MediaBrowserCompat$ItemReceiver.read) {
            Intent write = FacebookConsentDeepLinkActivity.write(this, "success", binaryImage);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, write).read();
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
        } else if (binaryImage.IconCompatParcelizer != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(binaryImage.IconCompatParcelizer));
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read2 = setTapText.write(this, intent).read();
                    MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb2.append(read2.getData());
                    sb2.append("\n with context ");
                    sb2.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                    startActivity(read2);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                finish();
            } catch (Exception unused) {
                finishAffinity();
            }
        }
    }
}
