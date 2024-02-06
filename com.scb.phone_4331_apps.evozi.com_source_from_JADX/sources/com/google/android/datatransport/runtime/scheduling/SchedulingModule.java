package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import android.os.Build;
import p040o.C10881getCAR;
import p040o.C7507tQ;
import p040o.CreditCardCaptureModule;
import p040o.CreditCardCaptureModule_GetIParametersFactory;
import p040o.isComplex;
import p040o.nAllocationCreateFromBitmap;

public abstract class SchedulingModule {
    /* access modifiers changed from: package-private */
    public abstract C10881getCAR write(isComplex.C137111 r1);

    public static CreditCardCaptureModule IconCompatParcelizer(Context context, C7507tQ tQVar, nAllocationCreateFromBitmap nallocationcreatefrombitmap, CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new isComplex.C137616(context, tQVar, nallocationcreatefrombitmap);
        }
        return new isComplex.C137820(context, tQVar, creditCardCaptureModule_GetIParametersFactory, nallocationcreatefrombitmap);
    }
}
