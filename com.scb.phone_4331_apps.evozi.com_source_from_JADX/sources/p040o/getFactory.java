package p040o;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.InstanceIdResult;
import com.scb.phone.AndroidApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.getFactory */
public final class getFactory extends IndoorBuilding {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getFactory(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
    }

    public static String MediaBrowserCompat$ItemReceiver(List<getLocale> list, int i) {
        onGetStartedClick.write((Object) list, "sectionItems");
        Collection arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((getLocale) next).MediaBrowserCompat$CustomActionResultReceiver == i) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (getLocale getlocale : (List) arrayList) {
            HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(arrayList2, getlocale.MediaBrowserCompat$ItemReceiver.get(0).MediaBrowserCompat$ItemReceiver);
        }
        Collection arrayList3 = new ArrayList();
        for (Object next2 : (List) arrayList2) {
            if (((getAttributions) next2).MediaBrowserCompat$CustomActionResultReceiver) {
                arrayList3.add(next2);
            }
        }
        Iterable<getAttributions> iterable = (List) arrayList3;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList4 = new ArrayList(((Collection) iterable).size());
        for (getAttributions getattributions : iterable) {
            arrayList4.add(getattributions.MediaBrowserCompat$ItemReceiver);
        }
        List list2 = (List) arrayList4;
        onGetStartedClick.write((Object) list2, "$this$firstOrNull");
        String str = (String) (list2.isEmpty() ? null : list2.get(0));
        return str == null ? "0" : str;
    }

    /* renamed from: o.getFactory$write */
    public static final class write implements OnSuccessListener {
        private final /* synthetic */ AndroidApplication write;

        private write() {
        }

        public /* synthetic */ write(AndroidApplication androidApplication) {
            this.write = androidApplication;
        }

        public final void onSuccess(Object obj) {
            AndroidApplication androidApplication = this.write;
            InstanceIdResult instanceIdResult = (InstanceIdResult) obj;
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("FirebaseInstanceId.getInstance().getInstanceId() : %s", instanceIdResult.getToken());
            String token = instanceIdResult.getToken();
            SharedPreferences.Editor edit = androidApplication.getSharedPreferences("FCM_TOKEN", 0).edit();
            edit.putString("FCM_TOKEN", token);
            edit.apply();
        }
    }
}
