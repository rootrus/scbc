package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.GoogleMap;
import p040o.LocalProjectProvider_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.hj$MediaBrowserCompat$CustomActionResultReceiver */
public final class hj$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<GoogleMap.InfoWindowAdapter, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C4768hj IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hj$MediaBrowserCompat$CustomActionResultReceiver(C4768hj hjVar) {
        super(1);
        this.IconCompatParcelizer = hjVar;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final GoogleMap.InfoWindowAdapter infoWindowAdapter = (GoogleMap.InfoWindowAdapter) obj;
        onGetStartedClick.write((Object) infoWindowAdapter, "response");
        C4768hj.write(this.IconCompatParcelizer);
        C4768hj hjVar = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider_MembersInjector.read>(this) {
            private /* synthetic */ hj$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                LocalProjectProvider_MembersInjector.read read2 = (LocalProjectProvider_MembersInjector.read) obj;
                newOutputStreamSupplier newoutputstreamsupplier = this.IconCompatParcelizer.IconCompatParcelizer.read;
                GoogleMap.InfoWindowAdapter infoWindowAdapter = infoWindowAdapter;
                onGetStartedClick.write((Object) infoWindowAdapter, "entity");
                Iterable<setTrafficEnabled> iterable = infoWindowAdapter.IconCompatParcelizer;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
                for (setTrafficEnabled IconCompatParcelizer2 : iterable) {
                    arrayList.add(newoutputstreamsupplier.IconCompatParcelizer(IconCompatParcelizer2));
                }
                read2.MediaBrowserCompat$CustomActionResultReceiver(new setModelClass((List) arrayList));
            }
        };
        if (hjVar.RatingCompat != null) {
            r1.IconCompatParcelizer(hjVar.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
