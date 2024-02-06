package p040o;

import android.content.res.Resources;
import com.google.android.gms.stats.CodePackage;
import java.util.Collections;
import java.util.List;
import p040o.Iterables;

/* renamed from: o.natural$MediaBrowserCompat$SearchResultReceiver */
public final class natural$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<setDataCollectionEnabled, RestrictedComponentContainer> {
    private /* synthetic */ natural MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public natural$MediaBrowserCompat$SearchResultReceiver(natural natural) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = natural;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
        onGetStartedClick.write((Object) setdatacollectionenabled, "it");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) CodePackage.LOCATION, (Object) setdatacollectionenabled.MediaBrowserCompat$ItemReceiver)) {
            return new RestrictedComponentContainer(setdatacollectionenabled.IconCompatParcelizer, setdatacollectionenabled.MediaDescriptionCompat);
        }
        String str = setdatacollectionenabled.IconCompatParcelizer;
        List singletonList = Collections.singletonList(new C3758xd990f62c(setdatacollectionenabled.MediaDescriptionCompat, ContentFrameLayout.write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, Iterables.C35273.read.dark_gray, (Resources.Theme) null)));
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        return new RestrictedComponentContainer(str, (List<C3758xd990f62c>) singletonList);
    }
}
