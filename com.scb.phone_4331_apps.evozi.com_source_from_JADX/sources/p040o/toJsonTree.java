package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.Maps;
import p040o.zzqj;

/* renamed from: o.toJsonTree */
public class toJsonTree extends writeUInt64NoTag<getLicense> {
    public getSupportedCipherSuites IconCompatParcelizer;
    /* access modifiers changed from: private */
    public Maps.TransformedEntriesMap write;

    @HmlPinActivity
    public toJsonTree(RegularImmutableBiMap regularImmutableBiMap, getSupportedCipherSuites getsupportedciphersuites, Maps.TransformedEntriesMap transformedEntriesMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = getsupportedciphersuites;
        this.write = transformedEntriesMap;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(boolean z, getLicense getlicense) {
        if (z) {
            getlicense.MediaBrowserCompat$ItemReceiver();
        } else {
            getlicense.read();
        }
    }

    /* renamed from: o.toJsonTree$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzqj.zzb> {
        private lambda$of$1 IconCompatParcelizer;

        public final /* synthetic */ void onNext(Object obj) {
            String str;
            int i;
            zzqj.zzb zzb = (zzqj.zzb) obj;
            Maps.TransformedEntriesMap MediaBrowserCompat$CustomActionResultReceiver2 = toJsonTree.this.write;
            lambda$of$1 lambda_of_1 = this.IconCompatParcelizer;
            AbstractComponentContainer abstractComponentContainer = new AbstractComponentContainer();
            abstractComponentContainer.PlaybackStateCompat$CustomAction = MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(zzb.MediaDescriptionCompat));
            abstractComponentContainer.setHasDecor = zzb.RatingCompat;
            abstractComponentContainer.MediaBrowserCompat$ItemReceiver = lambda_of_1.MediaBrowserCompat$CustomActionResultReceiver;
            abstractComponentContainer.MediaSessionCompat$QueueItem = lambda_of_1.RatingCompat;
            abstractComponentContainer.PlaybackStateCompat = lambda_of_1.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem;
            abstractComponentContainer.RatingCompat = lambda_of_1.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$Token;
            abstractComponentContainer.ParcelableVolumeInfo = lambda_of_1.read;
            abstractComponentContainer.MediaBrowserCompat$MediaItem = lambda_of_1.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem;
            abstractComponentContainer.MediaSessionCompat$Token = zzb.MediaBrowserCompat$CustomActionResultReceiver;
            abstractComponentContainer.Keep = zzb.MediaBrowserCompat$ItemReceiver;
            abstractComponentContainer.AppCompatActivity = lambda_of_1.write;
            abstractComponentContainer.AppCompatDialogFragment = lambda_of_1.MediaBrowserCompat$MediaItem;
            abstractComponentContainer.AppCompatViewInflater = lambda_of_1.f2886x50fd9e4a;
            abstractComponentContainer.MediaMetadataCompat = lambda_of_1.MediaBrowserCompat$ItemReceiver;
            abstractComponentContainer.setExpandedFormat = lambda_of_1.MediaSessionCompat$ResultReceiverWrapper;
            String str2 = "";
            if (zzb.read != null) {
                str = zzb.read;
            } else {
                str = str2;
            }
            abstractComponentContainer.AlertController$RecycleListView = str;
            if (zzb.MediaBrowserCompat$MediaItem != null) {
                str2 = zzb.MediaBrowserCompat$MediaItem;
            }
            abstractComponentContainer.setContentView = str2;
            boolean z = false;
            if (zzb.MediaBrowserCompat$SearchResultReceiver != null) {
                i = zzb.MediaBrowserCompat$SearchResultReceiver.intValue();
            } else {
                i = 0;
            }
            abstractComponentContainer.AppCompatDelegateImpl$ListMenuDecorView = Integer.valueOf(i);
            toJsonTree tojsontree = toJsonTree.this;
            doubleAdapter doubleadapter = new doubleAdapter(abstractComponentContainer);
            if (tojsontree.RatingCompat != null) {
                z = true;
            }
            if (z) {
                doubleadapter.IconCompatParcelizer(tojsontree.RatingCompat);
            }
        }

        public IconCompatParcelizer(lambda$of$1 lambda_of_1) {
            this.IconCompatParcelizer = lambda_of_1;
        }

        public final void onComplete() {
            toJsonTree.read(toJsonTree.this);
        }

        public final void onError(Throwable th) {
            if (!toJsonTree.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                toJsonTree.MediaBrowserCompat$ItemReceiver(toJsonTree.this);
                toJsonTree tojsontree = toJsonTree.this;
                floatAdapter floatadapter = new floatAdapter(this, th);
                if (tojsontree.RatingCompat != null) {
                    floatadapter.IconCompatParcelizer(tojsontree.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void read(toJsonTree tojsontree) {
        if (tojsontree.RatingCompat != null) {
            tojsontree.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(toJsonTree tojsontree) {
        if (tojsontree.RatingCompat != null) {
            tojsontree.RatingCompat.aj_();
        }
    }
}
