package p040o;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.DGEMM */
public class DGEMM {
    public final FragmentBuilder_BindOPRStatusRegisteredUserFragment IconCompatParcelizer;
    public float MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public float MediaBrowserCompat$MediaItem = -1.0f;
    public int MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final FragmentBuilder_BindOPRRewardsTabFragment[] f2539x50fd9e4a;
    public int MediaDescriptionCompat;
    public FragmentBuilder_BindOPRRewardsTabFragment MediaMetadataCompat = new FragmentBuilder_BindOPRRewardsTabFragment();
    private float MediaSessionCompat$QueueItem;
    private final FragmentBuilder_BindOPRRewardsTabFragment[] MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private final int ParcelableVolumeInfo = 2;
    private int RatingCompat;
    public int read;
    public Rect write;

    public DGEMM(FragmentBuilder_BindOPRStatusRegisteredUserFragment fragmentBuilder_BindOPRStatusRegisteredUserFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindOPRStatusRegisteredUserFragment;
        this.MediaSessionCompat$ResultReceiverWrapper = new FragmentBuilder_BindOPRRewardsTabFragment[2];
        this.f2539x50fd9e4a = new FragmentBuilder_BindOPRRewardsTabFragment[2];
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindOPRStatusRegisteredUserFragment.read;
        this.MediaSessionCompat$QueueItem = fragmentBuilder_BindOPRStatusRegisteredUserFragment.MediaBrowserCompat$ItemReceiver;
    }

