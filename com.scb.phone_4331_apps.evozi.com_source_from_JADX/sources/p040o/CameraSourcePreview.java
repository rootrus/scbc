package p040o;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

/* renamed from: o.CameraSourcePreview */
public final class CameraSourcePreview extends PaybackPeriodAdapter$SelectedItemHolder_ViewBinding<Location> {
    public static DebitCardResetOtpActivity<Location> write(TransferToMeStep1Adapter$LocalViewHolder_ViewBinding transferToMeStep1Adapter$LocalViewHolder_ViewBinding, TransferToMeStep1Adapter$LocalViewHolder transferToMeStep1Adapter$LocalViewHolder) {
        return DebitCardResetOtpActivity.create(new CameraSourcePreview(transferToMeStep1Adapter$LocalViewHolder_ViewBinding)).compose(new C7088x8ecc07bc(transferToMeStep1Adapter$LocalViewHolder.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver));
    }

    private CameraSourcePreview(TransferToMeStep1Adapter$LocalViewHolder_ViewBinding transferToMeStep1Adapter$LocalViewHolder_ViewBinding) {
        super(transferToMeStep1Adapter$LocalViewHolder_ViewBinding);
    }

    public final void read(GoogleApiClient googleApiClient, onOkClick<? super Location> onokclick) {
        Location lastLocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
        if (!onokclick.isDisposed()) {
            if (lastLocation != null) {
                onokclick.MediaBrowserCompat$CustomActionResultReceiver(lastLocation);
            }
            onokclick.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
