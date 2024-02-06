package p040o;

import p040o.FieldNamingPolicy;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingPolicy$2$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3352x19672e6f<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$SearchResultReceiver> {
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ FieldNamingPolicy.C33452 read;

    public C3352x19672e6f(FieldNamingPolicy.C33452 r1, String str) {
        this.read = r1;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        final getFirstName$MediaBrowserCompat$SearchResultReceiver getfirstname_mediabrowsercompat_searchresultreceiver = (getFirstName$MediaBrowserCompat$SearchResultReceiver) obj;
        getfirstname_mediabrowsercompat_searchresultreceiver.AlertController$RecycleListView();
        getfirstname_mediabrowsercompat_searchresultreceiver.write(false);
        partitionImpl MediaBrowserCompat$ItemReceiver2 = this.read.read;
        String str = this.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity r4 = new FundFactSheetActivity<standardStartAndWait, HmlVerifyPhoneValidateOtpActivity>(this) {
            private /* synthetic */ C3352x19672e6f IconCompatParcelizer;

            {
                this.IconCompatParcelizer = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                standardStartAndWait standardstartandwait = (standardStartAndWait) obj;
                onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
                FieldNamingPolicy.C33452.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.read, standardstartandwait);
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        };
        FundFactSheetActivity r5 = new FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity>(this) {
            private /* synthetic */ C3352x19672e6f read;

            {
                this.read = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                onGetStartedClick.write((Object) th, "e");
                getfirstname_mediabrowsercompat_searchresultreceiver.aj_();
                getfirstname_mediabrowsercompat_searchresultreceiver.write(this.read.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        };
        onGetStartedClick.write((Object) str, Name.MARK);
        onGetStartedClick.write((Object) r4, "onSuccess");
        onGetStartedClick.write((Object) r5, "onError");
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$SearchResultReceiver.read(r4, r5, new installIfNeededAsync$MediaBrowserCompat$ItemReceiver(str), new partitionImpl$MediaBrowserCompat$MediaItem(MediaBrowserCompat$ItemReceiver2), MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver);
    }
}
