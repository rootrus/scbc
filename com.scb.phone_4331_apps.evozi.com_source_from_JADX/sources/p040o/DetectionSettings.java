package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.Image;
import p040o.Multisets;
import p040o.writeUInt64NoTag;

/* renamed from: o.DetectionSettings */
public final /* synthetic */ class DetectionSettings implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Image.FriendI read;

    public /* synthetic */ DetectionSettings(Image.FriendI friendI, String str) {
        this.read = friendI;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        Image.FriendI friendI = this.read;
        C6395xeeeefe7 checkExtractActivity_MembersInjector$setShortcut$MediaBrowserCompat$CustomActionResultReceiver = (C6395xeeeefe7) obj;
        if ("CREDIT_CARD".equals(this.MediaBrowserCompat$CustomActionResultReceiver)) {
            Multisets.C36841 r1 = friendI.write;
            List<doOnboarding> list = friendI.read;
            onGetStartedClick.write((Object) list, "offers");
            String string = r1.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.select_card_title);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.select_card_title)");
            Iterable<doOnboarding> iterable = list;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (doOnboarding add : iterable) {
                arrayList.add(add);
            }
            checkExtractActivity_MembersInjector$setShortcut$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(new subscribe(string, (List) arrayList));
            return;
        }
        checkExtractActivity_MembersInjector$setShortcut$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(friendI.write.write(friendI.read));
    }
}
