package com.scb.phone.view.activity.ntb.touchpoint;

/* renamed from: com.scb.phone.view.activity.ntb.touchpoint.TouchPointAccountDetailActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5678xe38d8869 {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    private C5678xe38d8869() {
    }

    public C5678xe38d8869(String str, String str2) {
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5678xe38d8869 touchPointAccountDetailActivity$MediaBrowserCompat$CustomActionResultReceiver = (C5678xe38d8869) obj;
        String str = this.write;
        if (str == null ? touchPointAccountDetailActivity$MediaBrowserCompat$CustomActionResultReceiver.write != null : !str.equals(touchPointAccountDetailActivity$MediaBrowserCompat$CustomActionResultReceiver.write)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = touchPointAccountDetailActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
