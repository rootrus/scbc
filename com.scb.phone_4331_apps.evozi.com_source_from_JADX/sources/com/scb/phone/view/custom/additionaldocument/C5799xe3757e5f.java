package com.scb.phone.view.custom.additionaldocument;

import android.view.View;
import p040o.FundFactSheetActivity;
import p040o.Futures;

/* renamed from: com.scb.phone.view.custom.additionaldocument.DocumentsUploadedSectionCustomView$MediaBrowserCompat$ItemReceiver */
public final class C5799xe3757e5f implements View.OnClickListener {
    private /* synthetic */ FundFactSheetActivity read;
    private /* synthetic */ Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer write;

    public C5799xe3757e5f(FundFactSheetActivity fundFactSheetActivity, Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer) {
        this.read = fundFactSheetActivity;
        this.write = iconCompatParcelizer;
    }

    public final void onClick(View view) {
        this.read.invoke(this.write.read);
    }
}
