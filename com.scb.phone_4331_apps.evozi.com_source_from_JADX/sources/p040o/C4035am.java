package p040o;

import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.ImmutableMap;
import p040o.ImmutableMultimap;
import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.am */
public final /* synthetic */ class C4035am implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ C4035am MediaBrowserCompat$ItemReceiver = new C4035am();

    private /* synthetic */ C4035am() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).read(false);
    }

    /* renamed from: o.am$a */
    public final /* synthetic */ class C4039a implements dump {
        private final /* synthetic */ C4912kr IconCompatParcelizer;
        private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
        private final /* synthetic */ List MediaBrowserCompat$MediaItem;
        private final /* synthetic */ String[] MediaBrowserCompat$SearchResultReceiver;
        private final /* synthetic */ List MediaDescriptionCompat;
        private final /* synthetic */ List MediaMetadataCompat;
        private final /* synthetic */ List RatingCompat;
        private final /* synthetic */ List read;
        private final /* synthetic */ List write;

        public /* synthetic */ C4039a(C4912kr krVar, List list, List list2, List list3, List list4, List list5, List list6, List list7, String[] strArr, List list8) {
            this.IconCompatParcelizer = krVar;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
            this.read = list2;
            this.MediaBrowserCompat$ItemReceiver = list3;
            this.write = list4;
            this.MediaBrowserCompat$MediaItem = list5;
            this.MediaDescriptionCompat = list6;
            this.MediaMetadataCompat = list7;
            this.MediaBrowserCompat$SearchResultReceiver = strArr;
            this.RatingCompat = list8;
        }

        public final void MediaBrowserCompat$ItemReceiver(Object obj) {
            List list = this.MediaBrowserCompat$CustomActionResultReceiver;
            List list2 = this.read;
            List list3 = this.MediaBrowserCompat$ItemReceiver;
            List list4 = this.write;
            List list5 = this.MediaBrowserCompat$MediaItem;
            List list6 = this.MediaDescriptionCompat;
            List list7 = this.MediaMetadataCompat;
            String[] strArr = this.MediaBrowserCompat$SearchResultReceiver;
            List list8 = this.RatingCompat;
            getSignal getsignal = (getSignal) ((AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) obj);
            int read2 = getsignal.read();
            if (read2 == 12) {
                strArr[0] = DiskLruCache.VERSION_1;
            } else if (read2 == 14) {
                list7.add(new ImmutableMultimap.FieldSettersHolder(getsignal.IconCompatParcelizer, "", new ImmutableMultimap.EntryCollection(getsignal.MediaBrowserCompat$MediaItem)));
            } else if (read2 != 15) {
                switch (read2) {
                    case 2:
                        list.add(new createMap(getsignal.IconCompatParcelizer, ""));
                        return;
                    case 3:
                        list2.add(new ImmutableMap.Builder(getsignal.IconCompatParcelizer, ""));
                        return;
                    case 4:
                        list3.add(new ImmutableMap.SerializedForm(getsignal.IconCompatParcelizer, ""));
                        return;
                    case 5:
                        list4.add(C4912kr.MediaBrowserCompat$CustomActionResultReceiver(getsignal));
                        return;
                    case 6:
                        list5.add(C4912kr.MediaBrowserCompat$CustomActionResultReceiver(getsignal));
                        return;
                    case 7:
                        list6.add(C4912kr.IconCompatParcelizer(getsignal));
                        return;
                    default:
                        return;
                }
            } else {
                list8.add(new createKeys(getsignal.IconCompatParcelizer, ""));
            }
        }
    }
}
