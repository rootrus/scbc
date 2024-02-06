package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.C4889kC;
import p040o.writeUInt64NoTag;

/* renamed from: o.jl */
public final /* synthetic */ class C4873jl implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4889kC.read IconCompatParcelizer;

    public /* synthetic */ C4873jl(C4889kC.read read) {
        this.IconCompatParcelizer = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        C4889kC.read read = this.IconCompatParcelizer;
        getMicr getmicr = (getMicr) obj;
        isCompatIPv4Address unused = C4889kC.this.MediaSessionCompat$Token;
        setExecution MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = C4889kC.this.write;
        endCap MediaBrowserCompat$MediaItem = C4889kC.this.MediaSessionCompat$ResultReceiverWrapper;
        List<zzup> list = MediaBrowserCompat$MediaItem.IconCompatParcelizer.RatingCompat().MediaBrowserCompat$ItemReceiver;
        List<zzvo> IconCompatParcelizer2 = MediaBrowserCompat$MediaItem.write.IconCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        for (zzup next : list) {
            show show = new show(IconCompatParcelizer2);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new BitmapDescriptor(next)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (issupportfragmentclass.IconCompatParcelizer != null) {
                arrayList.add(next);
            }
        }
        getmicr.IconCompatParcelizer(new C3080xc2f5febc(MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.MediaMetadataCompat, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.IconCompatParcelizer, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.read, isCompatIPv4Address.MediaBrowserCompat$ItemReceiver(arrayList)));
    }
}
