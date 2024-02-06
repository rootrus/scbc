package com.scb.phone.view.fragment.remittance;

import android.content.Context;
import com.scb.phone.R;
import p040o.ForwardingListenableFuture;
import p040o.onGetStartedClick;
import p040o.setImportance;

/* renamed from: com.scb.phone.view.fragment.remittance.RemittanceSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6161xc2059ba2 extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
    setImportance IconCompatParcelizer;
    final Context read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6161xc2059ba2(Context context, String str, boolean z, setImportance setimportance) {
        super(R.layout.f91752131494402, str, z);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "fileName");
        onGetStartedClick.write((Object) setimportance, "display");
        this.read = context;
        this.IconCompatParcelizer = setimportance;
    }
}
