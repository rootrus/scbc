package com.scb.phone.view.fragment.hml;

import com.scb.phone.data.network.service.ETBService;
import com.scb.phone.data.network.service.PDFService;
import java.io.File;
import p040o.BeginSignInRequest;
import p040o.DebitCardResetOtpActivity;
import p040o.DenominatorAmountAdapter$BubbleViewHolder;
import p040o.HmlPinActivity;
import p040o.IdentityProviders;
import p040o.LocalProjectProvider;
import p040o.filterByAuthorizedAccounts;
import p040o.postReadCleanup;
import p040o.postWriteCleanup;
import p040o.recordWrite;
import p040o.rowKeySet;
import p040o.runCleanup;
import p040o.setHeight;
import p040o.toWrapperArray;
import p040o.writeFloatArray;
import p040o.writeFloatList;
import p040o.writeFloatObject;
import p040o.writeFloatSparseArray;
import p040o.writeIBinder;
import p040o.writeIBinderArray;
import p040o.writeIBinderList;
import p040o.writeIBinderSparseArray;
import p040o.writeInt;
import p040o.writeIntArray;
import p040o.writeIntegerObject;
import p040o.writeList;
import p040o.writeLong;
import p040o.zzca;
import p040o.zzuk;

/* renamed from: com.scb.phone.view.fragment.hml.HmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5985x82597580 implements LocalProjectProvider.C69353 {
    public final File IconCompatParcelizer;
    private final PDFService MediaBrowserCompat$CustomActionResultReceiver;
    public final filterByAuthorizedAccounts MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$SearchResultReceiver;
    private final BeginSignInRequest.GoogleIdTokenRequestOptions.Builder read;
    public final ETBService write;

    private C5985x82597580() {
    }

    @HmlPinActivity
    public C5985x82597580(ETBService eTBService, PDFService pDFService, filterByAuthorizedAccounts filterbyauthorizedaccounts, IdentityProviders identityProviders, BeginSignInRequest.PasswordRequestOptions.Builder builder, BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder2, String str, File file) {
        this.write = eTBService;
        this.MediaBrowserCompat$CustomActionResultReceiver = pDFService;
        this.MediaBrowserCompat$ItemReceiver = filterbyauthorizedaccounts;
        this.read = builder2;
        this.MediaBrowserCompat$SearchResultReceiver = str;
        this.IconCompatParcelizer = file;
    }

    public final DebitCardResetOtpActivity<String> IconCompatParcelizer(String str) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.downloadPdfFile(str).flatMap(new writeIBinder(this));
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        return this.write.eligibilityOpenAccountValidation(new postReadCleanup(str, str2, str3, this.MediaBrowserCompat$SearchResultReceiver)).flatMap(writeFloatList.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardResetOtpActivity<Void> MediaBrowserCompat$ItemReceiver() {
        return this.write.eligibilityValidation().flatMap(writeFloatObject.IconCompatParcelizer);
    }

    public final DebitCardResetOtpActivity<zzca.zza.C10763zza> MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        return this.write.getOpenAccountProductDetail(str, str2, str3, this.MediaBrowserCompat$SearchResultReceiver).map(writeIBinderSparseArray.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final DebitCardResetOtpActivity<DenominatorAmountAdapter$BubbleViewHolder> read() {
        return this.write.getPdfUrl().flatMap(new writeIBinderList(this));
    }

    public final DebitCardResetOtpActivity write() {
        return this.write.getProfile().map(new writeIBinderArray(this));
    }

    public final DebitCardResetOtpActivity<zzuk> read(rowKeySet rowkeyset) {
        return this.write.submitFatca(rowkeyset).map(new toWrapperArray(this.read));
    }

    public final DebitCardResetOtpActivity<Boolean> read(recordWrite recordwrite) {
        return this.write.verifyIdentity(recordwrite).flatMap(writeIntegerObject.IconCompatParcelizer).onErrorResumeNext(writeFloatArray.read);
    }

    public final DebitCardResetOtpActivity<setHeight> MediaBrowserCompat$ItemReceiver(runCleanup runcleanup) {
        return this.write.verifyOpenAccount(runcleanup).map(new writeLong(this));
    }

    public final DebitCardResetOtpActivity<zzca.zzb.C10819zzb> read(String str, String str2, postWriteCleanup postwritecleanup) {
        return DebitCardResetOtpActivity.using(writeIntArray.IconCompatParcelizer, new writeFloatSparseArray(this, str, str2, postwritecleanup), writeList.write).map(new writeInt(this));
    }
}
