package com.scb.phone.view.activity.thirdparty;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import p040o.CrashlyticsReport;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class FacebookConsentDeepLinkActivity extends BaseDeepLinkActivity {
    private static final Set<String> MediaMetadataCompat = new HashSet(Arrays.asList(new String[]{"-sYXRdwJA3hvue3mKpYrOZ9zSPC7b4mbgzJmdZEDO5w", "4_nh4M-Z0OVqBVumXiQbM5n3zqUkMmsM3W7BMn7Q_cE"}));

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public static Intent write(Context context, String str, CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage) {
        Intent intent = new Intent(context, FacebookConsentDeepLinkActivity.class);
        intent.putExtra("payment_status", str);
        intent.putExtra("BUTTON_REDIRECT_SUCCESS", binaryImage);
        intent.addFlags(603979776);
        return intent;
    }

    public final void IconCompatParcelizer(Intent intent, String str) {
        String stringExtra = intent.getStringExtra("applicationId");
        String stringExtra2 = intent.getStringExtra("partnertransactionId");
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getCallingPackage(), 64);
            if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
                if (packageInfo.signatures[0] != null) {
                    if (MediaMetadataCompat.contains(Base64.encodeToString(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256).digest(packageInfo.signatures[0].toByteArray()), 11))) {
                        Intent MediaBrowserCompat$ItemReceiver = ThirdPartyConsentActivity.MediaBrowserCompat$ItemReceiver(this, stringExtra, stringExtra2, "facebook.payment");
                        IntentTidInjectionActivityAspect.aspectOf();
                        try {
                            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
                            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                            sb.append(read.getData());
                            sb.append("\n with context ");
                            sb.append(hashCode());
                            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                            startActivityForResult(read, 1002);
                            return;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            return;
                        }
                    } else {
                        Intent intent2 = new Intent();
                        intent2.putExtra("payment_status", "failure");
                        setResult(0, intent2);
                        finish();
                        return;
                    }
                }
            }
            Intent intent3 = new Intent();
            intent3.putExtra("payment_status", "failure");
            setResult(0, intent3);
            finish();
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            Intent intent4 = new Intent();
            intent4.putExtra("payment_status", "failure");
            setResult(0, intent4);
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("payment_status");
        if (stringExtra != null) {
            if ((stringExtra.hashCode() != -1867169789 || !stringExtra.equals("success")) ? true : false) {
                Intent intent = new Intent();
                intent.putExtra("payment_status", stringExtra);
                setResult(0, intent);
                finish();
                return;
            }
            CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) getIntent().getParcelableExtra("BUTTON_REDIRECT_SUCCESS");
            if (binaryImage != null && binaryImage.MediaBrowserCompat$ItemReceiver != null) {
                Intent intent2 = new Intent();
                if (!(binaryImage.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver == null || binaryImage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer == null)) {
                    intent2.putExtra(binaryImage.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, binaryImage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                }
                setResult(-1, intent2);
                finish();
            }
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }
}
