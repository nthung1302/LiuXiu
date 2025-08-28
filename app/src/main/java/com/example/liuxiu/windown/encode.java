package com.example.liuxiu.windown;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class encode {
    public static String SHA_256(String content){
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(content.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();

            for(byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        }
        catch (Exception ex){
            console.log("Error encode: " + ex);
            return null;
        }
    }
}
