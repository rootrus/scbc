package p040o;

import android.content.res.Resources;
import java.util.Collections;
import java.util.List;
import p040o.Iterables;

/* renamed from: o.natural$MediaBrowserCompat$MediaItem */
public final class natural$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
    private /* synthetic */ natural IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public natural$MediaBrowserCompat$MediaItem(natural natural) {
        super(1);
        this.IconCompatParcelizer = natural;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
        onGetStartedClick.write((Object) setdatacollectionenabled, "it");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "PROVINCE_OF_REGISTRATION", (Object) setdatacollectionenabled.MediaBrowserCompat$ItemReceiver) && !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "YEAR_OF_REGISTRATION", (Object) setdatacollectionenabled.MediaBrowserCompat$ItemReceiver)) {
            return new RestrictedComponentContainer(setdatacollectionenabled.IconCompatParcelizer, setdatacollectionenabled.MediaDescriptionCompat);
        }
        String str = setdatacollectionenabled.IconCompatParcelizer;
        List singletonList = Collections.singletonList(new C3758xd990f62c(setdatacollectionenabled.MediaDescriptionCompat, ContentFrameLayout.write(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, Iterables.C35273.read.dark_gray, (Resources.Theme) null)));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        return new RestrictedComponentContainer(str, (List<C3758xd990f62c>) singletonList);
    }
}
