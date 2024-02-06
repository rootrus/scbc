package p040o;

import java.util.Arrays;
import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvLanguage$MediaBrowserCompat$SearchResultReceiver */
public final class getEnvLanguage$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getBackException> {
    private /* synthetic */ getEnvLanguage MediaBrowserCompat$CustomActionResultReceiver;

    public getEnvLanguage$MediaBrowserCompat$SearchResultReceiver(getEnvLanguage getenvlanguage) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getenvlanguage;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        Table table = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        String string = table.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_review_content_1);
        onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…address_review_content_1)");
        String string2 = table.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_review_content_2);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…address_review_content_2)");
        String[] strArr = {string, string2};
        onGetStartedClick.write((Object) strArr, "elements");
        onGetStartedClick.write((Object) strArr, "$this$asList");
        List asList = Arrays.asList(strArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        ((getBackException) obj).MediaBrowserCompat$CustomActionResultReceiver(asList);
    }
}
