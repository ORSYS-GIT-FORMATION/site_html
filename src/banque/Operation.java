package banque;

import java.time.LocalDateTime;

final public class Operation{

    /* ******************************  ATTRIBUTS *************************************** */
    private final Integer operationId;
    private final Integer numeroCompteDebit;
    private final Integer numeroCompteCredit;
    private final float montant;
    private final LocalDateTime timeOperation;
    private static int nbOperation = 0;

    // ******************************  CONSTRUCTEURS ******************************************
    public Operation(Integer numeroCompteDebit, Integer numeroCompteCredit, float montant) {
        this.operationId = getNbOperation();
        this.numeroCompteDebit = numeroCompteDebit;
        this.numeroCompteCredit = numeroCompteCredit;
        this.montant = montant;
        this.timeOperation = LocalDateTime.now();
        nbOperation++;
    }
    // ******************************  METHODS ******************************************
        // aucune modification possible

    // ******************************  GETTER SETTER ******************************************

    public Integer getOperationId() {
        return this.operationId;
    }

    public Integer getNumeroCompteDebit() {
        return this.numeroCompteDebit;
    }

    public Integer getNumeroCompteCredit() {
        return this.numeroCompteCredit;
    }

    public float getMontant() {
        return this.montant;
    }

    public LocalDateTime getTimeOperation() {
        return this.timeOperation;
    }

    // ****************************** METHOD STATIC ******************************************

    public static int getNbOperation() {
        return nbOperation;
    }
}
