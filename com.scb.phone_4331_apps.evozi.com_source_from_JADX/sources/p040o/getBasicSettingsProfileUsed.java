package p040o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBasicSettingsProfileUsed */
public final /* synthetic */ class getBasicSettingsProfileUsed implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getResourcePackageName IconCompatParcelizer;
    private final /* synthetic */ setBasicSettingsProfileUsed MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getBasicSettingsProfileUsed(setBasicSettingsProfileUsed setbasicsettingsprofileused, getResourcePackageName getresourcepackagename) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setbasicsettingsprofileused;
        this.IconCompatParcelizer = getresourcepackagename;
    }

    public final void IconCompatParcelizer(Object obj) {
        setBasicSettingsProfileUsed setbasicsettingsprofileused = this.MediaBrowserCompat$CustomActionResultReceiver;
        getResourcePackageName getresourcepackagename = this.IconCompatParcelizer;
        CheckExtractActivity_MembersInjector.setPadding setpadding = (CheckExtractActivity_MembersInjector.setPadding) obj;
        setpadding.read(usingToString.read(getresourcepackagename));
        immutableSortedCopy immutablesortedcopy = setbasicsettingsprofileused.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RestrictedComponentContainer(immutablesortedcopy.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.refillable_feature_information_loan_type), getresourcepackagename.IconCompatParcelizer));
        if (getresourcepackagename.MediaBrowserCompat$SearchResultReceiver != null) {
            arrayList.add(new RestrictedComponentContainer(immutablesortedcopy.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.refillable_feature_information_borrower), immutableSortedCopy.MediaBrowserCompat$CustomActionResultReceiver(getresourcepackagename.MediaDescriptionCompat, getresourcepackagename.MediaMetadataCompat, getresourcepackagename.MediaBrowserCompat$SearchResultReceiver)));
        }
        arrayList.add(new RestrictedComponentContainer(immutablesortedcopy.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.refillable_feature_information_mortgage_no), getresourcepackagename.MediaBrowserCompat$MediaItem));
        arrayList.add(new RestrictedComponentContainer(immutablesortedcopy.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.refillable_feature_information_location), (List<C3758xd990f62c>) Collections.singletonList(new C3758xd990f62c(getresourcepackagename.ParcelableVolumeInfo))));
        CrashlyticsBackgroundWorker.C32164.read read = new CrashlyticsBackgroundWorker.C32164.read();
        read.MediaBrowserCompat$CustomActionResultReceiver = arrayList;
        read.write = true;
        setpadding.MediaBrowserCompat$ItemReceiver(read.MediaBrowserCompat$CustomActionResultReceiver());
    }
}
