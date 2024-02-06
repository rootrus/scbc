package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.GoogleMap;
import p040o.newOnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAddress4FieldName$MediaBrowserCompat$CustomActionResultReceiver */
public final class C4495xe0420d5c extends CheckEligibilityActivity implements FundFactSheetActivity<List<? extends GoogleMap.OnCircleClickListener>, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ getAddress4FieldName IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4495xe0420d5c(getAddress4FieldName getaddress4fieldname) {
        super(1);
        this.IconCompatParcelizer = getaddress4fieldname;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        onGetStartedClick.write((Object) list, "it");
        getAddress4FieldName.write(this.IconCompatParcelizer);
        this.IconCompatParcelizer.IconCompatParcelizer = list;
        getAddress4FieldName getaddress4fieldname = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<newOnDeviceIdExtractor.write>(this) {
            private /* synthetic */ C4495xe0420d5c MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                newOnDeviceIdExtractor.write write = (newOnDeviceIdExtractor.write) obj;
                LittleEndianDataInputStream unused = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.read;
                List MediaBrowserCompat$CustomActionResultReceiver = getAddress4FieldName.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "list");
                Iterable<GoogleMap.OnCircleClickListener> iterable = MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
                for (GoogleMap.OnCircleClickListener onCircleClickListener : iterable) {
                    arrayList.add(new getBackground(onCircleClickListener.MediaBrowserCompat$CustomActionResultReceiver));
                }
                write.MediaBrowserCompat$ItemReceiver((List) arrayList);
            }
        };
        if (getaddress4fieldname.RatingCompat != null) {
            r0.IconCompatParcelizer(getaddress4fieldname.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
