package com.scb.phone.view.fragment.findus;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;
import p040o.IdCaptureBackActivity_MembersInjector;
import p040o.ensureFileArrayNotNull;
import p040o.rsnAllocationSyncAll;
import p040o.rsnContextDestroy;

class BaseMapTabFragment$MediaBrowserCompat$ItemReceiver extends rsnContextDestroy<ensureFileArrayNotNull> {
    private /* synthetic */ BaseMapTabFragment MediaDescriptionCompat;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(IdCaptureBackActivity_MembersInjector idCaptureBackActivity_MembersInjector, MarkerOptions markerOptions) {
        ensureFileArrayNotNull ensurefilearraynotnull = (ensureFileArrayNotNull) idCaptureBackActivity_MembersInjector;
        if (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver != null) {
            markerOptions.icon(this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver);
            super.MediaBrowserCompat$ItemReceiver(ensurefilearraynotnull, markerOptions);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseMapTabFragment$MediaBrowserCompat$ItemReceiver(BaseMapTabFragment baseMapTabFragment, Context context, GoogleMap googleMap, rsnAllocationSyncAll<ensureFileArrayNotNull> rsnallocationsyncall) {
        super(context, googleMap, rsnallocationsyncall);
        this.MediaDescriptionCompat = baseMapTabFragment;
    }
}
