package p040o;

import android.content.SharedPreferences;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import p040o.AbstractMultimap;
import p040o.DocumentData;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.zzct;

/* renamed from: o.zzgk */
public final class zzgk implements AbstractMultimap.MultisetView {
    private final Gson MediaBrowserCompat$ItemReceiver;
    private final SharedPreferences write;

    @HmlPinActivity
    public zzgk(SharedPreferences sharedPreferences, Gson gson) {
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) gson, "gson");
        this.write = sharedPreferences;
        this.MediaBrowserCompat$ItemReceiver = gson;
    }

    /* renamed from: o.zzgk$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public final int IconCompatParcelizer;
        public final long MediaBrowserCompat$CustomActionResultReceiver;
        public final int MediaBrowserCompat$ItemReceiver;
        public final int MediaBrowserCompat$MediaItem;
        public final Rect MediaBrowserCompat$SearchResultReceiver;
        public final int RatingCompat;
        public final int read;
        public final int write;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(RecyclerView.setContentView setcontentview, int i, int i2) {
            this.MediaBrowserCompat$MediaItem = setcontentview.write.getWidth();
            this.MediaBrowserCompat$ItemReceiver = setcontentview.write.getHeight();
            this.MediaBrowserCompat$CustomActionResultReceiver = setcontentview.MediaBrowserCompat$ItemReceiver;
            this.read = setcontentview.write.getLeft();
            int top = setcontentview.write.getTop();
            this.RatingCompat = top;
            this.write = i - this.read;
            this.IconCompatParcelizer = i2 - top;
            this.MediaBrowserCompat$SearchResultReceiver = new Rect();
            FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.MediaBrowserCompat$ItemReceiver(setcontentview.write, this.MediaBrowserCompat$SearchResultReceiver);
            FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.read(setcontentview);
        }

        public IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, RecyclerView.setContentView setcontentview) {
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$MediaItem = setcontentview.write.getWidth();
            this.MediaBrowserCompat$ItemReceiver = setcontentview.write.getHeight();
            this.MediaBrowserCompat$SearchResultReceiver = new Rect(iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
            FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.read(setcontentview);
            this.read = iconCompatParcelizer.read;
            this.RatingCompat = iconCompatParcelizer.RatingCompat;
            float f = (float) this.MediaBrowserCompat$MediaItem;
            float f2 = f * 0.5f;
            float f3 = ((float) this.MediaBrowserCompat$ItemReceiver) * 0.5f;
            float f4 = (((float) iconCompatParcelizer.write) - (((float) iconCompatParcelizer.MediaBrowserCompat$MediaItem) * 0.5f)) + f2;
            float f5 = (((float) iconCompatParcelizer.IconCompatParcelizer) - (((float) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) * 0.5f)) + f3;
            if (f4 >= BitmapDescriptorFactory.HUE_RED && f4 < f) {
                f2 = f4;
            }
            this.write = (int) f2;
            if (f5 >= BitmapDescriptorFactory.HUE_RED && f5 < ((float) this.MediaBrowserCompat$ItemReceiver)) {
                f3 = f5;
            }
            this.IconCompatParcelizer = (int) f3;
        }
    }

    public final List<String> IconCompatParcelizer() {
        String string = this.write.getString("KEY_REWARD_SEARCH_CACHE", (String) null);
        if (string != null) {
            onGetStartedClick.IconCompatParcelizer((Object) string, "it");
            Object fromJson = this.MediaBrowserCompat$ItemReceiver.fromJson(string, new ArrayList().getClass());
            onGetStartedClick.IconCompatParcelizer((Object) fromJson, "gson.fromJson(string, mu…stOf<String>().javaClass)");
            List<String> list = (List) fromJson;
            if (list != null) {
                return list;
            }
        }
        return HmlNationalIdActivity.IconCompatParcelizer;
    }

    public final void MediaBrowserCompat$ItemReceiver(List<String> list) {
        onGetStartedClick.write((Object) list, "values");
        SharedPreferences.Editor edit = this.write.edit();
        String json = this.MediaBrowserCompat$ItemReceiver.toJson((Object) list);
        onGetStartedClick.IconCompatParcelizer((Object) json, "gson.toJson(list)");
        edit.putString("KEY_REWARD_SEARCH_CACHE", json).apply();
    }

    /* renamed from: o.zzgk$zza */
    public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ zzjv IconCompatParcelizer;

        public /* synthetic */ zza(zzjv zzjv) {
            this.IconCompatParcelizer = zzjv;
        }

        public final Object write(Object obj) {
            return this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver.write((DocumentData.Justification) obj, zzct.zza.CONSUMER);
        }
    }
}
