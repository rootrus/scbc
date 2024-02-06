package com.thunderhead.android.aspects;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import org.aspectj.lang.NoAspectBoundException;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class SupportFragmentIntentTidInjectionAspect {
    /* access modifiers changed from: private */
    public static /* synthetic */ SupportFragmentIntentTidInjectionAspect IconCompatParcelizer;
    private static /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    /* renamed from: ajc$around$com_thunderhead_android_aspects_SupportFragmentIntentTidInjectionAspect$1$a1d6fc7fproceed */
    static /* synthetic */ void m5755x429271ca(Fragment fragment, Intent intent, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_SupportFragmentIntentTidInjectionAspect$2$cad8ffc7proceed */
    static /* synthetic */ void m5756xf6346773(Fragment fragment, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) throws Throwable {
    }

    public static SupportFragmentIntentTidInjectionAspect aspectOf() {
        SupportFragmentIntentTidInjectionAspect supportFragmentIntentTidInjectionAspect = IconCompatParcelizer;
        if (supportFragmentIntentTidInjectionAspect != null) {
            return supportFragmentIntentTidInjectionAspect;
        }
        throw new NoAspectBoundException("com_thunderhead_android_aspects_SupportFragmentIntentTidInjectionAspect", MediaBrowserCompat$ItemReceiver);
    }

    public static boolean hasAspect() {
        return IconCompatParcelizer != null;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivity$1dc(Fragment fragment, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityBundle$263(Fragment fragment, Intent intent, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityForResult$311(Fragment fragment, Intent intent, int i) {
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcStartActivityForResultBundle$3cd(Fragment fragment, Intent intent, int i, Bundle bundle) {
    }

    static {
        try {
            IconCompatParcelizer = new SupportFragmentIntentTidInjectionAspect();
        } catch (Throwable th) {
            MediaBrowserCompat$ItemReceiver = th;
        }
    }

    SupportFragmentIntentTidInjectionAspect() {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_SupportFragmentIntentTidInjectionAspect$1$a1d6fc7f */
    public void mo55734xdafbf264(Fragment fragment, Intent intent, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
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
            m5755x429271ca(fragment, intent, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_SupportFragmentIntentTidInjectionAspect$2$cad8ffc7 */
    public void mo55735x8a4f18db(Fragment fragment, Intent intent, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
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
            m5756xf6346773(fragment, intent, bundle, merchantWalletSelectorAdapter$ItemViewHolder);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_SupportFragmentIntentTidInjectionAspect$3$92e8d01 */
    public void mo55736x27323d45(Fragment fragment, Intent intent, int i, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
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

    /* renamed from: ajc$around$com_thunderhead_android_aspects_SupportFragmentIntentTidInjectionAspect$4$a0861189 */
    public void mo55737x37c3fbc1(Fragment fragment, Intent intent, int i, Bundle bundle, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
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
