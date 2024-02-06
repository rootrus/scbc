package com.thunderhead.android.aspects;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import org.aspectj.lang.NoAspectBoundException;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onRotateClicked;

public class CustomTabsTidInjectionAspect {
    private static /* synthetic */ Throwable IconCompatParcelizer;
    /* access modifiers changed from: private */
    public static /* synthetic */ CustomTabsTidInjectionAspect MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: ajc$around$com_thunderhead_android_aspects_CustomTabsTidInjectionAspect$1$197c0341proceed */
    static /* synthetic */ void m5743xb91b57ac(Context context, Uri uri, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_CustomTabsTidInjectionAspect$2$95124330proceed */
    static /* synthetic */ void m5744x9883c228(Activity activity, Uri uri, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    public static CustomTabsTidInjectionAspect aspectOf() {
        CustomTabsTidInjectionAspect customTabsTidInjectionAspect = MediaBrowserCompat$CustomActionResultReceiver;
        if (customTabsTidInjectionAspect != null) {
            return customTabsTidInjectionAspect;
        }
        throw new NoAspectBoundException("com_thunderhead_android_aspects_CustomTabsTidInjectionAspect", IconCompatParcelizer);
    }

    public static boolean hasAspect() {
        return MediaBrowserCompat$CustomActionResultReceiver != null;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcLaunchUrl$20c(Context context, Uri uri) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcLaunchUrlActivity$2ea(Activity activity, Uri uri) {
    }

    static {
        try {
            MediaBrowserCompat$CustomActionResultReceiver = new CustomTabsTidInjectionAspect();
        } catch (Throwable th) {
            IconCompatParcelizer = th;
        }
    }

    CustomTabsTidInjectionAspect() {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_CustomTabsTidInjectionAspect$1$197c0341 */
    public void mo55722x22c306c2(Context context, Uri uri, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            new onRotateClicked();
            Uri read = onRotateClicked.read(uri);
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on CustomTabsIntent.launchUrl(Context, Uri), modified: ");
            sb.append(read);
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            m5743xb91b57ac(context, read, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_CustomTabsTidInjectionAspect$2$95124330 */
    public void mo55723x758f2fc6(Activity activity, Uri uri, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            new onRotateClicked();
            Uri read = onRotateClicked.read(uri);
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on CustomTabsIntent.launchUrl(Activity, Uri), modified: ");
            sb.append(read);
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            m5744x9883c228(activity, read, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
