package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.impl.view.SelfieOverlayView;
import com.kofax.mobile.sdk._internal.view.C8238n;

public class CaptureAnimationsModule {
    public IDocumentBaseOverlayView provideIDocumentBaseOverlayView(DocumentBaseOverlayView documentBaseOverlayView) {
        return documentBaseOverlayView;
    }

    public C8238n provideIISelfieOverlayView(SelfieOverlayView selfieOverlayView) {
        return selfieOverlayView;
    }
}
