package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.Maps;
import p040o.writeUInt64NoTag;
import p040o.zzfy;

/* renamed from: o.FirebaseVisionText */
public final /* synthetic */ class FirebaseVisionText implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C9880x49974ce MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable read;

    /* renamed from: o.FirebaseVisionText$TextBase */
    public final /* synthetic */ class TextBase implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ TextBase(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getCountry) obj).write();
        }
    }

    /* renamed from: o.FirebaseVisionText$TextBlock */
    public final /* synthetic */ class TextBlock implements Runnable {
        private final /* synthetic */ getAddress4 read;

        public /* synthetic */ TextBlock(getAddress4 getaddress4) {
            this.read = getaddress4;
        }

        public final void run() {
            this.read.mo13720K_();
        }
    }

    public /* synthetic */ FirebaseVisionText(C9880x49974ce checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver;
        this.read = th;
    }

    /* renamed from: o.FirebaseVisionText$Line */
    public final /* synthetic */ class Line implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ isPowerSaveMode MediaBrowserCompat$ItemReceiver;
        private final /* synthetic */ C9880x49974ce write;

        public /* synthetic */ Line(C9880x49974ce checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver, isPowerSaveMode ispowersavemode) {
            this.write = checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$ItemReceiver = ispowersavemode;
        }

        public final void IconCompatParcelizer(Object obj) {
            C9880x49974ce checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver = this.write;
            isPowerSaveMode ispowersavemode = this.MediaBrowserCompat$ItemReceiver;
            getExpirationDate getexpirationdate = (getExpirationDate) obj;
            transformEntry MediaBrowserCompat$SearchResultReceiver = checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver.read.IconCompatParcelizer;
            AnalyticsConnectorImpl MediaBrowserCompat$ItemReceiver2 = getexpirationdate.MediaBrowserCompat$ItemReceiver();
            boolean itemInvoker = checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker();
            AnalyticsConnectorImpl analyticsConnectorImpl = new AnalyticsConnectorImpl();
            analyticsConnectorImpl.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver;
            analyticsConnectorImpl.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver;
            analyticsConnectorImpl.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$SearchResultReceiver;
            analyticsConnectorImpl.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$MediaItem;
            analyticsConnectorImpl.RatingCompat = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$MediaItem, itemInvoker);
            analyticsConnectorImpl.MediaSessionCompat$ResultReceiverWrapper = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(ispowersavemode.MediaBrowserCompat$CustomActionResultReceiver);
            zzfy.zza zza = ispowersavemode.MediaBrowserCompat$ItemReceiver;
            analyticsConnectorImpl.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(zza.MediaBrowserCompat$CustomActionResultReceiver);
            analyticsConnectorImpl.write = MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.up_to_interest_rate, new Object[]{Integer.valueOf((int) zza.MediaBrowserCompat$ItemReceiver)}).concat("%");
            analyticsConnectorImpl.MediaDescriptionCompat = "";
            Maps.AbstractMapWrapper MediaBrowserCompat$MediaItem = checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver.read.write;
            String IconCompatParcelizer = MediaBrowserCompat$MediaItem.IconCompatParcelizer("dd MMM yyyy - HH:mm", OffsetDateTime.parse(ispowersavemode.write));
            getProjectId getprojectid = new getProjectId();
            StringBuilder sb = new StringBuilder();
            sb.append(MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ref_id_label));
            sb.append(" ");
            sb.append(ispowersavemode.IconCompatParcelizer);
            getprojectid.write = sb.toString();
            getprojectid.IconCompatParcelizer = IconCompatParcelizer;
            getexpirationdate.read(getprojectid, analyticsConnectorImpl);
        }
    }

    /* renamed from: o.FirebaseVisionText$Element */
    public final /* synthetic */ class Element implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ C9880x49974ce MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ Element(C9880x49974ce checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver, Throwable th) {
            this.MediaBrowserCompat$ItemReceiver = checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = th;
        }

        public final void IconCompatParcelizer(Object obj) {
            C9880x49974ce checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
            getExpirationDate getexpirationdate = (getExpirationDate) obj;
            getexpirationdate.write(checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, (Runnable) new DefaultUserAgentPublisher(getexpirationdate)));
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        C9880x49974ce checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        getExpirationDate getexpirationdate = (getExpirationDate) obj;
        getexpirationdate.write(checkcontentproviderauthority_mediabrowsercompat_customactionresultreceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, (Runnable) new DefaultUserAgentPublisher(getexpirationdate)));
    }
}
