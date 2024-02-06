package p040o;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.Longs;

@HmlSetNTBPinActivity
/* renamed from: o.getKernelIDDst */
public class getKernelIDDst {
    public Collection<ZSYR2K> IconCompatParcelizer;
    public final notNull MediaBrowserCompat$CustomActionResultReceiver;
    private final createElementSet MediaBrowserCompat$ItemReceiver;
    public FirebaseAnalytics write;

    @HmlPinActivity
    public getKernelIDDst(Context context, createElementSet createelementset, Longs.LongArrayAsList longArrayAsList, notNull notnull) {
        this.write = FirebaseAnalytics.getInstance(context);
        this.MediaBrowserCompat$ItemReceiver = createelementset;
        this.MediaBrowserCompat$CustomActionResultReceiver = notnull;
    }

    public final void IconCompatParcelizer(Bundle bundle) {
        List list;
        createElementSet createelementset = this.MediaBrowserCompat$ItemReceiver;
        Collection arrayList = new ArrayList();
        for (Object next : createelementset.read.MediaBrowserCompat$ItemReceiver()) {
            if (((inject_base64Decoder) next).IconCompatParcelizer()) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        createelementset.read.read((List<? extends inject_base64Decoder>) list2);
        Iterable iterable = list2;
        onGetStartedClick.write((Object) iterable, "$this$reversed");
        if (((Collection) iterable).size() <= 1) {
            list = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(iterable);
        } else {
            list = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(iterable);
            onGetStartedClick.write((Object) list, "$this$reverse");
            Collections.reverse(list);
        }
        Iterable iterable2 = list;
        onGetStartedClick.write((Object) iterable2, "$this$asSequence");
        BaseJuristicPinActivity_ViewBinding read = JuristicRequestFormActivity.read(new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(iterable2), 10);
        onGetStartedClick.write((Object) read, "$this$withIndex");
        Map linkedHashMap = new LinkedHashMap();
        Iterator read2 = new BaseJuristicPinActivity(read).read();
        while (read2.hasNext()) {
            HmlNTBeKYCLandingActivity hmlNTBeKYCLandingActivity = (HmlNTBeKYCLandingActivity) read2.next();
            StringBuilder sb = new StringBuilder();
            sb.append("sticky_param_");
            sb.append(hmlNTBeKYCLandingActivity.MediaBrowserCompat$ItemReceiver);
            HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(sb.toString(), ((inject_base64Decoder) hmlNTBeKYCLandingActivity.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver());
            linkedHashMap.put(hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver, hmlVerifyEmailSuccessfulActivity.write);
        }
        for (ZSYR2K zsyr2k : Longs.LongArrayAsList.write(linkedHashMap)) {
            bundle.putString(zsyr2k.read, zsyr2k.write);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(Bundle bundle) {
        Collection<ZSYR2K> collection = this.IconCompatParcelizer;
        if (collection != null && !collection.isEmpty()) {
            for (ZSYR2K next : this.IconCompatParcelizer) {
                bundle.putString(next.read, next.write);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(String str, Bundle bundle) {
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer(bundle);
            bundle.putString("user_mode", this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer().mode.toUpperCase());
            MediaBrowserCompat$ItemReceiver(bundle);
            this.write.logEvent(str, bundle);
        }
    }

    public final void write(String str, ZSYR2K... zsyr2kArr) {
        if (!(str == null || str.length() == 0)) {
            Bundle bundle = new Bundle();
            for (ZSYR2K zsyr2k : zsyr2kArr) {
                bundle.putString(zsyr2k.read, zsyr2k.write);
            }
            MediaBrowserCompat$ItemReceiver(str, bundle);
        }
    }
}
