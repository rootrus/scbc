package p040o;

import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.StyleSpan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import p040o.C7039x355e6121;
import p040o.CrashlyticsReport;
import p040o.RttiJsonCheck;
import p040o.segmentFor;

/* renamed from: o.DefaultHeartBeatInfo */
public class DefaultHeartBeatInfo extends writeUInt64NoTag<RttiJsonCheck.C7042b> {
    public final TileOverlay IconCompatParcelizer;
    public Service MediaBrowserCompat$ItemReceiver;
    public C7039x355e6121.read MediaBrowserCompat$MediaItem;
    public List<getContents> MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final getEnabledCipherSuites MediaDescriptionCompat;
    public int MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final setKeyStrength MediaSessionCompat$ResultReceiverWrapper;
    private final getChannel MediaSessionCompat$Token;
    private final onProviderInstallFailed ParcelableVolumeInfo;
    public final addHandshakeCompletedListener read;
    public final asWriter write;

    @HmlPinActivity
    public DefaultHeartBeatInfo(RegularImmutableBiMap regularImmutableBiMap, addHandshakeCompletedListener addhandshakecompletedlistener, setKeyStrength setkeystrength, getChannel getchannel, getEnabledCipherSuites getenabledciphersuites, TileOverlay tileOverlay, asWriter aswriter, onProviderInstallFailed onproviderinstallfailed) {
        super(regularImmutableBiMap);
        this.read = addhandshakecompletedlistener;
        this.MediaSessionCompat$ResultReceiverWrapper = setkeystrength;
        this.MediaSessionCompat$Token = getchannel;
        this.MediaDescriptionCompat = getenabledciphersuites;
        this.IconCompatParcelizer = tileOverlay;
        this.write = aswriter;
        this.ParcelableVolumeInfo = onproviderinstallfailed;
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$ItemReceiver() {
        boolean z = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver > 0.0d && this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver >= this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat && this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo != null && this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver.doubleValue() >= this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.MediaBrowserCompat$MediaItem != C7039x355e6121.read.DLT) {
            return z;
        }
        if (!z || this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat == null) {
            return false;
        }
        return true;
    }

    public final void write() {
        if (this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper != null) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            if (C7039x355e6121.read.SCB == this.MediaBrowserCompat$MediaItem) {
                getChannel getchannel = this.MediaSessionCompat$Token;
                segmentFor.write read2 = segmentFor.read();
                read2.IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo.MediaSessionCompat$Token;
                read2.MediaBrowserCompat$CustomActionResultReceiver = String.valueOf(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                read2.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$SearchResultReceiver;
                read2.read = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
                getchannel.IconCompatParcelizer(new segmentFor(read2, (byte) 0));
            } else {
                getChannel getchannel2 = this.MediaSessionCompat$Token;
                segmentFor.write read3 = segmentFor.read();
                read3.IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo.MediaSessionCompat$Token;
                double d = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
                decimalFormatSymbols.setDecimalSeparator('.');
                read3.MediaBrowserCompat$CustomActionResultReceiver = new DecimalFormat("#################0.00", decimalFormatSymbols).format(d);
                read3.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$SearchResultReceiver;
                read3.read = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token;
                read3.write = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.write;
                getchannel2.read(new segmentFor(read3, (byte) 0));
            }
            this.MediaSessionCompat$Token.IconCompatParcelizer(new IconCompatParcelizer(this, (byte) 0));
        }
    }

    public static SpannableString IconCompatParcelizer(String str, String str2) {
        String format = String.format("%s%n%s", new Object[]{str, str2});
        int length = str.length();
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new StyleSpan(1), length + 1, format.length(), 0);
        spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, format.length(), 33);
        return spannableString;
    }

    public static InputFilter[] MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return new InputFilter[]{new InputFilter.LengthFilter(i)};
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper = null;
        getChannel getchannel = this.MediaSessionCompat$Token;
        if (!getchannel.MediaBrowserCompat$MediaItem.isDisposed()) {
            getchannel.MediaBrowserCompat$MediaItem.dispose();
        }
        TileOverlay tileOverlay = this.IconCompatParcelizer;
        if (!tileOverlay.MediaBrowserCompat$MediaItem.isDisposed()) {
            tileOverlay.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.DefaultHeartBeatInfo$IconCompatParcelizer */
    class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzxk> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(DefaultHeartBeatInfo defaultHeartBeatInfo, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            DefaultHeartBeatInfo.MediaBrowserCompat$CustomActionResultReceiver(DefaultHeartBeatInfo.this);
            DefaultHeartBeatInfo.this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((zzxk) obj);
            DefaultHeartBeatInfo defaultHeartBeatInfo = DefaultHeartBeatInfo.this;
            lambda$getComponents$0 lambda_getcomponents_0 = new lambda$getComponents$0(this);
            if (defaultHeartBeatInfo.RatingCompat != null) {
                lambda_getcomponents_0.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            DefaultHeartBeatInfo defaultHeartBeatInfo = DefaultHeartBeatInfo.this;
            TransportRegistrar$$Lambda$1 transportRegistrar$$Lambda$1 = new TransportRegistrar$$Lambda$1(this, th);
            if (defaultHeartBeatInfo.RatingCompat != null) {
                transportRegistrar$$Lambda$1.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        if (defaultHeartBeatInfo.RatingCompat != null) {
            defaultHeartBeatInfo.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        if (defaultHeartBeatInfo.RatingCompat != null) {
            defaultHeartBeatInfo.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        if (defaultHeartBeatInfo.RatingCompat != null) {
            defaultHeartBeatInfo.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(DefaultHeartBeatInfo defaultHeartBeatInfo) {
        if (defaultHeartBeatInfo.RatingCompat != null) {
            defaultHeartBeatInfo.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(Service service, RttiJsonCheck.C7042b bVar) {
        bVar.MediaBrowserCompat$ItemReceiver(service.MediaBrowserCompat$MediaItem);
        CrashlyticsReport.FilesPayload.File.write write2 = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.BOND_FUNCTION);
        write2.MediaBrowserCompat$ItemReceiver = false;
        write2.IconCompatParcelizer = true;
        write2.MediaDescriptionCompat = true;
        write2.RatingCompat = true;
        write2.RatingCompat = false;
        write2.MediaDescriptionCompat = false;
        write2.IconCompatParcelizer = false;
        bVar.read(new CrashlyticsReport.FilesPayload.File(write2, (byte) 0));
        bVar.IconCompatParcelizer(false);
        bVar.mo36012x50fd9e4a("0");
        bVar.write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(0.0d));
        bVar.MediaDescriptionCompat(service.RatingCompat);
        bVar.read(service.read);
        bVar.mo36017b_(false);
    }

    public final void IconCompatParcelizer(String str) {
        if (str != null && !str.equals("")) {
            str = str.replace("-", "");
        }
        boolean z = true;
        if (str.length() < 10) {
            this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = null;
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = false;
            Encoder encoder = new Encoder(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                encoder.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (this.ParcelableVolumeInfo.read(str)) {
            this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = asWriter.MediaBrowserCompat$CustomActionResultReceiver(str, true);
            trimRepeats trimrepeats = new trimRepeats(this, str);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                trimrepeats.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = null;
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = false;
            TrimmedThrowableData trimmedThrowableData = new TrimmedThrowableData(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                trimmedThrowableData.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }
}
