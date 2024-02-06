package p040o;

import p040o.CrashlyticsCore;

/* renamed from: o.getDocumentNote$MediaBrowserCompat$ItemReceiver */
public final class getDocumentNote$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getInitialTrigger> {
    final /* synthetic */ getDocumentNote IconCompatParcelizer;

    private getDocumentNote$MediaBrowserCompat$ItemReceiver(getDocumentNote getdocumentnote) {
        this.IconCompatParcelizer = getdocumentnote;
    }

    public /* synthetic */ getDocumentNote$MediaBrowserCompat$ItemReceiver(getDocumentNote getdocumentnote, byte b) {
        this(getdocumentnote);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getInitialTrigger getinitialtrigger = (getInitialTrigger) obj;
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            getDocumentNote getdocumentnote = this.IconCompatParcelizer;
            CrashlyticsCore.C32441 unused = getdocumentnote.MediaBrowserCompat$SearchResultReceiver = getdocumentnote.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(getinitialtrigger);
            getDocumentNote getdocumentnote2 = this.IconCompatParcelizer;
            WscRequest wscRequest = new WscRequest(this);
            if (getdocumentnote2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                wscRequest.IconCompatParcelizer(getdocumentnote2.RatingCompat);
            }
            getDocumentNote.MediaMetadataCompat(this.IconCompatParcelizer);
        }
    }

    public final void onComplete() {
        getDocumentNote.write(this.IconCompatParcelizer);
        getDocumentNote.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if ((this.IconCompatParcelizer.RatingCompat != null) && !this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            getDocumentNote.IconCompatParcelizer(this.IconCompatParcelizer);
            getDocumentNote getdocumentnote = this.IconCompatParcelizer;
            getUserName getusername = new getUserName(this, th);
            if (getdocumentnote.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getusername.IconCompatParcelizer(getdocumentnote.RatingCompat);
            }
        }
    }
}
