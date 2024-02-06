package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.C4131c;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.setCvv;
import p040o.zzca;

/* renamed from: o.getSecondPassProgram */
public class getSecondPassProgram extends writeUInt64NoTag<setCvv.IconCompatParcelizer> {
    public setClassificationType IconCompatParcelizer;
    public defaultReportUploader MediaBrowserCompat$ItemReceiver;
    public String read;
    private newLinkedEntry write;

    @HmlPinActivity
    public getSecondPassProgram(RegularImmutableBiMap regularImmutableBiMap, setClassificationType setclassificationtype, newLinkedEntry newlinkedentry, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = setclassificationtype;
        this.write = newlinkedentry;
        this.read = str;
    }

    static /* synthetic */ void IconCompatParcelizer(cacheUserData cacheuserdata, setCvv.IconCompatParcelizer iconCompatParcelizer) {
        iconCompatParcelizer.aj_();
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(cacheuserdata);
    }

    public static /* synthetic */ void read(getSecondPassProgram getsecondpassprogram, zzca.zzb.C10819zzb zzb) {
        getSecondPassProgram getsecondpassprogram2 = getsecondpassprogram;
        zzca.zzb.C10819zzb zzb2 = zzb;
        cacheUserData cacheuserdata = zzb2 != null ? new cacheUserData(getsecondpassprogram2.write.IconCompatParcelizer("dd MMM yyyy - HH:mm", zzb2.MediaSessionCompat$ResultReceiverWrapper), zzb2.IconCompatParcelizer, zzb2.read, zzb2.write, zzb2.MediaBrowserCompat$SearchResultReceiver, zzb2.RatingCompat, zzb2.MediaBrowserCompat$MediaItem, zzb2.MediaBrowserCompat$ItemReceiver, zzb2.MediaBrowserCompat$CustomActionResultReceiver, zzb2.MediaSessionCompat$Token, zzb2.MediaMetadataCompat, zzb2.f2982x50fd9e4a, zzb2.MediaSessionCompat$QueueItem, zzb2.MediaDescriptionCompat) : null;
        cacheuserdata.MediaBrowserCompat$SearchResultReceiver = getsecondpassprogram2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        cacheuserdata.MediaMetadataCompat = getsecondpassprogram2.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
        OtsyThreshold otsyThreshold = new OtsyThreshold(cacheuserdata);
        if (getsecondpassprogram2.RatingCompat != null) {
            otsyThreshold.IconCompatParcelizer(getsecondpassprogram2.RatingCompat);
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getSecondPassProgram getsecondpassprogram, Throwable th) {
        boolean z = true;
        if (getsecondpassprogram.RatingCompat != null) {
            getsecondpassprogram.RatingCompat.aj_();
        }
        if (writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th)) {
            GPUStrategy gPUStrategy = new GPUStrategy(getsecondpassprogram, th);
            if (getsecondpassprogram.RatingCompat == null) {
                z = false;
            }
            if (z) {
                gPUStrategy.IconCompatParcelizer(getsecondpassprogram.RatingCompat);
            }
        } else if (writeUInt64NoTag.read(th)) {
            setDefaults setdefaults = new setDefaults(getsecondpassprogram, th);
            if (getsecondpassprogram.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setdefaults.IconCompatParcelizer(getsecondpassprogram.RatingCompat);
            }
        } else if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            if (retrofitException.IconCompatParcelizer != null) {
                ILocationSourceDelegate.zza zza = retrofitException.IconCompatParcelizer.write;
                String str = zza.IconCompatParcelizer;
                char c = 65535;
                switch (str.hashCode()) {
                    case 1507524:
                        if (str.equals("1038")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1515399:
                        if (str.equals("1899")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 1516360:
                        if (str.equals("1999")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 1567005:
                        if (str.equals("3000")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1567006:
                        if (str.equals("3001")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1567007:
                        if (str.equals("3002")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1567037:
                        if (str.equals("3011")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1686170:
                        if (str.equals("7001")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1746712:
                        if (str.equals("9100")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        getsecondpassprogram.MediaBrowserCompat$ItemReceiver(getsecondpassprogram.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new isSamsungS4(getsecondpassprogram)));
                        return;
                    case 4:
                        setScaleType setscaletype = new setScaleType(zza);
                        if (getsecondpassprogram.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            setscaletype.IconCompatParcelizer(getsecondpassprogram.RatingCompat);
                            return;
                        }
                        return;
                    case 5:
                        getsecondpassprogram.MediaBrowserCompat$ItemReceiver(getsecondpassprogram.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new GPUStrategyCombinedEdgeDetection_Factory(getsecondpassprogram)));
                        return;
                    case 6:
                        C4131c.C4140b bVar = C4131c.C4140b.MediaBrowserCompat$ItemReceiver;
                        if (getsecondpassprogram.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            bVar.IconCompatParcelizer(getsecondpassprogram.RatingCompat);
                            return;
                        }
                        return;
                    case 7:
                        getsecondpassprogram.MediaBrowserCompat$ItemReceiver(getsecondpassprogram.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new getScaleType(getsecondpassprogram)));
                        return;
                    case 8:
                        getsecondpassprogram.MediaBrowserCompat$ItemReceiver(getsecondpassprogram.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new GPUImageNativeLibrary(getsecondpassprogram)));
                        return;
                    default:
                        getsecondpassprogram.MediaBrowserCompat$ItemReceiver(getsecondpassprogram.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                        return;
                }
            } else {
                getsecondpassprogram.MediaBrowserCompat$ItemReceiver(getsecondpassprogram.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        } else {
            getsecondpassprogram.MediaBrowserCompat$ItemReceiver(getsecondpassprogram.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
