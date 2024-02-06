package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.ntb.selectaccount.EkycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver;
import p040o.CrashlyticsReport;
import p040o.Splitter;
import p040o.access$2300;
import p040o.getCarbonStrip;

/* renamed from: o.jY */
public class C4863jY extends writeUInt64NoTag<getCarbonStrip.read> {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public final Splitter.C38135 MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final fromLenient MediaMetadataCompat;
    public double read = 0.0d;
    public CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder write;

    @HmlPinActivity
    public C4863jY(RegularImmutableBiMap regularImmutableBiMap, Splitter.C38135 r4, fromLenient fromlenient) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$SearchResultReceiver = r4;
        this.MediaMetadataCompat = fromlenient;
    }

    /* renamed from: o.jY$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<EkycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver> {
        private double IconCompatParcelizer;
        private String read;

        public final /* synthetic */ void onNext(Object obj) {
            String str;
            EkycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver ekycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver = (EkycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver) obj;
            C4863jY jYVar = C4863jY.this;
            C10024jI jIVar = new C10024jI(this);
            boolean z = true;
            if (jYVar.RatingCompat != null) {
                jIVar.IconCompatParcelizer(jYVar.RatingCompat);
            }
            fromLenient MediaBrowserCompat$CustomActionResultReceiver2 = C4863jY.this.MediaMetadataCompat;
            String write = C4863jY.this.IconCompatParcelizer;
            String str2 = C4863jY.this.write.IconCompatParcelizer.write;
            String str3 = C4863jY.this.write.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
            String str4 = ekycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver.RatingCompat;
            String str5 = C4863jY.this.write.IconCompatParcelizer.RatingCompat;
            String str6 = C4863jY.this.write.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
            double d = this.IconCompatParcelizer;
            String str7 = this.read;
            setUuidFromUtf8Bytes MediaMetadataCompat = setUuidFromUtf8Bytes.RatingCompat().read(ekycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver).MediaMetadataCompat("PURCHASE_CREDIT_CARD_FUNCTION");
            MediaMetadataCompat.setGroupDividerEnabled = Uri.parse(MediaBrowserCompat$CustomActionResultReceiver2.mo26549c_(ekycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver.write));
            setUuidFromUtf8Bytes write2 = MediaMetadataCompat.write(ekycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            write2.ListMenuItemView = write;
            setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver3 = write2.MediaBrowserCompat$ItemReceiver(write).MediaBrowserCompat$CustomActionResultReceiver(str3);
            MediaBrowserCompat$CustomActionResultReceiver3.AlertController$RecycleListView = str4;
            MediaBrowserCompat$CustomActionResultReceiver3.AppCompatActivity = Uri.parse(str2);
            if (str6 == null || str6.isEmpty()) {
                str = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str5);
                sb.append(" ");
                sb.append(str6);
                str = sb.toString();
            }
            MediaBrowserCompat$CustomActionResultReceiver3.setTitleOptional = str;
            CrashlyticsReport.Session.Application.read read2 = new CrashlyticsReport.Session.Application.read();
            read2.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
            MediaBrowserCompat$CustomActionResultReceiver3.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read2, (byte) 0);
            setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$MediaItem(ekycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver.read);
            MediaBrowserCompat$MediaItem.setOnMenuItemClickListener = str7;
            if (ekycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) {
                C4863jY jYVar2 = C4863jY.this;
                C10028jv jvVar = new C10028jv(ekycProductTermConditionFragment$MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$MediaItem);
                if (jYVar2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    jvVar.IconCompatParcelizer(jYVar2.RatingCompat);
                    return;
                }
                return;
            }
            C4863jY jYVar3 = C4863jY.this;
            C10025jJ jJVar = new C10025jJ(MediaBrowserCompat$MediaItem);
            if (jYVar3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                jJVar.IconCompatParcelizer(jYVar3.RatingCompat);
            }
        }

        public read(double d, String str) {
            this.IconCompatParcelizer = d;
            this.read = str;
        }

        public final void onError(Throwable th) {
            C4863jY.IconCompatParcelizer(C4863jY.this);
            C4863jY jYVar = C4863jY.this;
            jYVar.MediaBrowserCompat$ItemReceiver(jYVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4863jY jYVar) {
        if (jYVar.RatingCompat != null) {
            jYVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4863jY jYVar) {
        if (jYVar.RatingCompat != null) {
            jYVar.RatingCompat.aj_();
        }
    }
}
