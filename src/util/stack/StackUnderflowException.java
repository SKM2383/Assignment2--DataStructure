/**
 *   APPLICATION: LoginSystem
 *         CLASS: StackUnderflowException
 *        AUTHOR: Samuel Myles
 *   JDK VERSION: 1.8.0_73
 *   JRE VERSION: 1.8.0_73
 *   APP PURPOSE: Prototype login system that supports a mock user database. Users are given the ability
 *                to create a new account and login from that point forward.
 * CLASS PURPOSE: An exception class that is raised when an empty stack tries to be popped
 *       PACKAGE: util.stack
 *     PROFESSOR: Tanes Kanchanawanchai [CSC 202-061N]
 */

package util.stack;

public class StackUnderflowException extends RuntimeException{
    public StackUnderflowException(){ super(); }

    public StackUnderflowException(String msg){ super(msg); }
}
