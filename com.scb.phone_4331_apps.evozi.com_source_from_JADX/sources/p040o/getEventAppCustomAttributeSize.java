package p040o;

import android.content.SharedPreferences;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p040o.PlaceFilter;
import p040o.Splitter;
import p040o.StreetViewPanoramaOrientation;
import p040o.Synchronized;
import p040o.access$2300;
import p040o.zzmd;

/* renamed from: o.getEventAppCustomAttributeSize */
public class getEventAppCustomAttributeSize extends writeUInt64NoTag<getCar> {
    final Synchronized.SynchronizedAsMapEntries.C38351.C38361 IconCompatParcelizer;
    public final getEulerY MediaBrowserCompat$ItemReceiver;
    public final serializable MediaBrowserCompat$MediaItem;
    public final setBackingMap MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final isNot f2830x50fd9e4a;
    public final Splitter.C38072 MediaDescriptionCompat;
    public final StreetViewPanoramaOrientation.Builder MediaMetadataCompat;
    public final onStopJob MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper = false;
    private final SharedPreferences MediaSessionCompat$Token;
    private final trimResults ParcelableVolumeInfo;
    private final SharedPreferences PlaybackStateCompat;
    public AtomicBoolean read;
    public final omitEmptyStrings write;

    @HmlPinActivity
    public getEventAppCustomAttributeSize(Synchronized.SynchronizedAsMapEntries.C38351.C38361 r1, RegularImmutableBiMap regularImmutableBiMap, StreetViewPanoramaOrientation.Builder builder, getEulerY geteulery, trimResults trimresults, SharedPreferences sharedPreferences, proxyGetOnDevicePassportDeserializer proxygetondevicepassportdeserializer, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tokenCache") SharedPreferences sharedPreferences2, omitEmptyStrings omitemptystrings, Splitter.C38072 r10, setBackingMap setbackingmap, serializable serializable, isNot isnot, onStopJob onstopjob) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = builder;
        this.MediaBrowserCompat$ItemReceiver = geteulery;
        this.MediaSessionCompat$Token = sharedPreferences;
        this.IconCompatParcelizer = r1;
        this.ParcelableVolumeInfo = trimresults;
        this.PlaybackStateCompat = sharedPreferences2;
        this.write = omitemptystrings;
        this.MediaDescriptionCompat = r10;
        this.MediaBrowserCompat$SearchResultReceiver = setbackingmap;
        this.MediaBrowserCompat$MediaItem = serializable;
        this.f2830x50fd9e4a = isnot;
        this.MediaSessionCompat$QueueItem = onstopjob;
        proxygetondevicepassportdeserializer.write();
    }

