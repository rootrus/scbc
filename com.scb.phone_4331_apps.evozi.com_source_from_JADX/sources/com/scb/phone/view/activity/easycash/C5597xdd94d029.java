package com.scb.phone.view.activity.easycash;

import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import p040o.Image;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.easycash.EasycashCarInformationActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5597xdd94d029 implements CustomSpinnerWithTitle.IconCompatParcelizer {
    private /* synthetic */ EasycashCarInformationActivity write;

    public final void write() {
    }

    C5597xdd94d029(EasycashCarInformationActivity easycashCarInformationActivity) {
        this.write = easycashCarInformationActivity;
    }

    public final void IconCompatParcelizer() {
        Image.BitmapDataObject bitmapDataObject = this.write.presenter;
        if (bitmapDataObject == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomSpinnerWithTitle customSpinnerWithTitle = this.write.spinnerLocation;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerLocation");
        }
        bitmapDataObject.read(customSpinnerWithTitle.spinner.getSelectedItemPosition() - 1);
    }
}
