package p040o;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import p040o.CharMatcher;

/* renamed from: o.getVisibility */
public class getVisibility extends writeUInt64NoTag<getExtractionListener> {
    public final onPostExecute AlertController$RecycleListView;
    /* access modifiers changed from: private */
    public final access$1100 AppCompatDialogFragment;
    public String IconCompatParcelizer;
    public final doInBackground Keep;
    public final LatLng MediaBrowserCompat$ItemReceiver;
    public Boolean MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public List<String> f2861x50fd9e4a = Arrays.asList(new String[]{"U", "M", "D", "W"});
    public getAppIdentifier MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public final onProviderInstalled PlaybackStateCompat$CustomAction;
    public final CharMatcher.C31623 read;
    /* access modifiers changed from: private */
    public final MapMaker setBackgroundResource;
    public final C4091bb setHasDecor;
    public MoreExecutors write;

    @HmlPinActivity
    public getVisibility(C4091bb bbVar, CharMatcher.C31623 r5, LatLng latLng, onProviderInstalled onproviderinstalled, doInBackground doinbackground, onPostExecute onpostexecute, access$1100 access_1100, MapMaker mapMaker, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.setHasDecor = bbVar;
        this.read = r5;
        this.MediaBrowserCompat$ItemReceiver = latLng;
        this.PlaybackStateCompat$CustomAction = onproviderinstalled;
        this.Keep = doinbackground;
        this.AlertController$RecycleListView = onpostexecute;
        this.AppCompatDialogFragment = access_1100;
        this.setBackgroundResource = mapMaker;
    }

    public void onDestroy() {
        super.onDestroy();
        CharMatcher.C31623 r0 = this.read;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
        C4091bb bbVar = this.setHasDecor;
        if (!bbVar.MediaBrowserCompat$MediaItem.isDisposed()) {
            bbVar.MediaBrowserCompat$MediaItem.dispose();
        }
        LatLng latLng = this.MediaBrowserCompat$ItemReceiver;
        if (!latLng.MediaBrowserCompat$MediaItem.isDisposed()) {
            latLng.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void read(getExtractionListener getextractionlistener) {
        getextractionlistener.IconCompatParcelizer();
        getextractionlistener.write(false);
    }

    public final void read() {
        Boolean bool;
        boolean z = true;
        if (TextUtils.isEmpty(this.PlaybackStateCompat) || TextUtils.isEmpty(this.MediaMetadataCompat) || TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver) || (bool = this.MediaBrowserCompat$MediaItem) == null) {
            CaptureExperienceCriteriaHolder captureExperienceCriteriaHolder = CaptureExperienceCriteriaHolder.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                captureExperienceCriteriaHolder.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (bool.booleanValue()) {
            getStabilityThreshold getstabilitythreshold = new getStabilityThreshold(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getstabilitythreshold.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            takePictureContinually takepicturecontinually = new takePictureContinually(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                takepicturecontinually.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    static /* synthetic */ void read(getVisibility getvisibility) {
        if (getvisibility.RatingCompat != null) {
            getvisibility.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getVisibility getvisibility) {
        if (getvisibility.RatingCompat != null) {
            getvisibility.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getVisibility getvisibility) {
        if (getvisibility.RatingCompat != null) {
            getvisibility.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(getVisibility getvisibility) {
        if (getvisibility.RatingCompat != null) {
            getvisibility.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(getVisibility getvisibility) {
        if (getvisibility.RatingCompat != null) {
            getvisibility.RatingCompat.aj_();
        }
    }
}
