package p040o;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.completeSubmission */
public final class completeSubmission extends setStatusBarBackgroundColor {
    private setContentId IconCompatParcelizer;
    private setContentId MediaBrowserCompat$CustomActionResultReceiver;
    private RecyclerView MediaBrowserCompat$ItemReceiver;

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView) {
        this.MediaBrowserCompat$ItemReceiver = recyclerView;
        super.MediaBrowserCompat$CustomActionResultReceiver(recyclerView);
    }

    public final int[] MediaBrowserCompat$CustomActionResultReceiver(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, View view) {
        int i;
        int i2;
        int i3;
        onGetStartedClick.write((Object) recyclerView$MediaBrowserCompat$SearchResultReceiver, "layoutManager");
        onGetStartedClick.write((Object) view, "targetView");
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver.write()) {
            setContentId MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaBrowserCompat$SearchResultReceiver);
            int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$CustomActionResultReceiver2 != null ? MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver(view) : 0;
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                i3 = MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat();
            } else {
                i3 = 0;
            }
            i = MediaBrowserCompat$ItemReceiver2 - i3;
        } else {
            i = 0;
        }
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver.read()) {
            setContentId IconCompatParcelizer2 = IconCompatParcelizer(recyclerView$MediaBrowserCompat$SearchResultReceiver);
            i2 = (IconCompatParcelizer2 != null ? IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(view) : 0) - (IconCompatParcelizer2 != null ? IconCompatParcelizer2.MediaDescriptionCompat() : 0);
        } else {
            i2 = 0;
        }
        return new int[]{i, i2};
    }

    public final View read(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver) {
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null && recyclerView$MediaBrowserCompat$SearchResultReceiver.read()) {
            return MediaBrowserCompat$ItemReceiver(recyclerView$MediaBrowserCompat$SearchResultReceiver, IconCompatParcelizer(recyclerView$MediaBrowserCompat$SearchResultReceiver));
        }
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null || !recyclerView$MediaBrowserCompat$SearchResultReceiver.write()) {
            return null;
        }
        return MediaBrowserCompat$ItemReceiver(recyclerView$MediaBrowserCompat$SearchResultReceiver, MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaBrowserCompat$SearchResultReceiver));
    }

    public final int write(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, int i, int i2) {
        int MediaSessionCompat$QueueItem;
        setContentId setcontentid;
        PointF IconCompatParcelizer2;
        int i3;
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver2 = recyclerView$MediaBrowserCompat$SearchResultReceiver;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver2 == null || (MediaSessionCompat$QueueItem = recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem()) == 0) {
            return -1;
        }
        View view = null;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver.write()) {
            setcontentid = MediaBrowserCompat$CustomActionResultReceiver(recyclerView$MediaBrowserCompat$SearchResultReceiver);
        } else {
            setcontentid = recyclerView$MediaBrowserCompat$SearchResultReceiver.read() ? IconCompatParcelizer(recyclerView$MediaBrowserCompat$SearchResultReceiver) : null;
        }
        if (setcontentid != null) {
            int MediaSessionCompat$ResultReceiverWrapper = recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$ResultReceiverWrapper();
            int i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i5 = PKIFailureInfo.systemUnavail;
            boolean z = false;
            View view2 = null;
            View view3 = null;
            for (int i6 = 0; i6 < MediaSessionCompat$ResultReceiverWrapper; i6++) {
                View MediaDescriptionCompat = recyclerView$MediaBrowserCompat$SearchResultReceiver2.MediaDescriptionCompat(i6);
                if (MediaDescriptionCompat != null) {
                    onGetStartedClick.IconCompatParcelizer((Object) MediaDescriptionCompat, "layoutManager.getChildAt(index) ?: continue");
                    int MediaBrowserCompat$ItemReceiver2 = setcontentid != null ? setcontentid.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat) : 0;
                    if (setcontentid != null) {
                        i3 = setcontentid.MediaDescriptionCompat();
                    } else {
                        i3 = 0;
                    }
                    int i7 = MediaBrowserCompat$ItemReceiver2 - i3;
                    if (i7 <= 0 && i7 > i5) {
                        view3 = MediaDescriptionCompat;
                        i5 = i7;
                    }
                    if (i7 >= 0 && i7 < i4) {
                        view2 = MediaDescriptionCompat;
                        i4 = i7;
                    }
                }
            }
            int i8 = 1;
            boolean z2 = !recyclerView$MediaBrowserCompat$SearchResultReceiver.write() ? i2 > 0 : i > 0;
            if (z2 && view2 != null) {
                return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view2);
            }
            if (!z2 && view3 != null) {
                return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view3);
            }
            if (z2) {
                view = view3;
            }
            View view4 = view;
            if (view4 != null) {
                view2 = view4;
            }
            if (view2 == null) {
                return -1;
            }
            int MediaMetadataCompat = RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view2);
            int MediaSessionCompat$QueueItem2 = recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem();
            if ((recyclerView$MediaBrowserCompat$SearchResultReceiver2 instanceof RecyclerView.PlaybackStateCompat.read) && (IconCompatParcelizer2 = ((RecyclerView.PlaybackStateCompat.read) recyclerView$MediaBrowserCompat$SearchResultReceiver2).IconCompatParcelizer(MediaSessionCompat$QueueItem2 - 1)) != null && (IconCompatParcelizer2.x < BitmapDescriptorFactory.HUE_RED || IconCompatParcelizer2.y < BitmapDescriptorFactory.HUE_RED)) {
                z = true;
            }
            if (z == z2) {
                i8 = -1;
            }
            int i9 = MediaMetadataCompat + i8;
            if (i9 < 0 || i9 >= MediaSessionCompat$QueueItem) {
                return -1;
            }
            return i9;
        }
        return -1;
    }

    public final setGuidelineBegin write(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver) {
        RecyclerView recyclerView;
        if ((recyclerView$MediaBrowserCompat$SearchResultReceiver instanceof RecyclerView.PlaybackStateCompat.read) && (recyclerView = this.MediaBrowserCompat$ItemReceiver) != null) {
            return new completeSubmission$MediaBrowserCompat$CustomActionResultReceiver(this, recyclerView, recyclerView.getContext());
        }
        return null;
    }

    private static View MediaBrowserCompat$ItemReceiver(RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, setContentId setcontentid) {
        int MediaSessionCompat$ResultReceiverWrapper = recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$ResultReceiverWrapper();
        View view = null;
        if (MediaSessionCompat$ResultReceiverWrapper == 0) {
            return null;
        }
        int MediaDescriptionCompat = setcontentid != null ? setcontentid.MediaDescriptionCompat() : 0;
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < MediaSessionCompat$ResultReceiverWrapper; i2++) {
            View MediaDescriptionCompat2 = recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat(i2);
            int abs = Math.abs((setcontentid != null ? setcontentid.MediaBrowserCompat$ItemReceiver(MediaDescriptionCompat2) : 0) - MediaDescriptionCompat);
            if (abs < i) {
                view = MediaDescriptionCompat2;
                i = abs;
            }
        }
        return view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if ((!p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0 != null ? r0.write() : null, (java.lang.Object) r2)) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p040o.setContentId IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r2) {
        /*
            r1 = this;
            o.setContentId r0 = r1.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0014
            if (r0 == 0) goto L_0x000b
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r0.write()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            boolean r0 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0, (java.lang.Object) r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001b
        L_0x0014:
            o.setContentId$2 r0 = new o.setContentId$2
            r0.<init>(r2)
            r1.MediaBrowserCompat$CustomActionResultReceiver = r0
        L_0x001b:
            o.setContentId r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.completeSubmission.IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver):o.setContentId");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if ((!p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0 != null ? r0.write() : null, (java.lang.Object) r2)) != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p040o.setContentId MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r2) {
        /*
            r1 = this;
            o.setContentId r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto L_0x0014
            if (r0 == 0) goto L_0x000b
            androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r0 = r0.write()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            boolean r0 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0, (java.lang.Object) r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001b
        L_0x0014:
            o.setContentId$5 r0 = new o.setContentId$5
            r0.<init>(r2)
            r1.IconCompatParcelizer = r0
        L_0x001b:
            o.setContentId r2 = r1.IconCompatParcelizer
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.completeSubmission.MediaBrowserCompat$CustomActionResultReceiver(androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver):o.setContentId");
    }

    /* renamed from: o.completeSubmission$read */
    public static final class read implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ List IconCompatParcelizer;

        private read() {
        }

        public /* synthetic */ read(List list) {
            this.IconCompatParcelizer = list;
        }

        public final boolean write(Object obj) {
            return this.IconCompatParcelizer.indexOf((String) obj) >= 0;
        }
    }
}
