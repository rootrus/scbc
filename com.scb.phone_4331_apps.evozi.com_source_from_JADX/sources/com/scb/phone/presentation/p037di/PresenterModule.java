package com.scb.phone.presentation.p037di;

import android.content.Context;
import p040o.CheckCaptureModule;
import p040o.FragmentBuilder_BindOrderChequeInputFragment;
import p040o.FragmentBuilder_BindPersonalLimitFragment;
import p040o.HmlSetNTBPinActivity;
import p040o.Iterables;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.presentation.di.PresenterModule */
public final class PresenterModule {
    @HmlSetNTBPinActivity
    public final Iterables.C352212 write() {
        return new Iterables.C352212() {
            private String IconCompatParcelizer;

            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                onGetStartedClick.write((Object) str, "pageName");
                this.IconCompatParcelizer = str;
            }

            public final String IconCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final String write() {
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) C35284.NTB_LIFE_STYLE_LANDING.name()) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) C35284.NTB_WELCOME_ABOARD.name())) {
                    String upperCase = "ntb".toUpperCase();
                    onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
                    return upperCase;
                }
                String upperCase2 = "etb".toUpperCase();
                onGetStartedClick.IconCompatParcelizer((Object) upperCase2, "(this as java.lang.String).toUpperCase()");
                return upperCase2;
            }
        };
    }

    public final CheckCaptureModule.KtaExceptionResponseDeserializer MediaBrowserCompat$ItemReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        FragmentBuilder_BindOrderChequeInputFragment fragmentBuilder_BindOrderChequeInputFragment = new FragmentBuilder_BindOrderChequeInputFragment(new FragmentBuilder_BindPersonalLimitFragment(context), context);
        onGetStartedClick.IconCompatParcelizer((Object) fragmentBuilder_BindOrderChequeInputFragment, "AppUpdateManagerFactory.create(context)");
        return new CheckCaptureModule.KtaExceptionResponseDeserializer(context, fragmentBuilder_BindOrderChequeInputFragment);
    }
}
