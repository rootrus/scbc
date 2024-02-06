package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.List;

/* renamed from: o.constrainedSetMultimap */
public abstract class constrainedSetMultimap<Input, DisplayOut> extends constrainedListMultimap {
    public abstract DisplayOut MediaBrowserCompat$ItemReceiver(Input input);

    public constrainedSetMultimap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public List<DisplayOut> MediaBrowserCompat$ItemReceiver(List<Input> list) {
        return MediaBrowserCompat$ItemReceiver(list, new constrainedEntry(this));
    }
}
