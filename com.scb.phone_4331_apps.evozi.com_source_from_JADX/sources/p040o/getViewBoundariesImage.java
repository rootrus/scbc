package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.ImagePerfectionProfile;
import p040o.Ordering;
import p040o.zzap;

/* renamed from: o.getViewBoundariesImage */
public class getViewBoundariesImage extends writeUInt64NoTag<CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.IconCompatParcelizer> {
    public final title IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Ordering.ArbitraryOrderingHolder MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$SearchResultReceiver = false;
    /* access modifiers changed from: private */
    public int MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public List<access$1600> read;
    public boolean write;

    @HmlPinActivity
    public getViewBoundariesImage(title title, Ordering.ArbitraryOrderingHolder arbitraryOrderingHolder, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = title;
        this.MediaBrowserCompat$ItemReceiver = arbitraryOrderingHolder;
        this.MediaBrowserCompat$MediaItem = 1;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        title title = this.IconCompatParcelizer;
        if (!title.MediaBrowserCompat$MediaItem.isDisposed()) {
            title.MediaBrowserCompat$MediaItem.dispose();
        }
        title.MediaBrowserCompat$CustomActionResultReceiver.read();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            boolean z = true;
            this.MediaBrowserCompat$SearchResultReceiver = true;
            this.MediaDescriptionCompat = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            int write2 = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.write();
            this.MediaBrowserCompat$MediaItem = write2;
            int i = this.MediaDescriptionCompat + 1;
            this.MediaDescriptionCompat = i;
            if (i <= write2) {
                if (i == 1) {
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        this.RatingCompat.AlertController$RecycleListView();
                    }
                } else {
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        this.RatingCompat.Keep();
                    }
                }
                this.IconCompatParcelizer.read(this.MediaDescriptionCompat);
                this.IconCompatParcelizer.IconCompatParcelizer(new read(this, (byte) 0));
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(MapFragment mapFragment, List<access$1600> list) {
        boolean z = true;
        if (this.MediaDescriptionCompat <= 1 && this.MediaBrowserCompat$MediaItem <= 1 && list.isEmpty()) {
            this.write = true;
        }
        ImagePerfectionProfile.UseDocumentDetectionBasedCrop useDocumentDetectionBasedCrop = new ImagePerfectionProfile.UseDocumentDetectionBasedCrop(mapFragment, list, true);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            useDocumentDetectionBasedCrop.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* renamed from: o.getViewBoundariesImage$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzap.zzb> {
        private read() {
        }

        public /* synthetic */ read(getViewBoundariesImage getviewboundariesimage, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzap.zzb zzb = (zzap.zzb) obj;
            if (getViewBoundariesImage.this.RatingCompat != null) {
                MapFragment mapFragment = zzb.read;
                List unused = getViewBoundariesImage.this.read = new ArrayList();
                if (mapFragment == MapFragment.HAVE_PROMPTPAY_WITH_RTP) {
                    if (zzb.MediaBrowserCompat$ItemReceiver == null || zzb.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                        getViewBoundariesImage.this.MediaBrowserCompat$ItemReceiver(zzb.read, getViewBoundariesImage.this.read);
                        return;
                    }
                    getViewBoundariesImage getviewboundariesimage = getViewBoundariesImage.this;
                    Ordering.ArbitraryOrderingHolder unused2 = getviewboundariesimage.MediaBrowserCompat$ItemReceiver;
                    List unused3 = getviewboundariesimage.read = Ordering.ArbitraryOrderingHolder.MediaBrowserCompat$ItemReceiver(zzb.MediaBrowserCompat$ItemReceiver, new getUseDocumentDetectionBasedCrop(getViewBoundariesImage.this.MediaBrowserCompat$ItemReceiver));
                }
                getViewBoundariesImage.this.MediaBrowserCompat$ItemReceiver(zzb.read, getViewBoundariesImage.this.read);
            }
        }

        public final void onComplete() {
            if (getViewBoundariesImage.this.MediaDescriptionCompat == 1) {
                getViewBoundariesImage.IconCompatParcelizer(getViewBoundariesImage.this);
            } else {
                getViewBoundariesImage.write(getViewBoundariesImage.this);
            }
            boolean unused = getViewBoundariesImage.this.MediaBrowserCompat$SearchResultReceiver = false;
        }

        public final void onError(Throwable th) {
            boolean z = true;
            if (getViewBoundariesImage.this.MediaDescriptionCompat == 1) {
                getViewBoundariesImage.MediaDescriptionCompat(getViewBoundariesImage.this);
            } else {
                getViewBoundariesImage.MediaMetadataCompat(getViewBoundariesImage.this);
            }
            if (!getViewBoundariesImage.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                getViewBoundariesImage getviewboundariesimage = getViewBoundariesImage.this;
                ImagePerfectionProfile.FriendIPP friendIPP = new ImagePerfectionProfile.FriendIPP(this, th);
                if (getviewboundariesimage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    friendIPP.IconCompatParcelizer(getviewboundariesimage.RatingCompat);
                }
            }
            boolean unused = getViewBoundariesImage.this.MediaBrowserCompat$SearchResultReceiver = false;
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getViewBoundariesImage getviewboundariesimage) {
        if (getviewboundariesimage.RatingCompat != null) {
            getviewboundariesimage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(getViewBoundariesImage getviewboundariesimage) {
        if (getviewboundariesimage.RatingCompat != null) {
            getviewboundariesimage.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(getViewBoundariesImage getviewboundariesimage) {
        if (getviewboundariesimage.RatingCompat != null) {
            getviewboundariesimage.RatingCompat.AlertController$RecycleListView();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(getViewBoundariesImage getviewboundariesimage) {
        if (getviewboundariesimage.RatingCompat != null) {
            getviewboundariesimage.RatingCompat.ay_();
        }
    }
}
