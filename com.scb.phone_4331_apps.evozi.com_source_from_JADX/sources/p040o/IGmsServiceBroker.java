package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.LottieCompositionFactory;
import p040o.notNull;
import p040o.zzge;

/* renamed from: o.IGmsServiceBroker */
public final /* synthetic */ class IGmsServiceBroker implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ zzge.zzg write;

    public /* synthetic */ IGmsServiceBroker(zzge.zzg zzg) {
        this.write = zzg;
    }

    /* renamed from: o.IGmsServiceBroker$Stub */
    public final /* synthetic */ class Stub implements DebitCardMarketConductDeepLinkActivity {
        private final /* synthetic */ FragmentBuilder_BindSettingTabFragment read;

        /* renamed from: o.IGmsServiceBroker$Stub$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zza read = new zza();

            private /* synthetic */ zza() {
            }

            public final Object write(Object obj) {
                return (LottieCompositionFactory.C361110) ((SingleDataEntity) obj).getData();
            }
        }

        public /* synthetic */ Stub(FragmentBuilder_BindSettingTabFragment fragmentBuilder_BindSettingTabFragment) {
            this.read = fragmentBuilder_BindSettingTabFragment;
        }

        public final void IconCompatParcelizer(Object obj) {
            this.read.MediaBrowserCompat$ItemReceiver = (List) obj;
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        setBearing setbearing;
        C7506tP tPVar = (C7506tP) obj;
        notNull.read read = this.write.MediaDescriptionCompat;
        if (tPVar.MediaSessionCompat$QueueItem == null) {
            setbearing = null;
        } else {
            setBearing setbearing2 = new setBearing();
            setbearing2.write = tPVar.MediaSessionCompat$QueueItem.MediaMetadataCompat;
            setbearing2.MediaBrowserCompat$ItemReceiver = tPVar.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver;
            setbearing2.MediaBrowserCompat$CustomActionResultReceiver = tPVar.MediaSessionCompat$QueueItem.write;
            setbearing2.read = tPVar.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem;
            setbearing2.IconCompatParcelizer = tPVar.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver;
            setbearing2.MediaBrowserCompat$MediaItem = tPVar.MediaSessionCompat$QueueItem.RatingCompat;
            setbearing = setbearing2;
        }
        read.read(setbearing);
    }
}
