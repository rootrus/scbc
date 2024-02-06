package p040o;

import android.content.res.Resources;
import p040o.writeUInt64NoTag;

/* renamed from: o.setIpOperationsFilePath */
public final class setIpOperationsFilePath extends writeUInt64NoTag<CheckIQAData> {
    /* access modifiers changed from: private */
    public final Resources write;

    /* renamed from: o.setIpOperationsFilePath$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckIQAData> {
        private /* synthetic */ immediateFailedFuture MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ setIpOperationsFilePath write;

        public write(setIpOperationsFilePath setipoperationsfilepath, immediateFailedFuture immediatefailedfuture) {
            this.write = setipoperationsfilepath;
            this.MediaBrowserCompat$CustomActionResultReceiver = immediatefailedfuture;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            CheckIQAData checkIQAData = (CheckIQAData) obj;
            checkIQAData.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            String str = this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
            if (str == null) {
                str = this.write.write.getString(Iterables$3$MediaBrowserCompat$MediaItem.terms_and_conditions);
                onGetStartedClick.IconCompatParcelizer((Object) str, "mResources.getString(R.s…ing.terms_and_conditions)");
            }
            checkIQAData.mo33910l_(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setIpOperationsFilePath(RegularImmutableBiMap regularImmutableBiMap, Resources resources) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) resources, "mResources");
        this.write = resources;
    }
}
