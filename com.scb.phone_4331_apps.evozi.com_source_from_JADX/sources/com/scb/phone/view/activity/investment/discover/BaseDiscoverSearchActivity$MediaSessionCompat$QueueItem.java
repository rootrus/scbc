package com.scb.phone.view.activity.investment.discover;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import p040o.onGetStartedClick;
import p040o.populateThreadData;
import p040o.setRequestUserName;

final class BaseDiscoverSearchActivity$MediaSessionCompat$QueueItem implements NestedScrollView.IconCompatParcelizer {
    private /* synthetic */ BaseDiscoverSearchActivity write;

    BaseDiscoverSearchActivity$MediaSessionCompat$QueueItem(BaseDiscoverSearchActivity baseDiscoverSearchActivity) {
        this.write = baseDiscoverSearchActivity;
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        boolean z;
        int i3;
        BaseDiscoverSearchActivity.write(this.write, i, i2);
        onGetStartedClick.IconCompatParcelizer((Object) nestedScrollView, "scrollView");
        View childAt = nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1);
        if (childAt != null) {
            int measuredHeight = (childAt.getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) - 250;
            boolean z2 = false;
            boolean z3 = i >= measuredHeight;
            if (i > i2) {
                z2 = true;
            }
            if (z3 && z2) {
                setRequestUserName setrequestusername = this.write.presenter;
                if (setrequestusername == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                populateThreadData populatethreaddata = setrequestusername.MediaDescriptionCompat;
                if (populatethreaddata != null) {
                    z = populatethreaddata.read;
                } else {
                    z = true;
                }
                if (!z) {
                    String str = setrequestusername.MediaBrowserCompat$MediaItem;
                    populateThreadData populatethreaddata2 = setrequestusername.MediaDescriptionCompat;
                    if (populatethreaddata2 != null) {
                        i3 = populatethreaddata2.MediaBrowserCompat$CustomActionResultReceiver;
                    } else {
                        i3 = 20;
                    }
                    setrequestusername.MediaBrowserCompat$CustomActionResultReceiver(str, i3, setrequestusername.MediaBrowserCompat$ItemReceiver, setrequestusername.read);
                }
            }
        }
    }
}
