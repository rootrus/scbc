package p040o;

/* renamed from: o.getAutocompletePredictions */
public final class getAutocompletePredictions {
    public final AutocompletePredictionBufferResponse IconCompatParcelizer;
    public final AutocompletePredictionBuffer write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAutocompletePredictions)) {
            return false;
        }
        getAutocompletePredictions getautocompletepredictions = (getAutocompletePredictions) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getautocompletepredictions.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getautocompletepredictions.write);
    }

    public final int hashCode() {
        AutocompletePredictionBufferResponse autocompletePredictionBufferResponse = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = autocompletePredictionBufferResponse != null ? autocompletePredictionBufferResponse.hashCode() : 0;
        AutocompletePredictionBuffer autocompletePredictionBuffer = this.write;
        if (autocompletePredictionBuffer != null) {
            i = autocompletePredictionBuffer.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReviewInfo(personalInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", investmentInfo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getAutocompletePredictions(AutocompletePredictionBufferResponse autocompletePredictionBufferResponse, AutocompletePredictionBuffer autocompletePredictionBuffer) {
        onGetStartedClick.write((Object) autocompletePredictionBufferResponse, "personalInfo");
        onGetStartedClick.write((Object) autocompletePredictionBuffer, "investmentInfo");
        this.IconCompatParcelizer = autocompletePredictionBufferResponse;
        this.write = autocompletePredictionBuffer;
    }
}
