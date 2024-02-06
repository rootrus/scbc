package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import p040o.ImgReviewEditCntrl;
import p040o.StandardTable;
import p040o.access$2300;

/* renamed from: o.addLicenseFoundEventListener */
public class addLicenseFoundEventListener extends writeUInt64NoTag<PassportParameters_Factory> {
    public setOnStreetViewPanoramaChangeListener IconCompatParcelizer;
    public final createCollection MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final StandardTable.Column.KeySet MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public final StandardTable.Column.EntrySetIterator.C38201 MediaDescriptionCompat;
    public NativeSessionFile read;
    public final AbstractLinkedIterator write;

    @HmlPinActivity
    public addLicenseFoundEventListener(createCollection createcollection, AbstractLinkedIterator abstractLinkedIterator, StandardTable.Column.EntrySetIterator.C38201 r3, StandardTable.Column.KeySet keySet, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = createcollection;
        this.write = abstractLinkedIterator;
        this.MediaDescriptionCompat = r3;
        this.MediaBrowserCompat$SearchResultReceiver = keySet;
    }

    /* renamed from: o.addLicenseFoundEventListener$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<fromScreenLocation> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(addLicenseFoundEventListener addlicensefoundeventlistener, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            isUserNavigationEnabled isusernavigationenabled;
            String str;
            List<userDataToJson> list;
            String str2;
            String str3;
            String str4;
            setOnStreetViewPanoramaClickListener setonstreetviewpanoramaclicklistener;
            setOnStreetViewPanoramaClickListener setonstreetviewpanoramaclicklistener2;
            String str5;
            String str6;
            String str7;
            fromScreenLocation fromscreenlocation = (fromScreenLocation) obj;
            addLicenseFoundEventListener.write(addLicenseFoundEventListener.this);
            StandardTable.Column.KeySet MediaBrowserCompat$SearchResultReceiver = addLicenseFoundEventListener.this.MediaBrowserCompat$SearchResultReceiver;
            String str8 = addLicenseFoundEventListener.this.read.MediaDescriptionCompat;
            String str9 = addLicenseFoundEventListener.this.read.MediaBrowserCompat$ItemReceiver;
            setOnStreetViewPanoramaChangeListener IconCompatParcelizer = addLicenseFoundEventListener.this.IconCompatParcelizer;
            List<isZoomGesturesEnabled> list2 = null;
            if (fromscreenlocation != null) {
                isusernavigationenabled = fromscreenlocation.MediaMetadataCompat;
            } else {
                isusernavigationenabled = null;
            }
            C5147x5198ad67 populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver = new C5147x5198ad67();
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.read = str8;
            String str10 = "";
            if (str9 != null && !str9.equals(str10)) {
                str9 = str9.replace("-", str10);
            }
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.write = str9;
            if (isusernavigationenabled != null) {
                str = isusernavigationenabled.MediaBrowserCompat$ItemReceiver;
            } else {
                str = null;
            }
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (str != null && !str.isEmpty()) {
                str = getICheckDeserializerRtti.IconCompatParcelizer(getICheckDeserializerRtti.ParcelableVolumeInfo(str));
            }
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$ResultReceiverWrapper = isusernavigationenabled.IconCompatParcelizer;
            String str11 = isusernavigationenabled.MediaDescriptionCompat;
            if (str11 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (str11 != null && !str11.isEmpty()) {
                str11 = getICheckDeserializerRtti.IconCompatParcelizer(getICheckDeserializerRtti.ParcelableVolumeInfo(str11));
            }
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$QueueItem = str11;
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.ParcelableVolumeInfo = isusernavigationenabled.MediaMetadataCompat;
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver = isusernavigationenabled.read;
            List<StreetViewPanorama> list3 = isusernavigationenabled.write;
            if (list3 != null) {
                Iterable<StreetViewPanorama> iterable = list3;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (StreetViewPanorama streetViewPanorama : iterable) {
                    if (streetViewPanorama != null) {
                        str7 = streetViewPanorama.MediaBrowserCompat$ItemReceiver;
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    String str12 = streetViewPanorama.IconCompatParcelizer;
                    if (str12 != null && !str12.isEmpty()) {
                        str12 = getICheckDeserializerRtti.IconCompatParcelizer(getICheckDeserializerRtti.ParcelableVolumeInfo(str12));
                    }
                    onGetStartedClick.IconCompatParcelizer((Object) str12, "Utilities.formatAmountDo…lsAndSeparator(it.amount)");
                    StringBuilder sb = new StringBuilder();
                    String str13 = streetViewPanorama.MediaBrowserCompat$CustomActionResultReceiver;
                    if (str13 != null && !str13.isEmpty()) {
                        str13 = getICheckDeserializerRtti.IconCompatParcelizer(getICheckDeserializerRtti.ParcelableVolumeInfo(str13));
                    }
                    sb.append(str13);
                    sb.append(" THB");
                    arrayList.add(new userDataToJson(str7, str12, sb.toString()));
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.RatingCompat = list;
            if (fromscreenlocation.MediaBrowserCompat$ItemReceiver == null || isusernavigationenabled.MediaBrowserCompat$CustomActionResultReceiver == null) {
                str2 = str10;
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str14 = fromscreenlocation.MediaBrowserCompat$ItemReceiver;
                if (str14 == null) {
                    str6 = null;
                } else if (str14 != null) {
                    str6 = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str14).toString();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                sb2.append(str6);
                sb2.append(" ");
                sb2.append(MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer("dd MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd'T'HH:mm:ss", isusernavigationenabled.MediaBrowserCompat$CustomActionResultReceiver)));
                str2 = sb2.toString();
            }
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem = str2;
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat = fromscreenlocation.read;
            if (!(fromscreenlocation.MediaBrowserCompat$CustomActionResultReceiver == null || isusernavigationenabled.MediaBrowserCompat$CustomActionResultReceiver == null)) {
                StringBuilder sb3 = new StringBuilder();
                String str15 = fromscreenlocation.MediaBrowserCompat$CustomActionResultReceiver;
                if (str15 == null) {
                    str5 = null;
                } else if (str15 != null) {
                    str5 = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str15).toString();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                sb3.append(str5);
                sb3.append(" ");
                sb3.append(MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer("dd MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd'T'HH:mm:ss", isusernavigationenabled.MediaBrowserCompat$CustomActionResultReceiver)));
                str10 = sb3.toString();
            }
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat = str10;
            if (IconCompatParcelizer == null || (setonstreetviewpanoramaclicklistener2 = IconCompatParcelizer.RatingCompat) == null) {
                str3 = null;
            } else {
                str3 = setonstreetviewpanoramaclicklistener2.MediaBrowserCompat$CustomActionResultReceiver;
            }
            boolean z = false;
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$Token = !GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str3, "0", false);
            if (IconCompatParcelizer == null || (setonstreetviewpanoramaclicklistener = IconCompatParcelizer.RatingCompat) == null) {
                str4 = null;
            } else {
                str4 = setonstreetviewpanoramaclicklistener.MediaBrowserCompat$CustomActionResultReceiver;
            }
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.AlertController$RecycleListView = str4;
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.PlaybackStateCompat = fromscreenlocation.MediaDescriptionCompat;
            isUserNavigationEnabled isusernavigationenabled2 = fromscreenlocation.MediaMetadataCompat;
            if (isusernavigationenabled2 != null) {
                list2 = isusernavigationenabled2.MediaBrowserCompat$MediaItem;
            }
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.PlaybackStateCompat$CustomAction = MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(list2);
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = fromscreenlocation.write;
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = fromscreenlocation.IconCompatParcelizer;
            CharSequence charSequence = fromscreenlocation.write;
            populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver.f2921x50fd9e4a = !(charSequence == null || charSequence.length() == 0);
            populateBinaryImageData populatebinaryimagedata = new populateBinaryImageData(populatebinaryimagedata_mediabrowsercompat_customactionresultreceiver, (byte) 0);
            onGetStartedClick.IconCompatParcelizer((Object) populatebinaryimagedata, "ScbsAccountDetailDisplay…y())\n            .build()");
            addLicenseFoundEventListener addlicensefoundeventlistener = addLicenseFoundEventListener.this;
            ImgReviewEditCntrl.C3496a aVar = new ImgReviewEditCntrl.C3496a(populatebinaryimagedata);
            if (addlicensefoundeventlistener.RatingCompat != null) {
                z = true;
            }
            if (z) {
                aVar.IconCompatParcelizer(addlicensefoundeventlistener.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            addLicenseFoundEventListener.this.MediaBrowserCompat$ItemReceiver(addLicenseFoundEventListener.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(addLicenseFoundEventListener addlicensefoundeventlistener) {
        if (addlicensefoundeventlistener.RatingCompat != null) {
            addlicensefoundeventlistener.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(addLicenseFoundEventListener addlicensefoundeventlistener) {
        if (addlicensefoundeventlistener.RatingCompat != null) {
            addlicensefoundeventlistener.RatingCompat.aj_();
        }
    }
}
