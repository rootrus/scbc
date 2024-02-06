package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Onboarding;
import p040o.zzbt;

/* renamed from: o.calculate */
public class calculate extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.setBackgroundResource> {
    public final onPreviewFrame IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final nullsFirst MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public MutableClassToInstanceMap read;

    @HmlPinActivity
    public calculate(RegularImmutableBiMap regularImmutableBiMap, onPreviewFrame onpreviewframe, MutableClassToInstanceMap mutableClassToInstanceMap, nullsFirst nullsfirst) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = onpreviewframe;
        this.read = mutableClassToInstanceMap;
        this.MediaBrowserCompat$ItemReceiver = nullsfirst;
    }

    /* renamed from: o.calculate$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzbt.zzb.zza> {
        private write() {
        }

        public /* synthetic */ write(calculate calculate, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzbt.zzb.zza zza = (zzbt.zzb.zza) obj;
            calculate.IconCompatParcelizer(calculate.this);
            boolean z = false;
            getLegacySharedPrefs MediaBrowserCompat$CustomActionResultReceiver = zza.IconCompatParcelizer != null ? calculate.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza.IconCompatParcelizer, 0) : null;
            Onboarding.C37171 IconCompatParcelizer = calculate.this.read.IconCompatParcelizer(zza);
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                calculate calculate = calculate.this;
                C4054b bVar = new C4054b(MediaBrowserCompat$CustomActionResultReceiver, IconCompatParcelizer);
                if (calculate.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    bVar.IconCompatParcelizer(calculate.RatingCompat);
                    return;
                }
                return;
            }
            calculate calculate2 = calculate.this;
            BarCodeReader barCodeReader = BarCodeReader.MediaBrowserCompat$ItemReceiver;
            if (calculate2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                barCodeReader.IconCompatParcelizer(calculate2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            calculate calculate = calculate.this;
            addBarcodeReadCompleteEventListener addbarcodereadcompleteeventlistener = new addBarcodeReadCompleteEventListener(th);
            if (calculate.RatingCompat != null) {
                addbarcodereadcompleteeventlistener.IconCompatParcelizer(calculate.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(calculate calculate) {
        if (calculate.RatingCompat != null) {
            calculate.RatingCompat.aj_();
        }
    }
}
