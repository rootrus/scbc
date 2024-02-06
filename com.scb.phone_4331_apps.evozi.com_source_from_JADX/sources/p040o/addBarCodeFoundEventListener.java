package p040o;

import java.util.List;
import p040o.SortedMaps;
import p040o.StandardTable;

/* renamed from: o.addBarCodeFoundEventListener */
public class addBarCodeFoundEventListener extends writeUInt64NoTag<getCheckUsabilityData$MediaBrowserCompat$ItemReceiver> {
    public doBackgroundInitializationAsync IconCompatParcelizer;
    public final StreetViewPanoramaLink MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final SortedMaps.C38043 MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final SortedMaps.C38022 MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final valueIteratorImpl MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public final StandardTable.C38192 MediaMetadataCompat;
    public int read;
    /* access modifiers changed from: private */
    public final SortedMaps.C38011 write;

    @HmlPinActivity
    public addBarCodeFoundEventListener(StreetViewPanoramaLink streetViewPanoramaLink, SortedMaps.C38022 r2, SortedMaps.C38011 r3, valueIteratorImpl valueiteratorimpl, StandardTable.C38192 r5, SortedMaps.C38043 r6, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = streetViewPanoramaLink;
        this.MediaBrowserCompat$SearchResultReceiver = r2;
        this.write = r3;
        this.MediaDescriptionCompat = valueiteratorimpl;
        this.MediaMetadataCompat = r5;
        this.MediaBrowserCompat$MediaItem = r6;
    }

    static /* synthetic */ void read(doBackgroundInitializationAsync dobackgroundinitializationasync, int i, getCheckUsabilityData$MediaBrowserCompat$ItemReceiver getcheckusabilitydata_mediabrowsercompat_itemreceiver) {
        getcheckusabilitydata_mediabrowsercompat_itemreceiver.IconCompatParcelizer(dobackgroundinitializationasync);
        getcheckusabilitydata_mediabrowsercompat_itemreceiver.IconCompatParcelizer(dobackgroundinitializationasync.MediaBrowserCompat$MediaItem.get(i));
    }

    public static int[] write(String str) {
        if ("S".equals(str)) {
            return new int[]{Iterables$3$MediaBrowserCompat$MediaItem.ssf_summary, Iterables$3$MediaBrowserCompat$MediaItem.dividend};
        }
        return new int[]{Iterables$3$MediaBrowserCompat$MediaItem.ltf_summary, Iterables$3$MediaBrowserCompat$MediaItem.dividend};
    }

    public void onDestroy() {
        super.onDestroy();
        StreetViewPanoramaLink streetViewPanoramaLink = this.MediaBrowserCompat$ItemReceiver;
        if (!streetViewPanoramaLink.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewPanoramaLink.MediaBrowserCompat$MediaItem.dispose();
        }
        streetViewPanoramaLink.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(boolean z, List list, List list2, String str, getCheckUsabilityData$MediaBrowserCompat$ItemReceiver getcheckusabilitydata_mediabrowsercompat_itemreceiver) {
        if (z) {
            getcheckusabilitydata_mediabrowsercompat_itemreceiver.IconCompatParcelizer(list, list2, str);
        } else {
            getcheckusabilitydata_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver(list, str);
        }
    }

    static /* synthetic */ void write(boolean z, List list, List list2, String str, getCheckUsabilityData$MediaBrowserCompat$ItemReceiver getcheckusabilitydata_mediabrowsercompat_itemreceiver) {
        if (z) {
            getcheckusabilitydata_mediabrowsercompat_itemreceiver.IconCompatParcelizer(list, list2, str);
        } else {
            getcheckusabilitydata_mediabrowsercompat_itemreceiver.IconCompatParcelizer(list, str);
        }
    }

    /* renamed from: o.addBarCodeFoundEventListener$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getFusedLocationProviderClient> {
        private write() {
        }

        /* synthetic */ write(addBarCodeFoundEventListener addbarcodefoundeventlistener, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getFusedLocationProviderClient getfusedlocationproviderclient = (getFusedLocationProviderClient) obj;
            addBarCodeFoundEventListener.MediaSessionCompat$ResultReceiverWrapper(addBarCodeFoundEventListener.this);
            addBarCodeFoundEventListener addbarcodefoundeventlistener = addBarCodeFoundEventListener.this;
            addBarCodeFoundEventListener.read(addbarcodefoundeventlistener, (List) addbarcodefoundeventlistener.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(getfusedlocationproviderclient.read), (List) addBarCodeFoundEventListener.this.write.MediaBrowserCompat$ItemReceiver(getfusedlocationproviderclient.MediaBrowserCompat$CustomActionResultReceiver));
        }

        public final void onComplete() {
            addBarCodeFoundEventListener.MediaSessionCompat$QueueItem(addBarCodeFoundEventListener.this);
        }

        public final void onError(Throwable th) {
            if (!addBarCodeFoundEventListener.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                addBarCodeFoundEventListener.m3139x50fd9e4a(addBarCodeFoundEventListener.this);
                addBarCodeFoundEventListener.read(addBarCodeFoundEventListener.this, (List) null, (List) null);
            }
        }
    }

