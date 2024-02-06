package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.Multisets;
import p040o.writeUInt64NoTag;

/* renamed from: o.toFinalOpString */
public final /* synthetic */ class toFinalOpString implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setMicrData IconCompatParcelizer;
    private final /* synthetic */ getBooleanResourceValue MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ extractFieldFromSystemFile read;

    public /* synthetic */ toFinalOpString(setMicrData setmicrdata, extractFieldFromSystemFile extractfieldfromsystemfile, getBooleanResourceValue getbooleanresourcevalue) {
        this.IconCompatParcelizer = setmicrdata;
        this.read = extractfieldfromsystemfile;
        this.MediaBrowserCompat$CustomActionResultReceiver = getbooleanresourcevalue;
    }

    public final void IconCompatParcelizer(Object obj) {
        setMicrData setmicrdata = this.IconCompatParcelizer;
        extractFieldFromSystemFile extractfieldfromsystemfile = this.read;
        getBooleanResourceValue getbooleanresourcevalue = this.MediaBrowserCompat$CustomActionResultReceiver;
        CheckExtractActivity_MembersInjector.RatingCompat ratingCompat = (CheckExtractActivity_MembersInjector.RatingCompat) obj;
        ratingCompat.aI_();
        ratingCompat.MediaBrowserCompat$CustomActionResultReceiver(leastOf.MediaBrowserCompat$ItemReceiver((getStringsFileValue) extractfieldfromsystemfile));
        Multisets.C36841 r0 = setmicrdata.read;
        List<flushOrLog> list = getbooleanresourcevalue.write;
        onGetStartedClick.write((Object) list, "offers");
        String string = r0.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.commercial_feature_input_card_selector_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.comme…nput_card_selector_title)");
        Iterable<flushOrLog> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (flushOrLog flushorlog : iterable) {
            extractFieldFromSystemFile extractfieldfromsystemfile2 = flushorlog.IconCompatParcelizer;
            onGetStartedClick.IconCompatParcelizer((Object) extractfieldfromsystemfile2, "it.easycashExtendedLoanOfferDisplay");
            arrayList.add(extractfieldfromsystemfile2.MediaBrowserCompat$CustomActionResultReceiver);
        }
        ratingCompat.MediaBrowserCompat$CustomActionResultReceiver(new subscribe(string, (List) arrayList));
        ratingCompat.MediaBrowserCompat$CustomActionResultReceiver();
        ratingCompat.MediaBrowserCompat$ItemReceiver(usingToString.read(extractfieldfromsystemfile));
        ratingCompat.write(getbooleanresourcevalue.IconCompatParcelizer);
        ratingCompat.MediaBrowserCompat$CustomActionResultReceiver(false);
        ratingCompat.IconCompatParcelizer(extractfieldfromsystemfile.read);
    }
}
