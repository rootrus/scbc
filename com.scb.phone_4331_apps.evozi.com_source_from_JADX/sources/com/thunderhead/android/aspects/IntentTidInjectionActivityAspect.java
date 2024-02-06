package com.thunderhead.android.aspects;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.aspectj.lang.NoAspectBoundException;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class IntentTidInjectionActivityAspect {
    private static /* synthetic */ Throwable read;
    /* access modifiers changed from: private */
    public static /* synthetic */ IntentTidInjectionActivityAspect write;

    public static IntentTidInjectionActivityAspect aspectOf() {
        IntentTidInjectionActivityAspect intentTidInjectionActivityAspect = write;
        if (intentTidInjectionActivityAspect != null) {
            return intentTidInjectionActivityAspect;
        }
        throw new NoAspectBoundException("com_thunderhead_android_aspects_IntentTidInjectionActivityAspect", read);
    }

    public static boolean hasAspect() {
        return write != null;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityForResult$260(Activity activity, Intent intent, int i) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityForResultWithBundle$322(Activity activity, Intent intent, int i, Bundle bundle) {
    }

    static {
        try {
            write = new IntentTidInjectionActivityAspect();
        } catch (Throwable th) {
            read = th;
        }
    }

    IntentTidInjectionActivityAspect() {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_IntentTidInjectionActivityAspect$1$41babbe0 */
    public void mo40156x998fd8b9(Activity activity, Intent intent, int i, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read2 = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            Integer.valueOf(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_IntentTidInjectionActivityAspect$2$384a14e0 */
    public void mo40157x49addc51(Activity activity, Intent intent, int i, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read2 = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int, Bundle), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            Integer.valueOf(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
