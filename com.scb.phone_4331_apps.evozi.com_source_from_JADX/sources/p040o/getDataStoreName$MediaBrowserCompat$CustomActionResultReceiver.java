package p040o;

import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.KtaJsonCheck;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDataStoreName$MediaBrowserCompat$CustomActionResultReceiver */
public final class getDataStoreName$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<AutoValue_CrashlyticsReport_FilesPayload.Builder> {
    private /* synthetic */ getDataStoreName read;

    /* renamed from: o.getDataStoreName$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaJsonCheck.C6928a> {
        private /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload.Builder MediaBrowserCompat$ItemReceiver;

        write(AutoValue_CrashlyticsReport_FilesPayload.Builder builder) {
            this.MediaBrowserCompat$ItemReceiver = builder;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((KtaJsonCheck.C6928a) obj).read(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    getDataStoreName$MediaBrowserCompat$CustomActionResultReceiver(getDataStoreName getdatastorename) {
        this.read = getdatastorename;
    }

    public final /* synthetic */ void onNext(Object obj) {
        AutoValue_CrashlyticsReport_FilesPayload.Builder builder = (AutoValue_CrashlyticsReport_FilesPayload.Builder) obj;
        onGetStartedClick.write((Object) builder, "display");
        super.onNext(builder);
        getDataStoreName getdatastorename = this.read;
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(builder);
        if (getdatastorename.RatingCompat != null) {
            write2.IconCompatParcelizer(getdatastorename.RatingCompat);
        }
        getDataStoreName.write(this.read);
        getDataStoreName.read(this.read);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
