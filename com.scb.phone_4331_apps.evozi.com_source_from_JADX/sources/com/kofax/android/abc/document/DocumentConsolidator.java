package com.kofax.android.abc.document;

public class DocumentConsolidator {
    private native long nativeMergeFields(long j, long j2);

    public Document mergeDocument(Document document, Document document2) {
        return new Document(nativeMergeFields(document.getPtr(), document2.getPtr()), false, true);
    }
}
