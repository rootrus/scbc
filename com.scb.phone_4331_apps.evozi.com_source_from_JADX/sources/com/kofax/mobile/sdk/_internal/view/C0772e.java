package com.kofax.mobile.sdk._internal.view;

import android.view.View;
import com.kofax.mobile.sdk._internal.capture.CaptureMessage;

/* renamed from: com.kofax.mobile.sdk._internal.view.e */
public interface C0772e {
    /* renamed from: a */
    void mo11873a(CaptureMessage captureMessage, IMessageListener iMessageListener);

    /* renamed from: a */
    void mo11874a(CaptureMessage captureMessage, IMessageListener iMessageListener, int i);

    /* renamed from: a */
    void mo11875a(CaptureMessage captureMessage, IMessageListener iMessageListener, int i, boolean z);

    void clear();

    View getView();

    boolean isMessageDisplayed();
}
