package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getOutputNames$MediaBrowserCompat$ItemReceiver */
public final class getOutputNames$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
    private /* synthetic */ getOutputNames write;

    /* renamed from: o.getOutputNames$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<IdParameters_Factory> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdParameters_Factory) obj).write();
        }
    }

    /* renamed from: o.getOutputNames$MediaBrowserCompat$ItemReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<IdParameters_Factory> {
        private /* synthetic */ String read;

        write(String str) {
            this.read = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdParameters_Factory) obj).read(this.read);
        }
    }

    getOutputNames$MediaBrowserCompat$ItemReceiver(getOutputNames getoutputnames) {
        this.write = getoutputnames;
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "filePath");
        getOutputNames.MediaBrowserCompat$ItemReceiver(this.write);
        getOutputNames getoutputnames = this.write;
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(str);
        if (getoutputnames.RatingCompat != null) {
            write2.IconCompatParcelizer(getoutputnames.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        getOutputNames getoutputnames = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (getoutputnames.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getoutputnames.RatingCompat);
        }
    }
}
