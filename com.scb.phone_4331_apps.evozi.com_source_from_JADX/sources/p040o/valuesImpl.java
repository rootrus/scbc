package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: o.valuesImpl */
public final class valuesImpl extends constrainedSetMultimap<dispatch, ensureBackgroundStateListenerRegistered> {
    @HmlPinActivity
    public valuesImpl(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: read */
    public final ensureBackgroundStateListenerRegistered MediaBrowserCompat$ItemReceiver(dispatch dispatch) {
        ensureBackgroundStateListenerRegistered ensurebackgroundstatelistenerregistered = new ensureBackgroundStateListenerRegistered();
        C6932xfb9c3075 lifestyleCustomizationActivity$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver = dispatch.write;
        long j = lifestyleCustomizationActivity$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        long j2 = lifestyleCustomizationActivity$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        ensurebackgroundstatelistenerregistered.MediaBrowserCompat$ItemReceiver = new DataCollectionDefaultChange(j, j2);
        ensurebackgroundstatelistenerregistered.write = dispatch.read;
        ensurebackgroundstatelistenerregistered.read = dispatch.MediaBrowserCompat$CustomActionResultReceiver;
        ensurebackgroundstatelistenerregistered.MediaBrowserCompat$CustomActionResultReceiver = dispatch.MediaBrowserCompat$ItemReceiver;
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.select_reason);
        ArrayList arrayList = new ArrayList();
        arrayList.add(string);
        arrayList.addAll(Arrays.asList(dispatch.MediaDescriptionCompat));
        ensurebackgroundstatelistenerregistered.MediaDescriptionCompat = arrayList;
        ensurebackgroundstatelistenerregistered.RatingCompat = dispatch.MediaBrowserCompat$MediaItem;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.select_amount));
        for (long j3 = j; j3 <= j2; j3 += j) {
            arrayList2.add(NumberFormat.getInstance(Locale.getDefault()).format(j3));
        }
        ensurebackgroundstatelistenerregistered.IconCompatParcelizer = arrayList2;
        return ensurebackgroundstatelistenerregistered;
    }
}
