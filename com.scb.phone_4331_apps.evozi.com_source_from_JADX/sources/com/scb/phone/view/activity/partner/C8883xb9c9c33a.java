package com.scb.phone.view.activity.partner;

import p040o.C4943log;
import p040o.addAnimation;
import p040o.findFragmentByWho;
import p040o.setSelect;

/* renamed from: com.scb.phone.view.activity.partner.PartnerLandingAdapter$PartnerTileHolder$MediaBrowserCompat$ItemReceiver */
public final class C8883xb9c9c33a implements findFragmentByWho {
    private C8883xb9c9c33a() {
    }

    public /* synthetic */ C8883xb9c9c33a(C4943log log) {
    }

    public final Object IconCompatParcelizer(Object obj) {
        addAnimation addanimation = (addAnimation) obj;
        return new setSelect(addanimation.MediaBrowserCompat$MediaItem, addanimation.MediaBrowserCompat$ItemReceiver, addanimation.read, addanimation.MediaBrowserCompat$CustomActionResultReceiver, addanimation.write);
    }
}
