package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.startActivityForResult_aroundBody0 */
public final /* synthetic */ class startActivityForResult_aroundBody0 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ inject_stringIdGenerator MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ startActivityForResult_aroundBody0(inject_stringIdGenerator inject_stringidgenerator) {
        this.MediaBrowserCompat$ItemReceiver = inject_stringidgenerator;
    }

    public final void IconCompatParcelizer(Object obj) {
        inject_stringIdGenerator inject_stringidgenerator = this.MediaBrowserCompat$ItemReceiver;
        getTopLeftCornerWidth$MediaSessionCompat$Token gettopleftcornerwidth_mediasessioncompat_token = (getTopLeftCornerWidth$MediaSessionCompat$Token) obj;
        parseCustomAttribute parsecustomattribute = inject_stringidgenerator.MediaBrowserCompat$ItemReceiver;
        if (parsecustomattribute == null || parsecustomattribute.IconCompatParcelizer == null) {
            parseCustomAttribute parsecustomattribute2 = inject_stringidgenerator.MediaBrowserCompat$ItemReceiver;
            if (parsecustomattribute2 != null) {
                setMapToolbarEnabled setmaptoolbarenabled = parsecustomattribute2.MediaBrowserCompat$CustomActionResultReceiver;
                if (setMapToolbarEnabled.SUCCESS == setmaptoolbarenabled || setMapToolbarEnabled.CASA_FAIL == setmaptoolbarenabled) {
                    gettopleftcornerwidth_mediasessioncompat_token.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                }
            }
            gettopleftcornerwidth_mediasessioncompat_token.read();
            return;
        }
        gettopleftcornerwidth_mediasessioncompat_token.read(inject_stringidgenerator.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
    }
}
