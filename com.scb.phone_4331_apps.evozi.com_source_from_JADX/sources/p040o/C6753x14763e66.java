package p040o;

import android.database.Cursor;

/* renamed from: o.FragmentBuilder_BindSMELandingFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver */
final class C6753x14763e66 extends CheckEligibilityActivity implements FundFactSheetActivity<C6746xde52ab60, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ Cursor read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6753x14763e66(Cursor cursor) {
        super(1);
        this.read = cursor;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        C6746xde52ab60 fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver = (C6746xde52ab60) obj;
        onGetStartedClick.write((Object) fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver, "$receiver");
        Cursor cursor = this.read;
        fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = cursor.getLong(cursor.getColumnIndex("_id"));
        Cursor cursor2 = this.read;
        String string = cursor2.getString(cursor2.getColumnIndex("request"));
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(getColumnIndex(COLUMN_REQUEST))");
        onGetStartedClick.write((Object) string, "<set-?>");
        fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = string;
        Cursor cursor3 = this.read;
        String string2 = cursor3.getString(cursor3.getColumnIndex("request_type"));
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(getColumnIndex(COLUMN_REQUEST_TYPE))");
        FragmentBuilder_BindRiskSelectionFragment valueOf = FragmentBuilder_BindRiskSelectionFragment.valueOf(string2);
        onGetStartedClick.write((Object) valueOf, "<set-?>");
        fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.read = valueOf;
        Cursor cursor4 = this.read;
        fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = Long.valueOf(cursor4.getLong(cursor4.getColumnIndex("timestamp")));
        Cursor cursor5 = this.read;
        String string3 = cursor5.getString(cursor5.getColumnIndex("touchpoint_uri"));
        onGetStartedClick.IconCompatParcelizer((Object) string3, "getString(getColumnIndex(COLUMN_TOUCHPOINT))");
        onGetStartedClick.write((Object) string3, "<set-?>");
        fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = string3;
        Cursor cursor6 = this.read;
        String string4 = cursor6.getString(cursor6.getColumnIndex("host_uri"));
        onGetStartedClick.IconCompatParcelizer((Object) string4, "getString(getColumnIndex(COLUMN_HOST))");
        onGetStartedClick.write((Object) string4, "<set-?>");
        fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = string4;
        Cursor cursor7 = this.read;
        String string5 = cursor7.getString(cursor7.getColumnIndex("site_key"));
        onGetStartedClick.IconCompatParcelizer((Object) string5, "getString(getColumnIndex(COLUMN_SITE_KEY))");
        onGetStartedClick.write((Object) string5, "<set-?>");
        fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.write = string5;
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
