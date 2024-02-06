package p040o;

import android.text.TextUtils;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.Headers;
import p040o.GoogleMap;
import retrofit2.Response;

/* renamed from: o.KeepForSdkWithMembers */
public final class KeepForSdkWithMembers extends FragmentBuilder_BindSummaryFragment {
    public final ScriptIntrinsicConvolve5x5 MediaBrowserCompat$CustomActionResultReceiver;
    private final initialize read;

    @HmlPinActivity
    public KeepForSdkWithMembers(ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5) {
        this.read = new initialize(scriptIntrinsicConvolve5x5);
        this.MediaBrowserCompat$CustomActionResultReceiver = scriptIntrinsicConvolve5x5;
    }

    public final PlaceAutocomplete MediaBrowserCompat$CustomActionResultReceiver(Response<setIndicatorPageChangeListener<SingleDataEntity<PINMessageException>>> response) {
        Headers headers = response.headers();
        String str = headers.get("Api-Auth");
        String str2 = headers.get("Api-Refresh");
        setIndicatorPageChangeListener body = response.body();
        if (!setPageTransformer.SUCCESS.status.equals(IconCompatParcelizer((setCurrentItemInternal) body).MediaBrowserCompat$ItemReceiver)) {
            zabr.MediaBrowserCompat$ItemReceiver(body);
        }
        if (TextUtils.isEmpty(str)) {
            setOnPageChangeListener setonpagechangelistener = new setOnPageChangeListener();
            setonpagechangelistener.IconCompatParcelizer("1999");
            zabr.IconCompatParcelizer(setonpagechangelistener);
        }
        GoogleMap.OnMarkerDragListener IconCompatParcelizer = this.read.IconCompatParcelizer((PINMessageException) ((SingleDataEntity) body.read).getData());
        PlaceAutocomplete placeAutocomplete = new PlaceAutocomplete();
        placeAutocomplete.write = str;
        placeAutocomplete.IconCompatParcelizer = str2;
        placeAutocomplete.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        return placeAutocomplete;
    }

    public final PlaceAutocomplete MediaBrowserCompat$ItemReceiver(Response<SingleDataEntity<PINMessageException>> response) {
        Headers headers = response.headers();
        String str = headers.get("Api-Auth");
        String str2 = headers.get("Api-Refresh");
        SingleDataEntity body = response.body();
        PINMessageException pINMessageException = (PINMessageException) body.getData();
        if (!IconCompatParcelizer((setCurrentItemInternal) body).MediaBrowserCompat$ItemReceiver.equals(setPageTransformer.SUCCESS.status)) {
            zabr.MediaBrowserCompat$ItemReceiver(body);
        }
        if (body.getStatus() != null && PlaceAutocompleteFragment.PIN_LOCKED.code.equals(body.getStatus().write())) {
            zabr.IconCompatParcelizer(body.getStatus());
        }
        if (TextUtils.isEmpty(str)) {
            setOnPageChangeListener setonpagechangelistener = new setOnPageChangeListener();
            setonpagechangelistener.IconCompatParcelizer("1999");
            zabr.IconCompatParcelizer(setonpagechangelistener);
        }
        GoogleMap.OnMarkerDragListener IconCompatParcelizer = this.read.IconCompatParcelizer(pINMessageException);
        PlaceAutocomplete placeAutocomplete = new PlaceAutocomplete();
        placeAutocomplete.write = str;
        placeAutocomplete.IconCompatParcelizer = str2;
        placeAutocomplete.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        return placeAutocomplete;
    }
}
