package p040o;

/* renamed from: o.getMessageIcons */
public class getMessageIcons extends writeUInt64NoTag<PassportWorkflowActivity_MembersInjector> {
    /* access modifiers changed from: private */
    public getPlacePhotos IconCompatParcelizer;
    public setCounterMaxLength read;
    public setErrorEnabled write;

    @HmlPinActivity
    public getMessageIcons(setErrorEnabled seterrorenabled, setCounterMaxLength setcountermaxlength, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = seterrorenabled;
        this.read = setcountermaxlength;
    }

    public void onDestroy() {
        super.onDestroy();
        setCounterMaxLength setcountermaxlength = this.read;
        if (!setcountermaxlength.MediaBrowserCompat$MediaItem.isDisposed()) {
            setcountermaxlength.MediaBrowserCompat$MediaItem.dispose();
        }
        setErrorEnabled seterrorenabled = this.write;
        if (!seterrorenabled.MediaBrowserCompat$MediaItem.isDisposed()) {
            seterrorenabled.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void write(getMessageIcons getmessageicons) {
        if (getmessageicons.RatingCompat != null) {
            getmessageicons.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getMessageIcons getmessageicons) {
        if (getmessageicons.RatingCompat != null) {
            getmessageicons.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(getMessageIcons getmessageicons) {
        if (getmessageicons.RatingCompat != null) {
            getmessageicons.RatingCompat.aj_();
        }
    }
}
