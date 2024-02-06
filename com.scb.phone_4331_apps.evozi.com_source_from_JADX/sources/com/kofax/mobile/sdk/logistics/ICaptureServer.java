package com.kofax.mobile.sdk.logistics;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.klo.logistics.data.Document;
import com.kofax.kmc.klo.logistics.data.DocumentType;
import com.kofax.kmc.klo.logistics.data.UserProfile;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk.extract.p018id.ICompletionListener;
import java.util.List;

public interface ICaptureServer {
    ErrorInfo cancelSubmission(String str);

    void getDocumentType(String str, ICompletionListener<DocumentType> iCompletionListener);

    void login(UserProfile userProfile, ICompletionListener<List<String>> iCompletionListener);

    void loginAnonymously(ICompletionListener<List<String>> iCompletionListener);

    void logout(ICompletionListener<Void> iCompletionListener);

    void registerDevice(ICompletionListener<Void> iCompletionListener);

    void sendImageService(Document document, String str, Image image, int i, boolean z, ICompletionListener<Void> iCompletionListener);

    void startJobService(ICompletionListener<String> iCompletionListener);

    void submitDocument(Document document, IProgressListener iProgressListener, ICompletionListener iCompletionListener);
}
