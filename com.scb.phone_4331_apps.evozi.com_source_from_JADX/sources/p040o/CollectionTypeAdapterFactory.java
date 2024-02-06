package p040o;

import p040o.IdCaptureModule;
import p040o.newFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.CollectionTypeAdapterFactory */
public final /* synthetic */ class CollectionTypeAdapterFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getComponent MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ newFactory.C50594 write;

    public /* synthetic */ CollectionTypeAdapterFactory(newFactory.C50594 r1, getComponent getcomponent) {
        this.write = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = getcomponent;
    }

    public final void IconCompatParcelizer(Object obj) {
        newFactory.C50594 r0 = this.write;
        getComponent getcomponent = this.MediaBrowserCompat$CustomActionResultReceiver;
        IdCaptureModule.C6905a aVar = (IdCaptureModule.C6905a) obj;
        boolean shortcut = newFactory.this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.setShortcut();
        aVar.aj_();
        aVar.write(!shortcut);
        aVar.MediaBrowserCompat$CustomActionResultReceiver(getcomponent);
        if (shortcut) {
            aVar.read(newFactory.this.read, false);
        }
    }

    /* renamed from: o.CollectionTypeAdapterFactory$Adapter */
    public final /* synthetic */ class Adapter implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ newFactory read;

        public /* synthetic */ Adapter(newFactory newfactory) {
            this.read = newfactory;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((IdCaptureModule.C6905a) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read.read, true, false);
        }
    }
}
