package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: o.newIdentityHashMap */
public final class newIdentityHashMap extends constrainedListMultimap {
    @HmlPinActivity
    public newIdentityHashMap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final FirebaseApiNotAvailableException MediaBrowserCompat$CustomActionResultReceiver(onUpgrade onupgrade) {
        lambdaFactory$ lambdafactory_;
        newIdentityHashMap newidentityhashmap = this;
        onUpgrade onupgrade2 = onupgrade;
        ArrayList arrayList = new ArrayList();
        List<getJobId> list = onupgrade2.write;
        int i = 0;
        while (i < list.size()) {
            getJobId getjobid = list.get(i);
            String str = getjobid.MediaBrowserCompat$CustomActionResultReceiver;
            String IconCompatParcelizer = newidentityhashmap.IconCompatParcelizer("dd MMM", CheckCaptureActivity.write("yyyy-MM-dd", getjobid.MediaBrowserCompat$SearchResultReceiver));
            String str2 = getjobid.MediaBrowserCompat$SearchResultReceiver;
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            String format = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(getjobid.MediaDescriptionCompat);
            String IconCompatParcelizer2 = newidentityhashmap.IconCompatParcelizer("dd MMM", CheckCaptureActivity.write("yyyy-MM-dd", getjobid.IconCompatParcelizer));
            String str3 = getjobid.IconCompatParcelizer;
            String str4 = getjobid.read;
            double random = Math.random();
            String str5 = getjobid.MediaBrowserCompat$ItemReceiver;
            arrayList.add(new FirebaseApp(str, IconCompatParcelizer, str2, format, IconCompatParcelizer2, str3, str4, String.valueOf(random), str5, getjobid.write));
            i++;
            newidentityhashmap = this;
        }
        Integer num = onupgrade2.MediaBrowserCompat$CustomActionResultReceiver;
        onDowngrade ondowngrade = onupgrade2.MediaBrowserCompat$ItemReceiver;
        if (ondowngrade == null) {
            lambdafactory_ = new lambdaFactory$();
        } else {
            lambdafactory_ = new lambdaFactory$(ondowngrade.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return new FirebaseApiNotAvailableException(arrayList, num, lambdafactory_);
    }
}
