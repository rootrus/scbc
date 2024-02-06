package p040o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;

/* renamed from: o.AndroidApplication */
public abstract class AndroidApplication<T> extends onActivityCreated {
    public ViewPager IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public List<? extends T> MediaBrowserCompat$ItemReceiver;
    private LayoutInflater MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final read<T> RatingCompat;
    public final IconCompatParcelizer read = new IconCompatParcelizer(this);
    public final Context write;

    /* renamed from: o.AndroidApplication$read */
    public interface read<U> {
        void IconCompatParcelizer();

        void read(U u);
    }

    /* renamed from: o.AndroidApplication$write */
    public enum write {
        LOADING,
        REFRESH,
        ITEM,
        NO_ITEMS
    }

    public abstract View MediaBrowserCompat$ItemReceiver(int i);

    public int getItemPosition(Object obj) {
        onGetStartedClick.write(obj, "object");
        return -2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write(obj, "object");
        return view == obj;
    }

    public AndroidApplication(Context context, read<T> read2) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) read2, "cardViewpagerListener");
        this.write = context;
        this.RatingCompat = read2;
        Object systemService = this.write.getSystemService("layout_inflater");
        if (systemService != null) {
            this.MediaMetadataCompat = (LayoutInflater) systemService;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* renamed from: o.AndroidApplication$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements ViewPager.MediaMetadataCompat {
        private /* synthetic */ AndroidApplication IconCompatParcelizer;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        IconCompatParcelizer(AndroidApplication androidApplication) {
            this.IconCompatParcelizer = androidApplication;
        }

        public final void onPageSelected(int i) {
            Collection collection = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (!(collection == null || collection.isEmpty())) {
                AndroidApplication androidApplication = this.IconCompatParcelizer;
                List<? extends T> list = androidApplication.MediaBrowserCompat$ItemReceiver;
                Object obj = list != null ? list.get(i) : null;
                if (obj == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                androidApplication.MediaBrowserCompat$ItemReceiver(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final LayoutInflater MediaBrowserCompat$ItemReceiver() {
        return this.MediaMetadataCompat;
    }

    public int getCount() {
        List<? extends T> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            if (list == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (!list.isEmpty()) {
                List<? extends T> list2 = this.MediaBrowserCompat$ItemReceiver;
                if (list2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                return list2.size();
            }
        }
        return 1;
    }

    public void MediaBrowserCompat$ItemReceiver(T t) {
        this.RatingCompat.read(t);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        onGetStartedClick.write((Object) viewGroup, "container");
        onGetStartedClick.write(obj, "object");
        viewGroup.removeView((View) obj);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        write write2;
        View view;
        onGetStartedClick.write((Object) viewGroup, "container");
        if (this.MediaBrowserCompat$ItemReceiver == null && this.MediaBrowserCompat$CustomActionResultReceiver) {
            write2 = write.LOADING;
        } else if (this.MediaBrowserCompat$ItemReceiver != null || this.MediaBrowserCompat$CustomActionResultReceiver) {
            List<? extends T> list = this.MediaBrowserCompat$ItemReceiver;
            if (list == null || list.size() != 0) {
                write2 = write.ITEM;
            } else {
                write2 = write.NO_ITEMS;
            }
        } else {
            write2 = write.REFRESH;
        }
        int i2 = postMessage.IconCompatParcelizer[write2.ordinal()];
        if (i2 == 1) {
            view = this.MediaMetadataCompat.inflate(R.layout.f84102131493636, (ViewGroup) null);
        } else if (i2 == 2) {
            view = this.MediaMetadataCompat.inflate(R.layout.f84622131493689, (ViewGroup) null);
            view.findViewById(R.id.rl_refresh_layout).setOnClickListener(new AndroidApplication$MediaBrowserCompat$ItemReceiver(this));
        } else if (i2 == 3) {
            view = this.MediaMetadataCompat.inflate(R.layout.f81812131493407, (ViewGroup) null);
        } else if (i2 == 4) {
            view = MediaBrowserCompat$ItemReceiver(i);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        viewGroup.addView(view, 0);
        onGetStartedClick.IconCompatParcelizer((Object) view, Promotion.ACTION_VIEW);
        return view;
    }
}
