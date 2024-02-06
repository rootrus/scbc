package com.thunderhead.android.aspects;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.aspectj.lang.NoAspectBoundException;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class IntentTidInjectionContextAspect {
    /* access modifiers changed from: private */
    public static /* synthetic */ IntentTidInjectionContextAspect MediaBrowserCompat$CustomActionResultReceiver;
    private static /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    /* renamed from: ajc$around$com_thunderhead_android_aspects_IntentTidInjectionContextAspect$1$504445d4proceed */
    static /* synthetic */ void m3485xa35e5654(Context context, Intent intent, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_IntentTidInjectionContextAspect$2$29974efcproceed */
    static /* synthetic */ void m3486x9f8b6d8e(Context context, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    public static IntentTidInjectionContextAspect aspectOf() {
        IntentTidInjectionContextAspect intentTidInjectionContextAspect = MediaBrowserCompat$CustomActionResultReceiver;
        if (intentTidInjectionContextAspect != null) {
            return intentTidInjectionContextAspect;
        }
        throw new NoAspectBoundException("com_thunderhead_android_aspects_IntentTidInjectionContextAspect", MediaBrowserCompat$ItemReceiver);
    }

    public static boolean hasAspect() {
        return MediaBrowserCompat$CustomActionResultReceiver != null;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivity$578(Context context, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityWithBundle$5fb(Context context, Intent intent, Bundle bundle) {
    }

    static {
        try {
            MediaBrowserCompat$CustomActionResultReceiver = new IntentTidInjectionContextAspect();
        } catch (Throwable th) {
            MediaBrowserCompat$ItemReceiver = th;
        }
    }

    IntentTidInjectionContextAspect() {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_IntentTidInjectionContextAspect$1$504445d4 */
    public void mo40160x69e7b51a(Context context, Intent intent, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            m3485xa35e5654(context, read, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_IntentTidInjectionContextAspect$2$29974efc */
    public void mo40161xb58eb20(Context context, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent, Bundle), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            m3486x9f8b6d8e(context, read, bundle, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
