package p040o;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import p040o.CharMatcher;
import p040o.CrashlyticsCore;
import p040o.ExecutorUtils;
import p040o.Sets;
import p040o.SingletonImmutableMap;
import p040o.SortedMaps;
import p040o.access$2300;

/* renamed from: o.setGuidingLine */
public class setGuidingLine extends getDestination<CheckParameters_Factory> {
    /* access modifiers changed from: private */
    public markInitializationComplete IconCompatParcelizer;
    public final StreetViewPanoramaLink MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Sets.SetFromMap MediaBrowserCompat$MediaItem;
    private waitForAutomaticDataCollectionEnabled MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final SortedMaps.SortedMapDifferenceImpl f2942x50fd9e4a;
    /* access modifiers changed from: private */
    public final SingletonImmutableMap.Values MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public determineFrom MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final SortedMaps.C38043 MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public DeliveryMechanism MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public final SortedMaps.TransformedEntriesSortedMap MediaSessionCompat$Token;

    @HmlPinActivity
    public setGuidingLine(StreetViewPanoramaLink streetViewPanoramaLink, Sets.SetFromMap setFromMap, SortedMaps.C38043 r3, SortedMaps.SortedMapDifferenceImpl sortedMapDifferenceImpl, SortedMaps.TransformedEntriesSortedMap transformedEntriesSortedMap, Sets.PowerSet.BitFilteredSetIterator bitFilteredSetIterator, RegularImmutableBiMap regularImmutableBiMap, SingletonImmutableSet singletonImmutableSet, CharMatcher.C31612 r9, SingletonImmutableMap.Values values) {
        super(regularImmutableBiMap, singletonImmutableSet, bitFilteredSetIterator, r9);
        this.MediaBrowserCompat$ItemReceiver = streetViewPanoramaLink;
        this.MediaSessionCompat$QueueItem = r3;
        this.f2942x50fd9e4a = sortedMapDifferenceImpl;
        this.MediaBrowserCompat$MediaItem = setFromMap;
        this.MediaSessionCompat$Token = transformedEntriesSortedMap;
        this.MediaDescriptionCompat = values;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, DataTransportState dataTransportState, waitForAutomaticDataCollectionEnabled waitforautomaticdatacollectionenabled, String str2, String str3, String str4) {
        waitForAutomaticDataCollectionEnabled waitforautomaticdatacollectionenabled2 = waitforautomaticdatacollectionenabled;
        String str5 = str2;
        this.MediaBrowserCompat$SearchResultReceiver = waitforautomaticdatacollectionenabled2;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new subSetImpl(str, dataTransportState.MediaDescriptionCompat, waitforautomaticdatacollectionenabled2.MediaBrowserCompat$ItemReceiver, str2, "A".equals(str5) ? str3 : null, "U".equals(str5) ? str4 : null, this.read, waitforautomaticdatacollectionenabled2.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.RatingCompat()));
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new read(str, dataTransportState, waitforautomaticdatacollectionenabled, str2, str3, str4, this.read));
    }

    public final void write() {
        removeBarCodeFoundEventListener removebarcodefoundeventlistener = removeBarCodeFoundEventListener.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat != null) {
            removebarcodefoundeventlistener.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final List<String> MediaBrowserCompat$ItemReceiver() {
        return Arrays.asList(new String[]{"MF_SWITCH_DISCLAIMER", "MF_SCHEDULE"});
    }

    public final LocationCallback MediaBrowserCompat$CustomActionResultReceiver() {
        return LocationCallback.SWITCH;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ExecutorUtils.C33371 r3) {
        LinkedList<CrashlyticsCore.C32462> MediaMetadataCompat2 = r3.MediaMetadataCompat();
        if (MediaMetadataCompat2 == null || MediaMetadataCompat2.isEmpty()) {
            MediaBrowserCompat$ItemReceiver(r3);
            return;
        }
        getGuidingLine getguidingline = new getGuidingLine(r3, MediaMetadataCompat2);
        if (this.RatingCompat != null) {
            getguidingline.IconCompatParcelizer(this.RatingCompat);
        }
        MediaMetadataCompat2.removeFirst();
    }

    /* renamed from: o.setGuidingLine$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTriggeringLocation> {
        private write() {
        }

        public /* synthetic */ write(setGuidingLine setguidingline, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getTriggeringLocation gettriggeringlocation = (getTriggeringLocation) obj;
            setGuidingLine.MediaSessionCompat$ResultReceiverWrapper(setGuidingLine.this);
            boolean z = true;
            if (setGuidingLine.this.RatingCompat != null) {
                setGuidingLine setguidingline = setGuidingLine.this;
                markInitializationComplete unused = setguidingline.IconCompatParcelizer = setguidingline.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(gettriggeringlocation, setGuidingLine.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.setItemInvoker());
                setGuidingLine setguidingline2 = setGuidingLine.this;
                C4027ai aiVar = new C4027ai(this);
                if (setguidingline2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    aiVar.IconCompatParcelizer(setguidingline2.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            setGuidingLine.m3153x50fd9e4a(setGuidingLine.this);
            if (!setGuidingLine.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                setGuidingLine.this.MediaBrowserCompat$ItemReceiver(setGuidingLine.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(ExecutorUtils.C33371 r4) {
        boolean z = true;
        if ("COMPLEX".equalsIgnoreCase(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
            onLocationEnableEvent onlocationenableevent = new onLocationEnableEvent(r4);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                onlocationenableevent.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        getSymbologies getsymbologies = new getSymbologies(r4);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getsymbologies.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ExecutorUtils.C33371 r0, CheckParameters_Factory checkParameters_Factory) {
        r0.write();
        checkParameters_Factory.IconCompatParcelizer(r0);
    }

    /* renamed from: o.setGuidingLine$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setNeedBle> {
        private LocationAvailability MediaBrowserCompat$CustomActionResultReceiver;
        private String MediaBrowserCompat$ItemReceiver;
        private DataTransportState MediaBrowserCompat$MediaItem;
        private String MediaDescriptionCompat;
        private String RatingCompat;
        private String read;
        private waitForAutomaticDataCollectionEnabled write;

        public final /* synthetic */ void onNext(Object obj) {
            String str;
            setNeedBle setneedble = (setNeedBle) obj;
            setGuidingLine.MediaMetadataCompat(setGuidingLine.this);
            SortedMaps.TransformedEntriesSortedMap MediaSessionCompat$Token = setGuidingLine.this.MediaSessionCompat$Token;
            LocationAvailability locationAvailability = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            DataTransportState dataTransportState = this.MediaBrowserCompat$MediaItem;
            waitForAutomaticDataCollectionEnabled waitforautomaticdatacollectionenabled = this.write;
            String str3 = this.MediaDescriptionCompat;
            String str4 = this.read;
            String str5 = this.RatingCompat;
            if (setGuidingLine.this.IconCompatParcelizer.MediaMetadataCompat != null) {
                str = setGuidingLine.this.IconCompatParcelizer.MediaMetadataCompat.IconCompatParcelizer;
            } else {
                str = "";
            }
            ExecutorUtils.C33371 MediaBrowserCompat$ItemReceiver2 = MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(locationAvailability, setneedble, str2, dataTransportState, waitforautomaticdatacollectionenabled, str3, str4, str5, str);
            boolean z = true;
            if (!(setGuidingLine.this.RatingCompat != null)) {
                return;
            }
            if (setneedble.IconCompatParcelizer && setneedble.MediaBrowserCompat$CustomActionResultReceiver != null) {
                setGuidingLine setguidingline = setGuidingLine.this;
                onLevelnessChanged onlevelnesschanged = new onLevelnessChanged(this, setneedble);
                if (setguidingline.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    onlevelnesschanged.IconCompatParcelizer(setguidingline.RatingCompat);
                }
            } else if (MediaBrowserCompat$ItemReceiver2.MediaMetadataCompat() == null || MediaBrowserCompat$ItemReceiver2.MediaMetadataCompat().isEmpty()) {
                setGuidingLine.this.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
            } else {
                setGuidingLine.this.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
            }
        }

        read(String str, DataTransportState dataTransportState, waitForAutomaticDataCollectionEnabled waitforautomaticdatacollectionenabled, String str2, String str3, String str4, LocationAvailability locationAvailability) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$MediaItem = dataTransportState;
            this.write = waitforautomaticdatacollectionenabled;
            this.MediaDescriptionCompat = str2;
            this.read = str3;
            this.RatingCompat = str4;
            this.MediaBrowserCompat$CustomActionResultReceiver = locationAvailability;
        }

        public final void onError(Throwable th) {
            setGuidingLine.MediaBrowserCompat$MediaItem(setGuidingLine.this);
            if ((setGuidingLine.this.RatingCompat != null) && !setGuidingLine.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                setGuidingLine.this.MediaBrowserCompat$ItemReceiver(setGuidingLine.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setGuidingLine setguidingline) {
        if (setguidingline.RatingCompat != null) {
            setguidingline.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(setGuidingLine setguidingline) {
        if (setguidingline.RatingCompat != null) {
            setguidingline.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(setGuidingLine setguidingline) {
        if (setguidingline.RatingCompat != null) {
            setguidingline.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(setGuidingLine setguidingline) {
        if (setguidingline.RatingCompat != null) {
            setguidingline.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(setGuidingLine setguidingline) {
        if (setguidingline.RatingCompat != null) {
            setguidingline.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(setGuidingLine setguidingline) {
        if (setguidingline.RatingCompat != null) {
            setguidingline.RatingCompat.aj_();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    static /* synthetic */ void m3153x50fd9e4a(setGuidingLine setguidingline) {
        if (setguidingline.RatingCompat != null) {
            setguidingline.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper(setGuidingLine setguidingline) {
        if (setguidingline.RatingCompat != null) {
            setguidingline.RatingCompat.aj_();
        }
    }

    public final void IconCompatParcelizer(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        isHashCodeFast$MediaBrowserCompat$CustomActionResultReceiver ishashcodefast_mediabrowsercompat_customactionresultreceiver = new isHashCodeFast$MediaBrowserCompat$CustomActionResultReceiver();
        ishashcodefast_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = str;
        if (this.read != null && !TextUtils.isEmpty(this.read.write)) {
            C3597xa9335a5d write2 = LocationAvailability.write();
            write2.IconCompatParcelizer = this.read.write;
            ishashcodefast_mediabrowsercompat_customactionresultreceiver.read = new LocationAvailability(write2, (byte) 0);
        }
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new isHashCodeFast(ishashcodefast_mediabrowsercompat_customactionresultreceiver, (byte) 0));
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setGuidingLine$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        EmptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver emptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver = new EmptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver();
        emptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver.read = str;
        if (this.read != null && !TextUtils.isEmpty(this.read.write)) {
            C3597xa9335a5d write2 = LocationAvailability.write();
            write2.IconCompatParcelizer = this.read.write;
            emptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = new LocationAvailability(write2, (byte) 0);
        }
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new EmptyImmutableSetMultimap(emptyImmutableSetMultimap$MediaBrowserCompat$ItemReceiver, (byte) 0));
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setGuidingLine$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
    }
}
