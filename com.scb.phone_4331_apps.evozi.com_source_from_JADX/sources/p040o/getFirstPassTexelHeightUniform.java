package p040o;

import java.util.ArrayList;
import p040o.RegularImmutableList;
import p040o.access$2300;
import p040o.setCvv;
import p040o.zzca;

/* renamed from: o.getFirstPassTexelHeightUniform */
public class getFirstPassTexelHeightUniform extends writeUInt64NoTag<setCvv.read> implements loadInBackground {
    /* access modifiers changed from: private */
    public final offset IconCompatParcelizer;
    public final setMinFaceSize MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final RegularImmutableList.C37531 read;
    public final setMode write;

    @HmlPinActivity
    public getFirstPassTexelHeightUniform(RegularImmutableBiMap regularImmutableBiMap, setMinFaceSize setminfacesize, setMode setmode, offset offset, RegularImmutableList.C37531 r5) {
        super(regularImmutableBiMap);
        this.write = setmode;
        this.IconCompatParcelizer = offset;
        this.MediaBrowserCompat$ItemReceiver = setminfacesize;
        this.read = r5;
    }

    public final void onStart() {
        VerticalGuidance verticalGuidance = VerticalGuidance.write;
        if (this.RatingCompat != null) {
            verticalGuidance.IconCompatParcelizer(this.RatingCompat);
        }
        setMinFaceSize setminfacesize = this.MediaBrowserCompat$ItemReceiver;
        setminfacesize.write(setminfacesize.IconCompatParcelizer(), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzca.zzb.C10819zzb.zza>() {
            public final /* synthetic */ void onNext(Object obj) {
                zzca.zzb.C10819zzb.zza zza = (zzca.zzb.C10819zzb.zza) obj;
                super.onNext(zza);
                RegularImmutableList.C37531 read2 = getFirstPassTexelHeightUniform.this.read;
                ArrayList arrayList = new ArrayList();
                setFiles MediaBrowserCompat$CustomActionResultReceiver = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver.read = read2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_personal_info_name);
                MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = zza.MediaDescriptionCompat;
                arrayList.add(MediaBrowserCompat$CustomActionResultReceiver);
                setFiles MediaBrowserCompat$CustomActionResultReceiver2 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver2.read = read2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_personal_info_id);
                boolean z = false;
                MediaBrowserCompat$CustomActionResultReceiver2.RatingCompat = getICheckDeserializerRtti.IconCompatParcelizer(false, false, zza.MediaBrowserCompat$ItemReceiver);
                arrayList.add(MediaBrowserCompat$CustomActionResultReceiver2);
                getFirstPassTexelHeightUniform getfirstpasstexelheightuniform = getFirstPassTexelHeightUniform.this;
                GPUStrategyCombinedEdgeDetection gPUStrategyCombinedEdgeDetection = new GPUStrategyCombinedEdgeDetection(arrayList);
                if (getfirstpasstexelheightuniform.RatingCompat != null) {
                    gPUStrategyCombinedEdgeDetection.IconCompatParcelizer(getfirstpasstexelheightuniform.RatingCompat);
                }
                RegularImmutableList.C37531 read3 = getFirstPassTexelHeightUniform.this.read;
                ArrayList arrayList2 = new ArrayList();
                setFiles MediaBrowserCompat$CustomActionResultReceiver3 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver3.read = read3.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_personal_info_email);
                MediaBrowserCompat$CustomActionResultReceiver3.RatingCompat = zza.MediaBrowserCompat$CustomActionResultReceiver;
                arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver3);
                isBleUsable isbleusable = zza.read;
                if (isbleusable != null && isbleusable.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    setFiles MediaBrowserCompat$CustomActionResultReceiver4 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
                    MediaBrowserCompat$CustomActionResultReceiver4.read = read3.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_personal_info_current_mailing_address);
                    MediaBrowserCompat$CustomActionResultReceiver4.RatingCompat = RegularImmutableList.C37531.MediaBrowserCompat$CustomActionResultReceiver(isbleusable.MediaBrowserCompat$CustomActionResultReceiver);
                    arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver4);
                } else if (zza.write != null) {
                    isBleUsable isbleusable2 = zza.write;
                    if (isbleusable2.MediaBrowserCompat$CustomActionResultReceiver != null) {
                        setFiles MediaBrowserCompat$CustomActionResultReceiver5 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
                        MediaBrowserCompat$CustomActionResultReceiver5.read = read3.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_personal_info_current_mailing_address);
                        MediaBrowserCompat$CustomActionResultReceiver5.RatingCompat = RegularImmutableList.C37531.MediaBrowserCompat$CustomActionResultReceiver(isbleusable2.MediaBrowserCompat$CustomActionResultReceiver);
                        arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver5);
                    }
                }
                getFirstPassTexelHeightUniform getfirstpasstexelheightuniform2 = getFirstPassTexelHeightUniform.this;
                handleFocus handlefocus = new handleFocus(arrayList2);
                if (getfirstpasstexelheightuniform2.RatingCompat != null) {
                    handlefocus.IconCompatParcelizer(getfirstpasstexelheightuniform2.RatingCompat);
                }
                RegularImmutableList.C37531 read4 = getFirstPassTexelHeightUniform.this.read;
                ArrayList arrayList3 = new ArrayList();
                setFiles MediaBrowserCompat$CustomActionResultReceiver6 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver6.read = read4.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_personal_info_job_title);
                MediaBrowserCompat$CustomActionResultReceiver6.RatingCompat = zza.MediaBrowserCompat$MediaItem;
                arrayList3.add(MediaBrowserCompat$CustomActionResultReceiver6);
                isBleUsable isbleusable3 = zza.MediaMetadataCompat;
                if (!(isbleusable3 == null || isbleusable3.MediaBrowserCompat$CustomActionResultReceiver == null)) {
                    setFiles MediaBrowserCompat$CustomActionResultReceiver7 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
                    MediaBrowserCompat$CustomActionResultReceiver7.read = read4.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.etb_personal_info_work_address);
                    MediaBrowserCompat$CustomActionResultReceiver7.RatingCompat = RegularImmutableList.C37531.MediaBrowserCompat$CustomActionResultReceiver(isbleusable3.MediaBrowserCompat$CustomActionResultReceiver);
                    arrayList3.add(MediaBrowserCompat$CustomActionResultReceiver7);
                }
                getFirstPassTexelHeightUniform getfirstpasstexelheightuniform3 = getFirstPassTexelHeightUniform.this;
                GPUStrategyEdgeDetection gPUStrategyEdgeDetection = new GPUStrategyEdgeDetection(arrayList3);
                if (getfirstpasstexelheightuniform3.RatingCompat != null) {
                    gPUStrategyEdgeDetection.IconCompatParcelizer(getfirstpasstexelheightuniform3.RatingCompat);
                }
                getFirstPassTexelHeightUniform getfirstpasstexelheightuniform4 = getFirstPassTexelHeightUniform.this;
                GPUStrategyForcedEdgeDetection_Factory gPUStrategyForcedEdgeDetection_Factory = GPUStrategyForcedEdgeDetection_Factory.MediaBrowserCompat$ItemReceiver;
                if (getfirstpasstexelheightuniform4.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    gPUStrategyForcedEdgeDetection_Factory.IconCompatParcelizer(getfirstpasstexelheightuniform4.RatingCompat);
                }
            }

            static /* synthetic */ void MediaBrowserCompat$ItemReceiver(setCvv.read read2) {
                read2.IconCompatParcelizer(false);
                read2.aj_();
            }

            public final void onError(Throwable th) {
                super.onError(th);
                getFirstPassTexelHeightUniform getfirstpasstexelheightuniform = getFirstPassTexelHeightUniform.this;
                newGPUStrategyFocusFactorDetection newgpustrategyfocusfactordetection = newGPUStrategyFocusFactorDetection.IconCompatParcelizer;
                if (getfirstpasstexelheightuniform.RatingCompat != null) {
                    newgpustrategyfocusfactordetection.IconCompatParcelizer(getfirstpasstexelheightuniform.RatingCompat);
                }
            }

            static /* synthetic */ void read(setCvv.read read2) {
                read2.IconCompatParcelizer(true);
                read2.aj_();
            }
        });
    }

    /* renamed from: o.getFirstPassTexelHeightUniform$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setHeight> {
        private access$1900 write;

        public final /* synthetic */ void onNext(Object obj) {
            setHeight setheight = (setHeight) obj;
            getFirstPassTexelHeightUniform.IconCompatParcelizer(getFirstPassTexelHeightUniform.this);
            boolean z = true;
            if (getFirstPassTexelHeightUniform.this.RatingCompat != null) {
                defaultReportUploader MediaBrowserCompat$ItemReceiver = getFirstPassTexelHeightUniform.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setheight, this.write);
                getFirstPassTexelHeightUniform getfirstpasstexelheightuniform = getFirstPassTexelHeightUniform.this;
                GPUStrategyFocusFactorDetection_Factory gPUStrategyFocusFactorDetection_Factory = new GPUStrategyFocusFactorDetection_Factory(MediaBrowserCompat$ItemReceiver);
                if (getfirstpasstexelheightuniform.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    gPUStrategyFocusFactorDetection_Factory.IconCompatParcelizer(getfirstpasstexelheightuniform.RatingCompat);
                }
            }
        }

        public read(access$1900 access_1900) {
            this.write = access_1900;
        }

        public final void onComplete() {
            getFirstPassTexelHeightUniform.write(getFirstPassTexelHeightUniform.this);
        }

        public final void onError(Throwable th) {
            getFirstPassTexelHeightUniform.MediaBrowserCompat$ItemReceiver(getFirstPassTexelHeightUniform.this);
            getFirstPassTexelHeightUniform.this.MediaBrowserCompat$ItemReceiver(getFirstPassTexelHeightUniform.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void write(getFirstPassTexelHeightUniform getfirstpasstexelheightuniform) {
        if (getfirstpasstexelheightuniform.RatingCompat != null) {
            getfirstpasstexelheightuniform.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getFirstPassTexelHeightUniform getfirstpasstexelheightuniform) {
        if (getfirstpasstexelheightuniform.RatingCompat != null) {
            getfirstpasstexelheightuniform.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getFirstPassTexelHeightUniform getfirstpasstexelheightuniform) {
        if (getfirstpasstexelheightuniform.RatingCompat != null) {
            getfirstpasstexelheightuniform.RatingCompat.aj_();
        }
    }
}
