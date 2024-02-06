package p040o;

import android.text.TextUtils;
import p040o.BarCodeCaptureView;
import p040o.CharMatcher;
import p040o.access$2300;

/* renamed from: o.setFocusAreas */
public class setFocusAreas extends writeUInt64NoTag<C7172x585a5cc0> {
    public boolean IconCompatParcelizer;
    public removeForwardSlashesIn MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public SortedSetMultimap MediaBrowserCompat$MediaItem;
    private CharMatcher.C316015 MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaMetadataCompat;
    public boolean read;
    public LatLng write;

    @HmlPinActivity
    public setFocusAreas(CharMatcher.C316015 r1, LatLng latLng, SortedSetMultimap sortedSetMultimap, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$SearchResultReceiver = r1;
        this.write = latLng;
        this.MediaBrowserCompat$MediaItem = sortedSetMultimap;
    }

    private void write() {
        String str;
        removeForwardSlashesIn removeforwardslashesin = this.MediaBrowserCompat$ItemReceiver;
        String str2 = "";
        if (removeforwardslashesin == null || removeforwardslashesin.IconCompatParcelizer == null) {
            str = str2;
        } else {
            str = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        }
        removeForwardSlashesIn removeforwardslashesin2 = this.MediaBrowserCompat$ItemReceiver;
        if (!(removeforwardslashesin2 == null || removeforwardslashesin2.MediaBrowserCompat$CustomActionResultReceiver == null)) {
            str2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
        }
        boolean z = false;
        boolean z2 = !TextUtils.isEmpty(str) || this.IconCompatParcelizer;
        if (TextUtils.isEmpty(str2) && !this.MediaMetadataCompat && !this.read) {
            z2 = false;
        }
        BarCodeCaptureView.C3109b bVar = new BarCodeCaptureView.C3109b(z2);
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            bVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        String str;
        removeForwardSlashesIn removeforwardslashesin = this.MediaBrowserCompat$ItemReceiver;
        if (removeforwardslashesin == null || removeforwardslashesin.IconCompatParcelizer == null) {
            str = "";
        } else {
            str = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        }
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(str);
        if (this.IconCompatParcelizer) {
            z2 = false;
        }
        getBarCode getbarcode = new getBarCode(z2);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getbarcode.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void write(boolean z) {
        String str;
        String str2;
        String str3 = "";
        if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem != null) {
            str = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$SearchResultReceiver;
        } else {
            str = str3;
        }
        if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer == null || this.IconCompatParcelizer) {
            str2 = str3;
        } else {
            str2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        }
        if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver != null && !this.MediaMetadataCompat) {
            str3 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
        }
        write();
        MediaBrowserCompat$CustomActionResultReceiver();
        BarCodeCaptureView_MembersInjector barCodeCaptureView_MembersInjector = new BarCodeCaptureView_MembersInjector(this, str, str2, str3, z);
        if (this.RatingCompat != null) {
            barCodeCaptureView_MembersInjector.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void write(setFocusAreas setfocusareas) {
        if (setfocusareas.RatingCompat != null) {
            setfocusareas.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(setFocusAreas setfocusareas) {
        if (setfocusareas.RatingCompat != null) {
            setfocusareas.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(setFocusAreas setfocusareas) {
        if (setfocusareas.RatingCompat != null) {
            setfocusareas.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(setFocusAreas setfocusareas) {
        if (setfocusareas.RatingCompat != null) {
            setfocusareas.RatingCompat.aj_();
        }
    }

    public final void read() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        CharMatcher.C316015 r0 = this.MediaBrowserCompat$SearchResultReceiver;
        r0.write(r0.IconCompatParcelizer(), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<getLocationSettingsStates>() {
            public final /* synthetic */ void onNext(Object obj) {
                getLocationSettingsStates getlocationsettingsstates = (getLocationSettingsStates) obj;
                super.onNext(getlocationsettingsstates);
                setFocusAreas.write(setFocusAreas.this);
                setFocusAreas setfocusareas = setFocusAreas.this;
                SortedSetMultimap unused = setfocusareas.MediaBrowserCompat$MediaItem;
                removeForwardSlashesIn unused2 = setfocusareas.MediaBrowserCompat$ItemReceiver = SortedSetMultimap.IconCompatParcelizer(getlocationsettingsstates);
                setFocusAreas setfocusareas2 = setFocusAreas.this;
                boolean unused3 = setfocusareas2.IconCompatParcelizer = setfocusareas2.MediaBrowserCompat$ItemReceiver.write;
                setFocusAreas setfocusareas3 = setFocusAreas.this;
                boolean unused4 = setfocusareas3.MediaMetadataCompat = setfocusareas3.MediaBrowserCompat$ItemReceiver.read;
                setFocusAreas setfocusareas4 = setFocusAreas.this;
                boolean unused5 = setfocusareas4.read = setfocusareas4.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                setFocusAreas.this.write(true);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                setFocusAreas.MediaDescriptionCompat(setFocusAreas.this);
                setFocusAreas.this.MediaBrowserCompat$ItemReceiver(setFocusAreas.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }

            public final void onComplete() {
                super.onComplete();
            }
        });
    }
}
