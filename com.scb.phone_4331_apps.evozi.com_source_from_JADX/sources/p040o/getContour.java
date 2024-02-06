package p040o;

import p040o.FirelogAnalyticsEvent;
import p040o.Maps;
import p040o.Predicates;

/* renamed from: o.getContour */
public class getContour extends writeUInt64NoTag<setResultDeserializer> {
    public final getLocalPort IconCompatParcelizer;
    final Maps.C36434 MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public Maps.AbstractFilteredMap MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public valuesImpl MediaMetadataCompat;
    public String read;
    public final Predicates.ContainsPatternPredicate write;

    @HmlPinActivity
    public getContour(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, Predicates.ContainsPatternPredicate containsPatternPredicate, valuesImpl valuesimpl, Maps.AbstractFilteredMap abstractFilteredMap, Maps.C36434 r6) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = getlocalport;
        this.write = containsPatternPredicate;
        this.MediaMetadataCompat = valuesimpl;
        this.MediaBrowserCompat$SearchResultReceiver = abstractFilteredMap;
        this.MediaBrowserCompat$ItemReceiver = r6;
    }

    /* renamed from: o.getContour$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzxq> {
        private read() {
        }

        public /* synthetic */ read(getContour getcontour, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getContour getcontour = getContour.this;
            RemoteMessage remoteMessage = new RemoteMessage((zzxq) obj);
            if (getcontour.RatingCompat != null) {
                remoteMessage.IconCompatParcelizer(getcontour.RatingCompat);
            }
            getContour.this.IconCompatParcelizer.write.write();
        }

        public final void onError(Throwable th) {
            getContour.MediaBrowserCompat$MediaItem(getContour.this);
            getContour getcontour = getContour.this;
            FirelogAnalyticsEvent firelogAnalyticsEvent = new FirelogAnalyticsEvent(this, th);
            if (getcontour.RatingCompat != null) {
                firelogAnalyticsEvent.IconCompatParcelizer(getcontour.RatingCompat);
            }
        }

        public final void onComplete() {
            getContour.RatingCompat(getContour.this);
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(zzxq zzxq, setResultDeserializer setresultdeserializer) {
            setresultdeserializer.MediaBrowserCompat$ItemReceiver(zzxq.MediaBrowserCompat$CustomActionResultReceiver == endTransaction.tempLock);
        }
    }

    /* renamed from: o.getContour$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<dispatch> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(getContour getcontour, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            ensureBackgroundStateListenerRegistered read = getContour.this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver((dispatch) obj);
            boolean z = true;
            if (!read.read || !read.MediaBrowserCompat$CustomActionResultReceiver) {
                getContour getcontour = getContour.this;
                openHttpURLConnection openhttpurlconnection = openHttpURLConnection.IconCompatParcelizer;
                if (getcontour.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    openhttpurlconnection.IconCompatParcelizer(getcontour.RatingCompat);
                    return;
                }
                return;
            }
            getContour getcontour2 = getContour.this;
            getFilePath getfilepath = new getFilePath(read);
            if (getcontour2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getfilepath.IconCompatParcelizer(getcontour2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            getContour.MediaSessionCompat$QueueItem(getContour.this);
            getContour getcontour = getContour.this;
            FirebaseLocalModel firebaseLocalModel = new FirebaseLocalModel(this, th);
            if (getcontour.RatingCompat != null) {
                firebaseLocalModel.IconCompatParcelizer(getcontour.RatingCompat);
            }
        }

        public final void onComplete() {
            getContour.MediaSessionCompat$Token(getContour.this);
        }
    }

    public final void IconCompatParcelizer() {
        FirebaseMessagingRegistrar firebaseMessagingRegistrar = FirebaseMessagingRegistrar.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            firebaseMessagingRegistrar.IconCompatParcelizer(this.RatingCompat);
        }
        this.IconCompatParcelizer.read(new constrainedCollection(this.read));
        this.IconCompatParcelizer.IconCompatParcelizer(new write(this, (byte) 0));
    }

    /* renamed from: o.getContour$write */
    class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<obtainMessage> {
        private write() {
        }

        /* synthetic */ write(getContour getcontour, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            obtainMessage obtainmessage = (obtainMessage) obj;
            getContour.write(getContour.this);
            Maps.AbstractFilteredMap unused = getContour.this.MediaBrowserCompat$SearchResultReceiver;
            FirebaseAnalytics firebaseAnalytics = new FirebaseAnalytics();
            firebaseAnalytics.MediaBrowserCompat$ItemReceiver = obtainmessage.MediaBrowserCompat$MediaItem;
            firebaseAnalytics.MediaBrowserCompat$MediaItem = obtainmessage.RatingCompat;
            firebaseAnalytics.RatingCompat = obtainmessage.MediaBrowserCompat$SearchResultReceiver.concat("%");
            firebaseAnalytics.MediaDescriptionCompat = obtainmessage.MediaSessionCompat$Token.concat("%");
            firebaseAnalytics.MediaBrowserCompat$SearchResultReceiver = obtainmessage.MediaDescriptionCompat.concat("%");
            firebaseAnalytics.MediaMetadataCompat = obtainmessage.MediaMetadataCompat.concat("%");
            firebaseAnalytics.write = AlertController$RecycleListView.write(obtainmessage.write, ", ");
            firebaseAnalytics.read = AlertController$RecycleListView.write(obtainmessage.MediaBrowserCompat$ItemReceiver, ", ");
            firebaseAnalytics.MediaBrowserCompat$CustomActionResultReceiver = obtainmessage.read.concat("%");
            firebaseAnalytics.IconCompatParcelizer = obtainmessage.MediaBrowserCompat$CustomActionResultReceiver.concat("%");
            getContour getcontour = getContour.this;
            toIntent tointent = new toIntent(firebaseAnalytics);
            if (getcontour.RatingCompat != null) {
                tointent.IconCompatParcelizer(getcontour.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            getContour.IconCompatParcelizer(getContour.this);
            getContour getcontour = getContour.this;
            FirelogAnalyticsEvent.zzb zzb = new FirelogAnalyticsEvent.zzb(this, th);
            if (getcontour.RatingCompat != null) {
                zzb.IconCompatParcelizer(getcontour.RatingCompat);
            }
        }
    }

    static /* synthetic */ void write(getContour getcontour) {
        if (getcontour.RatingCompat != null) {
            getcontour.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getContour getcontour) {
        if (getcontour.RatingCompat != null) {
            getcontour.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(getContour getcontour) {
        getValueType getvaluetype = getValueType.read;
        if (getcontour.RatingCompat != null) {
            getvaluetype.IconCompatParcelizer(getcontour.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(getContour getcontour) {
        if (getcontour.RatingCompat != null) {
            getcontour.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(getContour getcontour) {
        if (getcontour.RatingCompat != null) {
            getcontour.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$QueueItem(getContour getcontour) {
        if (getcontour.RatingCompat != null) {
            getcontour.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$Token(getContour getcontour) {
        if (getcontour.RatingCompat != null) {
            getcontour.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(chain chain, setResultDeserializer setresultdeserializer) {
        if (chain != null) {
            setresultdeserializer.MediaBrowserCompat$SearchResultReceiver(chain.setForceShowIcon);
            setresultdeserializer.write(!chain.setContentView);
            return;
        }
        setresultdeserializer.MediaBrowserCompat$SearchResultReceiver(false);
    }

    static /* synthetic */ void write(chain chain, setResultDeserializer setresultdeserializer) {
        if (chain != null) {
            setresultdeserializer.MediaBrowserCompat$MediaItem(chain.ListMenuItemView);
            setresultdeserializer.MediaBrowserCompat$CustomActionResultReceiver(!chain.setBackgroundResource);
            return;
        }
        setresultdeserializer.MediaBrowserCompat$MediaItem(false);
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(chain chain, setResultDeserializer setresultdeserializer) {
        setresultdeserializer.MediaDescriptionCompat(chain != null && chain.setTitle);
    }

    static /* synthetic */ void IconCompatParcelizer(chain chain, setResultDeserializer setresultdeserializer) {
        setresultdeserializer.MediaMetadataCompat(chain != null && chain.setContentHeight);
    }

    static /* synthetic */ void read(chain chain, setResultDeserializer setresultdeserializer) {
        if ("B6".equals(chain.MediaMetadataCompat)) {
            setresultdeserializer.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            setresultdeserializer.MediaBrowserCompat$ItemReceiver();
        }
    }

    public void onDestroy() {
        this.IconCompatParcelizer.write.write();
        super.onDestroy();
    }
}