    public void onEvent(MotionEvent motionEvent) {
        FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment;
        FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment2;
        FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment3;
        int actionIndex = motionEvent.getActionIndex();
        if (actionIndex < 2) {
            int actionMasked = motionEvent.getActionMasked();
            boolean z = false;
            if (actionMasked == 6 || actionMasked == 1) {
                this.f2539x50fd9e4a[actionIndex] = null;
                this.MediaSessionCompat$ResultReceiverWrapper[actionIndex] = null;
            } else {
                for (int i = 0; i < 2; i++) {
                    if (i < motionEvent.getPointerCount()) {
                        float x = motionEvent.getX(i);
                        float y = motionEvent.getY(i);
                        FragmentBuilder_BindOPRRewardsTabFragment[] fragmentBuilder_BindOPRRewardsTabFragmentArr = this.MediaSessionCompat$ResultReceiverWrapper;
                        if (fragmentBuilder_BindOPRRewardsTabFragmentArr[i] == null) {
                            fragmentBuilder_BindOPRRewardsTabFragmentArr[i] = new FragmentBuilder_BindOPRRewardsTabFragment(x, y);
                            this.f2539x50fd9e4a[i] = null;
                        } else {
                            FragmentBuilder_BindOPRRewardsTabFragment[] fragmentBuilder_BindOPRRewardsTabFragmentArr2 = this.f2539x50fd9e4a;
                            if (fragmentBuilder_BindOPRRewardsTabFragmentArr2[i] == null) {
                                fragmentBuilder_BindOPRRewardsTabFragmentArr2[i] = new FragmentBuilder_BindOPRRewardsTabFragment();
                            }
                            FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment4 = this.f2539x50fd9e4a[i];
                            FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment5 = this.MediaSessionCompat$ResultReceiverWrapper[i];
                            fragmentBuilder_BindOPRRewardsTabFragment4.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindOPRRewardsTabFragment5.MediaBrowserCompat$ItemReceiver;
                            fragmentBuilder_BindOPRRewardsTabFragment4.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindOPRRewardsTabFragment5.MediaBrowserCompat$CustomActionResultReceiver;
                            FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment6 = this.MediaSessionCompat$ResultReceiverWrapper[i];
                            fragmentBuilder_BindOPRRewardsTabFragment6.MediaBrowserCompat$ItemReceiver = x;
                            fragmentBuilder_BindOPRRewardsTabFragment6.MediaBrowserCompat$CustomActionResultReceiver = y;
                        }
                    } else {
                        this.f2539x50fd9e4a[i] = null;
                        this.MediaSessionCompat$ResultReceiverWrapper[i] = null;
                    }
                }
            }
            if (MediaBrowserCompat$ItemReceiver() == 1) {
                FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment7 = this.MediaMetadataCompat;
                if (this.MediaSessionCompat$ResultReceiverWrapper[0] != null) {
                    FragmentBuilder_BindOPRRewardsTabFragment[] fragmentBuilder_BindOPRRewardsTabFragmentArr3 = this.f2539x50fd9e4a;
                    FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment8 = fragmentBuilder_BindOPRRewardsTabFragmentArr3[0] != null ? fragmentBuilder_BindOPRRewardsTabFragmentArr3[0] : this.MediaSessionCompat$ResultReceiverWrapper[0];
                    FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment9 = this.MediaSessionCompat$ResultReceiverWrapper[0];
                    fragmentBuilder_BindOPRRewardsTabFragment3 = new FragmentBuilder_BindOPRRewardsTabFragment(fragmentBuilder_BindOPRRewardsTabFragment9.MediaBrowserCompat$ItemReceiver - fragmentBuilder_BindOPRRewardsTabFragment8.MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindOPRRewardsTabFragment9.MediaBrowserCompat$CustomActionResultReceiver - fragmentBuilder_BindOPRRewardsTabFragment8.MediaBrowserCompat$CustomActionResultReceiver);
                } else {
                    fragmentBuilder_BindOPRRewardsTabFragment3 = new FragmentBuilder_BindOPRRewardsTabFragment();
                }
                fragmentBuilder_BindOPRRewardsTabFragment7.MediaBrowserCompat$ItemReceiver += fragmentBuilder_BindOPRRewardsTabFragment3.MediaBrowserCompat$ItemReceiver;
                fragmentBuilder_BindOPRRewardsTabFragment7.MediaBrowserCompat$CustomActionResultReceiver += fragmentBuilder_BindOPRRewardsTabFragment3.MediaBrowserCompat$CustomActionResultReceiver;
            }
            if (MediaBrowserCompat$ItemReceiver() == 2) {
                FragmentBuilder_BindOPRRewardsTabFragment[] fragmentBuilder_BindOPRRewardsTabFragmentArr4 = this.MediaSessionCompat$ResultReceiverWrapper;
                FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment10 = fragmentBuilder_BindOPRRewardsTabFragmentArr4[0];
                FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment11 = fragmentBuilder_BindOPRRewardsTabFragmentArr4[1];
                FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment12 = new FragmentBuilder_BindOPRRewardsTabFragment(fragmentBuilder_BindOPRRewardsTabFragment11.MediaBrowserCompat$ItemReceiver - fragmentBuilder_BindOPRRewardsTabFragment10.MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindOPRRewardsTabFragment11.MediaBrowserCompat$CustomActionResultReceiver - fragmentBuilder_BindOPRRewardsTabFragment10.MediaBrowserCompat$CustomActionResultReceiver);
                FragmentBuilder_BindOPRRewardsTabFragment[] fragmentBuilder_BindOPRRewardsTabFragmentArr5 = this.f2539x50fd9e4a;
                if (fragmentBuilder_BindOPRRewardsTabFragmentArr5[0] == null || fragmentBuilder_BindOPRRewardsTabFragmentArr5[1] == null) {
                    FragmentBuilder_BindOPRRewardsTabFragment[] fragmentBuilder_BindOPRRewardsTabFragmentArr6 = this.MediaSessionCompat$ResultReceiverWrapper;
                    fragmentBuilder_BindOPRRewardsTabFragment = fragmentBuilder_BindOPRRewardsTabFragmentArr6[0];
                    fragmentBuilder_BindOPRRewardsTabFragment2 = fragmentBuilder_BindOPRRewardsTabFragmentArr6[1];
                } else {
                    fragmentBuilder_BindOPRRewardsTabFragment = fragmentBuilder_BindOPRRewardsTabFragmentArr5[0];
                    fragmentBuilder_BindOPRRewardsTabFragment2 = fragmentBuilder_BindOPRRewardsTabFragmentArr5[1];
                }
                FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment13 = new FragmentBuilder_BindOPRRewardsTabFragment(fragmentBuilder_BindOPRRewardsTabFragment2.MediaBrowserCompat$ItemReceiver - fragmentBuilder_BindOPRRewardsTabFragment.MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindOPRRewardsTabFragment2.MediaBrowserCompat$CustomActionResultReceiver - fragmentBuilder_BindOPRRewardsTabFragment.MediaBrowserCompat$CustomActionResultReceiver);
                float f = fragmentBuilder_BindOPRRewardsTabFragment12.MediaBrowserCompat$ItemReceiver;
                float f2 = fragmentBuilder_BindOPRRewardsTabFragment12.MediaBrowserCompat$CustomActionResultReceiver;
                float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
                float f3 = fragmentBuilder_BindOPRRewardsTabFragment13.MediaBrowserCompat$ItemReceiver;
                float f4 = fragmentBuilder_BindOPRRewardsTabFragment13.MediaBrowserCompat$CustomActionResultReceiver;
                float sqrt2 = (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
                float f5 = this.MediaBrowserCompat$MediaItem;
                if (sqrt2 != BitmapDescriptorFactory.HUE_RED) {
                    f5 *= sqrt / sqrt2;
                }
                float f6 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (f5 < f6) {
                    f5 = f6;
                }
                float f7 = this.MediaSessionCompat$QueueItem;
                if (f5 > f7) {
                    f5 = f7;
                }
                this.MediaBrowserCompat$MediaItem = f5;
                write();
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 6 || actionMasked2 == 1) {
                z = true;
            }
            if (z) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r1 > ((float) r4)) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.write
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            o.FragmentBuilder_BindOPRRewardsTabFragment r0 = r6.MediaMetadataCompat
            float r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            android.graphics.Rect r1 = r6.write
            int r1 = r1.bottom
            float r2 = (float) r1
            int r3 = r6.MediaSessionCompat$Token
            float r4 = r2 - r0
            float r5 = (float) r3
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0019
            int r1 = r1 - r3
            goto L_0x0020
        L_0x0019:
            float r2 = r0 - r2
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0021
            int r1 = r1 + r3
        L_0x0020:
            float r0 = (float) r1
        L_0x0021:
            o.FragmentBuilder_BindOPRRewardsTabFragment r1 = r6.MediaMetadataCompat
            float r1 = r1.MediaBrowserCompat$ItemReceiver
            android.graphics.Rect r2 = r6.write
            int r2 = r2.right
            int r3 = r6.RatingCompat
            int r4 = r2 - r3
            float r5 = (float) r4
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0033
            goto L_0x003a
        L_0x0033:
            int r4 = r2 + r3
            float r2 = (float) r4
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x003b
        L_0x003a:
            float r1 = (float) r4
        L_0x003b:
            o.FragmentBuilder_BindOPRRewardsTabFragment r2 = r6.MediaMetadataCompat
            r2.MediaBrowserCompat$ItemReceiver = r1
            r2.MediaBrowserCompat$CustomActionResultReceiver = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DGEMM.MediaBrowserCompat$CustomActionResultReceiver():void");
    }

    public final void write() {
        float f = this.MediaBrowserCompat$MediaItem;
        this.RatingCompat = (((int) (((float) this.read) * f)) - this.MediaDescriptionCompat) / 2;
        this.MediaSessionCompat$Token = (((int) (((float) this.MediaBrowserCompat$ItemReceiver) * f)) - this.MediaBrowserCompat$SearchResultReceiver) / 2;
    }

    private int MediaBrowserCompat$ItemReceiver() {
        int i = 0;
        for (FragmentBuilder_BindOPRRewardsTabFragment fragmentBuilder_BindOPRRewardsTabFragment : this.MediaSessionCompat$ResultReceiverWrapper) {
            if (fragmentBuilder_BindOPRRewardsTabFragment != null) {
                i++;
            }
        }
        return i;
    }
}
