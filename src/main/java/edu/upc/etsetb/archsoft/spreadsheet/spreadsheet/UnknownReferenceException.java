/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.archsoft.spreadsheet.spreadsheet;

/**
 * Used when given reference does not exist or can't be found
 * @author Alex Eslava and Amaya Balaguer
 */
public class UnknownReferenceException extends Exception {

    /**
     * Creates a new instance of <code>UnknownRangeException</code> without
     * detail message.
     */
    public UnknownReferenceException() {
    }

    /**
     * Constructs an instance of <code>UnknownRangeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UnknownReferenceException(String msg) {
        super(msg);
    }
}
