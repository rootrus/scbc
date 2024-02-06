package com.scb.phone.view.custom.item;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.C4093bd;
import p040o.ComputingConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.ICancelToken;
import p040o.IFragmentWrapper;
import p040o.LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver;
import p040o.Logger;
import p040o.SafeParcelReader;
import p040o.StandardExceptionParser;
import p040o.StringResourceValueReader;
import p040o.TouchPointInstructionActivity;
import p040o.Tracker;
import p040o.compute;
import p040o.copyFor;
import p040o.createBigDecimal;
import p040o.createBigDecimalArray;
import p040o.createBigInteger;
import p040o.createBigIntegerArray;
import p040o.encodedFragment;
import p040o.isComputingReference;
import p040o.notifyValueReclaimed;
import p040o.onBackImageProcessed;
import p040o.setTax;
import p040o.setTvRemark;
import p040o.toByteArray;
import p040o.toTask;
import p040o.waitForValue;
import p040o.warn;
import p040o.zabr;
import p040o.zzbr;
import p040o.zzcl;
import p040o.zzec;
import p040o.zzex;
import p040o.zzxl;

/* renamed from: com.scb.phone.view.custom.item.ItemAdditionalMetaDataCustom$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5836x45fc1907 implements onBackImageProcessed {
    public final Logger.LogLevel IconCompatParcelizer;
    private final setTax MediaBrowserCompat$CustomActionResultReceiver;
    private final C4093bd.write MediaBrowserCompat$ItemReceiver;
    private final Tracker MediaDescriptionCompat;
    private final warn read;
    private final StandardExceptionParser write;

    private C5836x45fc1907() {
    }

    @HmlPinActivity
    public C5836x45fc1907(C4093bd.write write2, Logger.LogLevel logLevel, warn warn, Tracker tracker, setTax settax, StandardExceptionParser standardExceptionParser) {
        this.MediaBrowserCompat$ItemReceiver = write2;
        this.IconCompatParcelizer = logLevel;
        this.read = warn;
        this.MediaDescriptionCompat = tracker;
        this.MediaBrowserCompat$CustomActionResultReceiver = settax;
        this.write = standardExceptionParser;
    }

    public final DebitCardResetOtpActivity<Boolean> IconCompatParcelizer(compute compute) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.addRecipientsToGroup(compute).flatMap(createBigInteger.MediaBrowserCompat$ItemReceiver);
    }

    public final DebitCardResetOtpActivity<TouchPointInstructionActivity.write> MediaBrowserCompat$ItemReceiver(ComputingConcurrentHashMap.C31941 r2, String str, String str2) {
        DebitCardResetOtpActivity<SingleDataEntity<encodedFragment>> debitCardResetOtpActivity;
        C4093bd.write write2 = this.MediaBrowserCompat$ItemReceiver;
        if (str == null || str2 == null) {
            debitCardResetOtpActivity = write2.MediaBrowserCompat$ItemReceiver.confirmBulkTransfer(r2);
        } else {
            debitCardResetOtpActivity = write2.MediaBrowserCompat$ItemReceiver.confirmBulkTransfer(r2, str, str2);
        }
        return debitCardResetOtpActivity.map(IFragmentWrapper.MediaBrowserCompat$ItemReceiver).map(new toTask(this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final DebitCardResetOtpActivity<setTvRemark> IconCompatParcelizer(ComputingConcurrentHashMap.ComputingSegment computingSegment) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.createGroup(computingSegment).map(zzex.IconCompatParcelizer).map(new toByteArray(this.write));
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver(isComputingReference iscomputingreference) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.deleteGroup(iscomputingreference).flatMap(StringResourceValueReader.write);
    }

    public final DebitCardResetOtpActivity<Boolean> read(copyFor copyfor) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.deleteRecipient(copyfor).flatMap(SafeParcelReader.MediaBrowserCompat$ItemReceiver);
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver(waitForValue waitforvalue) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.editRecipient(waitforvalue).flatMap(createBigIntegerArray.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardResetOtpActivity<zzxl> IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.getDataGroups().map(zzcl.IconCompatParcelizer).flatMap(new createBigDecimal(this));
    }

    public final DebitCardResetOtpActivity<LifestyleCustomizationActivity$MediaBrowserCompat$ItemReceiver> write(String str) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.getRecipients(str).map(ICancelToken.MediaBrowserCompat$CustomActionResultReceiver).map(new zzec(this.read));
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver(notifyValueReclaimed notifyvaluereclaimed) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.updateNameGroup(notifyvaluereclaimed).flatMap(createBigDecimalArray.write);
    }

    public final DebitCardResetOtpActivity<setTvRemark.read> write(ComputingConcurrentHashMap.NullPointerExceptionReference nullPointerExceptionReference) {
        C4093bd.write write2 = this.MediaBrowserCompat$ItemReceiver;
        zabr.IconCompatParcelizer("9004");
        zabr.IconCompatParcelizer("7777");
        return write2.MediaBrowserCompat$ItemReceiver.verifyBulkTransfer(nullPointerExceptionReference).map(new zzbr(this.MediaDescriptionCompat));
    }
}
