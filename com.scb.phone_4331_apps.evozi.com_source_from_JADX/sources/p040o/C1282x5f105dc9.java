package p040o;

import p040o.ScrollingTabContainerView;

/* renamed from: o.ScrollingTabContainerView$TabView$MediaBrowserCompat$CustomActionResultReceiver */
class C1282x5f105dc9 implements ScrollingTabContainerView.TabView.write {
    static final C1282x5f105dc9 MediaBrowserCompat$CustomActionResultReceiver = new C1282x5f105dc9();

    public int MediaBrowserCompat$ItemReceiver(CharSequence charSequence, int i, int i2) {
        int i3 = 2;
        for (int i4 = i; i4 < i2 + i && i3 == 2; i4++) {
            i3 = ScrollingTabContainerView.TabView.read(Character.getDirectionality(charSequence.charAt(i4)));
        }
        return i3;
    }

    private C1282x5f105dc9() {
    }
}
