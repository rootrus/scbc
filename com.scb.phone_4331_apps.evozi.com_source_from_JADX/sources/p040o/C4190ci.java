package p040o;

import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.Iterables;
import p040o.access$2300;

/* renamed from: o.ci */
public class C4190ci extends writeUInt64NoTag<injectOnDeviceExtractionServer> {
    public final Iterables.C352212 IconCompatParcelizer;
    public List<AutoValue_CrashlyticsReport_FilesPayload.C30601> MediaBrowserCompat$ItemReceiver;
    public final getConditionalUserPropertiesAs MediaBrowserCompat$MediaItem;
    public final setHelperTextColor MediaBrowserCompat$SearchResultReceiver;
    public final CharStreams MediaDescriptionCompat;
    public final setItemHorizontalPaddingResource read;
    public final setHelperTextTextAppearance write;

    @HmlPinActivity
    public C4190ci(RegularImmutableBiMap regularImmutableBiMap, getConditionalUserPropertiesAs getconditionaluserpropertiesas, setHelperTextColor sethelpertextcolor, setHelperTextTextAppearance sethelpertexttextappearance, setItemHorizontalPaddingResource setitemhorizontalpaddingresource, CharStreams charStreams, Iterables.C352212 r7) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$MediaItem = getconditionaluserpropertiesas;
        this.MediaBrowserCompat$SearchResultReceiver = sethelpertextcolor;
        this.write = sethelpertexttextappearance;
        this.read = setitemhorizontalpaddingresource;
        this.MediaDescriptionCompat = charStreams;
        this.IconCompatParcelizer = r7;
    }

    /* renamed from: o.ci$5 */
    public static /* synthetic */ class C41915 {
        public static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.tO[] r0 = p040o.C7505tO.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.tO r1 = p040o.C7505tO.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.tO r1 = p040o.C7505tO.ONBOARDING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.tO r1 = p040o.C7505tO.BUSINESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.tO r1 = p040o.C7505tO.INDUSTRY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C4190ci.C41915.<clinit>():void");
        }
    }

    /* renamed from: o.ci$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<PrepaidResetOtpActivity.write>> {
        public read() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            C4190ci.MediaBrowserCompat$CustomActionResultReceiver(C4190ci.this);
            C4190ci ciVar = C4190ci.this;
            List unused = ciVar.MediaBrowserCompat$ItemReceiver = ciVar.MediaDescriptionCompat.read(list);
            C4190ci ciVar2 = C4190ci.this;
            C4085bZ bZVar = new C4085bZ(this, list);
            if (ciVar2.RatingCompat != null) {
                bZVar.IconCompatParcelizer(ciVar2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C4190ci.this.MediaBrowserCompat$ItemReceiver(C4190ci.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4190ci ciVar) {
        if (ciVar.RatingCompat != null) {
            ciVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4190ci ciVar) {
        if (ciVar.RatingCompat != null) {
            ciVar.RatingCompat.aj_();
        }
    }
}
