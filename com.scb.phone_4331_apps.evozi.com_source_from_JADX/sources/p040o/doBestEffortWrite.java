package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import retrofit2.Response;

/* renamed from: o.doBestEffortWrite */
public final class doBestEffortWrite extends FragmentBuilder_BindSummaryFragment {
    public final moveCamera write(Response<SingleDataEntity<removeAllListeners>> response) {
        String str = response.headers().get("Api-Auth");
        SingleDataEntity body = response.body();
        removeAllListeners removealllisteners = (removeAllListeners) body.getData();
        if (!IconCompatParcelizer((setCurrentItemInternal) body).MediaBrowserCompat$ItemReceiver.equals(setPageTransformer.SUCCESS.status)) {
            zabr.MediaBrowserCompat$ItemReceiver(body);
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        if (removealllisteners == null) {
            return new moveCamera();
        }
        return new moveCamera(removealllisteners.write, removealllisteners.IconCompatParcelizer, removealllisteners.read, FragmentBuilder_BindSummaryFragment.write(removealllisteners.MediaMetadataCompat, (OffsetDateTime) null), str2, removealllisteners.RatingCompat, removealllisteners.MediaBrowserCompat$CustomActionResultReceiver, removealllisteners.MediaBrowserCompat$ItemReceiver);
    }
}
