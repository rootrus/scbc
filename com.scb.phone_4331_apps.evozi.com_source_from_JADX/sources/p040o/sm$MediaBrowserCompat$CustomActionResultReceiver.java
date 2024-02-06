package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.sm$MediaBrowserCompat$CustomActionResultReceiver */
public final class sm$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    final /* synthetic */ C5413sm read;

    /* renamed from: o.sm$MediaBrowserCompat$CustomActionResultReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C1290xf5767c6e> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C1290xf5767c6e serverProjectProvider$15$MediaBrowserCompat$CustomActionResultReceiver = (C1290xf5767c6e) obj;
            serverProjectProvider$15$MediaBrowserCompat$CustomActionResultReceiver.aj_();
            serverProjectProvider$15$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    public sm$MediaBrowserCompat$CustomActionResultReceiver(C5413sm smVar) {
        this.read = smVar;
    }

    public final /* synthetic */ void onNext(Object obj) {
        super.onNext(Boolean.valueOf(((Boolean) obj).booleanValue()));
        C5413sm smVar = this.read;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.IconCompatParcelizer;
        if (smVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(smVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        C5413sm smVar = this.read;
        writeUInt64NoTag.IconCompatParcelizer sm_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_customactionresultreceiver = new C5414x546805b4(this, th);
        if (smVar.RatingCompat != null) {
            sm_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(smVar.RatingCompat);
        }
    }
}
