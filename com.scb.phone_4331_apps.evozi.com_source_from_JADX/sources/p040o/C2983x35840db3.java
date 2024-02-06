package p040o;

import p040o.C$Gson$Preconditions;
import p040o.Constraints;
import p040o.TypeAdapter;

/* renamed from: o.$Gson$Preconditions$MediaBrowserCompat$CustomActionResultReceiver */
public class C2983x35840db3 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<GiftingActivity_ViewBinding> {
    private /* synthetic */ C$Gson$Preconditions IconCompatParcelizer;
    private final ComponentContainer MediaBrowserCompat$CustomActionResultReceiver;

    public final /* synthetic */ void onNext(Object obj) {
        GiftingActivity_ViewBinding giftingActivity_ViewBinding = (GiftingActivity_ViewBinding) obj;
        C$Gson$Preconditions _gson_preconditions = this.IconCompatParcelizer;
        JsonArray jsonArray = JsonArray.IconCompatParcelizer;
        boolean z = true;
        if (_gson_preconditions.RatingCompat != null) {
            jsonArray.IconCompatParcelizer(_gson_preconditions.RatingCompat);
        }
        if (giftingActivity_ViewBinding.read.isEmpty()) {
            C$Gson$Preconditions _gson_preconditions2 = this.IconCompatParcelizer;
            TypeAdapter.C38781 r0 = TypeAdapter.C38781.write;
            if (_gson_preconditions2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r0.IconCompatParcelizer(_gson_preconditions2.RatingCompat);
                return;
            }
            return;
        }
        C$Gson$Preconditions _gson_preconditions3 = this.IconCompatParcelizer;
        int i = giftingActivity_ViewBinding.read.get(0).MediaBrowserCompat$ItemReceiver;
        ComponentContainer componentContainer = this.MediaBrowserCompat$CustomActionResultReceiver;
        _gson_preconditions3.IconCompatParcelizer.write(new Constraints.ConstrainedSortedSet(Integer.valueOf(i), 0), false);
        _gson_preconditions3.IconCompatParcelizer.IconCompatParcelizer(new C$Gson$Preconditions.write(componentContainer));
    }

    public C2983x35840db3(C$Gson$Preconditions _gson_preconditions, ComponentContainer componentContainer) {
        this.IconCompatParcelizer = _gson_preconditions;
        this.MediaBrowserCompat$CustomActionResultReceiver = componentContainer;
    }

    public final void onError(Throwable th) {
        C$Gson$Preconditions _gson_preconditions = this.IconCompatParcelizer;
        JsonArray jsonArray = JsonArray.IconCompatParcelizer;
        boolean z = true;
        if (_gson_preconditions.RatingCompat != null) {
            jsonArray.IconCompatParcelizer(_gson_preconditions.RatingCompat);
        }
        if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            C$Gson$Preconditions _gson_preconditions2 = this.IconCompatParcelizer;
            JsonStreamParser jsonStreamParser = JsonStreamParser.MediaBrowserCompat$CustomActionResultReceiver;
            if (_gson_preconditions2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                jsonStreamParser.IconCompatParcelizer(_gson_preconditions2.RatingCompat);
            }
        }
    }
}
