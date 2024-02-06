package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import p040o.SignedBytes;

/* renamed from: o.Serialization */
public final class Serialization {

    /* renamed from: o.Serialization$FieldSetter */
    public final class FieldSetter extends SignedBytes.LexicographicalComparator {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public FieldSetter(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
            super(resources, sharedPreferences, str);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
            onGetStartedClick.write((Object) str, "baseAssetsURL");
        }
    }

    public static Set<createBinaryImageJson> read(Set<? extends zzwd> set) {
        createBinaryImageJson createbinaryimagejson;
        onGetStartedClick.write((Object) set, "uploadMethods");
        Iterable<zzwd> iterable = set;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (zzwd ordinal : iterable) {
            int i = writeMap.IconCompatParcelizer[ordinal.ordinal()];
            if (i == 1) {
                createbinaryimagejson = createBinaryImageJson.TAKE_PHOTO;
            } else if (i == 2) {
                createbinaryimagejson = createBinaryImageJson.UPLOAD_PHOTO;
            } else if (i == 3) {
                createbinaryimagejson = createBinaryImageJson.UPLOAD_PDF;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(createbinaryimagejson);
        }
        Set write = HmlNTBBusinessURLInformationActivity.write((List) arrayList);
        createBinaryImageJson createbinaryimagejson2 = createBinaryImageJson.CANCEL;
        onGetStartedClick.write((Object) write, "$this$plus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(HmlNdidSelectIdpActivity.read(write.size() + 1));
        linkedHashSet.addAll(write);
        linkedHashSet.add(createbinaryimagejson2);
        return linkedHashSet;
    }
}
