package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getRectLeft */
public final /* synthetic */ class getRectLeft implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setMicrData MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ extractFieldFromSystemFile read;

    public /* synthetic */ getRectLeft(setMicrData setmicrdata, int i, extractFieldFromSystemFile extractfieldfromsystemfile) {
        this.MediaBrowserCompat$ItemReceiver = setmicrdata;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = extractfieldfromsystemfile;
    }

    public final void IconCompatParcelizer(Object obj) {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        extractFieldFromSystemFile extractfieldfromsystemfile = this.read;
        CheckExtractActivity_MembersInjector.RatingCompat ratingCompat = (CheckExtractActivity_MembersInjector.RatingCompat) obj;
        ratingCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
        ratingCompat.MediaBrowserCompat$CustomActionResultReceiver(leastOf.MediaBrowserCompat$ItemReceiver((getStringsFileValue) extractfieldfromsystemfile));
        ratingCompat.MediaBrowserCompat$ItemReceiver(usingToString.read(extractfieldfromsystemfile));
        ratingCompat.IconCompatParcelizer(extractfieldfromsystemfile.read);
    }
}
