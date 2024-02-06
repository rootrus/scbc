package p040o;

import java.util.ArrayList;
import p040o.CrashlyticsReport;
import p040o.Interners;
import p040o.inject_stringIdGenerator;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageStorage */
public final /* synthetic */ class setImageStorage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ inject_stringIdGenerator MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ double read;

    public /* synthetic */ setImageStorage(inject_stringIdGenerator inject_stringidgenerator, double d) {
        this.MediaBrowserCompat$CustomActionResultReceiver = inject_stringidgenerator;
        this.read = d;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        IImageStorage iImageStorage;
        chain chain;
        CrashlyticsReport.FilesPayload.File.Builder builder;
        inject_stringIdGenerator inject_stringidgenerator = this.MediaBrowserCompat$CustomActionResultReceiver;
        double d = this.read;
        getTopLeftCornerWidth$MediaSessionCompat$Token gettopleftcornerwidth_mediasessioncompat_token = (getTopLeftCornerWidth$MediaSessionCompat$Token) obj;
        String str2 = null;
        if (inject_stringidgenerator.read && (builder = inject_stringidgenerator.MediaSessionCompat$Token) != null) {
            str = builder.MediaSessionCompat$Token;
        } else if (inject_stringidgenerator.read || (chain = inject_stringidgenerator.MediaSessionCompat$QueueItem) == null) {
            str = null;
        } else {
            str = chain.MediaDescriptionCompat;
        }
        if (str != null && d > 0.0d) {
            gettopleftcornerwidth_mediasessioncompat_token.AlertController$RecycleListView();
            intern MediaBrowserCompat$CustomActionResultReceiver2 = intern.MediaBrowserCompat$CustomActionResultReceiver();
            if (inject_stringidgenerator.read) {
                iImageStorage = IImageStorage.DEPOSIT;
            } else {
                chain chain2 = inject_stringidgenerator.MediaSessionCompat$QueueItem;
                if (chain2 != null) {
                    String str3 = chain2.setShortcut;
                    if (str3 != null && str3.endsWith("SPD")) {
                        iImageStorage = IImageStorage.SPEEDY_CASH;
                    }
                }
                iImageStorage = IImageStorage.CREDIT;
            }
            MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = iImageStorage.typeCode;
            MediaBrowserCompat$CustomActionResultReceiver2.read = str;
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = removeIfFromRandomAccessList.read(d);
            if (inject_stringidgenerator.write && inject_stringidgenerator.read && inject_stringidgenerator.MediaSessionCompat$Token.MediaSessionCompat$QueueItem != null && !inject_stringidgenerator.MediaSessionCompat$Token.MediaSessionCompat$QueueItem.isEmpty()) {
                MediaBrowserCompat$CustomActionResultReceiver2.write = String.valueOf(inject_stringidgenerator.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver);
                ArrayList arrayList = new ArrayList();
                for (zzvq zzvq : inject_stringidgenerator.MediaSessionCompat$Token.MediaSessionCompat$QueueItem) {
                    arrayList.add(new Interners.WeakInterner(zzvq.read, inject_stringidgenerator.MediaSessionCompat$Token.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver));
                }
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = arrayList;
            }
            inject_stringidgenerator.IconCompatParcelizer.read(MediaBrowserCompat$CustomActionResultReceiver2);
            draggable draggable = inject_stringidgenerator.IconCompatParcelizer;
            chain chain3 = inject_stringidgenerator.MediaSessionCompat$QueueItem;
            if (chain3 != null) {
                str2 = chain3.MediaSessionCompat$Token;
            }
            draggable.IconCompatParcelizer(new inject_stringIdGenerator.write(MediaBrowserCompat$CustomActionResultReceiver2, str2));
        }
    }
}
