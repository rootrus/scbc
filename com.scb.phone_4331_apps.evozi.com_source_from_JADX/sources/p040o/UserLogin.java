package p040o;

import java.util.ArrayList;
import p040o.SortedLists;
import p040o.access$2300;
import p040o.populateEventDeviceData;
import p040o.writeUInt64NoTag;

/* renamed from: o.UserLogin */
public final class UserLogin extends writeUInt64NoTag<getFrontRearWidthDifference> {
    public ArrayList<CrashlyticsReportDataCapture> IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final SortedLists.C37951 MediaBrowserCompat$ItemReceiver;
    public String read;
    public final StreetViewPanoramaLink write;

    /* renamed from: o.UserLogin$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getFrontRearWidthDifference> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getFrontRearWidthDifference) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public static final /* synthetic */ String read(UserLogin userLogin) {
        String str = userLogin.read;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("name");
        }
        return str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public UserLogin(StreetViewPanoramaLink streetViewPanoramaLink, SortedLists.C37951 r3, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) streetViewPanoramaLink, "investmentCase");
        onGetStartedClick.write((Object) r3, "riskReviewDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = streetViewPanoramaLink;
        this.MediaBrowserCompat$ItemReceiver = r3;
    }

    /* renamed from: o.UserLogin$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getExpirationTime> {

        /* renamed from: o.UserLogin$write$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getFrontRearWidthDifference> {
            private /* synthetic */ getExpirationTime read;
            private /* synthetic */ write write;

            IconCompatParcelizer(write write2, getExpirationTime getexpirationtime) {
                this.write = write2;
                this.read = getexpirationtime;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                getFrontRearWidthDifference getfrontrearwidthdifference = (getFrontRearWidthDifference) obj;
                String str = this.read.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) str, "riskAssessmentCalculation.tokenId");
                SortedLists.C37951 unused = UserLogin.this.MediaBrowserCompat$ItemReceiver;
                String read2 = UserLogin.read(UserLogin.this);
                getExpirationTime getexpirationtime = this.read;
                ArrayList arrayList = new ArrayList();
                for (getExpirationTime$MediaBrowserCompat$CustomActionResultReceiver next : getexpirationtime.read) {
                    if (!next.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() && !next.MediaBrowserCompat$CustomActionResultReceiver.equals("0.00%")) {
                        arrayList.add(new populateEventDeviceData.read(next.MediaBrowserCompat$CustomActionResultReceiver, next.IconCompatParcelizer));
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (String next2 : getexpirationtime.MediaBrowserCompat$CustomActionResultReceiver) {
                    if (sb.length() == 0) {
                        sb = new StringBuilder(next2);
                    } else {
                        sb.append("\n\n");
                        sb.append(next2);
                    }
                }
                populateEventDeviceData populateeventdevicedata = new populateEventDeviceData(read2, getexpirationtime.write, getexpirationtime.IconCompatParcelizer, arrayList, sb.toString());
                onGetStartedClick.IconCompatParcelizer((Object) populateeventdevicedata, "riskReviewDisplayMapper.…iskAssessmentCalculation)");
                getfrontrearwidthdifference.IconCompatParcelizer(str, populateeventdevicedata);
            }
        }

        public write() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            getExpirationTime getexpirationtime = (getExpirationTime) obj;
            onGetStartedClick.write((Object) getexpirationtime, "riskAssessmentCalculation");
            UserLogin userLogin = UserLogin.this;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, getexpirationtime);
            if (userLogin.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(userLogin.RatingCompat);
            }
        }

        public final void onComplete() {
            UserLogin.MediaBrowserCompat$ItemReceiver(UserLogin.this);
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            UserLogin.MediaBrowserCompat$ItemReceiver(UserLogin.this);
            if (!UserLogin.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                UserLogin.this.MediaBrowserCompat$ItemReceiver(UserLogin.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(UserLogin userLogin) {
        if (userLogin.RatingCompat != null) {
            userLogin.RatingCompat.aj_();
        }
    }
}
