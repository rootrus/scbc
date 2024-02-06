package com.scb.phone.view.fragment.prepaid.activation;

import android.view.View;
import p040o.C4773hl;
import p040o.hl$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.prepaid.activation.PrepaidActivationInputFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6122x9a5447e3 implements View.OnFocusChangeListener {
    private /* synthetic */ PrepaidActivationInputFragment IconCompatParcelizer;

    C6122x9a5447e3(PrepaidActivationInputFragment prepaidActivationInputFragment) {
        this.IconCompatParcelizer = prepaidActivationInputFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        C4773hl hlVar = this.IconCompatParcelizer.presenter;
        if (hlVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hlVar.write(!z, new hl$MediaBrowserCompat$CustomActionResultReceiver(hlVar));
    }
}
