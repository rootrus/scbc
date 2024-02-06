package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.List;
import p040o.AbstractMultimap;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.ZGERC;

/* renamed from: o.isInputShutdown */
public final class isInputShutdown {
    private final AbstractMultimap.MultisetView write;

    @HmlPinActivity
    public isInputShutdown(AbstractMultimap.MultisetView multisetView) {
        onGetStartedClick.write((Object) multisetView, "rewardSearchRepository");
        this.write = multisetView;
    }

    /* renamed from: o.isInputShutdown$read */
    public static final class read {
        private FragmentBuilder_BindOthersTabFragment MediaBrowserCompat$CustomActionResultReceiver;

        private read() {
        }

        public read(FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindOthersTabFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet) {
            DTRMM dtrmm;
            STBMV stbmv;
            SSYR2 ssyr2;
            int i;
            int i2 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZGERC.read.PageIndicatorView, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(ZGERC.read.PageIndicatorView_piv_viewPager, -1);
            boolean z = obtainStyledAttributes.getBoolean(ZGERC.read.PageIndicatorView_piv_autoVisibility, true);
            boolean z2 = obtainStyledAttributes.getBoolean(ZGERC.read.PageIndicatorView_piv_dynamicCount, false);
            int i3 = obtainStyledAttributes.getInt(ZGERC.read.PageIndicatorView_piv_count, -1);
            if (i3 == -1) {
                i3 = 3;
            }
            int i4 = obtainStyledAttributes.getInt(ZGERC.read.PageIndicatorView_piv_select, 0);
            if (i4 < 0) {
                i4 = 0;
            } else if (i3 > 0 && i4 > i3 - 1) {
                i4 = i;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource = resourceId;
            this.MediaBrowserCompat$CustomActionResultReceiver.read = z;
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = z2;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = i3;
            this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatDialogFragment = i4;
            this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatActivity = i4;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = i4;
            int color = obtainStyledAttributes.getColor(ZGERC.read.PageIndicatorView_piv_unselectedColor, Color.parseColor("#33ffffff"));
            int color2 = obtainStyledAttributes.getColor(ZGERC.read.PageIndicatorView_piv_selectedColor, Color.parseColor("#ffffff"));
            this.MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView = color;
            this.MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView = color2;
            boolean z3 = obtainStyledAttributes.getBoolean(ZGERC.read.PageIndicatorView_piv_interactiveAnimation, false);
            long j = (long) obtainStyledAttributes.getInt(ZGERC.read.PageIndicatorView_piv_animationDuration, 350);
            if (j < 0) {
                j = 0;
            }
            switch (obtainStyledAttributes.getInt(ZGERC.read.PageIndicatorView_piv_animationType, DTRMM.NONE.ordinal())) {
                case 0:
                    dtrmm = DTRMM.NONE;
                    break;
                case 1:
                    dtrmm = DTRMM.COLOR;
                    break;
                case 2:
                    dtrmm = DTRMM.SCALE;
                    break;
                case 3:
                    dtrmm = DTRMM.WORM;
                    break;
                case 4:
                    dtrmm = DTRMM.SLIDE;
                    break;
                case 5:
                    dtrmm = DTRMM.FILL;
                    break;
                case 6:
                    dtrmm = DTRMM.THIN_WORM;
                    break;
                case 7:
                    dtrmm = DTRMM.DROP;
                    break;
                case 8:
                    dtrmm = DTRMM.SWAP;
                    break;
                case 9:
                    dtrmm = DTRMM.SCALE_DOWN;
                    break;
                default:
                    dtrmm = DTRMM.NONE;
                    break;
            }
            int i5 = obtainStyledAttributes.getInt(ZGERC.read.PageIndicatorView_piv_rtl_mode, STBMV.Off.ordinal());
            if (i5 == 0) {
                stbmv = STBMV.On;
            } else if (i5 == 1) {
                stbmv = STBMV.Off;
            } else if (i5 != 2) {
                stbmv = STBMV.Auto;
            } else {
                stbmv = STBMV.Auto;
            }
            boolean z4 = obtainStyledAttributes.getBoolean(ZGERC.read.PageIndicatorView_piv_fadeOnIdle, false);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = j;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = z3;
            this.MediaBrowserCompat$CustomActionResultReceiver.write = dtrmm;
            this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction = stbmv;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = z4;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = (long) obtainStyledAttributes.getInt(ZGERC.read.PageIndicatorView_piv_idleDuration, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
            if (obtainStyledAttributes.getInt(ZGERC.read.PageIndicatorView_piv_orientation, SSYR2.HORIZONTAL.ordinal()) == 0) {
                ssyr2 = SSYR2.HORIZONTAL;
            } else {
                ssyr2 = SSYR2.VERTICAL;
            }
            int dimension = (int) obtainStyledAttributes.getDimension(ZGERC.read.PageIndicatorView_piv_radius, (float) ((int) TypedValue.applyDimension(1, 6.0f, Resources.getSystem().getDisplayMetrics())));
            if (dimension < 0) {
                dimension = 0;
            }
            int dimension2 = (int) obtainStyledAttributes.getDimension(ZGERC.read.PageIndicatorView_piv_padding, (float) ((int) TypedValue.applyDimension(1, 8.0f, Resources.getSystem().getDisplayMetrics())));
            if (dimension2 < 0) {
                dimension2 = 0;
            }
            float f = obtainStyledAttributes.getFloat(ZGERC.read.PageIndicatorView_piv_scaleFactor, 0.7f);
            if (f < 0.3f) {
                f = 0.3f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            int dimension3 = (int) obtainStyledAttributes.getDimension(ZGERC.read.PageIndicatorView_piv_strokeWidth, (float) ((int) TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics())));
            if (dimension3 > dimension) {
                dimension3 = dimension;
            }
            FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (fragmentBuilder_BindOthersTabFragment.write == null) {
                fragmentBuilder_BindOthersTabFragment.write = DTRMM.NONE;
            }
            if (fragmentBuilder_BindOthersTabFragment.write == DTRMM.FILL) {
                i2 = dimension3;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat = dimension;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token = ssyr2;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = dimension2;
            this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor = f;
            this.MediaBrowserCompat$CustomActionResultReceiver.setContentView = i2;
            obtainStyledAttributes.recycle();
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "input");
        CharSequence charSequence = str;
        if ((charSequence.length() > 0) && (!GoodToKnowActivity.read(charSequence))) {
            Iterable IconCompatParcelizer = this.write.IconCompatParcelizer();
            onGetStartedClick.write((Object) IconCompatParcelizer, "$this$asSequence");
            BaseJuristicPinActivity_ViewBinding iconCompatParcelizer = new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(IconCompatParcelizer);
            onGetStartedClick.write((Object) iconCompatParcelizer, "$this$toMutableList");
            Iterable iterable = (List) JuristicRequestFormActivity.read(iconCompatParcelizer, new ArrayList());
            onGetStartedClick.write((Object) iterable, "$this$asSequence");
            BaseJuristicPinActivity_ViewBinding iconCompatParcelizer2 = new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(iterable);
            FundFactSheetActivity isinputshutdown_mediabrowsercompat_customactionresultreceiver = new isInputShutdown$MediaBrowserCompat$CustomActionResultReceiver(str);
            onGetStartedClick.write((Object) iconCompatParcelizer2, "$this$filter");
            onGetStartedClick.write((Object) isinputshutdown_mediabrowsercompat_customactionresultreceiver, "predicate");
            BaseJuristicPinActivity_ViewBinding setupScheduleActivity = new SetupScheduleActivity(iconCompatParcelizer2, true, isinputshutdown_mediabrowsercompat_customactionresultreceiver);
            onGetStartedClick.write((Object) setupScheduleActivity, "$this$toMutableList");
            List list = (List) JuristicRequestFormActivity.read(setupScheduleActivity, new ArrayList());
            list.add(0, str);
            this.write.MediaBrowserCompat$ItemReceiver(HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list, 5));
        }
    }
}
