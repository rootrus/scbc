package com.scb.phone.view.activity.additionaldocument;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.ImageCapturedEvent;
import com.kofax.kmc.kui.uicontrols.ImageCapturedListener;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.additionaldocument.CaptureDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5559x8d8da91d implements ImageCapturedListener {
    private /* synthetic */ CaptureDocumentActivity read;

    C5559x8d8da91d(CaptureDocumentActivity captureDocumentActivity) {
        this.read = captureDocumentActivity;
    }

    public final void onImageCaptured(ImageCapturedEvent imageCapturedEvent) {
        CaptureDocumentActivity captureDocumentActivity = this.read;
        onGetStartedClick.IconCompatParcelizer((Object) imageCapturedEvent, "event");
        Image image = imageCapturedEvent.getImage();
        onGetStartedClick.IconCompatParcelizer((Object) image, "event.image");
        CaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(captureDocumentActivity, image);
    }
}
