package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBackendType$MediaBrowserCompat$ItemReceiver */
public final class getBackendType$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<removeActivityTransitionUpdates> {
    private /* synthetic */ getBackendType MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.getBackendType$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C7511tU> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7511tU) obj).write();
        }
    }

    public getBackendType$MediaBrowserCompat$ItemReceiver(getBackendType getbackendtype) {
        this.MediaBrowserCompat$ItemReceiver = getbackendtype;
    }

    public final /* synthetic */ void onNext(Object obj) {
        removeActivityTransitionUpdates removeactivitytransitionupdates = (removeActivityTransitionUpdates) obj;
        onGetStartedClick.write((Object) removeactivitytransitionupdates, "hmlVerifyKycStatus");
        super.onNext(removeactivitytransitionupdates);
        getBackendType getbackendtype = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) removeactivitytransitionupdates, "<set-?>");
        getbackendtype.IconCompatParcelizer = removeactivitytransitionupdates;
        boolean z = true;
        if (removeactivitytransitionupdates.MediaBrowserCompat$CustomActionResultReceiver) {
            getBackendType getbackendtype2 = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4504x857f2af0.write;
            if (getbackendtype2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getbackendtype2.RatingCompat);
            }
        } else {
            getBackendType getbackendtype3 = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (getbackendtype3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(getbackendtype3.RatingCompat);
            }
        }
        getBackendType.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
