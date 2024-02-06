package p040o;

import android.text.TextUtils;
import p040o.AppMeasurementSdk;
import p040o.BillCaptureModule;
import p040o.ExecutionList;
import p040o.Synchronized;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;
import p040o.zzag;
import p040o.zzmd;

/* renamed from: o.IBillExtractorListener */
public class IBillExtractorListener extends writeUInt64NoTag<getTopLeftCornerWidth.setIcon> {
    public final zzag.zzb IconCompatParcelizer;
    public onInfoWindowLongClick MediaBrowserCompat$ItemReceiver;
    public getShortName MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public IGoogleMapDelegate f3156x50fd9e4a;
    /* access modifiers changed from: package-private */
    public setUuidFromUtf8Bytes MediaDescriptionCompat;
    public parseSession MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedSet MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public final ExecutionList.RunnableExecutorPair MediaSessionCompat$ResultReceiverWrapper;
    private countIn MediaSessionCompat$Token;
    public final AppMeasurementSdk.OnEventListener ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public final callWithTimeout PlaybackStateCompat$CustomAction;
    public boolean read;
    public boolean write = false;

    @HmlPinActivity
    public IBillExtractorListener(RegularImmutableBiMap regularImmutableBiMap, AppMeasurementSdk.OnEventListener onEventListener, ExecutionList.RunnableExecutorPair runnableExecutorPair, callWithTimeout callwithtimeout, Synchronized.SynchronizedSet synchronizedSet, countIn countin) {
        super(regularImmutableBiMap);
        this.ParcelableVolumeInfo = onEventListener;
        this.MediaSessionCompat$ResultReceiverWrapper = runnableExecutorPair;
        this.PlaybackStateCompat$CustomAction = callwithtimeout;
        this.MediaBrowserCompat$ItemReceiver = onEventListener.read.write();
        this.IconCompatParcelizer = onEventListener.IconCompatParcelizer.AlertController$RecycleListView();
        this.MediaSessionCompat$QueueItem = synchronizedSet;
        this.MediaSessionCompat$Token = countin;
    }

    public static boolean read(String str) {
        return str != null && !TextUtils.isEmpty(str) && !getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(str);
    }

    public static boolean MediaBrowserCompat$ItemReceiver(String str) {
        return str != null && !TextUtils.isEmpty(str);
    }

    /* renamed from: o.IBillExtractorListener$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setBoundsBias> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(IBillExtractorListener iBillExtractorListener, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean z = false;
            IBillExtractorListener.this.write = false;
            IBillExtractorListener iBillExtractorListener = IBillExtractorListener.this;
            getUriRtti geturirtti = new getUriRtti(this, (setBoundsBias) obj);
            if (iBillExtractorListener.RatingCompat != null) {
                z = true;
            }
            if (z) {
                geturirtti.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            boolean z = true;
            if ((IBillExtractorListener.this.RatingCompat != null) && !IBillExtractorListener.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                IBillExtractorListener iBillExtractorListener = IBillExtractorListener.this;
                BillCaptureModule.C6334a aVar = BillCaptureModule.C6334a.read;
                if (iBillExtractorListener.RatingCompat != null) {
                    aVar.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
                }
                IBillExtractorListener iBillExtractorListener2 = IBillExtractorListener.this;
                BillCaptureModule.RttiExceptionResponseDeserializer rttiExceptionResponseDeserializer = BillCaptureModule.RttiExceptionResponseDeserializer.write;
                if (iBillExtractorListener2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    rttiExceptionResponseDeserializer.IconCompatParcelizer(iBillExtractorListener2.RatingCompat);
                }
            }
        }
    }

    /* renamed from: o.IBillExtractorListener$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<animateCameraWithDurationAndCallback> {
        private final Interner IconCompatParcelizer;
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        private final animateCameraWithCallback MediaBrowserCompat$ItemReceiver;
        private final String write;

        public final /* synthetic */ void onNext(Object obj) {
            String str;
            animateCameraWithDurationAndCallback animatecamerawithdurationandcallback = (animateCameraWithDurationAndCallback) obj;
            boolean z = false;
            IBillExtractorListener.this.write = false;
            if (IBillExtractorListener.this.RatingCompat != null) {
                if (IBillExtractorListener.this.MediaBrowserCompat$ItemReceiver != null) {
                    str = IBillExtractorListener.this.MediaBrowserCompat$ItemReceiver.AppCompatDialogFragment;
                } else {
                    str = null;
                }
                IBillExtractorListener iBillExtractorListener = IBillExtractorListener.this;
                setUuidFromUtf8Bytes unused = iBillExtractorListener.MediaDescriptionCompat = iBillExtractorListener.PlaybackStateCompat$CustomAction.write(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, animatecamerawithdurationandcallback, this.write, str, IBillExtractorListener.this.ParcelableVolumeInfo.IconCompatParcelizer.setItemInvoker(), this.MediaBrowserCompat$CustomActionResultReceiver);
                boolean unused2 = IBillExtractorListener.this.read = false;
                if (animatecamerawithdurationandcallback.MediaBrowserCompat$SearchResultReceiver) {
                    IBillExtractorListener iBillExtractorListener2 = IBillExtractorListener.this;
                    BillCaptureModule_GetExtractionParametersFactory billCaptureModule_GetExtractionParametersFactory = new BillCaptureModule_GetExtractionParametersFactory(this, animatecamerawithdurationandcallback);
                    if (iBillExtractorListener2.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        billCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer(iBillExtractorListener2.RatingCompat);
                        return;
                    }
                    return;
                }
                IBillExtractorListener iBillExtractorListener3 = IBillExtractorListener.this;
                proxyGetIExceptionResponseDeserializerKta proxygetiexceptionresponsedeserializerkta = new proxyGetIExceptionResponseDeserializerKta(iBillExtractorListener3);
                if (iBillExtractorListener3.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    proxygetiexceptionresponsedeserializerkta.IconCompatParcelizer(iBillExtractorListener3.RatingCompat);
                }
            }
        }

        public read(animateCameraWithCallback animatecamerawithcallback, Interner interner, String str, String str2) {
            this.MediaBrowserCompat$ItemReceiver = animatecamerawithcallback;
            this.write = str;
            this.IconCompatParcelizer = interner;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }

        public final void onError(Throwable th) {
            boolean unused = IBillExtractorListener.this.read = false;
            IBillExtractorListener.this.MediaBrowserCompat$ItemReceiver(IBillExtractorListener.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final void write(zzmd.zzm.zzb.zza zza) {
        boolean z;
        boolean z2 = false;
        if (this.MediaSessionCompat$Token.read.write() == null || this.MediaSessionCompat$Token.read.write().MediaSessionCompat$ResultReceiverWrapper == null) {
            z = false;
        } else {
            z = this.MediaSessionCompat$Token.read.write().MediaSessionCompat$ResultReceiverWrapper.RatingCompat;
        }
        if (!z || zzmd.zzm.zzb.zza.JURISTIC.equals(zza)) {
            getIParameters getiparameters = getIParameters.read;
            if (this.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                getiparameters.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        parseSession parsesession = this.MediaMetadataCompat;
        if (parsesession instanceof eventToJson) {
            eventToJson eventtojson = (eventToJson) parsesession;
            if (!"014".equals(eventtojson.MediaBrowserCompat$ItemReceiver) || "OWN".equalsIgnoreCase(eventtojson.RatingCompat.toString())) {
                getIParameters getiparameters2 = getIParameters.read;
                if (this.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    getiparameters2.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
    }
}
