package com.scb.phone.view.custom;

import java.util.ArrayList;
import java.util.List;
import p040o.clickShareSlip;
import p040o.completeSubmission;
import p040o.getAllowReturnTransitionOverlap;
import p040o.getNextTransition;
import p040o.getShortName;
import p040o.isSupportFragmentClass;
import p040o.show;
import p040o.zzvo;

public final class MonthYearPickerDialog$MediaBrowserCompat$ItemReceiver implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ clickShareSlip MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    private MonthYearPickerDialog$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ MonthYearPickerDialog$MediaBrowserCompat$ItemReceiver(clickShareSlip clickshareslip, String str, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = clickshareslip;
        this.write = str;
        this.IconCompatParcelizer = z;
    }

    public final boolean write(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        String str = this.write;
        boolean z = this.IconCompatParcelizer;
        zzvo zzvo = (zzvo) obj;
        if (!str.equals(zzvo.write)) {
            List<String> list = zzvo.MediaDescriptionCompat;
            ArrayList arrayList = new ArrayList();
            arrayList.add("TRANSFER_TARGET");
            show show = new show(arrayList);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new completeSubmission.read(list)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (issupportfragmentclass.IconCompatParcelizer != null) {
                if (!z) {
                    return true;
                }
                if (getShortName.TYPE_CURRENT.equals(zzvo.f3002x50fd9e4a) || getShortName.TYPE_SAVING.equals(zzvo.f3002x50fd9e4a)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
