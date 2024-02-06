package p040o;

import p040o.PassportCaptureModule;

/* renamed from: o.getPropertyInfo */
public final class getPropertyInfo extends writeUInt64NoTag<PassportCaptureModule.C6974a> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getPropertyInfo(setItemIconTintList setitemicontintlist, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
