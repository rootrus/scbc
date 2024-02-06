package p040o;

import com.google.gson.reflect.TypeToken;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p040o.CrashlyticsCore;
import p040o.Futures;
import p040o.GoogleMap;
import p040o.LinkedListMultimap;
import p040o.LocalProjectProvider;
import p040o.MapDifference;
import p040o.Sets;
import p040o.SingletonImmutableList;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.dx */
public final class C4305dx extends writeUInt64NoTag<LocalProjectProvider.write> {
    public LocationServices IconCompatParcelizer;
    public final transparency MediaBrowserCompat$ItemReceiver;
    public final MapDifference.ValueDifference MediaBrowserCompat$MediaItem;
    public final AbstractBiMap MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final Sets.SetView MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final SingletonImmutableList.C37921 MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public final readLines MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public final valueIteratorImpl ParcelableVolumeInfo;
    public CrashlyticsCore.C32441 read;
    public final LinkedListMultimap.NodeIterator write;

    /* renamed from: o.dx$Keep */
    public static final class Keep extends TypeToken<HashMap<String, String>> {
    }

    /* renamed from: o.dx$PlaybackStateCompat */
    static final class PlaybackStateCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        private /* synthetic */ HashMap MediaBrowserCompat$CustomActionResultReceiver;

        PlaybackStateCompat(HashMap hashMap) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hashMap;
        }

        /* renamed from: o.dx$PlaybackStateCompat$CustomAction */
        static final class CustomAction<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
            private /* synthetic */ boolean IconCompatParcelizer;
            private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
            private /* synthetic */ C4305dx read;

            CustomAction(C4305dx dxVar, boolean z, boolean z2) {
                this.read = dxVar;
                this.IconCompatParcelizer = z;
                this.MediaBrowserCompat$ItemReceiver = z2;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((LocalProjectProvider.write) obj).IconCompatParcelizer(C4305dx.write(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver));
            }
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.write) obj).read((HashMap<String, Object>) this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.dx$AppCompatActivity */
    public static final class AppCompatActivity<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        public static final AppCompatActivity MediaBrowserCompat$ItemReceiver = new AppCompatActivity();

        AppCompatActivity() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.write) obj).MediaBrowserCompat$SearchResultReceiver();
        }
    }

    /* renamed from: o.dx$AppCompatDialogFragment */
    public static final class AppCompatDialogFragment<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        private /* synthetic */ Futures.C34104 write;

        public AppCompatDialogFragment(Futures.C34104 r1) {
            this.write = r1;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            Futures.C34104 r0 = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) r0, "userInfoDisplay");
            String replace = r0.IconCompatParcelizer.replace("\n", " ");
            onGetStartedClick.IconCompatParcelizer((Object) replace, "userInfoDisplay.fullNameSingleLine");
            ((LocalProjectProvider.write) obj).read(replace);
        }
    }

    /* renamed from: o.dx$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        private /* synthetic */ CrashlyticsCore.C32441 MediaBrowserCompat$CustomActionResultReceiver;

        ParcelableVolumeInfo(CrashlyticsCore.C32441 r1) {
            this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.write) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.dx$setContentView */
    public static final class setContentView<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        private /* synthetic */ String IconCompatParcelizer;

        public setContentView(String str) {
            this.IconCompatParcelizer = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.write) obj).read(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.dx$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.write) obj).MediaBrowserCompat$MediaItem();
        }
    }

    /* renamed from: o.dx$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4305dx IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaDescriptionCompat(C4305dx dxVar) {
            super(1);
            this.IconCompatParcelizer = dxVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            C4305dx dxVar = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write>(this) {
                private /* synthetic */ MediaDescriptionCompat write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    LocalProjectProvider.write write2 = (LocalProjectProvider.write) obj;
                    write2.read();
                    write2.MediaBrowserCompat$CustomActionResultReceiver();
                    this.write.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.write.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            };
            if (dxVar.RatingCompat != null) {
                r1.IconCompatParcelizer(dxVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dx$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4305dx MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(C4305dx dxVar) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = dxVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            C4305dx dxVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write>(this) {
                private /* synthetic */ MediaMetadataCompat write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    LocalProjectProvider.write write2 = (LocalProjectProvider.write) obj;
                    write2.read();
                    write2.MediaBrowserCompat$CustomActionResultReceiver();
                    this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            };
            if (dxVar.RatingCompat != null) {
                r1.IconCompatParcelizer(dxVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dx$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        public static final RatingCompat MediaBrowserCompat$CustomActionResultReceiver = new RatingCompat();

        RatingCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.write) obj).MediaBrowserCompat$MediaItem();
        }
    }

    /* renamed from: o.dx$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C4305dx read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(C4305dx dxVar) {
            super(1);
            this.read = dxVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            C4305dx dxVar = this.read;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write>(this) {
                private /* synthetic */ read MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                }
            };
            if (dxVar.RatingCompat != null) {
                r1.IconCompatParcelizer(dxVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.dx$setBackgroundResource */
    public static final class setBackgroundResource<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        public static final setBackgroundResource MediaBrowserCompat$CustomActionResultReceiver = new setBackgroundResource();

        setBackgroundResource() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.write) obj).RatingCompat();
        }
    }

    /* renamed from: o.dx$setExpandedFormat */
    public static final class setExpandedFormat<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        public static final setExpandedFormat write = new setExpandedFormat();

        setExpandedFormat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.write) obj).MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    /* renamed from: o.dx$setHasDecor */
    public static final class setHasDecor<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        private /* synthetic */ String write;

        public setHasDecor(String str) {
            this.write = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) str, "this");
            ((LocalProjectProvider.write) obj).MediaBrowserCompat$MediaItem(str);
        }
    }

    /* renamed from: o.dx$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        public static final write IconCompatParcelizer = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ CrashlyticsCore.C32441 write(C4305dx dxVar) {
        CrashlyticsCore.C32441 r1 = dxVar.read;
        if (r1 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("investmentProfileDisplay");
        }
        return r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4305dx(RegularImmutableBiMap regularImmutableBiMap, AbstractBiMap abstractBiMap, LinkedListMultimap.NodeIterator nodeIterator, SingletonImmutableList.C37921 r5, valueIteratorImpl valueiteratorimpl, Sets.SetView setView, readLines readlines, MapDifference.ValueDifference valueDifference, transparency transparency) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) abstractBiMap, "registrationAccountsCase");
        onGetStartedClick.write((Object) nodeIterator, "controller");
        onGetStartedClick.write((Object) r5, "investmentProfileMapper");
        onGetStartedClick.write((Object) valueiteratorimpl, "purchaseSearchDisplayMapper");
        onGetStartedClick.write((Object) setView, "investmentDetailsClientDisplayMapper");
        onGetStartedClick.write((Object) readlines, "partnerMutualFundDisplayMapper");
        onGetStartedClick.write((Object) valueDifference, "userInfoDisplayMapper");
        onGetStartedClick.write((Object) transparency, "accountSummaryCase");
        this.MediaBrowserCompat$SearchResultReceiver = abstractBiMap;
        this.write = nodeIterator;
        this.MediaSessionCompat$QueueItem = r5;
        this.ParcelableVolumeInfo = valueiteratorimpl;
        this.MediaDescriptionCompat = setView;
        this.MediaSessionCompat$ResultReceiverWrapper = readlines;
        this.MediaBrowserCompat$MediaItem = valueDifference;
        this.MediaBrowserCompat$ItemReceiver = transparency;
        new HashMap();
    }

    public final void onDestroy() {
        super.onDestroy();
        this.write.IconCompatParcelizer();
    }

    public static final /* synthetic */ int write(boolean z, boolean z2) {
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) new HmlVerifyEmailSuccessfulActivity(Boolean.valueOf(z), Boolean.valueOf(z2)), (Object) new HmlVerifyEmailSuccessfulActivity(Boolean.TRUE, Boolean.FALSE)) ? 1 : 0;
    }

    private final void read(LocationServices locationServices) {
        boolean z = true;
        if (locationServices.IconCompatParcelizer) {
            LocationServices locationServices2 = this.IconCompatParcelizer;
            if (locationServices2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("investmentNow");
            }
            List<getGeofenceTransition> list = locationServices2.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                for (getGeofenceTransition getgeofencetransition : list) {
                    Collection collection = getgeofencetransition.MediaBrowserCompat$CustomActionResultReceiver;
                    if (!(collection == null || collection.isEmpty())) {
                        List<GeofencingRequest> list2 = getgeofencetransition.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.IconCompatParcelizer((Object) list2, "investmentDetailsClient.fundList");
                        int i = 0;
                        for (Object next : list2) {
                            if (i >= 0) {
                                GeofencingRequest geofencingRequest = (GeofencingRequest) next;
                                onGetStartedClick.IconCompatParcelizer((Object) geofencingRequest, "it");
                                if (geofencingRequest.MediaDescriptionCompat) {
                                    writeUInt64NoTag.IconCompatParcelizer dx_mediasessioncompat_resultreceiverwrapper = new dx$MediaSessionCompat$ResultReceiverWrapper(i, getgeofencetransition, this);
                                    if (this.RatingCompat == null) {
                                        z = false;
                                    }
                                    if (z) {
                                        dx_mediasessioncompat_resultreceiverwrapper.IconCompatParcelizer(this.RatingCompat);
                                        return;
                                    }
                                    return;
                                }
                                i++;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        }
                        continue;
                    }
                }
            }
            read(Iterables$3$MediaBrowserCompat$MediaItem.error_default_title, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) C4309xfd65b63a.write);
        } else if (locationServices.write != null) {
            writeUInt64NoTag.IconCompatParcelizer dx_mediasessioncompat_queueitem = new dx$MediaSessionCompat$QueueItem(this, locationServices);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                dx_mediasessioncompat_queueitem.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = dx$MediaSessionCompat$Token.write;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(LocationServices locationServices, CrashlyticsCore.C32441 r4) {
        String str = r4.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) str, "investmentProfileDisplay.riskAssessmentStatus");
        if (2 == Integer.parseInt(str)) {
            read(locationServices);
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer parcelableVolumeInfo = new ParcelableVolumeInfo(r4);
        if (this.RatingCompat != null) {
            parcelableVolumeInfo.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(HashMap<String, Object> hashMap, zzvf zzvf) {
        boolean z;
        boolean z2;
        GoogleMap.OnMapClickListener onMapClickListener = zzvf.MediaMetadataCompat;
        boolean z3 = false;
        if (onMapClickListener != null) {
            z = onMapClickListener.MediaBrowserCompat$ItemReceiver;
        } else {
            z = false;
        }
        GoogleMap.OnMapClickListener onMapClickListener2 = zzvf.MediaMetadataCompat;
        if (onMapClickListener2 != null) {
            z2 = onMapClickListener2.read;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            writeUInt64NoTag.IconCompatParcelizer customAction = new PlaybackStateCompat.CustomAction(this, z, z2);
            if (this.RatingCompat != null) {
                z3 = true;
            }
            if (z3) {
                customAction.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer playbackStateCompat = new PlaybackStateCompat(hashMap);
        if (this.RatingCompat != null) {
            z3 = true;
        }
        if (z3) {
            playbackStateCompat.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
