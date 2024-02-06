package p040o;

import java.util.ArrayList;
import org.threeten.p041bp.OffsetDateTime;
import p040o.Constraints;
import p040o.Maps;
import p040o.zzqj;

/* renamed from: o.newParameterizedTypeWithOwner */
public class newParameterizedTypeWithOwner extends writeUInt64NoTag<IdCaptureBackActivity> {
    public lambda$intoSet$2 IconCompatParcelizer;
    /* access modifiers changed from: private */
    public Maps.TransformedEntriesMap read;
    private getSupportedCipherSuites write;

    @HmlPinActivity
    public newParameterizedTypeWithOwner(RegularImmutableBiMap regularImmutableBiMap, getSupportedCipherSuites getsupportedciphersuites, Maps.TransformedEntriesMap transformedEntriesMap) {
        super(regularImmutableBiMap);
        this.write = getsupportedciphersuites;
        this.read = transformedEntriesMap;
    }

    static /* synthetic */ void IconCompatParcelizer(boolean z, boolean z2, IdCaptureBackActivity idCaptureBackActivity) {
        if (z || z2) {
            idCaptureBackActivity.MediaDescriptionCompat();
        } else {
            idCaptureBackActivity.MediaMetadataCompat();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(int i, IdCaptureBackActivity idCaptureBackActivity) {
        if (i <= 1) {
            idCaptureBackActivity.RatingCompat();
        }
    }

    /* renamed from: o.newParameterizedTypeWithOwner$write */
    class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzqj.zzb> {
        write() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str;
            int i;
            zzqj.zzb zzb = (zzqj.zzb) obj;
            Maps.TransformedEntriesMap IconCompatParcelizer = newParameterizedTypeWithOwner.this.read;
            lambda$intoSet$2 write = newParameterizedTypeWithOwner.this.IconCompatParcelizer;
            AnalyticsConnectorRegistrar analyticsConnectorRegistrar = new AnalyticsConnectorRegistrar();
            OffsetDateTime parse = OffsetDateTime.parse(zzb.MediaDescriptionCompat);
            analyticsConnectorRegistrar.PlaybackStateCompat$CustomAction = IconCompatParcelizer.IconCompatParcelizer("dd MMM yyyy - HH:mm", parse);
            analyticsConnectorRegistrar.setHasDecor = zzb.RatingCompat;
            analyticsConnectorRegistrar.MediaBrowserCompat$ItemReceiver = write.write;
            analyticsConnectorRegistrar.MediaSessionCompat$QueueItem = write.AlertController$RecycleListView;
            analyticsConnectorRegistrar.PlaybackStateCompat = write.setHasDecor;
            analyticsConnectorRegistrar.RatingCompat = write.ParcelableVolumeInfo;
            analyticsConnectorRegistrar.ParcelableVolumeInfo = write.MediaSessionCompat$QueueItem;
            analyticsConnectorRegistrar.MediaBrowserCompat$MediaItem = write.MediaDescriptionCompat;
            analyticsConnectorRegistrar.MediaSessionCompat$Token = zzb.MediaBrowserCompat$CustomActionResultReceiver;
            analyticsConnectorRegistrar.MediaSessionCompat$ResultReceiverWrapper = zzb.write;
            analyticsConnectorRegistrar.Keep = zzb.MediaBrowserCompat$ItemReceiver;
            analyticsConnectorRegistrar.MediaDescriptionCompat = write.f2885x50fd9e4a;
            analyticsConnectorRegistrar.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer.IconCompatParcelizer("dd MMM yyyy", parse);
            analyticsConnectorRegistrar.write = write.read;
            analyticsConnectorRegistrar.MediaMetadataCompat = write.MediaSessionCompat$Token;
            analyticsConnectorRegistrar.MediaBrowserCompat$CustomActionResultReceiver = write.MediaBrowserCompat$ItemReceiver;
            analyticsConnectorRegistrar.f2669x50fd9e4a = write.PlaybackStateCompat;
            analyticsConnectorRegistrar.IconCompatParcelizer = write.IconCompatParcelizer;
            analyticsConnectorRegistrar.read = write.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = "";
            if (zzb.read != null) {
                str = zzb.read;
            } else {
                str = str2;
            }
            analyticsConnectorRegistrar.AlertController$RecycleListView = str;
            if (zzb.MediaBrowserCompat$MediaItem != null) {
                str2 = zzb.MediaBrowserCompat$MediaItem;
            }
            analyticsConnectorRegistrar.setContentView = str2;
            boolean z = false;
            if (zzb.MediaBrowserCompat$SearchResultReceiver != null) {
                i = zzb.MediaBrowserCompat$SearchResultReceiver.intValue();
            } else {
                i = 0;
            }
            analyticsConnectorRegistrar.AppCompatDelegateImpl$ListMenuDecorView = Integer.valueOf(i);
            newParameterizedTypeWithOwner newparameterizedtypewithowner = newParameterizedTypeWithOwner.this;
            hashCodeOrZero hashcodeorzero = new hashCodeOrZero(analyticsConnectorRegistrar);
            if (newparameterizedtypewithowner.RatingCompat != null) {
                z = true;
            }
            if (z) {
                hashcodeorzero.IconCompatParcelizer(newparameterizedtypewithowner.RatingCompat);
            }
        }

        public final void onComplete() {
            newParameterizedTypeWithOwner.MediaBrowserCompat$CustomActionResultReceiver(newParameterizedTypeWithOwner.this);
        }

        public final void onError(Throwable th) {
            if (!newParameterizedTypeWithOwner.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                newParameterizedTypeWithOwner.MediaBrowserCompat$ItemReceiver(newParameterizedTypeWithOwner.this);
                newParameterizedTypeWithOwner newparameterizedtypewithowner = newParameterizedTypeWithOwner.this;
                getRawType getrawtype = new getRawType(this, th);
                if (newparameterizedtypewithowner.RatingCompat != null) {
                    getrawtype.IconCompatParcelizer(newparameterizedtypewithowner.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(newParameterizedTypeWithOwner newparameterizedtypewithowner) {
        if (newparameterizedtypewithowner.RatingCompat != null) {
            newparameterizedtypewithowner.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(newParameterizedTypeWithOwner newparameterizedtypewithowner) {
        if (newparameterizedtypewithowner.RatingCompat != null) {
            newparameterizedtypewithowner.RatingCompat.aj_();
        }
    }

    public final void IconCompatParcelizer() {
        Long l;
        Long l2;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        Constraints.ConstrainedCollection constrainedCollection = new Constraints.ConstrainedCollection(this.IconCompatParcelizer.IconCompatParcelizer, this.IconCompatParcelizer.setContentView, this.IconCompatParcelizer.AlertController$RecycleListView);
        ArrayList arrayList = new ArrayList();
        CustomConcurrentHashMap customConcurrentHashMap = this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper ? CustomConcurrentHashMap.POINT : CustomConcurrentHashMap.POINTWITHMONEY;
        if (this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper) {
            l2 = Long.valueOf((long) (this.IconCompatParcelizer.Keep.intValue() * this.IconCompatParcelizer.MediaSessionCompat$QueueItem));
            l = null;
        } else {
            l2 = Long.valueOf((long) (this.IconCompatParcelizer.AppCompatActivity.intValue() * this.IconCompatParcelizer.MediaSessionCompat$QueueItem));
            l = Long.valueOf((long) (this.IconCompatParcelizer.PlaybackStateCompat$CustomAction.intValue() * this.IconCompatParcelizer.MediaSessionCompat$QueueItem));
        }
        arrayList.add(new Constraints.ConstrainedSet(this.IconCompatParcelizer.ParcelableVolumeInfo, this.IconCompatParcelizer.MediaSessionCompat$QueueItem, customConcurrentHashMap, this.IconCompatParcelizer.setHasDecor, l2, l));
        this.write.MediaBrowserCompat$CustomActionResultReceiver(new Constraints.NotNullConstraint(constrainedCollection, arrayList));
        this.write.IconCompatParcelizer(new write());
    }
}
