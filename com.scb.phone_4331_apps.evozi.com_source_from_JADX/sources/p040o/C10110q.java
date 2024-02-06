package p040o;

import java.util.List;
import p040o.Check;
import p040o.writeUInt64NoTag;

/* renamed from: o.q */
public final /* synthetic */ class C10110q implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isDataCollectionEnabled MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C9770xcd3c90c6 MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.q$a */
    public final /* synthetic */ class C5160a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ double MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ C5160a(double d) {
            this.MediaBrowserCompat$ItemReceiver = d;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckParameters_MembersInjector$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public /* synthetic */ C10110q(C9770xcd3c90c6 isgMrzDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver, isDataCollectionEnabled isdatacollectionenabled) {
        this.MediaBrowserCompat$ItemReceiver = isgMrzDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = isdatacollectionenabled;
    }

    public final void IconCompatParcelizer(Object obj) {
        List<isDebuggerAttached> list;
        List<isDebuggerAttached> list2;
        C9770xcd3c90c6 isgMrzDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver;
        isDataCollectionEnabled isdatacollectionenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        Check.IconCompatParcelizer iconCompatParcelizer = (Check.IconCompatParcelizer) obj;
        fillArray MediaBrowserCompat$ItemReceiver2 = isgMrzDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.IconCompatParcelizer;
        boolean itemInvoker = isgMrzDocumentDetector$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker();
        getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver read = getTotalRamInBytes.read();
        read.MediaBrowserCompat$SearchResultReceiver = fillArray.MediaBrowserCompat$ItemReceiver(isdatacollectionenabled.MediaMetadataCompat, new C10892Multiset(MediaBrowserCompat$ItemReceiver2));
        read.MediaBrowserCompat$MediaItem = isdatacollectionenabled.MediaDescriptionCompat;
        read.write = itemInvoker;
        getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver gettotalraminbytes_mediabrowsercompat_customactionresultreceiver = read;
        List<isDebuggerAttached> list3 = null;
        if (isdatacollectionenabled.write != null) {
            list = MediaBrowserCompat$ItemReceiver2.write(isdatacollectionenabled.write);
        } else {
            list = null;
        }
        gettotalraminbytes_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = list;
        getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver gettotalraminbytes_mediabrowsercompat_customactionresultreceiver2 = gettotalraminbytes_mediabrowsercompat_customactionresultreceiver;
        if (isdatacollectionenabled.MediaBrowserCompat$SearchResultReceiver != null) {
            list2 = MediaBrowserCompat$ItemReceiver2.write(isdatacollectionenabled.MediaBrowserCompat$SearchResultReceiver);
        } else {
            list2 = null;
        }
        gettotalraminbytes_mediabrowsercompat_customactionresultreceiver2.RatingCompat = list2;
        getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver gettotalraminbytes_mediabrowsercompat_customactionresultreceiver3 = gettotalraminbytes_mediabrowsercompat_customactionresultreceiver2;
        if (isdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver != null) {
            list3 = MediaBrowserCompat$ItemReceiver2.write(isdatacollectionenabled.MediaBrowserCompat$CustomActionResultReceiver);
        }
        gettotalraminbytes_mediabrowsercompat_customactionresultreceiver3.read = list3;
        getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver gettotalraminbytes_mediabrowsercompat_customactionresultreceiver4 = gettotalraminbytes_mediabrowsercompat_customactionresultreceiver3;
        gettotalraminbytes_mediabrowsercompat_customactionresultreceiver4.IconCompatParcelizer = isdatacollectionenabled.read;
        getTotalRamInBytes$MediaBrowserCompat$CustomActionResultReceiver gettotalraminbytes_mediabrowsercompat_customactionresultreceiver5 = gettotalraminbytes_mediabrowsercompat_customactionresultreceiver4;
        gettotalraminbytes_mediabrowsercompat_customactionresultreceiver5.MediaBrowserCompat$ItemReceiver = isdatacollectionenabled.MediaBrowserCompat$ItemReceiver;
        iconCompatParcelizer.write(new getTotalRamInBytes(gettotalraminbytes_mediabrowsercompat_customactionresultreceiver5, (byte) 0));
    }
}
