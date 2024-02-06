package p040o;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.Multisets;
import p040o.writeUInt64NoTag;

/* renamed from: o.y */
public final /* synthetic */ class C5465y implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getImageOriginalDateTime read;
    private final /* synthetic */ isRooted write;

    /* renamed from: o.y$a */
    public final /* synthetic */ class C5467a implements DialogInterface.OnClickListener {
        private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding read;

        public /* synthetic */ C5467a(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
            this.read = historyAdapter$GroupFooterViewHolder_ViewBinding;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.read.read();
        }
    }

    /* renamed from: o.y$b */
    public final /* synthetic */ class C5468b implements DialogInterface.OnClickListener {
        private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding IconCompatParcelizer;

        public /* synthetic */ C5468b(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
            this.IconCompatParcelizer = historyAdapter$GroupFooterViewHolder_ViewBinding;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.IconCompatParcelizer.write();
        }
    }

    public /* synthetic */ C5465y(getImageOriginalDateTime getimageoriginaldatetime, isRooted isrooted) {
        this.read = getimageoriginaldatetime;
        this.write = isrooted;
    }

    public final void IconCompatParcelizer(Object obj) {
        getImageOriginalDateTime getimageoriginaldatetime = this.read;
        isRooted isrooted = this.write;
        CheckExtractActivity_MembersInjector.setVisibility setvisibility = (CheckExtractActivity_MembersInjector.setVisibility) obj;
        setvisibility.aI_();
        Multisets.C36841 r2 = getimageoriginaldatetime.write;
        List<extractFieldFromSystemFile> list = isrooted.RatingCompat;
        onGetStartedClick.write((Object) list, "offers");
        String string = r2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.purposeful_feature_input_card_selector_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.purpo…nput_card_selector_title)");
        Iterable<extractFieldFromSystemFile> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (extractFieldFromSystemFile extractfieldfromsystemfile : iterable) {
            arrayList.add(extractfieldfromsystemfile.MediaBrowserCompat$CustomActionResultReceiver);
        }
        setvisibility.write(new subscribe(string, (List) arrayList));
        setvisibility.read(leastOf.MediaBrowserCompat$ItemReceiver((getStringsFileValue) getimageoriginaldatetime.MediaBrowserCompat$SearchResultReceiver));
        setvisibility.write(0.0d);
    }
}
