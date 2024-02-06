package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzjx;

/* renamed from: o.getDisplayValue */
public final class getDisplayValue extends writeUInt64NoTag<PassportCaptureModule_KtaExceptionResponseDeserializer_Factory> {
    public final setSelectedTabIndicatorHeight IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final powerSet MediaBrowserCompat$ItemReceiver;
    public zzjx.zzb.zza read;
    public final setTabIndicatorFullWidth write;

    /* renamed from: o.getDisplayValue$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_KtaExceptionResponseDeserializer_Factory> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_KtaExceptionResponseDeserializer_Factory) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.getDisplayValue$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_KtaExceptionResponseDeserializer_Factory> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_KtaExceptionResponseDeserializer_Factory) obj).read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getDisplayValue(RegularImmutableBiMap regularImmutableBiMap, setTabIndicatorFullWidth settabindicatorfullwidth, setSelectedTabIndicatorHeight setselectedtabindicatorheight, powerSet powerset) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) settabindicatorfullwidth, "hmlGetPromptPayVerificationStage");
        onGetStartedClick.write((Object) setselectedtabindicatorheight, "hmlSendPromptPayCode");
        onGetStartedClick.write((Object) powerset, "hmlPromptPayVerificationDisplayMapper");
        this.write = settabindicatorfullwidth;
        this.IconCompatParcelizer = setselectedtabindicatorheight;
        this.MediaBrowserCompat$ItemReceiver = powerset;
    }

    /* renamed from: o.getDisplayValue$write */
    public static final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzjx.zzb> {
        final /* synthetic */ getDisplayValue write;

        public write(getDisplayValue getdisplayvalue) {
            this.write = getdisplayvalue;
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzjx.zzb zzb = (zzjx.zzb) obj;
            onGetStartedClick.write((Object) zzb, "stage");
            super.onNext(zzb);
            this.write.read = zzb.MediaBrowserCompat$ItemReceiver;
            getDisplayValue getdisplayvalue = this.write;
            writeUInt64NoTag.IconCompatParcelizer getdisplayvalue_write_mediabrowsercompat_customactionresultreceiver = new C4551xb0aceb4d(this, zzb);
            if (getdisplayvalue.RatingCompat != null) {
                getdisplayvalue_write_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getdisplayvalue.RatingCompat);
            }
            getDisplayValue.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            super.onError(th);
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getDisplayValue getdisplayvalue) {
        if (getdisplayvalue.RatingCompat != null) {
            getdisplayvalue.RatingCompat.aj_();
        }
    }
}
