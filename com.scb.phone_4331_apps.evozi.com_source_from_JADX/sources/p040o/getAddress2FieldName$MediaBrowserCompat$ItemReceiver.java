package p040o;

import p040o.onCameraMove;
import p040o.setDiskSpace;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAddress2FieldName$MediaBrowserCompat$ItemReceiver */
public final class getAddress2FieldName$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<onCameraMove, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ ImmutableList MediaBrowserCompat$CustomActionResultReceiver;
    final /* synthetic */ getAddress2FieldName MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getAddress2FieldName$MediaBrowserCompat$ItemReceiver(getAddress2FieldName getaddress2fieldname, ImmutableList immutableList) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = getaddress2fieldname;
        this.MediaBrowserCompat$CustomActionResultReceiver = immutableList;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        final onCameraMove oncameramove = (onCameraMove) obj;
        onGetStartedClick.write((Object) oncameramove, "response");
        getAddress2FieldName.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        getAddress2FieldName getaddress2fieldname = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C1243xf34efb9f>(this) {
            private /* synthetic */ getAddress2FieldName$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

            {
                this.MediaBrowserCompat$ItemReceiver = r1;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                C1243xf34efb9f onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver = (C1243xf34efb9f) obj;
                onCameraMove oncameramove = oncameramove;
                onGetStartedClick.write((Object) oncameramove, "entity");
                String str = oncameramove.MediaBrowserCompat$CustomActionResultReceiver;
                String str2 = oncameramove.MediaMetadataCompat;
                String write = handleLine.write(Double.valueOf(oncameramove.write));
                onGetStartedClick.IconCompatParcelizer((Object) write, "transformFund(entity.fromAmount)");
                String write2 = handleLine.write(Double.valueOf(oncameramove.MediaDescriptionCompat));
                onGetStartedClick.IconCompatParcelizer((Object) write2, "transformFund(entity.toAmount)");
                onCameraMove.IconCompatParcelizer iconCompatParcelizer = oncameramove.read;
                setDiskSpace.read read = new setDiskSpace.read(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                onCameraMove.IconCompatParcelizer iconCompatParcelizer2 = oncameramove.MediaBrowserCompat$MediaItem;
                setDiskSpace.read read2 = new setDiskSpace.read(iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver, iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver);
                onCameraMove.write write3 = oncameramove.MediaBrowserCompat$ItemReceiver;
                setDiskSpace.write write4 = new setDiskSpace.write(write3.write, write3.MediaBrowserCompat$CustomActionResultReceiver);
                String str3 = oncameramove.MediaBrowserCompat$SearchResultReceiver;
                if (str3 == null) {
                    str3 = "0";
                }
                onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver.read(new setDiskSpace(str, str2, write, write2, read, read2, write4, str3), getAddress2FieldName.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer));
            }
        };
        if (getaddress2fieldname.RatingCompat != null) {
            r1.IconCompatParcelizer(getaddress2fieldname.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
