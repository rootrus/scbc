package com.thunderhead.android.aspects;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import org.aspectj.lang.NoAspectBoundException;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class AndroidXSupportFragmentIntentTidInjectionAspect {
    /* access modifiers changed from: private */
    public static /* synthetic */ AndroidXSupportFragmentIntentTidInjectionAspect IconCompatParcelizer;
    private static /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    /* renamed from: ajc$around$com_thunderhead_android_aspects_AndroidXSupportFragmentIntentTidInjectionAspect$1$11907228proceed */
    static /* synthetic */ void m3473x5118e477(Fragment fragment, Intent intent, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_AndroidXSupportFragmentIntentTidInjectionAspect$2$b20f5a3eproceed */
    static /* synthetic */ void m3474x7a093b6c(Fragment fragment, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    public static AndroidXSupportFragmentIntentTidInjectionAspect aspectOf() {
        AndroidXSupportFragmentIntentTidInjectionAspect androidXSupportFragmentIntentTidInjectionAspect = IconCompatParcelizer;
        if (androidXSupportFragmentIntentTidInjectionAspect != null) {
            return androidXSupportFragmentIntentTidInjectionAspect;
        }
        throw new NoAspectBoundException("com_thunderhead_android_aspects_AndroidXSupportFragmentIntentTidInjectionAspect", MediaBrowserCompat$ItemReceiver);
    }

    public static boolean hasAspect() {
        return IconCompatParcelizer != null;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityAndroidX$1e4(Fragment fragment, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityBundleAndroidX$273(Fragment fragment, Intent intent, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityForResultAndroidX$329(Fragment fragment, Intent intent, int i) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityForResultBundleAndroidX$3ed(Fragment fragment, Intent intent, int i, Bundle bundle) {
    }

    static {
        try {
            IconCompatParcelizer = new AndroidXSupportFragmentIntentTidInjectionAspect();
        } catch (Throwable th) {
            MediaBrowserCompat$ItemReceiver = th;
        }
    }

    AndroidXSupportFragmentIntentTidInjectionAspect() {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_AndroidXSupportFragmentIntentTidInjectionAspect$1$11907228 */
    public void mo40148xe9a37857(Fragment fragment, Intent intent, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            m3473x5118e477(fragment, intent, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_AndroidXSupportFragmentIntentTidInjectionAspect$2$b20f5a3e */
    public void mo40149xe889db02(Fragment fragment, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent, Bundle), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            m3474x7a093b6c(fragment, intent, bundle, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_AndroidXSupportFragmentIntentTidInjectionAspect$3$d6675bf8 */
    public void mo40150x87d55faf(Fragment fragment, Intent intent, int i, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            Integer.valueOf(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_AndroidXSupportFragmentIntentTidInjectionAspect$4$deb36672 */
    public void mo40151x7d405889(Fragment fragment, Intent intent, int i, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResultBundle(Intent, int, Bundle), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            Integer.valueOf(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
