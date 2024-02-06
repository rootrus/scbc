package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p040o.ScriptGroup;

/* renamed from: o.addInput */
public class addInput extends compare {
    /* access modifiers changed from: protected */
    public void MediaMetadataCompat() {
        write((getGlobal) new addInput$MediaBrowserCompat$ItemReceiver(this));
        MediaBrowserCompat$CustomActionResultReceiver(new IconCompatParcelizer(this));
        IconCompatParcelizer((getReturn) new addInput$MediaBrowserCompat$CustomActionResultReceiver(this));
        IconCompatParcelizer((setGlobal) new read(this));
    }

    /* access modifiers changed from: protected */
    public final void RatingCompat() {
        MediaDescriptionCompat();
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, List<Object> list) {
        return !list.isEmpty() || super.MediaBrowserCompat$CustomActionResultReceiver(setcontentview, list);
    }

    /* renamed from: o.addInput$IconCompatParcelizer */
    public static class IconCompatParcelizer extends setArg {
        public final /* bridge */ /* synthetic */ void write(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
        }

        public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScriptGroup.ConnectLine connectLine) {
            getClosure getclosure = (getClosure) connectLine;
            setSwitchPadding write = SwitchCompat.write(getclosure.IconCompatParcelizer.write);
            write.MediaBrowserCompat$ItemReceiver(RatingCompat());
            write.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            write(getclosure, getclosure.IconCompatParcelizer, write);
        }

        public IconCompatParcelizer(seperateArgsAndBindings seperateargsandbindings) {
            super(seperateargsandbindings);
        }

        public final boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview) {
            RatingCompat(setcontentview);
            MediaBrowserCompat$ItemReceiver(new getClosure(setcontentview));
            return true;
        }

        public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview) {
            setcontentview.write.setAlpha(1.0f);
        }

        public final /* synthetic */ void read(RecyclerView.setContentView setcontentview) {
            setcontentview.write.setAlpha(1.0f);
        }
    }

    /* renamed from: o.addInput$read */
    public static class read extends setGlobal {
        public final /* bridge */ /* synthetic */ void read(RecyclerView.setContentView setcontentview) {
        }

        public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScriptGroup.ConnectLine connectLine) {
            ScriptGroup.Closure.ValueAndSize valueAndSize = (ScriptGroup.Closure.ValueAndSize) connectLine;
            View view = valueAndSize.read.write;
            int i = valueAndSize.MediaBrowserCompat$CustomActionResultReceiver;
            int i2 = valueAndSize.IconCompatParcelizer;
            int i3 = valueAndSize.MediaBrowserCompat$ItemReceiver;
            int i4 = valueAndSize.write;
            if (i - i2 != 0) {
                SwitchCompat.write(view).read((float) BitmapDescriptorFactory.HUE_RED);
            }
            if (i3 - i4 != 0) {
                SwitchCompat.write(view).MediaMetadataCompat(BitmapDescriptorFactory.HUE_RED);
            }
            setSwitchPadding write = SwitchCompat.write(view);
            write.MediaBrowserCompat$ItemReceiver(RatingCompat());
            write(valueAndSize, valueAndSize.read, write);
        }

        public final /* synthetic */ void write(ScriptGroup.ConnectLine connectLine, RecyclerView.setContentView setcontentview) {
            ScriptGroup.Closure.ValueAndSize valueAndSize = (ScriptGroup.Closure.ValueAndSize) connectLine;
            View view = setcontentview.write;
            int i = valueAndSize.MediaBrowserCompat$CustomActionResultReceiver - valueAndSize.IconCompatParcelizer;
            int i2 = valueAndSize.MediaBrowserCompat$ItemReceiver - valueAndSize.write;
            if (i != 0) {
                SwitchCompat.write(view).read((float) BitmapDescriptorFactory.HUE_RED);
            }
            if (i2 != 0) {
                SwitchCompat.write(view).MediaMetadataCompat(BitmapDescriptorFactory.HUE_RED);
            }
            if (i != 0) {
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            }
            if (i2 != 0) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }

        public read(seperateArgsAndBindings seperateargsandbindings) {
            super(seperateargsandbindings);
        }

        public final boolean MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i, int i2, int i3, int i4) {
            View view = setcontentview.write;
            int translationX = (int) (((float) i) + setcontentview.write.getTranslationX());
            int translationY = (int) (((float) i2) + setcontentview.write.getTranslationY());
            RatingCompat(setcontentview);
            int i5 = i3 - translationX;
            int i6 = i4 - translationY;
            ScriptGroup.Closure.ValueAndSize valueAndSize = new ScriptGroup.Closure.ValueAndSize(setcontentview, translationX, translationY, i3, i4);
            if (i5 == 0 && i6 == 0) {
                MediaBrowserCompat$CustomActionResultReceiver(valueAndSize.read);
                if (valueAndSize.read != valueAndSize.read) {
                    return false;
                }
                valueAndSize.read = null;
                return false;
            }
            if (i5 != 0) {
                view.setTranslationX((float) (-i5));
            }
            if (i6 != 0) {
                view.setTranslationY((float) (-i6));
            }
            MediaBrowserCompat$ItemReceiver(valueAndSize);
            return true;
        }

        public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview) {
            View view = setcontentview.write;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
