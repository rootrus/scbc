package p040o;

/* renamed from: o.setLatLngBoundsForCameraTarget */
public final class setLatLngBoundsForCameraTarget {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final setMapStyle MediaBrowserCompat$MediaItem;
    public final setMaxZoomPreference MediaBrowserCompat$SearchResultReceiver;
    public final setContentDescription MediaMetadataCompat;
    public final setInfoWindowAdapter read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLatLngBoundsForCameraTarget)) {
            return false;
        }
        setLatLngBoundsForCameraTarget setlatlngboundsforcameratarget = (setLatLngBoundsForCameraTarget) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setlatlngboundsforcameratarget.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setlatlngboundsforcameratarget.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setlatlngboundsforcameratarget.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setlatlngboundsforcameratarget.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setlatlngboundsforcameratarget.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setlatlngboundsforcameratarget.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setlatlngboundsforcameratarget.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setlatlngboundsforcameratarget.read);
    }

    public final int hashCode() {
        setMaxZoomPreference setmaxzoompreference = this.MediaBrowserCompat$SearchResultReceiver;
        int i = 0;
        int hashCode = setmaxzoompreference != null ? setmaxzoompreference.hashCode() : 0;
        setMapStyle setmapstyle = this.MediaBrowserCompat$MediaItem;
        int hashCode2 = setmapstyle != null ? setmapstyle.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode3 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        setContentDescription setcontentdescription = this.MediaMetadataCompat;
        int hashCode5 = setcontentdescription != null ? setcontentdescription.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        setInfoWindowAdapter setinfowindowadapter = this.read;
        if (setinfowindowadapter != null) {
            i = setinfowindowadapter.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OccupationInfo(occupation=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", sourceOfIncome=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", companyId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", companyName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", workAddress=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", companyPhone=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", customerGroupCode=");
        sb.append(this.write);
        sb.append(", experience=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setLatLngBoundsForCameraTarget(setMaxZoomPreference setmaxzoompreference, setMapStyle setmapstyle, String str, String str2, setContentDescription setcontentdescription, String str3, String str4, setInfoWindowAdapter setinfowindowadapter) {
        onGetStartedClick.write((Object) setmapstyle, "sourceOfIncome");
        onGetStartedClick.write((Object) str3, "companyPhone");
        onGetStartedClick.write((Object) setinfowindowadapter, "experience");
        this.MediaBrowserCompat$SearchResultReceiver = setmaxzoompreference;
        this.MediaBrowserCompat$MediaItem = setmapstyle;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaMetadataCompat = setcontentdescription;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.write = str4;
        this.read = setinfowindowadapter;
    }
}
