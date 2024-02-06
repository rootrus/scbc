package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getVerySafeSoapProperty$MediaBrowserCompat$ItemReceiver */
public final class getVerySafeSoapProperty$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
    final /* synthetic */ getVerySafeSoapProperty MediaBrowserCompat$CustomActionResultReceiver;

    getVerySafeSoapProperty$MediaBrowserCompat$ItemReceiver(getVerySafeSoapProperty getverysafesoapproperty) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getverysafesoapproperty;
    }

    public final void onComplete() {
        super.onComplete();
        getVerySafeSoapProperty getverysafesoapproperty = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<proxyGetIPassportDeserializerRtti>(this) {
            private /* synthetic */ getVerySafeSoapProperty$MediaBrowserCompat$ItemReceiver write;

            {
                this.write = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((proxyGetIPassportDeserializerRtti) obj).IconCompatParcelizer(this.write.MediaBrowserCompat$CustomActionResultReceiver.write.read.MediaBrowserCompat$SearchResultReceiver());
            }
        };
        if (getverysafesoapproperty.RatingCompat != null) {
            r1.IconCompatParcelizer(getverysafesoapproperty.RatingCompat);
        }
        getVerySafeSoapProperty.write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
