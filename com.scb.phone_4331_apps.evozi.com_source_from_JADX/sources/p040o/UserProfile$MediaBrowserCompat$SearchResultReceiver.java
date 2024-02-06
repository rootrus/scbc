package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.UserProfile$MediaBrowserCompat$SearchResultReceiver */
public final class UserProfile$MediaBrowserCompat$SearchResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
    private /* synthetic */ UserProfile read;

    /* renamed from: o.UserProfile$MediaBrowserCompat$SearchResultReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIExtractionServerRttiFactory> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule_GetIExtractionServerRttiFactory) obj).IconCompatParcelizer("");
        }
    }

    public UserProfile$MediaBrowserCompat$SearchResultReceiver(UserProfile userProfile) {
        this.read = userProfile;
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, Name.MARK);
        UserProfile userProfile = this.read;
        writeUInt64NoTag.IconCompatParcelizer userProfile$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$ItemReceiver = new C3929x4b827648(str);
        if (userProfile.RatingCompat != null) {
            userProfile$MediaBrowserCompat$SearchResultReceiver$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(userProfile.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        UserProfile userProfile = this.read;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.IconCompatParcelizer;
        if (userProfile.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(userProfile.RatingCompat);
        }
    }
}
