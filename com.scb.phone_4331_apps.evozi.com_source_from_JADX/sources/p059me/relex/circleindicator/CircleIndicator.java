package p059me.relex.circleindicator;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import p040o.TouchPointFillInfoActivity;
import p040o.onActivityCreated;
import p059me.relex.circleindicator.BaseCircleIndicator;

/* renamed from: me.relex.circleindicator.CircleIndicator */
public class CircleIndicator extends BaseCircleIndicator {
    public final DataSetObserver MediaBrowserCompat$CustomActionResultReceiver = new DataSetObserver() {
        public final void onChanged() {
            super.onChanged();
            if (CircleIndicator.this.MediaBrowserCompat$ItemReceiver != null) {
                onActivityCreated adapter = CircleIndicator.this.MediaBrowserCompat$ItemReceiver.getAdapter();
                int count = adapter != null ? adapter.getCount() : 0;
                if (count != CircleIndicator.this.getChildCount()) {
                    if (CircleIndicator.this.IconCompatParcelizer < count) {
                        CircleIndicator circleIndicator = CircleIndicator.this;
                        circleIndicator.IconCompatParcelizer = circleIndicator.MediaBrowserCompat$ItemReceiver.getCurrentItem();
                    } else {
                        CircleIndicator.this.IconCompatParcelizer = -1;
                    }
                    CircleIndicator.this.MediaBrowserCompat$ItemReceiver();
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public ViewPager MediaBrowserCompat$ItemReceiver;
    private final ViewPager.MediaMetadataCompat read = new ViewPager.MediaMetadataCompat() {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            if (CircleIndicator.this.MediaBrowserCompat$ItemReceiver.getAdapter() != null && CircleIndicator.this.MediaBrowserCompat$ItemReceiver.getAdapter().getCount() > 0) {
                CircleIndicator.this.IconCompatParcelizer(i);
            }
        }
    };

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(int i) {
        super.IconCompatParcelizer(i);
    }

    public /* bridge */ /* synthetic */ void setIndicatorCreatedListener(BaseCircleIndicator.read read2) {
        super.setIndicatorCreatedListener(read2);
    }

    public final /* bridge */ /* synthetic */ void write(int i, int i2) {
        super.write(i, i2);
    }

    public final /* bridge */ /* synthetic */ void write(TouchPointFillInfoActivity touchPointFillInfoActivity) {
        super.write(touchPointFillInfoActivity);
    }

    public CircleIndicator(Context context) {
        super(context);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setViewPager(ViewPager viewPager) {
        this.MediaBrowserCompat$ItemReceiver = viewPager;
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.IconCompatParcelizer = -1;
            MediaBrowserCompat$ItemReceiver();
            this.MediaBrowserCompat$ItemReceiver.removeOnPageChangeListener(this.read);
            this.MediaBrowserCompat$ItemReceiver.addOnPageChangeListener(this.read);
            this.read.onPageSelected(this.MediaBrowserCompat$ItemReceiver.getCurrentItem());
        }
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$ItemReceiver() {
        int i;
        onActivityCreated adapter = this.MediaBrowserCompat$ItemReceiver.getAdapter();
        if (adapter == null) {
            i = 0;
        } else {
            i = adapter.getCount();
        }
        super.write(i, this.MediaBrowserCompat$ItemReceiver.getCurrentItem());
    }

    @Deprecated
    public void setOnPageChangeListener(ViewPager.MediaMetadataCompat mediaMetadataCompat) {
        ViewPager viewPager = this.MediaBrowserCompat$ItemReceiver;
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener(mediaMetadataCompat);
            this.MediaBrowserCompat$ItemReceiver.addOnPageChangeListener(mediaMetadataCompat);
            return;
        }
        throw new NullPointerException("can not find Viewpager , setViewPager first");
    }
}
