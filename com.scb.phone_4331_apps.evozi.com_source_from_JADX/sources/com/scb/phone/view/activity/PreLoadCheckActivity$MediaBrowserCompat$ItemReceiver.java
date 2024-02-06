package com.scb.phone.view.activity;

import android.content.Intent;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.lang.ref.WeakReference;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

class PreLoadCheckActivity$MediaBrowserCompat$ItemReceiver implements Runnable {
    private final WeakReference<PreLoadCheckActivity> read;
    private final Intent write;

    protected PreLoadCheckActivity$MediaBrowserCompat$ItemReceiver(PreLoadCheckActivity preLoadCheckActivity, Intent intent) {
        this.read = new WeakReference<>(preLoadCheckActivity);
        this.write = intent;
    }

    public final void run() {
        PreLoadCheckActivity preLoadCheckActivity = this.read.get();
        if (preLoadCheckActivity != null) {
            preLoadCheckActivity.aj_();
            Intent intent = this.write;
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("com.scb.phone.EXTRA_DEEP_LINK", false);
            }
            if (z) {
                Intent intent2 = this.write;
                IntentTidInjectionActivityAspect.aspectOf();
                try {
                    Intent read2 = setTapText.write(preLoadCheckActivity, intent2).read();
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                    sb.append(read2.getData());
                    sb.append("\n with context ");
                    sb.append(preLoadCheckActivity.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                    preLoadCheckActivity.startActivityForResult(read2, 1001);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                Intent intent3 = this.write;
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read3 = setTapText.write(preLoadCheckActivity, intent3).read();
                    MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb2.append(read3.getData());
                    sb2.append("\n with context ");
                    sb2.append(preLoadCheckActivity.hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
                    preLoadCheckActivity.startActivity(read3);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
    }
}
