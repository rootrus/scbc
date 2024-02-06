package p040o;

/* renamed from: o.setBuildingsEnabled */
public final class setBuildingsEnabled extends zzuk {
    public final setIndoorEnabled MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setBuildingsEnabled)) {
            return false;
        }
        setBuildingsEnabled setbuildingsenabled = (setBuildingsEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setbuildingsenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setbuildingsenabled.write);
    }

    public final int hashCode() {
        setIndoorEnabled setindoorenabled = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = setindoorenabled != null ? setindoorenabled.hashCode() : 0;
        String str = this.write;
        if (str != null) {
            i = str.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointUser(touchPointUserInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", facialRequiredFlag=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setBuildingsEnabled(setIndoorEnabled setindoorenabled, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setindoorenabled;
        this.write = str;
    }
}
