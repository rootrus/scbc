package com.scb.phone.view.fragment.prepaid.traveltab;

import android.content.DialogInterface;
import p040o.getAddress6FieldName;
import p040o.onGetStartedClick;

final class PrepaidTravelServicesTabFragment$MediaBrowserCompat$ItemReceiver implements DialogInterface.OnClickListener {
    private /* synthetic */ PrepaidTravelServicesTabFragment read;

    PrepaidTravelServicesTabFragment$MediaBrowserCompat$ItemReceiver(PrepaidTravelServicesTabFragment prepaidTravelServicesTabFragment) {
        this.read = prepaidTravelServicesTabFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getAddress6FieldName getaddress6fieldname = this.read.presenter;
        if (getaddress6fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress6fieldname.MediaBrowserCompat$ItemReceiver(PrepaidTravelServicesTabFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read).RatingCompat);
    }
}
