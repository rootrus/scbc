package p040o;

import p040o.AlertController$RecycleListView;
import p040o.FirebaseMessagingRegistrar;
import p040o.writeUInt64NoTag;

/* renamed from: o.onSendError */
public final /* synthetic */ class onSendError implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ chain MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getContour write;

    public /* synthetic */ onSendError(getContour getcontour, chain chain) {
        this.write = getcontour;
        this.MediaBrowserCompat$ItemReceiver = chain;
    }

    public final void IconCompatParcelizer(Object obj) {
        getContour getcontour = this.write;
        chain chain = this.MediaBrowserCompat$ItemReceiver;
        setResultDeserializer setresultdeserializer = (setResultDeserializer) obj;
        if (chain == null) {
            return;
        }
        if (!AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(chain.setPrimaryBackground)) {
            setresultdeserializer.MediaBrowserCompat$ItemReceiver(chain.setStackedBackground, chain.setPrimaryBackground);
            return;
        }
        getLocalPort getlocalport = getcontour.IconCompatParcelizer;
        getlocalport.read(getlocalport.read(chain.MediaDescriptionCompat), new FirebaseMLException(getcontour, chain), new FirebaseMessagingRegistrar.zzb(getcontour));
    }
}
