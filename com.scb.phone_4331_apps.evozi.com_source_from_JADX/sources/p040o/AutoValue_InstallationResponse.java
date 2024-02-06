package p040o;

import p040o.access$2300;
import p040o.proxyGetICheckDeserializerRtti;

/* renamed from: o.AutoValue_InstallationResponse */
public class AutoValue_InstallationResponse extends writeUInt64NoTag<proxyGetICheckDeserializerRtti.MediaDescriptionCompat> {
    /* access modifiers changed from: package-private */
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver = false;
    boolean MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: package-private */
    public int MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final fromProperties MediaMetadataCompat;
    public String read;
    public final MapStyleOptions write;

    @HmlPinActivity
    public AutoValue_InstallationResponse(RegularImmutableBiMap regularImmutableBiMap, MapStyleOptions mapStyleOptions, fromProperties fromproperties) {
        super(regularImmutableBiMap);
        this.write = mapStyleOptions;
        this.MediaMetadataCompat = fromproperties;
    }

    /* renamed from: o.AutoValue_InstallationResponse$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver> {
        private write() {
        }

        /* synthetic */ write(AutoValue_InstallationResponse autoValue_InstallationResponse, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver = (LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver) obj;
            AutoValue_InstallationResponse.this.read = lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            AutoValue_InstallationResponse.this.IconCompatParcelizer = lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver.write;
            AutoValue_InstallationResponse.this.MediaBrowserCompat$SearchResultReceiver = lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
            boolean z = false;
            AutoValue_InstallationResponse.this.MediaBrowserCompat$ItemReceiver = false;
            if (AutoValue_InstallationResponse.this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                AutoValue_InstallationResponse.MediaBrowserCompat$CustomActionResultReceiver(AutoValue_InstallationResponse.this);
                AutoValue_InstallationResponse autoValue_InstallationResponse = AutoValue_InstallationResponse.this;
                AutoValue_InstallationResponse.read(autoValue_InstallationResponse, autoValue_InstallationResponse.MediaMetadataCompat.read(lifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver, AutoValue_InstallationResponse.this.write.read.setItemInvoker()));
            }
        }

        public final void onError(Throwable th) {
            AutoValue_InstallationResponse autoValue_InstallationResponse = AutoValue_InstallationResponse.this;
            autoValue_InstallationResponse.MediaBrowserCompat$ItemReceiver(autoValue_InstallationResponse.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    /* renamed from: o.AutoValue_InstallationResponse$Builder */
    public final /* synthetic */ class Builder implements Runnable {
        private final /* synthetic */ logBadConfigError$MediaBrowserCompat$CustomActionResultReceiver write;

        public /* synthetic */ Builder(logBadConfigError$MediaBrowserCompat$CustomActionResultReceiver logbadconfigerror_mediabrowsercompat_customactionresultreceiver) {
            this.write = logbadconfigerror_mediabrowsercompat_customactionresultreceiver;
        }

        public final void run() {
            logBadConfigError logbadconfigerror = this.write.MediaBrowserCompat$CustomActionResultReceiver;
            buildGenerateAuthTokenRequestBody buildgenerateauthtokenrequestbody = buildGenerateAuthTokenRequestBody.read;
            if (logbadconfigerror.RatingCompat != null) {
                buildgenerateauthtokenrequestbody.IconCompatParcelizer(logbadconfigerror.RatingCompat);
            }
        }
    }

    static /* synthetic */ void read(AutoValue_InstallationResponse autoValue_InstallationResponse, findInterruptibleMethods findinterruptiblemethods) {
        autoValue_InstallationResponse.MediaBrowserCompat$MediaItem = findinterruptiblemethods.read;
        getExpiresInSecs getexpiresinsecs = new getExpiresInSecs(findinterruptiblemethods);
        boolean z = true;
        if (autoValue_InstallationResponse.RatingCompat != null) {
            getexpiresinsecs.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
        getAuthToken getauthtoken = new getAuthToken(findinterruptiblemethods);
        if (autoValue_InstallationResponse.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getauthtoken.IconCompatParcelizer(autoValue_InstallationResponse.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(AutoValue_InstallationResponse autoValue_InstallationResponse) {
        if (autoValue_InstallationResponse.RatingCompat != null) {
            autoValue_InstallationResponse.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(AutoValue_InstallationResponse autoValue_InstallationResponse) {
        if (autoValue_InstallationResponse.RatingCompat != null) {
            autoValue_InstallationResponse.RatingCompat.aj_();
        }
    }

    static /* synthetic */ String write(AutoValue_InstallationResponse autoValue_InstallationResponse) {
        String str = autoValue_InstallationResponse.IconCompatParcelizer;
        return str == null ? "" : str;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_InstallationResponse autoValue_InstallationResponse) {
        if (autoValue_InstallationResponse.RatingCompat != null) {
            autoValue_InstallationResponse.RatingCompat.aj_();
        }
    }

    public final void read(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        MapStyleOptions mapStyleOptions = this.write;
        String str2 = this.read;
        if (str2 == null) {
            str2 = "";
        }
        mapStyleOptions.MediaBrowserCompat$CustomActionResultReceiver(str2, str);
        this.write.IconCompatParcelizer(new write(this, (byte) 0));
    }
}
