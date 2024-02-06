package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getImageStorage */
public final /* synthetic */ class getImageStorage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ inject_stringIdGenerator read;

    public /* synthetic */ getImageStorage(inject_stringIdGenerator inject_stringidgenerator) {
        this.read = inject_stringidgenerator;
    }

    public final void IconCompatParcelizer(Object obj) {
        inject_stringIdGenerator inject_stringidgenerator = this.read;
        getTopLeftCornerWidth$MediaSessionCompat$Token gettopleftcornerwidth_mediasessioncompat_token = (getTopLeftCornerWidth$MediaSessionCompat$Token) obj;
        parseCustomAttribute parsecustomattribute = inject_stringidgenerator.MediaBrowserCompat$ItemReceiver;
        boolean z = false;
        if (parsecustomattribute == null || parsecustomattribute.MediaBrowserCompat$ItemReceiver == null) {
            parseCustomAttribute parsecustomattribute2 = inject_stringidgenerator.MediaBrowserCompat$ItemReceiver;
            if (parsecustomattribute2 != null) {
                setMapToolbarEnabled setmaptoolbarenabled = parsecustomattribute2.MediaBrowserCompat$CustomActionResultReceiver;
                if (setMapToolbarEnabled.SUCCESS == setmaptoolbarenabled || setMapToolbarEnabled.CARD_FAIL == setmaptoolbarenabled) {
                    gettopleftcornerwidth_mediasessioncompat_token.IconCompatParcelizer();
                }
            }
            gettopleftcornerwidth_mediasessioncompat_token.read();
        } else {
            gettopleftcornerwidth_mediasessioncompat_token.read(inject_stringidgenerator.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        }
        if (inject_stringidgenerator.RatingCompat != null) {
            z = true;
        }
        if (z) {
            inject_stringidgenerator.RatingCompat.aj_();
        }
    }
}
