package com.scb.phone.view.fragment.directdebit;

import com.scb.phone.data.network.service.DebitCardATMService;
import com.scb.phone.view.activity.transferandpay.PullSlipActivity$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.List;
import p040o.DebitCardResetOtpActivity;
import p040o.DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding;
import p040o.DepositTransactionAdapter$GroupItemViewHolder;
import p040o.HmlPinActivity;
import p040o.IAccountAccessor;
import p040o.ImageField;
import p040o.WorkAccount;
import p040o.buildClientSettings;
import p040o.createSparseIntArray;
import p040o.createSparseLongArray;
import p040o.createStringList;
import p040o.createStringSparseArray;
import p040o.createTypedArray;
import p040o.createTypedList;
import p040o.createTypedSparseArray;
import p040o.fillWindow;
import p040o.filterValues;
import p040o.getConnectionStatusCode;
import p040o.getIntent;
import p040o.isInlineCleanup;
import p040o.isLive;
import p040o.isUidGoogleSigned;
import p040o.isUnset;
import p040o.newEntry;
import p040o.reclaimValue;
import p040o.setWidth;
import p040o.setZIndex;
import p040o.zzcd;
import p040o.zzcv;
import p040o.zzdz;
import p040o.zzej;
import p040o.zzuk;

/* renamed from: com.scb.phone.view.fragment.directdebit.DirectDebitInputBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5907x10730e76 implements ImageField {
    public getIntent IconCompatParcelizer;
    private DebitCardATMService MediaBrowserCompat$CustomActionResultReceiver;
    private getConnectionStatusCode MediaBrowserCompat$ItemReceiver;
    private String MediaDescriptionCompat;
    public isUidGoogleSigned read;
    public buildClientSettings write;

    private C5907x10730e76() {
    }

    @HmlPinActivity
    public C5907x10730e76(DebitCardATMService debitCardATMService, getIntent getintent, WorkAccount workAccount, buildClientSettings buildclientsettings, isUidGoogleSigned isuidgooglesigned, getConnectionStatusCode getconnectionstatuscode, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardATMService;
        this.IconCompatParcelizer = getintent;
        this.write = buildclientsettings;
        this.read = isuidgooglesigned;
        this.MediaBrowserCompat$ItemReceiver = getconnectionstatuscode;
        this.MediaDescriptionCompat = str;
    }

    public final DebitCardResetOtpActivity<DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding> IconCompatParcelizer(isUnset isunset) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.debitCardBlockStatus(isunset).map(zzcd.read).map(new createSparseIntArray(this));
    }

    public final DebitCardResetOtpActivity<setWidth> MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.debitCardResetPin(str).map(IAccountAccessor.Stub.zza.MediaBrowserCompat$CustomActionResultReceiver).map(new createTypedSparseArray(this));
    }

    public final DebitCardResetOtpActivity<List<filterValues.write>> write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.debitCardLimit().map(zzcv.MediaBrowserCompat$CustomActionResultReceiver).map(new createTypedArray(this));
    }

    public final DebitCardResetOtpActivity<DepositTransactionAdapter$GroupItemViewHolder> read(isLive islive) {
        if (islive.IconCompatParcelizer == null || !islive.IconCompatParcelizer.isEmpty()) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.debitCardsSummary(islive).map(fillWindow.IconCompatParcelizer).map(new createTypedList(this));
        }
        return DebitCardResetOtpActivity.just(new DepositTransactionAdapter$GroupItemViewHolder("", "", new ArrayList()));
    }

    public final DebitCardResetOtpActivity<setZIndex> MediaBrowserCompat$ItemReceiver(isInlineCleanup isinlinecleanup) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.debitCardReward(isinlinecleanup).map(zzdz.MediaBrowserCompat$CustomActionResultReceiver).map(new createStringSparseArray(this));
    }

    public final DebitCardResetOtpActivity<PullSlipActivity$MediaBrowserCompat$ItemReceiver> write(reclaimValue reclaimvalue) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.debitCardTransaction(reclaimvalue).map(zzej.MediaBrowserCompat$ItemReceiver).map(new createSparseLongArray(this));
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final DebitCardResetOtpActivity<zzuk> read(String str, String str2, newEntry newentry) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.putDebitCardLimit(str, str2, newentry).map(new createStringList(this));
    }
}
