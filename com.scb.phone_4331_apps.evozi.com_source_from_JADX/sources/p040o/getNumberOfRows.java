package p040o;

import p040o.access$2300;

/* renamed from: o.getNumberOfRows */
public final class getNumberOfRows extends writeUInt32<proxyGetIIdExtractionServerOnDevice> {
    private final OnCompleteListener write;

    @HmlPinActivity
    public getNumberOfRows(OnCompleteListener onCompleteListener, performActionWithResponse performactionwithresponse, RegularImmutableBiMap regularImmutableBiMap, FileBackedOutputStream fileBackedOutputStream) {
        super(performactionwithresponse, regularImmutableBiMap, fileBackedOutputStream);
        this.write = onCompleteListener;
    }

    public final void onDestroy() {
        super.onDestroy();
        OnCompleteListener onCompleteListener = this.write;
        if (!onCompleteListener.MediaBrowserCompat$MediaItem.isDisposed()) {
            onCompleteListener.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void read(getNumberOfRows getnumberofrows) {
        if (getnumberofrows.RatingCompat != null) {
            getnumberofrows.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(getNumberOfRows getnumberofrows) {
        if (getnumberofrows.RatingCompat != null) {
            getnumberofrows.RatingCompat.aj_();
        }
    }

    public final void write(String str) {
        DebitCardResetOtpActivity<R> debitCardResetOtpActivity;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        OnCompleteListener onCompleteListener = this.write;
        if (onCompleteListener.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver() != null) {
            debitCardResetOtpActivity = DebitCardResetOtpActivity.create(new CustomVariableProvider(onCompleteListener, str, onCompleteListener.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().read));
        } else {
            debitCardResetOtpActivity = onCompleteListener.IconCompatParcelizer.MediaBrowserCompat$MediaItem().flatMap(new CustomTagProvider(onCompleteListener, str));
        }
        onCompleteListener.write(debitCardResetOtpActivity, new IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void>() {
            public final void onComplete() {
                getNumberOfRows.read(getNumberOfRows.this);
                getNumberOfRows getnumberofrows = getNumberOfRows.this;
                setConfidence setconfidence = setConfidence.write;
                if (getnumberofrows.RatingCompat != null) {
                    setconfidence.IconCompatParcelizer(getnumberofrows.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                getNumberOfRows.write(getNumberOfRows.this);
                getNumberOfRows.this.write();
                getNumberOfRows getnumberofrows = getNumberOfRows.this;
                saveToString savetostring = saveToString.write;
                if (getnumberofrows.RatingCompat != null) {
                    savetostring.IconCompatParcelizer(getnumberofrows.RatingCompat);
                }
                getNumberOfRows.this.MediaBrowserCompat$ItemReceiver(getNumberOfRows.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        });
    }
}
