package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.constrainedSortedSetMultimap */
public abstract class constrainedSortedSetMultimap<Input, DisplayOut> extends constrainedListMultimap {
    public abstract DisplayOut MediaBrowserCompat$ItemReceiver(Input input, boolean z);

    public constrainedSortedSetMultimap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
