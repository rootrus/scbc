package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;
import java.util.ArrayList;
import java.util.List;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.setAborted */
public final /* synthetic */ class setAborted implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ScbsAccountDetailPresenter IconCompatParcelizer;
    private final /* synthetic */ populateBinaryImageData MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setAborted(ScbsAccountDetailPresenter scbsAccountDetailPresenter, populateBinaryImageData populatebinaryimagedata) {
        this.IconCompatParcelizer = scbsAccountDetailPresenter;
        this.MediaBrowserCompat$ItemReceiver = populatebinaryimagedata;
    }

    public final void IconCompatParcelizer(Object obj) {
        ScbsAccountDetailPresenter scbsAccountDetailPresenter = this.IconCompatParcelizer;
        populateBinaryImageData populatebinaryimagedata = this.MediaBrowserCompat$ItemReceiver;
        getMicrAmount.read read = (getMicrAmount.read) obj;
        read.IconCompatParcelizer(populatebinaryimagedata.MediaBrowserCompat$CustomActionResultReceiver);
        List<userDataToJson> list = populatebinaryimagedata.MediaBrowserCompat$SearchResultReceiver;
        boolean z = false;
        read.read(!(list == null || list.isEmpty()));
        read.RatingCompat(populatebinaryimagedata.MediaMetadataCompat);
        read.MediaBrowserCompat$MediaItem(populatebinaryimagedata.AlertController$RecycleListView);
        if (populatebinaryimagedata.PlaybackStateCompat$CustomAction == null) {
            read.IconCompatParcelizer((List<getMarkerFile>) new ArrayList());
        } else {
            read.IconCompatParcelizer(populatebinaryimagedata.PlaybackStateCompat$CustomAction);
        }
        read.MediaBrowserCompat$ItemReceiver(populatebinaryimagedata.f2920x50fd9e4a);
        read.MediaBrowserCompat$CustomActionResultReceiver(populatebinaryimagedata.ParcelableVolumeInfo);
        setAbortedReason setabortedreason = new setAbortedReason(populatebinaryimagedata);
        if (scbsAccountDetailPresenter.RatingCompat != null) {
            setabortedreason.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
        }
        setImageType setimagetype = new setImageType(populatebinaryimagedata);
        if (scbsAccountDetailPresenter.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setimagetype.IconCompatParcelizer(scbsAccountDetailPresenter.RatingCompat);
        }
    }
}
