package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.Api;
import p040o.LinkedHashTreeMap;
import p040o.MapView;

/* renamed from: o.ICancelToken */
public final /* synthetic */ class ICancelToken implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ ICancelToken MediaBrowserCompat$CustomActionResultReceiver = new ICancelToken();

    private /* synthetic */ ICancelToken() {
    }

    public final Object write(Object obj) {
        return (encodedQuery) ((SingleDataEntity) obj).getData();
    }

    /* renamed from: o.ICancelToken$Stub */
    public final /* synthetic */ class Stub implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ Api.SimpleClient write;

        public /* synthetic */ Stub(Api.SimpleClient simpleClient) {
            this.write = simpleClient;
        }

        /* renamed from: o.ICancelToken$Stub$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ zabn MediaBrowserCompat$CustomActionResultReceiver;

            public /* synthetic */ zza(zabn zabn) {
                this.MediaBrowserCompat$CustomActionResultReceiver = zabn;
            }

            public final Object write(Object obj) {
                zabn zabn = this.MediaBrowserCompat$CustomActionResultReceiver;
                SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                onGetStartedClick.write((Object) singleDataEntity, "resetPinEntity");
                setCenterText setcentertext = (setCenterText) singleDataEntity.getData();
                String str = "";
                if (setcentertext == null) {
                    return new MapView.zzb(str, zabn.MediaBrowserCompat$ItemReceiver.write);
                }
                String str2 = setcentertext.MediaBrowserCompat$CustomActionResultReceiver;
                if (str2 != null) {
                    str = str2;
                }
                String str3 = setcentertext.write;
                if (str3 == null) {
                    str3 = zabn.MediaBrowserCompat$ItemReceiver.write;
                }
                return new MapView.zzb(str, str3);
            }
        }

        public final Object write(Object obj) {
            GoogleMap googleMap;
            zoomTo zoomto;
            zoomBy zoomby;
            keySet keyset = (keySet) obj;
            if (keyset == null) {
                return null;
            }
            zoomOut zoomout = new zoomOut();
            contains contains = keyset.MediaBrowserCompat$CustomActionResultReceiver;
            if (contains == null) {
                googleMap = null;
            } else {
                googleMap = new GoogleMap();
                googleMap.MediaDescriptionCompat = contains.MediaDescriptionCompat;
                googleMap.MediaBrowserCompat$ItemReceiver = contains.MediaBrowserCompat$CustomActionResultReceiver;
                googleMap.RatingCompat = contains.RatingCompat;
                googleMap.IconCompatParcelizer = contains.read;
                googleMap.MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindSummaryFragment.write(contains.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
                googleMap.MediaBrowserCompat$MediaItem = contains.MediaBrowserCompat$SearchResultReceiver;
                googleMap.read = contains.IconCompatParcelizer;
                googleMap.write = contains.write;
            }
            zoomout.MediaBrowserCompat$CustomActionResultReceiver = googleMap;
            LinkedHashTreeMap.C35681 r2 = keyset.IconCompatParcelizer;
            if (r2 == null) {
                zoomto = null;
            } else {
                zoomto = new zoomTo();
                zoomto.MediaBrowserCompat$ItemReceiver = r2.MediaBrowserCompat$CustomActionResultReceiver;
                zoomto.IconCompatParcelizer = r2.IconCompatParcelizer;
            }
            zoomout.IconCompatParcelizer = zoomto;
            next next = keyset.MediaBrowserCompat$ItemReceiver;
            if (next == null) {
                zoomby = null;
            } else {
                zoomby = new zoomBy();
                zoomby.read = next.read;
                zoomby.write = next.MediaBrowserCompat$CustomActionResultReceiver;
                zoomby.MediaBrowserCompat$ItemReceiver = next.IconCompatParcelizer;
                zoomby.MediaBrowserCompat$CustomActionResultReceiver = next.write;
            }
            zoomout.write = zoomby;
            zoomout.read = FragmentBuilder_BindSummaryFragment.write(keyset.write, (OffsetDateTime) null);
            return zoomout;
        }
    }
}