    public final void IconCompatParcelizer(zzmd.zzm.zzb.zza zza) {
        isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow;
        if (zzmd.zzm.zzb.zza.INDIVIDUAL.equals(zza)) {
            if (this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.write() != null) {
                isrestrictedtoplacesopennow = this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.write().MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                isrestrictedtoplacesopennow = null;
            }
            if (isrestrictedtoplacesopennow != null && !"POP_UP_MBOX".equalsIgnoreCase(isrestrictedtoplacesopennow.MediaBrowserCompat$CustomActionResultReceiver)) {
                capAndGetOpenSessions capandgetopensessions = new capAndGetOpenSessions(this, isrestrictedtoplacesopennow);
                if (this.RatingCompat != null) {
                    capandgetopensessions.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
    }

    public final Set<String> IconCompatParcelizer() {
        boolean z;
        PlaceFilter.zzb zzb;
        HashSet hashSet = new HashSet();
        Set<String> MediaBrowserCompat$CustomActionResultReceiver = this.MediaMetadataCompat.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null && !MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            for (String next : MediaBrowserCompat$CustomActionResultReceiver) {
                if (next != null) {
                    if (next.contains("JUST_FOR_YOU_TUTORIAL")) {
                        zzwi MediaBrowserCompat$CustomActionResultReceiver2 = this.f2830x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver();
                        if (MediaBrowserCompat$CustomActionResultReceiver2 == null || (zzb = MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper) == null) {
                            z = false;
                        } else {
                            z = zzb.MediaBrowserCompat$SearchResultReceiver;
                        }
                        if (z) {
                            hashSet.add("JUST_FOR_YOU_TUTORIAL");
                        }
                    } else if (next.contains("REMITTANCE_TUTORIAL")) {
                        hashSet.add("REMITTANCE_TUTORIAL");
                    } else if (next.contains("OLD_LIFE_STYLE_TUTORIAL")) {
                        hashSet.add("OLD_LIFE_STYLE_TUTORIAL");
                    } else if (next.contains("PREDICTIVE_TILES_TUTORIAL")) {
                        hashSet.add("PREDICTIVE_TILES_TUTORIAL");
                    } else if (next.contains("JURISTIC_TUTORIAL")) {
                        hashSet.add("JURISTIC_TUTORIAL");
                    } else if (next.contains("STATIC_TILES_CUSTOMIZATION_TUTORIAL")) {
                        hashSet.add("STATIC_TILES_CUSTOMIZATION_TUTORIAL");
                    } else if (!next.contains("QR_CODE_SECTION_TUTORIAL") && !next.contains("STATIC_TILES_EASY_CASH_TUTORIAL")) {
                        if (next.contains("FASTPAY_TUTORIAL")) {
                            hashSet.add("FASTPAY_TUTORIAL");
                        } else if (next.contains("ANNOTATION_TUTORIAL")) {
                            hashSet.add("ANNOTATION_TUTORIAL");
                        } else if (next.contains("QR_PAYMENT_TUTORIAL")) {
                            hashSet.add("QR_PAYMENT_TUTORIAL");
                        } else if (next.contains("HML_TUTORIAL")) {
                            hashSet.add("HML_TUTORIAL");
                        } else if (next.contains("E_MARKETPLACE_TUTORIAL")) {
                            hashSet.add("E_MARKETPLACE_TUTORIAL");
                        } else if (next.contains("MAILING_ADDRESS_TUTORIAL")) {
                            hashSet.add("MAILING_ADDRESS_TUTORIAL");
                        }
                    }
                }
            }
        }
        return hashSet;
    }

    public final void write() {
        this.MediaSessionCompat$Token.edit().putString("com.scb.phone.pref.key.UPDATE_DIALOG_DATE", SimpleDateFormat.getDateInstance(3, Locale.US).format(new Date())).apply();
    }

    public final boolean read() {
        try {
            return new Date().getTime() - SimpleDateFormat.getDateInstance(3, Locale.US).parse(this.MediaSessionCompat$Token.getString("com.scb.phone.pref.key.UPDATE_DIALOG_DATE", "")).getTime() > 259200000;
        } catch (ParseException unused) {
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        StreetViewPanoramaOrientation.Builder builder = this.MediaMetadataCompat;
        if (builder.MediaBrowserCompat$CustomActionResultReceiver.write() == null || builder.MediaBrowserCompat$CustomActionResultReceiver.write().MediaSessionCompat$ResultReceiverWrapper == null) {
            return false;
        }
        return builder.MediaBrowserCompat$CustomActionResultReceiver.write().MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(String str) {
        boolean z = true;
        if ("ACTION_DEEP_LINK_DEFAULT_ACC".equalsIgnoreCase(str)) {
            writeTag writetag = writeTag.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writetag.IconCompatParcelizer(this.RatingCompat);
            }
        } else if ("ACTION_DEEP_LINK_NOTIFICATION".equalsIgnoreCase(str)) {
            Sha1FileIdStrategy sha1FileIdStrategy = Sha1FileIdStrategy.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                sha1FileIdStrategy.IconCompatParcelizer(this.RatingCompat);
            }
        } else if ("ACTION_DEEP_LINK_LAND".equalsIgnoreCase(str)) {
            writeBool writebool = writeBool.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writebool.IconCompatParcelizer(this.RatingCompat);
            }
        } else if ("ACTION_CHEQUE_STATUS".equalsIgnoreCase(str)) {
            writeEnumNoTag writeenumnotag = writeEnumNoTag.write;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writeenumnotag.IconCompatParcelizer(this.RatingCompat);
            }
        } else if ("ACTION_CHEQUE_ACTIVATE".equalsIgnoreCase(str)) {
            writeBoolNoTag writeboolnotag = writeBoolNoTag.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writeboolnotag.IconCompatParcelizer(this.RatingCompat);
            }
        } else if ("ACTION_DEEP_LINK_JURISTIC_STARTING_PIN".equalsIgnoreCase(str)) {
            getOrCreateBodyBuilder getorcreatebodybuilder = getOrCreateBodyBuilder.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getorcreatebodybuilder.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public static List<String> MediaBrowserCompat$CustomActionResultReceiver(Set<String> set, List<String> list) {
        for (String remove : set) {
            list.remove(remove);
        }
        return list;
    }

    public final List<String> MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z;
        PlaceFilter.zzb zzb;
        ArrayList arrayList = new ArrayList();
        arrayList.add("MAILING_ADDRESS_TUTORIAL");
        arrayList.add("E_MARKETPLACE_TUTORIAL");
        zzwi MediaBrowserCompat$CustomActionResultReceiver = this.f2830x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == null || (zzb = MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper) == null) {
            z = false;
        } else {
            z = zzb.MediaBrowserCompat$SearchResultReceiver;
        }
        if (z) {
            arrayList.add("JUST_FOR_YOU_TUTORIAL");
        }
        arrayList.add("HML_TUTORIAL");
        arrayList.add("REMITTANCE_TUTORIAL");
        arrayList.add("OLD_LIFE_STYLE_TUTORIAL");
        arrayList.add("PREDICTIVE_TILES_TUTORIAL");
        arrayList.add("JURISTIC_TUTORIAL");
        arrayList.add("STATIC_TILES_CUSTOMIZATION_TUTORIAL");
        arrayList.add("FASTPAY_TUTORIAL");
        arrayList.add("ANNOTATION_TUTORIAL");
        arrayList.add("QR_PAYMENT_TUTORIAL");
        return arrayList;
    }

    /* renamed from: o.getEventAppCustomAttributeSize$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<addTileOverlay> {
        static /* synthetic */ void write(access$2200 access_2200) {
        }

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(getEventAppCustomAttributeSize geteventappcustomattributesize, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            int i;
            addTileOverlay addtileoverlay = (addTileOverlay) obj;
            boolean z = true;
            if ((getEventAppCustomAttributeSize.this.RatingCompat != null) && (i = addtileoverlay.write) >= 0) {
                if (i > 99) {
                    i = 99;
                }
                getEventAppCustomAttributeSize geteventappcustomattributesize = getEventAppCustomAttributeSize.this;
                getFilesInDirectory getfilesindirectory = new getFilesInDirectory(i);
                if (geteventappcustomattributesize.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getfilesindirectory.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            access$2200 MediaBrowserCompat$ItemReceiver;
            if (!getEventAppCustomAttributeSize.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                boolean z = true;
                if ((getEventAppCustomAttributeSize.this.RatingCompat != null) && (MediaBrowserCompat$ItemReceiver = getEventAppCustomAttributeSize.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS)) != null) {
                    getEventAppCustomAttributeSize geteventappcustomattributesize = getEventAppCustomAttributeSize.this;
                    getAllFinalizedReportFiles getallfinalizedreportfiles = new getAllFinalizedReportFiles(MediaBrowserCompat$ItemReceiver);
                    if (geteventappcustomattributesize.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getallfinalizedreportfiles.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
                    }
                }
            }
        }
    }

    public final void RatingCompat() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver(this.PlaybackStateCompat.getString("FCM_TOKEN", ""), true);
        this.ParcelableVolumeInfo.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver() {
            public final void onComplete() {
                super.onComplete();
                getEventAppCustomAttributeSize geteventappcustomattributesize = getEventAppCustomAttributeSize.this;
                boolean z = true;
                if (geteventappcustomattributesize.RatingCompat != null) {
                    geteventappcustomattributesize.RatingCompat.aj_();
                }
                getEventAppCustomAttributeSize geteventappcustomattributesize2 = getEventAppCustomAttributeSize.this;
                ProcMapEntryParser procMapEntryParser = ProcMapEntryParser.MediaBrowserCompat$CustomActionResultReceiver;
                if (geteventappcustomattributesize2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    procMapEntryParser.IconCompatParcelizer(geteventappcustomattributesize2.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                if (!getEventAppCustomAttributeSize.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                    getEventAppCustomAttributeSize geteventappcustomattributesize = getEventAppCustomAttributeSize.this;
                    combineReportFiles combinereportfiles = combineReportFiles.write;
                    if (geteventappcustomattributesize.RatingCompat != null) {
                        combinereportfiles.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
                        return;
                    }
                    return;
                }
                getEventAppCustomAttributeSize geteventappcustomattributesize2 = getEventAppCustomAttributeSize.this;
                geteventappcustomattributesize2.MediaBrowserCompat$ItemReceiver(geteventappcustomattributesize2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }

            static /* synthetic */ void read(getCar getcar) {
                getcar.aj_();
                getcar.MediaSessionCompat$QueueItem();
            }
        });
    }
}
