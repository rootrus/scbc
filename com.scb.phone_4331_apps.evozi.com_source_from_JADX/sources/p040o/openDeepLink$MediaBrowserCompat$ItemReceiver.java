package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.TypeCastException;

/* renamed from: o.openDeepLink$MediaBrowserCompat$ItemReceiver */
public final class openDeepLink$MediaBrowserCompat$ItemReceiver implements Iterator<AddAccountConsentActivity>, FundOnboardingSuccessActivity_ViewBinding {
    private int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver = -1;
    private int MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ openDeepLink MediaMetadataCompat;
    private int read;
    private AddAccountConsentActivity write;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    openDeepLink$MediaBrowserCompat$ItemReceiver(openDeepLink opendeeplink) {
        this.MediaMetadataCompat = opendeeplink;
        int MediaBrowserCompat$ItemReceiver2 = ScbsInputActivity.MediaBrowserCompat$ItemReceiver(opendeeplink.MediaBrowserCompat$CustomActionResultReceiver, 0, opendeeplink.IconCompatParcelizer.length());
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2;
        this.read = MediaBrowserCompat$ItemReceiver2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0 < r7.MediaMetadataCompat.read) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r7 = this;
            int r0 = r7.read
            r1 = 0
            if (r0 >= 0) goto L_0x000b
            r7.MediaBrowserCompat$CustomActionResultReceiver = r1
            r0 = 0
            r7.write = r0
            return
        L_0x000b:
            o.openDeepLink r0 = r7.MediaMetadataCompat
            int r0 = r0.read
            r2 = -1
            java.lang.String r3 = "$this$lastIndex"
            r4 = 1
            if (r0 <= 0) goto L_0x0020
            int r0 = r7.MediaBrowserCompat$ItemReceiver
            int r0 = r0 + r4
            r7.MediaBrowserCompat$ItemReceiver = r0
            o.openDeepLink r5 = r7.MediaMetadataCompat
            int r5 = r5.read
            if (r0 >= r5) goto L_0x002c
        L_0x0020:
            int r0 = r7.read
            o.openDeepLink r5 = r7.MediaMetadataCompat
            java.lang.CharSequence r5 = r5.IconCompatParcelizer
            int r5 = r5.length()
            if (r0 <= r5) goto L_0x0044
        L_0x002c:
            o.AddAccountConsentActivity r0 = new o.AddAccountConsentActivity
            int r1 = r7.IconCompatParcelizer
            o.openDeepLink r5 = r7.MediaMetadataCompat
            java.lang.CharSequence r5 = r5.IconCompatParcelizer
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r3)
            int r3 = r5.length()
            int r3 = r3 - r4
            r0.<init>(r1, r3)
            r7.write = r0
            r7.read = r2
            goto L_0x00a2
        L_0x0044:
            o.openDeepLink r0 = r7.MediaMetadataCompat
            o.BaseDiscoverFundFilterActivity<java.lang.CharSequence, java.lang.Integer, o.HmlVerifyEmailSuccessfulActivity<java.lang.Integer, java.lang.Integer>> r0 = r0.MediaBrowserCompat$ItemReceiver
            o.openDeepLink r5 = r7.MediaMetadataCompat
            java.lang.CharSequence r5 = r5.IconCompatParcelizer
            int r6 = r7.read
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.MediaBrowserCompat$CustomActionResultReceiver(r5, r6)
            o.HmlVerifyEmailSuccessfulActivity r0 = (p040o.HmlVerifyEmailSuccessfulActivity) r0
            if (r0 != 0) goto L_0x0072
            o.AddAccountConsentActivity r0 = new o.AddAccountConsentActivity
            int r1 = r7.IconCompatParcelizer
            o.openDeepLink r5 = r7.MediaMetadataCompat
            java.lang.CharSequence r5 = r5.IconCompatParcelizer
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r3)
            int r3 = r5.length()
            int r3 = r3 - r4
            r0.<init>(r1, r3)
            r7.write = r0
            r7.read = r2
            goto L_0x00a2
        L_0x0072:
            A r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            B r0 = r0.write
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.IconCompatParcelizer
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r5) goto L_0x008f
            o.AddAccountConsentActivity$MediaBrowserCompat$CustomActionResultReceiver r3 = p040o.AddAccountConsentActivity.MediaBrowserCompat$CustomActionResultReceiver
            o.AddAccountConsentActivity r3 = p040o.AddAccountConsentActivity.MediaBrowserCompat$MediaItem
            goto L_0x0097
        L_0x008f:
            o.AddAccountConsentActivity r5 = new o.AddAccountConsentActivity
            int r6 = r2 + -1
            r5.<init>(r3, r6)
            r3 = r5
        L_0x0097:
            r7.write = r3
            int r2 = r2 + r0
            r7.IconCompatParcelizer = r2
            if (r0 != 0) goto L_0x009f
            r1 = r4
        L_0x009f:
            int r2 = r2 + r1
            r7.read = r2
        L_0x00a2:
            r7.MediaBrowserCompat$CustomActionResultReceiver = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.openDeepLink$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver():void");
    }

    public final boolean hasNext() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == -1) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver == 1;
    }

    public final /* synthetic */ Object next() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == -1) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != 0) {
            AddAccountConsentActivity addAccountConsentActivity = this.write;
            if (addAccountConsentActivity != null) {
                this.write = null;
                this.MediaBrowserCompat$CustomActionResultReceiver = -1;
                return addAccountConsentActivity;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
        }
        throw new NoSuchElementException();
    }
}
