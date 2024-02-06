package p040o;

import java.util.ArrayList;
import p040o.access$2300;

/* renamed from: o.unmuteAutoTorch$MediaBrowserCompat$CustomActionResultReceiver */
public class unmuteAutoTorch$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<LocationSettingsStates> {
    private /* synthetic */ unmuteAutoTorch IconCompatParcelizer;

    public unmuteAutoTorch$MediaBrowserCompat$CustomActionResultReceiver(unmuteAutoTorch unmuteautotorch) {
        this.IconCompatParcelizer = unmuteautotorch;
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        LocationSettingsStates locationSettingsStates = (LocationSettingsStates) obj;
        super.onNext(locationSettingsStates);
        unmuteAutoTorch.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        getOrCreate read = this.IconCompatParcelizer.read;
        int write = this.IconCompatParcelizer.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        String[] split = locationSettingsStates.MediaBrowserCompat$MediaItem.split(" ");
        setFiles MediaBrowserCompat$CustomActionResultReceiver = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
        StringBuilder sb = new StringBuilder();
        sb.append(read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_hello));
        sb.append(" ");
        boolean z = true;
        sb.append(split[1]);
        MediaBrowserCompat$CustomActionResultReceiver.read = sb.toString();
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_hello_desc);
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver);
        setFiles MediaBrowserCompat$CustomActionResultReceiver2 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.read = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_name);
        MediaBrowserCompat$CustomActionResultReceiver2.RatingCompat = locationSettingsStates.MediaBrowserCompat$MediaItem;
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver2);
        setFiles MediaBrowserCompat$CustomActionResultReceiver3 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver3.read = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_gender);
        MediaBrowserCompat$CustomActionResultReceiver3.RatingCompat = locationSettingsStates.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver3);
        setFiles MediaBrowserCompat$CustomActionResultReceiver4 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver4.read = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_nationality);
        MediaBrowserCompat$CustomActionResultReceiver4.RatingCompat = locationSettingsStates.MediaMetadataCompat;
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver4);
        setFiles MediaBrowserCompat$CustomActionResultReceiver5 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver5.read = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_dob);
        MediaBrowserCompat$CustomActionResultReceiver5.RatingCompat = read.IconCompatParcelizer("dd MMM yyyy", locationSettingsStates.write);
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver5);
        setFiles MediaBrowserCompat$CustomActionResultReceiver6 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver6.read = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_id);
        MediaBrowserCompat$CustomActionResultReceiver6.RatingCompat = getICheckDeserializerRtti.IconCompatParcelizer(true, false, locationSettingsStates.MediaBrowserCompat$ItemReceiver);
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver6);
        setFiles MediaBrowserCompat$CustomActionResultReceiver7 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver7.read = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_email);
        MediaBrowserCompat$CustomActionResultReceiver7.RatingCompat = locationSettingsStates.read;
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver7);
        if (write == 0) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver8 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver8.read = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_occupation);
            MediaBrowserCompat$CustomActionResultReceiver8.RatingCompat = locationSettingsStates.RatingCompat;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver8);
            setFiles MediaBrowserCompat$CustomActionResultReceiver9 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver9.read = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_source_income);
            MediaBrowserCompat$CustomActionResultReceiver9.RatingCompat = locationSettingsStates.MediaSessionCompat$Token;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver9);
        }
        setFiles MediaBrowserCompat$CustomActionResultReceiver10 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver10.read = read.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_personal_info_mobile_number);
        MediaBrowserCompat$CustomActionResultReceiver10.MediaBrowserCompat$CustomActionResultReceiver = "MOBILE_NUMBER";
        if (locationSettingsStates.MediaBrowserCompat$SearchResultReceiver != null) {
            str = locationSettingsStates.MediaBrowserCompat$SearchResultReceiver.get(0).MediaBrowserCompat$ItemReceiver;
        } else {
            str = "";
        }
        MediaBrowserCompat$CustomActionResultReceiver10.RatingCompat = getICheckDeserializerRtti.MediaSessionCompat$ResultReceiverWrapper(str);
        MediaBrowserCompat$CustomActionResultReceiver10.MediaBrowserCompat$MediaItem = getOrCreate.write(locationSettingsStates.MediaBrowserCompat$SearchResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver10.MediaBrowserCompat$ItemReceiver = getOrCreate.read(locationSettingsStates.MediaBrowserCompat$SearchResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver10.MediaDescriptionCompat = true;
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver10);
        unmuteAutoTorch unmuteautotorch = this.IconCompatParcelizer;
        removeCameraInitializationFailedListener removecamerainitializationfailedlistener = new removeCameraInitializationFailedListener(arrayList);
        if (unmuteautotorch.RatingCompat == null) {
            z = false;
        }
        if (z) {
            removecamerainitializationfailedlistener.IconCompatParcelizer(unmuteautotorch.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        unmuteAutoTorch.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final void onComplete() {
        super.onComplete();
    }
}
