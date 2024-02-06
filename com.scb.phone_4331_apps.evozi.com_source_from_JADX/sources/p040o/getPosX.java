package p040o;

import p040o.MetaDataStore;
import p040o.PageDetectionEvent;
import p040o.access$2300;

/* renamed from: o.getPosX */
public class getPosX extends writeUInt64NoTag<RttiJsonPassport> {
    public MetaDataStore.C36551 IconCompatParcelizer;
    public InstallException MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public removePredicate MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: package-private */
    public String read;
    public setErrorTextColor write;

    @HmlPinActivity
    public getPosX(RegularImmutableBiMap regularImmutableBiMap, setErrorTextColor seterrortextcolor, InstallException installException, removePredicate removepredicate) {
        super(regularImmutableBiMap);
        this.write = seterrortextcolor;
        this.MediaBrowserCompat$ItemReceiver = installException;
        this.MediaBrowserCompat$MediaItem = removepredicate;
    }

    public void onDestroy() {
        setErrorTextColor seterrortextcolor = this.write;
        if (!seterrortextcolor.MediaBrowserCompat$MediaItem.isDisposed()) {
            seterrortextcolor.MediaBrowserCompat$MediaItem.dispose();
        }
        InstallException installException = this.MediaBrowserCompat$ItemReceiver;
        if (!installException.MediaBrowserCompat$MediaItem.isDisposed()) {
            installException.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.getPosX$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private read() {
        }

        public /* synthetic */ read(getPosX getposx, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            super.onNext((Boolean) obj);
            getPosX.MediaBrowserCompat$ItemReceiver(getPosX.this);
            getPosX getposx = getPosX.this;
            PageDetectionEvent.C37251 r0 = PageDetectionEvent.C37251.MediaBrowserCompat$CustomActionResultReceiver;
            if (getposx.RatingCompat != null) {
                r0.IconCompatParcelizer(getposx.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            getPosX.this.MediaBrowserCompat$ItemReceiver(getPosX.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getPosX getposx) {
        if (getposx.RatingCompat != null) {
            getposx.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getPosX getposx) {
        if (getposx.RatingCompat != null) {
            getposx.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(getPosX getposx) {
        Utility utility = new Utility(getposx);
        if (getposx.RatingCompat != null) {
            utility.IconCompatParcelizer(getposx.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(getPosX getposx) {
        if (getposx.RatingCompat != null) {
            getposx.RatingCompat.aj_();
        }
    }
}
