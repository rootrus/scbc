package com.thunderhead.android.aspects;

import android.content.Intent;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.aspectj.lang.NoAspectBoundException;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class CordovaAspect {
    /* access modifiers changed from: private */
    public static /* synthetic */ CordovaAspect MediaBrowserCompat$CustomActionResultReceiver;
    private static /* synthetic */ Throwable write;

    public static CordovaAspect aspectOf() {
        CordovaAspect cordovaAspect = MediaBrowserCompat$CustomActionResultReceiver;
        if (cordovaAspect != null) {
            return cordovaAspect;
        }
        throw new NoAspectBoundException("com_thunderhead_android_aspects_CordovaAspect", write);
    }

    public static boolean hasAspect() {
        return MediaBrowserCompat$CustomActionResultReceiver != null;
    }

    /* access modifiers changed from: package-private */
    public /* synthetic */ void ajc$pointcut$$pcCordovaStartActivityForResult$28e(CordovaInterface cordovaInterface, CordovaPlugin cordovaPlugin, Intent intent, int i) {
    }

    static {
        try {
            MediaBrowserCompat$CustomActionResultReceiver = new CordovaAspect();
        } catch (Throwable th) {
            write = th;
        }
    }

    CordovaAspect() {
    }

    /* renamed from: ajc$around$com_thunderhead_android_aspects_CordovaAspect$1$4fd0585f */
    public void mo55720xf240a8cf(CordovaInterface cordovaInterface, CordovaPlugin cordovaPlugin, Intent intent, int i, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(cordovaInterface.getActivity(), intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on CordovaInterface.startActivityForResult(CordovaPlugin, Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(cordovaInterface.getActivity().hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            Integer.valueOf(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
