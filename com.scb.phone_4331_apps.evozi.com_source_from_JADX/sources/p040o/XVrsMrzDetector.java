package p040o;

import android.content.SharedPreferences;
import java.util.ArrayList;
import p040o.Multimaps;
import p040o.access$2300;

/* renamed from: o.XVrsMrzDetector */
public class XVrsMrzDetector extends writeUInt64NoTag<CheckCaptureModule_GetUriRttiFactory> {
    public final snippet IconCompatParcelizer;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$ItemReceiver = false;
    private String MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public SharedPreferences MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public final Multimaps.CustomSetMultimap read;
    /* access modifiers changed from: private */
    public final newLoader write;

    @HmlPinActivity
    public XVrsMrzDetector(snippet snippet, newLoader newloader, Multimaps.CustomSetMultimap customSetMultimap, RegularImmutableBiMap regularImmutableBiMap, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = snippet;
        this.write = newloader;
        this.read = customSetMultimap;
        this.MediaDescriptionCompat = sharedPreferences;
        this.MediaBrowserCompat$SearchResultReceiver = str;
    }

    public final void read(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        this.IconCompatParcelizer.write();
        this.IconCompatParcelizer.IconCompatParcelizer(new XVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
    }

    /* renamed from: o.XVrsMrzDetector$IconCompatParcelizer */
    final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private boolean MediaBrowserCompat$CustomActionResultReceiver = false;

        public final void onComplete() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            Boolean bool = (Boolean) obj;
            boolean z = true;
            if ((XVrsMrzDetector.this.RatingCompat != null) && bool.booleanValue()) {
                XVrsMrzDetector.write(XVrsMrzDetector.this);
                if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                    XVrsMrzDetector xVrsMrzDetector = XVrsMrzDetector.this;
                    xVrsMrzDetector.read(xVrsMrzDetector.MediaBrowserCompat$ItemReceiver);
                    return;
                }
                snippet read2 = XVrsMrzDetector.this.IconCompatParcelizer;
                read2.IconCompatParcelizer.read();
                read2.MediaBrowserCompat$CustomActionResultReceiver.write(false);
                XVrsMrzDetector.this.write.read.read((setBearing) null);
                XVrsMrzDetector.this.MediaDescriptionCompat.edit().remove("randomDeviceId").apply();
                XVrsMrzDetector xVrsMrzDetector2 = XVrsMrzDetector.this;
                XVrsLABDetector xVrsLABDetector = XVrsLABDetector.IconCompatParcelizer;
                if (xVrsMrzDetector2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    xVrsLABDetector.IconCompatParcelizer(xVrsMrzDetector2.RatingCompat);
                }
            }
        }

        IconCompatParcelizer(boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final void onError(Throwable th) {
            XVrsMrzDetector.this.MediaBrowserCompat$ItemReceiver(XVrsMrzDetector.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(XVrsMrzDetector xVrsMrzDetector) {
        if (xVrsMrzDetector.RatingCompat != null) {
            xVrsMrzDetector.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void write(XVrsMrzDetector xVrsMrzDetector) {
        if (xVrsMrzDetector.RatingCompat != null) {
            xVrsMrzDetector.RatingCompat.aj_();
        }
    }

    public final void read(String str, boolean z) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        this.IconCompatParcelizer.IconCompatParcelizer(new readMapMaker(arrayList, this.MediaBrowserCompat$SearchResultReceiver));
        this.IconCompatParcelizer.IconCompatParcelizer(new IconCompatParcelizer(z));
    }
}
