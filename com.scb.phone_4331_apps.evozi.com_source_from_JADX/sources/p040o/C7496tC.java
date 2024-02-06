package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.tC */
public final /* synthetic */ class C7496tC implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ inject_stringIdGenerator MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C7496tC(inject_stringIdGenerator inject_stringidgenerator) {
        this.MediaBrowserCompat$ItemReceiver = inject_stringidgenerator;
    }

    public final void IconCompatParcelizer(Object obj) {
        inject_stringIdGenerator inject_stringidgenerator = this.MediaBrowserCompat$ItemReceiver;
        getTopLeftCornerWidth$MediaSessionCompat$Token gettopleftcornerwidth_mediasessioncompat_token = (getTopLeftCornerWidth$MediaSessionCompat$Token) obj;
        parseCustomAttribute parsecustomattribute = inject_stringidgenerator.MediaBrowserCompat$ItemReceiver;
        if (parsecustomattribute == null || parsecustomattribute.read == null) {
            gettopleftcornerwidth_mediasessioncompat_token.read();
        } else {
            gettopleftcornerwidth_mediasessioncompat_token.read(inject_stringidgenerator.MediaBrowserCompat$ItemReceiver.read);
        }
    }
}
