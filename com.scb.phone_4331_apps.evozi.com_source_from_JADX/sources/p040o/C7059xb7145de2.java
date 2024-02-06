package p040o;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver */
final class C7059xb7145de2 {
    final int length;
    private final Map<CharSequence, C7059xb7145de2> substringMap;
    private final Map<String, C7059xb7145de2> substringMapCI;

    private C7059xb7145de2(int i) {
        this.substringMap = new HashMap();
        this.substringMapCI = new HashMap();
        this.length = i;
    }

    /* access modifiers changed from: private */
    public C7059xb7145de2 get(CharSequence charSequence, boolean z) {
        if (z) {
            return this.substringMap.get(charSequence);
        }
        return this.substringMapCI.get(charSequence.toString().toLowerCase(Locale.ENGLISH));
    }

    /* access modifiers changed from: private */
    public void add(String str) {
        C7059xb7145de2 sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver = this;
        while (true) {
            int length2 = str.length();
            int i = sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver.length;
            if (length2 == i) {
                sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver.substringMap.put(str, (Object) null);
                sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver.substringMapCI.put(str.toLowerCase(Locale.ENGLISH), (Object) null);
                return;
            } else if (length2 > i) {
                String substring = str.substring(0, i);
                C7059xb7145de2 sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver2 = sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver.substringMap.get(substring);
                if (sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver2 = new C7059xb7145de2(length2);
                    sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver.substringMap.put(substring, sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver2);
                    sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver.substringMapCI.put(substring.toLowerCase(Locale.ENGLISH), sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver2);
                }
                sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver = sequentialSearchAdapter$ItemViewHolder_ViewBinding$PlaybackStateCompat$MediaBrowserCompat$CustomActionResultReceiver2;
            } else {
                return;
            }
        }
    }
}
