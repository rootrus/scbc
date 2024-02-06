package p040o;

import java.util.ArrayList;

/* renamed from: o.drawableStateChanged */
public class drawableStateChanged extends setImageResource {
    public ArrayList<setImageResource> setExpandedActionViewsExclusive = new ArrayList<>();

    public void MediaBrowserCompat$MediaItem() {
        this.setExpandedActionViewsExclusive.clear();
        super.MediaBrowserCompat$MediaItem();
    }

    public final void read(int i, int i2) {
        super.read(i, i2);
        int size = this.setExpandedActionViewsExclusive.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.setExpandedActionViewsExclusive.get(i3).read(MediaDescriptionCompat(), MediaBrowserCompat$SearchResultReceiver());
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        super.MediaSessionCompat$ResultReceiverWrapper();
        ArrayList<setImageResource> arrayList = this.setExpandedActionViewsExclusive;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                setImageResource setimageresource = this.setExpandedActionViewsExclusive.get(i);
                setimageresource.read(MediaBrowserCompat$CustomActionResultReceiver(), RatingCompat());
                if (!(setimageresource instanceof setImageDrawable)) {
                    setimageresource.MediaSessionCompat$ResultReceiverWrapper();
                }
            }
        }
    }

    public void MediaSessionCompat$QueueItem() {
        MediaSessionCompat$ResultReceiverWrapper();
        ArrayList<setImageResource> arrayList = this.setExpandedActionViewsExclusive;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                setImageResource setimageresource = this.setExpandedActionViewsExclusive.get(i);
                if (setimageresource instanceof drawableStateChanged) {
                    ((drawableStateChanged) setimageresource).MediaSessionCompat$QueueItem();
                }
            }
        }
    }

    public final void read(AppCompatAutoCompleteTextView appCompatAutoCompleteTextView) {
        super.read(appCompatAutoCompleteTextView);
        int size = this.setExpandedActionViewsExclusive.size();
        for (int i = 0; i < size; i++) {
            this.setExpandedActionViewsExclusive.get(i).read(appCompatAutoCompleteTextView);
        }
    }

    public final setImageDrawable PlaybackStateCompat() {
        setImageResource setimageresource = this.AbsActionBarView;
        setImageDrawable setimagedrawable = (setImageDrawable) this;
        while (setimageresource != null) {
            setImageResource setimageresource2 = setimageresource.AbsActionBarView;
            if (setimageresource instanceof setImageDrawable) {
                setimagedrawable = (setImageDrawable) setimageresource;
            }
            setimageresource = setimageresource2;
        }
        return setimagedrawable;
    }
}
