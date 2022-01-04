/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewapcapp;

/**
 *
 * @author Faidur
 */
public class UserSession {
    private static int u_uid;
    private static String u_username;
    private static String u_password;
    
    public static int getU_uid() {
        return u_uid;
    }

    public static void setU_uid(int u_uid) {
        UserSession.u_uid = u_uid;
    }

    public static String getU_username() {
        return u_username;
    }

    public static void setU_username(String u_username) {
        UserSession.u_username = u_username;
    }

    public static String getU_password() {
        return u_password;
    }

    public static void setU_password(String u_password) {
        UserSession.u_password = u_password;
    }
}
