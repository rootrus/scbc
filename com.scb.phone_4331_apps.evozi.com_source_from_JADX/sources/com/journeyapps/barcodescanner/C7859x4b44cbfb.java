package com.journeyapps.barcodescanner;

import java.util.List;
import p040o.getIIdDeserializerRtti;
import p040o.rsnScriptForEach;
import p040o.zzlr$MediaBrowserCompat$ItemReceiver;

/* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$MediaBrowserCompat$CustomActionResultReceiver */
class C7859x4b44cbfb implements getIIdDeserializerRtti {
    private /* synthetic */ DecoratedBarcodeView IconCompatParcelizer;
    private getIIdDeserializerRtti write;

    public C7859x4b44cbfb(DecoratedBarcodeView decoratedBarcodeView, getIIdDeserializerRtti getiiddeserializerrtti) {
        this.IconCompatParcelizer = decoratedBarcodeView;
        this.write = getiiddeserializerrtti;
    }

    public final void MediaBrowserCompat$ItemReceiver(zzlr$MediaBrowserCompat$ItemReceiver zzlr_mediabrowsercompat_itemreceiver) {
        this.write.MediaBrowserCompat$ItemReceiver(zzlr_mediabrowsercompat_itemreceiver);
    }

    public final void write(List<rsnScriptForEach> list) {
        for (rsnScriptForEach next : list) {
            ViewfinderView IconCompatParcelizer2 = this.IconCompatParcelizer.write;
            if (IconCompatParcelizer2.write.size() < 20) {
                IconCompatParcelizer2.write.add(next);
            }
        }
        this.write.write(list);
    }
}
