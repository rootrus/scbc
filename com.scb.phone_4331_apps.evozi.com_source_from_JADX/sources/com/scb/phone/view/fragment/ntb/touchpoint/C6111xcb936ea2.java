package com.scb.phone.view.fragment.ntb.touchpoint;

import android.view.View;
import p040o.C4241dE;
import p040o.FundFactSheetActivity;
import p040o.ImmutableSortedSet;
import p040o.access$212;
import p040o.checkKeyValue;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.ntb.touchpoint.TouchPointInputCidFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6111xcb936ea2 implements View.OnClickListener {
    private /* synthetic */ TouchPointInputCidFragment MediaBrowserCompat$ItemReceiver;

    C6111xcb936ea2(TouchPointInputCidFragment touchPointInputCidFragment) {
        this.MediaBrowserCompat$ItemReceiver = touchPointInputCidFragment;
    }

    public final void onClick(View view) {
        C4241dE dEVar = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (dEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = dEVar.read;
        if (str != null) {
            if (dEVar.RatingCompat != null) {
                dEVar.RatingCompat.AlertController$RecycleListView();
            }
            checkKeyValue checkkeyvalue = dEVar.write;
            FundFactSheetActivity write = new C4241dE.write(dEVar, str);
            FundFactSheetActivity iconCompatParcelizer = new C4241dE.IconCompatParcelizer(dEVar);
            String str2 = dEVar.MediaBrowserCompat$ItemReceiver;
            if (str2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mobileNumber");
            }
            ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(str, str2);
            onGetStartedClick.write((Object) write, "onSuccess");
            onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
            onGetStartedClick.write((Object) immutableSortedSet, "request");
            checkkeyvalue.write.IconCompatParcelizer(write, iconCompatParcelizer, new access$212.read(immutableSortedSet), checkkeyvalue.MediaBrowserCompat$ItemReceiver);
        }
    }
}
