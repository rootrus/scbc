package com.thunderhead.android.aspects;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import org.aspectj.lang.NoAspectBoundException;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class FragmentIntentTidInjectionAspect {
    /* access modifiers changed from: private */
    public static /* synthetic */ FragmentIntentTidInjectionAspect MediaBrowserCompat$CustomActionResultReceiver;
    private static /* synthetic */ Throwable write;

    /* renamed from: ajc$around$com_thunderhead_android_aspects_FragmentIntentTidInjectionAspect$1$a1d6fc7fproceed */
    static /* synthetic */ void m5747xd9314a8f(Fragment fragment, Intent intent, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_FragmentIntentTidInjectionAspect$2$cad8ffc7proceed */
    static /* synthetic */ void m5748x8cd34038(Fragment fragment, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    public static FragmentIntentTidInjectionAspect aspectOf() {
        FragmentIntentTidInjectionAspect fragmentIntentTidInjectionAspect = MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentIntentTidInjectionAspect != null) {
            return fragmentIntentTidInjectionAspect;
        }
        throw new NoAspectBoundException("com_thunderhead_android_aspects_FragmentIntentTidInjectionAspect", write);
    }

    public static boolean hasAspect() {
        return MediaBrowserCompat$CustomActionResultReceiver != null;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivity$1d2(Fragment fragment, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityBundle$259(Fragment fragment, Intent intent, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityForResult$307(Fragment fragment, Intent intent, int i) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityForResultBundle$3c3(Fragment fragment, Intent intent, int i, Bundle bundle) {
    }

    static {
        try {
            MediaBrowserCompat$CustomActionResultReceiver = new FragmentIntentTidInjectionAspect();
        } catch (Throwable th) {
            write = th;
        }
    }

    FragmentIntentTidInjectionAspect() {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_FragmentIntentTidInjectionAspect$1$a1d6fc7f */
    public void mo55726x44973d3f(Fragment fragment, Intent intent, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Activity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            m5747xd9314a8f(fragment, intent, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_FragmentIntentTidInjectionAspect$2$cad8ffc7 */
    public void mo55727xf3ea63b6(Fragment fragment, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Activity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Fragment.startActivity(Intent, Bundle), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            m5748x8cd34038(fragment, intent, bundle, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_FragmentIntentTidInjectionAspect$3$92e8d01 */
    public void mo55728x53e4ab0a(Fragment fragment, Intent intent, int i, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Activity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            Integer.valueOf(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_FragmentIntentTidInjectionAspect$4$a0861189 */
    public void mo55729xa15f469c(Fragment fragment, Intent intent, int i, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Activity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Fragment.startActivityForResult(Intent, int, Bundle), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            Integer.valueOf(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
