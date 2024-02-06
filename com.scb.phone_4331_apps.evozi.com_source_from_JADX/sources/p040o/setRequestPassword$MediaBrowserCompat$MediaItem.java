package p040o;

import java.util.List;
import p040o.setRequestPassword;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestPassword$MediaBrowserCompat$MediaItem */
final class setRequestPassword$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundFactSheetActivity<populateThreadsList, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ setRequestPassword MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    setRequestPassword$MediaBrowserCompat$MediaItem(setRequestPassword setrequestpassword) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = setrequestpassword;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        populateThreadsList populatethreadslist = (populateThreadsList) obj;
        onGetStartedClick.write((Object) populatethreadslist, "it");
        setRequestPassword.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        setRequestPassword setrequestpassword = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C53573.IconCompatParcelizer;
        boolean z = false;
        if (setrequestpassword.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setrequestpassword.RatingCompat);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = populatethreadslist;
        List<CrashlyticsUncaughtExceptionHandler> list = setRequestPassword.write(this.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer;
        if (list != null) {
            setRequestPassword setrequestpassword2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) list, "list");
            setrequestpassword2.write(!list.isEmpty(), new setRequestPassword$MediaBrowserCompat$SearchResultReceiver(list));
        }
        List<CrashlyticsReportWithSessionId> list2 = setRequestPassword.write(this.MediaBrowserCompat$CustomActionResultReceiver).MediaMetadataCompat;
        if (list2 != null) {
            setRequestPassword setrequestpassword3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) list2, "list");
            setrequestpassword3.write(!list2.isEmpty(), new setRequestPassword.MediaMetadataCompat(list2));
        }
        String str = setRequestPassword.write(this.MediaBrowserCompat$CustomActionResultReceiver).read;
        if (str != null) {
            setRequestPassword setrequestpassword4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) str, "dateAsOf");
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new setRequestPassword.RatingCompat(str);
            if (setrequestpassword4.RatingCompat != null) {
                z = true;
            }
            if (z) {
                ratingCompat.IconCompatParcelizer(setrequestpassword4.RatingCompat);
            }
        }
        List<isAutomaticDataCollectionEnabled> list3 = setRequestPassword.write(this.MediaBrowserCompat$CustomActionResultReceiver).MediaDescriptionCompat;
        if (list3 != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.write(!list3.isEmpty(), new C5358x983820f1(list3, this));
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
