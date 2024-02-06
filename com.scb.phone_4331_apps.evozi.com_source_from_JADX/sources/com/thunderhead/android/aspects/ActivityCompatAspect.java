package com.thunderhead.android.aspects;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.aspectj.lang.NoAspectBoundException;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class ActivityCompatAspect {
    /* access modifiers changed from: private */
    public static /* synthetic */ ActivityCompatAspect IconCompatParcelizer;
    private static /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    /* renamed from: ajc$around$com_thunderhead_android_aspects_ActivityCompatAspect$2$353f8974proceed */
    static /* synthetic */ void m5738x63d53068(Context context, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    public static ActivityCompatAspect aspectOf() {
        ActivityCompatAspect activityCompatAspect = IconCompatParcelizer;
        if (activityCompatAspect != null) {
            return activityCompatAspect;
        }
        throw new NoAspectBoundException("com_thunderhead_android_aspects_ActivityCompatAspect", MediaBrowserCompat$ItemReceiver);
    }

    public static boolean hasAspect() {
        return IconCompatParcelizer != null;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivity$72e(Context context, Intent intent, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityForResult$317(Activity activity, Intent intent, int i, Bundle bundle) {
    }

    static {
        try {
            IconCompatParcelizer = new ActivityCompatAspect();
        } catch (Throwable th) {
            MediaBrowserCompat$ItemReceiver = th;
        }
    }

    ActivityCompatAspect() {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_ActivityCompatAspect$1$1e129c48 */
    public void mo55716x251b3517(Activity activity, Intent intent, int i, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on ActivityCompat.startActivityForResult(Activity, Intent, int, Bundle), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            Integer.valueOf(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_ActivityCompatAspect$2$353f8974 */
    public void mo55717x4414986(Context context, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on ActivityCompat.startActivity(Context, Intent, Bundle), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            m5738x63d53068(context, read, bundle, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
