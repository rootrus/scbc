package p040o;

import org.json.JSONObject;
import p040o.C1163x1ce8468d;

/* renamed from: o.setListener */
public class setListener<T extends C1163x1ce8468d> extends writeUInt64NoTag<T> {
    public final StreetViewPanoramaCamera IconCompatParcelizer;
    public startCap MediaBrowserCompat$ItemReceiver;

    public setListener(RegularImmutableBiMap regularImmutableBiMap, startCap startcap, StreetViewPanoramaCamera streetViewPanoramaCamera) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = startcap;
        this.IconCompatParcelizer = streetViewPanoramaCamera;
    }

    /* renamed from: o.setListener$IconCompatParcelizer */
    class IconCompatParcelizer<V> extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<V> {
        public void onComplete() {
        }

        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(setListener setlistener, byte b) {
            this();
        }

        public void onError(Throwable th) {
            setListener setlistener = setListener.this;
            setBoundsData setboundsdata = setBoundsData.read;
            boolean z = true;
            if (setlistener.RatingCompat != null) {
                setboundsdata.IconCompatParcelizer(setlistener.RatingCompat);
            }
            setListener setlistener2 = setListener.this;
            if (setlistener2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setlistener2.RatingCompat.aj_();
            }
        }
    }

    public final void read(String str) {
        boolean z = true;
        if (this.RatingCompat != null) {
            if (!(str == null || str.equals(""))) {
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    this.RatingCompat.AlertController$RecycleListView();
                }
                this.MediaBrowserCompat$ItemReceiver.write(str);
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setListener<T>.IconCompatParcelizer<JSONObject>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        setListener setlistener = setListener.this;
                        getCenterMsg getcentermsg = new getCenterMsg((JSONObject) obj);
                        boolean z = true;
                        if (setlistener.RatingCompat != null) {
                            getcentermsg.IconCompatParcelizer(setlistener.RatingCompat);
                        }
                        setListener setlistener2 = setListener.this;
                        if (setlistener2.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            setlistener2.RatingCompat.aj_();
                        }
                    }
                });
            }
        }
    }
}
