package com.scb.phone.presentation.presenter.investment.accountdetail;

import android.text.TextUtils;
import p040o.HmlPinActivity;
import p040o.RegularImmutableBiMap;
import p040o.getMicrAmount;
import p040o.include;
import p040o.lessThanUnsigned;
import p040o.populateBinaryImageData;
import p040o.writeUInt64NoTag;

public class ScbsAccountDetailPresenter extends writeUInt64NoTag<getMicrAmount.read> {
    public lessThanUnsigned IconCompatParcelizer;
    @HmlPinActivity
    public include billPaymentCase;
    public populateBinaryImageData read;

    @HmlPinActivity
    public ScbsAccountDetailPresenter(RegularImmutableBiMap regularImmutableBiMap, include include, lessThanUnsigned lessthanunsigned) {
        super(regularImmutableBiMap);
        this.billPaymentCase = include;
        this.IconCompatParcelizer = lessthanunsigned;
    }

    public static /* synthetic */ void read(populateBinaryImageData populatebinaryimagedata, getMicrAmount.read read2) {
        String str = populatebinaryimagedata.MediaBrowserCompat$ItemReceiver;
        boolean z = populatebinaryimagedata.MediaSessionCompat$QueueItem;
        String str2 = populatebinaryimagedata.MediaSessionCompat$ResultReceiverWrapper;
        boolean z2 = populatebinaryimagedata.MediaSessionCompat$Token;
        read2.IconCompatParcelizer(z || z2);
        if (z) {
            read2.read(str, populatebinaryimagedata.MediaDescriptionCompat);
        } else if (z2) {
            read2.IconCompatParcelizer(str2, populatebinaryimagedata.MediaDescriptionCompat);
        }
    }

    public static /* synthetic */ void write(populateBinaryImageData populatebinaryimagedata, getMicrAmount.read read2) {
        String str = populatebinaryimagedata.RatingCompat;
        boolean isEmpty = TextUtils.isEmpty(str);
        read2.write(!isEmpty);
        if (!isEmpty) {
            read2.write(str);
        }
    }
}