    /* renamed from: o.addBarCodeFoundEventListener$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<AutocompleteFilter> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(addBarCodeFoundEventListener addbarcodefoundeventlistener, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            isSupportFragmentClass issupportfragmentclass;
            AutocompleteFilter autocompleteFilter = (AutocompleteFilter) obj;
            boolean z = true;
            if (addBarCodeFoundEventListener.this.RatingCompat != null) {
                addBarCodeFoundEventListener.MediaDescriptionCompat(addBarCodeFoundEventListener.this);
                show show = new show(autocompleteFilter.write);
                show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new AutoFocusResultEvent(this)));
                if (show2.IconCompatParcelizer.hasNext()) {
                    issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
                } else {
                    issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
                }
                if (issupportfragmentclass.IconCompatParcelizer != null) {
                    addBarCodeFoundEventListener addbarcodefoundeventlistener = addBarCodeFoundEventListener.this;
                    getSuccess getsuccess = new getSuccess(this, issupportfragmentclass);
                    if (addbarcodefoundeventlistener.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getsuccess.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
                        return;
                    }
                    return;
                }
                addBarCodeFoundEventListener addbarcodefoundeventlistener2 = addBarCodeFoundEventListener.this;
                calculateBound calculatebound = calculateBound.MediaBrowserCompat$ItemReceiver;
                if (addbarcodefoundeventlistener2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    calculatebound.IconCompatParcelizer(addbarcodefoundeventlistener2.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            addBarCodeFoundEventListener addbarcodefoundeventlistener = addBarCodeFoundEventListener.this;
            AutoFocusResultListener autoFocusResultListener = new AutoFocusResultListener(this, th);
            if (addbarcodefoundeventlistener.RatingCompat != null) {
                autoFocusResultListener.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(addBarCodeFoundEventListener addbarcodefoundeventlistener) {
        if (addbarcodefoundeventlistener.RatingCompat != null) {
            addbarcodefoundeventlistener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(addBarCodeFoundEventListener addbarcodefoundeventlistener) {
        if (addbarcodefoundeventlistener.RatingCompat != null) {
            addbarcodefoundeventlistener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(addBarCodeFoundEventListener addbarcodefoundeventlistener) {
        if (addbarcodefoundeventlistener.RatingCompat != null) {
            addbarcodefoundeventlistener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$QueueItem(addBarCodeFoundEventListener addbarcodefoundeventlistener) {
        if (addbarcodefoundeventlistener.RatingCompat != null) {
            addbarcodefoundeventlistener.RatingCompat.ay_();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    static /* synthetic */ void m3139x50fd9e4a(addBarCodeFoundEventListener addbarcodefoundeventlistener) {
        if (addbarcodefoundeventlistener.RatingCompat != null) {
            addbarcodefoundeventlistener.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void read(addBarCodeFoundEventListener addbarcodefoundeventlistener, List list, List list2) {
        String str = addbarcodefoundeventlistener.IconCompatParcelizer.MediaBrowserCompat$MediaItem.get(addbarcodefoundeventlistener.read).MediaBrowserCompat$MediaItem;
        boolean z = addbarcodefoundeventlistener.IconCompatParcelizer.MediaBrowserCompat$MediaItem.get(addbarcodefoundeventlistener.read).MediaBrowserCompat$ItemReceiver;
        boolean z2 = true;
        if ("L".equals(str)) {
            readInstance readinstance = new readInstance(z, list, list2, str);
            if (addbarcodefoundeventlistener.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                readinstance.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
            }
        } else if ("S".equals(str)) {
            C4031al alVar = new C4031al(z, list, list2, str);
            if (addbarcodefoundeventlistener.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                alVar.IconCompatParcelizer(addbarcodefoundeventlistener.RatingCompat);
            }
        } else {
            addbarcodefoundeventlistener.write(z, new MarshalShort(list2));
        }
    }

    static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper(addBarCodeFoundEventListener addbarcodefoundeventlistener) {
        if (addbarcodefoundeventlistener.RatingCompat != null) {
            addbarcodefoundeventlistener.RatingCompat.ay_();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        tailSetImpl tailsetimpl = new tailSetImpl();
        tailsetimpl.write = this.IconCompatParcelizer.IconCompatParcelizer;
        tailsetimpl.read = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem.get(i).RatingCompat;
        tailsetimpl.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem.get(i).MediaBrowserCompat$MediaItem;
        tailsetimpl.IconCompatParcelizer = this.IconCompatParcelizer.MediaBrowserCompat$MediaItem.get(i).MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(tailsetimpl);
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new write(this, (byte) 0));
    }
}
