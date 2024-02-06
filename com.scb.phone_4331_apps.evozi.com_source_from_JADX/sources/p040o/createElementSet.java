package p040o;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import p040o.AbstractMultimap;
import p040o.GoogleMap;

/* renamed from: o.createElementSet */
public final class createElementSet {
    public final AbstractMultimap.AsMap read;

    @HmlPinActivity
    public createElementSet(AbstractMultimap.AsMap asMap) {
        onGetStartedClick.write((Object) asMap, "stickyParamRepositoryContractor");
        this.read = asMap;
    }

    @HmlSetNTBPinActivity
    /* renamed from: o.createElementSet$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public GoogleMap.OnMarkerDragListener IconCompatParcelizer;
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
        public final SharedPreferences MediaBrowserCompat$ItemReceiver;
        public final Gson read;
        public zzvf write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(SharedPreferences sharedPreferences) {
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            this.read = new Gson();
            this.MediaBrowserCompat$ItemReceiver = sharedPreferences;
        }

        public final List<PlacePhotoMetadataResult> write() {
            GoogleMap.OnMarkerDragListener onMarkerDragListener = this.IconCompatParcelizer;
            if (onMarkerDragListener == null || onMarkerDragListener.AppCompatViewInflater == null) {
                return new ArrayList();
            }
            return this.IconCompatParcelizer.AppCompatViewInflater;
        }

        public final void IconCompatParcelizer(int i) {
            GoogleMap.OnMarkerDragListener onMarkerDragListener = this.IconCompatParcelizer;
            if (onMarkerDragListener == null) {
                onMarkerDragListener = new GoogleMap.OnMarkerDragListener();
            }
            onMarkerDragListener.MediaSessionCompat$ResultReceiverWrapper = i;
            this.IconCompatParcelizer = onMarkerDragListener;
        }

        public final void IconCompatParcelizer(zzvf zzvf) {
            zzvf zzvf2 = this.write;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzvf2 != null && !zzvf2.equals(zzvf);
            this.write = zzvf;
        }
    }
}
