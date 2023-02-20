package banque;

import java.util.Arrays;

public final class Registre {

    /* ******************************  ATTRIBUTS *************************************** */
    private final Operation[] operations;

    /* ****************************  CONSTRUCTEURS ************************************ */
    public Registre() {

        this.operations = new Operation[1000];

    }

    /*  ****************  METHODS ************************ */
    public void addOperation(Operation operation) {

        for (int i = 0; i < 1000; i++) {
            if (this.operations[i] == null) {
                this.operations[i] = operation;
                return;
            }
        }
    }

    /* -----------------     TO STRING()     ----------------------- */
    @Override
    public String toString() {
        return "Registre{" +
                "operations=" + Arrays.toString(operations) +
                '}';
    }
    /*  ****************  GETTER SETTER ************************ */
    public Operation[] getOperations() {
        return operations;
    }

}
