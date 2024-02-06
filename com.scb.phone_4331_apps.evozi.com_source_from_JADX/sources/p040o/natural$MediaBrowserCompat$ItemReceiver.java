package p040o;

import android.content.res.Resources;
import java.util.Collections;
import java.util.List;
import p040o.Iterables;

/* renamed from: o.natural$MediaBrowserCompat$ItemReceiver */
public final class natural$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
    private /* synthetic */ natural read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public natural$MediaBrowserCompat$ItemReceiver(natural natural) {
        super(1);
        this.read = natural;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
        onGetStartedClick.write((Object) setdatacollectionenabled, "it");
        String str = setdatacollectionenabled.IconCompatParcelizer;
        List singletonList = Collections.singletonList(new C3758xd990f62c(setdatacollectionenabled.MediaDescriptionCompat, ContentFrameLayout.write(this.read.MediaBrowserCompat$CustomActionResultReceiver, Iterables.C35273.read.dark_gray, (Resources.Theme) null)));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        return new RestrictedComponentContainer(str, (List<C3758xd990f62c>) singletonList);
    }
}
