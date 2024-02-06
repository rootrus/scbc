package p040o;

import p040o.SortedLists;
import p040o.writeUInt64NoTag;

/* renamed from: o.UserLogout */
public final class UserLogout extends writeUInt64NoTag<PassportExtractorResponse> {
    public populateFramesList IconCompatParcelizer;
    private final getStartFinalizer MediaBrowserCompat$ItemReceiver;
    public final SortedLists.Relation.C37994 read;
    public captureEventData write;

    /* renamed from: o.UserLogout$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractorResponse> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportExtractorResponse) obj).read();
        }
    }

    /* renamed from: o.UserLogout$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractorResponse> {
        private /* synthetic */ UserLogout IconCompatParcelizer;
        private /* synthetic */ int MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ populateSessionOperatingSystemData write;

        public write(UserLogout userLogout, populateSessionOperatingSystemData populatesessionoperatingsystemdata, int i) {
            this.IconCompatParcelizer = userLogout;
            this.write = populatesessionoperatingsystemdata;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            PassportExtractorResponse passportExtractorResponse = (PassportExtractorResponse) obj;
            if (UserLogout.read(this.IconCompatParcelizer)) {
                passportExtractorResponse.write(this.write, this.MediaBrowserCompat$ItemReceiver);
            } else {
                passportExtractorResponse.MediaBrowserCompat$ItemReceiver(this.write, this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public UserLogout(getStartFinalizer getstartfinalizer, SortedLists.Relation.C37994 r3, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) getstartfinalizer, "getNtbUserInfoUseCase");
        onGetStartedClick.write((Object) r3, "discoverFundFilterListDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = getstartfinalizer;
        this.read = r3;
    }

    public static final /* synthetic */ boolean read(UserLogout userLogout) {
        return userLogout.MediaBrowserCompat$ItemReceiver.write.read() != null;
    }
}
