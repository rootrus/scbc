package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFocusAreas */
public final /* synthetic */ class getFocusAreas implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ LocationSettingsResult IconCompatParcelizer;
    private final /* synthetic */ surfaceDestroyed MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getFocusAreas(surfaceDestroyed surfacedestroyed, LocationSettingsResult locationSettingsResult) {
        this.MediaBrowserCompat$CustomActionResultReceiver = surfacedestroyed;
        this.IconCompatParcelizer = locationSettingsResult;
    }

    public final void IconCompatParcelizer(Object obj) {
        surfaceDestroyed surfacedestroyed = this.MediaBrowserCompat$CustomActionResultReceiver;
        LocationSettingsResult locationSettingsResult = this.IconCompatParcelizer;
        injectRttiCheckDeserializer$MediaBrowserCompat$MediaItem injectrtticheckdeserializer_mediabrowsercompat_mediaitem = (injectRttiCheckDeserializer$MediaBrowserCompat$MediaItem) obj;
        sortedBackingMap sortedbackingmap = surfacedestroyed.MediaBrowserCompat$ItemReceiver;
        boolean itemInvoker = surfacedestroyed.IconCompatParcelizer.write.setItemInvoker();
        ArrayList arrayList = new ArrayList();
        LocationSettingsStates locationSettingsStates = locationSettingsResult.MediaBrowserCompat$MediaItem;
        if (locationSettingsStates != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver2 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver2.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_name_label);
            MediaBrowserCompat$CustomActionResultReceiver2.RatingCompat = locationSettingsStates.MediaBrowserCompat$MediaItem;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver2);
        }
        isNetworkLocationUsable isnetworklocationusable = locationSettingsResult.MediaBrowserCompat$CustomActionResultReceiver;
        if (isnetworklocationusable != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(isnetworklocationusable.IconCompatParcelizer);
            sb.append("\n");
            sb.append(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(isnetworklocationusable.MediaBrowserCompat$ItemReceiver, itemInvoker));
            sb.append("\n");
            sb.append(isnetworklocationusable.MediaBrowserCompat$CustomActionResultReceiver);
            String obj2 = sb.toString();
            setFiles MediaBrowserCompat$CustomActionResultReceiver3 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver3.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_account_label);
            MediaBrowserCompat$CustomActionResultReceiver3.RatingCompat = obj2;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver3);
        }
        if (locationSettingsStates != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver4 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver4.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_gender_label);
            MediaBrowserCompat$CustomActionResultReceiver4.RatingCompat = locationSettingsStates.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver4);
            setFiles MediaBrowserCompat$CustomActionResultReceiver5 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver5.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_nationality_label);
            MediaBrowserCompat$CustomActionResultReceiver5.RatingCompat = locationSettingsStates.MediaMetadataCompat;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver5);
            setFiles MediaBrowserCompat$CustomActionResultReceiver6 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver6.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_dob_label);
            MediaBrowserCompat$CustomActionResultReceiver6.RatingCompat = sortedbackingmap.IconCompatParcelizer("dd MMM yyyy", locationSettingsStates.write);
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver6);
            setFiles MediaBrowserCompat$CustomActionResultReceiver7 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver7.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_id_label);
            MediaBrowserCompat$CustomActionResultReceiver7.RatingCompat = getICheckDeserializerRtti.IconCompatParcelizer(true, false, locationSettingsStates.MediaBrowserCompat$ItemReceiver);
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver7);
            setFiles MediaBrowserCompat$CustomActionResultReceiver8 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver8.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_email_label);
            MediaBrowserCompat$CustomActionResultReceiver8.RatingCompat = locationSettingsStates.read;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver8);
            setFiles MediaBrowserCompat$CustomActionResultReceiver9 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver9.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_mobile_label);
            MediaBrowserCompat$CustomActionResultReceiver9.RatingCompat = getICheckDeserializerRtti.MediaSessionCompat$ResultReceiverWrapper(locationSettingsStates.MediaDescriptionCompat);
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver9);
            setFiles MediaBrowserCompat$CustomActionResultReceiver10 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver10.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_occupation_label);
            MediaBrowserCompat$CustomActionResultReceiver10.RatingCompat = locationSettingsStates.RatingCompat;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver10);
            setFiles MediaBrowserCompat$CustomActionResultReceiver11 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver11.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_soi_label);
            MediaBrowserCompat$CustomActionResultReceiver11.RatingCompat = locationSettingsStates.MediaSessionCompat$Token;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver11);
        }
        isBleUsable isbleusable = locationSettingsResult.IconCompatParcelizer;
        if (!(isbleusable == null || isbleusable.MediaBrowserCompat$CustomActionResultReceiver == null)) {
            StringBuilder sb2 = new StringBuilder();
            List<String> list = isbleusable.MediaBrowserCompat$CustomActionResultReceiver;
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (!"".equals(str)) {
                    sb2.append(str);
                    if (i != list.size() - 1) {
                        sb2.append("\n");
                    }
                }
            }
            setFiles MediaBrowserCompat$CustomActionResultReceiver12 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver12.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_house_label);
            MediaBrowserCompat$CustomActionResultReceiver12.RatingCompat = sb2.toString();
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver12);
        }
        isBleUsable isbleusable2 = locationSettingsResult.write;
        if (!(isbleusable2 == null || isbleusable2.MediaBrowserCompat$CustomActionResultReceiver == null)) {
            StringBuilder sb3 = new StringBuilder();
            List<String> list2 = isbleusable2.MediaBrowserCompat$CustomActionResultReceiver;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                String str2 = list2.get(i2);
                if (!"".equals(str2)) {
                    sb3.append(str2);
                    if (i2 != list2.size() - 1) {
                        sb3.append("\n");
                    }
                }
            }
            setFiles MediaBrowserCompat$CustomActionResultReceiver13 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver13.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_mailing_address_label);
            MediaBrowserCompat$CustomActionResultReceiver13.RatingCompat = sb3.toString();
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver13);
        }
        isLocationUsable islocationusable = locationSettingsResult.read;
        if (islocationusable != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver14 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver14.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_marital_status_label);
            MediaBrowserCompat$CustomActionResultReceiver14.RatingCompat = islocationusable.MediaBrowserCompat$ItemReceiver;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver14);
        }
        LocationStatusCodes locationStatusCodes = locationSettingsResult.MediaDescriptionCompat;
        if (locationStatusCodes != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver15 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver15.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_spouse_name_label);
            MediaBrowserCompat$CustomActionResultReceiver15.RatingCompat = locationStatusCodes.read;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver15);
            if ("P1".equals(locationStatusCodes.write.read)) {
                setFiles MediaBrowserCompat$CustomActionResultReceiver16 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver16.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_spouse_id_label);
                MediaBrowserCompat$CustomActionResultReceiver16.RatingCompat = getICheckDeserializerRtti.IconCompatParcelizer(true, false, locationStatusCodes.write.MediaBrowserCompat$CustomActionResultReceiver);
                arrayList.add(MediaBrowserCompat$CustomActionResultReceiver16);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(locationStatusCodes.write.write);
                sb4.append(locationStatusCodes.write.MediaBrowserCompat$CustomActionResultReceiver);
                String obj3 = sb4.toString();
                setFiles MediaBrowserCompat$CustomActionResultReceiver17 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver17.read = sortedbackingmap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_spouse_passport_label);
                MediaBrowserCompat$CustomActionResultReceiver17.RatingCompat = obj3;
                arrayList.add(MediaBrowserCompat$CustomActionResultReceiver17);
            }
        }
        injectrtticheckdeserializer_mediabrowsercompat_mediaitem.read(arrayList);
        sortedBackingMap sortedbackingmap2 = surfacedestroyed.MediaBrowserCompat$ItemReceiver;
        ArrayList arrayList2 = new ArrayList();
        LocationSettingsStatusCodes locationSettingsStatusCodes = locationSettingsResult.RatingCompat;
        if (locationSettingsStatusCodes != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver18 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver18.read = sortedbackingmap2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_sof_label);
            MediaBrowserCompat$CustomActionResultReceiver18.RatingCompat = locationSettingsStatusCodes.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver18);
        }
        isNetworkLocationPresent isnetworklocationpresent = locationSettingsResult.MediaBrowserCompat$ItemReceiver;
        if (isnetworklocationpresent != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver19 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver19.read = sortedbackingmap2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_inv_exp_label);
            MediaBrowserCompat$CustomActionResultReceiver19.RatingCompat = isnetworklocationpresent.MediaBrowserCompat$ItemReceiver;
            arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver19);
            setFiles MediaBrowserCompat$CustomActionResultReceiver20 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver20.read = sortedbackingmap2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.mf_onboarding_review_withholding_tax_label);
            MediaBrowserCompat$CustomActionResultReceiver20.RatingCompat = isnetworklocationpresent.IconCompatParcelizer;
            arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver20);
        }
        injectrtticheckdeserializer_mediabrowsercompat_mediaitem.MediaBrowserCompat$CustomActionResultReceiver(arrayList2);
        injectrtticheckdeserializer_mediabrowsercompat_mediaitem.aj_();
    }
}
