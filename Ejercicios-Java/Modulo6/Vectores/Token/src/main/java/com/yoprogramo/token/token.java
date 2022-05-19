package com.yoprogramo.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

public class token {

    public static void main(String[] args) {
        String codificado = codificar();
        System.out.println("token: " + codificado);
        descodificar(codificado);
    }
    
    public static String codificar(){
        String token;
        try{
            Algorithm algoritmo = Algorithm.HMAC256("estoEsUnaKey");
            //String token = JWT.create().withIssuer("auth0").sign(algoritmo);
            token = JWT.create().withIssuer("auth0").sign(algoritmo);
        }catch(JWTCreationException ex){
            token = ex.toString();
        }
        return token;
    }
    public static void descodificar(String token){
        try{
            Algorithm algoritmo = Algorithm.HMAC256("estoEsUnaKey");
            JWTVerifier verifier = JWT.require(algoritmo).withIssuer("auth0").build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println(jwt);
        }catch(JWTVerificationException ex){
            System.out.println(ex.toString());
        }
    }
    
}
