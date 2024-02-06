package p040o;

import java.util.ArrayList;
import p040o.CrashlyticsCore;
import p040o.MapDifference;
import p040o.Sets;
import p040o.SingletonImmutableList;
import p040o.WscProfileRequest;
import p040o.access$2300;
import p040o.getMicrAmount;

/* renamed from: o.getDocumentNote */
public class getDocumentNote extends writeUInt64NoTag<getMicrAmount.IconCompatParcelizer> {
    public markInitializationComplete IconCompatParcelizer;
    public int MediaBrowserCompat$ItemReceiver = -1;
    /* access modifiers changed from: private */
    public final Sets.SetFromMap MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public CrashlyticsCore.C32441 MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final SingletonImmutableList.C37921 MediaDescriptionCompat;
    public final MapDifference.ValueDifference MediaMetadataCompat;
    public final StreetViewPanoramaLink read;
    public final transparency write;

    @HmlPinActivity
    public getDocumentNote(StreetViewPanoramaLink streetViewPanoramaLink, Sets.SetFromMap setFromMap, SingletonImmutableList.C37921 r3, transparency transparency, MapDifference.ValueDifference valueDifference, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.read = streetViewPanoramaLink;
        this.MediaBrowserCompat$MediaItem = setFromMap;
        this.MediaDescriptionCompat = r3;
        this.write = transparency;
        this.MediaMetadataCompat = valueDifference;
    }

    public void onDestroy() {
        super.onDestroy();
        StreetViewPanoramaLink streetViewPanoramaLink = this.read;
        if (!streetViewPanoramaLink.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewPanoramaLink.MediaBrowserCompat$MediaItem.dispose();
        }
        streetViewPanoramaLink.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.getDocumentNote$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTriggeringLocation> {
        private write() {
        }

        public /* synthetic */ write(getDocumentNote getdocumentnote, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getTriggeringLocation gettriggeringlocation = (getTriggeringLocation) obj;
            boolean z = true;
            if (getDocumentNote.this.RatingCompat != null) {
                getDocumentNote getdocumentnote = getDocumentNote.this;
                markInitializationComplete unused = getdocumentnote.IconCompatParcelizer = getdocumentnote.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(gettriggeringlocation, getDocumentNote.this.read.IconCompatParcelizer.setItemInvoker());
                getDocumentNote getdocumentnote2 = getDocumentNote.this;
                getWscClientId getwscclientid = new getWscClientId(this);
                if (getdocumentnote2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getwscclientid.IconCompatParcelizer(getdocumentnote2.RatingCompat);
                }
                getDocumentNote.ParcelableVolumeInfo(getDocumentNote.this);
                int unused2 = getDocumentNote.this.MediaBrowserCompat$ItemReceiver = gettriggeringlocation.write.IconCompatParcelizer;
                getDocumentNote.MediaBrowserCompat$ItemReceiver(getDocumentNote.this);
                getDocumentNote getdocumentnote3 = getDocumentNote.this;
                getDocumentNote.IconCompatParcelizer(getdocumentnote3, (ArrayList) getdocumentnote3.IconCompatParcelizer.read);
            }
        }

        public final void onComplete() {
            getDocumentNote.MediaDescriptionCompat(getDocumentNote.this);
            getDocumentNote.RatingCompat(getDocumentNote.this);
        }

        public final void onError(Throwable th) {
            getDocumentNote.this.MediaBrowserCompat$ItemReceiver(getDocumentNote.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    static /* synthetic */ void read(ArrayList arrayList, getMicrAmount.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.read(0);
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(arrayList);
        int size = arrayList.size();
        if (size >= 2) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(size);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getDocumentNote getdocumentnote) {
        int i = getdocumentnote.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (i == 0 || i == 1) {
            WscRetrieveScanSettingsRequest wscRetrieveScanSettingsRequest = new WscRetrieveScanSettingsRequest(getdocumentnote);
            if (getdocumentnote.RatingCompat == null) {
                z = false;
            }
            if (z) {
                wscRetrieveScanSettingsRequest.IconCompatParcelizer(getdocumentnote.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getDocumentNote getdocumentnote, ArrayList arrayList) {
        boolean z = true;
        if (arrayList == null || arrayList.isEmpty()) {
            getEncryptedPassword getencryptedpassword = getEncryptedPassword.MediaBrowserCompat$CustomActionResultReceiver;
            if (getdocumentnote.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getencryptedpassword.IconCompatParcelizer(getdocumentnote.RatingCompat);
                return;
            }
            return;
        }
        WscProfileRequest.PROFILE_INDEXES profile_indexes = new WscProfileRequest.PROFILE_INDEXES(arrayList);
        if (getdocumentnote.RatingCompat == null) {
            z = false;
        }
        if (z) {
            profile_indexes.IconCompatParcelizer(getdocumentnote.RatingCompat);
        }
    }

    static /* synthetic */ void write(getDocumentNote getdocumentnote) {
        if (getdocumentnote.RatingCompat != null) {
            getdocumentnote.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getDocumentNote getdocumentnote) {
        if (getdocumentnote.RatingCompat != null) {
            getdocumentnote.RatingCompat.az_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getDocumentNote getdocumentnote) {
        if (getdocumentnote.RatingCompat != null) {
            getdocumentnote.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(getDocumentNote getdocumentnote) {
        if (getdocumentnote.RatingCompat != null) {
            getdocumentnote.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(getDocumentNote getdocumentnote) {
        if (getdocumentnote.RatingCompat != null) {
            getdocumentnote.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void RatingCompat(getDocumentNote getdocumentnote) {
        if (getdocumentnote.RatingCompat != null) {
            getdocumentnote.RatingCompat.az_();
        }
    }

    static /* synthetic */ void ParcelableVolumeInfo(getDocumentNote getdocumentnote) {
        if (getdocumentnote.RatingCompat != null) {
            getdocumentnote.RatingCompat.aj_();
        }
    }
}
