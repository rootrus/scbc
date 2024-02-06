package p040o;

import android.text.TextUtils;
import com.scb.phone.domain.errors.RetrofitException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Pattern;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AppMeasurementSdk;
import p040o.C4715h;
import p040o.CrashlyticsReport;
import p040o.RegularImmutableMap;
import p040o.StreetViewPanoramaFragment;
import p040o.access$2300;
import p040o.newCheckExtractor;
import p040o.zzca;

/* renamed from: o.nativeWriteImageToFileBuffer */
public class nativeWriteImageToFileBuffer extends writeUInt64NoTag<newCheckExtractor.IconCompatParcelizer> {
    public final include IconCompatParcelizer;
    public final PolygonOptions MediaBrowserCompat$ItemReceiver;
    public final AppMeasurementSdk.ConditionalUserProperty MediaBrowserCompat$MediaItem;
    public final AppMeasurementSdk.OnEventListener MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final isCancelled f2899x50fd9e4a;
    public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final lessThanUnsigned MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public final callWithTimeout MediaSessionCompat$Token;
    /* access modifiers changed from: private */
    public final RegularImmutableMap.Values ParcelableVolumeInfo;
    public zzca.zzd read;
    public CrashlyticsReport.Session.Event.Application.Execution write;

    @HmlPinActivity
    public nativeWriteImageToFileBuffer(RegularImmutableBiMap regularImmutableBiMap, PolygonOptions polygonOptions, RegularImmutableMap.Values values, include include, lessThanUnsigned lessthanunsigned, isCancelled iscancelled, AppMeasurementSdk.OnEventListener onEventListener, AppMeasurementSdk.ConditionalUserProperty conditionalUserProperty, callWithTimeout callwithtimeout) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = polygonOptions;
        this.ParcelableVolumeInfo = values;
        this.IconCompatParcelizer = include;
        this.MediaSessionCompat$QueueItem = lessthanunsigned;
        this.f2899x50fd9e4a = iscancelled;
        this.MediaBrowserCompat$SearchResultReceiver = onEventListener;
        this.MediaBrowserCompat$MediaItem = conditionalUserProperty;
        this.MediaSessionCompat$Token = callwithtimeout;
    }

    /* renamed from: o.nativeWriteImageToFileBuffer$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzca.zzd> {
        final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder write;

        public final /* synthetic */ void onNext(Object obj) {
            String str;
            zzca.zzd zzd = (zzca.zzd) obj;
            zzca.zzd unused = nativeWriteImageToFileBuffer.this.read = zzd;
            RegularImmutableMap.Values unused2 = nativeWriteImageToFileBuffer.this.ParcelableVolumeInfo;
            finalizePreviousNativeSession MediaBrowserCompat$ItemReceiver = RegularImmutableMap.Values.MediaBrowserCompat$ItemReceiver(zzd);
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = nativeWriteImageToFileBuffer.this;
            YuvToRgbShader yuvToRgbShader = new YuvToRgbShader(MediaBrowserCompat$ItemReceiver);
            boolean z = false;
            if (nativewriteimagetofilebuffer.RatingCompat != null) {
                yuvToRgbShader.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
            }
            if (this.write.read > 0.0d) {
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer2 = nativeWriteImageToFileBuffer.this;
                TwoPassShader twoPassShader = new TwoPassShader(this);
                if (nativewriteimagetofilebuffer2.RatingCompat != null) {
                    twoPassShader.IconCompatParcelizer(nativewriteimagetofilebuffer2.RatingCompat);
                }
            } else {
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer3 = nativeWriteImageToFileBuffer.this;
                nativeWriteJpegImageWithMetaData nativewritejpegimagewithmetadata = nativeWriteJpegImageWithMetaData.read;
                if (nativewriteimagetofilebuffer3.RatingCompat != null) {
                    nativewritejpegimagewithmetadata.IconCompatParcelizer(nativewriteimagetofilebuffer3.RatingCompat);
                }
            }
            String str2 = this.write.MediaBrowserCompat$SearchResultReceiver;
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 2066624938) {
                if (hashCode == 2066625372 && str2.equals("FASTPP")) {
                    c = 1;
                }
            } else if (str2.equals("FASTBP")) {
                c = 0;
            }
            if (c == 0) {
                nativeWriteImageToFileBuffer.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$ItemReceiver, this.write.MediaBrowserCompat$MediaItem);
                nativeWriteImageToFileBuffer.this.IconCompatParcelizer.IconCompatParcelizer(new C5054xd6159497(nativeWriteImageToFileBuffer.this, this.write));
            } else if (c == 1) {
                nativeWriteImageToFileBuffer.m3150x50fd9e4a(nativeWriteImageToFileBuffer.this);
                AppMeasurementSdk.ConditionalUserProperty MediaSessionCompat$Token = nativeWriteImageToFileBuffer.this.MediaBrowserCompat$MediaItem;
                onInfoWindowLongClick write2 = nativeWriteImageToFileBuffer.this.MediaBrowserCompat$SearchResultReceiver.read.write();
                write2.MediaBrowserCompat$CustomActionResultReceiver = zzd.write;
                MediaSessionCompat$Token.read.MediaBrowserCompat$CustomActionResultReceiver(write2);
                String str3 = this.write.MediaBrowserCompat$ItemReceiver;
                if (removeIfFromRandomAccessList.MediaBrowserCompat$CustomActionResultReceiver(str3)) {
                    str = "MOB";
                } else {
                    str = removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str3) ? "CID" : "";
                }
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer4 = nativeWriteImageToFileBuffer.this;
                C4715h.C4723a aVar = new C4715h.C4723a(this, str);
                if (nativewriteimagetofilebuffer4.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    aVar.IconCompatParcelizer(nativewriteimagetofilebuffer4.RatingCompat);
                }
            }
        }

        public read(CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder) {
            this.write = builder;
        }

        public final void onError(Throwable th) {
            nativeWriteImageToFileBuffer.this.MediaBrowserCompat$ItemReceiver(nativeWriteImageToFileBuffer.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }

        static /* synthetic */ void IconCompatParcelizer(finalizePreviousNativeSession finalizepreviousnativesession, newCheckExtractor.IconCompatParcelizer iconCompatParcelizer) {
            String str;
            String str2 = finalizepreviousnativesession.write;
            if (str2 == null || str2.length() == 0) {
                str = finalizepreviousnativesession.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                str = finalizepreviousnativesession.write;
            }
            iconCompatParcelizer.IconCompatParcelizer(str);
        }
    }

    /* renamed from: o.nativeWriteImageToFileBuffer$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setBoundsBias> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = nativeWriteImageToFileBuffer.this;
            getTexelWidthUniform gettexelwidthuniform = new getTexelWidthUniform((setBoundsBias) obj);
            if (nativewriteimagetofilebuffer.RatingCompat != null) {
                gettexelwidthuniform.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            if (!nativeWriteImageToFileBuffer.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = nativeWriteImageToFileBuffer.this;
                GraySobelShader graySobelShader = GraySobelShader.read;
                if (nativewriteimagetofilebuffer.RatingCompat != null) {
                    graySobelShader.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
                }
            }
        }

        static /* synthetic */ void write(newCheckExtractor.IconCompatParcelizer iconCompatParcelizer) {
            iconCompatParcelizer.MediaBrowserCompat$MediaItem();
            iconCompatParcelizer.IconCompatParcelizer();
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setBoundsBias setboundsbias, newCheckExtractor.IconCompatParcelizer iconCompatParcelizer) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            iconCompatParcelizer.write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format((setboundsbias == null || setboundsbias.MediaBrowserCompat$MediaItem == null) ? 0.0d : setboundsbias.MediaBrowserCompat$MediaItem.doubleValue()));
            iconCompatParcelizer.IconCompatParcelizer();
        }
    }

    /* renamed from: o.nativeWriteImageToFileBuffer$write */
    class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<userNavigationEnabled> {
        private String MediaBrowserCompat$ItemReceiver;
        private String read;

        public final /* synthetic */ void onNext(Object obj) {
            userNavigationEnabled usernavigationenabled = (userNavigationEnabled) obj;
            nativeWriteImageToFileBuffer.MediaBrowserCompat$CustomActionResultReceiver(nativeWriteImageToFileBuffer.this);
            isCancelled read2 = nativeWriteImageToFileBuffer.this.f2899x50fd9e4a;
            CrashlyticsReport.Session.Event.Application.Execution PlaybackStateCompat = nativeWriteImageToFileBuffer.this.write;
            TouchPointInstructionActivity AppCompatActivity = nativeWriteImageToFileBuffer.this.IconCompatParcelizer.IconCompatParcelizer.AppCompatActivity();
            String str = nativeWriteImageToFileBuffer.this.write.setPopupCallback;
            String str2 = nativeWriteImageToFileBuffer.this.write.setGroupDividerEnabled;
            String str3 = nativeWriteImageToFileBuffer.this.write.ExpandedMenuView;
            StreetViewPanoramaFragment.zzb zzb = StreetViewPanoramaFragment.zzb.SCAN;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            String str5 = nativeWriteImageToFileBuffer.this.read.write;
            boolean itemInvoker = nativeWriteImageToFileBuffer.this.IconCompatParcelizer.IconCompatParcelizer.setItemInvoker();
            String str6 = this.read;
            userNavigationEnabled usernavigationenabled2 = usernavigationenabled;
            setUuidFromUtf8Bytes read3 = read2.read(usernavigationenabled, PlaybackStateCompat, AppCompatActivity, str, str2, str3, zzb, str4, str5, itemInvoker, str6, (getRamUsed) null, false, jsonFromMapEntryString.NORMAL);
            boolean z = false;
            if (usernavigationenabled2.AlertController$RecycleListView) {
                read3.MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(read3.write(), true));
                if (DiskLruCache.VERSION_1.equals(usernavigationenabled2.AppCompatDelegateImpl$ListMenuDecorView)) {
                    nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = nativeWriteImageToFileBuffer.this;
                    RgbGaussianBlur3x3Shader rgbGaussianBlur3x3Shader = new RgbGaussianBlur3x3Shader(read3);
                    if (nativewriteimagetofilebuffer.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        rgbGaussianBlur3x3Shader.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
                        return;
                    }
                    return;
                }
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer2 = nativeWriteImageToFileBuffer.this;
                GrayScaleAndGaussianBlur3x3Shader grayScaleAndGaussianBlur3x3Shader = new GrayScaleAndGaussianBlur3x3Shader(read3);
                if (nativewriteimagetofilebuffer2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    grayScaleAndGaussianBlur3x3Shader.IconCompatParcelizer(nativewriteimagetofilebuffer2.RatingCompat);
                    return;
                }
                return;
            }
            userNavigationEnabled usernavigationenabled3 = usernavigationenabled2;
            if (DiskLruCache.VERSION_1.equals(usernavigationenabled3.AppCompatDelegateImpl$ListMenuDecorView)) {
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer3 = nativeWriteImageToFileBuffer.this;
                LocalAdaptiveThresholdShader localAdaptiveThresholdShader = new LocalAdaptiveThresholdShader(this, read3);
                if (nativewriteimagetofilebuffer3.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    localAdaptiveThresholdShader.IconCompatParcelizer(nativewriteimagetofilebuffer3.RatingCompat);
                    return;
                }
                return;
            }
            nativeWriteImageToFileBuffer nativewriteimagetofilebuffer4 = nativeWriteImageToFileBuffer.this;
            RgbSobelShader rgbSobelShader = new RgbSobelShader(this, read3);
            if (nativewriteimagetofilebuffer4.RatingCompat != null) {
                z = true;
            }
            if (z) {
                rgbSobelShader.IconCompatParcelizer(nativewriteimagetofilebuffer4.RatingCompat);
            }
        }

        public write(String str, String str2) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.read = str2;
        }

        public final void onError(Throwable th) {
            String str;
            if (writeUInt64NoTag.MediaBrowserCompat$ItemReceiver(th)) {
                nativeWriteImageToFileBuffer.write(nativeWriteImageToFileBuffer.this);
                nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = nativeWriteImageToFileBuffer.this;
                getSecondPassTexelWidthUniform getsecondpasstexelwidthuniform = getSecondPassTexelWidthUniform.MediaBrowserCompat$ItemReceiver;
                if (nativewriteimagetofilebuffer.RatingCompat != null) {
                    getsecondpasstexelwidthuniform.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
                }
            } else if (th instanceof RetrofitException) {
                RetrofitException retrofitException = (RetrofitException) th;
                if (retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null) {
                    str = "";
                } else {
                    str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
                }
                if ("3023".equalsIgnoreCase(str)) {
                    nativeWriteImageToFileBuffer.this.MediaBrowserCompat$ItemReceiver(nativeWriteImageToFileBuffer.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new getTexelHeightUniform(this)));
                } else {
                    nativeWriteImageToFileBuffer.this.MediaBrowserCompat$ItemReceiver(nativeWriteImageToFileBuffer.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            } else {
                nativeWriteImageToFileBuffer.this.MediaBrowserCompat$ItemReceiver(nativeWriteImageToFileBuffer.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$MediaItem.read.setGroupDividerEnabled();
    }

    static /* synthetic */ void write(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer) {
        if (nativewriteimagetofilebuffer.RatingCompat != null) {
            nativewriteimagetofilebuffer.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer) {
        if (nativewriteimagetofilebuffer.RatingCompat != null) {
            nativewriteimagetofilebuffer.RatingCompat.aj_();
        }
    }

    static /* synthetic */ String MediaMetadataCompat(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer) {
        return nativewriteimagetofilebuffer.MediaMetadataCompat ? "deeplink" : "scan";
    }

    static /* synthetic */ void RatingCompat(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer) {
        if (nativewriteimagetofilebuffer.RatingCompat != null) {
            nativewriteimagetofilebuffer.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer) {
        if (nativewriteimagetofilebuffer.RatingCompat != null) {
            nativewriteimagetofilebuffer.RatingCompat.aj_();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    static /* synthetic */ void m3150x50fd9e4a(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer) {
        if (nativewriteimagetofilebuffer.RatingCompat != null) {
            nativewriteimagetofilebuffer.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper(nativeWriteImageToFileBuffer nativewriteimagetofilebuffer) {
        if (nativewriteimagetofilebuffer.RatingCompat != null) {
            nativewriteimagetofilebuffer.RatingCompat.aj_();
        }
    }

    public final void write(double d, String str) {
        boolean z = false;
        if (Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(str).matches() || TextUtils.isEmpty(str)) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            String str2 = this.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver;
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 2066624938) {
                if (hashCode == 2066625372 && str2.equals("FASTPP")) {
                    c = 0;
                }
            } else if (str2.equals("FASTBP")) {
                c = 1;
            }
            String str3 = null;
            String str4 = "";
            if (c == 0) {
                Interner interner = new Interner();
                interner.MediaDescriptionCompat = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(IGoogleMapDelegate.PROMPTPAY);
                interner.MediaBrowserCompat$ItemReceiver = this.read.write;
                String str5 = this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
                if (removeIfFromRandomAccessList.MediaBrowserCompat$CustomActionResultReceiver(str5)) {
                    str4 = "MOB";
                } else if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(str5)) {
                    str4 = "CID";
                }
                interner.RatingCompat = str4;
                interner.MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
                interner.read = removeIfFromRandomAccessList.read(d);
                interner.MediaBrowserCompat$SearchResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$MediaItem;
                if (str == null || str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    str3 = str;
                }
                interner.write.MediaBrowserCompat$ItemReceiver = str3;
                this.MediaBrowserCompat$ItemReceiver.write(interner);
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver(this, interner, str));
            } else if (c == 1) {
                putInstance IconCompatParcelizer2 = putInstance.IconCompatParcelizer();
                IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = this.read.write;
                IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$SearchResultReceiver;
                IconCompatParcelizer2.IconCompatParcelizer = removeIfFromRandomAccessList.read(d);
                String str6 = this.write.setPopupCallback;
                if (str6 == null) {
                    str6 = str4;
                }
                IconCompatParcelizer2.MediaSessionCompat$Token = str6;
                String str7 = this.write.setGroupDividerEnabled;
                if (str7 != null) {
                    str4 = str7;
                }
                IconCompatParcelizer2.f2924x50fd9e4a = str4;
                IconCompatParcelizer2.AlertController$RecycleListView = this.write.ExpandedMenuView;
                IconCompatParcelizer2.Keep = this.write.ListMenuItemView;
                if (str == null || str.length() == 0) {
                    z = true;
                }
                if (!z) {
                    str3 = str;
                }
                IconCompatParcelizer2.write.MediaBrowserCompat$ItemReceiver = str3;
                this.MediaBrowserCompat$ItemReceiver.write(IconCompatParcelizer2);
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new write(IconCompatParcelizer2.IconCompatParcelizer, str));
            }
        } else {
            nativeReadImageFromFileBuffer nativereadimagefromfilebuffer = nativeReadImageFromFileBuffer.write;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nativereadimagefromfilebuffer.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }
}
