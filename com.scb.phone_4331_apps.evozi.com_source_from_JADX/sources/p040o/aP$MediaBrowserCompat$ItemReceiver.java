package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.Tables;
import p040o.writeUInt64NoTag;
import p040o.zzm;

/* renamed from: o.aP$MediaBrowserCompat$ItemReceiver */
public final class aP$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzm.zzd, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ C3978aP MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ setLength read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aP$MediaBrowserCompat$ItemReceiver(C3978aP aPVar, setLength setlength) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = aPVar;
        this.read = setlength;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        setLength setlength;
        Object obj2;
        zzm.zzd zzd = (zzm.zzd) obj;
        onGetStartedClick.write((Object) zzd, "response");
        Tables.TransposeTable.C38381 write = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        List<String> list = zzd.write;
        boolean z = true;
        if (list == null || list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(write.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_accounts_item_empty_title));
            sb.append("\n");
            sb.append(write.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_accounts_item_empty_description));
            str = sb.toString();
        } else {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (!(((String) next).length() == 0)) {
                    arrayList.add(next);
                }
            }
            str = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver((List) arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (FundFactSheetActivity) null, 62);
        }
        List IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.read;
        if (IconCompatParcelizer != null) {
            Iterator it = IconCompatParcelizer.iterator();
            while (true) {
                setlength = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) obj2, (Object) this.read)) {
                    break;
                }
            }
            if (obj2 instanceof setLength) {
                setlength = obj2;
            }
            setLength setlength2 = setlength;
            if (setlength2 != null) {
                setlength2.MediaMetadataCompat = str;
            }
            if (setlength2 != null) {
                setlength2.MediaBrowserCompat$SearchResultReceiver = false;
            }
            C3978aP aPVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer ap_mediabrowsercompat_itemreceiver_mediabrowsercompat_customactionresultreceiver = new C3981xba7b6778(IconCompatParcelizer);
            if (aPVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ap_mediabrowsercompat_itemreceiver_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(aPVar.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
