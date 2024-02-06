package p040o;

import p040o.MinMaxPriorityQueue;
import p040o.access$2300;
import p040o.writeUInt32;
import p040o.writeUInt64NoTag;

/* renamed from: o.getClassificationResults */
public final class getClassificationResults extends writeUInt32<IdCaptureModule_GetIJsonExactionHelperRttiFactory> {
    public final addOnSuccessListener IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final MinMaxPriorityQueue.MoveDesc write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getClassificationResults(RegularImmutableBiMap regularImmutableBiMap, performActionWithResponse performactionwithresponse, FileBackedOutputStream fileBackedOutputStream, addOnSuccessListener addonsuccesslistener, MinMaxPriorityQueue.MoveDesc moveDesc) {
        super(performactionwithresponse, regularImmutableBiMap, fileBackedOutputStream);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) addonsuccesslistener, "debitCardResetPinCase");
        onGetStartedClick.write((Object) moveDesc, "debitCardResetPinEncryptedDisplayMapper");
        this.IconCompatParcelizer = addonsuccesslistener;
        this.write = moveDesc;
    }

    /* renamed from: o.getClassificationResults$read */
    public static final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setCenter> {
        final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ getClassificationResults MediaBrowserCompat$ItemReceiver;

        /* renamed from: o.getClassificationResults$read$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<IdCaptureModule_GetIJsonExactionHelperRttiFactory> {
            private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ setCenter write;

            IconCompatParcelizer(read read, setCenter setcenter) {
                this.MediaBrowserCompat$CustomActionResultReceiver = read;
                this.write = setcenter;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                MinMaxPriorityQueue.MoveDesc unused = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write;
                String str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                setCenter setcenter = this.write;
                onGetStartedClick.write((Object) str, "cardRefNo");
                onGetStartedClick.write((Object) setcenter, "domain");
                ((IdCaptureModule_GetIJsonExactionHelperRttiFactory) obj).write(new recordException(str, setcenter.write, setcenter.IconCompatParcelizer, setcenter.MediaBrowserCompat$CustomActionResultReceiver, setcenter.read));
            }
        }

        public read(getClassificationResults getclassificationresults, String str) {
            this.MediaBrowserCompat$ItemReceiver = getclassificationresults;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            setCenter setcenter = (setCenter) obj;
            onGetStartedClick.write((Object) setcenter, "response");
            super.onNext(setcenter);
            getClassificationResults.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            getClassificationResults getclassificationresults = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, setcenter);
            if (getclassificationresults.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getclassificationresults.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            getClassificationResults.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$ItemReceiver.write();
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final void onDestroy() {
        addOnSuccessListener addonsuccesslistener = this.IconCompatParcelizer;
        if (!addonsuccesslistener.MediaBrowserCompat$MediaItem.isDisposed()) {
            addonsuccesslistener.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getClassificationResults getclassificationresults) {
        if (getclassificationresults.RatingCompat != null) {
            getclassificationresults.RatingCompat.aj_();
        }
    }

    public final void write(String str) {
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer getclassificationresults_mediabrowsercompat_customactionresultreceiver = new C9961xf3690e87(str);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getclassificationresults_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final boolean read() {
        return this.read == writeUInt32.read.NEW;
    }
}
