package com.thunderhead.android.infrastructure.server.responses;

import com.thunderhead.android.infrastructure.server.entitys.Proposition;

public class PropositionResponse {
    private String UContext;
    private PropositionData data;
    private String message;
    private String messageI18nKey;
    private String messageI18nKeyParams;
    private int status;
    private boolean success;
    private String uuid;

    public int getStatus() {
        return this.status;
    }

    public String getMessageI18nKey() {
        return this.messageI18nKey;
    }

    public String getMessageI18nKeyParams() {
        return this.messageI18nKeyParams;
    }

    public String getMessage() {
        return this.message;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getUContext() {
        return this.UContext;
    }

    public PropositionData getData() {
        return this.data;
    }

    public static class PropositionData {
        private Proposition[] propositions;

        public Proposition[] getPropositions() {
            return this.propositions;
        }
    }
}
